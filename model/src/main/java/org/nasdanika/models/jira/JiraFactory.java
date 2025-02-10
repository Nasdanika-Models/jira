/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.jira.JiraPackage
 * @generated
 */
public interface JiraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JiraFactory eINSTANCE = org.nasdanika.models.jira.impl.JiraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Jira</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jira</em>'.
	 * @generated
	 */
	Jira createJira();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Basic Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Issue</em>'.
	 * @generated
	 */
	BasicIssue createBasicIssue();

	/**
	 * Returns a new object of class '<em>Issue Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Reference</em>'.
	 * @generated
	 */
	IssueReference createIssueReference();

	/**
	 * Returns a new object of class '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue</em>'.
	 * @generated
	 */
	Issue createIssue();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Basic User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic User</em>'.
	 * @generated
	 */
	BasicUser createBasicUser();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Changelog Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Changelog Group</em>'.
	 * @generated
	 */
	ChangelogGroup createChangelogGroup();

	/**
	 * Returns a new object of class '<em>Changelog Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Changelog Item</em>'.
	 * @generated
	 */
	ChangelogItem createChangelogItem();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility</em>'.
	 * @generated
	 */
	Visibility createVisibility();

	/**
	 * Returns a new object of class '<em>Basic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Component</em>'.
	 * @generated
	 */
	BasicComponent createBasicComponent();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Issue Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Field</em>'.
	 * @generated
	 */
	IssueField createIssueField();

	/**
	 * Returns a new object of class '<em>Issue Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Link</em>'.
	 * @generated
	 */
	IssueLink createIssueLink();

	/**
	 * Returns a new object of class '<em>Operations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operations</em>'.
	 * @generated
	 */
	Operations createOperations();

	/**
	 * Returns a new object of class '<em>Basic Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Priority</em>'.
	 * @generated
	 */
	BasicPriority createBasicPriority();

	/**
	 * Returns a new object of class '<em>Basic Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Project</em>'.
	 * @generated
	 */
	BasicProject createBasicProject();

	/**
	 * Returns a new object of class '<em>Project Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Reference</em>'.
	 * @generated
	 */
	ProjectReference createProjectReference();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Basic Project Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Project Role</em>'.
	 * @generated
	 */
	BasicProjectRole createBasicProjectRole();

	/**
	 * Returns a new object of class '<em>Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolution</em>'.
	 * @generated
	 */
	Resolution createResolution();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Status Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Category</em>'.
	 * @generated
	 */
	StatusCategory createStatusCategory();

	/**
	 * Returns a new object of class '<em>Subtask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtask</em>'.
	 * @generated
	 */
	Subtask createSubtask();

	/**
	 * Returns a new object of class '<em>Time Tracking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Tracking</em>'.
	 * @generated
	 */
	TimeTracking createTimeTracking();

	/**
	 * Returns a new object of class '<em>Basic Votes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Votes</em>'.
	 * @generated
	 */
	BasicVotes createBasicVotes();

	/**
	 * Returns a new object of class '<em>Basic Watchers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Watchers</em>'.
	 * @generated
	 */
	BasicWatchers createBasicWatchers();

	/**
	 * Returns a new object of class '<em>Worklog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Worklog</em>'.
	 * @generated
	 */
	Worklog createWorklog();

	/**
	 * Returns a new object of class '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Type</em>'.
	 * @generated
	 */
	IssueType createIssueType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JiraPackage getJiraPackage();

} //JiraFactory
