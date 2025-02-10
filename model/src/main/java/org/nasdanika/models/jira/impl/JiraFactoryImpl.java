/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.jira.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JiraFactoryImpl extends EFactoryImpl implements JiraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JiraFactory init() {
		try {
			JiraFactory theJiraFactory = (JiraFactory)EPackage.Registry.INSTANCE.getEFactory(JiraPackage.eNS_URI);
			if (theJiraFactory != null) {
				return theJiraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JiraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JiraPackage.JIRA: return createJira();
			case JiraPackage.GROUP: return createGroup();
			case JiraPackage.BASIC_ISSUE: return createBasicIssue();
			case JiraPackage.ISSUE_REFERENCE: return createIssueReference();
			case JiraPackage.ISSUE: return createIssue();
			case JiraPackage.VERSION: return createVersion();
			case JiraPackage.BASIC_USER: return createBasicUser();
			case JiraPackage.USER: return createUser();
			case JiraPackage.ATTACHMENT: return createAttachment();
			case JiraPackage.CHANGELOG_GROUP: return createChangelogGroup();
			case JiraPackage.CHANGELOG_ITEM: return createChangelogItem();
			case JiraPackage.COMMENT: return createComment();
			case JiraPackage.VISIBILITY: return createVisibility();
			case JiraPackage.BASIC_COMPONENT: return createBasicComponent();
			case JiraPackage.COMPONENT: return createComponent();
			case JiraPackage.ISSUE_FIELD: return createIssueField();
			case JiraPackage.ISSUE_LINK: return createIssueLink();
			case JiraPackage.OPERATIONS: return createOperations();
			case JiraPackage.BASIC_PRIORITY: return createBasicPriority();
			case JiraPackage.BASIC_PROJECT: return createBasicProject();
			case JiraPackage.PROJECT_REFERENCE: return createProjectReference();
			case JiraPackage.PROJECT: return createProject();
			case JiraPackage.BASIC_PROJECT_ROLE: return createBasicProjectRole();
			case JiraPackage.RESOLUTION: return createResolution();
			case JiraPackage.STATUS: return createStatus();
			case JiraPackage.STATUS_CATEGORY: return createStatusCategory();
			case JiraPackage.SUBTASK: return createSubtask();
			case JiraPackage.TIME_TRACKING: return createTimeTracking();
			case JiraPackage.BASIC_VOTES: return createBasicVotes();
			case JiraPackage.BASIC_WATCHERS: return createBasicWatchers();
			case JiraPackage.WORKLOG: return createWorklog();
			case JiraPackage.ISSUE_TYPE: return createIssueType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JiraPackage.ASSIGNEE_TYPE:
				return createAssigneeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JiraPackage.ASSIGNEE_TYPE:
				return convertAssigneeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Jira createJira() {
		JiraImpl jira = new JiraImpl();
		return jira;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicIssue createBasicIssue() {
		BasicIssueImpl basicIssue = new BasicIssueImpl();
		return basicIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueReference createIssueReference() {
		IssueReferenceImpl issueReference = new IssueReferenceImpl();
		return issueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUser createBasicUser() {
		BasicUserImpl basicUser = new BasicUserImpl();
		return basicUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangelogGroup createChangelogGroup() {
		ChangelogGroupImpl changelogGroup = new ChangelogGroupImpl();
		return changelogGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangelogItem createChangelogItem() {
		ChangelogItemImpl changelogItem = new ChangelogItemImpl();
		return changelogItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visibility createVisibility() {
		VisibilityImpl visibility = new VisibilityImpl();
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicComponent createBasicComponent() {
		BasicComponentImpl basicComponent = new BasicComponentImpl();
		return basicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueField createIssueField() {
		IssueFieldImpl issueField = new IssueFieldImpl();
		return issueField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueLink createIssueLink() {
		IssueLinkImpl issueLink = new IssueLinkImpl();
		return issueLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operations createOperations() {
		OperationsImpl operations = new OperationsImpl();
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicPriority createBasicPriority() {
		BasicPriorityImpl basicPriority = new BasicPriorityImpl();
		return basicPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicProject createBasicProject() {
		BasicProjectImpl basicProject = new BasicProjectImpl();
		return basicProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectReference createProjectReference() {
		ProjectReferenceImpl projectReference = new ProjectReferenceImpl();
		return projectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicProjectRole createBasicProjectRole() {
		BasicProjectRoleImpl basicProjectRole = new BasicProjectRoleImpl();
		return basicProjectRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resolution createResolution() {
		ResolutionImpl resolution = new ResolutionImpl();
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusCategory createStatusCategory() {
		StatusCategoryImpl statusCategory = new StatusCategoryImpl();
		return statusCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subtask createSubtask() {
		SubtaskImpl subtask = new SubtaskImpl();
		return subtask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTracking createTimeTracking() {
		TimeTrackingImpl timeTracking = new TimeTrackingImpl();
		return timeTracking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicVotes createBasicVotes() {
		BasicVotesImpl basicVotes = new BasicVotesImpl();
		return basicVotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicWatchers createBasicWatchers() {
		BasicWatchersImpl basicWatchers = new BasicWatchersImpl();
		return basicWatchers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Worklog createWorklog() {
		WorklogImpl worklog = new WorklogImpl();
		return worklog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueType createIssueType() {
		IssueTypeImpl issueType = new IssueTypeImpl();
		return issueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssigneeType createAssigneeTypeFromString(EDataType eDataType, String initialValue) {
		AssigneeType result = AssigneeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssigneeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JiraPackage getJiraPackage() {
		return (JiraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JiraPackage getPackage() {
		return JiraPackage.eINSTANCE;
	}

} //JiraFactoryImpl
