/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.jira.JiraFactory
 * @model kind="package"
 * @generated
 */
public interface JiraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jira";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/jira";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.jira";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JiraPackage eINSTANCE = org.nasdanika.models.jira.impl.JiraPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.UserImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.ProjectImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.RoleImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.UserRoleImpl <em>User Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.UserRoleImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getUserRole()
	 * @generated
	 */
	int USER_ROLE = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.IssueImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.InitiativeImpl <em>Initiative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.InitiativeImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getInitiative()
	 * @generated
	 */
	int INITIATIVE = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.EpicImpl <em>Epic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.EpicImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getEpic()
	 * @generated
	 */
	int EPIC = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.StoryImpl <em>Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.StoryImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getStory()
	 * @generated
	 */
	int STORY = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.TaskImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.SubtaskImpl <em>Subtask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.SubtaskImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getSubtask()
	 * @generated
	 */
	int SUBTASK = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.CategoryImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 10;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.ReleaseImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.IssueCollectorImpl <em>Issue Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.IssueCollectorImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueCollector()
	 * @generated
	 */
	int ISSUE_COLLECTOR = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.IssueSourceImpl <em>Issue Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.IssueSourceImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueSource()
	 * @generated
	 */
	int ISSUE_SOURCE = 13;

	/**
	 * The number of structural features of the '<em>Issue Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Issues</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_SOURCE___GET_ISSUES = 0;

	/**
	 * The number of operations of the '<em>Issue Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_SOURCE_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUES = ISSUE_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CATEGORIES = ISSUE_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RELEASES = ISSUE_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__USERS = ISSUE_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Issue Collectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUE_COLLECTORS = ISSUE_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = ISSUE_SOURCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Issues</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___GET_ISSUES = ISSUE_SOURCE___GET_ISSUES;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = ISSUE_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__USERS = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__ROLE = 1;

	/**
	 * The number of structural features of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__VERSIONS = 1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNEE = 2;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATIVE__CATEGORIES = ISSUE__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATIVE__VERSIONS = ISSUE__VERSIONS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATIVE__ASSIGNEE = ISSUE__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Epics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATIVE__EPICS = ISSUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initiative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATIVE_FEATURE_COUNT = ISSUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initiative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATIVE_OPERATION_COUNT = ISSUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__CATEGORIES = ISSUE__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__VERSIONS = ISSUE__VERSIONS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__ASSIGNEE = ISSUE__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__STORIES = ISSUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Epic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC_FEATURE_COUNT = ISSUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Epic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC_OPERATION_COUNT = ISSUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__CATEGORIES = ISSUE__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__VERSIONS = ISSUE__VERSIONS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__ASSIGNEE = ISSUE__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Sub Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__SUB_TASKS = ISSUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_FEATURE_COUNT = ISSUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_OPERATION_COUNT = ISSUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CATEGORIES = STORY__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__VERSIONS = STORY__VERSIONS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ASSIGNEE = STORY__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Sub Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUB_TASKS = STORY__SUB_TASKS;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = STORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = STORY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK__CATEGORIES = ISSUE__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK__VERSIONS = ISSUE__VERSIONS;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK__ASSIGNEE = ISSUE__ASSIGNEE;

	/**
	 * The number of structural features of the '<em>Subtask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK_FEATURE_COUNT = ISSUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subtask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK_OPERATION_COUNT = ISSUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ISSUES = 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ISSUES = 0;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Issue Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_COLLECTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Issue Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_COLLECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.FilterImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 14;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = ISSUE_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Issues</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___GET_ISSUES = ISSUE_SOURCE___GET_ISSUES;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = ISSUE_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.BoardImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 15;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = ISSUE_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Issues</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_ISSUES = ISSUE_SOURCE___GET_ISSUES;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = ISSUE_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.PlanImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 16;

	/**
	 * The feature id for the '<em><b>Issue Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ISSUE_SOURCES = 0;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.ProgramImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 17;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PLANS = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.nasdanika.models.jira.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.nasdanika.models.jira.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see org.nasdanika.models.jira.Project#getIssues()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Issues();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.nasdanika.models.jira.Project#getCategories()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see org.nasdanika.models.jira.Project#getReleases()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Releases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.nasdanika.models.jira.Project#getUsers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getIssueCollectors <em>Issue Collectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Collectors</em>'.
	 * @see org.nasdanika.models.jira.Project#getIssueCollectors()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_IssueCollectors();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.nasdanika.models.jira.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.UserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Role</em>'.
	 * @see org.nasdanika.models.jira.UserRole
	 * @generated
	 */
	EClass getUserRole();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.UserRole#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see org.nasdanika.models.jira.UserRole#getUsers()
	 * @see #getUserRole()
	 * @generated
	 */
	EReference getUserRole_Users();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.UserRole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.nasdanika.models.jira.UserRole#getRole()
	 * @see #getUserRole()
	 * @generated
	 */
	EReference getUserRole_Role();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see org.nasdanika.models.jira.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Issue#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see org.nasdanika.models.jira.Issue#getCategories()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Categories();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Issue#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versions</em>'.
	 * @see org.nasdanika.models.jira.Issue#getVersions()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Versions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Issue#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignee</em>'.
	 * @see org.nasdanika.models.jira.Issue#getAssignee()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Assignee();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Initiative <em>Initiative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initiative</em>'.
	 * @see org.nasdanika.models.jira.Initiative
	 * @generated
	 */
	EClass getInitiative();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Initiative#getEpics <em>Epics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Epics</em>'.
	 * @see org.nasdanika.models.jira.Initiative#getEpics()
	 * @see #getInitiative()
	 * @generated
	 */
	EReference getInitiative_Epics();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Epic <em>Epic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epic</em>'.
	 * @see org.nasdanika.models.jira.Epic
	 * @generated
	 */
	EClass getEpic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Epic#getStories <em>Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stories</em>'.
	 * @see org.nasdanika.models.jira.Epic#getStories()
	 * @see #getEpic()
	 * @generated
	 */
	EReference getEpic_Stories();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Story <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story</em>'.
	 * @see org.nasdanika.models.jira.Story
	 * @generated
	 */
	EClass getStory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Story#getSubTasks <em>Sub Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Tasks</em>'.
	 * @see org.nasdanika.models.jira.Story#getSubTasks()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_SubTasks();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.nasdanika.models.jira.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Subtask <em>Subtask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtask</em>'.
	 * @see org.nasdanika.models.jira.Subtask
	 * @generated
	 */
	EClass getSubtask();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.nasdanika.models.jira.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Category#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see org.nasdanika.models.jira.Category#getIssues()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Issues();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.nasdanika.models.jira.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Release#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see org.nasdanika.models.jira.Release#getIssues()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Issues();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.IssueCollector <em>Issue Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Collector</em>'.
	 * @see org.nasdanika.models.jira.IssueCollector
	 * @generated
	 */
	EClass getIssueCollector();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.IssueSource <em>Issue Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Source</em>'.
	 * @see org.nasdanika.models.jira.IssueSource
	 * @generated
	 */
	EClass getIssueSource();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.jira.IssueSource#getIssues() <em>Get Issues</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Issues</em>' operation.
	 * @see org.nasdanika.models.jira.IssueSource#getIssues()
	 * @generated
	 */
	EOperation getIssueSource__GetIssues();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org.nasdanika.models.jira.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see org.nasdanika.models.jira.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see org.nasdanika.models.jira.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Plan#getIssueSources <em>Issue Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issue Sources</em>'.
	 * @see org.nasdanika.models.jira.Plan#getIssueSources()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_IssueSources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.nasdanika.models.jira.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Program#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plans</em>'.
	 * @see org.nasdanika.models.jira.Program#getPlans()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Plans();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JiraFactory getJiraFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.UserImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.ProjectImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ISSUES = eINSTANCE.getProject_Issues();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CATEGORIES = eINSTANCE.getProject_Categories();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RELEASES = eINSTANCE.getProject_Releases();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__USERS = eINSTANCE.getProject_Users();

		/**
		 * The meta object literal for the '<em><b>Issue Collectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ISSUE_COLLECTORS = eINSTANCE.getProject_IssueCollectors();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.RoleImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.UserRoleImpl <em>User Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.UserRoleImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getUserRole()
		 * @generated
		 */
		EClass USER_ROLE = eINSTANCE.getUserRole();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ROLE__USERS = eINSTANCE.getUserRole_Users();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ROLE__ROLE = eINSTANCE.getUserRole_Role();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.IssueImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CATEGORIES = eINSTANCE.getIssue_Categories();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__VERSIONS = eINSTANCE.getIssue_Versions();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ASSIGNEE = eINSTANCE.getIssue_Assignee();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.InitiativeImpl <em>Initiative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.InitiativeImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getInitiative()
		 * @generated
		 */
		EClass INITIATIVE = eINSTANCE.getInitiative();

		/**
		 * The meta object literal for the '<em><b>Epics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATIVE__EPICS = eINSTANCE.getInitiative_Epics();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.EpicImpl <em>Epic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.EpicImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getEpic()
		 * @generated
		 */
		EClass EPIC = eINSTANCE.getEpic();

		/**
		 * The meta object literal for the '<em><b>Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPIC__STORIES = eINSTANCE.getEpic_Stories();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.StoryImpl <em>Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.StoryImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getStory()
		 * @generated
		 */
		EClass STORY = eINSTANCE.getStory();

		/**
		 * The meta object literal for the '<em><b>Sub Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__SUB_TASKS = eINSTANCE.getStory_SubTasks();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.TaskImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.SubtaskImpl <em>Subtask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.SubtaskImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getSubtask()
		 * @generated
		 */
		EClass SUBTASK = eINSTANCE.getSubtask();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.CategoryImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ISSUES = eINSTANCE.getCategory_Issues();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.ReleaseImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__ISSUES = eINSTANCE.getRelease_Issues();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.IssueCollectorImpl <em>Issue Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.IssueCollectorImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueCollector()
		 * @generated
		 */
		EClass ISSUE_COLLECTOR = eINSTANCE.getIssueCollector();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.IssueSourceImpl <em>Issue Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.IssueSourceImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueSource()
		 * @generated
		 */
		EClass ISSUE_SOURCE = eINSTANCE.getIssueSource();

		/**
		 * The meta object literal for the '<em><b>Get Issues</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISSUE_SOURCE___GET_ISSUES = eINSTANCE.getIssueSource__GetIssues();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.FilterImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.BoardImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.PlanImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>Issue Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__ISSUE_SOURCES = eINSTANCE.getPlan_IssueSources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.ProgramImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PLANS = eINSTANCE.getProgram_Plans();

	}

} //JiraPackage
