/**
 */
package org.nasdanika.models.jira;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Issue#getAffectedVersions <em>Affected Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getChangelog <em>Changelog</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getComments <em>Comments</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getExpandos <em>Expandos</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getFixVersions <em>Fix Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getIssueFields <em>Issue Fields</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getIssueLinks <em>Issue Links</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getProject <em>Project</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getSubtasks <em>Subtasks</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getTimeTracking <em>Time Tracking</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getTransitionsUri <em>Transitions Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getVotes <em>Votes</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getWatchers <em>Watchers</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Issue#getWorklogs <em>Worklogs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends BasicIssue {
	/**
	 * Returns the value of the '<em><b>Affected Versions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Versions</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_AffectedVersions()
	 * @model
	 * @generated
	 */
	EList<Version> getAffectedVersions();

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(User)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Assignee()
	 * @model
	 * @generated
	 */
	User getAssignee();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(User value);

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Attachments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getAttachments();

	/**
	 * Returns the value of the '<em><b>Changelog</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.ChangelogGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changelog</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Changelog()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangelogGroup> getChangelog();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.BasicComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Components()
	 * @model
	 * @generated
	 */
	EList<BasicComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Expandos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expandos</em>' attribute list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Expandos()
	 * @model
	 * @generated
	 */
	EList<String> getExpandos();

	/**
	 * Returns the value of the '<em><b>Fix Versions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix Versions</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_FixVersions()
	 * @model
	 * @generated
	 */
	EList<Version> getFixVersions();

	/**
	 * Returns the value of the '<em><b>Issue Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.IssueField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Fields</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_IssueFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueField> getIssueFields();

	/**
	 * Returns the value of the '<em><b>Issue Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.IssueLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Links</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_IssueLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueLink> getIssueLinks();

	/**
	 * Returns the value of the '<em><b>Issue Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Type</em>' reference.
	 * @see #setIssueType(IssueType)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_IssueType()
	 * @model
	 * @generated
	 */
	IssueType getIssueType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getIssueType <em>Issue Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Type</em>' reference.
	 * @see #getIssueType()
	 * @generated
	 */
	void setIssueType(IssueType value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference.
	 * @see #setOperations(Operations)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Operations()
	 * @model containment="true"
	 * @generated
	 */
	Operations getOperations();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getOperations <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' containment reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(Operations value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(BasicPriority)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Priority()
	 * @model containment="true"
	 * @generated
	 */
	BasicPriority getPriority();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(BasicPriority value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(BasicProject)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Project()
	 * @model
	 * @generated
	 */
	BasicProject getProject();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(BasicProject value);

	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporter</em>' reference.
	 * @see #setReporter(User)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Reporter()
	 * @model
	 * @generated
	 */
	User getReporter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getReporter <em>Reporter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' reference.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(User value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference.
	 * @see #setResolution(Resolution)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Resolution()
	 * @model containment="true"
	 * @generated
	 */
	Resolution getResolution();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getResolution <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' containment reference.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Resolution value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Status()
	 * @model containment="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Subtasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Subtask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtasks</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Subtasks()
	 * @model containment="true" keys="issueKey"
	 * @generated
	 */
	EList<Subtask> getSubtasks();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Time Tracking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Tracking</em>' containment reference.
	 * @see #setTimeTracking(TimeTracking)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_TimeTracking()
	 * @model containment="true"
	 * @generated
	 */
	TimeTracking getTimeTracking();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getTimeTracking <em>Time Tracking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Tracking</em>' containment reference.
	 * @see #getTimeTracking()
	 * @generated
	 */
	void setTimeTracking(TimeTracking value);

	/**
	 * Returns the value of the '<em><b>Transitions Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions Uri</em>' attribute.
	 * @see #setTransitionsUri(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_TransitionsUri()
	 * @model
	 * @generated
	 */
	String getTransitionsUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getTransitionsUri <em>Transitions Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions Uri</em>' attribute.
	 * @see #getTransitionsUri()
	 * @generated
	 */
	void setTransitionsUri(String value);

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Date</em>' attribute.
	 * @see #setUpdateDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_UpdateDate()
	 * @model
	 * @generated
	 */
	Date getUpdateDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getUpdateDate <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' attribute.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(Date value);

	/**
	 * Returns the value of the '<em><b>Votes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Votes</em>' containment reference.
	 * @see #setVotes(BasicVotes)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Votes()
	 * @model containment="true"
	 * @generated
	 */
	BasicVotes getVotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getVotes <em>Votes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Votes</em>' containment reference.
	 * @see #getVotes()
	 * @generated
	 */
	void setVotes(BasicVotes value);

	/**
	 * Returns the value of the '<em><b>Watchers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watchers</em>' containment reference.
	 * @see #setWatchers(BasicWatchers)
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Watchers()
	 * @model containment="true"
	 * @generated
	 */
	BasicWatchers getWatchers();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Issue#getWatchers <em>Watchers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watchers</em>' containment reference.
	 * @see #getWatchers()
	 * @generated
	 */
	void setWatchers(BasicWatchers value);

	/**
	 * Returns the value of the '<em><b>Worklogs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Worklog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worklogs</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getIssue_Worklogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Worklog> getWorklogs();

} // Issue
