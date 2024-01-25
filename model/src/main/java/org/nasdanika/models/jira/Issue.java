/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Issue#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getAssignee <em>Assignee</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getIssue()
 * @model abstract="true"
 * @generated
 */
public interface Issue extends EObject {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Category}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.jira.Category#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Categories()
	 * @see org.nasdanika.models.jira.Category#getIssues
	 * @model opposite="issues"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Release}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.jira.Release#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Versions()
	 * @see org.nasdanika.models.jira.Release#getIssues
	 * @model opposite="issues"
	 * @generated
	 */
	EList<Release> getVersions();

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Assignee()
	 * @model
	 * @generated
	 */
	EList<User> getAssignee();

} // Issue
