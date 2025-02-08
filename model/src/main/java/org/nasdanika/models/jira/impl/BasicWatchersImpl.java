/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.BasicWatchers;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Watchers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.BasicWatchersImpl#isIsWatching <em>Is Watching</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.BasicWatchersImpl#getNumWatchers <em>Num Watchers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicWatchersImpl extends AddressableEntityImpl implements BasicWatchers {
	/**
	 * The default value of the '{@link #isIsWatching() <em>Is Watching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWatching()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WATCHING_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getNumWatchers() <em>Num Watchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumWatchers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_WATCHERS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicWatchersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.BASIC_WATCHERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsWatching() {
		return (Boolean)eDynamicGet(JiraPackage.BASIC_WATCHERS__IS_WATCHING, JiraPackage.Literals.BASIC_WATCHERS__IS_WATCHING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsWatching(boolean newIsWatching) {
		eDynamicSet(JiraPackage.BASIC_WATCHERS__IS_WATCHING, JiraPackage.Literals.BASIC_WATCHERS__IS_WATCHING, newIsWatching);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumWatchers() {
		return (Integer)eDynamicGet(JiraPackage.BASIC_WATCHERS__NUM_WATCHERS, JiraPackage.Literals.BASIC_WATCHERS__NUM_WATCHERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumWatchers(int newNumWatchers) {
		eDynamicSet(JiraPackage.BASIC_WATCHERS__NUM_WATCHERS, JiraPackage.Literals.BASIC_WATCHERS__NUM_WATCHERS, newNumWatchers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.BASIC_WATCHERS__IS_WATCHING:
				return isIsWatching();
			case JiraPackage.BASIC_WATCHERS__NUM_WATCHERS:
				return getNumWatchers();
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
			case JiraPackage.BASIC_WATCHERS__IS_WATCHING:
				setIsWatching((Boolean)newValue);
				return;
			case JiraPackage.BASIC_WATCHERS__NUM_WATCHERS:
				setNumWatchers((Integer)newValue);
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
			case JiraPackage.BASIC_WATCHERS__IS_WATCHING:
				setIsWatching(IS_WATCHING_EDEFAULT);
				return;
			case JiraPackage.BASIC_WATCHERS__NUM_WATCHERS:
				setNumWatchers(NUM_WATCHERS_EDEFAULT);
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
			case JiraPackage.BASIC_WATCHERS__IS_WATCHING:
				return isIsWatching() != IS_WATCHING_EDEFAULT;
			case JiraPackage.BASIC_WATCHERS__NUM_WATCHERS:
				return getNumWatchers() != NUM_WATCHERS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //BasicWatchersImpl
