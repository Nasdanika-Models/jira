/**
 */
package org.nasdanika.models.jira;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.StatusCategory#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.StatusCategory#getColorName <em>Color Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getStatusCategory()
 * @model superTypes="org.nasdanika.models.jira.AdressableNamedIdentifiableEntity&lt;org.eclipse.emf.ecore.ELongObject&gt;"
 * @generated
 */
public interface StatusCategory extends AdressableNamedIdentifiableEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getStatusCategory_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.StatusCategory#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Color Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Name</em>' attribute.
	 * @see #setColorName(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getStatusCategory_ColorName()
	 * @model
	 * @generated
	 */
	String getColorName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.StatusCategory#getColorName <em>Color Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Name</em>' attribute.
	 * @see #getColorName()
	 * @generated
	 */
	void setColorName(String value);

} // StatusCategory
