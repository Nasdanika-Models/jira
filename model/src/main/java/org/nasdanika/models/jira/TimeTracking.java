/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Tracking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.TimeTracking#getOriginalEstimateMinutes <em>Original Estimate Minutes</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.TimeTracking#getRemainingEstimateMinutes <em>Remaining Estimate Minutes</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.TimeTracking#getTimeSpentMinutes <em>Time Spent Minutes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getTimeTracking()
 * @model
 * @generated
 */
public interface TimeTracking extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Estimate Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Estimate Minutes</em>' attribute.
	 * @see #setOriginalEstimateMinutes(Integer)
	 * @see org.nasdanika.models.jira.JiraPackage#getTimeTracking_OriginalEstimateMinutes()
	 * @model
	 * @generated
	 */
	Integer getOriginalEstimateMinutes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.TimeTracking#getOriginalEstimateMinutes <em>Original Estimate Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Estimate Minutes</em>' attribute.
	 * @see #getOriginalEstimateMinutes()
	 * @generated
	 */
	void setOriginalEstimateMinutes(Integer value);

	/**
	 * Returns the value of the '<em><b>Remaining Estimate Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Estimate Minutes</em>' attribute.
	 * @see #setRemainingEstimateMinutes(Integer)
	 * @see org.nasdanika.models.jira.JiraPackage#getTimeTracking_RemainingEstimateMinutes()
	 * @model
	 * @generated
	 */
	Integer getRemainingEstimateMinutes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.TimeTracking#getRemainingEstimateMinutes <em>Remaining Estimate Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Estimate Minutes</em>' attribute.
	 * @see #getRemainingEstimateMinutes()
	 * @generated
	 */
	void setRemainingEstimateMinutes(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Spent Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Spent Minutes</em>' attribute.
	 * @see #setTimeSpentMinutes(Integer)
	 * @see org.nasdanika.models.jira.JiraPackage#getTimeTracking_TimeSpentMinutes()
	 * @model
	 * @generated
	 */
	Integer getTimeSpentMinutes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.TimeTracking#getTimeSpentMinutes <em>Time Spent Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Spent Minutes</em>' attribute.
	 * @see #getTimeSpentMinutes()
	 * @generated
	 */
	void setTimeSpentMinutes(Integer value);

} // TimeTracking
