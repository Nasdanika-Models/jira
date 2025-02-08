/**
 */
package org.nasdanika.models.jira;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.IssueType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.IssueType#getIconUri <em>Icon Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.IssueType#isIsSubtask <em>Is Subtask</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getIssueType()
 * @model superTypes="org.nasdanika.models.jira.AdressableNamedIdentifiableEntity&lt;org.eclipse.emf.ecore.ELongObject&gt;"
 * @generated
 */
public interface IssueType extends AdressableNamedIdentifiableEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssueType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.IssueType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Icon Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Uri</em>' attribute.
	 * @see #setIconUri(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssueType_IconUri()
	 * @model
	 * @generated
	 */
	String getIconUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.IssueType#getIconUri <em>Icon Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Uri</em>' attribute.
	 * @see #getIconUri()
	 * @generated
	 */
	void setIconUri(String value);

	/**
	 * Returns the value of the '<em><b>Is Subtask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Subtask</em>' attribute.
	 * @see #setIsSubtask(boolean)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssueType_IsSubtask()
	 * @model
	 * @generated
	 */
	boolean isIsSubtask();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.IssueType#isIsSubtask <em>Is Subtask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Subtask</em>' attribute.
	 * @see #isIsSubtask()
	 * @generated
	 */
	void setIsSubtask(boolean value);

} // IssueType
