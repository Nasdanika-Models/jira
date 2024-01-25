/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Plan#getIssueSources <em>Issue Sources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getPlan()
 * @model
 * @generated
 */
public interface Plan extends EObject {
	/**
	 * Returns the value of the '<em><b>Issue Sources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.IssueSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Sources</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getPlan_IssueSources()
	 * @model
	 * @generated
	 */
	EList<IssueSource> getIssueSources();

} // Plan
