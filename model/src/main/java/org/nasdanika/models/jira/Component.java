/**
 */
package org.nasdanika.models.jira;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Component#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Component#getAssigneeType <em>Assignee Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Component#isIsAssigneeTypeValid <em>Is Assignee Type Valid</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Component#getRealAssignee <em>Real Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Component#getRealAssigneeType <em>Real Assignee Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends BasicComponent {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(BasicUser)
	 * @see org.nasdanika.models.jira.JiraPackage#getComponent_Assignee()
	 * @model
	 * @generated
	 */
	BasicUser getAssignee();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Component#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(BasicUser value);

	/**
	 * Returns the value of the '<em><b>Assignee Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.jira.AssigneeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee Type</em>' attribute.
	 * @see org.nasdanika.models.jira.AssigneeType
	 * @see #setAssigneeType(AssigneeType)
	 * @see org.nasdanika.models.jira.JiraPackage#getComponent_AssigneeType()
	 * @model
	 * @generated
	 */
	AssigneeType getAssigneeType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Component#getAssigneeType <em>Assignee Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee Type</em>' attribute.
	 * @see org.nasdanika.models.jira.AssigneeType
	 * @see #getAssigneeType()
	 * @generated
	 */
	void setAssigneeType(AssigneeType value);

	/**
	 * Returns the value of the '<em><b>Is Assignee Type Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Assignee Type Valid</em>' attribute.
	 * @see #setIsAssigneeTypeValid(boolean)
	 * @see org.nasdanika.models.jira.JiraPackage#getComponent_IsAssigneeTypeValid()
	 * @model
	 * @generated
	 */
	boolean isIsAssigneeTypeValid();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Component#isIsAssigneeTypeValid <em>Is Assignee Type Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assignee Type Valid</em>' attribute.
	 * @see #isIsAssigneeTypeValid()
	 * @generated
	 */
	void setIsAssigneeTypeValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Real Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Assignee</em>' reference.
	 * @see #setRealAssignee(BasicUser)
	 * @see org.nasdanika.models.jira.JiraPackage#getComponent_RealAssignee()
	 * @model
	 * @generated
	 */
	BasicUser getRealAssignee();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Component#getRealAssignee <em>Real Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Assignee</em>' reference.
	 * @see #getRealAssignee()
	 * @generated
	 */
	void setRealAssignee(BasicUser value);

	/**
	 * Returns the value of the '<em><b>Real Assignee Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.jira.AssigneeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Assignee Type</em>' attribute.
	 * @see org.nasdanika.models.jira.AssigneeType
	 * @see #setRealAssigneeType(AssigneeType)
	 * @see org.nasdanika.models.jira.JiraPackage#getComponent_RealAssigneeType()
	 * @model
	 * @generated
	 */
	AssigneeType getRealAssigneeType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Component#getRealAssigneeType <em>Real Assignee Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Assignee Type</em>' attribute.
	 * @see org.nasdanika.models.jira.AssigneeType
	 * @see #getRealAssigneeType()
	 * @generated
	 */
	void setRealAssigneeType(AssigneeType value);

} // Component
