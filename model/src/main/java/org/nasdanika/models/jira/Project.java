/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Project#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getExpandos <em>Expandos</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getIssueTypes <em>Issue Types</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getLead <em>Lead</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getProjectRoles <em>Project Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getUri <em>Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Project#getStatusCategories <em>Status Categories</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends BasicProject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.BasicComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Expandos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expandos</em>' attribute list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Expandos()
	 * @model
	 * @generated
	 */
	EList<String> getExpandos();

	/**
	 * Returns the value of the '<em><b>Issue Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.IssueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Types</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_IssueTypes()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<IssueType> getIssueTypes();

	/**
	 * Returns the value of the '<em><b>Lead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lead</em>' reference.
	 * @see #setLead(BasicUser)
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Lead()
	 * @model
	 * @generated
	 */
	BasicUser getLead();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Project#getLead <em>Lead</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lead</em>' reference.
	 * @see #getLead()
	 * @generated
	 */
	void setLead(BasicUser value);

	/**
	 * Returns the value of the '<em><b>Project Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.BasicProjectRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Roles</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_ProjectRoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicProjectRole> getProjectRoles();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Project#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Versions()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Version> getVersions();

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.BasicIssue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_Issues()
	 * @model containment="true" keys="key"
	 * @generated
	 */
	EList<BasicIssue> getIssues();

	/**
	 * Returns the value of the '<em><b>Status Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.StatusCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Categories</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProject_StatusCategories()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<StatusCategory> getStatusCategories();

} // Project
