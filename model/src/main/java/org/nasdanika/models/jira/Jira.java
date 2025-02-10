/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jira</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Jira#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Jira#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Jira#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getJira()
 * @model
 * @generated
 */
public interface Jira extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getJira_Users()
	 * @model containment="true" keys="accountId"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.BasicProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getJira_Projects()
	 * @model keys="key"
	 * @generated
	 */
	EList<BasicProject> getProjects();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getJira_Groups()
	 * @model keys="name"
	 * @generated
	 */
	EList<Group> getGroups();

} // Jira
