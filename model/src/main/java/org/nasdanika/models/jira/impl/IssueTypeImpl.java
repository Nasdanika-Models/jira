/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.jira.IssueType;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueTypeImpl#getIconUri <em>Icon Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.IssueTypeImpl#isIsSubtask <em>Is Subtask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueTypeImpl extends AdressableNamedIdentifiableEntityImpl<Long> implements IssueType {
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
	 * The default value of the '{@link #getIconUri() <em>Icon Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconUri()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIsSubtask() <em>Is Subtask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubtask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBTASK_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.ISSUE_TYPE;
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
		return (String)eDynamicGet(JiraPackage.ISSUE_TYPE__DESCRIPTION, JiraPackage.Literals.ISSUE_TYPE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(JiraPackage.ISSUE_TYPE__DESCRIPTION, JiraPackage.Literals.ISSUE_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIconUri() {
		return (String)eDynamicGet(JiraPackage.ISSUE_TYPE__ICON_URI, JiraPackage.Literals.ISSUE_TYPE__ICON_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconUri(String newIconUri) {
		eDynamicSet(JiraPackage.ISSUE_TYPE__ICON_URI, JiraPackage.Literals.ISSUE_TYPE__ICON_URI, newIconUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSubtask() {
		return (Boolean)eDynamicGet(JiraPackage.ISSUE_TYPE__IS_SUBTASK, JiraPackage.Literals.ISSUE_TYPE__IS_SUBTASK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSubtask(boolean newIsSubtask) {
		eDynamicSet(JiraPackage.ISSUE_TYPE__IS_SUBTASK, JiraPackage.Literals.ISSUE_TYPE__IS_SUBTASK, newIsSubtask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.ISSUE_TYPE__DESCRIPTION:
				return getDescription();
			case JiraPackage.ISSUE_TYPE__ICON_URI:
				return getIconUri();
			case JiraPackage.ISSUE_TYPE__IS_SUBTASK:
				return isIsSubtask();
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
			case JiraPackage.ISSUE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JiraPackage.ISSUE_TYPE__ICON_URI:
				setIconUri((String)newValue);
				return;
			case JiraPackage.ISSUE_TYPE__IS_SUBTASK:
				setIsSubtask((Boolean)newValue);
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
			case JiraPackage.ISSUE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JiraPackage.ISSUE_TYPE__ICON_URI:
				setIconUri(ICON_URI_EDEFAULT);
				return;
			case JiraPackage.ISSUE_TYPE__IS_SUBTASK:
				setIsSubtask(IS_SUBTASK_EDEFAULT);
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
			case JiraPackage.ISSUE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JiraPackage.ISSUE_TYPE__ICON_URI:
				return ICON_URI_EDEFAULT == null ? getIconUri() != null : !ICON_URI_EDEFAULT.equals(getIconUri());
			case JiraPackage.ISSUE_TYPE__IS_SUBTASK:
				return isIsSubtask() != IS_SUBTASK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //IssueTypeImpl
