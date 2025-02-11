/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.ProjectRole#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.ProjectRole#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getProjectRole()
 * @model superTypes="org.nasdanika.models.jira.BasicProjectRole org.nasdanika.models.jira.IdentifiableEntity&lt;org.eclipse.emf.ecore.ELongObject&gt;"
 * @generated
 */
public interface ProjectRole extends BasicProjectRole, IdentifiableEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getProjectRole_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.ProjectRole#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.RoleActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProjectRole_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleActor> getActors();

} // ProjectRole
