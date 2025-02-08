/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.jira.IssueType;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Status;
import org.nasdanika.models.jira.Subtask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.SubtaskImpl#getIssueKey <em>Issue Key</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.SubtaskImpl#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.SubtaskImpl#getIssueUri <em>Issue Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.SubtaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.SubtaskImpl#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtaskImpl extends MinimalEObjectImpl.Container implements Subtask {
	/**
	 * The default value of the '{@link #getIssueKey() <em>Issue Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIssueUri() <em>Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueUri()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_URI_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.SUBTASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueKey() {
		return (String)eDynamicGet(JiraPackage.SUBTASK__ISSUE_KEY, JiraPackage.Literals.SUBTASK__ISSUE_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueKey(String newIssueKey) {
		eDynamicSet(JiraPackage.SUBTASK__ISSUE_KEY, JiraPackage.Literals.SUBTASK__ISSUE_KEY, newIssueKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueType getIssueType() {
		return (IssueType)eDynamicGet(JiraPackage.SUBTASK__ISSUE_TYPE, JiraPackage.Literals.SUBTASK__ISSUE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueType basicGetIssueType() {
		return (IssueType)eDynamicGet(JiraPackage.SUBTASK__ISSUE_TYPE, JiraPackage.Literals.SUBTASK__ISSUE_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueType(IssueType newIssueType) {
		eDynamicSet(JiraPackage.SUBTASK__ISSUE_TYPE, JiraPackage.Literals.SUBTASK__ISSUE_TYPE, newIssueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueUri() {
		return (String)eDynamicGet(JiraPackage.SUBTASK__ISSUE_URI, JiraPackage.Literals.SUBTASK__ISSUE_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueUri(String newIssueUri) {
		eDynamicSet(JiraPackage.SUBTASK__ISSUE_URI, JiraPackage.Literals.SUBTASK__ISSUE_URI, newIssueUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return (Status)eDynamicGet(JiraPackage.SUBTASK__STATUS, JiraPackage.Literals.SUBTASK__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return (Status)eDynamicGet(JiraPackage.SUBTASK__STATUS, JiraPackage.Literals.SUBTASK__STATUS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		eDynamicSet(JiraPackage.SUBTASK__STATUS, JiraPackage.Literals.SUBTASK__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return (String)eDynamicGet(JiraPackage.SUBTASK__SUMMARY, JiraPackage.Literals.SUBTASK__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		eDynamicSet(JiraPackage.SUBTASK__SUMMARY, JiraPackage.Literals.SUBTASK__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.SUBTASK__ISSUE_KEY:
				return getIssueKey();
			case JiraPackage.SUBTASK__ISSUE_TYPE:
				if (resolve) return getIssueType();
				return basicGetIssueType();
			case JiraPackage.SUBTASK__ISSUE_URI:
				return getIssueUri();
			case JiraPackage.SUBTASK__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case JiraPackage.SUBTASK__SUMMARY:
				return getSummary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JiraPackage.SUBTASK__ISSUE_KEY:
				setIssueKey((String)newValue);
				return;
			case JiraPackage.SUBTASK__ISSUE_TYPE:
				setIssueType((IssueType)newValue);
				return;
			case JiraPackage.SUBTASK__ISSUE_URI:
				setIssueUri((String)newValue);
				return;
			case JiraPackage.SUBTASK__STATUS:
				setStatus((Status)newValue);
				return;
			case JiraPackage.SUBTASK__SUMMARY:
				setSummary((String)newValue);
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
			case JiraPackage.SUBTASK__ISSUE_KEY:
				setIssueKey(ISSUE_KEY_EDEFAULT);
				return;
			case JiraPackage.SUBTASK__ISSUE_TYPE:
				setIssueType((IssueType)null);
				return;
			case JiraPackage.SUBTASK__ISSUE_URI:
				setIssueUri(ISSUE_URI_EDEFAULT);
				return;
			case JiraPackage.SUBTASK__STATUS:
				setStatus((Status)null);
				return;
			case JiraPackage.SUBTASK__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
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
			case JiraPackage.SUBTASK__ISSUE_KEY:
				return ISSUE_KEY_EDEFAULT == null ? getIssueKey() != null : !ISSUE_KEY_EDEFAULT.equals(getIssueKey());
			case JiraPackage.SUBTASK__ISSUE_TYPE:
				return basicGetIssueType() != null;
			case JiraPackage.SUBTASK__ISSUE_URI:
				return ISSUE_URI_EDEFAULT == null ? getIssueUri() != null : !ISSUE_URI_EDEFAULT.equals(getIssueUri());
			case JiraPackage.SUBTASK__STATUS:
				return basicGetStatus() != null;
			case JiraPackage.SUBTASK__SUMMARY:
				return SUMMARY_EDEFAULT == null ? getSummary() != null : !SUMMARY_EDEFAULT.equals(getSummary());
		}
		return super.eIsSet(featureID);
	}

} //SubtaskImpl
