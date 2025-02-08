/**
 */
package org.nasdanika.models.jira;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.BasicUser#getAccountId <em>Account Id</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.BasicUser#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getBasicUser()
 * @model
 * @generated
 */
public interface BasicUser extends AdressableNamedEntity {
	/**
	 * Returns the value of the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Id</em>' attribute.
	 * @see #setAccountId(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getBasicUser_AccountId()
	 * @model
	 * @generated
	 */
	String getAccountId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.BasicUser#getAccountId <em>Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Id</em>' attribute.
	 * @see #getAccountId()
	 * @generated
	 */
	void setAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getBasicUser_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.BasicUser#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

} // BasicUser
