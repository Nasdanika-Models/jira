/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.TimeTracking;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Tracking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.TimeTrackingImpl#getOriginalEstimateMinutes <em>Original Estimate Minutes</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.TimeTrackingImpl#getRemainingEstimateMinutes <em>Remaining Estimate Minutes</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.TimeTrackingImpl#getTimeSpentMinutes <em>Time Spent Minutes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeTrackingImpl extends MinimalEObjectImpl.Container implements TimeTracking {
	/**
	 * The default value of the '{@link #getOriginalEstimateMinutes() <em>Original Estimate Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalEstimateMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORIGINAL_ESTIMATE_MINUTES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRemainingEstimateMinutes() <em>Remaining Estimate Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingEstimateMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMAINING_ESTIMATE_MINUTES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTimeSpentMinutes() <em>Time Spent Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpentMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TIME_SPENT_MINUTES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTrackingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.TIME_TRACKING;
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
	public Integer getOriginalEstimateMinutes() {
		return (Integer)eDynamicGet(JiraPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES, JiraPackage.Literals.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalEstimateMinutes(Integer newOriginalEstimateMinutes) {
		eDynamicSet(JiraPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES, JiraPackage.Literals.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES, newOriginalEstimateMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemainingEstimateMinutes() {
		return (Integer)eDynamicGet(JiraPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES, JiraPackage.Literals.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingEstimateMinutes(Integer newRemainingEstimateMinutes) {
		eDynamicSet(JiraPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES, JiraPackage.Literals.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES, newRemainingEstimateMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTimeSpentMinutes() {
		return (Integer)eDynamicGet(JiraPackage.TIME_TRACKING__TIME_SPENT_MINUTES, JiraPackage.Literals.TIME_TRACKING__TIME_SPENT_MINUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeSpentMinutes(Integer newTimeSpentMinutes) {
		eDynamicSet(JiraPackage.TIME_TRACKING__TIME_SPENT_MINUTES, JiraPackage.Literals.TIME_TRACKING__TIME_SPENT_MINUTES, newTimeSpentMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES:
				return getOriginalEstimateMinutes();
			case JiraPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES:
				return getRemainingEstimateMinutes();
			case JiraPackage.TIME_TRACKING__TIME_SPENT_MINUTES:
				return getTimeSpentMinutes();
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
			case JiraPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES:
				setOriginalEstimateMinutes((Integer)newValue);
				return;
			case JiraPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES:
				setRemainingEstimateMinutes((Integer)newValue);
				return;
			case JiraPackage.TIME_TRACKING__TIME_SPENT_MINUTES:
				setTimeSpentMinutes((Integer)newValue);
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
			case JiraPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES:
				setOriginalEstimateMinutes(ORIGINAL_ESTIMATE_MINUTES_EDEFAULT);
				return;
			case JiraPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES:
				setRemainingEstimateMinutes(REMAINING_ESTIMATE_MINUTES_EDEFAULT);
				return;
			case JiraPackage.TIME_TRACKING__TIME_SPENT_MINUTES:
				setTimeSpentMinutes(TIME_SPENT_MINUTES_EDEFAULT);
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
			case JiraPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES:
				return ORIGINAL_ESTIMATE_MINUTES_EDEFAULT == null ? getOriginalEstimateMinutes() != null : !ORIGINAL_ESTIMATE_MINUTES_EDEFAULT.equals(getOriginalEstimateMinutes());
			case JiraPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES:
				return REMAINING_ESTIMATE_MINUTES_EDEFAULT == null ? getRemainingEstimateMinutes() != null : !REMAINING_ESTIMATE_MINUTES_EDEFAULT.equals(getRemainingEstimateMinutes());
			case JiraPackage.TIME_TRACKING__TIME_SPENT_MINUTES:
				return TIME_SPENT_MINUTES_EDEFAULT == null ? getTimeSpentMinutes() != null : !TIME_SPENT_MINUTES_EDEFAULT.equals(getTimeSpentMinutes());
		}
		return super.eIsSet(featureID);
	}

} //TimeTrackingImpl
