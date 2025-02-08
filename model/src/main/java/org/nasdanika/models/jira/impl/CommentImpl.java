/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.jira.BasicUser;
import org.nasdanika.models.jira.Comment;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.CommentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.CommentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.CommentImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.CommentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.CommentImpl#getSelf <em>Self</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.CommentImpl#getUpdateAuthor <em>Update Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.CommentImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.CommentImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends MinimalEObjectImpl.Container implements Comment {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSelf() <em>Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelf()
	 * @generated
	 * @ordered
	 */
	protected static final String SELF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATE_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUser getAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.COMMENT__AUTHOR, JiraPackage.Literals.COMMENT__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicUser basicGetAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.COMMENT__AUTHOR, JiraPackage.Literals.COMMENT__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(BasicUser newAuthor) {
		eDynamicSet(JiraPackage.COMMENT__AUTHOR, JiraPackage.Literals.COMMENT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return (String)eDynamicGet(JiraPackage.COMMENT__BODY, JiraPackage.Literals.COMMENT__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		eDynamicSet(JiraPackage.COMMENT__BODY, JiraPackage.Literals.COMMENT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreationDate() {
		return (Date)eDynamicGet(JiraPackage.COMMENT__CREATION_DATE, JiraPackage.Literals.COMMENT__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(JiraPackage.COMMENT__CREATION_DATE, JiraPackage.Literals.COMMENT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(JiraPackage.COMMENT__ID, JiraPackage.Literals.COMMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(JiraPackage.COMMENT__ID, JiraPackage.Literals.COMMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelf() {
		return (String)eDynamicGet(JiraPackage.COMMENT__SELF, JiraPackage.Literals.COMMENT__SELF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelf(String newSelf) {
		eDynamicSet(JiraPackage.COMMENT__SELF, JiraPackage.Literals.COMMENT__SELF, newSelf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUser getUpdateAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.COMMENT__UPDATE_AUTHOR, JiraPackage.Literals.COMMENT__UPDATE_AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicUser basicGetUpdateAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.COMMENT__UPDATE_AUTHOR, JiraPackage.Literals.COMMENT__UPDATE_AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateAuthor(BasicUser newUpdateAuthor) {
		eDynamicSet(JiraPackage.COMMENT__UPDATE_AUTHOR, JiraPackage.Literals.COMMENT__UPDATE_AUTHOR, newUpdateAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdateDate() {
		return (Date)eDynamicGet(JiraPackage.COMMENT__UPDATE_DATE, JiraPackage.Literals.COMMENT__UPDATE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateDate(Date newUpdateDate) {
		eDynamicSet(JiraPackage.COMMENT__UPDATE_DATE, JiraPackage.Literals.COMMENT__UPDATE_DATE, newUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visibility getVisibility() {
		return (Visibility)eDynamicGet(JiraPackage.COMMENT__VISIBILITY, JiraPackage.Literals.COMMENT__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibility(Visibility newVisibility, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newVisibility, JiraPackage.COMMENT__VISIBILITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(Visibility newVisibility) {
		eDynamicSet(JiraPackage.COMMENT__VISIBILITY, JiraPackage.Literals.COMMENT__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPackage.COMMENT__VISIBILITY:
				return basicSetVisibility(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.COMMENT__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case JiraPackage.COMMENT__BODY:
				return getBody();
			case JiraPackage.COMMENT__CREATION_DATE:
				return getCreationDate();
			case JiraPackage.COMMENT__ID:
				return getId();
			case JiraPackage.COMMENT__SELF:
				return getSelf();
			case JiraPackage.COMMENT__UPDATE_AUTHOR:
				if (resolve) return getUpdateAuthor();
				return basicGetUpdateAuthor();
			case JiraPackage.COMMENT__UPDATE_DATE:
				return getUpdateDate();
			case JiraPackage.COMMENT__VISIBILITY:
				return getVisibility();
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
			case JiraPackage.COMMENT__AUTHOR:
				setAuthor((BasicUser)newValue);
				return;
			case JiraPackage.COMMENT__BODY:
				setBody((String)newValue);
				return;
			case JiraPackage.COMMENT__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case JiraPackage.COMMENT__ID:
				setId((Long)newValue);
				return;
			case JiraPackage.COMMENT__SELF:
				setSelf((String)newValue);
				return;
			case JiraPackage.COMMENT__UPDATE_AUTHOR:
				setUpdateAuthor((BasicUser)newValue);
				return;
			case JiraPackage.COMMENT__UPDATE_DATE:
				setUpdateDate((Date)newValue);
				return;
			case JiraPackage.COMMENT__VISIBILITY:
				setVisibility((Visibility)newValue);
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
			case JiraPackage.COMMENT__AUTHOR:
				setAuthor((BasicUser)null);
				return;
			case JiraPackage.COMMENT__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case JiraPackage.COMMENT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case JiraPackage.COMMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case JiraPackage.COMMENT__SELF:
				setSelf(SELF_EDEFAULT);
				return;
			case JiraPackage.COMMENT__UPDATE_AUTHOR:
				setUpdateAuthor((BasicUser)null);
				return;
			case JiraPackage.COMMENT__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
				return;
			case JiraPackage.COMMENT__VISIBILITY:
				setVisibility((Visibility)null);
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
			case JiraPackage.COMMENT__AUTHOR:
				return basicGetAuthor() != null;
			case JiraPackage.COMMENT__BODY:
				return BODY_EDEFAULT == null ? getBody() != null : !BODY_EDEFAULT.equals(getBody());
			case JiraPackage.COMMENT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case JiraPackage.COMMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case JiraPackage.COMMENT__SELF:
				return SELF_EDEFAULT == null ? getSelf() != null : !SELF_EDEFAULT.equals(getSelf());
			case JiraPackage.COMMENT__UPDATE_AUTHOR:
				return basicGetUpdateAuthor() != null;
			case JiraPackage.COMMENT__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? getUpdateDate() != null : !UPDATE_DATE_EDEFAULT.equals(getUpdateDate());
			case JiraPackage.COMMENT__VISIBILITY:
				return getVisibility() != null;
		}
		return super.eIsSet(featureID);
	}

} //CommentImpl
