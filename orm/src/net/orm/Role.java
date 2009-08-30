/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.orm.Role#getPhrase <em>Phrase</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.orm.Package#getRole()
 * @model
 * @generated
 */
public interface Role extends SchemaShape {
	/**
	 * Returns the value of the '<em><b>Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phrase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phrase</em>' attribute.
	 * @see #setPhrase(String)
	 * @see net.orm.Package#getRole_Phrase()
	 * @model
	 * @generated
	 */
	String getPhrase();

	/**
	 * Sets the value of the '{@link net.orm.Role#getPhrase <em>Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phrase</em>' attribute.
	 * @see #getPhrase()
	 * @generated
	 */
	void setPhrase(String value);

} // Role
