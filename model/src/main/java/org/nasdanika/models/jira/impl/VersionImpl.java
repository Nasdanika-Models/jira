/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.VersionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.VersionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.VersionImpl#isIsArchived <em>Is Archived</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.VersionImpl#isIsReleased <em>Is Released</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.VersionImpl#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends AdressableNamedEntityImpl implements Version {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

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
	 * The default value of the '{@link #isIsArchived() <em>Is Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArchived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ARCHIVED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsReleased() <em>Is Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReleased()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELEASED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(JiraPackage.VERSION__DESCRIPTION, JiraPackage.Literals.VERSION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(JiraPackage.VERSION__DESCRIPTION, JiraPackage.Literals.VERSION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(JiraPackage.VERSION__ID, JiraPackage.Literals.VERSION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(JiraPackage.VERSION__ID, JiraPackage.Literals.VERSION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsArchived() {
		return (Boolean)eDynamicGet(JiraPackage.VERSION__IS_ARCHIVED, JiraPackage.Literals.VERSION__IS_ARCHIVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsArchived(boolean newIsArchived) {
		eDynamicSet(JiraPackage.VERSION__IS_ARCHIVED, JiraPackage.Literals.VERSION__IS_ARCHIVED, newIsArchived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsReleased() {
		return (Boolean)eDynamicGet(JiraPackage.VERSION__IS_RELEASED, JiraPackage.Literals.VERSION__IS_RELEASED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReleased(boolean newIsReleased) {
		eDynamicSet(JiraPackage.VERSION__IS_RELEASED, JiraPackage.Literals.VERSION__IS_RELEASED, newIsReleased);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReleaseDate() {
		return (Date)eDynamicGet(JiraPackage.VERSION__RELEASE_DATE, JiraPackage.Literals.VERSION__RELEASE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseDate(Date newReleaseDate) {
		eDynamicSet(JiraPackage.VERSION__RELEASE_DATE, JiraPackage.Literals.VERSION__RELEASE_DATE, newReleaseDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.VERSION__DESCRIPTION:
				return getDescription();
			case JiraPackage.VERSION__ID:
				return getId();
			case JiraPackage.VERSION__IS_ARCHIVED:
				return isIsArchived();
			case JiraPackage.VERSION__IS_RELEASED:
				return isIsReleased();
			case JiraPackage.VERSION__RELEASE_DATE:
				return getReleaseDate();
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
			case JiraPackage.VERSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JiraPackage.VERSION__ID:
				setId((Long)newValue);
				return;
			case JiraPackage.VERSION__IS_ARCHIVED:
				setIsArchived((Boolean)newValue);
				return;
			case JiraPackage.VERSION__IS_RELEASED:
				setIsReleased((Boolean)newValue);
				return;
			case JiraPackage.VERSION__RELEASE_DATE:
				setReleaseDate((Date)newValue);
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
			case JiraPackage.VERSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JiraPackage.VERSION__ID:
				setId(ID_EDEFAULT);
				return;
			case JiraPackage.VERSION__IS_ARCHIVED:
				setIsArchived(IS_ARCHIVED_EDEFAULT);
				return;
			case JiraPackage.VERSION__IS_RELEASED:
				setIsReleased(IS_RELEASED_EDEFAULT);
				return;
			case JiraPackage.VERSION__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
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
			case JiraPackage.VERSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JiraPackage.VERSION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case JiraPackage.VERSION__IS_ARCHIVED:
				return isIsArchived() != IS_ARCHIVED_EDEFAULT;
			case JiraPackage.VERSION__IS_RELEASED:
				return isIsReleased() != IS_RELEASED_EDEFAULT;
			case JiraPackage.VERSION__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? getReleaseDate() != null : !RELEASE_DATE_EDEFAULT.equals(getReleaseDate());
		}
		return super.eIsSet(featureID);
	}

} //VersionImpl
