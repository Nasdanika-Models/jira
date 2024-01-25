/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Project#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getIssueCollectors <em>Issue Collectors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends IssueSource {

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Issues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Releases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.UserRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserRole> getUsers();

	/**
	 * Returns the value of the '<em><b>Issue Collectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.IssueCollector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Collectors</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_IssueCollectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueCollector> getIssueCollectors();
} // Project
