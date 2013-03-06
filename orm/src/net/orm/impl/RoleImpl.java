/**
 */
package net.orm.impl;

import net.orm.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.orm.impl.RoleImpl#getPhrase <em>Phrase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends EObjectImpl implements Role {
	/**
	 * The default value of the '{@link #getPhrase() <em>Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhrase()
	 * @generated
	 * @ordered
	 */
	protected static final String PHRASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhrase() <em>Phrase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhrase()
	 * @generated
	 * @ordered
	 */
	protected String phrase = PHRASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return net.orm.Package.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhrase() {
		return phrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhrase(String newPhrase) {
		String oldPhrase = phrase;
		phrase = newPhrase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.ROLE__PHRASE, oldPhrase, phrase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case net.orm.Package.ROLE__PHRASE:
				return getPhrase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case net.orm.Package.ROLE__PHRASE:
				setPhrase((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case net.orm.Package.ROLE__PHRASE:
				setPhrase(PHRASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case net.orm.Package.ROLE__PHRASE:
				return PHRASE_EDEFAULT == null ? phrase != null : !PHRASE_EDEFAULT.equals(phrase);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (phrase: ");
		result.append(phrase);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
