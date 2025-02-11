/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.jira.IdentifiableEntity;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.ProjectRole;
import org.nasdanika.models.jira.RoleActor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectRoleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectRoleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ProjectRoleImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectRoleImpl extends BasicProjectRoleImpl implements ProjectRole {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.PROJECT_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(JiraPackage.PROJECT_ROLE__ID, JiraPackage.Literals.IDENTIFIABLE_ENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(JiraPackage.PROJECT_ROLE__ID, JiraPackage.Literals.IDENTIFIABLE_ENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(JiraPackage.PROJECT_ROLE__DESCRIPTION, JiraPackage.Literals.PROJECT_ROLE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(JiraPackage.PROJECT_ROLE__DESCRIPTION, JiraPackage.Literals.PROJECT_ROLE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RoleActor> getActors() {
		return (EList<RoleActor>)eDynamicGet(JiraPackage.PROJECT_ROLE__ACTORS, JiraPackage.Literals.PROJECT_ROLE__ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPackage.PROJECT_ROLE__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
			case JiraPackage.PROJECT_ROLE__ID:
				return getId();
			case JiraPackage.PROJECT_ROLE__DESCRIPTION:
				return getDescription();
			case JiraPackage.PROJECT_ROLE__ACTORS:
				return getActors();
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
			case JiraPackage.PROJECT_ROLE__ID:
				setId((Long)newValue);
				return;
			case JiraPackage.PROJECT_ROLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JiraPackage.PROJECT_ROLE__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends RoleActor>)newValue);
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
			case JiraPackage.PROJECT_ROLE__ID:
				setId((Long)null);
				return;
			case JiraPackage.PROJECT_ROLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JiraPackage.PROJECT_ROLE__ACTORS:
				getActors().clear();
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
			case JiraPackage.PROJECT_ROLE__ID:
				return getId() != null;
			case JiraPackage.PROJECT_ROLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JiraPackage.PROJECT_ROLE__ACTORS:
				return !getActors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiableEntity.class) {
			switch (derivedFeatureID) {
				case JiraPackage.PROJECT_ROLE__ID: return JiraPackage.IDENTIFIABLE_ENTITY__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiableEntity.class) {
			switch (baseFeatureID) {
				case JiraPackage.IDENTIFIABLE_ENTITY__ID: return JiraPackage.PROJECT_ROLE__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProjectRoleImpl
