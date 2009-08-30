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
import net.orm.EntityRole;
import net.orm.MandatoryConstraint;
import net.orm.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Entity Role</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.orm.impl.EntityRoleImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link net.orm.impl.EntityRoleImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.orm.impl.EntityRoleImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link net.orm.impl.EntityRoleImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityRoleImpl extends EObjectImpl implements EntityRole {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return net.orm.Package.Literals.ENTITY_ROLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, net.orm.Package.ENTITY_ROLE__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.ENTITY_ROLE__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, net.orm.Package.ENTITY_ROLE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.ENTITY_ROLE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public boolean isMandatory() {
		if (getConstraints() != null)
			for (Constraint c : getConstraints()) {
				if (c instanceof MandatoryConstraint)
					return true;
			}
		return false;
	}

	private void setMandatory() {
		getConstraints().add(new MandatoryConstraintImpl());
	}

	private void removeMandatory() {
		for (Constraint c : getConstraints()) {
			if (c instanceof MandatoryConstraint)
				getConstraints().remove(c);
			break;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, net.orm.Package.ENTITY_ROLE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, net.orm.Package.ENTITY_ROLE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case net.orm.Package.ENTITY_ROLE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case net.orm.Package.ENTITY_ROLE__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case net.orm.Package.ENTITY_ROLE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case net.orm.Package.ENTITY_ROLE__MANDATORY:
				return isMandatory();
			case net.orm.Package.ENTITY_ROLE__CONSTRAINTS:
				return getConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case net.orm.Package.ENTITY_ROLE__ENTITY:
				setEntity((Entity)newValue);
				return;
			case net.orm.Package.ENTITY_ROLE__ROLE:
				setRole((Role)newValue);
				return;
			case net.orm.Package.ENTITY_ROLE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case net.orm.Package.ENTITY_ROLE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case net.orm.Package.ENTITY_ROLE__ENTITY:
				setEntity((Entity)null);
				return;
			case net.orm.Package.ENTITY_ROLE__ROLE:
				setRole((Role)null);
				return;
			case net.orm.Package.ENTITY_ROLE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case net.orm.Package.ENTITY_ROLE__CONSTRAINTS:
				getConstraints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case net.orm.Package.ENTITY_ROLE__ENTITY:
				return entity != null;
			case net.orm.Package.ENTITY_ROLE__ROLE:
				return role != null;
			case net.orm.Package.ENTITY_ROLE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case net.orm.Package.ENTITY_ROLE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}

} // EntityRoleImpl
