package org.nasdanika.models.jira.client;

import java.net.URI;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import com.atlassian.httpclient.api.Request;
import com.atlassian.httpclient.api.Response;
import com.google.common.util.concurrent.RateLimiter;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;

/**
 * Uses {@link RateLimiter} to limit requests
 */
public class AsynchronousTelemetryRateLimitingJiraRestClientFactory extends AsynchronousInterceptingJiraRestClientFactory{
	
	private RateLimiter rateLimiter;
	
	private record RequestInfo(long start, Span span) {}
	
	private Map<Request, RequestInfo> infoMap = Collections.synchronizedMap(new IdentityHashMap<>());

	private Tracer tracer;

	private BiConsumer<URI, Long> durationConsumer;

	private Function<Request, Span> parentSpanProvider;
	
	public AsynchronousTelemetryRateLimitingJiraRestClientFactory(
			double requestsPerSecond,
			Tracer tracer,
			BiConsumer<URI,Long> durationConsumer,
			Function<Request, Span> parentSpanProvider) {
		rateLimiter = requestsPerSecond > 0 ? RateLimiter.create(requestsPerSecond) : null;
		this.tracer = tracer;
		this.durationConsumer = durationConsumer;
		this.parentSpanProvider = parentSpanProvider;		
	}
	
	@Override
	protected boolean isInterceptResponse() {
		return true;
	}
	
	@Override
	protected void onRequest(Request request) {
		SpanBuilder requestSpanBuilder = tracer
			.spanBuilder(request.getMethod().name())
			.setSpanKind(SpanKind.CLIENT)
			.setAttribute("uri", request.getUri().toString());
		
		long start = System.currentTimeMillis();
		Span parentSpan = parentSpanProvider == null ? null : parentSpanProvider.apply(request);
		if (parentSpan != null) {
			requestSpanBuilder.setParent(io.opentelemetry.context.Context.current().with(parentSpan));
		}
		
		Span requestSpan = requestSpanBuilder.startSpan();
		requestSpan.makeCurrent();		
		if (rateLimiter != null) {
			Span rateLimiterSpan = tracer
					.spanBuilder("rate-limiter")
					.setParent(io.opentelemetry.context.Context.current().with(requestSpan))
					.startSpan();
			try (Scope scope = rateLimiterSpan.makeCurrent()) {
				rateLimiter.acquire();
			} finally {
				rateLimiterSpan.end();
			}
		}
		infoMap.put(request, new RequestInfo(start, requestSpan));
	}
	
	@Override
	protected void onFail(Request request, Throwable th) {
		super.onFail(request, th);
		RequestInfo requestInfo = infoMap.remove(request);
		if (requestInfo != null) {
			Span span = requestInfo.span();
			span.recordException(th);
			span.setStatus(StatusCode.ERROR);
			requestInfo.span().end();
			if (durationConsumer != null) {
				durationConsumer.accept(request.getUri(), System.currentTimeMillis() - requestInfo.start());
			}
		}
	}
	
	@Override
	protected void onSuccess(Request request, Response response) {
		super.onSuccess(request, response);
		RequestInfo requestInfo = infoMap.remove(request);
		if (requestInfo != null) {
			Span span = requestInfo.span();
			span.setStatus(StatusCode.OK);
			span.setAttribute("status", response.getStatusCode());
			requestInfo.span().end();
			if (durationConsumer != null) {
				durationConsumer.accept(request.getUri(), System.currentTimeMillis() - requestInfo.start());
			}
		}
	}

}
