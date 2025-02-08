/**
 */
package org.nasdanika.models.jira;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Status#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Status#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Status#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getStatus()
 * @model superTypes="org.nasdanika.models.jira.AdressableNamedIdentifiableEntity&lt;org.eclipse.emf.ecore.ELongObject&gt;"
 * @generated
 */
public interface Status extends AdressableNamedIdentifiableEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getStatus_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Status#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Url</em>' attribute.
	 * @see #setIconUrl(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getStatus_IconUrl()
	 * @model
	 * @generated
	 */
	String getIconUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Status#getIconUrl <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Url</em>' attribute.
	 * @see #getIconUrl()
	 * @generated
	 */
	void setIconUrl(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(StatusCategory)
	 * @see org.nasdanika.models.jira.JiraPackage#getStatus_Value()
	 * @model
	 * @generated
	 */
	StatusCategory getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Status#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(StatusCategory value);

} // Status
