/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.orm.Predicate#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link net.orm.Predicate#getRoles <em>Roles</em>}</li>
 *   <li>{@link net.orm.Predicate#isIsEntity <em>Is Entity</em>}</li>
 *   <li>{@link net.orm.Predicate#getArity <em>Arity</em>}</li>
 *   <li>{@link net.orm.Predicate#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.orm.Package#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends SchemaShape, Entity {
	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' attribute.
	 * @see #setNameSpace(String)
	 * @see net.orm.Package#getPredicate_NameSpace()
	 * @model
	 * @generated
	 */
	String getNameSpace();

	/**
	 * Sets the value of the '{@link net.orm.Predicate#getNameSpace <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link net.orm.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see net.orm.Package#getPredicate_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entity</em>' attribute.
	 * @see #setIsEntity(boolean)
	 * @see net.orm.Package#getPredicate_IsEntity()
	 * @model
	 * @generated
	 */
	boolean isIsEntity();

	/**
	 * Sets the value of the '{@link net.orm.Predicate#isIsEntity <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entity</em>' attribute.
	 * @see #isIsEntity()
	 * @generated
	 */
	void setIsEntity(boolean value);

	/**
	 * Returns the value of the '<em><b>Arity</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arity</em>' attribute list.
	 * @see net.orm.Package#getPredicate_Arity()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getArity();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link net.orm.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see net.orm.Package#getPredicate_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // Predicate
