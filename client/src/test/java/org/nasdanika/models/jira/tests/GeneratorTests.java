package org.nasdanika.models.jira.tests;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.nasdanika.common.Util;
import org.yaml.snakeyaml.Yaml;

/**
 * Helper code generation tests
 */
public class GeneratorTests {
	
	private static final String[] COLLECTION_TYPES = {"Collection", "Iterable", "Set", "List"};

	private static final String DECLARATIONS = """
avatarUrl : URI
displayName : String
id : Long
name : String
type : String
			""";
	
	private static final String FEATURE_TEMPLATE = """
			    <eStructuralFeatures xsi:type="ecore:${featureType}" name="${name}" eType="${type}" ${extra}/>			
			""";
	
	private static final Map<String, String> TYPE_MAP = Map.ofEntries(
			Map.entry("boolean", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean"),
			Map.entry("long", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//ELong"),
			Map.entry("int", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"),
			Map.entry("Boolean", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBooleanObject"),
			Map.entry("Integer", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EIntegerObject"),
			Map.entry("Long", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//ELongObject"),
			Map.entry("Double", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDoubleObject"),
			Map.entry("Date", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDate"),
			Map.entry("DateTime", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDate"),
			Map.entry("String", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"),
			Map.entry("URI", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString")
			);	
	
	@Test
	public void testGenerateFeatures() {
		Yaml yaml = new Yaml();
		Map<String,String> declarations = yaml.load(DECLARATIONS);
		for (Entry<String, String> declaration: declarations.entrySet()) {
			String extra = "";			
			String value = declaration.getValue();
			for (String collectionType: COLLECTION_TYPES) {
				if (value.startsWith(collectionType + "<") && value.endsWith(">")) {
					extra = "upperBound=\"-1\"";
					value = value.substring(collectionType.length() + 1, value.length() -1);
				}
			}
			
			String type = TYPE_MAP.get(value);
			String featureType = "EAttribute";
			if (type == null) {				
				type = "#//" + value;
				featureType = "EReference";
			}
			Function<String, String> tokens = Map.of(
					"featureType", featureType,
					"name",	declaration.getKey(),
					"type",	type,
					"extra", extra)::get;
			System.out.print(Util.interpolate(FEATURE_TEMPLATE, tokens));			
		}
	}

}
