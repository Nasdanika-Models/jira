/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.IssueLink#isInbound <em>Inbound</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.IssueLink#getTargetIssueKey <em>Target Issue Key</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.IssueLink#getTargetIssueUri <em>Target Issue Uri</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getIssueLink()
 * @model
 * @generated
 */
public interface IssueLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Inbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound</em>' attribute.
	 * @see #setInbound(boolean)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssueLink_Inbound()
	 * @model
	 * @generated
	 */
	boolean isInbound();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.IssueLink#isInbound <em>Inbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound</em>' attribute.
	 * @see #isInbound()
	 * @generated
	 */
	void setInbound(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Issue Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Issue Key</em>' attribute.
	 * @see #setTargetIssueKey(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssueLink_TargetIssueKey()
	 * @model
	 * @generated
	 */
	String getTargetIssueKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.IssueLink#getTargetIssueKey <em>Target Issue Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Issue Key</em>' attribute.
	 * @see #getTargetIssueKey()
	 * @generated
	 */
	void setTargetIssueKey(String value);

	/**
	 * Returns the value of the '<em><b>Target Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Issue Uri</em>' attribute.
	 * @see #setTargetIssueUri(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssueLink_TargetIssueUri()
	 * @model
	 * @generated
	 */
	String getTargetIssueUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.IssueLink#getTargetIssueUri <em>Target Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Issue Uri</em>' attribute.
	 * @see #getTargetIssueUri()
	 * @generated
	 */
	void setTargetIssueUri(String value);

} // IssueLink
