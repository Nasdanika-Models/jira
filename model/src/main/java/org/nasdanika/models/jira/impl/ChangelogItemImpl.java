/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.jira.ChangelogItem;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Changelog Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.ChangelogItemImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ChangelogItemImpl#isCustom <em>Custom</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ChangelogItemImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ChangelogItemImpl#getFromString <em>From String</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ChangelogItemImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ChangelogItemImpl#getToString <em>To String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangelogItemImpl extends MinimalEObjectImpl.Container implements ChangelogItem {
	/**
	 * The default value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isCustom() <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOM_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFromString() <em>From String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromString()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getToString() <em>To String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToString()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_STRING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangelogItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.CHANGELOG_ITEM;
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
	@Override
	public String getField() {
		return (String)eDynamicGet(JiraPackage.CHANGELOG_ITEM__FIELD, JiraPackage.Literals.CHANGELOG_ITEM__FIELD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(String newField) {
		eDynamicSet(JiraPackage.CHANGELOG_ITEM__FIELD, JiraPackage.Literals.CHANGELOG_ITEM__FIELD, newField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCustom() {
		return (Boolean)eDynamicGet(JiraPackage.CHANGELOG_ITEM__CUSTOM, JiraPackage.Literals.CHANGELOG_ITEM__CUSTOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustom(boolean newCustom) {
		eDynamicSet(JiraPackage.CHANGELOG_ITEM__CUSTOM, JiraPackage.Literals.CHANGELOG_ITEM__CUSTOM, newCustom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrom() {
		return (String)eDynamicGet(JiraPackage.CHANGELOG_ITEM__FROM, JiraPackage.Literals.CHANGELOG_ITEM__FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(String newFrom) {
		eDynamicSet(JiraPackage.CHANGELOG_ITEM__FROM, JiraPackage.Literals.CHANGELOG_ITEM__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromString() {
		return (String)eDynamicGet(JiraPackage.CHANGELOG_ITEM__FROM_STRING, JiraPackage.Literals.CHANGELOG_ITEM__FROM_STRING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromString(String newFromString) {
		eDynamicSet(JiraPackage.CHANGELOG_ITEM__FROM_STRING, JiraPackage.Literals.CHANGELOG_ITEM__FROM_STRING, newFromString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTo() {
		return (String)eDynamicGet(JiraPackage.CHANGELOG_ITEM__TO, JiraPackage.Literals.CHANGELOG_ITEM__TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(String newTo) {
		eDynamicSet(JiraPackage.CHANGELOG_ITEM__TO, JiraPackage.Literals.CHANGELOG_ITEM__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToString() {
		return (String)eDynamicGet(JiraPackage.CHANGELOG_ITEM__TO_STRING, JiraPackage.Literals.CHANGELOG_ITEM__TO_STRING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToString(String newToString) {
		eDynamicSet(JiraPackage.CHANGELOG_ITEM__TO_STRING, JiraPackage.Literals.CHANGELOG_ITEM__TO_STRING, newToString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.CHANGELOG_ITEM__FIELD:
				return getField();
			case JiraPackage.CHANGELOG_ITEM__CUSTOM:
				return isCustom();
			case JiraPackage.CHANGELOG_ITEM__FROM:
				return getFrom();
			case JiraPackage.CHANGELOG_ITEM__FROM_STRING:
				return getFromString();
			case JiraPackage.CHANGELOG_ITEM__TO:
				return getTo();
			case JiraPackage.CHANGELOG_ITEM__TO_STRING:
				return getToString();
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
			case JiraPackage.CHANGELOG_ITEM__FIELD:
				setField((String)newValue);
				return;
			case JiraPackage.CHANGELOG_ITEM__CUSTOM:
				setCustom((Boolean)newValue);
				return;
			case JiraPackage.CHANGELOG_ITEM__FROM:
				setFrom((String)newValue);
				return;
			case JiraPackage.CHANGELOG_ITEM__FROM_STRING:
				setFromString((String)newValue);
				return;
			case JiraPackage.CHANGELOG_ITEM__TO:
				setTo((String)newValue);
				return;
			case JiraPackage.CHANGELOG_ITEM__TO_STRING:
				setToString((String)newValue);
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
			case JiraPackage.CHANGELOG_ITEM__FIELD:
				setField(FIELD_EDEFAULT);
				return;
			case JiraPackage.CHANGELOG_ITEM__CUSTOM:
				setCustom(CUSTOM_EDEFAULT);
				return;
			case JiraPackage.CHANGELOG_ITEM__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case JiraPackage.CHANGELOG_ITEM__FROM_STRING:
				setFromString(FROM_STRING_EDEFAULT);
				return;
			case JiraPackage.CHANGELOG_ITEM__TO:
				setTo(TO_EDEFAULT);
				return;
			case JiraPackage.CHANGELOG_ITEM__TO_STRING:
				setToString(TO_STRING_EDEFAULT);
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
			case JiraPackage.CHANGELOG_ITEM__FIELD:
				return FIELD_EDEFAULT == null ? getField() != null : !FIELD_EDEFAULT.equals(getField());
			case JiraPackage.CHANGELOG_ITEM__CUSTOM:
				return isCustom() != CUSTOM_EDEFAULT;
			case JiraPackage.CHANGELOG_ITEM__FROM:
				return FROM_EDEFAULT == null ? getFrom() != null : !FROM_EDEFAULT.equals(getFrom());
			case JiraPackage.CHANGELOG_ITEM__FROM_STRING:
				return FROM_STRING_EDEFAULT == null ? getFromString() != null : !FROM_STRING_EDEFAULT.equals(getFromString());
			case JiraPackage.CHANGELOG_ITEM__TO:
				return TO_EDEFAULT == null ? getTo() != null : !TO_EDEFAULT.equals(getTo());
			case JiraPackage.CHANGELOG_ITEM__TO_STRING:
				return TO_STRING_EDEFAULT == null ? getToString() != null : !TO_STRING_EDEFAULT.equals(getToString());
		}
		return super.eIsSet(featureID);
	}

} //ChangelogItemImpl
