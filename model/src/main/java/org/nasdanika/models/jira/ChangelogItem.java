/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Changelog Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.ChangelogItem#getField <em>Field</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.ChangelogItem#isCustom <em>Custom</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.ChangelogItem#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.ChangelogItem#getFromString <em>From String</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.ChangelogItem#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.ChangelogItem#getToString <em>To String</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getChangelogItem()
 * @model
 * @generated
 */
public interface ChangelogItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getChangelogItem_Field()
	 * @model
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.ChangelogItem#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom</em>' attribute.
	 * @see #setCustom(boolean)
	 * @see org.nasdanika.models.jira.JiraPackage#getChangelogItem_Custom()
	 * @model
	 * @generated
	 */
	boolean isCustom();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.ChangelogItem#isCustom <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom</em>' attribute.
	 * @see #isCustom()
	 * @generated
	 */
	void setCustom(boolean value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getChangelogItem_From()
	 * @model
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.ChangelogItem#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>From String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From String</em>' attribute.
	 * @see #setFromString(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getChangelogItem_FromString()
	 * @model
	 * @generated
	 */
	String getFromString();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.ChangelogItem#getFromString <em>From String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From String</em>' attribute.
	 * @see #getFromString()
	 * @generated
	 */
	void setFromString(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getChangelogItem_To()
	 * @model
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.ChangelogItem#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>To String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To String</em>' attribute.
	 * @see #setToString(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getChangelogItem_ToString()
	 * @model
	 * @generated
	 */
	String getToString();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.ChangelogItem#getToString <em>To String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To String</em>' attribute.
	 * @see #getToString()
	 * @generated
	 */
	void setToString(String value);

} // ChangelogItem
