import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.jira.util.JiraEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.jira {
	exports org.nasdanika.models.jira;
	exports org.nasdanika.models.jira.impl;
	exports org.nasdanika.models.jira.util;
	
	requires transitive org.nasdanika.ncore;
	
	provides CapabilityFactory with	JiraEPackageResourceSetCapabilityFactory;
	
}