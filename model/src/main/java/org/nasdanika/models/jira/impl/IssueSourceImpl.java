/**
 */
package org.nasdanika.models.jira.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.jira.Issue;
import org.nasdanika.models.jira.IssueSource;
import org.nasdanika.models.jira.JiraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class IssueSourceImpl extends MinimalEObjectImpl.Container implements IssueSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPackage.Literals.ISSUE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getIssues() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JiraPackage.ISSUE_SOURCE___GET_ISSUES:
				return getIssues();
		}
		return super.eInvoke(operationID, arguments);
	}

} //IssueSourceImpl
