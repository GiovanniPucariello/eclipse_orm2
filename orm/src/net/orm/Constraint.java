/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.orm.Constraint#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.orm.Package#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link net.orm.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see net.orm.Package#getConstraint_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

} // Constraint
