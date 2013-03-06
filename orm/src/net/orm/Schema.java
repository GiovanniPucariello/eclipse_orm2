/**
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
 *   <li>{@link net.orm.Schema#getSchemaDiagramMembers <em>Schema Diagram Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.orm.Package#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema Diagram Members</b></em>' containment reference list.
	 * The list contents are of type {@link net.orm.SchemaMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Diagram Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Diagram Members</em>' containment reference list.
	 * @see net.orm.Package#getSchema_SchemaDiagramMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchemaMember> getSchemaDiagramMembers();

} // Schema
