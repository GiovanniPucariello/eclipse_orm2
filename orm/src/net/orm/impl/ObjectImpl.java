/**
 */
package net.orm.impl;

import net.orm.ReferenceScheme;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.orm.impl.ObjectImpl#isOccursElseWhere <em>Occurs Else Where</em>}</li>
 *   <li>{@link net.orm.impl.ObjectImpl#isIsIndependent <em>Is Independent</em>}</li>
 *   <li>{@link net.orm.impl.ObjectImpl#getReferenceScheme <em>Reference Scheme</em>}</li>
 *   <li>{@link net.orm.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.orm.impl.ObjectImpl#isIsValueType <em>Is Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends SchemaShapeImpl implements net.orm.Object {
	/**
	 * The default value of the '{@link #isOccursElseWhere() <em>Occurs Else Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccursElseWhere()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OCCURS_ELSE_WHERE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOccursElseWhere() <em>Occurs Else Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccursElseWhere()
	 * @generated
	 * @ordered
	 */
	protected boolean occursElseWhere = OCCURS_ELSE_WHERE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsIndependent() <em>Is Independent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIndependent() <em>Is Independent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndependent()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndependent = IS_INDEPENDENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceScheme() <em>Reference Scheme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceScheme()
	 * @generated
	 * @ordered
	 */
	protected ReferenceScheme referenceScheme;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsValueType() <em>Is Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValueType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VALUE_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsValueType() <em>Is Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValueType()
	 * @generated
	 * @ordered
	 */
	protected boolean isValueType = IS_VALUE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return net.orm.Package.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOccursElseWhere() {
		return occursElseWhere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccursElseWhere(boolean newOccursElseWhere) {
		boolean oldOccursElseWhere = occursElseWhere;
		occursElseWhere = newOccursElseWhere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.OBJECT__OCCURS_ELSE_WHERE, oldOccursElseWhere, occursElseWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIndependent() {
		return isIndependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndependent(boolean newIsIndependent) {
		boolean oldIsIndependent = isIndependent;
		isIndependent = newIsIndependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.OBJECT__IS_INDEPENDENT, oldIsIndependent, isIndependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceScheme getReferenceScheme() {
		if (referenceScheme != null && referenceScheme.eIsProxy()) {
			InternalEObject oldReferenceScheme = (InternalEObject)referenceScheme;
			referenceScheme = (ReferenceScheme)eResolveProxy(oldReferenceScheme);
			if (referenceScheme != oldReferenceScheme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, net.orm.Package.OBJECT__REFERENCE_SCHEME, oldReferenceScheme, referenceScheme));
			}
		}
		return referenceScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceScheme basicGetReferenceScheme() {
		return referenceScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceScheme(ReferenceScheme newReferenceScheme) {
		ReferenceScheme oldReferenceScheme = referenceScheme;
		referenceScheme = newReferenceScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.OBJECT__REFERENCE_SCHEME, oldReferenceScheme, referenceScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValueType() {
		return isValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValueType(boolean newIsValueType) {
		boolean oldIsValueType = isValueType;
		isValueType = newIsValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.OBJECT__IS_VALUE_TYPE, oldIsValueType, isValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case net.orm.Package.OBJECT__OCCURS_ELSE_WHERE:
				return isOccursElseWhere();
			case net.orm.Package.OBJECT__IS_INDEPENDENT:
				return isIsIndependent();
			case net.orm.Package.OBJECT__REFERENCE_SCHEME:
				if (resolve) return getReferenceScheme();
				return basicGetReferenceScheme();
			case net.orm.Package.OBJECT__NAME:
				return getName();
			case net.orm.Package.OBJECT__IS_VALUE_TYPE:
				return isIsValueType();
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
			case net.orm.Package.OBJECT__OCCURS_ELSE_WHERE:
				setOccursElseWhere((Boolean)newValue);
				return;
			case net.orm.Package.OBJECT__IS_INDEPENDENT:
				setIsIndependent((Boolean)newValue);
				return;
			case net.orm.Package.OBJECT__REFERENCE_SCHEME:
				setReferenceScheme((ReferenceScheme)newValue);
				return;
			case net.orm.Package.OBJECT__NAME:
				setName((String)newValue);
				return;
			case net.orm.Package.OBJECT__IS_VALUE_TYPE:
				setIsValueType((Boolean)newValue);
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
			case net.orm.Package.OBJECT__OCCURS_ELSE_WHERE:
				setOccursElseWhere(OCCURS_ELSE_WHERE_EDEFAULT);
				return;
			case net.orm.Package.OBJECT__IS_INDEPENDENT:
				setIsIndependent(IS_INDEPENDENT_EDEFAULT);
				return;
			case net.orm.Package.OBJECT__REFERENCE_SCHEME:
				setReferenceScheme((ReferenceScheme)null);
				return;
			case net.orm.Package.OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case net.orm.Package.OBJECT__IS_VALUE_TYPE:
				setIsValueType(IS_VALUE_TYPE_EDEFAULT);
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
			case net.orm.Package.OBJECT__OCCURS_ELSE_WHERE:
				return occursElseWhere != OCCURS_ELSE_WHERE_EDEFAULT;
			case net.orm.Package.OBJECT__IS_INDEPENDENT:
				return isIndependent != IS_INDEPENDENT_EDEFAULT;
			case net.orm.Package.OBJECT__REFERENCE_SCHEME:
				return referenceScheme != null;
			case net.orm.Package.OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case net.orm.Package.OBJECT__IS_VALUE_TYPE:
				return isValueType != IS_VALUE_TYPE_EDEFAULT;
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
		result.append(" (occursElseWhere: ");
		result.append(occursElseWhere);
		result.append(", isIndependent: ");
		result.append(isIndependent);
		result.append(", Name: ");
		result.append(name);
		result.append(", isValueType: ");
		result.append(isValueType);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
