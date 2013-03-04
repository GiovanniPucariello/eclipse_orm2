/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm.impl;

import java.util.Collection;

import net.orm.Constraint;
import net.orm.ObjectRole;
import net.orm.Schema;
import net.orm.SchemaShape;
import net.orm.SubType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.orm.impl.SchemaImpl#getSchemaShapes <em>Schema Shapes</em>}</li>
 *   <li>{@link net.orm.impl.SchemaImpl#getObjectRoles <em>Object Roles</em>}</li>
 *   <li>{@link net.orm.impl.SchemaImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link net.orm.impl.SchemaImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends EObjectImpl implements Schema {
	/**
	 * The cached value of the '{@link #getSchemaShapes() <em>Schema Shapes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaShape> schemaShapes;

	/**
	 * The cached value of the '{@link #getObjectRoles() <em>Object Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectRole> objectRoles;

	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SubType> subTypes;

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
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return net.orm.Package.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemaShape> getSchemaShapes() {
		if (schemaShapes == null) {
			schemaShapes = new EObjectContainmentEList<SchemaShape>(SchemaShape.class, this, net.orm.Package.SCHEMA__SCHEMA_SHAPES);
		}
		return schemaShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectRole> getObjectRoles() {
		if (objectRoles == null) {
			objectRoles = new EObjectContainmentEList<ObjectRole>(ObjectRole.class, this, net.orm.Package.SCHEMA__OBJECT_ROLES);
		}
		return objectRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubType> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectContainmentEList<SubType>(SubType.class, this, net.orm.Package.SCHEMA__SUB_TYPES);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, net.orm.Package.SCHEMA__CONSTRAINTS);
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
			case net.orm.Package.SCHEMA__SCHEMA_SHAPES:
				return ((InternalEList<?>)getSchemaShapes()).basicRemove(otherEnd, msgs);
			case net.orm.Package.SCHEMA__OBJECT_ROLES:
				return ((InternalEList<?>)getObjectRoles()).basicRemove(otherEnd, msgs);
			case net.orm.Package.SCHEMA__SUB_TYPES:
				return ((InternalEList<?>)getSubTypes()).basicRemove(otherEnd, msgs);
			case net.orm.Package.SCHEMA__CONSTRAINTS:
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
			case net.orm.Package.SCHEMA__SCHEMA_SHAPES:
				return getSchemaShapes();
			case net.orm.Package.SCHEMA__OBJECT_ROLES:
				return getObjectRoles();
			case net.orm.Package.SCHEMA__SUB_TYPES:
				return getSubTypes();
			case net.orm.Package.SCHEMA__CONSTRAINTS:
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
			case net.orm.Package.SCHEMA__SCHEMA_SHAPES:
				getSchemaShapes().clear();
				getSchemaShapes().addAll((Collection<? extends SchemaShape>)newValue);
				return;
			case net.orm.Package.SCHEMA__OBJECT_ROLES:
				getObjectRoles().clear();
				getObjectRoles().addAll((Collection<? extends ObjectRole>)newValue);
				return;
			case net.orm.Package.SCHEMA__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends SubType>)newValue);
				return;
			case net.orm.Package.SCHEMA__CONSTRAINTS:
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
			case net.orm.Package.SCHEMA__SCHEMA_SHAPES:
				getSchemaShapes().clear();
				return;
			case net.orm.Package.SCHEMA__OBJECT_ROLES:
				getObjectRoles().clear();
				return;
			case net.orm.Package.SCHEMA__SUB_TYPES:
				getSubTypes().clear();
				return;
			case net.orm.Package.SCHEMA__CONSTRAINTS:
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
			case net.orm.Package.SCHEMA__SCHEMA_SHAPES:
				return schemaShapes != null && !schemaShapes.isEmpty();
			case net.orm.Package.SCHEMA__OBJECT_ROLES:
				return objectRoles != null && !objectRoles.isEmpty();
			case net.orm.Package.SCHEMA__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
			case net.orm.Package.SCHEMA__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl
