/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.jira.IssueLink;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueLinkImpl#isInbound <em>Inbound</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueLinkImpl#getTargetIssueKey <em>Target Issue Key</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueLinkImpl#getTargetIssueUri <em>Target Issue Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueLinkImpl extends MinimalEObjectImpl.Container implements IssueLink {
	/**
	 * The default value of the '{@link #isInbound() <em>Inbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInbound()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INBOUND_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTargetIssueKey() <em>Target Issue Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIssueKey()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ISSUE_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetIssueUri() <em>Target Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIssueUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ISSUE_URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.ISSUE_LINK;
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
	public boolean isInbound() {
		return (Boolean)eDynamicGet(JiraPackage.ISSUE_LINK__INBOUND, JiraPackage.Literals.ISSUE_LINK__INBOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInbound(boolean newInbound) {
		eDynamicSet(JiraPackage.ISSUE_LINK__INBOUND, JiraPackage.Literals.ISSUE_LINK__INBOUND, newInbound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetIssueKey() {
		return (String)eDynamicGet(JiraPackage.ISSUE_LINK__TARGET_ISSUE_KEY, JiraPackage.Literals.ISSUE_LINK__TARGET_ISSUE_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetIssueKey(String newTargetIssueKey) {
		eDynamicSet(JiraPackage.ISSUE_LINK__TARGET_ISSUE_KEY, JiraPackage.Literals.ISSUE_LINK__TARGET_ISSUE_KEY, newTargetIssueKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetIssueUri() {
		return (String)eDynamicGet(JiraPackage.ISSUE_LINK__TARGET_ISSUE_URI, JiraPackage.Literals.ISSUE_LINK__TARGET_ISSUE_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetIssueUri(String newTargetIssueUri) {
		eDynamicSet(JiraPackage.ISSUE_LINK__TARGET_ISSUE_URI, JiraPackage.Literals.ISSUE_LINK__TARGET_ISSUE_URI, newTargetIssueUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.ISSUE_LINK__INBOUND:
				return isInbound();
			case JiraPackage.ISSUE_LINK__TARGET_ISSUE_KEY:
				return getTargetIssueKey();
			case JiraPackage.ISSUE_LINK__TARGET_ISSUE_URI:
				return getTargetIssueUri();
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
			case JiraPackage.ISSUE_LINK__INBOUND:
				setInbound((Boolean)newValue);
				return;
			case JiraPackage.ISSUE_LINK__TARGET_ISSUE_KEY:
				setTargetIssueKey((String)newValue);
				return;
			case JiraPackage.ISSUE_LINK__TARGET_ISSUE_URI:
				setTargetIssueUri((String)newValue);
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
			case JiraPackage.ISSUE_LINK__INBOUND:
				setInbound(INBOUND_EDEFAULT);
				return;
			case JiraPackage.ISSUE_LINK__TARGET_ISSUE_KEY:
				setTargetIssueKey(TARGET_ISSUE_KEY_EDEFAULT);
				return;
			case JiraPackage.ISSUE_LINK__TARGET_ISSUE_URI:
				setTargetIssueUri(TARGET_ISSUE_URI_EDEFAULT);
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
			case JiraPackage.ISSUE_LINK__INBOUND:
				return isInbound() != INBOUND_EDEFAULT;
			case JiraPackage.ISSUE_LINK__TARGET_ISSUE_KEY:
				return TARGET_ISSUE_KEY_EDEFAULT == null ? getTargetIssueKey() != null : !TARGET_ISSUE_KEY_EDEFAULT.equals(getTargetIssueKey());
			case JiraPackage.ISSUE_LINK__TARGET_ISSUE_URI:
				return TARGET_ISSUE_URI_EDEFAULT == null ? getTargetIssueUri() != null : !TARGET_ISSUE_URI_EDEFAULT.equals(getTargetIssueUri());
		}
		return super.eIsSet(featureID);
	}

} //IssueLinkImpl
