var searchDocuments = {"references/eClassifiers/IssueField/inheritance.html":{"path":"IssueField/Inheritance","link-uuid":"9d6d1305-70d0-4306-9a11-cd214ad74961","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/AdressableNamedIdentifiableEntity/inheritance.html":{"path":"AdressableNamedIdentifiableEntity/Inheritance","link-uuid":"064d55c7-6c6a-48a5-800c-87381d6e8930","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Project/inheritance.html":{"path":"Project/Inheritance","link-uuid":"598dee52-5745-4ac7-9419-8c8f0a6a2fc3","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/UserReference/inheritance.html":{"path":"UserReference/Inheritance","link-uuid":"29b09d19-d5da-4a72-a000-2815a911edab","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Issue/inheritance.html":{"path":"Issue/Inheritance","link-uuid":"c1dca921-cb9b-4b18-aecb-fa7966285145","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/NamedEntity/inheritance.html":{"path":"NamedEntity/Inheritance","link-uuid":"aaf219fa-4a8d-4309-a564-58c4fa2458aa","title":"Inheritance","content":"Subtypes "},"index.html":{"link-uuid":"f698fc50-167d-47c5-88e4-2219068e8629","title":"Jira","content":"Conceptual model Using Jira Java API pom.xml module-info.java Java code Working with the model Create and save to a file Load from a file createResourceSet() Resources Conceptual model Using Jira Java API pom.xml &lt;project ...&gt;\n\t...\n\n\t&lt;dependencies&gt;\n\t\t&lt;dependency&gt;\n\t\t\t&lt;groupId&gt;org.nasdanika.models.jira&lt;/groupId&gt;\n\t\t\t&lt;artifactId&gt;model&lt;/artifactId&gt;\n\t\t\t&lt;version&gt;2025.2.0&lt;/version&gt;\n\t\t&lt;/dependency&gt;\n        &lt;dependency&gt;\n            &lt;groupId&gt;com.atlassian.jira&lt;/groupId&gt;\n            &lt;artifactId&gt;jira-rest-java-client-api&lt;/artifactId&gt;\n            &lt;version&gt;6.0.1&lt;/version&gt;\n        &lt;/dependency&gt;\n        &lt;dependency&gt;\n            &lt;groupId&gt;com.atlassian.jira&lt;/groupId&gt;\n            &lt;artifactId&gt;jira-rest-java-client-core&lt;/artifactId&gt;\n            &lt;version&gt;6.0.1&lt;/version&gt;\n        &lt;/dependency&gt;\n        &lt;dependency&gt;\n            &lt;groupId&gt;io.atlassian.util.concurrent&lt;/groupId&gt;\n            &lt;artifactId&gt;atlassian-util-concurrent&lt;/artifactId&gt;\n            &lt;version&gt;4.1.0&lt;/version&gt;\n        &lt;/dependency&gt;\n        &lt;dependency&gt;\n            &lt;groupId&gt;io.atlassian.fugue&lt;/groupId&gt;\n            &lt;artifactId&gt;fugue&lt;/artifactId&gt;\n            &lt;version&gt;6.0.1&lt;/version&gt;\n        &lt;/dependency&gt;\n\n\t\t...\n\t&lt;/dependencies&gt;\n\n    &lt;repositories&gt;\n        &lt;repository&gt;\n            &lt;id&gt;atlassian&lt;/id&gt;\n            &lt;url&gt;https://packages.atlassian.com/mvn/maven-atlassian-external/&lt;/url&gt;\n        &lt;/repository&gt;\n    &lt;/repositories&gt;\n&lt;/project&gt;\n module-info.java module &lt;module name&gt; {\n\n\trequires jira.rest.java.client.core;\n\trequires atlassian.util.concurrent;\n\trequires jira.rest.java.client.api;\n\n\trequires org.nasdanika.models.jira;\n\n}\n Java code AsynchronousJiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();\nURI jirURI = new URI(&quot;&lt;instance uri&gt;&quot;);\ntry (JiraRestClient client = factory.createWithBasicHttpAuthentication(\n\t\tjirURI,\n\t\tSystem.getenv(&quot;JIRA_USER&quot;),\n\t\tSystem.getenv(&quot;JIRA_API_TOKEN&quot;))) {\n\n\tIssueRestClient issueClient = client.getIssueClient();\n\tPromise&lt;Issue&gt; issuePromise = issueClient.getIssue(&quot;&lt;issue key&gt;&quot;);\n\tIssue issue = issuePromise.claim();\n\tSystem.out.println(issue);\n}\n Working with the model Create and save to a file // Creating a model\nJiraFactory jiraFactory = JiraFactory.eINSTANCE;\n\norg.nasdanika.models.jira.Issue modelIssue = jiraFactory.createIssue();\nmodelIssue.setKey(&quot;DEMO-1&quot;);\nmodelIssue.setDescription(&quot;Some description&quot;);\n\n// Saving to a file\nResourceSet resourceSet = createResourceSet();\norg.eclipse.emf.common.util.URI resourceURI = org.eclipse.emf.common.util.URI.createFileURI(new File(JIRA_MODEL_PATH).getCanonicalPath());\nResource resource = resourceSet.createResource(resourceURI);\nresource.getContents().add(modelIssue);\nresource.save(null);\n Load from a file ResourceSet resourceSet = createResourceSet();\norg.eclipse.emf.common.util.URI resourceURI = org.eclipse.emf.common.util.URI.createFileURI(new File(JIRA_MODEL_PATH).getCanonicalPath());\n\nResource resource = resourceSet.getResource(resourceURI, true);\norg.nasdanika.models.jira.Issue modelIssue = (org.nasdanika.models.jira.Issue) resource.getContents().get(0);\n\nSystem.out.println(modelIssue.getKey() + &quot;: &quot; + modelIssue.getDescription());\n\n createResourceSet() private ResourceSet createResourceSet() {\n\tCapabilityLoader capabilityLoader = new CapabilityLoader();\n\tProgressMonitor progressMonitor = new PrintStreamProgressMonitor();\n\tRequirement&lt;ResourceSetRequirement, ResourceSet&gt; requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);\n\treturn capabilityLoader.loadOne(requirement, progressMonitor);\n}\n\n Resources Jira demo - sources for the code snippets Jira Group User Project Issue Actor Version Component Role Role Actor Jira"},"references/eClassifiers/IdentifiableEntity/inheritance.html":{"path":"IdentifiableEntity/Inheritance","link-uuid":"519ffe2c-bd5b-4544-b688-37fd17b34f79","title":"Inheritance","content":"Subtypes "},"references/eClassifiers/BasicIssue/inheritance.html":{"path":"BasicIssue/Inheritance","link-uuid":"80528cfd-1722-402c-b100-56fecf548d55","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Attachment/inheritance.html":{"path":"Attachment/Inheritance","link-uuid":"a2d6cbaa-f637-45e5-9591-2c7e5f8d8c00","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Status/inheritance.html":{"path":"Status/Inheritance","link-uuid":"c33bb8e6-3a4b-4e28-879f-bff7b08026b3","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/ProjectReference/inheritance.html":{"path":"ProjectReference/Inheritance","link-uuid":"e1970f3c-e6db-4b57-8fab-39bfa3d30309","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/User/inheritance.html":{"path":"User/Inheritance","link-uuid":"6da0c201-f026-43b5-824d-900e7faf7600","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Component/inheritance.html":{"path":"Component/Inheritance","link-uuid":"731ba19e-8cbb-4693-a090-69ea484473e7","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/IssueType/inheritance.html":{"path":"IssueType/Inheritance","link-uuid":"bcc845c3-8e92-4981-a9b2-c95e0f72ae6f","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/AddressableEntity/inheritance.html":{"path":"AddressableEntity/Inheritance","link-uuid":"1ea6c795-8216-419d-b20a-c54781a077f9","title":"Inheritance","content":"Subtypes "},"references/eClassifiers/IssueReference/inheritance.html":{"path":"IssueReference/Inheritance","link-uuid":"a5c8cad4-5754-4f4e-9175-d4e7a1153c6d","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/BasicWatchers/inheritance.html":{"path":"BasicWatchers/Inheritance","link-uuid":"12bedac7-27b6-4f6f-bf48-5dfafee96d01","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/AdressableNamedEntity/inheritance.html":{"path":"AdressableNamedEntity/Inheritance","link-uuid":"66b5117d-dce0-4a2b-816d-a3b101afd483","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/BasicComponent/inheritance.html":{"path":"BasicComponent/Inheritance","link-uuid":"fe47f46d-b227-43a2-9f04-15e194debabd","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/ProjectRole/inheritance.html":{"path":"ProjectRole/Inheritance","link-uuid":"1cddae27-866f-467f-9637-ad8025584767","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/BasicPriority/inheritance.html":{"path":"BasicPriority/Inheritance","link-uuid":"462a0e31-f662-4e28-bf91-a223eb35f9fa","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Worklog/inheritance.html":{"path":"Worklog/Inheritance","link-uuid":"2db16232-5b0e-4735-bdaf-182565ec8c9b","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/BasicProject/inheritance.html":{"path":"BasicProject/Inheritance","link-uuid":"14790e19-5de7-4f16-919b-1869c4cbade9","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/StatusCategory/inheritance.html":{"path":"StatusCategory/Inheritance","link-uuid":"6852e83d-f69a-4930-b4a9-d9aa36e0bf6c","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Resolution/inheritance.html":{"path":"Resolution/Inheritance","link-uuid":"50dea7e2-77b3-4f0e-ad78-fbec3f4b0bfa","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/BasicVotes/inheritance.html":{"path":"BasicVotes/Inheritance","link-uuid":"fea8a25e-6669-441a-81e9-933139bdb8eb","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/BasicUser/inheritance.html":{"path":"BasicUser/Inheritance","link-uuid":"1c724acd-ae7a-48ad-8afa-966b38dea77a","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/ComponentReference/inheritance.html":{"path":"ComponentReference/Inheritance","link-uuid":"a8625c2f-780b-4364-b682-f8d7bcf64831","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Version/inheritance.html":{"path":"Version/Inheritance","link-uuid":"1a92435a-b10a-4239-80ce-239329bf6561","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/RoleActor/inheritance.html":{"path":"RoleActor/Inheritance","link-uuid":"a50d491a-7159-479d-9b36-e07ebd88637d","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/BasicProjectRole/inheritance.html":{"path":"BasicProjectRole/Inheritance","link-uuid":"551e3806-62c2-4df8-908f-80ba65e385e2","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Actor/inheritance.html":{"path":"Actor/Inheritance","link-uuid":"aa1db238-cb5b-44bc-bab0-bd3674323d56","title":"Inheritance","content":"Subtypes "},"references/eClassifiers/Group/inheritance.html":{"path":"Group/Inheritance","link-uuid":"025e5f14-824f-4f45-950d-562f9c613944","title":"Inheritance","content":"Supertypes "}}