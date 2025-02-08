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
	 * Returns the value of the '<em><b>Projects</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference.
	 * @see #setProjects(Project)
	 * @see org.nasdanika.models.jira.JiraPackage#getJira_Projects()
	 * @model
	 * @generated
	 */
	Project getProjects();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Jira#getProjects <em>Projects</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projects</em>' reference.
	 * @see #getProjects()
	 * @generated
	 */
	void setProjects(Project value);

} // Jira
