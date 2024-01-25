/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Epic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Epic#getStories <em>Stories</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getEpic()
 * @model
 * @generated
 */
public interface Epic extends Issue {
	/**
	 * Returns the value of the '<em><b>Stories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Story}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getEpic_Stories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Story> getStories();

} // Epic
