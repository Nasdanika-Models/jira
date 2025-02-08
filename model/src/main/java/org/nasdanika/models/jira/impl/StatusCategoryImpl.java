/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.StatusCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.StatusCategoryImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.StatusCategoryImpl#getColorName <em>Color Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusCategoryImpl extends AdressableNamedIdentifiableEntityImpl<Long> implements StatusCategory {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getColorName() <em>Color Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.STATUS_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		super.setId(newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return (String)eDynamicGet(JiraPackage.STATUS_CATEGORY__KEY, JiraPackage.Literals.STATUS_CATEGORY__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		eDynamicSet(JiraPackage.STATUS_CATEGORY__KEY, JiraPackage.Literals.STATUS_CATEGORY__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColorName() {
		return (String)eDynamicGet(JiraPackage.STATUS_CATEGORY__COLOR_NAME, JiraPackage.Literals.STATUS_CATEGORY__COLOR_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorName(String newColorName) {
		eDynamicSet(JiraPackage.STATUS_CATEGORY__COLOR_NAME, JiraPackage.Literals.STATUS_CATEGORY__COLOR_NAME, newColorName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.STATUS_CATEGORY__KEY:
				return getKey();
			case JiraPackage.STATUS_CATEGORY__COLOR_NAME:
				return getColorName();
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
			case JiraPackage.STATUS_CATEGORY__KEY:
				setKey((String)newValue);
				return;
			case JiraPackage.STATUS_CATEGORY__COLOR_NAME:
				setColorName((String)newValue);
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
			case JiraPackage.STATUS_CATEGORY__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case JiraPackage.STATUS_CATEGORY__COLOR_NAME:
				setColorName(COLOR_NAME_EDEFAULT);
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
			case JiraPackage.STATUS_CATEGORY__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case JiraPackage.STATUS_CATEGORY__COLOR_NAME:
				return COLOR_NAME_EDEFAULT == null ? getColorName() != null : !COLOR_NAME_EDEFAULT.equals(getColorName());
		}
		return super.eIsSet(featureID);
	}

} //StatusCategoryImpl
