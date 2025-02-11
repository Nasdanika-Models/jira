package org.nasdanika.models.jira.client;

import com.atlassian.httpclient.api.Request;
import com.google.common.util.concurrent.RateLimiter;

/**
 * Uses {@link RateLimiter} to limit requests
 */
public class AsynchronousRateLimitingJiraRestClientFactory extends AsynchronousInterceptingJiraRestClientFactory{
	
	private RateLimiter rateLimiter;
	
	public AsynchronousRateLimitingJiraRestClientFactory(double requestsPerSecond) {
		rateLimiter = RateLimiter.create(requestsPerSecond);
	}
	
	@Override
	protected boolean isInterceptResponse() {
		return false;
	}
	
	@Override
	protected void onRequest(Request request) {
		rateLimiter.acquire();
	}

}
