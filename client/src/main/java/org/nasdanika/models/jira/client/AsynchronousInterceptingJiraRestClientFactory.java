package org.nasdanika.models.jira.client;

import java.net.URI;

import com.atlassian.httpclient.api.Request;
import com.atlassian.httpclient.api.Response;
import com.atlassian.jira.rest.client.api.AuthenticationHandler;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.internal.async.AsynchronousHttpClientFactory;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClient;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.jira.rest.client.internal.async.DisposableHttpClient;

/**
 * A factory which supports interception of requests and responses for inspection and rate limiting.
 */
public class AsynchronousInterceptingJiraRestClientFactory extends AsynchronousJiraRestClientFactory {
	
	@Override
	public JiraRestClient create(URI serverUri, AuthenticationHandler authenticationHandler) {
	    AsynchronousHttpClientFactory factory = new AsynchronousInterceptingHttpClientFactory() {
	 
	    	@Override
	    	protected boolean isInterceptResponse() {
	    		return AsynchronousInterceptingJiraRestClientFactory.this.isInterceptResponse();
	    	}
	
	    	@Override
	    	protected void onRequest(Request request) {
	    		AsynchronousInterceptingJiraRestClientFactory.this.onRequest(request);
	    	}
	    	
	    	@Override
	    	protected void onSuccess(Request request, Response response) {
	    		AsynchronousInterceptingJiraRestClientFactory.this.onSuccess(request, response);
	    	}
	
	    	@Override
	    	protected void onFail(Request request, Throwable th) {
	    		AsynchronousInterceptingJiraRestClientFactory.this.onFail(request, th);
	    	}	    	
	    	
	    };
	    
		DisposableHttpClient httpClient = factory.createClient(serverUri, authenticationHandler);
        return new AsynchronousJiraRestClient(serverUri, httpClient);
	}	
	
	/**
	 * Override to return false if interception of response is not desired
	 * @return
	 */
	protected boolean isInterceptResponse() {
		return true;
	}

	/**
	 * Override to do something on request. For example, limit request rate.
	 * @param request
	 */
	protected void onRequest(Request request) {
		
	}
	
	/**
	 * Override to do something on successful response. 
	 * For example, read rate limit headers.
	 * @param request
	 * @param response
	 */
	protected void onSuccess(Request request, Response response) {
		
	}

	/**
	 * Override to do something on failed response. 
	 * @param request
	 * @param th
	 */
	protected void onFail(Request request, Throwable th) {
		
	}		

}
