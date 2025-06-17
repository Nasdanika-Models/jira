/*
 * Some code was copied from the superclass. 
 */
package org.nasdanika.models.jira.client;

import java.io.File;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Optional;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;

import com.atlassian.event.api.EventPublisher;
import com.atlassian.httpclient.apache.httpcomponents.DefaultHttpClientFactory;
import com.atlassian.httpclient.api.HttpClient;
import com.atlassian.httpclient.api.Request;
import com.atlassian.httpclient.api.Response;
import com.atlassian.httpclient.api.ResponsePromise;
import com.atlassian.httpclient.api.factory.HttpClientOptions;
import com.atlassian.httpclient.base.AbstractHttpClient;
import com.atlassian.jira.rest.client.api.AuthenticationHandler;
import com.atlassian.jira.rest.client.internal.async.AsynchronousHttpClientFactory;
import com.atlassian.jira.rest.client.internal.async.AtlassianHttpClientDecorator;
import com.atlassian.jira.rest.client.internal.async.DisposableHttpClient;
import com.atlassian.sal.api.ApplicationProperties;
import com.atlassian.sal.api.UrlMode;
import com.atlassian.sal.api.executor.ThreadLocalContextManager;

import io.atlassian.util.concurrent.Promise.TryConsumer;

public class AsynchronousInterceptingHttpClientFactory extends AsynchronousHttpClientFactory {
	
	@Override
	public DisposableHttpClient createClient(URI serverUri, AuthenticationHandler authenticationHandler) {
		EventPublisher eventPublisher = new  EventPublisher() {
	        @Override
	        public void publish(Object o) {
	        }

	        @Override
	        public void register(Object o) {
	        }

	        @Override
	        public void unregister(Object o) {
	        }

	        @Override
	        public void unregisterAll() {
	        }
	    };

	    ApplicationProperties applicationProperties = new ApplicationProperties() {

	        private final String baseUrl = serverUri.getPath();

	        @Override
	        public String getBaseUrl() {
	            return baseUrl;
	        }

	        /**
	         * We'll always have an absolute URL as a client.
	         */
	        @Nonnull
	        @Override
	        public String getBaseUrl(UrlMode urlMode) {
	            return baseUrl;
	        }

	        @Nonnull
	        @Override
	        public String getDisplayName() {
	            return "Atlassian JIRA Rest Java Client";
	        }

	        @Nonnull
	        @Override
	        public String getPlatformId() {
	            return ApplicationProperties.PLATFORM_JIRA;
	        }

	        @Nonnull
	        @Override
	        public String getVersion() {
	        	return getClass().getModule().getDescriptor().toNameAndVersion();
	        }

	        @Nonnull
	        @Override
	        public Date getBuildDate() {
	            // TODO implement using MavenUtils, JRJC-123
	            throw new UnsupportedOperationException();
	        }

	        @Nonnull
	        @Override
	        public String getBuildNumber() {
	            // TODO implement using MavenUtils, JRJC-123
	            return String.valueOf(0);
	        }

	        @Override
	        public File getHomeDirectory() {
	            return new File(".");
	        }

	        @Override
	        public String getPropertyValue(final String s) {
	            throw new UnsupportedOperationException("Not implemented");
	        }

	        @Nonnull
	        @Override
	        public String getApplicationFileEncoding() {
	            return StandardCharsets.UTF_8.name();
	        }

	        @Nonnull
	        @Override
	        public Optional<Path> getLocalHomeDirectory() {
	            return Optional.of(getHomeDirectory().toPath());
	        }

	        @Nonnull
	        @Override
	        public Optional<Path> getSharedHomeDirectory() {
	            return getLocalHomeDirectory();
	        }
	    };
		
        DefaultHttpClientFactory<Object> defaultHttpClientFactory = new DefaultHttpClientFactory<Object>(
        		eventPublisher,
        		applicationProperties, 
                new ThreadLocalContextManager<Object>() {
                    @Override
                    public Object getThreadLocalContext() {
                        return null;
                    }

                    @Override
                    public void setThreadLocalContext(Object context) {
                    }

                    @Override
                    public void clearThreadLocalContext() {
                    }
                });
        
        HttpClientOptions options = createHttpClientOptions();
        options.setRequestPreparer(this::onRequest);

        HttpClient httpClient = defaultHttpClientFactory.create(options);
        
        if (isInterceptResponse()) {
            
            HttpClient httpClientFilter = new AbstractHttpClient() {
				
				@Override
				public void flushCacheByUriPattern(Pattern uriPattern) {
					httpClient.flushCacheByUriPattern(uriPattern);					
				}
				
				@Override
				public ResponsePromise execute(Request request) {
					ResponsePromise responsePromise = httpClient.execute(request);
					TryConsumer<Response> tryConsumer = new TryConsumer<Response>() {

						@Override
						public void accept(Response response) {
							onSuccess(request, response);							
						}

						@Override
						public void fail(Throwable th) {
							onFail(request, th);
						}
						
					};
					responsePromise.then(tryConsumer);
					return responsePromise;
				}
				
			};
            
            return new AtlassianHttpClientDecorator(httpClientFilter, authenticationHandler) {
                @Override
                public void destroy() throws Exception {
                    defaultHttpClientFactory.dispose(httpClient);
                }
            };
        	
        }        

        return new AtlassianHttpClientDecorator(httpClient, authenticationHandler) {
            @Override
            public void destroy() throws Exception {
                defaultHttpClientFactory.dispose(httpClient);
            }
        };
		
	}

	/**
	 * Override to customize {@link HttpClientOptions}. 
	 * For example, set trusting self-signed certificates to <code>true</code>.
	 * @return
	 */
	protected HttpClientOptions createHttpClientOptions() {
		return new HttpClientOptions();
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
