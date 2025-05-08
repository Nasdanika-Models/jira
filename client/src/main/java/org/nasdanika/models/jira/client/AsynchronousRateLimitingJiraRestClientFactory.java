package org.nasdanika.models.jira.client;

import com.atlassian.httpclient.api.Request;
import com.google.common.util.concurrent.RateLimiter;

/**
 * Uses {@link RateLimiter} to limit requests
 */
public class AsynchronousRateLimitingJiraRestClientFactory extends AsynchronousInterceptingJiraRestClientFactory{
	
	private RateLimiter rateLimiter;
	
	public AsynchronousRateLimitingJiraRestClientFactory(double requestsPerSecond) {
		rateLimiter = requestsPerSecond > 0 ? RateLimiter.create(requestsPerSecond) : null;
	}
	
	@Override
	protected boolean isInterceptResponse() {
		return false;
	}
	
	@Override
	protected void onRequest(Request request) {
		if (rateLimiter != null) {
			rateLimiter.acquire();
		}
	}

}
