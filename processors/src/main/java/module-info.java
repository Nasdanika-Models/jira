module org.nasdanika.models.jira.processors {
		
	requires transitive org.nasdanika.models.jira;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.jira.processors;
	opens org.nasdanika.models.jira.processors; // For loading resources
	
}
