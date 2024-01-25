/**
 */
package org.nasdanika.models.jira;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.Program#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Plans</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.jira.Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' reference list.
	 * @see org.nasdanika.models.jira.JiraPackage#getProgram_Plans()
	 * @model
	 * @generated
	 */
	EList<Plan> getPlans();

} // Program
