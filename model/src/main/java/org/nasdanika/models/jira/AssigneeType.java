/**
 */
package org.nasdanika.models.jira;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assignee Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.jira.JiraPackage#getAssigneeType()
 * @model
 * @generated
 */
public enum AssigneeType implements Enumerator {
	/**
	 * The '<em><b>PROJECT DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECT_DEFAULT(0, "PROJECT_DEFAULT", "PROJECT_DEFAULT"),

	/**
	 * The '<em><b>COMPONENT LEAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_LEAD_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_LEAD(1, "COMPONENT_LEAD", "COMPONENT_LEAD"),

	/**
	 * The '<em><b>PROJECT LEAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_LEAD_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECT_LEAD(2, "PROJECT_LEAD", "PROJECT_LEAD"),

	/**
	 * The '<em><b>UNASSIGNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	UNASSIGNED(3, "UNASSIGNED", "UNASSIGNED");

	/**
	 * The '<em><b>PROJECT DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>COMPONENT LEAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_LEAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_LEAD_VALUE = 1;

	/**
	 * The '<em><b>PROJECT LEAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_LEAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_LEAD_VALUE = 2;

	/**
	 * The '<em><b>UNASSIGNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNASSIGNED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNASSIGNED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Assignee Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssigneeType[] VALUES_ARRAY =
		new AssigneeType[] {
			PROJECT_DEFAULT,
			COMPONENT_LEAD,
			PROJECT_LEAD,
			UNASSIGNED,
		};

	/**
	 * A public read-only list of all the '<em><b>Assignee Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssigneeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assignee Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssigneeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssigneeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assignee Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssigneeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssigneeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assignee Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssigneeType get(int value) {
		switch (value) {
			case PROJECT_DEFAULT_VALUE: return PROJECT_DEFAULT;
			case COMPONENT_LEAD_VALUE: return COMPONENT_LEAD;
			case PROJECT_LEAD_VALUE: return PROJECT_LEAD;
			case UNASSIGNED_VALUE: return UNASSIGNED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssigneeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AssigneeType
