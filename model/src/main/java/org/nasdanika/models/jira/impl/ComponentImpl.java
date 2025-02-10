/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.AssigneeType;
import org.nasdanika.models.jira.BasicUser;
import org.nasdanika.models.jira.Component;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.ComponentImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ComponentImpl#getAssigneeType <em>Assignee Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ComponentImpl#isIsAssigneeTypeValid <em>Is Assignee Type Valid</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ComponentImpl#getRealAssignee <em>Real Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ComponentImpl#getRealAssigneeType <em>Real Assignee Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends BasicComponentImpl implements Component {
	/**
	 * The default value of the '{@link #getAssigneeType() <em>Assignee Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigneeType()
	 * @generated
	 * @ordered
	 */
	protected static final AssigneeType ASSIGNEE_TYPE_EDEFAULT = AssigneeType.PROJECT_DEFAULT;

	/**
	 * The default value of the '{@link #isIsAssigneeTypeValid() <em>Is Assignee Type Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssigneeTypeValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSIGNEE_TYPE_VALID_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getRealAssigneeType() <em>Real Assignee Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealAssigneeType()
	 * @generated
	 * @ordered
	 */
	protected static final AssigneeType REAL_ASSIGNEE_TYPE_EDEFAULT = AssigneeType.PROJECT_DEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUser getAssignee() {
		return (BasicUser)eDynamicGet(JiraPackage.COMPONENT__ASSIGNEE, JiraPackage.Literals.COMPONENT__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicUser basicGetAssignee() {
		return (BasicUser)eDynamicGet(JiraPackage.COMPONENT__ASSIGNEE, JiraPackage.Literals.COMPONENT__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(BasicUser newAssignee) {
		eDynamicSet(JiraPackage.COMPONENT__ASSIGNEE, JiraPackage.Literals.COMPONENT__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssigneeType getAssigneeType() {
		return (AssigneeType)eDynamicGet(JiraPackage.COMPONENT__ASSIGNEE_TYPE, JiraPackage.Literals.COMPONENT__ASSIGNEE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssigneeType(AssigneeType newAssigneeType) {
		eDynamicSet(JiraPackage.COMPONENT__ASSIGNEE_TYPE, JiraPackage.Literals.COMPONENT__ASSIGNEE_TYPE, newAssigneeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAssigneeTypeValid() {
		return (Boolean)eDynamicGet(JiraPackage.COMPONENT__IS_ASSIGNEE_TYPE_VALID, JiraPackage.Literals.COMPONENT__IS_ASSIGNEE_TYPE_VALID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAssigneeTypeValid(boolean newIsAssigneeTypeValid) {
		eDynamicSet(JiraPackage.COMPONENT__IS_ASSIGNEE_TYPE_VALID, JiraPackage.Literals.COMPONENT__IS_ASSIGNEE_TYPE_VALID, newIsAssigneeTypeValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUser getRealAssignee() {
		return (BasicUser)eDynamicGet(JiraPackage.COMPONENT__REAL_ASSIGNEE, JiraPackage.Literals.COMPONENT__REAL_ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicUser basicGetRealAssignee() {
		return (BasicUser)eDynamicGet(JiraPackage.COMPONENT__REAL_ASSIGNEE, JiraPackage.Literals.COMPONENT__REAL_ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealAssignee(BasicUser newRealAssignee) {
		eDynamicSet(JiraPackage.COMPONENT__REAL_ASSIGNEE, JiraPackage.Literals.COMPONENT__REAL_ASSIGNEE, newRealAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssigneeType getRealAssigneeType() {
		return (AssigneeType)eDynamicGet(JiraPackage.COMPONENT__REAL_ASSIGNEE_TYPE, JiraPackage.Literals.COMPONENT__REAL_ASSIGNEE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealAssigneeType(AssigneeType newRealAssigneeType) {
		eDynamicSet(JiraPackage.COMPONENT__REAL_ASSIGNEE_TYPE, JiraPackage.Literals.COMPONENT__REAL_ASSIGNEE_TYPE, newRealAssigneeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.COMPONENT__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case JiraPackage.COMPONENT__ASSIGNEE_TYPE:
				return getAssigneeType();
			case JiraPackage.COMPONENT__IS_ASSIGNEE_TYPE_VALID:
				return isIsAssigneeTypeValid();
			case JiraPackage.COMPONENT__REAL_ASSIGNEE:
				if (resolve) return getRealAssignee();
				return basicGetRealAssignee();
			case JiraPackage.COMPONENT__REAL_ASSIGNEE_TYPE:
				return getRealAssigneeType();
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
			case JiraPackage.COMPONENT__ASSIGNEE:
				setAssignee((BasicUser)newValue);
				return;
			case JiraPackage.COMPONENT__ASSIGNEE_TYPE:
				setAssigneeType((AssigneeType)newValue);
				return;
			case JiraPackage.COMPONENT__IS_ASSIGNEE_TYPE_VALID:
				setIsAssigneeTypeValid((Boolean)newValue);
				return;
			case JiraPackage.COMPONENT__REAL_ASSIGNEE:
				setRealAssignee((BasicUser)newValue);
				return;
			case JiraPackage.COMPONENT__REAL_ASSIGNEE_TYPE:
				setRealAssigneeType((AssigneeType)newValue);
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
			case JiraPackage.COMPONENT__ASSIGNEE:
				setAssignee((BasicUser)null);
				return;
			case JiraPackage.COMPONENT__ASSIGNEE_TYPE:
				setAssigneeType(ASSIGNEE_TYPE_EDEFAULT);
				return;
			case JiraPackage.COMPONENT__IS_ASSIGNEE_TYPE_VALID:
				setIsAssigneeTypeValid(IS_ASSIGNEE_TYPE_VALID_EDEFAULT);
				return;
			case JiraPackage.COMPONENT__REAL_ASSIGNEE:
				setRealAssignee((BasicUser)null);
				return;
			case JiraPackage.COMPONENT__REAL_ASSIGNEE_TYPE:
				setRealAssigneeType(REAL_ASSIGNEE_TYPE_EDEFAULT);
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
			case JiraPackage.COMPONENT__ASSIGNEE:
				return basicGetAssignee() != null;
			case JiraPackage.COMPONENT__ASSIGNEE_TYPE:
				return getAssigneeType() != ASSIGNEE_TYPE_EDEFAULT;
			case JiraPackage.COMPONENT__IS_ASSIGNEE_TYPE_VALID:
				return isIsAssigneeTypeValid() != IS_ASSIGNEE_TYPE_VALID_EDEFAULT;
			case JiraPackage.COMPONENT__REAL_ASSIGNEE:
				return basicGetRealAssignee() != null;
			case JiraPackage.COMPONENT__REAL_ASSIGNEE_TYPE:
				return getRealAssigneeType() != REAL_ASSIGNEE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
