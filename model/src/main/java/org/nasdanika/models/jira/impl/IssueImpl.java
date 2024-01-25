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

import org.nasdanika.models.jira.Category;
import org.nasdanika.models.jira.Issue;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Release;
import org.nasdanika.models.jira.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueImpl#getAssignee <em>Assignee</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
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
	public EList<Category> getCategories() {
		return (EList<Category>)eDynamicGet(JiraPackage.ISSUE__CATEGORIES, JiraPackage.Literals.ISSUE__CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Release> getVersions() {
		return (EList<Release>)eDynamicGet(JiraPackage.ISSUE__VERSIONS, JiraPackage.Literals.ISSUE__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getAssignee() {
		return (EList<User>)eDynamicGet(JiraPackage.ISSUE__ASSIGNEE, JiraPackage.Literals.ISSUE__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPackage.ISSUE__CATEGORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategories()).basicAdd(otherEnd, msgs);
			case JiraPackage.ISSUE__VERSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPackage.ISSUE__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case JiraPackage.ISSUE__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
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
			case JiraPackage.ISSUE__CATEGORIES:
				return getCategories();
			case JiraPackage.ISSUE__VERSIONS:
				return getVersions();
			case JiraPackage.ISSUE__ASSIGNEE:
				return getAssignee();
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
			case JiraPackage.ISSUE__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case JiraPackage.ISSUE__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Release>)newValue);
				return;
			case JiraPackage.ISSUE__ASSIGNEE:
				getAssignee().clear();
				getAssignee().addAll((Collection<? extends User>)newValue);
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
			case JiraPackage.ISSUE__CATEGORIES:
				getCategories().clear();
				return;
			case JiraPackage.ISSUE__VERSIONS:
				getVersions().clear();
				return;
			case JiraPackage.ISSUE__ASSIGNEE:
				getAssignee().clear();
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
			case JiraPackage.ISSUE__CATEGORIES:
				return !getCategories().isEmpty();
			case JiraPackage.ISSUE__VERSIONS:
				return !getVersions().isEmpty();
			case JiraPackage.ISSUE__ASSIGNEE:
				return !getAssignee().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IssueImpl
