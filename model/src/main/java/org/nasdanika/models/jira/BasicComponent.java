/**
 */
package org.nasdanika.models.jira;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.BasicComponent#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getBasicComponent()
 * @model superTypes="org.nasdanika.models.jira.AdressableNamedIdentifiableEntity&lt;org.eclipse.emf.ecore.ELongObject&gt;"
 * @generated
 */
public interface BasicComponent extends AdressableNamedIdentifiableEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getBasicComponent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.BasicComponent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // BasicComponent
