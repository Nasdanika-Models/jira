/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Category#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Issue}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.jira.Issue#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getCategory_Issues()
	 * @see org.nasdanika.models.jira.Issue#getCategories
	 * @model opposite="categories"
	 * @generated
	 */
	EList<Issue> getIssues();

} // Category
