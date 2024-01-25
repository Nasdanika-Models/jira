/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.jira.Category;
import org.nasdanika.models.jira.Issue;
import org.nasdanika.models.jira.IssueCollector;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Project;
import org.nasdanika.models.jira.Release;
import org.nasdanika.models.jira.UserRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getIssueCollectors <em>Issue Collectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends IssueSourceImpl implements Project {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(JiraPackage.PROJECT__ISSUES, JiraPackage.Literals.PROJECT__ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Category> getCategories() {
		return (EList<Category>)eDynamicGet(JiraPackage.PROJECT__CATEGORIES, JiraPackage.Literals.PROJECT__CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Release> getReleases() {
		return (EList<Release>)eDynamicGet(JiraPackage.PROJECT__RELEASES, JiraPackage.Literals.PROJECT__RELEASES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<UserRole> getUsers() {
		return (EList<UserRole>)eDynamicGet(JiraPackage.PROJECT__USERS, JiraPackage.Literals.PROJECT__USERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IssueCollector> getIssueCollectors() {
		return (EList<IssueCollector>)eDynamicGet(JiraPackage.PROJECT__ISSUE_COLLECTORS, JiraPackage.Literals.PROJECT__ISSUE_COLLECTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPackage.PROJECT__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case JiraPackage.PROJECT__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case JiraPackage.PROJECT__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
			case JiraPackage.PROJECT__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case JiraPackage.PROJECT__ISSUE_COLLECTORS:
				return ((InternalEList<?>)getIssueCollectors()).basicRemove(otherEnd, msgs);
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
			case JiraPackage.PROJECT__ISSUES:
				return getIssues();
			case JiraPackage.PROJECT__CATEGORIES:
				return getCategories();
			case JiraPackage.PROJECT__RELEASES:
				return getReleases();
			case JiraPackage.PROJECT__USERS:
				return getUsers();
			case JiraPackage.PROJECT__ISSUE_COLLECTORS:
				return getIssueCollectors();
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
			case JiraPackage.PROJECT__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case JiraPackage.PROJECT__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case JiraPackage.PROJECT__RELEASES:
				getReleases().clear();
				getReleases().addAll((Collection<? extends Release>)newValue);
				return;
			case JiraPackage.PROJECT__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends UserRole>)newValue);
				return;
			case JiraPackage.PROJECT__ISSUE_COLLECTORS:
				getIssueCollectors().clear();
				getIssueCollectors().addAll((Collection<? extends IssueCollector>)newValue);
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
			case JiraPackage.PROJECT__ISSUES:
				getIssues().clear();
				return;
			case JiraPackage.PROJECT__CATEGORIES:
				getCategories().clear();
				return;
			case JiraPackage.PROJECT__RELEASES:
				getReleases().clear();
				return;
			case JiraPackage.PROJECT__USERS:
				getUsers().clear();
				return;
			case JiraPackage.PROJECT__ISSUE_COLLECTORS:
				getIssueCollectors().clear();
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
			case JiraPackage.PROJECT__ISSUES:
				return !getIssues().isEmpty();
			case JiraPackage.PROJECT__CATEGORIES:
				return !getCategories().isEmpty();
			case JiraPackage.PROJECT__RELEASES:
				return !getReleases().isEmpty();
			case JiraPackage.PROJECT__USERS:
				return !getUsers().isEmpty();
			case JiraPackage.PROJECT__ISSUE_COLLECTORS:
				return !getIssueCollectors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
