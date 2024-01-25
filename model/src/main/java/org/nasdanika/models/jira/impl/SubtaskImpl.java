/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Subtask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtask</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SubtaskImpl extends IssueImpl implements Subtask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.SUBTASK;
	}

} //SubtaskImpl
