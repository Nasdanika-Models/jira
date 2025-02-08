/**
 */
package org.nasdanika.models.jira;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Changelog Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.ChangelogGroup#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.ChangelogGroup#getCreated <em>Created</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.ChangelogGroup#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getChangelogGroup()
 * @model
 * @generated
 */
public interface ChangelogGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(BasicUser)
	 * @see org.nasdanika.models.jira.JiraPackage#getChangelogGroup_Author()
	 * @model
	 * @generated
	 */
	BasicUser getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.ChangelogGroup#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(BasicUser value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getChangelogGroup_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.ChangelogGroup#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.ChangelogItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getChangelogGroup_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangelogItem> getItems();

} // ChangelogGroup
