package org.nasdanika.models.jira.processors;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.jira.JiraPackage;

@EPackageNodeProcessorFactory(nsURI = JiraPackage.eNS_URI)
public class EcoreGenJiraProcessorsFactory {

	private Context context;
	
//	@Factory
//	public final AccessLevelProcessorsFactory accessLevelFactory;

	
	public EcoreGenJiraProcessorsFactory(Context context) {
		this.context = context;
//		accessLevelProcessorsFactory = new AccessLevelProcessorsFactory(context);
	}
	
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EPackageNodeProcessorFactory(
			label = "Jira",
			icon = "https://docs.nasdanika.org/images/jira.svg",
			description = "A model of Jira objects",
			documentation =  """				
				
				[TOC levels=6]
				
				## Conceptual model

				```drawio-resource
				jira.drawio
				```				
												
				## Using client
				
				### pom.xml
				
				```xml
				<project ...>
					...
				
					<dependencies>
						<dependency>
							<groupId>org.nasdanika.models.jira</groupId>
							<artifactId>client</artifactId>
							<version>2025.2.0</version>
						</dependency>
						...
					</dependencies>
					
					<!-- Maybe not needed - TBD -->
				    <repositories>
				        <repository>
				            <id>atlassian</id>
				            <url>https://packages.atlassian.com/mvn/maven-atlassian-external/</url>
				        </repository>
				    </repositories>	
				</project>
				```
				
				### module-info.java
				
				```java
				module <module name> {
				
					requires org.nasdanika.models.jira.client;
					
				}				
				```
				
				### Atlassian client
								
				```java
				JiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();
				URI jirURI = new URI("<instance uri>");
				try (JiraRestClient client = factory.createWithBasicHttpAuthentication(
						jirURI, 
						System.getenv("JIRA_USER"), 
						System.getenv("JIRA_API_TOKEN"))) {
					
					IssueRestClient issueClient = client.getIssueClient();
					Promise<Issue> issuePromise = issueClient.getIssue("<issue key>");
					Issue issue = issuePromise.claim();
					System.out.println(issue);
				}				
				```
				
				### Interception
				
				```java
				JiraRestClientFactory factory = new AsynchronousInterceptingJiraRestClientFactory() {
					
					@Override
					protected void onRequest(Request request) {
						System.out.println("Request: " + request);
					}
					
					@Override
					protected void onSuccess(Request request, Response response) {
						System.out.println("Success: " + response);
						for (Entry<String, String> he: response.getHeaders().entrySet()) {
							System.out.println("\t" + he.getKey() + ": " + he.getValue());
						}
					}
					
				};
				
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
				
				```				
				
				### Rate limiting
				
				```java
				JiraRestClientFactory factory = new AsynchronousRateLimitingJiraRestClientFactory(5);
				
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
				```
				
				## Working with the model
				
				### Create and save to a file
				
				```java
				// Creating a model
				JiraFactory jiraFactory = JiraFactory.eINSTANCE;
				
				org.nasdanika.models.jira.Issue modelIssue = jiraFactory.createIssue();
				modelIssue.setKey("DEMO-1");
				modelIssue.setDescription("Some description");
				
				// Saving to a file
				ResourceSet resourceSet = createResourceSet();
				org.eclipse.emf.common.util.URI resourceURI = org.eclipse.emf.common.util.URI.createFileURI(new File(JIRA_MODEL_PATH).getCanonicalPath());
				Resource resource = resourceSet.createResource(resourceURI);
				resource.getContents().add(modelIssue);
				resource.save(null);						
				```
				
				### Load from a file
				
				```java
				ResourceSet resourceSet = createResourceSet();
				org.eclipse.emf.common.util.URI resourceURI = org.eclipse.emf.common.util.URI.createFileURI(new File(JIRA_MODEL_PATH).getCanonicalPath());
		
				Resource resource = resourceSet.getResource(resourceURI, true);
				org.nasdanika.models.jira.Issue modelIssue = (org.nasdanika.models.jira.Issue) resource.getContents().get(0);
				
				System.out.println(modelIssue.getKey() + ": " + modelIssue.getDescription());
				
				```
				
				### createResourceSet()
				
				```java
				private ResourceSet createResourceSet() {
					CapabilityLoader capabilityLoader = new CapabilityLoader();
					ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
					Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
					return capabilityLoader.loadOne(requirement, progressMonitor);
				}
				
				```
				
				## Resources
				
				* [Jira demo](https://github.com/Nasdanika-Demos/jira) - sources for the code snippets							

						
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
