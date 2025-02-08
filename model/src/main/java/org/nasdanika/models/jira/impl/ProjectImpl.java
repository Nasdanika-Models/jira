/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.jira.BasicComponent;
import org.nasdanika.models.jira.BasicIssue;
import org.nasdanika.models.jira.BasicProjectRole;
import org.nasdanika.models.jira.BasicUser;
import org.nasdanika.models.jira.IssueType;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Project;
import org.nasdanika.models.jira.StatusCategory;
import org.nasdanika.models.jira.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getExpandos <em>Expandos</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getIssueTypes <em>Issue Types</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getLead <em>Lead</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getProjectRoles <em>Project Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectImpl#getStatusCategories <em>Status Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends BasicProjectImpl implements Project {
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
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

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
	public EList<BasicComponent> getComponents() {
		return (EList<BasicComponent>)eDynamicGet(JiraPackage.PROJECT__COMPONENTS, JiraPackage.Literals.PROJECT__COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(JiraPackage.PROJECT__DESCRIPTION, JiraPackage.Literals.PROJECT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(JiraPackage.PROJECT__DESCRIPTION, JiraPackage.Literals.PROJECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getExpandos() {
		return (EList<String>)eDynamicGet(JiraPackage.PROJECT__EXPANDOS, JiraPackage.Literals.PROJECT__EXPANDOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IssueType> getIssueTypes() {
		return (EList<IssueType>)eDynamicGet(JiraPackage.PROJECT__ISSUE_TYPES, JiraPackage.Literals.PROJECT__ISSUE_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUser getLead() {
		return (BasicUser)eDynamicGet(JiraPackage.PROJECT__LEAD, JiraPackage.Literals.PROJECT__LEAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicUser basicGetLead() {
		return (BasicUser)eDynamicGet(JiraPackage.PROJECT__LEAD, JiraPackage.Literals.PROJECT__LEAD, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLead(BasicUser newLead) {
		eDynamicSet(JiraPackage.PROJECT__LEAD, JiraPackage.Literals.PROJECT__LEAD, newLead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<BasicProjectRole> getProjectRoles() {
		return (EList<BasicProjectRole>)eDynamicGet(JiraPackage.PROJECT__PROJECT_ROLES, JiraPackage.Literals.PROJECT__PROJECT_ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUri() {
		return (String)eDynamicGet(JiraPackage.PROJECT__URI, JiraPackage.Literals.PROJECT__URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(String newUri) {
		eDynamicSet(JiraPackage.PROJECT__URI, JiraPackage.Literals.PROJECT__URI, newUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Version> getVersions() {
		return (EList<Version>)eDynamicGet(JiraPackage.PROJECT__VERSIONS, JiraPackage.Literals.PROJECT__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<BasicIssue> getIssues() {
		return (EList<BasicIssue>)eDynamicGet(JiraPackage.PROJECT__ISSUES, JiraPackage.Literals.PROJECT__ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StatusCategory> getStatusCategories() {
		return (EList<StatusCategory>)eDynamicGet(JiraPackage.PROJECT__STATUS_CATEGORIES, JiraPackage.Literals.PROJECT__STATUS_CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPackage.PROJECT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case JiraPackage.PROJECT__ISSUE_TYPES:
				return ((InternalEList<?>)getIssueTypes()).basicRemove(otherEnd, msgs);
			case JiraPackage.PROJECT__PROJECT_ROLES:
				return ((InternalEList<?>)getProjectRoles()).basicRemove(otherEnd, msgs);
			case JiraPackage.PROJECT__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case JiraPackage.PROJECT__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case JiraPackage.PROJECT__STATUS_CATEGORIES:
				return ((InternalEList<?>)getStatusCategories()).basicRemove(otherEnd, msgs);
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
			case JiraPackage.PROJECT__COMPONENTS:
				return getComponents();
			case JiraPackage.PROJECT__DESCRIPTION:
				return getDescription();
			case JiraPackage.PROJECT__EXPANDOS:
				return getExpandos();
			case JiraPackage.PROJECT__ISSUE_TYPES:
				return getIssueTypes();
			case JiraPackage.PROJECT__LEAD:
				if (resolve) return getLead();
				return basicGetLead();
			case JiraPackage.PROJECT__PROJECT_ROLES:
				return getProjectRoles();
			case JiraPackage.PROJECT__URI:
				return getUri();
			case JiraPackage.PROJECT__VERSIONS:
				return getVersions();
			case JiraPackage.PROJECT__ISSUES:
				return getIssues();
			case JiraPackage.PROJECT__STATUS_CATEGORIES:
				return getStatusCategories();
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
			case JiraPackage.PROJECT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends BasicComponent>)newValue);
				return;
			case JiraPackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JiraPackage.PROJECT__EXPANDOS:
				getExpandos().clear();
				getExpandos().addAll((Collection<? extends String>)newValue);
				return;
			case JiraPackage.PROJECT__ISSUE_TYPES:
				getIssueTypes().clear();
				getIssueTypes().addAll((Collection<? extends IssueType>)newValue);
				return;
			case JiraPackage.PROJECT__LEAD:
				setLead((BasicUser)newValue);
				return;
			case JiraPackage.PROJECT__PROJECT_ROLES:
				getProjectRoles().clear();
				getProjectRoles().addAll((Collection<? extends BasicProjectRole>)newValue);
				return;
			case JiraPackage.PROJECT__URI:
				setUri((String)newValue);
				return;
			case JiraPackage.PROJECT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case JiraPackage.PROJECT__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends BasicIssue>)newValue);
				return;
			case JiraPackage.PROJECT__STATUS_CATEGORIES:
				getStatusCategories().clear();
				getStatusCategories().addAll((Collection<? extends StatusCategory>)newValue);
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
			case JiraPackage.PROJECT__COMPONENTS:
				getComponents().clear();
				return;
			case JiraPackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JiraPackage.PROJECT__EXPANDOS:
				getExpandos().clear();
				return;
			case JiraPackage.PROJECT__ISSUE_TYPES:
				getIssueTypes().clear();
				return;
			case JiraPackage.PROJECT__LEAD:
				setLead((BasicUser)null);
				return;
			case JiraPackage.PROJECT__PROJECT_ROLES:
				getProjectRoles().clear();
				return;
			case JiraPackage.PROJECT__URI:
				setUri(URI_EDEFAULT);
				return;
			case JiraPackage.PROJECT__VERSIONS:
				getVersions().clear();
				return;
			case JiraPackage.PROJECT__ISSUES:
				getIssues().clear();
				return;
			case JiraPackage.PROJECT__STATUS_CATEGORIES:
				getStatusCategories().clear();
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
			case JiraPackage.PROJECT__COMPONENTS:
				return !getComponents().isEmpty();
			case JiraPackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JiraPackage.PROJECT__EXPANDOS:
				return !getExpandos().isEmpty();
			case JiraPackage.PROJECT__ISSUE_TYPES:
				return !getIssueTypes().isEmpty();
			case JiraPackage.PROJECT__LEAD:
				return basicGetLead() != null;
			case JiraPackage.PROJECT__PROJECT_ROLES:
				return !getProjectRoles().isEmpty();
			case JiraPackage.PROJECT__URI:
				return URI_EDEFAULT == null ? getUri() != null : !URI_EDEFAULT.equals(getUri());
			case JiraPackage.PROJECT__VERSIONS:
				return !getVersions().isEmpty();
			case JiraPackage.PROJECT__ISSUES:
				return !getIssues().isEmpty();
			case JiraPackage.PROJECT__STATUS_CATEGORIES:
				return !getStatusCategories().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
