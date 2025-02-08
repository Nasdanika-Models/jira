/**
 */
package org.nasdanika.models.jira;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Version#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Version#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Version#isIsArchived <em>Is Archived</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Version#isIsReleased <em>Is Released</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.Version#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends AdressableNamedEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.jira.JiraPackage#getVersion_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Version#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.jira.JiraPackage#getVersion_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Version#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Is Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Archived</em>' attribute.
	 * @see #setIsArchived(boolean)
	 * @see org.nasdanika.models.jira.JiraPackage#getVersion_IsArchived()
	 * @model
	 * @generated
	 */
	boolean isIsArchived();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Version#isIsArchived <em>Is Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Archived</em>' attribute.
	 * @see #isIsArchived()
	 * @generated
	 */
	void setIsArchived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Released</em>' attribute.
	 * @see #setIsReleased(boolean)
	 * @see org.nasdanika.models.jira.JiraPackage#getVersion_IsReleased()
	 * @model
	 * @generated
	 */
	boolean isIsReleased();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Version#isIsReleased <em>Is Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Released</em>' attribute.
	 * @see #isIsReleased()
	 * @generated
	 */
	void setIsReleased(boolean value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see org.nasdanika.models.jira.JiraPackage#getVersion_ReleaseDate()
	 * @model
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.Version#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

} // Version
