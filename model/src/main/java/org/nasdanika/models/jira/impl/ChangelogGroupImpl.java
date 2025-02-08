/**
 */
package org.nasdanika.models.jira.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.jira.BasicUser;
import org.nasdanika.models.jira.ChangelogGroup;
import org.nasdanika.models.jira.ChangelogItem;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Changelog Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.ChangelogGroupImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ChangelogGroupImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.ChangelogGroupImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangelogGroupImpl extends MinimalEObjectImpl.Container implements ChangelogGroup {
	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangelogGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.CHANGELOG_GROUP;
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
		return (BasicUser)eDynamicGet(JiraPackage.CHANGELOG_GROUP__AUTHOR, JiraPackage.Literals.CHANGELOG_GROUP__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicUser basicGetAuthor() {
		return (BasicUser)eDynamicGet(JiraPackage.CHANGELOG_GROUP__AUTHOR, JiraPackage.Literals.CHANGELOG_GROUP__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(BasicUser newAuthor) {
		eDynamicSet(JiraPackage.CHANGELOG_GROUP__AUTHOR, JiraPackage.Literals.CHANGELOG_GROUP__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreated() {
		return (Date)eDynamicGet(JiraPackage.CHANGELOG_GROUP__CREATED, JiraPackage.Literals.CHANGELOG_GROUP__CREATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated(Date newCreated) {
		eDynamicSet(JiraPackage.CHANGELOG_GROUP__CREATED, JiraPackage.Literals.CHANGELOG_GROUP__CREATED, newCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ChangelogItem> getItems() {
		return (EList<ChangelogItem>)eDynamicGet(JiraPackage.CHANGELOG_GROUP__ITEMS, JiraPackage.Literals.CHANGELOG_GROUP__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPackage.CHANGELOG_GROUP__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case JiraPackage.CHANGELOG_GROUP__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case JiraPackage.CHANGELOG_GROUP__CREATED:
				return getCreated();
			case JiraPackage.CHANGELOG_GROUP__ITEMS:
				return getItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JiraPackage.CHANGELOG_GROUP__AUTHOR:
				setAuthor((BasicUser)newValue);
				return;
			case JiraPackage.CHANGELOG_GROUP__CREATED:
				setCreated((Date)newValue);
				return;
			case JiraPackage.CHANGELOG_GROUP__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ChangelogItem>)newValue);
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
			case JiraPackage.CHANGELOG_GROUP__AUTHOR:
				setAuthor((BasicUser)null);
				return;
			case JiraPackage.CHANGELOG_GROUP__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case JiraPackage.CHANGELOG_GROUP__ITEMS:
				getItems().clear();
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
			case JiraPackage.CHANGELOG_GROUP__AUTHOR:
				return basicGetAuthor() != null;
			case JiraPackage.CHANGELOG_GROUP__CREATED:
				return CREATED_EDEFAULT == null ? getCreated() != null : !CREATED_EDEFAULT.equals(getCreated());
			case JiraPackage.CHANGELOG_GROUP__ITEMS:
				return !getItems().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangelogGroupImpl
