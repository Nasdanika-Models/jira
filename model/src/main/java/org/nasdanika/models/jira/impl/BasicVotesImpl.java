/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.BasicVotes;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Votes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.BasicVotesImpl#isHasVoted <em>Has Voted</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.BasicVotesImpl#getVotes <em>Votes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicVotesImpl extends AddressableEntityImpl implements BasicVotes {
	/**
	 * The default value of the '{@link #isHasVoted() <em>Has Voted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasVoted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_VOTED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getVotes() <em>Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVotes()
	 * @generated
	 * @ordered
	 */
	protected static final int VOTES_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicVotesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.BASIC_VOTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasVoted() {
		return (Boolean)eDynamicGet(JiraPackage.BASIC_VOTES__HAS_VOTED, JiraPackage.Literals.BASIC_VOTES__HAS_VOTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasVoted(boolean newHasVoted) {
		eDynamicSet(JiraPackage.BASIC_VOTES__HAS_VOTED, JiraPackage.Literals.BASIC_VOTES__HAS_VOTED, newHasVoted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVotes() {
		return (Integer)eDynamicGet(JiraPackage.BASIC_VOTES__VOTES, JiraPackage.Literals.BASIC_VOTES__VOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVotes(int newVotes) {
		eDynamicSet(JiraPackage.BASIC_VOTES__VOTES, JiraPackage.Literals.BASIC_VOTES__VOTES, newVotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.BASIC_VOTES__HAS_VOTED:
				return isHasVoted();
			case JiraPackage.BASIC_VOTES__VOTES:
				return getVotes();
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
			case JiraPackage.BASIC_VOTES__HAS_VOTED:
				setHasVoted((Boolean)newValue);
				return;
			case JiraPackage.BASIC_VOTES__VOTES:
				setVotes((Integer)newValue);
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
			case JiraPackage.BASIC_VOTES__HAS_VOTED:
				setHasVoted(HAS_VOTED_EDEFAULT);
				return;
			case JiraPackage.BASIC_VOTES__VOTES:
				setVotes(VOTES_EDEFAULT);
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
			case JiraPackage.BASIC_VOTES__HAS_VOTED:
				return isHasVoted() != HAS_VOTED_EDEFAULT;
			case JiraPackage.BASIC_VOTES__VOTES:
				return getVotes() != VOTES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //BasicVotesImpl
