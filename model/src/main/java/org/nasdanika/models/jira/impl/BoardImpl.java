/**
 */
package org.nasdanika.models.jira.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.jira.Board;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BoardImpl extends IssueSourceImpl implements Board {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.BOARD;
	}

} //BoardImpl
