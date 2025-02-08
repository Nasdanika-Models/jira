/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.BasicUser;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.BasicUserImpl#getAccountId <em>Account Id</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.BasicUserImpl#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicUserImpl extends AdressableNamedEntityImpl implements BasicUser {
	/**
	 * The default value of the '{@link #getAccountId() <em>Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.BASIC_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountId() {
		return (String)eDynamicGet(JiraPackage.BASIC_USER__ACCOUNT_ID, JiraPackage.Literals.BASIC_USER__ACCOUNT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountId(String newAccountId) {
		eDynamicSet(JiraPackage.BASIC_USER__ACCOUNT_ID, JiraPackage.Literals.BASIC_USER__ACCOUNT_ID, newAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayName() {
		return (String)eDynamicGet(JiraPackage.BASIC_USER__DISPLAY_NAME, JiraPackage.Literals.BASIC_USER__DISPLAY_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName(String newDisplayName) {
		eDynamicSet(JiraPackage.BASIC_USER__DISPLAY_NAME, JiraPackage.Literals.BASIC_USER__DISPLAY_NAME, newDisplayName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.BASIC_USER__ACCOUNT_ID:
				return getAccountId();
			case JiraPackage.BASIC_USER__DISPLAY_NAME:
				return getDisplayName();
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
			case JiraPackage.BASIC_USER__ACCOUNT_ID:
				setAccountId((String)newValue);
				return;
			case JiraPackage.BASIC_USER__DISPLAY_NAME:
				setDisplayName((String)newValue);
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
			case JiraPackage.BASIC_USER__ACCOUNT_ID:
				setAccountId(ACCOUNT_ID_EDEFAULT);
				return;
			case JiraPackage.BASIC_USER__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
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
			case JiraPackage.BASIC_USER__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? getAccountId() != null : !ACCOUNT_ID_EDEFAULT.equals(getAccountId());
			case JiraPackage.BASIC_USER__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? getDisplayName() != null : !DISPLAY_NAME_EDEFAULT.equals(getDisplayName());
		}
		return super.eIsSet(featureID);
	}

} //BasicUserImpl
