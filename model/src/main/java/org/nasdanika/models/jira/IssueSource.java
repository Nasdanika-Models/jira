/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Source</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.jira.JiraPackage#getIssueSource()
 * @model abstract="true"
 * @generated
 */
public interface IssueSource extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Issue> getIssues();

} // IssueSource
