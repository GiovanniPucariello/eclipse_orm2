/**
 */
package net.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniqueness Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.orm.UniquenessConstraint#isIsPrimary <em>Is Primary</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.orm.Package#getUniquenessConstraint()
 * @model
 * @generated
 */
public interface UniquenessConstraint extends ExternalizableConstraint {
	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #setIsPrimary(boolean)
	 * @see net.orm.Package#getUniquenessConstraint_IsPrimary()
	 * @model
	 * @generated
	 */
	boolean isIsPrimary();

	/**
	 * Sets the value of the '{@link net.orm.UniquenessConstraint#isIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #isIsPrimary()
	 * @generated
	 */
	void setIsPrimary(boolean value);

} // UniquenessConstraint
