/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Subtask#getIssueKey <em>Issue Key</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Subtask#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Subtask#getIssueUri <em>Issue Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Subtask#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Subtask#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getSubtask()
 * @model
 * @generated
 */
public interface Subtask extends EObject {
	/**
	 * Returns the value of the '<em><b>Issue Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Key</em>' attribute.
	 * @see #setIssueKey(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getSubtask_IssueKey()
	 * @model
	 * @generated
	 */
	String getIssueKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Subtask#getIssueKey <em>Issue Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Key</em>' attribute.
	 * @see #getIssueKey()
	 * @generated
	 */
	void setIssueKey(String value);

	/**
	 * Returns the value of the '<em><b>Issue Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Type</em>' reference.
	 * @see #setIssueType(IssueType)
	 * @see org.nasdanika.models.jira.JiraPackage#getSubtask_IssueType()
	 * @model
	 * @generated
	 */
	IssueType getIssueType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Subtask#getIssueType <em>Issue Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Type</em>' reference.
	 * @see #getIssueType()
	 * @generated
	 */
	void setIssueType(IssueType value);

	/**
	 * Returns the value of the '<em><b>Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Uri</em>' attribute.
	 * @see #setIssueUri(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getSubtask_IssueUri()
	 * @model
	 * @generated
	 */
	String getIssueUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Subtask#getIssueUri <em>Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Uri</em>' attribute.
	 * @see #getIssueUri()
	 * @generated
	 */
	void setIssueUri(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see org.nasdanika.models.jira.JiraPackage#getSubtask_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Subtask#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getSubtask_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Subtask#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

} // Subtask
