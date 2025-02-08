/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.jira.Attachment;
import org.nasdanika.models.jira.BasicComponent;
import org.nasdanika.models.jira.BasicPriority;
import org.nasdanika.models.jira.BasicProject;
import org.nasdanika.models.jira.BasicVotes;
import org.nasdanika.models.jira.BasicWatchers;
import org.nasdanika.models.jira.ChangelogGroup;
import org.nasdanika.models.jira.Comment;
import org.nasdanika.models.jira.Issue;
import org.nasdanika.models.jira.IssueField;
import org.nasdanika.models.jira.IssueLink;
import org.nasdanika.models.jira.IssueType;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Operations;
import org.nasdanika.models.jira.Resolution;
import org.nasdanika.models.jira.Status;
import org.nasdanika.models.jira.Subtask;
import org.nasdanika.models.jira.TimeTracking;
import org.nasdanika.models.jira.User;
import org.nasdanika.models.jira.Version;
import org.nasdanika.models.jira.Worklog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getAffectedVersions <em>Affected Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getChangelog <em>Changelog</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getExpandos <em>Expandos</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getFixVersions <em>Fix Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getIssueFields <em>Issue Fields</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getIssueLinks <em>Issue Links</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getSubtasks <em>Subtasks</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getTimeTracking <em>Time Tracking</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getTransitionsUri <em>Transitions Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getVotes <em>Votes</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getWatchers <em>Watchers</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getWorklogs <em>Worklogs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends BasicIssueImpl implements Issue {
	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransitionsUri() <em>Transitions Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionsUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITIONS_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATE_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Version> getAffectedVersions() {
		return (EList<Version>)eDynamicGet(JiraPackage.ISSUE__AFFECTED_VERSIONS, JiraPackage.Literals.ISSUE__AFFECTED_VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getAssignee() {
		return (User)eDynamicGet(JiraPackage.ISSUE__ASSIGNEE, JiraPackage.Literals.ISSUE__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAssignee() {
		return (User)eDynamicGet(JiraPackage.ISSUE__ASSIGNEE, JiraPackage.Literals.ISSUE__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(User newAssignee) {
		eDynamicSet(JiraPackage.ISSUE__ASSIGNEE, JiraPackage.Literals.ISSUE__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Attachment> getAttachments() {
		return (EList<Attachment>)eDynamicGet(JiraPackage.ISSUE__ATTACHMENTS, JiraPackage.Literals.ISSUE__ATTACHMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ChangelogGroup> getChangelog() {
		return (EList<ChangelogGroup>)eDynamicGet(JiraPackage.ISSUE__CHANGELOG, JiraPackage.Literals.ISSUE__CHANGELOG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Comment> getComments() {
		return (EList<Comment>)eDynamicGet(JiraPackage.ISSUE__COMMENTS, JiraPackage.Literals.ISSUE__COMMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<BasicComponent> getComponents() {
		return (EList<BasicComponent>)eDynamicGet(JiraPackage.ISSUE__COMPONENTS, JiraPackage.Literals.ISSUE__COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreationDate() {
		return (Date)eDynamicGet(JiraPackage.ISSUE__CREATION_DATE, JiraPackage.Literals.ISSUE__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(JiraPackage.ISSUE__CREATION_DATE, JiraPackage.Literals.ISSUE__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(JiraPackage.ISSUE__DESCRIPTION, JiraPackage.Literals.ISSUE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(JiraPackage.ISSUE__DESCRIPTION, JiraPackage.Literals.ISSUE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return (Date)eDynamicGet(JiraPackage.ISSUE__DUE_DATE, JiraPackage.Literals.ISSUE__DUE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		eDynamicSet(JiraPackage.ISSUE__DUE_DATE, JiraPackage.Literals.ISSUE__DUE_DATE, newDueDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getExpandos() {
		return (EList<String>)eDynamicGet(JiraPackage.ISSUE__EXPANDOS, JiraPackage.Literals.ISSUE__EXPANDOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Version> getFixVersions() {
		return (EList<Version>)eDynamicGet(JiraPackage.ISSUE__FIX_VERSIONS, JiraPackage.Literals.ISSUE__FIX_VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IssueField> getIssueFields() {
		return (EList<IssueField>)eDynamicGet(JiraPackage.ISSUE__ISSUE_FIELDS, JiraPackage.Literals.ISSUE__ISSUE_FIELDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IssueLink> getIssueLinks() {
		return (EList<IssueLink>)eDynamicGet(JiraPackage.ISSUE__ISSUE_LINKS, JiraPackage.Literals.ISSUE__ISSUE_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueType getIssueType() {
		return (IssueType)eDynamicGet(JiraPackage.ISSUE__ISSUE_TYPE, JiraPackage.Literals.ISSUE__ISSUE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueType basicGetIssueType() {
		return (IssueType)eDynamicGet(JiraPackage.ISSUE__ISSUE_TYPE, JiraPackage.Literals.ISSUE__ISSUE_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueType(IssueType newIssueType) {
		eDynamicSet(JiraPackage.ISSUE__ISSUE_TYPE, JiraPackage.Literals.ISSUE__ISSUE_TYPE, newIssueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getLabels() {
		return (EList<String>)eDynamicGet(JiraPackage.ISSUE__LABELS, JiraPackage.Literals.ISSUE__LABELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operations getOperations() {
		return (Operations)eDynamicGet(JiraPackage.ISSUE__OPERATIONS, JiraPackage.Literals.ISSUE__OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperations(Operations newOperations, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOperations, JiraPackage.ISSUE__OPERATIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperations(Operations newOperations) {
		eDynamicSet(JiraPackage.ISSUE__OPERATIONS, JiraPackage.Literals.ISSUE__OPERATIONS, newOperations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicPriority getPriority() {
		return (BasicPriority)eDynamicGet(JiraPackage.ISSUE__PRIORITY, JiraPackage.Literals.ISSUE__PRIORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(BasicPriority newPriority, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPriority, JiraPackage.ISSUE__PRIORITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(BasicPriority newPriority) {
		eDynamicSet(JiraPackage.ISSUE__PRIORITY, JiraPackage.Literals.ISSUE__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicProject getProject() {
		return (BasicProject)eDynamicGet(JiraPackage.ISSUE__PROJECT, JiraPackage.Literals.ISSUE__PROJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicProject basicGetProject() {
		return (BasicProject)eDynamicGet(JiraPackage.ISSUE__PROJECT, JiraPackage.Literals.ISSUE__PROJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject(BasicProject newProject) {
		eDynamicSet(JiraPackage.ISSUE__PROJECT, JiraPackage.Literals.ISSUE__PROJECT, newProject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getReporter() {
		return (User)eDynamicGet(JiraPackage.ISSUE__REPORTER, JiraPackage.Literals.ISSUE__REPORTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetReporter() {
		return (User)eDynamicGet(JiraPackage.ISSUE__REPORTER, JiraPackage.Literals.ISSUE__REPORTER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReporter(User newReporter) {
		eDynamicSet(JiraPackage.ISSUE__REPORTER, JiraPackage.Literals.ISSUE__REPORTER, newReporter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resolution getResolution() {
		return (Resolution)eDynamicGet(JiraPackage.ISSUE__RESOLUTION, JiraPackage.Literals.ISSUE__RESOLUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolution(Resolution newResolution, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResolution, JiraPackage.ISSUE__RESOLUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(Resolution newResolution) {
		eDynamicSet(JiraPackage.ISSUE__RESOLUTION, JiraPackage.Literals.ISSUE__RESOLUTION, newResolution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return (Status)eDynamicGet(JiraPackage.ISSUE__STATUS, JiraPackage.Literals.ISSUE__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStatus, JiraPackage.ISSUE__STATUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		eDynamicSet(JiraPackage.ISSUE__STATUS, JiraPackage.Literals.ISSUE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subtask> getSubtasks() {
		return (EList<Subtask>)eDynamicGet(JiraPackage.ISSUE__SUBTASKS, JiraPackage.Literals.ISSUE__SUBTASKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return (String)eDynamicGet(JiraPackage.ISSUE__SUMMARY, JiraPackage.Literals.ISSUE__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		eDynamicSet(JiraPackage.ISSUE__SUMMARY, JiraPackage.Literals.ISSUE__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTracking getTimeTracking() {
		return (TimeTracking)eDynamicGet(JiraPackage.ISSUE__TIME_TRACKING, JiraPackage.Literals.ISSUE__TIME_TRACKING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeTracking(TimeTracking newTimeTracking, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTimeTracking, JiraPackage.ISSUE__TIME_TRACKING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeTracking(TimeTracking newTimeTracking) {
		eDynamicSet(JiraPackage.ISSUE__TIME_TRACKING, JiraPackage.Literals.ISSUE__TIME_TRACKING, newTimeTracking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransitionsUri() {
		return (String)eDynamicGet(JiraPackage.ISSUE__TRANSITIONS_URI, JiraPackage.Literals.ISSUE__TRANSITIONS_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionsUri(String newTransitionsUri) {
		eDynamicSet(JiraPackage.ISSUE__TRANSITIONS_URI, JiraPackage.Literals.ISSUE__TRANSITIONS_URI, newTransitionsUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdateDate() {
		return (Date)eDynamicGet(JiraPackage.ISSUE__UPDATE_DATE, JiraPackage.Literals.ISSUE__UPDATE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateDate(Date newUpdateDate) {
		eDynamicSet(JiraPackage.ISSUE__UPDATE_DATE, JiraPackage.Literals.ISSUE__UPDATE_DATE, newUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicVotes getVotes() {
		return (BasicVotes)eDynamicGet(JiraPackage.ISSUE__VOTES, JiraPackage.Literals.ISSUE__VOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVotes(BasicVotes newVotes, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newVotes, JiraPackage.ISSUE__VOTES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVotes(BasicVotes newVotes) {
		eDynamicSet(JiraPackage.ISSUE__VOTES, JiraPackage.Literals.ISSUE__VOTES, newVotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicWatchers getWatchers() {
		return (BasicWatchers)eDynamicGet(JiraPackage.ISSUE__WATCHERS, JiraPackage.Literals.ISSUE__WATCHERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWatchers(BasicWatchers newWatchers, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newWatchers, JiraPackage.ISSUE__WATCHERS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWatchers(BasicWatchers newWatchers) {
		eDynamicSet(JiraPackage.ISSUE__WATCHERS, JiraPackage.Literals.ISSUE__WATCHERS, newWatchers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Worklog> getWorklogs() {
		return (EList<Worklog>)eDynamicGet(JiraPackage.ISSUE__WORKLOGS, JiraPackage.Literals.ISSUE__WORKLOGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPackage.ISSUE__ATTACHMENTS:
				return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
			case JiraPackage.ISSUE__CHANGELOG:
				return ((InternalEList<?>)getChangelog()).basicRemove(otherEnd, msgs);
			case JiraPackage.ISSUE__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case JiraPackage.ISSUE__ISSUE_FIELDS:
				return ((InternalEList<?>)getIssueFields()).basicRemove(otherEnd, msgs);
			case JiraPackage.ISSUE__ISSUE_LINKS:
				return ((InternalEList<?>)getIssueLinks()).basicRemove(otherEnd, msgs);
			case JiraPackage.ISSUE__OPERATIONS:
				return basicSetOperations(null, msgs);
			case JiraPackage.ISSUE__PRIORITY:
				return basicSetPriority(null, msgs);
			case JiraPackage.ISSUE__RESOLUTION:
				return basicSetResolution(null, msgs);
			case JiraPackage.ISSUE__STATUS:
				return basicSetStatus(null, msgs);
			case JiraPackage.ISSUE__SUBTASKS:
				return ((InternalEList<?>)getSubtasks()).basicRemove(otherEnd, msgs);
			case JiraPackage.ISSUE__TIME_TRACKING:
				return basicSetTimeTracking(null, msgs);
			case JiraPackage.ISSUE__VOTES:
				return basicSetVotes(null, msgs);
			case JiraPackage.ISSUE__WATCHERS:
				return basicSetWatchers(null, msgs);
			case JiraPackage.ISSUE__WORKLOGS:
				return ((InternalEList<?>)getWorklogs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.ISSUE__AFFECTED_VERSIONS:
				return getAffectedVersions();
			case JiraPackage.ISSUE__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case JiraPackage.ISSUE__ATTACHMENTS:
				return getAttachments();
			case JiraPackage.ISSUE__CHANGELOG:
				return getChangelog();
			case JiraPackage.ISSUE__COMMENTS:
				return getComments();
			case JiraPackage.ISSUE__COMPONENTS:
				return getComponents();
			case JiraPackage.ISSUE__CREATION_DATE:
				return getCreationDate();
			case JiraPackage.ISSUE__DESCRIPTION:
				return getDescription();
			case JiraPackage.ISSUE__DUE_DATE:
				return getDueDate();
			case JiraPackage.ISSUE__EXPANDOS:
				return getExpandos();
			case JiraPackage.ISSUE__FIX_VERSIONS:
				return getFixVersions();
			case JiraPackage.ISSUE__ISSUE_FIELDS:
				return getIssueFields();
			case JiraPackage.ISSUE__ISSUE_LINKS:
				return getIssueLinks();
			case JiraPackage.ISSUE__ISSUE_TYPE:
				if (resolve) return getIssueType();
				return basicGetIssueType();
			case JiraPackage.ISSUE__LABELS:
				return getLabels();
			case JiraPackage.ISSUE__OPERATIONS:
				return getOperations();
			case JiraPackage.ISSUE__PRIORITY:
				return getPriority();
			case JiraPackage.ISSUE__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case JiraPackage.ISSUE__REPORTER:
				if (resolve) return getReporter();
				return basicGetReporter();
			case JiraPackage.ISSUE__RESOLUTION:
				return getResolution();
			case JiraPackage.ISSUE__STATUS:
				return getStatus();
			case JiraPackage.ISSUE__SUBTASKS:
				return getSubtasks();
			case JiraPackage.ISSUE__SUMMARY:
				return getSummary();
			case JiraPackage.ISSUE__TIME_TRACKING:
				return getTimeTracking();
			case JiraPackage.ISSUE__TRANSITIONS_URI:
				return getTransitionsUri();
			case JiraPackage.ISSUE__UPDATE_DATE:
				return getUpdateDate();
			case JiraPackage.ISSUE__VOTES:
				return getVotes();
			case JiraPackage.ISSUE__WATCHERS:
				return getWatchers();
			case JiraPackage.ISSUE__WORKLOGS:
				return getWorklogs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JiraPackage.ISSUE__AFFECTED_VERSIONS:
				getAffectedVersions().clear();
				getAffectedVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case JiraPackage.ISSUE__ASSIGNEE:
				setAssignee((User)newValue);
				return;
			case JiraPackage.ISSUE__ATTACHMENTS:
				getAttachments().clear();
				getAttachments().addAll((Collection<? extends Attachment>)newValue);
				return;
			case JiraPackage.ISSUE__CHANGELOG:
				getChangelog().clear();
				getChangelog().addAll((Collection<? extends ChangelogGroup>)newValue);
				return;
			case JiraPackage.ISSUE__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case JiraPackage.ISSUE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends BasicComponent>)newValue);
				return;
			case JiraPackage.ISSUE__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case JiraPackage.ISSUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JiraPackage.ISSUE__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case JiraPackage.ISSUE__EXPANDOS:
				getExpandos().clear();
				getExpandos().addAll((Collection<? extends String>)newValue);
				return;
			case JiraPackage.ISSUE__FIX_VERSIONS:
				getFixVersions().clear();
				getFixVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case JiraPackage.ISSUE__ISSUE_FIELDS:
				getIssueFields().clear();
				getIssueFields().addAll((Collection<? extends IssueField>)newValue);
				return;
			case JiraPackage.ISSUE__ISSUE_LINKS:
				getIssueLinks().clear();
				getIssueLinks().addAll((Collection<? extends IssueLink>)newValue);
				return;
			case JiraPackage.ISSUE__ISSUE_TYPE:
				setIssueType((IssueType)newValue);
				return;
			case JiraPackage.ISSUE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends String>)newValue);
				return;
			case JiraPackage.ISSUE__OPERATIONS:
				setOperations((Operations)newValue);
				return;
			case JiraPackage.ISSUE__PRIORITY:
				setPriority((BasicPriority)newValue);
				return;
			case JiraPackage.ISSUE__PROJECT:
				setProject((BasicProject)newValue);
				return;
			case JiraPackage.ISSUE__REPORTER:
				setReporter((User)newValue);
				return;
			case JiraPackage.ISSUE__RESOLUTION:
				setResolution((Resolution)newValue);
				return;
			case JiraPackage.ISSUE__STATUS:
				setStatus((Status)newValue);
				return;
			case JiraPackage.ISSUE__SUBTASKS:
				getSubtasks().clear();
				getSubtasks().addAll((Collection<? extends Subtask>)newValue);
				return;
			case JiraPackage.ISSUE__SUMMARY:
				setSummary((String)newValue);
				return;
			case JiraPackage.ISSUE__TIME_TRACKING:
				setTimeTracking((TimeTracking)newValue);
				return;
			case JiraPackage.ISSUE__TRANSITIONS_URI:
				setTransitionsUri((String)newValue);
				return;
			case JiraPackage.ISSUE__UPDATE_DATE:
				setUpdateDate((Date)newValue);
				return;
			case JiraPackage.ISSUE__VOTES:
				setVotes((BasicVotes)newValue);
				return;
			case JiraPackage.ISSUE__WATCHERS:
				setWatchers((BasicWatchers)newValue);
				return;
			case JiraPackage.ISSUE__WORKLOGS:
				getWorklogs().clear();
				getWorklogs().addAll((Collection<? extends Worklog>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JiraPackage.ISSUE__AFFECTED_VERSIONS:
				getAffectedVersions().clear();
				return;
			case JiraPackage.ISSUE__ASSIGNEE:
				setAssignee((User)null);
				return;
			case JiraPackage.ISSUE__ATTACHMENTS:
				getAttachments().clear();
				return;
			case JiraPackage.ISSUE__CHANGELOG:
				getChangelog().clear();
				return;
			case JiraPackage.ISSUE__COMMENTS:
				getComments().clear();
				return;
			case JiraPackage.ISSUE__COMPONENTS:
				getComponents().clear();
				return;
			case JiraPackage.ISSUE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case JiraPackage.ISSUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JiraPackage.ISSUE__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case JiraPackage.ISSUE__EXPANDOS:
				getExpandos().clear();
				return;
			case JiraPackage.ISSUE__FIX_VERSIONS:
				getFixVersions().clear();
				return;
			case JiraPackage.ISSUE__ISSUE_FIELDS:
				getIssueFields().clear();
				return;
			case JiraPackage.ISSUE__ISSUE_LINKS:
				getIssueLinks().clear();
				return;
			case JiraPackage.ISSUE__ISSUE_TYPE:
				setIssueType((IssueType)null);
				return;
			case JiraPackage.ISSUE__LABELS:
				getLabels().clear();
				return;
			case JiraPackage.ISSUE__OPERATIONS:
				setOperations((Operations)null);
				return;
			case JiraPackage.ISSUE__PRIORITY:
				setPriority((BasicPriority)null);
				return;
			case JiraPackage.ISSUE__PROJECT:
				setProject((BasicProject)null);
				return;
			case JiraPackage.ISSUE__REPORTER:
				setReporter((User)null);
				return;
			case JiraPackage.ISSUE__RESOLUTION:
				setResolution((Resolution)null);
				return;
			case JiraPackage.ISSUE__STATUS:
				setStatus((Status)null);
				return;
			case JiraPackage.ISSUE__SUBTASKS:
				getSubtasks().clear();
				return;
			case JiraPackage.ISSUE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case JiraPackage.ISSUE__TIME_TRACKING:
				setTimeTracking((TimeTracking)null);
				return;
			case JiraPackage.ISSUE__TRANSITIONS_URI:
				setTransitionsUri(TRANSITIONS_URI_EDEFAULT);
				return;
			case JiraPackage.ISSUE__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
				return;
			case JiraPackage.ISSUE__VOTES:
				setVotes((BasicVotes)null);
				return;
			case JiraPackage.ISSUE__WATCHERS:
				setWatchers((BasicWatchers)null);
				return;
			case JiraPackage.ISSUE__WORKLOGS:
				getWorklogs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JiraPackage.ISSUE__AFFECTED_VERSIONS:
				return !getAffectedVersions().isEmpty();
			case JiraPackage.ISSUE__ASSIGNEE:
				return basicGetAssignee() != null;
			case JiraPackage.ISSUE__ATTACHMENTS:
				return !getAttachments().isEmpty();
			case JiraPackage.ISSUE__CHANGELOG:
				return !getChangelog().isEmpty();
			case JiraPackage.ISSUE__COMMENTS:
				return !getComments().isEmpty();
			case JiraPackage.ISSUE__COMPONENTS:
				return !getComponents().isEmpty();
			case JiraPackage.ISSUE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case JiraPackage.ISSUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JiraPackage.ISSUE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? getDueDate() != null : !DUE_DATE_EDEFAULT.equals(getDueDate());
			case JiraPackage.ISSUE__EXPANDOS:
				return !getExpandos().isEmpty();
			case JiraPackage.ISSUE__FIX_VERSIONS:
				return !getFixVersions().isEmpty();
			case JiraPackage.ISSUE__ISSUE_FIELDS:
				return !getIssueFields().isEmpty();
			case JiraPackage.ISSUE__ISSUE_LINKS:
				return !getIssueLinks().isEmpty();
			case JiraPackage.ISSUE__ISSUE_TYPE:
				return basicGetIssueType() != null;
			case JiraPackage.ISSUE__LABELS:
				return !getLabels().isEmpty();
			case JiraPackage.ISSUE__OPERATIONS:
				return getOperations() != null;
			case JiraPackage.ISSUE__PRIORITY:
				return getPriority() != null;
			case JiraPackage.ISSUE__PROJECT:
				return basicGetProject() != null;
			case JiraPackage.ISSUE__REPORTER:
				return basicGetReporter() != null;
			case JiraPackage.ISSUE__RESOLUTION:
				return getResolution() != null;
			case JiraPackage.ISSUE__STATUS:
				return getStatus() != null;
			case JiraPackage.ISSUE__SUBTASKS:
				return !getSubtasks().isEmpty();
			case JiraPackage.ISSUE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? getSummary() != null : !SUMMARY_EDEFAULT.equals(getSummary());
			case JiraPackage.ISSUE__TIME_TRACKING:
				return getTimeTracking() != null;
			case JiraPackage.ISSUE__TRANSITIONS_URI:
				return TRANSITIONS_URI_EDEFAULT == null ? getTransitionsUri() != null : !TRANSITIONS_URI_EDEFAULT.equals(getTransitionsUri());
			case JiraPackage.ISSUE__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? getUpdateDate() != null : !UPDATE_DATE_EDEFAULT.equals(getUpdateDate());
			case JiraPackage.ISSUE__VOTES:
				return getVotes() != null;
			case JiraPackage.ISSUE__WATCHERS:
				return getWatchers() != null;
			case JiraPackage.ISSUE__WORKLOGS:
				return !getWorklogs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IssueImpl
