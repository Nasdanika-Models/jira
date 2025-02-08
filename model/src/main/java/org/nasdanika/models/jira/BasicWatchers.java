/**
 */
package org.nasdanika.models.jira;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Watchers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.BasicWatchers#isIsWatching <em>Is Watching</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.BasicWatchers#getNumWatchers <em>Num Watchers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getBasicWatchers()
 * @model
 * @generated
 */
public interface BasicWatchers extends AddressableEntity {
	/**
	 * Returns the value of the '<em><b>Is Watching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Watching</em>' attribute.
	 * @see #setIsWatching(boolean)
	 * @see org.nasdanika.models.jira.JiraPackage#getBasicWatchers_IsWatching()
	 * @model
	 * @generated
	 */
	boolean isIsWatching();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.BasicWatchers#isIsWatching <em>Is Watching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Watching</em>' attribute.
	 * @see #isIsWatching()
	 * @generated
	 */
	void setIsWatching(boolean value);

	/**
	 * Returns the value of the '<em><b>Num Watchers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Watchers</em>' attribute.
	 * @see #setNumWatchers(int)
	 * @see org.nasdanika.models.jira.JiraPackage#getBasicWatchers_NumWatchers()
	 * @model
	 * @generated
	 */
	int getNumWatchers();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.BasicWatchers#getNumWatchers <em>Num Watchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Watchers</em>' attribute.
	 * @see #getNumWatchers()
	 * @generated
	 */
	void setNumWatchers(int value);

} // BasicWatchers
