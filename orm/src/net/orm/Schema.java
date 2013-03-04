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
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.orm.Schema#getSchemaShapes <em>Schema Shapes</em>}</li>
 *   <li>{@link net.orm.Schema#getObjectRoles <em>Object Roles</em>}</li>
 *   <li>{@link net.orm.Schema#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link net.orm.Schema#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.orm.Package#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema Shapes</b></em>' containment reference list.
	 * The list contents are of type {@link net.orm.SchemaShape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Shapes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Shapes</em>' containment reference list.
	 * @see net.orm.Package#getSchema_SchemaShapes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchemaShape> getSchemaShapes();

	/**
	 * Returns the value of the '<em><b>Object Roles</b></em>' containment reference list.
	 * The list contents are of type {@link net.orm.ObjectRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Roles</em>' containment reference list.
	 * @see net.orm.Package#getSchema_ObjectRoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectRole> getObjectRoles();

	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' containment reference list.
	 * The list contents are of type {@link net.orm.SubType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' containment reference list.
	 * @see net.orm.Package#getSchema_SubTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubType> getSubTypes();

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
	 * @see net.orm.Package#getSchema_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // Schema
