/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Status;
import org.nasdanika.models.jira.StatusCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.StatusImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.StatusImpl#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.StatusImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusImpl extends AdressableNamedIdentifiableEntityImpl<Long> implements Status {
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
	 * The default value of the '{@link #getIconUrl() <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.STATUS;
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
	public String getDescription() {
		return (String)eDynamicGet(JiraPackage.STATUS__DESCRIPTION, JiraPackage.Literals.STATUS__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(JiraPackage.STATUS__DESCRIPTION, JiraPackage.Literals.STATUS__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIconUrl() {
		return (String)eDynamicGet(JiraPackage.STATUS__ICON_URL, JiraPackage.Literals.STATUS__ICON_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconUrl(String newIconUrl) {
		eDynamicSet(JiraPackage.STATUS__ICON_URL, JiraPackage.Literals.STATUS__ICON_URL, newIconUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusCategory getValue() {
		return (StatusCategory)eDynamicGet(JiraPackage.STATUS__VALUE, JiraPackage.Literals.STATUS__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCategory basicGetValue() {
		return (StatusCategory)eDynamicGet(JiraPackage.STATUS__VALUE, JiraPackage.Literals.STATUS__VALUE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(StatusCategory newValue) {
		eDynamicSet(JiraPackage.STATUS__VALUE, JiraPackage.Literals.STATUS__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.STATUS__DESCRIPTION:
				return getDescription();
			case JiraPackage.STATUS__ICON_URL:
				return getIconUrl();
			case JiraPackage.STATUS__VALUE:
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
			case JiraPackage.STATUS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JiraPackage.STATUS__ICON_URL:
				setIconUrl((String)newValue);
				return;
			case JiraPackage.STATUS__VALUE:
				setValue((StatusCategory)newValue);
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
			case JiraPackage.STATUS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JiraPackage.STATUS__ICON_URL:
				setIconUrl(ICON_URL_EDEFAULT);
				return;
			case JiraPackage.STATUS__VALUE:
				setValue((StatusCategory)null);
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
			case JiraPackage.STATUS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JiraPackage.STATUS__ICON_URL:
				return ICON_URL_EDEFAULT == null ? getIconUrl() != null : !ICON_URL_EDEFAULT.equals(getIconUrl());
			case JiraPackage.STATUS__VALUE:
				return basicGetValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //StatusImpl
