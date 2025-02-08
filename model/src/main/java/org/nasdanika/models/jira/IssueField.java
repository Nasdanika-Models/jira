/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.IssueField#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.IssueField#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getIssueField()
 * @model superTypes="org.nasdanika.models.jira.NamedEntity org.nasdanika.models.jira.IdentifiableEntity&lt;org.eclipse.emf.ecore.EString&gt;"
 * @generated
 */
public interface IssueField extends NamedEntity, IdentifiableEntity<String> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssueField_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.IssueField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EObject)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssueField_Value()
	 * @model
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.IssueField#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

} // IssueField
