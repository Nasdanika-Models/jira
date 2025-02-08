/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.IdentifiableEntity#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getIdentifiableEntity()
 * @model abstract="true"
 * @generated
 */
public interface IdentifiableEntity<T> extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Object)
	 * @see org.nasdanika.models.jira.JiraPackage#getIdentifiableEntity_Id()
	 * @model
	 * @generated
	 */
	T getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.IdentifiableEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(T value);

} // IdentifiableEntity
