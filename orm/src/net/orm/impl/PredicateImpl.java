/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm.impl;

import java.util.Collection;

import net.orm.Constraint;
import net.orm.Predicate;
import net.orm.ReferenceScheme;
import net.orm.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.orm.impl.PredicateImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#isIsObject <em>Is Object</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#getArity <em>Arity</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredicateImpl extends ObjectImpl implements Predicate {
	/**
	 * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected String nameSpace = NAME_SPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The default value of the '{@link #isIsObject() <em>Is Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsObject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OBJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsObject() <em>Is Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsObject()
	 * @generated
	 * @ordered
	 */
	protected boolean isObject = IS_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArity() <em>Arity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArity()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> arity;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return net.orm.Package.Literals.PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSpace() {
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpace(String newNameSpace) {
		String oldNameSpace = nameSpace;
		nameSpace = newNameSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.PREDICATE__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, net.orm.Package.PREDICATE__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsObject() {
		return isObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsObject(boolean newIsObject) {
		boolean oldIsObject = isObject;
		isObject = newIsObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.PREDICATE__IS_OBJECT, oldIsObject, isObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getArity() {
		if (arity == null) {
			arity = new EDataTypeUniqueEList<Integer>(Integer.class, this, net.orm.Package.PREDICATE__ARITY);
		}
		return arity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, net.orm.Package.PREDICATE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case net.orm.Package.PREDICATE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case net.orm.Package.PREDICATE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case net.orm.Package.PREDICATE__NAME_SPACE:
				return getNameSpace();
			case net.orm.Package.PREDICATE__ROLES:
				return getRoles();
			case net.orm.Package.PREDICATE__IS_OBJECT:
				return isIsObject();
			case net.orm.Package.PREDICATE__ARITY:
				return getArity();
			case net.orm.Package.PREDICATE__CONSTRAINTS:
				return getConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case net.orm.Package.PREDICATE__NAME_SPACE:
				setNameSpace((String)newValue);
				return;
			case net.orm.Package.PREDICATE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case net.orm.Package.PREDICATE__IS_OBJECT:
				setIsObject((Boolean)newValue);
				return;
			case net.orm.Package.PREDICATE__ARITY:
				getArity().clear();
				getArity().addAll((Collection<? extends Integer>)newValue);
				return;
			case net.orm.Package.PREDICATE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case net.orm.Package.PREDICATE__NAME_SPACE:
				setNameSpace(NAME_SPACE_EDEFAULT);
				return;
			case net.orm.Package.PREDICATE__ROLES:
				getRoles().clear();
				return;
			case net.orm.Package.PREDICATE__IS_OBJECT:
				setIsObject(IS_OBJECT_EDEFAULT);
				return;
			case net.orm.Package.PREDICATE__ARITY:
				getArity().clear();
				return;
			case net.orm.Package.PREDICATE__CONSTRAINTS:
				getConstraints().clear();
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
			case net.orm.Package.PREDICATE__NAME_SPACE:
				return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
			case net.orm.Package.PREDICATE__ROLES:
				return roles != null && !roles.isEmpty();
			case net.orm.Package.PREDICATE__IS_OBJECT:
				return isObject != IS_OBJECT_EDEFAULT;
			case net.orm.Package.PREDICATE__ARITY:
				return arity != null && !arity.isEmpty();
			case net.orm.Package.PREDICATE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
		result.append(" (nameSpace: ");
		result.append(nameSpace);
		result.append(", isObject: ");
		result.append(isObject);
		result.append(", Arity: ");
		result.append(arity);
		result.append(')');
		return result.toString();
	}

} //PredicateImpl
