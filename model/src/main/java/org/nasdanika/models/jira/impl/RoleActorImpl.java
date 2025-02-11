/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.Actor;
import org.nasdanika.models.jira.IdentifiableEntity;
import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.RoleActor;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.impl.RoleActorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.RoleActorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.RoleActorImpl#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.RoleActorImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.impl.RoleActorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleActorImpl extends NamedEntityImpl implements RoleActor {
	/**
	 * The default value of the '{@link #getAvatarUrl() <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatarUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AVATAR_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.ROLE_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(JiraPackage.ROLE_ACTOR__ID, JiraPackage.Literals.IDENTIFIABLE_ENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(JiraPackage.ROLE_ACTOR__ID, JiraPackage.Literals.IDENTIFIABLE_ENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor getTarget() {
		return (Actor)eDynamicGet(JiraPackage.ROLE_ACTOR__TARGET, NcorePackage.Literals.REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetTarget() {
		return (Actor)eDynamicGet(JiraPackage.ROLE_ACTOR__TARGET, NcorePackage.Literals.REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Actor newTarget) {
		eDynamicSet(JiraPackage.ROLE_ACTOR__TARGET, NcorePackage.Literals.REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvatarUrl() {
		return (String)eDynamicGet(JiraPackage.ROLE_ACTOR__AVATAR_URL, JiraPackage.Literals.ROLE_ACTOR__AVATAR_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvatarUrl(String newAvatarUrl) {
		eDynamicSet(JiraPackage.ROLE_ACTOR__AVATAR_URL, JiraPackage.Literals.ROLE_ACTOR__AVATAR_URL, newAvatarUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayName() {
		return (String)eDynamicGet(JiraPackage.ROLE_ACTOR__DISPLAY_NAME, JiraPackage.Literals.ROLE_ACTOR__DISPLAY_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName(String newDisplayName) {
		eDynamicSet(JiraPackage.ROLE_ACTOR__DISPLAY_NAME, JiraPackage.Literals.ROLE_ACTOR__DISPLAY_NAME, newDisplayName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(JiraPackage.ROLE_ACTOR__TYPE, JiraPackage.Literals.ROLE_ACTOR__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(JiraPackage.ROLE_ACTOR__TYPE, JiraPackage.Literals.ROLE_ACTOR__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPackage.ROLE_ACTOR__ID:
				return getId();
			case JiraPackage.ROLE_ACTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case JiraPackage.ROLE_ACTOR__AVATAR_URL:
				return getAvatarUrl();
			case JiraPackage.ROLE_ACTOR__DISPLAY_NAME:
				return getDisplayName();
			case JiraPackage.ROLE_ACTOR__TYPE:
				return getType();
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
			case JiraPackage.ROLE_ACTOR__ID:
				setId((Long)newValue);
				return;
			case JiraPackage.ROLE_ACTOR__TARGET:
				setTarget((Actor)newValue);
				return;
			case JiraPackage.ROLE_ACTOR__AVATAR_URL:
				setAvatarUrl((String)newValue);
				return;
			case JiraPackage.ROLE_ACTOR__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case JiraPackage.ROLE_ACTOR__TYPE:
				setType((String)newValue);
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
			case JiraPackage.ROLE_ACTOR__ID:
				setId((Long)null);
				return;
			case JiraPackage.ROLE_ACTOR__TARGET:
				setTarget((Actor)null);
				return;
			case JiraPackage.ROLE_ACTOR__AVATAR_URL:
				setAvatarUrl(AVATAR_URL_EDEFAULT);
				return;
			case JiraPackage.ROLE_ACTOR__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case JiraPackage.ROLE_ACTOR__TYPE:
				setType(TYPE_EDEFAULT);
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
			case JiraPackage.ROLE_ACTOR__ID:
				return getId() != null;
			case JiraPackage.ROLE_ACTOR__TARGET:
				return basicGetTarget() != null;
			case JiraPackage.ROLE_ACTOR__AVATAR_URL:
				return AVATAR_URL_EDEFAULT == null ? getAvatarUrl() != null : !AVATAR_URL_EDEFAULT.equals(getAvatarUrl());
			case JiraPackage.ROLE_ACTOR__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? getDisplayName() != null : !DISPLAY_NAME_EDEFAULT.equals(getDisplayName());
			case JiraPackage.ROLE_ACTOR__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiableEntity.class) {
			switch (derivedFeatureID) {
				case JiraPackage.ROLE_ACTOR__ID: return JiraPackage.IDENTIFIABLE_ENTITY__ID;
				default: return -1;
			}
		}
		if (baseClass == Reference.class) {
			switch (derivedFeatureID) {
				case JiraPackage.ROLE_ACTOR__TARGET: return NcorePackage.REFERENCE__TARGET;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiableEntity.class) {
			switch (baseFeatureID) {
				case JiraPackage.IDENTIFIABLE_ENTITY__ID: return JiraPackage.ROLE_ACTOR__ID;
				default: return -1;
			}
		}
		if (baseClass == Reference.class) {
			switch (baseFeatureID) {
				case NcorePackage.REFERENCE__TARGET: return JiraPackage.ROLE_ACTOR__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RoleActorImpl
