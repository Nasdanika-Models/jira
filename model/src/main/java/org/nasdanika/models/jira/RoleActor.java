/**
 */
package org.nasdanika.models.jira;

import org.nasdanika.ncore.Reference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.RoleActor#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.RoleActor#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.RoleActor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getRoleActor()
 * @model superTypes="org.nasdanika.models.jira.NamedEntity org.nasdanika.models.jira.IdentifiableEntity&lt;org.eclipse.emf.ecore.ELongObject&gt; org.nasdanika.ncore.Reference&lt;org.nasdanika.models.jira.Actor&gt;"
 * @generated
 */
public interface RoleActor extends NamedEntity, IdentifiableEntity<Long>, Reference<Actor> {
	/**
	 * Returns the value of the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avatar Url</em>' attribute.
	 * @see #setAvatarUrl(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getRoleActor_AvatarUrl()
	 * @model
	 * @generated
	 */
	String getAvatarUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.RoleActor#getAvatarUrl <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar Url</em>' attribute.
	 * @see #getAvatarUrl()
	 * @generated
	 */
	void setAvatarUrl(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getRoleActor_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.RoleActor#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getRoleActor_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.RoleActor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // RoleActor
