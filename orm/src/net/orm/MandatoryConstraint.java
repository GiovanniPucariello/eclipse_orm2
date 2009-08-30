/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.orm.MandatoryConstraint#isIsDisjunctive <em>Is Disjunctive</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.orm.Package#getMandatoryConstraint()
 * @model
 * @generated
 */
public interface MandatoryConstraint extends ExternalizableConstraint {
	/**
	 * Returns the value of the '<em><b>Is Disjunctive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disjunctive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disjunctive</em>' attribute.
	 * @see #setIsDisjunctive(boolean)
	 * @see net.orm.Package#getMandatoryConstraint_IsDisjunctive()
	 * @model
	 * @generated
	 */
	boolean isIsDisjunctive();

	/**
	 * Sets the value of the '{@link net.orm.MandatoryConstraint#isIsDisjunctive <em>Is Disjunctive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjunctive</em>' attribute.
	 * @see #isIsDisjunctive()
	 * @generated
	 */
	void setIsDisjunctive(boolean value);

} // MandatoryConstraint
