/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addressable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.AddressableEntity#getSelf <em>Self</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getAddressableEntity()
 * @model abstract="true"
 * @generated
 */
public interface AddressableEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self</em>' attribute.
	 * @see #setSelf(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getAddressableEntity_Self()
	 * @model
	 * @generated
	 */
	String getSelf();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.AddressableEntity#getSelf <em>Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self</em>' attribute.
	 * @see #getSelf()
	 * @generated
	 */
	void setSelf(String value);

} // AddressableEntity
