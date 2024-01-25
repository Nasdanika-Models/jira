/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initiative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Initiative#getEpics <em>Epics</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getInitiative()
 * @model
 * @generated
 */
public interface Initiative extends Issue {
	/**
	 * Returns the value of the '<em><b>Epics</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Epic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epics</em>' containment reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getInitiative_Epics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Epic> getEpics();

} // Initiative
