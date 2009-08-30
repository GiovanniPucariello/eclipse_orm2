/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.orm.Entity#isOccursElseWhere <em>Occurs Else Where</em>}</li>
 *   <li>{@link net.orm.Entity#isIsIndependent <em>Is Independent</em>}</li>
 *   <li>{@link net.orm.Entity#getReferenceScheme <em>Reference Scheme</em>}</li>
 *   <li>{@link net.orm.Entity#getName <em>Name</em>}</li>
 *   <li>{@link net.orm.Entity#isIsValueType <em>Is Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.orm.Package#getEntity()
 * @model
 * @generated
 */
public interface Entity extends SchemaShape {
	/**
	 * Returns the value of the '<em><b>Occurs Else Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurs Else Where</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurs Else Where</em>' attribute.
	 * @see #setOccursElseWhere(boolean)
	 * @see net.orm.Package#getEntity_OccursElseWhere()
	 * @model
	 * @generated
	 */
	boolean isOccursElseWhere();

	/**
	 * Sets the value of the '{@link net.orm.Entity#isOccursElseWhere <em>Occurs Else Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurs Else Where</em>' attribute.
	 * @see #isOccursElseWhere()
	 * @generated
	 */
	void setOccursElseWhere(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Independent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Independent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Independent</em>' attribute.
	 * @see #setIsIndependent(boolean)
	 * @see net.orm.Package#getEntity_IsIndependent()
	 * @model
	 * @generated
	 */
	boolean isIsIndependent();

	/**
	 * Sets the value of the '{@link net.orm.Entity#isIsIndependent <em>Is Independent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Independent</em>' attribute.
	 * @see #isIsIndependent()
	 * @generated
	 */
	void setIsIndependent(boolean value);

	/**
	 * Returns the value of the '<em><b>Reference Scheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Scheme</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Scheme</em>' reference.
	 * @see #setReferenceScheme(ReferenceScheme)
	 * @see net.orm.Package#getEntity_ReferenceScheme()
	 * @model
	 * @generated
	 */
	ReferenceScheme getReferenceScheme();

	/**
	 * Sets the value of the '{@link net.orm.Entity#getReferenceScheme <em>Reference Scheme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Scheme</em>' reference.
	 * @see #getReferenceScheme()
	 * @generated
	 */
	void setReferenceScheme(ReferenceScheme value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.orm.Package#getEntity_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.orm.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Value Type</em>' attribute.
	 * @see #setIsValueType(boolean)
	 * @see net.orm.Package#getEntity_IsValueType()
	 * @model
	 * @generated
	 */
	boolean isIsValueType();

	/**
	 * Sets the value of the '{@link net.orm.Entity#isIsValueType <em>Is Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Value Type</em>' attribute.
	 * @see #isIsValueType()
	 * @generated
	 */
	void setIsValueType(boolean value);

} // Entity
