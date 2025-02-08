/**
 */
package org.nasdanika.models.jira;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.BasicIssue#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getBasicIssue()
 * @model superTypes="org.nasdanika.models.jira.AddressableEntity org.nasdanika.models.jira.IdentifiableEntity&lt;org.eclipse.emf.ecore.ELongObject&gt;"
 * @generated
 */
public interface BasicIssue extends AddressableEntity, IdentifiableEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getBasicIssue_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.BasicIssue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // BasicIssue
