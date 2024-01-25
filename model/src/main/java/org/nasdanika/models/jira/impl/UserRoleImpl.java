/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Role;
import org.nasdanika.models.jira.User;
import org.nasdanika.models.jira.UserRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.UserRoleImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.UserRoleImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserRoleImpl extends MinimalEObjectImpl.Container implements UserRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.USER_ROLE;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getUsers() {
		return (EList<User>)eDynamicGet(JiraPackage.USER_ROLE__USERS, JiraPackage.Literals.USER_ROLE__USERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		return (Role)eDynamicGet(JiraPackage.USER_ROLE__ROLE, JiraPackage.Literals.USER_ROLE__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return (Role)eDynamicGet(JiraPackage.USER_ROLE__ROLE, JiraPackage.Literals.USER_ROLE__ROLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		eDynamicSet(JiraPackage.USER_ROLE__ROLE, JiraPackage.Literals.USER_ROLE__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.USER_ROLE__USERS:
				return getUsers();
			case JiraPackage.USER_ROLE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
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
			case JiraPackage.USER_ROLE__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case JiraPackage.USER_ROLE__ROLE:
				setRole((Role)newValue);
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
			case JiraPackage.USER_ROLE__USERS:
				getUsers().clear();
				return;
			case JiraPackage.USER_ROLE__ROLE:
				setRole((Role)null);
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
			case JiraPackage.USER_ROLE__USERS:
				return !getUsers().isEmpty();
			case JiraPackage.USER_ROLE__ROLE:
				return basicGetRole() != null;
		}
		return super.eIsSet(featureID);
	}

} //UserRoleImpl
