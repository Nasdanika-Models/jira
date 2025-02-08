/**
 */
package org.nasdanika.models.jira;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worklog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Worklog#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Worklog#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Worklog#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Worklog#getIssueUri <em>Issue Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Worklog#getMinutesSpent <em>Minutes Spent</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Worklog#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Worklog#getUpdateAuthor <em>Update Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Worklog#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Worklog#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getWorklog()
 * @model
 * @generated
 */
public interface Worklog extends AddressableEntity {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(BasicUser)
	 * @see org.nasdanika.models.jira.JiraPackage#getWorklog_Author()
	 * @model
	 * @generated
	 */
	BasicUser getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Worklog#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(BasicUser value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getWorklog_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Worklog#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getWorklog_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Worklog#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Uri</em>' attribute.
	 * @see #setIssueUri(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getWorklog_IssueUri()
	 * @model
	 * @generated
	 */
	String getIssueUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Worklog#getIssueUri <em>Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Uri</em>' attribute.
	 * @see #getIssueUri()
	 * @generated
	 */
	void setIssueUri(String value);

	/**
	 * Returns the value of the '<em><b>Minutes Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes Spent</em>' attribute.
	 * @see #setMinutesSpent(int)
	 * @see org.nasdanika.models.jira.JiraPackage#getWorklog_MinutesSpent()
	 * @model
	 * @generated
	 */
	int getMinutesSpent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Worklog#getMinutesSpent <em>Minutes Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes Spent</em>' attribute.
	 * @see #getMinutesSpent()
	 * @generated
	 */
	void setMinutesSpent(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getWorklog_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Worklog#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Update Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Author</em>' reference.
	 * @see #setUpdateAuthor(BasicUser)
	 * @see org.nasdanika.models.jira.JiraPackage#getWorklog_UpdateAuthor()
	 * @model
	 * @generated
	 */
	BasicUser getUpdateAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Worklog#getUpdateAuthor <em>Update Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Author</em>' reference.
	 * @see #getUpdateAuthor()
	 * @generated
	 */
	void setUpdateAuthor(BasicUser value);

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Date</em>' attribute.
	 * @see #setUpdateDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getWorklog_UpdateDate()
	 * @model
	 * @generated
	 */
	Date getUpdateDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Worklog#getUpdateDate <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' attribute.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(Date value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' reference.
	 * @see #setVisibility(Visibility)
	 * @see org.nasdanika.models.jira.JiraPackage#getWorklog_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Worklog#getVisibility <em>Visibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' reference.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

} // Worklog
