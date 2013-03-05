/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.orm.SubType#getParent <em>Parent</em>}</li>
 *   <li>{@link net.orm.SubType#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.orm.Package#getSubType()
 * @model
 * @generated
 */
public interface SubType extends SchemaDiagramMember {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(net.orm.Object)
	 * @see net.orm.Package#getSubType_Parent()
	 * @model required="true"
	 * @generated
	 */
	net.orm.Object getParent();

	/**
	 * Sets the value of the '{@link net.orm.SubType#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(net.orm.Object value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(net.orm.Object)
	 * @see net.orm.Package#getSubType_Child()
	 * @model required="true"
	 * @generated
	 */
	net.orm.Object getChild();

	/**
	 * Sets the value of the '{@link net.orm.SubType#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(net.orm.Object value);

} // SubType
