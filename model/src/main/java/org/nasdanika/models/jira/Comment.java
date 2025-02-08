/**
 */
package org.nasdanika.models.jira;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Comment#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Comment#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Comment#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Comment#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Comment#getSelf <em>Self</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Comment#getUpdateAuthor <em>Update Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Comment#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Comment#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(BasicUser)
	 * @see org.nasdanika.models.jira.JiraPackage#getComment_Author()
	 * @model
	 * @generated
	 */
	BasicUser getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Comment#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(BasicUser value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getComment_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getComment_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Comment#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.jira.JiraPackage#getComment_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Comment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self</em>' attribute.
	 * @see #setSelf(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getComment_Self()
	 * @model
	 * @generated
	 */
	String getSelf();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Comment#getSelf <em>Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self</em>' attribute.
	 * @see #getSelf()
	 * @generated
	 */
	void setSelf(String value);

	/**
	 * Returns the value of the '<em><b>Update Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Author</em>' reference.
	 * @see #setUpdateAuthor(BasicUser)
	 * @see org.nasdanika.models.jira.JiraPackage#getComment_UpdateAuthor()
	 * @model
	 * @generated
	 */
	BasicUser getUpdateAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Comment#getUpdateAuthor <em>Update Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Author</em>' reference.
	 * @see #getUpdateAuthor()
	 * @generated
	 */
	void setUpdateAuthor(BasicUser value);

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Date</em>' attribute.
	 * @see #setUpdateDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getComment_UpdateDate()
	 * @model
	 * @generated
	 */
	Date getUpdateDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Comment#getUpdateDate <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' attribute.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(Date value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' containment reference.
	 * @see #setVisibility(Visibility)
	 * @see org.nasdanika.models.jira.JiraPackage#getComment_Visibility()
	 * @model containment="true"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Comment#getVisibility <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' containment reference.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

} // Comment
