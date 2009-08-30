/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm.impl;

import java.util.Collection;

import net.orm.Constraint;
import net.orm.Entity;
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
 *   <li>{@link net.orm.impl.PredicateImpl#isOccursElseWhere <em>Occurs Else Where</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#isIsIndependent <em>Is Independent</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#getReferenceScheme <em>Reference Scheme</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#isIsValueType <em>Is Value Type</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#isIsEntity <em>Is Entity</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#getArity <em>Arity</em>}</li>
 *   <li>{@link net.orm.impl.PredicateImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredicateImpl extends SchemaShapeImpl implements Predicate {
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
	 * The default value of the '{@link #isIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENTITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntity()
	 * @generated
	 * @ordered
	 */
	protected boolean isEntity = IS_ENTITY_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.PREDICATE__OCCURS_ELSE_WHERE, oldOccursElseWhere, occursElseWhere));
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
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.PREDICATE__IS_INDEPENDENT, oldIsIndependent, isIndependent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, net.orm.Package.PREDICATE__REFERENCE_SCHEME, oldReferenceScheme, referenceScheme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.PREDICATE__REFERENCE_SCHEME, oldReferenceScheme, referenceScheme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.PREDICATE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.PREDICATE__IS_VALUE_TYPE, oldIsValueType, isValueType));
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
	public boolean isIsEntity() {
		return isEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEntity(boolean newIsEntity) {
		boolean oldIsEntity = isEntity;
		isEntity = newIsEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.PREDICATE__IS_ENTITY, oldIsEntity, isEntity));
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
			case net.orm.Package.PREDICATE__OCCURS_ELSE_WHERE:
				return isOccursElseWhere();
			case net.orm.Package.PREDICATE__IS_INDEPENDENT:
				return isIsIndependent();
			case net.orm.Package.PREDICATE__REFERENCE_SCHEME:
				if (resolve) return getReferenceScheme();
				return basicGetReferenceScheme();
			case net.orm.Package.PREDICATE__NAME:
				return getName();
			case net.orm.Package.PREDICATE__IS_VALUE_TYPE:
				return isIsValueType();
			case net.orm.Package.PREDICATE__NAME_SPACE:
				return getNameSpace();
			case net.orm.Package.PREDICATE__ROLES:
				return getRoles();
			case net.orm.Package.PREDICATE__IS_ENTITY:
				return isIsEntity();
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
			case net.orm.Package.PREDICATE__OCCURS_ELSE_WHERE:
				setOccursElseWhere((Boolean)newValue);
				return;
			case net.orm.Package.PREDICATE__IS_INDEPENDENT:
				setIsIndependent((Boolean)newValue);
				return;
			case net.orm.Package.PREDICATE__REFERENCE_SCHEME:
				setReferenceScheme((ReferenceScheme)newValue);
				return;
			case net.orm.Package.PREDICATE__NAME:
				setName((String)newValue);
				return;
			case net.orm.Package.PREDICATE__IS_VALUE_TYPE:
				setIsValueType((Boolean)newValue);
				return;
			case net.orm.Package.PREDICATE__NAME_SPACE:
				setNameSpace((String)newValue);
				return;
			case net.orm.Package.PREDICATE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case net.orm.Package.PREDICATE__IS_ENTITY:
				setIsEntity((Boolean)newValue);
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
			case net.orm.Package.PREDICATE__OCCURS_ELSE_WHERE:
				setOccursElseWhere(OCCURS_ELSE_WHERE_EDEFAULT);
				return;
			case net.orm.Package.PREDICATE__IS_INDEPENDENT:
				setIsIndependent(IS_INDEPENDENT_EDEFAULT);
				return;
			case net.orm.Package.PREDICATE__REFERENCE_SCHEME:
				setReferenceScheme((ReferenceScheme)null);
				return;
			case net.orm.Package.PREDICATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case net.orm.Package.PREDICATE__IS_VALUE_TYPE:
				setIsValueType(IS_VALUE_TYPE_EDEFAULT);
				return;
			case net.orm.Package.PREDICATE__NAME_SPACE:
				setNameSpace(NAME_SPACE_EDEFAULT);
				return;
			case net.orm.Package.PREDICATE__ROLES:
				getRoles().clear();
				return;
			case net.orm.Package.PREDICATE__IS_ENTITY:
				setIsEntity(IS_ENTITY_EDEFAULT);
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
			case net.orm.Package.PREDICATE__OCCURS_ELSE_WHERE:
				return occursElseWhere != OCCURS_ELSE_WHERE_EDEFAULT;
			case net.orm.Package.PREDICATE__IS_INDEPENDENT:
				return isIndependent != IS_INDEPENDENT_EDEFAULT;
			case net.orm.Package.PREDICATE__REFERENCE_SCHEME:
				return referenceScheme != null;
			case net.orm.Package.PREDICATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case net.orm.Package.PREDICATE__IS_VALUE_TYPE:
				return isValueType != IS_VALUE_TYPE_EDEFAULT;
			case net.orm.Package.PREDICATE__NAME_SPACE:
				return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
			case net.orm.Package.PREDICATE__ROLES:
				return roles != null && !roles.isEmpty();
			case net.orm.Package.PREDICATE__IS_ENTITY:
				return isEntity != IS_ENTITY_EDEFAULT;
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
				case net.orm.Package.PREDICATE__OCCURS_ELSE_WHERE: return net.orm.Package.ENTITY__OCCURS_ELSE_WHERE;
				case net.orm.Package.PREDICATE__IS_INDEPENDENT: return net.orm.Package.ENTITY__IS_INDEPENDENT;
				case net.orm.Package.PREDICATE__REFERENCE_SCHEME: return net.orm.Package.ENTITY__REFERENCE_SCHEME;
				case net.orm.Package.PREDICATE__NAME: return net.orm.Package.ENTITY__NAME;
				case net.orm.Package.PREDICATE__IS_VALUE_TYPE: return net.orm.Package.ENTITY__IS_VALUE_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
				case net.orm.Package.ENTITY__OCCURS_ELSE_WHERE: return net.orm.Package.PREDICATE__OCCURS_ELSE_WHERE;
				case net.orm.Package.ENTITY__IS_INDEPENDENT: return net.orm.Package.PREDICATE__IS_INDEPENDENT;
				case net.orm.Package.ENTITY__REFERENCE_SCHEME: return net.orm.Package.PREDICATE__REFERENCE_SCHEME;
				case net.orm.Package.ENTITY__NAME: return net.orm.Package.PREDICATE__NAME;
				case net.orm.Package.ENTITY__IS_VALUE_TYPE: return net.orm.Package.PREDICATE__IS_VALUE_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", nameSpace: ");
		result.append(nameSpace);
		result.append(", isEntity: ");
		result.append(isEntity);
		result.append(", Arity: ");
		result.append(arity);
		result.append(')');
		return result.toString();
	}

} //PredicateImpl
