/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm.impl;

import net.orm.UniquenessConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniqueness Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.orm.impl.UniquenessConstraintImpl#isIsPrimary <em>Is Primary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniquenessConstraintImpl extends ExternalizableConstraintImpl implements UniquenessConstraint {
	/**
	 * The default value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimary = IS_PRIMARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniquenessConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return net.orm.Package.Literals.UNIQUENESS_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrimary() {
		return isPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimary(boolean newIsPrimary) {
		boolean oldIsPrimary = isPrimary;
		isPrimary = newIsPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.UNIQUENESS_CONSTRAINT__IS_PRIMARY, oldIsPrimary, isPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case net.orm.Package.UNIQUENESS_CONSTRAINT__IS_PRIMARY:
				return isIsPrimary();
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
			case net.orm.Package.UNIQUENESS_CONSTRAINT__IS_PRIMARY:
				setIsPrimary((Boolean)newValue);
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
			case net.orm.Package.UNIQUENESS_CONSTRAINT__IS_PRIMARY:
				setIsPrimary(IS_PRIMARY_EDEFAULT);
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
			case net.orm.Package.UNIQUENESS_CONSTRAINT__IS_PRIMARY:
				return isPrimary != IS_PRIMARY_EDEFAULT;
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
		result.append(" (isPrimary: ");
		result.append(isPrimary);
		result.append(')');
		return result.toString();
	}

} //UniquenessConstraintImpl
