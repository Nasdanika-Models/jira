/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.JiraImpl <em>Jira</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.JiraImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getJira()
	 * @generated
	 */
	int JIRA = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA__USERS = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA__PROJECTS = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA__GROUPS = 2;

	/**
	 * The number of structural features of the '<em>Jira</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Jira</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.AddressableEntityImpl <em>Addressable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.AddressableEntityImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAddressableEntity()
	 * @generated
	 */
	int ADDRESSABLE_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ENTITY__SELF = 0;

	/**
	 * The number of structural features of the '<em>Addressable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Addressable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.NamedEntityImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.IdentifiableEntityImpl <em>Identifiable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.IdentifiableEntityImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIdentifiableEntity()
	 * @generated
	 */
	int IDENTIFIABLE_ENTITY = 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.AdressableNamedEntityImpl <em>Adressable Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.AdressableNamedEntityImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAdressableNamedEntity()
	 * @generated
	 */
	int ADRESSABLE_NAMED_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSABLE_NAMED_ENTITY__SELF = ADDRESSABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSABLE_NAMED_ENTITY__NAME = ADDRESSABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adressable Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT = ADDRESSABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Adressable Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSABLE_NAMED_ENTITY_OPERATION_COUNT = ADDRESSABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.GroupImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 1;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SELF = ADRESSABLE_NAMED_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ADRESSABLE_NAMED_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ADRESSABLE_NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ENTITY__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.AdressableNamedIdentifiableEntityImpl <em>Adressable Named Identifiable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.AdressableNamedIdentifiableEntityImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAdressableNamedIdentifiableEntity()
	 * @generated
	 */
	int ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__SELF = ADRESSABLE_NAMED_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__NAME = ADRESSABLE_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adressable Named Identifiable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Adressable Named Identifiable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_OPERATION_COUNT = ADRESSABLE_NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.BasicIssueImpl <em>Basic Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.BasicIssueImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicIssue()
	 * @generated
	 */
	int BASIC_ISSUE = 7;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ISSUE__SELF = ADDRESSABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ISSUE__ID = ADDRESSABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ISSUE__KEY = ADDRESSABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ISSUE_FEATURE_COUNT = ADDRESSABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ISSUE_OPERATION_COUNT = ADDRESSABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.IssueReferenceImpl <em>Issue Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.IssueReferenceImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueReference()
	 * @generated
	 */
	int ISSUE_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_REFERENCE__SELF = BASIC_ISSUE__SELF;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_REFERENCE__ID = BASIC_ISSUE__ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_REFERENCE__KEY = BASIC_ISSUE__KEY;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_REFERENCE__TARGET = BASIC_ISSUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Issue Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_REFERENCE_FEATURE_COUNT = BASIC_ISSUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Issue Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_REFERENCE_OPERATION_COUNT = BASIC_ISSUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.IssueImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 9;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SELF = BASIC_ISSUE__SELF;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ID = BASIC_ISSUE__ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__KEY = BASIC_ISSUE__KEY;

	/**
	 * The feature id for the '<em><b>Affected Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__AFFECTED_VERSIONS = BASIC_ISSUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNEE = BASIC_ISSUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ATTACHMENTS = BASIC_ISSUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Changelog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CHANGELOG = BASIC_ISSUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COMMENTS = BASIC_ISSUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COMPONENTS = BASIC_ISSUE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CREATION_DATE = BASIC_ISSUE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = BASIC_ISSUE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DUE_DATE = BASIC_ISSUE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Expandos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__EXPANDOS = BASIC_ISSUE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fix Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__FIX_VERSIONS = BASIC_ISSUE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Issue Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ISSUE_FIELDS = BASIC_ISSUE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Issue Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ISSUE_LINKS = BASIC_ISSUE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Issue Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ISSUE_TYPE = BASIC_ISSUE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LABELS = BASIC_ISSUE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__OPERATIONS = BASIC_ISSUE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PRIORITY = BASIC_ISSUE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PROJECT = BASIC_ISSUE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Reporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REPORTER = BASIC_ISSUE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RESOLUTION = BASIC_ISSUE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = BASIC_ISSUE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUBTASKS = BASIC_ISSUE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUMMARY = BASIC_ISSUE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Time Tracking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TIME_TRACKING = BASIC_ISSUE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Transitions Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TRANSITIONS_URI = BASIC_ISSUE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__UPDATE_DATE = BASIC_ISSUE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__VOTES = BASIC_ISSUE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Watchers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__WATCHERS = BASIC_ISSUE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Worklogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__WORKLOGS = BASIC_ISSUE_FEATURE_COUNT + 28;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = BASIC_ISSUE_FEATURE_COUNT + 29;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = BASIC_ISSUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.VersionImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 10;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__SELF = ADRESSABLE_NAMED_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = ADRESSABLE_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DESCRIPTION = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ID = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__IS_ARCHIVED = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__IS_RELEASED = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__RELEASE_DATE = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = ADRESSABLE_NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.BasicUserImpl <em>Basic User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.BasicUserImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicUser()
	 * @generated
	 */
	int BASIC_USER = 11;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_USER__SELF = ADRESSABLE_NAMED_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_USER__NAME = ADRESSABLE_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_USER__ACCOUNT_ID = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_USER__DISPLAY_NAME = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_USER_FEATURE_COUNT = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_USER_OPERATION_COUNT = ADRESSABLE_NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.UserImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getUser()
	 * @generated
	 */
	int USER = 12;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SELF = BASIC_USER__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = BASIC_USER__NAME;

	/**
	 * The feature id for the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACCOUNT_ID = BASIC_USER__ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DISPLAY_NAME = BASIC_USER__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACTIVE = BASIC_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL_ADDRESS = BASIC_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TIMEZONE = BASIC_USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GROUPS = BASIC_USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = BASIC_USER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = BASIC_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.AttachmentImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 13;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__SELF = ADDRESSABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__AUTHOR = ADDRESSABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CONTENT_URI = ADDRESSABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CREATION_DATE = ADDRESSABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FILENAME = ADDRESSABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__MIME_TYPE = ADDRESSABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__SIZE = ADDRESSABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thumbnail Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__THUMBNAIL_URI = ADDRESSABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = ADDRESSABLE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = ADDRESSABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.ChangelogGroupImpl <em>Changelog Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.ChangelogGroupImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getChangelogGroup()
	 * @generated
	 */
	int CHANGELOG_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_GROUP__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_GROUP__CREATED = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_GROUP__ITEMS = 2;

	/**
	 * The number of structural features of the '<em>Changelog Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Changelog Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.ChangelogItemImpl <em>Changelog Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.ChangelogItemImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getChangelogItem()
	 * @generated
	 */
	int CHANGELOG_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_ITEM__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_ITEM__CUSTOM = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_ITEM__FROM = 2;

	/**
	 * The feature id for the '<em><b>From String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_ITEM__FROM_STRING = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_ITEM__TO = 4;

	/**
	 * The feature id for the '<em><b>To String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_ITEM__TO_STRING = 5;

	/**
	 * The number of structural features of the '<em>Changelog Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_ITEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Changelog Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGELOG_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.CommentImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 16;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SELF = 4;

	/**
	 * The feature id for the '<em><b>Update Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__UPDATE_AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__UPDATE_DATE = 6;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__VISIBILITY = 7;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.VisibilityImpl <em>Visibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.VisibilityImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.BasicComponentImpl <em>Basic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.BasicComponentImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicComponent()
	 * @generated
	 */
	int BASIC_COMPONENT = 18;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__SELF = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__NAME = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__ID = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__DESCRIPTION = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_FEATURE_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_OPERATION_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.ComponentImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 19;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SELF = BASIC_COMPONENT__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = BASIC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = BASIC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = BASIC_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ASSIGNEE = BASIC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignee Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ASSIGNEE_TYPE = BASIC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Assignee Type Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_ASSIGNEE_TYPE_VALID = BASIC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Real Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REAL_ASSIGNEE = BASIC_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Real Assignee Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REAL_ASSIGNEE_TYPE = BASIC_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = BASIC_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = BASIC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.IssueFieldImpl <em>Issue Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.IssueFieldImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueField()
	 * @generated
	 */
	int ISSUE_FIELD = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FIELD__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FIELD__ID = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FIELD__TYPE = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FIELD__VALUE = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Issue Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FIELD_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Issue Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FIELD_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.IssueLinkImpl <em>Issue Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.IssueLinkImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueLink()
	 * @generated
	 */
	int ISSUE_LINK = 21;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LINK__INBOUND = 0;

	/**
	 * The feature id for the '<em><b>Target Issue Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LINK__TARGET_ISSUE_KEY = 1;

	/**
	 * The feature id for the '<em><b>Target Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LINK__TARGET_ISSUE_URI = 2;

	/**
	 * The number of structural features of the '<em>Issue Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Issue Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.OperationsImpl <em>Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.OperationsImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getOperations()
	 * @generated
	 */
	int OPERATIONS = 22;

	/**
	 * The number of structural features of the '<em>Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.BasicPriorityImpl <em>Basic Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.BasicPriorityImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicPriority()
	 * @generated
	 */
	int BASIC_PRIORITY = 23;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PRIORITY__SELF = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PRIORITY__NAME = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PRIORITY__ID = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Basic Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PRIORITY_FEATURE_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PRIORITY_OPERATION_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.BasicProjectImpl <em>Basic Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.BasicProjectImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicProject()
	 * @generated
	 */
	int BASIC_PROJECT = 24;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT__SELF = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT__NAME = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT__ID = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT__KEY = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT_FEATURE_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT_OPERATION_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.ProjectReferenceImpl <em>Project Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.ProjectReferenceImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getProjectReference()
	 * @generated
	 */
	int PROJECT_REFERENCE = 25;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE__SELF = BASIC_PROJECT__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE__NAME = BASIC_PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE__ID = BASIC_PROJECT__ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE__KEY = BASIC_PROJECT__KEY;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE__TARGET = BASIC_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE_FEATURE_COUNT = BASIC_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Project Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE_OPERATION_COUNT = BASIC_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.ProjectImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 26;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SELF = BASIC_PROJECT__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = BASIC_PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = BASIC_PROJECT__ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__KEY = BASIC_PROJECT__KEY;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMPONENTS = BASIC_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = BASIC_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expandos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EXPANDOS = BASIC_PROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Issue Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUE_TYPES = BASIC_PROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LEAD = BASIC_PROJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Project Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_ROLES = BASIC_PROJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__URI = BASIC_PROJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERSIONS = BASIC_PROJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUES = BASIC_PROJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STATUS_CATEGORIES = BASIC_PROJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = BASIC_PROJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = BASIC_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.BasicProjectRoleImpl <em>Basic Project Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.BasicProjectRoleImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicProjectRole()
	 * @generated
	 */
	int BASIC_PROJECT_ROLE = 27;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT_ROLE__SELF = ADRESSABLE_NAMED_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT_ROLE__NAME = ADRESSABLE_NAMED_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Basic Project Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT_ROLE_FEATURE_COUNT = ADRESSABLE_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Project Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_PROJECT_ROLE_OPERATION_COUNT = ADRESSABLE_NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.ResolutionImpl <em>Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.ResolutionImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getResolution()
	 * @generated
	 */
	int RESOLUTION = 28;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__SELF = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__NAME = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__ID = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__DESCRIPTION = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FEATURE_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_OPERATION_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.StatusImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 29;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__SELF = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__NAME = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__ID = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__DESCRIPTION = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__ICON_URL = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__VALUE = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.StatusCategoryImpl <em>Status Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.StatusCategoryImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getStatusCategory()
	 * @generated
	 */
	int STATUS_CATEGORY = 30;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CATEGORY__SELF = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CATEGORY__NAME = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CATEGORY__ID = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CATEGORY__KEY = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CATEGORY__COLOR_NAME = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Status Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CATEGORY_FEATURE_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Status Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CATEGORY_OPERATION_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.SubtaskImpl <em>Subtask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.SubtaskImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getSubtask()
	 * @generated
	 */
	int SUBTASK = 31;

	/**
	 * The feature id for the '<em><b>Issue Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK__ISSUE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Issue Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK__ISSUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK__ISSUE_URI = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK__SUMMARY = 4;

	/**
	 * The number of structural features of the '<em>Subtask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Subtask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.TimeTrackingImpl <em>Time Tracking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.TimeTrackingImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getTimeTracking()
	 * @generated
	 */
	int TIME_TRACKING = 32;

	/**
	 * The feature id for the '<em><b>Original Estimate Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES = 0;

	/**
	 * The feature id for the '<em><b>Remaining Estimate Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING__REMAINING_ESTIMATE_MINUTES = 1;

	/**
	 * The feature id for the '<em><b>Time Spent Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING__TIME_SPENT_MINUTES = 2;

	/**
	 * The number of structural features of the '<em>Time Tracking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Tracking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.BasicVotesImpl <em>Basic Votes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.BasicVotesImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicVotes()
	 * @generated
	 */
	int BASIC_VOTES = 33;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_VOTES__SELF = ADDRESSABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Has Voted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_VOTES__HAS_VOTED = ADDRESSABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_VOTES__VOTES = ADDRESSABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Votes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_VOTES_FEATURE_COUNT = ADDRESSABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic Votes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_VOTES_OPERATION_COUNT = ADDRESSABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.BasicWatchersImpl <em>Basic Watchers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.BasicWatchersImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicWatchers()
	 * @generated
	 */
	int BASIC_WATCHERS = 34;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WATCHERS__SELF = ADDRESSABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Is Watching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WATCHERS__IS_WATCHING = ADDRESSABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Watchers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WATCHERS__NUM_WATCHERS = ADDRESSABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Watchers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WATCHERS_FEATURE_COUNT = ADDRESSABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic Watchers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_WATCHERS_OPERATION_COUNT = ADDRESSABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.WorklogImpl <em>Worklog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.WorklogImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getWorklog()
	 * @generated
	 */
	int WORKLOG = 35;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__SELF = ADDRESSABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__AUTHOR = ADDRESSABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__COMMENT = ADDRESSABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__CREATION_DATE = ADDRESSABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__ISSUE_URI = ADDRESSABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minutes Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__MINUTES_SPENT = ADDRESSABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__START_DATE = ADDRESSABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Update Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__UPDATE_AUTHOR = ADDRESSABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__UPDATE_DATE = ADDRESSABLE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__VISIBILITY = ADDRESSABLE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Worklog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG_FEATURE_COUNT = ADDRESSABLE_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Worklog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG_OPERATION_COUNT = ADDRESSABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.impl.IssueTypeImpl <em>Issue Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.impl.IssueTypeImpl
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueType()
	 * @generated
	 */
	int ISSUE_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__SELF = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__NAME = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__ID = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__DESCRIPTION = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__ICON_URI = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Subtask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE__IS_SUBTASK = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Issue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE_FEATURE_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Issue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TYPE_OPERATION_COUNT = ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.jira.AssigneeType <em>Assignee Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.jira.AssigneeType
	 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAssigneeType()
	 * @generated
	 */
	int ASSIGNEE_TYPE = 37;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Jira <em>Jira</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jira</em>'.
	 * @see org.nasdanika.models.jira.Jira
	 * @generated
	 */
	EClass getJira();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Jira#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.nasdanika.models.jira.Jira#getUsers()
	 * @see #getJira()
	 * @generated
	 */
	EReference getJira_Users();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Jira#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see org.nasdanika.models.jira.Jira#getProjects()
	 * @see #getJira()
	 * @generated
	 */
	EReference getJira_Projects();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Jira#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see org.nasdanika.models.jira.Jira#getGroups()
	 * @see #getJira()
	 * @generated
	 */
	EReference getJira_Groups();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.nasdanika.models.jira.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.AddressableEntity <em>Addressable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressable Entity</em>'.
	 * @see org.nasdanika.models.jira.AddressableEntity
	 * @generated
	 */
	EClass getAddressableEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.AddressableEntity#getSelf <em>Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self</em>'.
	 * @see org.nasdanika.models.jira.AddressableEntity#getSelf()
	 * @see #getAddressableEntity()
	 * @generated
	 */
	EAttribute getAddressableEntity_Self();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see org.nasdanika.models.jira.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.jira.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.IdentifiableEntity <em>Identifiable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Entity</em>'.
	 * @see org.nasdanika.models.jira.IdentifiableEntity
	 * @generated
	 */
	EClass getIdentifiableEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.IdentifiableEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.jira.IdentifiableEntity#getId()
	 * @see #getIdentifiableEntity()
	 * @generated
	 */
	EAttribute getIdentifiableEntity_Id();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.AdressableNamedEntity <em>Adressable Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adressable Named Entity</em>'.
	 * @see org.nasdanika.models.jira.AdressableNamedEntity
	 * @generated
	 */
	EClass getAdressableNamedEntity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.AdressableNamedIdentifiableEntity <em>Adressable Named Identifiable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adressable Named Identifiable Entity</em>'.
	 * @see org.nasdanika.models.jira.AdressableNamedIdentifiableEntity
	 * @generated
	 */
	EClass getAdressableNamedIdentifiableEntity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.BasicIssue <em>Basic Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Issue</em>'.
	 * @see org.nasdanika.models.jira.BasicIssue
	 * @generated
	 */
	EClass getBasicIssue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.BasicIssue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.jira.BasicIssue#getKey()
	 * @see #getBasicIssue()
	 * @generated
	 */
	EAttribute getBasicIssue_Key();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.IssueReference <em>Issue Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Reference</em>'.
	 * @see org.nasdanika.models.jira.IssueReference
	 * @generated
	 */
	EClass getIssueReference();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Issue#getAffectedVersions <em>Affected Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Versions</em>'.
	 * @see org.nasdanika.models.jira.Issue#getAffectedVersions()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_AffectedVersions();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Issue#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.nasdanika.models.jira.Issue#getAssignee()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Assignee();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Issue#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachments</em>'.
	 * @see org.nasdanika.models.jira.Issue#getAttachments()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Attachments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Issue#getChangelog <em>Changelog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changelog</em>'.
	 * @see org.nasdanika.models.jira.Issue#getChangelog()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Changelog();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Issue#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.nasdanika.models.jira.Issue#getComments()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Comments();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Issue#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see org.nasdanika.models.jira.Issue#getComponents()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Components();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Issue#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.nasdanika.models.jira.Issue#getCreationDate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Issue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.jira.Issue#getDescription()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Issue#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.nasdanika.models.jira.Issue#getDueDate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_DueDate();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.jira.Issue#getExpandos <em>Expandos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expandos</em>'.
	 * @see org.nasdanika.models.jira.Issue#getExpandos()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Expandos();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.Issue#getFixVersions <em>Fix Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fix Versions</em>'.
	 * @see org.nasdanika.models.jira.Issue#getFixVersions()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_FixVersions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Issue#getIssueFields <em>Issue Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Fields</em>'.
	 * @see org.nasdanika.models.jira.Issue#getIssueFields()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_IssueFields();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Issue#getIssueLinks <em>Issue Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Links</em>'.
	 * @see org.nasdanika.models.jira.Issue#getIssueLinks()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_IssueLinks();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Issue#getIssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issue Type</em>'.
	 * @see org.nasdanika.models.jira.Issue#getIssueType()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_IssueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.jira.Issue#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.nasdanika.models.jira.Issue#getLabels()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Labels();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.jira.Issue#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations</em>'.
	 * @see org.nasdanika.models.jira.Issue#getOperations()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Operations();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.jira.Issue#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see org.nasdanika.models.jira.Issue#getPriority()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Priority();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Issue#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see org.nasdanika.models.jira.Issue#getProject()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Project();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Issue#getReporter <em>Reporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reporter</em>'.
	 * @see org.nasdanika.models.jira.Issue#getReporter()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Reporter();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.jira.Issue#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see org.nasdanika.models.jira.Issue#getResolution()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Resolution();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.jira.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.nasdanika.models.jira.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Issue#getSubtasks <em>Subtasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtasks</em>'.
	 * @see org.nasdanika.models.jira.Issue#getSubtasks()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Subtasks();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Issue#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.nasdanika.models.jira.Issue#getSummary()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Summary();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.jira.Issue#getTimeTracking <em>Time Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Tracking</em>'.
	 * @see org.nasdanika.models.jira.Issue#getTimeTracking()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_TimeTracking();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Issue#getTransitionsUri <em>Transitions Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitions Uri</em>'.
	 * @see org.nasdanika.models.jira.Issue#getTransitionsUri()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_TransitionsUri();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Issue#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.nasdanika.models.jira.Issue#getUpdateDate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_UpdateDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.jira.Issue#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Votes</em>'.
	 * @see org.nasdanika.models.jira.Issue#getVotes()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Votes();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.jira.Issue#getWatchers <em>Watchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Watchers</em>'.
	 * @see org.nasdanika.models.jira.Issue#getWatchers()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Watchers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Issue#getWorklogs <em>Worklogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worklogs</em>'.
	 * @see org.nasdanika.models.jira.Issue#getWorklogs()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Worklogs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.nasdanika.models.jira.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Version#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.jira.Version#getDescription()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Version#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.jira.Version#getId()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Version#isIsArchived <em>Is Archived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Archived</em>'.
	 * @see org.nasdanika.models.jira.Version#isIsArchived()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_IsArchived();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Version#isIsReleased <em>Is Released</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Released</em>'.
	 * @see org.nasdanika.models.jira.Version#isIsReleased()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_IsReleased();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Version#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see org.nasdanika.models.jira.Version#getReleaseDate()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_ReleaseDate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.BasicUser <em>Basic User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic User</em>'.
	 * @see org.nasdanika.models.jira.BasicUser
	 * @generated
	 */
	EClass getBasicUser();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.BasicUser#getAccountId <em>Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Id</em>'.
	 * @see org.nasdanika.models.jira.BasicUser#getAccountId()
	 * @see #getBasicUser()
	 * @generated
	 */
	EAttribute getBasicUser_AccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.BasicUser#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.nasdanika.models.jira.BasicUser#getDisplayName()
	 * @see #getBasicUser()
	 * @generated
	 */
	EAttribute getBasicUser_DisplayName();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.User#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.nasdanika.models.jira.User#isActive()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.User#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see org.nasdanika.models.jira.User#getEmailAddress()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_EmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.User#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timezone</em>'.
	 * @see org.nasdanika.models.jira.User#getTimezone()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Timezone();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.jira.User#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see org.nasdanika.models.jira.User#getGroups()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Groups();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see org.nasdanika.models.jira.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Attachment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.jira.Attachment#getAuthor()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Attachment#getContentUri <em>Content Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Uri</em>'.
	 * @see org.nasdanika.models.jira.Attachment#getContentUri()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_ContentUri();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Attachment#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.nasdanika.models.jira.Attachment#getCreationDate()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Attachment#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.nasdanika.models.jira.Attachment#getFilename()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_Filename();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Attachment#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.nasdanika.models.jira.Attachment#getMimeType()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Attachment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.jira.Attachment#getSize()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Attachment#getThumbnailUri <em>Thumbnail Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbnail Uri</em>'.
	 * @see org.nasdanika.models.jira.Attachment#getThumbnailUri()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_ThumbnailUri();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.ChangelogGroup <em>Changelog Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Changelog Group</em>'.
	 * @see org.nasdanika.models.jira.ChangelogGroup
	 * @generated
	 */
	EClass getChangelogGroup();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.ChangelogGroup#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.jira.ChangelogGroup#getAuthor()
	 * @see #getChangelogGroup()
	 * @generated
	 */
	EReference getChangelogGroup_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.ChangelogGroup#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.nasdanika.models.jira.ChangelogGroup#getCreated()
	 * @see #getChangelogGroup()
	 * @generated
	 */
	EAttribute getChangelogGroup_Created();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.ChangelogGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.models.jira.ChangelogGroup#getItems()
	 * @see #getChangelogGroup()
	 * @generated
	 */
	EReference getChangelogGroup_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.ChangelogItem <em>Changelog Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Changelog Item</em>'.
	 * @see org.nasdanika.models.jira.ChangelogItem
	 * @generated
	 */
	EClass getChangelogItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.ChangelogItem#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.nasdanika.models.jira.ChangelogItem#getField()
	 * @see #getChangelogItem()
	 * @generated
	 */
	EAttribute getChangelogItem_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.ChangelogItem#isCustom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom</em>'.
	 * @see org.nasdanika.models.jira.ChangelogItem#isCustom()
	 * @see #getChangelogItem()
	 * @generated
	 */
	EAttribute getChangelogItem_Custom();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.ChangelogItem#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.nasdanika.models.jira.ChangelogItem#getFrom()
	 * @see #getChangelogItem()
	 * @generated
	 */
	EAttribute getChangelogItem_From();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.ChangelogItem#getFromString <em>From String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From String</em>'.
	 * @see org.nasdanika.models.jira.ChangelogItem#getFromString()
	 * @see #getChangelogItem()
	 * @generated
	 */
	EAttribute getChangelogItem_FromString();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.ChangelogItem#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.nasdanika.models.jira.ChangelogItem#getTo()
	 * @see #getChangelogItem()
	 * @generated
	 */
	EAttribute getChangelogItem_To();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.ChangelogItem#getToString <em>To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To String</em>'.
	 * @see org.nasdanika.models.jira.ChangelogItem#getToString()
	 * @see #getChangelogItem()
	 * @generated
	 */
	EAttribute getChangelogItem_ToString();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.nasdanika.models.jira.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.jira.Comment#getAuthor()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.nasdanika.models.jira.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Comment#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.nasdanika.models.jira.Comment#getCreationDate()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Comment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.jira.Comment#getId()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Comment#getSelf <em>Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self</em>'.
	 * @see org.nasdanika.models.jira.Comment#getSelf()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Self();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Comment#getUpdateAuthor <em>Update Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update Author</em>'.
	 * @see org.nasdanika.models.jira.Comment#getUpdateAuthor()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_UpdateAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Comment#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.nasdanika.models.jira.Comment#getUpdateDate()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_UpdateDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.jira.Comment#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see org.nasdanika.models.jira.Comment#getVisibility()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Visibility();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility</em>'.
	 * @see org.nasdanika.models.jira.Visibility
	 * @generated
	 */
	EClass getVisibility();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Visibility#isGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see org.nasdanika.models.jira.Visibility#isGroup()
	 * @see #getVisibility()
	 * @generated
	 */
	EAttribute getVisibility_Group();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Visibility#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.jira.Visibility#getValue()
	 * @see #getVisibility()
	 * @generated
	 */
	EAttribute getVisibility_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.BasicComponent <em>Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Component</em>'.
	 * @see org.nasdanika.models.jira.BasicComponent
	 * @generated
	 */
	EClass getBasicComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.BasicComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.jira.BasicComponent#getDescription()
	 * @see #getBasicComponent()
	 * @generated
	 */
	EAttribute getBasicComponent_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.nasdanika.models.jira.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Component#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.nasdanika.models.jira.Component#getAssignee()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Component#getAssigneeType <em>Assignee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignee Type</em>'.
	 * @see org.nasdanika.models.jira.Component#getAssigneeType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_AssigneeType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Component#isIsAssigneeTypeValid <em>Is Assignee Type Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Assignee Type Valid</em>'.
	 * @see org.nasdanika.models.jira.Component#isIsAssigneeTypeValid()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IsAssigneeTypeValid();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Component#getRealAssignee <em>Real Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Real Assignee</em>'.
	 * @see org.nasdanika.models.jira.Component#getRealAssignee()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RealAssignee();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Component#getRealAssigneeType <em>Real Assignee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Assignee Type</em>'.
	 * @see org.nasdanika.models.jira.Component#getRealAssigneeType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_RealAssigneeType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.IssueField <em>Issue Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Field</em>'.
	 * @see org.nasdanika.models.jira.IssueField
	 * @generated
	 */
	EClass getIssueField();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.IssueField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.jira.IssueField#getType()
	 * @see #getIssueField()
	 * @generated
	 */
	EAttribute getIssueField_Type();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.IssueField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.nasdanika.models.jira.IssueField#getValue()
	 * @see #getIssueField()
	 * @generated
	 */
	EReference getIssueField_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.IssueLink <em>Issue Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Link</em>'.
	 * @see org.nasdanika.models.jira.IssueLink
	 * @generated
	 */
	EClass getIssueLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.IssueLink#isInbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inbound</em>'.
	 * @see org.nasdanika.models.jira.IssueLink#isInbound()
	 * @see #getIssueLink()
	 * @generated
	 */
	EAttribute getIssueLink_Inbound();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.IssueLink#getTargetIssueKey <em>Target Issue Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Issue Key</em>'.
	 * @see org.nasdanika.models.jira.IssueLink#getTargetIssueKey()
	 * @see #getIssueLink()
	 * @generated
	 */
	EAttribute getIssueLink_TargetIssueKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.IssueLink#getTargetIssueUri <em>Target Issue Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Issue Uri</em>'.
	 * @see org.nasdanika.models.jira.IssueLink#getTargetIssueUri()
	 * @see #getIssueLink()
	 * @generated
	 */
	EAttribute getIssueLink_TargetIssueUri();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations</em>'.
	 * @see org.nasdanika.models.jira.Operations
	 * @generated
	 */
	EClass getOperations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.BasicPriority <em>Basic Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Priority</em>'.
	 * @see org.nasdanika.models.jira.BasicPriority
	 * @generated
	 */
	EClass getBasicPriority();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.BasicProject <em>Basic Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Project</em>'.
	 * @see org.nasdanika.models.jira.BasicProject
	 * @generated
	 */
	EClass getBasicProject();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.BasicProject#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.jira.BasicProject#getKey()
	 * @see #getBasicProject()
	 * @generated
	 */
	EAttribute getBasicProject_Key();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.ProjectReference <em>Project Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Reference</em>'.
	 * @see org.nasdanika.models.jira.ProjectReference
	 * @generated
	 */
	EClass getProjectReference();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.nasdanika.models.jira.Project#getComponents()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Components();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.jira.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.jira.Project#getExpandos <em>Expandos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expandos</em>'.
	 * @see org.nasdanika.models.jira.Project#getExpandos()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Expandos();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getIssueTypes <em>Issue Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Types</em>'.
	 * @see org.nasdanika.models.jira.Project#getIssueTypes()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_IssueTypes();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Project#getLead <em>Lead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lead</em>'.
	 * @see org.nasdanika.models.jira.Project#getLead()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Lead();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getProjectRoles <em>Project Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Roles</em>'.
	 * @see org.nasdanika.models.jira.Project#getProjectRoles()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectRoles();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Project#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.nasdanika.models.jira.Project#getUri()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.nasdanika.models.jira.Project#getVersions()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Versions();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.jira.Project#getStatusCategories <em>Status Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status Categories</em>'.
	 * @see org.nasdanika.models.jira.Project#getStatusCategories()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_StatusCategories();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.BasicProjectRole <em>Basic Project Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Project Role</em>'.
	 * @see org.nasdanika.models.jira.BasicProjectRole
	 * @generated
	 */
	EClass getBasicProjectRole();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution</em>'.
	 * @see org.nasdanika.models.jira.Resolution
	 * @generated
	 */
	EClass getResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Resolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.jira.Resolution#getDescription()
	 * @see #getResolution()
	 * @generated
	 */
	EAttribute getResolution_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.nasdanika.models.jira.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Status#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.jira.Status#getDescription()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Status#getIconUrl <em>Icon Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Url</em>'.
	 * @see org.nasdanika.models.jira.Status#getIconUrl()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_IconUrl();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Status#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.nasdanika.models.jira.Status#getValue()
	 * @see #getStatus()
	 * @generated
	 */
	EReference getStatus_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.StatusCategory <em>Status Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Category</em>'.
	 * @see org.nasdanika.models.jira.StatusCategory
	 * @generated
	 */
	EClass getStatusCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.StatusCategory#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.jira.StatusCategory#getKey()
	 * @see #getStatusCategory()
	 * @generated
	 */
	EAttribute getStatusCategory_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.StatusCategory#getColorName <em>Color Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Name</em>'.
	 * @see org.nasdanika.models.jira.StatusCategory#getColorName()
	 * @see #getStatusCategory()
	 * @generated
	 */
	EAttribute getStatusCategory_ColorName();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Subtask#getIssueKey <em>Issue Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Key</em>'.
	 * @see org.nasdanika.models.jira.Subtask#getIssueKey()
	 * @see #getSubtask()
	 * @generated
	 */
	EAttribute getSubtask_IssueKey();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Subtask#getIssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issue Type</em>'.
	 * @see org.nasdanika.models.jira.Subtask#getIssueType()
	 * @see #getSubtask()
	 * @generated
	 */
	EReference getSubtask_IssueType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Subtask#getIssueUri <em>Issue Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Uri</em>'.
	 * @see org.nasdanika.models.jira.Subtask#getIssueUri()
	 * @see #getSubtask()
	 * @generated
	 */
	EAttribute getSubtask_IssueUri();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Subtask#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.nasdanika.models.jira.Subtask#getStatus()
	 * @see #getSubtask()
	 * @generated
	 */
	EReference getSubtask_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Subtask#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.nasdanika.models.jira.Subtask#getSummary()
	 * @see #getSubtask()
	 * @generated
	 */
	EAttribute getSubtask_Summary();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.TimeTracking <em>Time Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Tracking</em>'.
	 * @see org.nasdanika.models.jira.TimeTracking
	 * @generated
	 */
	EClass getTimeTracking();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.TimeTracking#getOriginalEstimateMinutes <em>Original Estimate Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Estimate Minutes</em>'.
	 * @see org.nasdanika.models.jira.TimeTracking#getOriginalEstimateMinutes()
	 * @see #getTimeTracking()
	 * @generated
	 */
	EAttribute getTimeTracking_OriginalEstimateMinutes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.TimeTracking#getRemainingEstimateMinutes <em>Remaining Estimate Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Estimate Minutes</em>'.
	 * @see org.nasdanika.models.jira.TimeTracking#getRemainingEstimateMinutes()
	 * @see #getTimeTracking()
	 * @generated
	 */
	EAttribute getTimeTracking_RemainingEstimateMinutes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.TimeTracking#getTimeSpentMinutes <em>Time Spent Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Spent Minutes</em>'.
	 * @see org.nasdanika.models.jira.TimeTracking#getTimeSpentMinutes()
	 * @see #getTimeTracking()
	 * @generated
	 */
	EAttribute getTimeTracking_TimeSpentMinutes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.BasicVotes <em>Basic Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Votes</em>'.
	 * @see org.nasdanika.models.jira.BasicVotes
	 * @generated
	 */
	EClass getBasicVotes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.BasicVotes#isHasVoted <em>Has Voted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Voted</em>'.
	 * @see org.nasdanika.models.jira.BasicVotes#isHasVoted()
	 * @see #getBasicVotes()
	 * @generated
	 */
	EAttribute getBasicVotes_HasVoted();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.BasicVotes#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Votes</em>'.
	 * @see org.nasdanika.models.jira.BasicVotes#getVotes()
	 * @see #getBasicVotes()
	 * @generated
	 */
	EAttribute getBasicVotes_Votes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.BasicWatchers <em>Basic Watchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Watchers</em>'.
	 * @see org.nasdanika.models.jira.BasicWatchers
	 * @generated
	 */
	EClass getBasicWatchers();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.BasicWatchers#isIsWatching <em>Is Watching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Watching</em>'.
	 * @see org.nasdanika.models.jira.BasicWatchers#isIsWatching()
	 * @see #getBasicWatchers()
	 * @generated
	 */
	EAttribute getBasicWatchers_IsWatching();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.BasicWatchers#getNumWatchers <em>Num Watchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Watchers</em>'.
	 * @see org.nasdanika.models.jira.BasicWatchers#getNumWatchers()
	 * @see #getBasicWatchers()
	 * @generated
	 */
	EAttribute getBasicWatchers_NumWatchers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.Worklog <em>Worklog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worklog</em>'.
	 * @see org.nasdanika.models.jira.Worklog
	 * @generated
	 */
	EClass getWorklog();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Worklog#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.jira.Worklog#getAuthor()
	 * @see #getWorklog()
	 * @generated
	 */
	EReference getWorklog_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Worklog#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.models.jira.Worklog#getComment()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Worklog#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.nasdanika.models.jira.Worklog#getCreationDate()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Worklog#getIssueUri <em>Issue Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Uri</em>'.
	 * @see org.nasdanika.models.jira.Worklog#getIssueUri()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_IssueUri();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Worklog#getMinutesSpent <em>Minutes Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes Spent</em>'.
	 * @see org.nasdanika.models.jira.Worklog#getMinutesSpent()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_MinutesSpent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Worklog#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.models.jira.Worklog#getStartDate()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_StartDate();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Worklog#getUpdateAuthor <em>Update Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update Author</em>'.
	 * @see org.nasdanika.models.jira.Worklog#getUpdateAuthor()
	 * @see #getWorklog()
	 * @generated
	 */
	EReference getWorklog_UpdateAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.Worklog#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see org.nasdanika.models.jira.Worklog#getUpdateDate()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_UpdateDate();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.jira.Worklog#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visibility</em>'.
	 * @see org.nasdanika.models.jira.Worklog#getVisibility()
	 * @see #getWorklog()
	 * @generated
	 */
	EReference getWorklog_Visibility();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.jira.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Type</em>'.
	 * @see org.nasdanika.models.jira.IssueType
	 * @generated
	 */
	EClass getIssueType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.IssueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.jira.IssueType#getDescription()
	 * @see #getIssueType()
	 * @generated
	 */
	EAttribute getIssueType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.IssueType#getIconUri <em>Icon Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Uri</em>'.
	 * @see org.nasdanika.models.jira.IssueType#getIconUri()
	 * @see #getIssueType()
	 * @generated
	 */
	EAttribute getIssueType_IconUri();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.jira.IssueType#isIsSubtask <em>Is Subtask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Subtask</em>'.
	 * @see org.nasdanika.models.jira.IssueType#isIsSubtask()
	 * @see #getIssueType()
	 * @generated
	 */
	EAttribute getIssueType_IsSubtask();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.jira.AssigneeType <em>Assignee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assignee Type</em>'.
	 * @see org.nasdanika.models.jira.AssigneeType
	 * @generated
	 */
	EEnum getAssigneeType();

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
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.JiraImpl <em>Jira</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.JiraImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getJira()
		 * @generated
		 */
		EClass JIRA = eINSTANCE.getJira();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA__USERS = eINSTANCE.getJira_Users();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA__PROJECTS = eINSTANCE.getJira_Projects();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA__GROUPS = eINSTANCE.getJira_Groups();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.GroupImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.AddressableEntityImpl <em>Addressable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.AddressableEntityImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAddressableEntity()
		 * @generated
		 */
		EClass ADDRESSABLE_ENTITY = eINSTANCE.getAddressableEntity();

		/**
		 * The meta object literal for the '<em><b>Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESSABLE_ENTITY__SELF = eINSTANCE.getAddressableEntity_Self();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.NamedEntityImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.IdentifiableEntityImpl <em>Identifiable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.IdentifiableEntityImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIdentifiableEntity()
		 * @generated
		 */
		EClass IDENTIFIABLE_ENTITY = eINSTANCE.getIdentifiableEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ENTITY__ID = eINSTANCE.getIdentifiableEntity_Id();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.AdressableNamedEntityImpl <em>Adressable Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.AdressableNamedEntityImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAdressableNamedEntity()
		 * @generated
		 */
		EClass ADRESSABLE_NAMED_ENTITY = eINSTANCE.getAdressableNamedEntity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.AdressableNamedIdentifiableEntityImpl <em>Adressable Named Identifiable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.AdressableNamedIdentifiableEntityImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAdressableNamedIdentifiableEntity()
		 * @generated
		 */
		EClass ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY = eINSTANCE.getAdressableNamedIdentifiableEntity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.BasicIssueImpl <em>Basic Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.BasicIssueImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicIssue()
		 * @generated
		 */
		EClass BASIC_ISSUE = eINSTANCE.getBasicIssue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ISSUE__KEY = eINSTANCE.getBasicIssue_Key();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.IssueReferenceImpl <em>Issue Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.IssueReferenceImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueReference()
		 * @generated
		 */
		EClass ISSUE_REFERENCE = eINSTANCE.getIssueReference();

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
		 * The meta object literal for the '<em><b>Affected Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__AFFECTED_VERSIONS = eINSTANCE.getIssue_AffectedVersions();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ASSIGNEE = eINSTANCE.getIssue_Assignee();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ATTACHMENTS = eINSTANCE.getIssue_Attachments();

		/**
		 * The meta object literal for the '<em><b>Changelog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CHANGELOG = eINSTANCE.getIssue_Changelog();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__COMMENTS = eINSTANCE.getIssue_Comments();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__COMPONENTS = eINSTANCE.getIssue_Components();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__CREATION_DATE = eINSTANCE.getIssue_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DESCRIPTION = eINSTANCE.getIssue_Description();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DUE_DATE = eINSTANCE.getIssue_DueDate();

		/**
		 * The meta object literal for the '<em><b>Expandos</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__EXPANDOS = eINSTANCE.getIssue_Expandos();

		/**
		 * The meta object literal for the '<em><b>Fix Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__FIX_VERSIONS = eINSTANCE.getIssue_FixVersions();

		/**
		 * The meta object literal for the '<em><b>Issue Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ISSUE_FIELDS = eINSTANCE.getIssue_IssueFields();

		/**
		 * The meta object literal for the '<em><b>Issue Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ISSUE_LINKS = eINSTANCE.getIssue_IssueLinks();

		/**
		 * The meta object literal for the '<em><b>Issue Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ISSUE_TYPE = eINSTANCE.getIssue_IssueType();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__LABELS = eINSTANCE.getIssue_Labels();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__OPERATIONS = eINSTANCE.getIssue_Operations();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__PRIORITY = eINSTANCE.getIssue_Priority();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__PROJECT = eINSTANCE.getIssue_Project();

		/**
		 * The meta object literal for the '<em><b>Reporter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__REPORTER = eINSTANCE.getIssue_Reporter();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__RESOLUTION = eINSTANCE.getIssue_Resolution();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '<em><b>Subtasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__SUBTASKS = eINSTANCE.getIssue_Subtasks();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SUMMARY = eINSTANCE.getIssue_Summary();

		/**
		 * The meta object literal for the '<em><b>Time Tracking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__TIME_TRACKING = eINSTANCE.getIssue_TimeTracking();

		/**
		 * The meta object literal for the '<em><b>Transitions Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__TRANSITIONS_URI = eINSTANCE.getIssue_TransitionsUri();

		/**
		 * The meta object literal for the '<em><b>Update Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__UPDATE_DATE = eINSTANCE.getIssue_UpdateDate();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__VOTES = eINSTANCE.getIssue_Votes();

		/**
		 * The meta object literal for the '<em><b>Watchers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__WATCHERS = eINSTANCE.getIssue_Watchers();

		/**
		 * The meta object literal for the '<em><b>Worklogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__WORKLOGS = eINSTANCE.getIssue_Worklogs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.VersionImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__DESCRIPTION = eINSTANCE.getVersion_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__ID = eINSTANCE.getVersion_Id();

		/**
		 * The meta object literal for the '<em><b>Is Archived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__IS_ARCHIVED = eINSTANCE.getVersion_IsArchived();

		/**
		 * The meta object literal for the '<em><b>Is Released</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__IS_RELEASED = eINSTANCE.getVersion_IsReleased();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__RELEASE_DATE = eINSTANCE.getVersion_ReleaseDate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.BasicUserImpl <em>Basic User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.BasicUserImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicUser()
		 * @generated
		 */
		EClass BASIC_USER = eINSTANCE.getBasicUser();

		/**
		 * The meta object literal for the '<em><b>Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_USER__ACCOUNT_ID = eINSTANCE.getBasicUser_AccountId();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_USER__DISPLAY_NAME = eINSTANCE.getBasicUser_DisplayName();

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
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ACTIVE = eINSTANCE.getUser_Active();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL_ADDRESS = eINSTANCE.getUser_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__TIMEZONE = eINSTANCE.getUser_Timezone();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__GROUPS = eINSTANCE.getUser_Groups();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.AttachmentImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__AUTHOR = eINSTANCE.getAttachment_Author();

		/**
		 * The meta object literal for the '<em><b>Content Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__CONTENT_URI = eINSTANCE.getAttachment_ContentUri();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__CREATION_DATE = eINSTANCE.getAttachment_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__FILENAME = eINSTANCE.getAttachment_Filename();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__MIME_TYPE = eINSTANCE.getAttachment_MimeType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__SIZE = eINSTANCE.getAttachment_Size();

		/**
		 * The meta object literal for the '<em><b>Thumbnail Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__THUMBNAIL_URI = eINSTANCE.getAttachment_ThumbnailUri();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.ChangelogGroupImpl <em>Changelog Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.ChangelogGroupImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getChangelogGroup()
		 * @generated
		 */
		EClass CHANGELOG_GROUP = eINSTANCE.getChangelogGroup();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGELOG_GROUP__AUTHOR = eINSTANCE.getChangelogGroup_Author();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGELOG_GROUP__CREATED = eINSTANCE.getChangelogGroup_Created();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGELOG_GROUP__ITEMS = eINSTANCE.getChangelogGroup_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.ChangelogItemImpl <em>Changelog Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.ChangelogItemImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getChangelogItem()
		 * @generated
		 */
		EClass CHANGELOG_ITEM = eINSTANCE.getChangelogItem();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGELOG_ITEM__FIELD = eINSTANCE.getChangelogItem_Field();

		/**
		 * The meta object literal for the '<em><b>Custom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGELOG_ITEM__CUSTOM = eINSTANCE.getChangelogItem_Custom();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGELOG_ITEM__FROM = eINSTANCE.getChangelogItem_From();

		/**
		 * The meta object literal for the '<em><b>From String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGELOG_ITEM__FROM_STRING = eINSTANCE.getChangelogItem_FromString();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGELOG_ITEM__TO = eINSTANCE.getChangelogItem_To();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGELOG_ITEM__TO_STRING = eINSTANCE.getChangelogItem_ToString();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.CommentImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__AUTHOR = eINSTANCE.getComment_Author();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CREATION_DATE = eINSTANCE.getComment_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__ID = eINSTANCE.getComment_Id();

		/**
		 * The meta object literal for the '<em><b>Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__SELF = eINSTANCE.getComment_Self();

		/**
		 * The meta object literal for the '<em><b>Update Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__UPDATE_AUTHOR = eINSTANCE.getComment_UpdateAuthor();

		/**
		 * The meta object literal for the '<em><b>Update Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__UPDATE_DATE = eINSTANCE.getComment_UpdateDate();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__VISIBILITY = eINSTANCE.getComment_Visibility();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.VisibilityImpl <em>Visibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.VisibilityImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getVisibility()
		 * @generated
		 */
		EClass VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY__GROUP = eINSTANCE.getVisibility_Group();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY__VALUE = eINSTANCE.getVisibility_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.BasicComponentImpl <em>Basic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.BasicComponentImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicComponent()
		 * @generated
		 */
		EClass BASIC_COMPONENT = eINSTANCE.getBasicComponent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_COMPONENT__DESCRIPTION = eINSTANCE.getBasicComponent_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.ComponentImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ASSIGNEE = eINSTANCE.getComponent_Assignee();

		/**
		 * The meta object literal for the '<em><b>Assignee Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ASSIGNEE_TYPE = eINSTANCE.getComponent_AssigneeType();

		/**
		 * The meta object literal for the '<em><b>Is Assignee Type Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__IS_ASSIGNEE_TYPE_VALID = eINSTANCE.getComponent_IsAssigneeTypeValid();

		/**
		 * The meta object literal for the '<em><b>Real Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REAL_ASSIGNEE = eINSTANCE.getComponent_RealAssignee();

		/**
		 * The meta object literal for the '<em><b>Real Assignee Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__REAL_ASSIGNEE_TYPE = eINSTANCE.getComponent_RealAssigneeType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.IssueFieldImpl <em>Issue Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.IssueFieldImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueField()
		 * @generated
		 */
		EClass ISSUE_FIELD = eINSTANCE.getIssueField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_FIELD__TYPE = eINSTANCE.getIssueField_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_FIELD__VALUE = eINSTANCE.getIssueField_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.IssueLinkImpl <em>Issue Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.IssueLinkImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueLink()
		 * @generated
		 */
		EClass ISSUE_LINK = eINSTANCE.getIssueLink();

		/**
		 * The meta object literal for the '<em><b>Inbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_LINK__INBOUND = eINSTANCE.getIssueLink_Inbound();

		/**
		 * The meta object literal for the '<em><b>Target Issue Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_LINK__TARGET_ISSUE_KEY = eINSTANCE.getIssueLink_TargetIssueKey();

		/**
		 * The meta object literal for the '<em><b>Target Issue Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_LINK__TARGET_ISSUE_URI = eINSTANCE.getIssueLink_TargetIssueUri();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.OperationsImpl <em>Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.OperationsImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getOperations()
		 * @generated
		 */
		EClass OPERATIONS = eINSTANCE.getOperations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.BasicPriorityImpl <em>Basic Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.BasicPriorityImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicPriority()
		 * @generated
		 */
		EClass BASIC_PRIORITY = eINSTANCE.getBasicPriority();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.BasicProjectImpl <em>Basic Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.BasicProjectImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicProject()
		 * @generated
		 */
		EClass BASIC_PROJECT = eINSTANCE.getBasicProject();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_PROJECT__KEY = eINSTANCE.getBasicProject_Key();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.ProjectReferenceImpl <em>Project Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.ProjectReferenceImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getProjectReference()
		 * @generated
		 */
		EClass PROJECT_REFERENCE = eINSTANCE.getProjectReference();

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
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__COMPONENTS = eINSTANCE.getProject_Components();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Expandos</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__EXPANDOS = eINSTANCE.getProject_Expandos();

		/**
		 * The meta object literal for the '<em><b>Issue Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ISSUE_TYPES = eINSTANCE.getProject_IssueTypes();

		/**
		 * The meta object literal for the '<em><b>Lead</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__LEAD = eINSTANCE.getProject_Lead();

		/**
		 * The meta object literal for the '<em><b>Project Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_ROLES = eINSTANCE.getProject_ProjectRoles();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__URI = eINSTANCE.getProject_Uri();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__VERSIONS = eINSTANCE.getProject_Versions();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ISSUES = eINSTANCE.getProject_Issues();

		/**
		 * The meta object literal for the '<em><b>Status Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__STATUS_CATEGORIES = eINSTANCE.getProject_StatusCategories();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.BasicProjectRoleImpl <em>Basic Project Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.BasicProjectRoleImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicProjectRole()
		 * @generated
		 */
		EClass BASIC_PROJECT_ROLE = eINSTANCE.getBasicProjectRole();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.ResolutionImpl <em>Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.ResolutionImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getResolution()
		 * @generated
		 */
		EClass RESOLUTION = eINSTANCE.getResolution();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLUTION__DESCRIPTION = eINSTANCE.getResolution_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.StatusImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__DESCRIPTION = eINSTANCE.getStatus_Description();

		/**
		 * The meta object literal for the '<em><b>Icon Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__ICON_URL = eINSTANCE.getStatus_IconUrl();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS__VALUE = eINSTANCE.getStatus_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.StatusCategoryImpl <em>Status Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.StatusCategoryImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getStatusCategory()
		 * @generated
		 */
		EClass STATUS_CATEGORY = eINSTANCE.getStatusCategory();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_CATEGORY__KEY = eINSTANCE.getStatusCategory_Key();

		/**
		 * The meta object literal for the '<em><b>Color Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_CATEGORY__COLOR_NAME = eINSTANCE.getStatusCategory_ColorName();

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
		 * The meta object literal for the '<em><b>Issue Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTASK__ISSUE_KEY = eINSTANCE.getSubtask_IssueKey();

		/**
		 * The meta object literal for the '<em><b>Issue Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTASK__ISSUE_TYPE = eINSTANCE.getSubtask_IssueType();

		/**
		 * The meta object literal for the '<em><b>Issue Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTASK__ISSUE_URI = eINSTANCE.getSubtask_IssueUri();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTASK__STATUS = eINSTANCE.getSubtask_Status();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTASK__SUMMARY = eINSTANCE.getSubtask_Summary();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.TimeTrackingImpl <em>Time Tracking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.TimeTrackingImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getTimeTracking()
		 * @generated
		 */
		EClass TIME_TRACKING = eINSTANCE.getTimeTracking();

		/**
		 * The meta object literal for the '<em><b>Original Estimate Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES = eINSTANCE.getTimeTracking_OriginalEstimateMinutes();

		/**
		 * The meta object literal for the '<em><b>Remaining Estimate Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TRACKING__REMAINING_ESTIMATE_MINUTES = eINSTANCE.getTimeTracking_RemainingEstimateMinutes();

		/**
		 * The meta object literal for the '<em><b>Time Spent Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TRACKING__TIME_SPENT_MINUTES = eINSTANCE.getTimeTracking_TimeSpentMinutes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.BasicVotesImpl <em>Basic Votes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.BasicVotesImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicVotes()
		 * @generated
		 */
		EClass BASIC_VOTES = eINSTANCE.getBasicVotes();

		/**
		 * The meta object literal for the '<em><b>Has Voted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_VOTES__HAS_VOTED = eINSTANCE.getBasicVotes_HasVoted();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_VOTES__VOTES = eINSTANCE.getBasicVotes_Votes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.BasicWatchersImpl <em>Basic Watchers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.BasicWatchersImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getBasicWatchers()
		 * @generated
		 */
		EClass BASIC_WATCHERS = eINSTANCE.getBasicWatchers();

		/**
		 * The meta object literal for the '<em><b>Is Watching</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_WATCHERS__IS_WATCHING = eINSTANCE.getBasicWatchers_IsWatching();

		/**
		 * The meta object literal for the '<em><b>Num Watchers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_WATCHERS__NUM_WATCHERS = eINSTANCE.getBasicWatchers_NumWatchers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.WorklogImpl <em>Worklog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.WorklogImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getWorklog()
		 * @generated
		 */
		EClass WORKLOG = eINSTANCE.getWorklog();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOG__AUTHOR = eINSTANCE.getWorklog_Author();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__COMMENT = eINSTANCE.getWorklog_Comment();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__CREATION_DATE = eINSTANCE.getWorklog_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Issue Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__ISSUE_URI = eINSTANCE.getWorklog_IssueUri();

		/**
		 * The meta object literal for the '<em><b>Minutes Spent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__MINUTES_SPENT = eINSTANCE.getWorklog_MinutesSpent();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__START_DATE = eINSTANCE.getWorklog_StartDate();

		/**
		 * The meta object literal for the '<em><b>Update Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOG__UPDATE_AUTHOR = eINSTANCE.getWorklog_UpdateAuthor();

		/**
		 * The meta object literal for the '<em><b>Update Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__UPDATE_DATE = eINSTANCE.getWorklog_UpdateDate();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOG__VISIBILITY = eINSTANCE.getWorklog_Visibility();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.impl.IssueTypeImpl <em>Issue Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.impl.IssueTypeImpl
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getIssueType()
		 * @generated
		 */
		EClass ISSUE_TYPE = eINSTANCE.getIssueType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_TYPE__DESCRIPTION = eINSTANCE.getIssueType_Description();

		/**
		 * The meta object literal for the '<em><b>Icon Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_TYPE__ICON_URI = eINSTANCE.getIssueType_IconUri();

		/**
		 * The meta object literal for the '<em><b>Is Subtask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_TYPE__IS_SUBTASK = eINSTANCE.getIssueType_IsSubtask();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.jira.AssigneeType <em>Assignee Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.jira.AssigneeType
		 * @see org.nasdanika.models.jira.impl.JiraPackageImpl#getAssigneeType()
		 * @generated
		 */
		EEnum ASSIGNEE_TYPE = eINSTANCE.getAssigneeType();

	}

} //JiraPackage
