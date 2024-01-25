/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.JiraPackage;
import org.nasdanika.models.jira.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskImpl extends StoryImpl implements Task {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.TASK;
	}

} //TaskImpl
