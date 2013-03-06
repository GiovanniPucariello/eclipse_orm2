/**
 */
package net.orm.impl;

import net.orm.MandatoryConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.orm.impl.MandatoryConstraintImpl#isIsDisjunctive <em>Is Disjunctive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandatoryConstraintImpl extends ExternalizableConstraintImpl implements MandatoryConstraint {
	/**
	 * The default value of the '{@link #isIsDisjunctive() <em>Is Disjunctive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjunctive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISJUNCTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisjunctive() <em>Is Disjunctive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjunctive()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisjunctive = IS_DISJUNCTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return net.orm.Package.Literals.MANDATORY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisjunctive() {
		return isDisjunctive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisjunctive(boolean newIsDisjunctive) {
		boolean oldIsDisjunctive = isDisjunctive;
		isDisjunctive = newIsDisjunctive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.MANDATORY_CONSTRAINT__IS_DISJUNCTIVE, oldIsDisjunctive, isDisjunctive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case net.orm.Package.MANDATORY_CONSTRAINT__IS_DISJUNCTIVE:
				return isIsDisjunctive();
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
			case net.orm.Package.MANDATORY_CONSTRAINT__IS_DISJUNCTIVE:
				setIsDisjunctive((Boolean)newValue);
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
			case net.orm.Package.MANDATORY_CONSTRAINT__IS_DISJUNCTIVE:
				setIsDisjunctive(IS_DISJUNCTIVE_EDEFAULT);
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
			case net.orm.Package.MANDATORY_CONSTRAINT__IS_DISJUNCTIVE:
				return isDisjunctive != IS_DISJUNCTIVE_EDEFAULT;
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
		result.append(" (isDisjunctive: ");
		result.append(isDisjunctive);
		result.append(')');
		return result.toString();
	}

} //MandatoryConstraintImpl
