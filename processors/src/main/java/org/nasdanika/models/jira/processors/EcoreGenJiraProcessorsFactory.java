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
				
				## Class diagram
				
				```drawio-resource
				jira-classes.drawio
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
							<version>2025.5.0</version>
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
				
				#### Telemetry
				
				If you need telemetry in addition to rate limiting, use [AsynchronousTelemetryRateLimitingJiraRestClientFactory](https://github.com/Nasdanika-Models/jira/blob/main/client/src/main/java/org/nasdanika/models/jira/client/AsynchronousTelemetryRateLimitingJiraRestClientFactory.java)								
				
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
						
//			/**
//			 * Generating a Drawio diagram
//			 */
//			@Override
//			protected void generateDiagramAndGraphActions(Collection<Label> labels, ProgressMonitor progressMonitor) {
//				super.generateDiagramAndGraphActions(labels, progressMonitor);
//				
//				try {
//					Document document = Document.create(false, null);
//					Page page = document.createPage();
//					page.setName("Jira");
//					
//					Model model = page.getModel();
//					Root root = model.getRoot();
//					Layer backgroundLayer = root.getLayers().get(0);
////					Map<EPackage, Layer> layers = new HashMap<>();
//					
//					generateDrawioDiagram(
////						ePackage -> layers.computeIfAbsent(ePackage, ep -> {
////							Layer layer = root.createLayer();
////							layer.setLabel(ep.getName());
////							return layer;
////						}),
//						ep -> backgroundLayer,	
//						false, 
//						false, 
//						progressMonitor);
//					
//					org.nasdanika.drawio.Util.forceLayout(root, 1920 * 1.5, 1080 * 1.5);
//												
//					Files.writeString(new File("target/jira-classes.drawio").toPath(), document.save(null));
//				} catch (Exception e) {
//					e.printStackTrace();
//					throw new NasdanikaException(e);
//				}								
//			}			
			
		};
	}	
		
//	@EClassifierNodeProcessorFactory
//	public EClassifierNodeProcessor<?> createEClassifierProcessor(
//			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
//			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
//			BiConsumer<Label, ProgressMonitor> labelConfigurator,
//			ProgressMonitor progressMonitor) {
//		
//		EObject eClassifier = ((EObjectNode) config.getElement()).get();
//				
//		if (eClassifier instanceof EClass) {
//			return new EClassNodeProcessor(config, context, prototypeProvider) {
//				
//				@Override
//				public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
//					super.configureLabel(source, label, progressMonitor);
//					if (labelConfigurator != null) {
//						labelConfigurator.accept(label, progressMonitor);
//					}
//				}	
//				
//				@Override
//				protected EList<? super Action> getMembersActionCollection(Action parent) {
//					return parent.getChildren();
//				}
//				
//				@Override
//				protected EList<? super Action> getMembersCollection(Action membersAction) {
//					return membersAction.getChildren();
//				}
//				
//				@Override
//				protected void addDiagramAction(Action action, Action diagramAction) {
//					action.getSections().add(diagramAction);
//				}
//				
//				@Override
//				protected int getDiagramNodeWidth() {
//					return Math.max(getTarget().getName().length() * 5, super.getDiagramNodeWidth());
//				}
//				
//				@Override
//				protected void createDrawioConnection(
//						Layer layer, 
//						EClassifierNodeProcessor<?> dependency,
//						Node diagramNode, 
//						Node targetNode) {
//					
//					EClassifier targetEClassifier = dependency.getTarget();
//					
//					// Supertype
//					if (getTarget().getESuperTypes().contains(targetEClassifier)) {
//						// TODO - connect top center of the sub-class to the bottom center of super-class
//						Connection inheritance = layer.createConnection(diagramNode, targetNode);
//						Map<String, String> style = inheritance.getStyle();
//						style.put("edgeStyle", "orthogonalEdgeStyle");
//						style.put("rounded", "0");
//						style.put("orthogonalLoop", "1");
//						style.put("jettySize", "auto");
//						style.put("html", "1");
//						style.put("endArrow", "block");
//						style.put("endFill", "0");
//					}
//					
//					// Reference
//					for (EReference ref: getTarget().getEReferences()) {
//						if (ref.getEType() == targetEClassifier) {
//							Connection containment = layer.createConnection(diagramNode, targetNode);
//							containment.setLabel(ref.getName());
//							Map<String, String> style = containment.getStyle();
//							style.put("rounded", "0");
//							style.put("orthogonalLoop", "1");
//							style.put("jettySize", "1");
//							style.put("html", "1");
//							if (ref.isMany()) {
//								style.put("startArrow", "diamondThin");
//								style.put("startFill", "1");
//							}
//						}
//					}
//				}
//				
//			};
//		}
//		
//		if (eClassifier instanceof EEnum) {
//			return new EEnumNodeProcessor(config, context, prototypeProvider);
//		}
//		
//		return new EDataTypeNodeProcessor<EDataType>(config, context, prototypeProvider);		
//	}	
	
}
