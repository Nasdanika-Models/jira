/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.jira.IdentifiableEntity;
import org.nasdanika.models.jira.IssueField;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueFieldImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueFieldImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueFieldImpl extends NamedEntityImpl implements IssueField {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.ISSUE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(JiraPackage.ISSUE_FIELD__ID, JiraPackage.Literals.IDENTIFIABLE_ENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(JiraPackage.ISSUE_FIELD__ID, JiraPackage.Literals.IDENTIFIABLE_ENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(JiraPackage.ISSUE_FIELD__TYPE, JiraPackage.Literals.ISSUE_FIELD__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(JiraPackage.ISSUE_FIELD__TYPE, JiraPackage.Literals.ISSUE_FIELD__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getValue() {
		return (EObject)eDynamicGet(JiraPackage.ISSUE_FIELD__VALUE, JiraPackage.Literals.ISSUE_FIELD__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValue() {
		return (EObject)eDynamicGet(JiraPackage.ISSUE_FIELD__VALUE, JiraPackage.Literals.ISSUE_FIELD__VALUE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(EObject newValue) {
		eDynamicSet(JiraPackage.ISSUE_FIELD__VALUE, JiraPackage.Literals.ISSUE_FIELD__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.ISSUE_FIELD__ID:
				return getId();
			case JiraPackage.ISSUE_FIELD__TYPE:
				return getType();
			case JiraPackage.ISSUE_FIELD__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
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
			case JiraPackage.ISSUE_FIELD__ID:
				setId((String)newValue);
				return;
			case JiraPackage.ISSUE_FIELD__TYPE:
				setType((String)newValue);
				return;
			case JiraPackage.ISSUE_FIELD__VALUE:
				setValue((EObject)newValue);
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
			case JiraPackage.ISSUE_FIELD__ID:
				setId((String)null);
				return;
			case JiraPackage.ISSUE_FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case JiraPackage.ISSUE_FIELD__VALUE:
				setValue((EObject)null);
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
			case JiraPackage.ISSUE_FIELD__ID:
				return getId() != null;
			case JiraPackage.ISSUE_FIELD__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case JiraPackage.ISSUE_FIELD__VALUE:
				return basicGetValue() != null;
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
				case JiraPackage.ISSUE_FIELD__ID: return JiraPackage.IDENTIFIABLE_ENTITY__ID;
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
				case JiraPackage.IDENTIFIABLE_ENTITY__ID: return JiraPackage.ISSUE_FIELD__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IssueFieldImpl
