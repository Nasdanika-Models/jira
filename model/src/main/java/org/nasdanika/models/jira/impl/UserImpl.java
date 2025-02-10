/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.Group;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.UserImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.UserImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.UserImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.UserImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends BasicUserImpl implements User {
	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEZONE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return (Boolean)eDynamicGet(JiraPackage.USER__ACTIVE, JiraPackage.Literals.USER__ACTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		eDynamicSet(JiraPackage.USER__ACTIVE, JiraPackage.Literals.USER__ACTIVE, newActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailAddress() {
		return (String)eDynamicGet(JiraPackage.USER__EMAIL_ADDRESS, JiraPackage.Literals.USER__EMAIL_ADDRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailAddress(String newEmailAddress) {
		eDynamicSet(JiraPackage.USER__EMAIL_ADDRESS, JiraPackage.Literals.USER__EMAIL_ADDRESS, newEmailAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimezone() {
		return (String)eDynamicGet(JiraPackage.USER__TIMEZONE, JiraPackage.Literals.USER__TIMEZONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimezone(String newTimezone) {
		eDynamicSet(JiraPackage.USER__TIMEZONE, JiraPackage.Literals.USER__TIMEZONE, newTimezone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(JiraPackage.USER__GROUPS, JiraPackage.Literals.USER__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.USER__ACTIVE:
				return isActive();
			case JiraPackage.USER__EMAIL_ADDRESS:
				return getEmailAddress();
			case JiraPackage.USER__TIMEZONE:
				return getTimezone();
			case JiraPackage.USER__GROUPS:
				return getGroups();
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
			case JiraPackage.USER__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case JiraPackage.USER__EMAIL_ADDRESS:
				setEmailAddress((String)newValue);
				return;
			case JiraPackage.USER__TIMEZONE:
				setTimezone((String)newValue);
				return;
			case JiraPackage.USER__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
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
			case JiraPackage.USER__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case JiraPackage.USER__EMAIL_ADDRESS:
				setEmailAddress(EMAIL_ADDRESS_EDEFAULT);
				return;
			case JiraPackage.USER__TIMEZONE:
				setTimezone(TIMEZONE_EDEFAULT);
				return;
			case JiraPackage.USER__GROUPS:
				getGroups().clear();
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
			case JiraPackage.USER__ACTIVE:
				return isActive() != ACTIVE_EDEFAULT;
			case JiraPackage.USER__EMAIL_ADDRESS:
				return EMAIL_ADDRESS_EDEFAULT == null ? getEmailAddress() != null : !EMAIL_ADDRESS_EDEFAULT.equals(getEmailAddress());
			case JiraPackage.USER__TIMEZONE:
				return TIMEZONE_EDEFAULT == null ? getTimezone() != null : !TIMEZONE_EDEFAULT.equals(getTimezone());
			case JiraPackage.USER__GROUPS:
				return !getGroups().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
