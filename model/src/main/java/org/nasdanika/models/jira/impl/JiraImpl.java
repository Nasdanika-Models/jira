/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.jira.Jira;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Project;
import org.nasdanika.models.jira.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jira</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.JiraImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.JiraImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JiraImpl extends MinimalEObjectImpl.Container implements Jira {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JiraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.JIRA;
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
		return (EList<User>)eDynamicGet(JiraPackage.JIRA__USERS, JiraPackage.Literals.JIRA__USERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getProjects() {
		return (Project)eDynamicGet(JiraPackage.JIRA__PROJECTS, JiraPackage.Literals.JIRA__PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProjects() {
		return (Project)eDynamicGet(JiraPackage.JIRA__PROJECTS, JiraPackage.Literals.JIRA__PROJECTS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjects(Project newProjects) {
		eDynamicSet(JiraPackage.JIRA__PROJECTS, JiraPackage.Literals.JIRA__PROJECTS, newProjects);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPackage.JIRA__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
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
			case JiraPackage.JIRA__USERS:
				return getUsers();
			case JiraPackage.JIRA__PROJECTS:
				if (resolve) return getProjects();
				return basicGetProjects();
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
			case JiraPackage.JIRA__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case JiraPackage.JIRA__PROJECTS:
				setProjects((Project)newValue);
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
			case JiraPackage.JIRA__USERS:
				getUsers().clear();
				return;
			case JiraPackage.JIRA__PROJECTS:
				setProjects((Project)null);
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
			case JiraPackage.JIRA__USERS:
				return !getUsers().isEmpty();
			case JiraPackage.JIRA__PROJECTS:
				return basicGetProjects() != null;
		}
		return super.eIsSet(featureID);
	}

} //JiraImpl
