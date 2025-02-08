/**
 */
package org.nasdanika.models.jira;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Attachment#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Attachment#getContentUri <em>Content Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Attachment#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Attachment#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Attachment#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Attachment#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Attachment#getThumbnailUri <em>Thumbnail Uri</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getAttachment()
 * @model
 * @generated
 */
public interface Attachment extends AddressableEntity {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(BasicUser)
	 * @see org.nasdanika.models.jira.JiraPackage#getAttachment_Author()
	 * @model
	 * @generated
	 */
	BasicUser getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Attachment#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(BasicUser value);

	/**
	 * Returns the value of the '<em><b>Content Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Uri</em>' attribute.
	 * @see #setContentUri(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getAttachment_ContentUri()
	 * @model
	 * @generated
	 */
	String getContentUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Attachment#getContentUri <em>Content Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Uri</em>' attribute.
	 * @see #getContentUri()
	 * @generated
	 */
	void setContentUri(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getAttachment_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Attachment#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getAttachment_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Attachment#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getAttachment_MimeType()
	 * @model
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Attachment#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.nasdanika.models.jira.JiraPackage#getAttachment_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Attachment#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Thumbnail Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumbnail Uri</em>' attribute.
	 * @see #setThumbnailUri(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getAttachment_ThumbnailUri()
	 * @model
	 * @generated
	 */
	String getThumbnailUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Attachment#getThumbnailUri <em>Thumbnail Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbnail Uri</em>' attribute.
	 * @see #getThumbnailUri()
	 * @generated
	 */
	void setThumbnailUri(String value);

} // Attachment
