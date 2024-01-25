/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Story#getSubTasks <em>Sub Tasks</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getStory()
 * @model
 * @generated
 */
public interface Story extends Issue {
	/**
	 * Returns the value of the '<em><b>Sub Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Subtask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Tasks</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getStory_SubTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subtask> getSubTasks();

} // Story
