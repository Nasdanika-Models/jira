/**
 */
package org.nasdanika.models.jira.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.jira.*;

import org.nasdanika.ncore.Reference;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.jira.JiraPackage
 * @generated
 */
public class JiraSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JiraPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraSwitch() {
		if (modelPackage == null) {
			modelPackage = JiraPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JiraPackage.JIRA: {
				Jira jira = (Jira)theEObject;
				T1 result = caseJira(jira);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.ADDRESSABLE_ENTITY: {
				AddressableEntity addressableEntity = (AddressableEntity)theEObject;
				T1 result = caseAddressableEntity(addressableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.NAMED_ENTITY: {
				NamedEntity namedEntity = (NamedEntity)theEObject;
				T1 result = caseNamedEntity(namedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.IDENTIFIABLE_ENTITY: {
				IdentifiableEntity<?> identifiableEntity = (IdentifiableEntity<?>)theEObject;
				T1 result = caseIdentifiableEntity(identifiableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.ADRESSABLE_NAMED_ENTITY: {
				AdressableNamedEntity adressableNamedEntity = (AdressableNamedEntity)theEObject;
				T1 result = caseAdressableNamedEntity(adressableNamedEntity);
				if (result == null) result = caseAddressableEntity(adressableNamedEntity);
				if (result == null) result = caseNamedEntity(adressableNamedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY: {
				AdressableNamedIdentifiableEntity<?> adressableNamedIdentifiableEntity = (AdressableNamedIdentifiableEntity<?>)theEObject;
				T1 result = caseAdressableNamedIdentifiableEntity(adressableNamedIdentifiableEntity);
				if (result == null) result = caseAdressableNamedEntity(adressableNamedIdentifiableEntity);
				if (result == null) result = caseIdentifiableEntity(adressableNamedIdentifiableEntity);
				if (result == null) result = caseAddressableEntity(adressableNamedIdentifiableEntity);
				if (result == null) result = caseNamedEntity(adressableNamedIdentifiableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.BASIC_ISSUE: {
				BasicIssue basicIssue = (BasicIssue)theEObject;
				T1 result = caseBasicIssue(basicIssue);
				if (result == null) result = caseAddressableEntity(basicIssue);
				if (result == null) result = caseIdentifiableEntity(basicIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.ISSUE_REFERENCE: {
				IssueReference issueReference = (IssueReference)theEObject;
				T1 result = caseIssueReference(issueReference);
				if (result == null) result = caseBasicIssue(issueReference);
				if (result == null) result = caseReference(issueReference);
				if (result == null) result = caseAddressableEntity(issueReference);
				if (result == null) result = caseIdentifiableEntity(issueReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.ISSUE: {
				Issue issue = (Issue)theEObject;
				T1 result = caseIssue(issue);
				if (result == null) result = caseBasicIssue(issue);
				if (result == null) result = caseAddressableEntity(issue);
				if (result == null) result = caseIdentifiableEntity(issue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.VERSION: {
				Version version = (Version)theEObject;
				T1 result = caseVersion(version);
				if (result == null) result = caseAdressableNamedEntity(version);
				if (result == null) result = caseAddressableEntity(version);
				if (result == null) result = caseNamedEntity(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.BASIC_USER: {
				BasicUser basicUser = (BasicUser)theEObject;
				T1 result = caseBasicUser(basicUser);
				if (result == null) result = caseAdressableNamedEntity(basicUser);
				if (result == null) result = caseAddressableEntity(basicUser);
				if (result == null) result = caseNamedEntity(basicUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.USER: {
				User user = (User)theEObject;
				T1 result = caseUser(user);
				if (result == null) result = caseBasicUser(user);
				if (result == null) result = caseAdressableNamedEntity(user);
				if (result == null) result = caseAddressableEntity(user);
				if (result == null) result = caseNamedEntity(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T1 result = caseAttachment(attachment);
				if (result == null) result = caseAddressableEntity(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.CHANGELOG_GROUP: {
				ChangelogGroup changelogGroup = (ChangelogGroup)theEObject;
				T1 result = caseChangelogGroup(changelogGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.CHANGELOG_ITEM: {
				ChangelogItem changelogItem = (ChangelogItem)theEObject;
				T1 result = caseChangelogItem(changelogItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T1 result = caseComment(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.VISIBILITY: {
				Visibility visibility = (Visibility)theEObject;
				T1 result = caseVisibility(visibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.BASIC_COMPONENT: {
				BasicComponent basicComponent = (BasicComponent)theEObject;
				T1 result = caseBasicComponent(basicComponent);
				if (result == null) result = caseAdressableNamedIdentifiableEntity(basicComponent);
				if (result == null) result = caseAdressableNamedEntity(basicComponent);
				if (result == null) result = caseIdentifiableEntity(basicComponent);
				if (result == null) result = caseAddressableEntity(basicComponent);
				if (result == null) result = caseNamedEntity(basicComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.ISSUE_FIELD: {
				IssueField issueField = (IssueField)theEObject;
				T1 result = caseIssueField(issueField);
				if (result == null) result = caseNamedEntity(issueField);
				if (result == null) result = caseIdentifiableEntity(issueField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.ISSUE_LINK: {
				IssueLink issueLink = (IssueLink)theEObject;
				T1 result = caseIssueLink(issueLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.OPERATIONS: {
				Operations operations = (Operations)theEObject;
				T1 result = caseOperations(operations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.BASIC_PRIORITY: {
				BasicPriority basicPriority = (BasicPriority)theEObject;
				T1 result = caseBasicPriority(basicPriority);
				if (result == null) result = caseAdressableNamedIdentifiableEntity(basicPriority);
				if (result == null) result = caseAdressableNamedEntity(basicPriority);
				if (result == null) result = caseIdentifiableEntity(basicPriority);
				if (result == null) result = caseAddressableEntity(basicPriority);
				if (result == null) result = caseNamedEntity(basicPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.BASIC_PROJECT: {
				BasicProject basicProject = (BasicProject)theEObject;
				T1 result = caseBasicProject(basicProject);
				if (result == null) result = caseAdressableNamedIdentifiableEntity(basicProject);
				if (result == null) result = caseAdressableNamedEntity(basicProject);
				if (result == null) result = caseIdentifiableEntity(basicProject);
				if (result == null) result = caseAddressableEntity(basicProject);
				if (result == null) result = caseNamedEntity(basicProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.PROJECT_REFERENCE: {
				ProjectReference projectReference = (ProjectReference)theEObject;
				T1 result = caseProjectReference(projectReference);
				if (result == null) result = caseBasicProject(projectReference);
				if (result == null) result = caseReference(projectReference);
				if (result == null) result = caseAdressableNamedIdentifiableEntity(projectReference);
				if (result == null) result = caseAdressableNamedEntity(projectReference);
				if (result == null) result = caseIdentifiableEntity(projectReference);
				if (result == null) result = caseAddressableEntity(projectReference);
				if (result == null) result = caseNamedEntity(projectReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.PROJECT: {
				Project project = (Project)theEObject;
				T1 result = caseProject(project);
				if (result == null) result = caseBasicProject(project);
				if (result == null) result = caseAdressableNamedIdentifiableEntity(project);
				if (result == null) result = caseAdressableNamedEntity(project);
				if (result == null) result = caseIdentifiableEntity(project);
				if (result == null) result = caseAddressableEntity(project);
				if (result == null) result = caseNamedEntity(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.BASIC_PROJECT_ROLE: {
				BasicProjectRole basicProjectRole = (BasicProjectRole)theEObject;
				T1 result = caseBasicProjectRole(basicProjectRole);
				if (result == null) result = caseAdressableNamedEntity(basicProjectRole);
				if (result == null) result = caseAddressableEntity(basicProjectRole);
				if (result == null) result = caseNamedEntity(basicProjectRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.RESOLUTION: {
				Resolution resolution = (Resolution)theEObject;
				T1 result = caseResolution(resolution);
				if (result == null) result = caseAdressableNamedIdentifiableEntity(resolution);
				if (result == null) result = caseAdressableNamedEntity(resolution);
				if (result == null) result = caseIdentifiableEntity(resolution);
				if (result == null) result = caseAddressableEntity(resolution);
				if (result == null) result = caseNamedEntity(resolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.STATUS: {
				Status status = (Status)theEObject;
				T1 result = caseStatus(status);
				if (result == null) result = caseAdressableNamedIdentifiableEntity(status);
				if (result == null) result = caseAdressableNamedEntity(status);
				if (result == null) result = caseIdentifiableEntity(status);
				if (result == null) result = caseAddressableEntity(status);
				if (result == null) result = caseNamedEntity(status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.STATUS_CATEGORY: {
				StatusCategory statusCategory = (StatusCategory)theEObject;
				T1 result = caseStatusCategory(statusCategory);
				if (result == null) result = caseAdressableNamedIdentifiableEntity(statusCategory);
				if (result == null) result = caseAdressableNamedEntity(statusCategory);
				if (result == null) result = caseIdentifiableEntity(statusCategory);
				if (result == null) result = caseAddressableEntity(statusCategory);
				if (result == null) result = caseNamedEntity(statusCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.SUBTASK: {
				Subtask subtask = (Subtask)theEObject;
				T1 result = caseSubtask(subtask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.TIME_TRACKING: {
				TimeTracking timeTracking = (TimeTracking)theEObject;
				T1 result = caseTimeTracking(timeTracking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.BASIC_VOTES: {
				BasicVotes basicVotes = (BasicVotes)theEObject;
				T1 result = caseBasicVotes(basicVotes);
				if (result == null) result = caseAddressableEntity(basicVotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.BASIC_WATCHERS: {
				BasicWatchers basicWatchers = (BasicWatchers)theEObject;
				T1 result = caseBasicWatchers(basicWatchers);
				if (result == null) result = caseAddressableEntity(basicWatchers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.WORKLOG: {
				Worklog worklog = (Worklog)theEObject;
				T1 result = caseWorklog(worklog);
				if (result == null) result = caseAddressableEntity(worklog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraPackage.ISSUE_TYPE: {
				IssueType issueType = (IssueType)theEObject;
				T1 result = caseIssueType(issueType);
				if (result == null) result = caseAdressableNamedIdentifiableEntity(issueType);
				if (result == null) result = caseAdressableNamedEntity(issueType);
				if (result == null) result = caseIdentifiableEntity(issueType);
				if (result == null) result = caseAddressableEntity(issueType);
				if (result == null) result = caseNamedEntity(issueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jira</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jira</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJira(Jira object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAddressableEntity(AddressableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseIdentifiableEntity(IdentifiableEntity<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adressable Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adressable Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAdressableNamedEntity(AdressableNamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adressable Named Identifiable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adressable Named Identifiable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseAdressableNamedIdentifiableEntity(AdressableNamedIdentifiableEntity<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicIssue(BasicIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIssueReference(IssueReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIssue(Issue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicUser(BasicUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changelog Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changelog Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangelogGroup(ChangelogGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changelog Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changelog Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangelogItem(ChangelogItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVisibility(Visibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicComponent(BasicComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIssueField(IssueField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIssueLink(IssueLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOperations(Operations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicPriority(BasicPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicProject(BasicProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProjectReference(ProjectReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Project Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Project Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicProjectRole(BasicProjectRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResolution(Resolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStatus(Status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStatusCategory(StatusCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSubtask(Subtask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Tracking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Tracking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTimeTracking(TimeTracking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Votes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Votes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicVotes(BasicVotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Watchers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Watchers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicWatchers(BasicWatchers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worklog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worklog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWorklog(Worklog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIssueType(IssueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseReference(Reference<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //JiraSwitch
