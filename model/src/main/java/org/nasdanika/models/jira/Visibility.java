/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Visibility#isGroup <em>Group</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Visibility#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getVisibility()
 * @model
 * @generated
 */
public interface Visibility extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(boolean)
	 * @see org.nasdanika.models.jira.JiraPackage#getVisibility_Group()
	 * @model
	 * @generated
	 */
	boolean isGroup();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Visibility#isGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #isGroup()
	 * @generated
	 */
	void setGroup(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getVisibility_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Visibility#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Visibility
