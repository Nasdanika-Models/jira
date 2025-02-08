package org.nasdanika.models.jira.tests;

import java.net.URI;

import org.junit.jupiter.api.Test;

import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;

import io.atlassian.util.concurrent.Promise;

public class JiraTests {
	
	@Test
	public void testJira() throws Exception {
		AsynchronousJiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();
		URI jirURI = new URI("https://nasdanika.atlassian.net");
		try (JiraRestClient client = factory.createWithBasicHttpAuthentication(
				jirURI, 
				System.getenv("JIRA_USER"), 
				System.getenv("JIRA_API_TOKEN"))) {
			
			IssueRestClient issueClient = client.getIssueClient();
			Promise<Issue> issuePromise = issueClient.getIssue("NSD-164");
			Issue issue = issuePromise.claim();
			System.out.println(issue);
		}
	}
	
}
