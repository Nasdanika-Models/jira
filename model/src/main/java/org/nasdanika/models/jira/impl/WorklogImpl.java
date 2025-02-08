/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.BasicUser;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Visibility;
import org.nasdanika.models.jira.Worklog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worklog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.WorklogImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.WorklogImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.WorklogImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.WorklogImpl#getIssueUri <em>Issue Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.WorklogImpl#getMinutesSpent <em>Minutes Spent</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.WorklogImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.WorklogImpl#getUpdateAuthor <em>Update Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.WorklogImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.WorklogImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorklogImpl extends AddressableEntityImpl implements Worklog {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

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
	 * The default value of the '{@link #getIssueUri() <em>Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueUri()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinutesSpent() <em>Minutes Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutesSpent()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTES_SPENT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

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
	protected WorklogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.WORKLOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUser getAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.WORKLOG__AUTHOR, JiraPackage.Literals.WORKLOG__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicUser basicGetAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.WORKLOG__AUTHOR, JiraPackage.Literals.WORKLOG__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(BasicUser newAuthor) {
		eDynamicSet(JiraPackage.WORKLOG__AUTHOR, JiraPackage.Literals.WORKLOG__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(JiraPackage.WORKLOG__COMMENT, JiraPackage.Literals.WORKLOG__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(JiraPackage.WORKLOG__COMMENT, JiraPackage.Literals.WORKLOG__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreationDate() {
		return (Date)eDynamicGet(JiraPackage.WORKLOG__CREATION_DATE, JiraPackage.Literals.WORKLOG__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(JiraPackage.WORKLOG__CREATION_DATE, JiraPackage.Literals.WORKLOG__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueUri() {
		return (String)eDynamicGet(JiraPackage.WORKLOG__ISSUE_URI, JiraPackage.Literals.WORKLOG__ISSUE_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueUri(String newIssueUri) {
		eDynamicSet(JiraPackage.WORKLOG__ISSUE_URI, JiraPackage.Literals.WORKLOG__ISSUE_URI, newIssueUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinutesSpent() {
		return (Integer)eDynamicGet(JiraPackage.WORKLOG__MINUTES_SPENT, JiraPackage.Literals.WORKLOG__MINUTES_SPENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinutesSpent(int newMinutesSpent) {
		eDynamicSet(JiraPackage.WORKLOG__MINUTES_SPENT, JiraPackage.Literals.WORKLOG__MINUTES_SPENT, newMinutesSpent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(JiraPackage.WORKLOG__START_DATE, JiraPackage.Literals.WORKLOG__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(JiraPackage.WORKLOG__START_DATE, JiraPackage.Literals.WORKLOG__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUser getUpdateAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.WORKLOG__UPDATE_AUTHOR, JiraPackage.Literals.WORKLOG__UPDATE_AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicUser basicGetUpdateAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.WORKLOG__UPDATE_AUTHOR, JiraPackage.Literals.WORKLOG__UPDATE_AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateAuthor(BasicUser newUpdateAuthor) {
		eDynamicSet(JiraPackage.WORKLOG__UPDATE_AUTHOR, JiraPackage.Literals.WORKLOG__UPDATE_AUTHOR, newUpdateAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdateDate() {
		return (Date)eDynamicGet(JiraPackage.WORKLOG__UPDATE_DATE, JiraPackage.Literals.WORKLOG__UPDATE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateDate(Date newUpdateDate) {
		eDynamicSet(JiraPackage.WORKLOG__UPDATE_DATE, JiraPackage.Literals.WORKLOG__UPDATE_DATE, newUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visibility getVisibility() {
		return (Visibility)eDynamicGet(JiraPackage.WORKLOG__VISIBILITY, JiraPackage.Literals.WORKLOG__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility basicGetVisibility() {
		return (Visibility)eDynamicGet(JiraPackage.WORKLOG__VISIBILITY, JiraPackage.Literals.WORKLOG__VISIBILITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(Visibility newVisibility) {
		eDynamicSet(JiraPackage.WORKLOG__VISIBILITY, JiraPackage.Literals.WORKLOG__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.WORKLOG__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case JiraPackage.WORKLOG__COMMENT:
				return getComment();
			case JiraPackage.WORKLOG__CREATION_DATE:
				return getCreationDate();
			case JiraPackage.WORKLOG__ISSUE_URI:
				return getIssueUri();
			case JiraPackage.WORKLOG__MINUTES_SPENT:
				return getMinutesSpent();
			case JiraPackage.WORKLOG__START_DATE:
				return getStartDate();
			case JiraPackage.WORKLOG__UPDATE_AUTHOR:
				if (resolve) return getUpdateAuthor();
				return basicGetUpdateAuthor();
			case JiraPackage.WORKLOG__UPDATE_DATE:
				return getUpdateDate();
			case JiraPackage.WORKLOG__VISIBILITY:
				if (resolve) return getVisibility();
				return basicGetVisibility();
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
			case JiraPackage.WORKLOG__AUTHOR:
				setAuthor((BasicUser)newValue);
				return;
			case JiraPackage.WORKLOG__COMMENT:
				setComment((String)newValue);
				return;
			case JiraPackage.WORKLOG__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case JiraPackage.WORKLOG__ISSUE_URI:
				setIssueUri((String)newValue);
				return;
			case JiraPackage.WORKLOG__MINUTES_SPENT:
				setMinutesSpent((Integer)newValue);
				return;
			case JiraPackage.WORKLOG__START_DATE:
				setStartDate((Date)newValue);
				return;
			case JiraPackage.WORKLOG__UPDATE_AUTHOR:
				setUpdateAuthor((BasicUser)newValue);
				return;
			case JiraPackage.WORKLOG__UPDATE_DATE:
				setUpdateDate((Date)newValue);
				return;
			case JiraPackage.WORKLOG__VISIBILITY:
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
			case JiraPackage.WORKLOG__AUTHOR:
				setAuthor((BasicUser)null);
				return;
			case JiraPackage.WORKLOG__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case JiraPackage.WORKLOG__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case JiraPackage.WORKLOG__ISSUE_URI:
				setIssueUri(ISSUE_URI_EDEFAULT);
				return;
			case JiraPackage.WORKLOG__MINUTES_SPENT:
				setMinutesSpent(MINUTES_SPENT_EDEFAULT);
				return;
			case JiraPackage.WORKLOG__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case JiraPackage.WORKLOG__UPDATE_AUTHOR:
				setUpdateAuthor((BasicUser)null);
				return;
			case JiraPackage.WORKLOG__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
				return;
			case JiraPackage.WORKLOG__VISIBILITY:
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
			case JiraPackage.WORKLOG__AUTHOR:
				return basicGetAuthor() != null;
			case JiraPackage.WORKLOG__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case JiraPackage.WORKLOG__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case JiraPackage.WORKLOG__ISSUE_URI:
				return ISSUE_URI_EDEFAULT == null ? getIssueUri() != null : !ISSUE_URI_EDEFAULT.equals(getIssueUri());
			case JiraPackage.WORKLOG__MINUTES_SPENT:
				return getMinutesSpent() != MINUTES_SPENT_EDEFAULT;
			case JiraPackage.WORKLOG__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case JiraPackage.WORKLOG__UPDATE_AUTHOR:
				return basicGetUpdateAuthor() != null;
			case JiraPackage.WORKLOG__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? getUpdateDate() != null : !UPDATE_DATE_EDEFAULT.equals(getUpdateDate());
			case JiraPackage.WORKLOG__VISIBILITY:
				return basicGetVisibility() != null;
		}
		return super.eIsSet(featureID);
	}

} //WorklogImpl
