/**
 */
package org.nasdanika.models.jira;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Votes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.jira.BasicVotes#isHasVoted <em>Has Voted</em>}</li>
 *   <li>{@link org.nasdanika.models.jira.BasicVotes#getVotes <em>Votes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.jira.JiraPackage#getBasicVotes()
 * @model
 * @generated
 */
public interface BasicVotes extends AddressableEntity {
	/**
	 * Returns the value of the '<em><b>Has Voted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Voted</em>' attribute.
	 * @see #setHasVoted(boolean)
	 * @see org.nasdanika.models.jira.JiraPackage#getBasicVotes_HasVoted()
	 * @model
	 * @generated
	 */
	boolean isHasVoted();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.BasicVotes#isHasVoted <em>Has Voted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Voted</em>' attribute.
	 * @see #isHasVoted()
	 * @generated
	 */
	void setHasVoted(boolean value);

	/**
	 * Returns the value of the '<em><b>Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Votes</em>' attribute.
	 * @see #setVotes(int)
	 * @see org.nasdanika.models.jira.JiraPackage#getBasicVotes_Votes()
	 * @model
	 * @generated
	 */
	int getVotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.jira.BasicVotes#getVotes <em>Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Votes</em>' attribute.
	 * @see #getVotes()
	 * @generated
	 */
	void setVotes(int value);

} // BasicVotes
