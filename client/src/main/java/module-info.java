import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.jira.util.JiraEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.jira.client {
	
	exports org.nasdanika.models.jira.client;
	
	requires transitive org.nasdanika.models.jira;
	requires transitive jira.rest.java.client.api;
	requires transitive jira.rest.java.client.core;
	requires transitive atlassian.util.concurrent;
	requires transitive atlassian.httpclient.api;
	requires atlassian.event;
	requires jsr305;
	requires sal.api;
	requires atlassian.httpclient.library;
	requires com.google.common;
	
}