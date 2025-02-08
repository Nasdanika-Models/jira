/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.Attachment;
import org.nasdanika.models.jira.BasicUser;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.AttachmentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.AttachmentImpl#getContentUri <em>Content Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.AttachmentImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.AttachmentImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.AttachmentImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.AttachmentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.AttachmentImpl#getThumbnailUri <em>Thumbnail Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentImpl extends AddressableEntityImpl implements Attachment {
	/**
	 * The default value of the '{@link #getContentUri() <em>Content Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentUri()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getThumbnailUri() <em>Thumbnail Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailUri()
	 * @generated
	 * @ordered
	 */
	protected static final String THUMBNAIL_URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUser getAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.ATTACHMENT__AUTHOR, JiraPackage.Literals.ATTACHMENT__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicUser basicGetAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.ATTACHMENT__AUTHOR, JiraPackage.Literals.ATTACHMENT__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(BasicUser newAuthor) {
		eDynamicSet(JiraPackage.ATTACHMENT__AUTHOR, JiraPackage.Literals.ATTACHMENT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentUri() {
		return (String)eDynamicGet(JiraPackage.ATTACHMENT__CONTENT_URI, JiraPackage.Literals.ATTACHMENT__CONTENT_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentUri(String newContentUri) {
		eDynamicSet(JiraPackage.ATTACHMENT__CONTENT_URI, JiraPackage.Literals.ATTACHMENT__CONTENT_URI, newContentUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreationDate() {
		return (Date)eDynamicGet(JiraPackage.ATTACHMENT__CREATION_DATE, JiraPackage.Literals.ATTACHMENT__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(JiraPackage.ATTACHMENT__CREATION_DATE, JiraPackage.Literals.ATTACHMENT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilename() {
		return (String)eDynamicGet(JiraPackage.ATTACHMENT__FILENAME, JiraPackage.Literals.ATTACHMENT__FILENAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilename(String newFilename) {
		eDynamicSet(JiraPackage.ATTACHMENT__FILENAME, JiraPackage.Literals.ATTACHMENT__FILENAME, newFilename);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimeType() {
		return (String)eDynamicGet(JiraPackage.ATTACHMENT__MIME_TYPE, JiraPackage.Literals.ATTACHMENT__MIME_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeType(String newMimeType) {
		eDynamicSet(JiraPackage.ATTACHMENT__MIME_TYPE, JiraPackage.Literals.ATTACHMENT__MIME_TYPE, newMimeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return (Integer)eDynamicGet(JiraPackage.ATTACHMENT__SIZE, JiraPackage.Literals.ATTACHMENT__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		eDynamicSet(JiraPackage.ATTACHMENT__SIZE, JiraPackage.Literals.ATTACHMENT__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThumbnailUri() {
		return (String)eDynamicGet(JiraPackage.ATTACHMENT__THUMBNAIL_URI, JiraPackage.Literals.ATTACHMENT__THUMBNAIL_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThumbnailUri(String newThumbnailUri) {
		eDynamicSet(JiraPackage.ATTACHMENT__THUMBNAIL_URI, JiraPackage.Literals.ATTACHMENT__THUMBNAIL_URI, newThumbnailUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.ATTACHMENT__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case JiraPackage.ATTACHMENT__CONTENT_URI:
				return getContentUri();
			case JiraPackage.ATTACHMENT__CREATION_DATE:
				return getCreationDate();
			case JiraPackage.ATTACHMENT__FILENAME:
				return getFilename();
			case JiraPackage.ATTACHMENT__MIME_TYPE:
				return getMimeType();
			case JiraPackage.ATTACHMENT__SIZE:
				return getSize();
			case JiraPackage.ATTACHMENT__THUMBNAIL_URI:
				return getThumbnailUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JiraPackage.ATTACHMENT__AUTHOR:
				setAuthor((BasicUser)newValue);
				return;
			case JiraPackage.ATTACHMENT__CONTENT_URI:
				setContentUri((String)newValue);
				return;
			case JiraPackage.ATTACHMENT__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case JiraPackage.ATTACHMENT__FILENAME:
				setFilename((String)newValue);
				return;
			case JiraPackage.ATTACHMENT__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case JiraPackage.ATTACHMENT__SIZE:
				setSize((Integer)newValue);
				return;
			case JiraPackage.ATTACHMENT__THUMBNAIL_URI:
				setThumbnailUri((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JiraPackage.ATTACHMENT__AUTHOR:
				setAuthor((BasicUser)null);
				return;
			case JiraPackage.ATTACHMENT__CONTENT_URI:
				setContentUri(CONTENT_URI_EDEFAULT);
				return;
			case JiraPackage.ATTACHMENT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case JiraPackage.ATTACHMENT__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case JiraPackage.ATTACHMENT__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case JiraPackage.ATTACHMENT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case JiraPackage.ATTACHMENT__THUMBNAIL_URI:
				setThumbnailUri(THUMBNAIL_URI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JiraPackage.ATTACHMENT__AUTHOR:
				return basicGetAuthor() != null;
			case JiraPackage.ATTACHMENT__CONTENT_URI:
				return CONTENT_URI_EDEFAULT == null ? getContentUri() != null : !CONTENT_URI_EDEFAULT.equals(getContentUri());
			case JiraPackage.ATTACHMENT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case JiraPackage.ATTACHMENT__FILENAME:
				return FILENAME_EDEFAULT == null ? getFilename() != null : !FILENAME_EDEFAULT.equals(getFilename());
			case JiraPackage.ATTACHMENT__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? getMimeType() != null : !MIME_TYPE_EDEFAULT.equals(getMimeType());
			case JiraPackage.ATTACHMENT__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case JiraPackage.ATTACHMENT__THUMBNAIL_URI:
				return THUMBNAIL_URI_EDEFAULT == null ? getThumbnailUri() != null : !THUMBNAIL_URI_EDEFAULT.equals(getThumbnailUri());
		}
		return super.eIsSet(featureID);
	}

} //AttachmentImpl
