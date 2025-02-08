/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.AdressableNamedIdentifiableEntity;
import org.nasdanika.models.jira.IdentifiableEntity;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adressable Named Identifiable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.AdressableNamedIdentifiableEntityImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AdressableNamedIdentifiableEntityImpl<T> extends AdressableNamedEntityImpl implements AdressableNamedIdentifiableEntity<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdressableNamedIdentifiableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T getId() {
		return (T)eDynamicGet(JiraPackage.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID, JiraPackage.Literals.IDENTIFIABLE_ENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(T newId) {
		eDynamicSet(JiraPackage.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID, JiraPackage.Literals.IDENTIFIABLE_ENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID:
				return getId();
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
			case JiraPackage.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID:
				setId((T)newValue);
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
			case JiraPackage.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID:
				setId((T)null);
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
			case JiraPackage.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID:
				return getId() != null;
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
				case JiraPackage.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID: return JiraPackage.IDENTIFIABLE_ENTITY__ID;
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
				case JiraPackage.IDENTIFIABLE_ENTITY__ID: return JiraPackage.ADRESSABLE_NAMED_IDENTIFIABLE_ENTITY__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AdressableNamedIdentifiableEntityImpl
