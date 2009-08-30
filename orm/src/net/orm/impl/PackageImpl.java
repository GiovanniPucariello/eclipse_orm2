/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm.impl;

import net.orm.Acyclic;
import net.orm.AntiSymmetric;
import net.orm.Asymmetric;
import net.orm.ConstrainingRange;
import net.orm.ConstrainingValues;
import net.orm.Constraint;
import net.orm.Entity;
import net.orm.EntityRole;
import net.orm.EqualityConstraint;
import net.orm.ExclusionConstraint;
import net.orm.ExternalizableConstraint;
import net.orm.Factory;
import net.orm.FrequencyConstraint;
import net.orm.Intransitive;
import net.orm.Irreflexive;
import net.orm.MandatoryConstraint;
import net.orm.Predicate;
import net.orm.ReferenceScheme;
import net.orm.RingConstraint;
import net.orm.Role;
import net.orm.Schema;
import net.orm.SchemaShape;
import net.orm.SetComparisonConstraint;
import net.orm.SubSetConstraint;
import net.orm.SubType;
import net.orm.Symmetric;
import net.orm.UniquenessConstraint;
import net.orm.ValueConstraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageImpl extends EPackageImpl implements net.orm.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniquenessConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalizableConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setComparisonConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainingRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSetConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ringConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acyclicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irreflexiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intransitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asymmetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antiSymmetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRoleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.orm.Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PackageImpl() {
		super(eNS_URI, Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link net.orm.Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static net.orm.Package init() {
		if (isInited) return (net.orm.Package)EPackage.Registry.INSTANCE.getEPackage(net.orm.Package.eNS_URI);

		// Obtain or create and register package
		PackageImpl thePackage = (PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePackage.createPackageContents();

		// Initialize created meta-data
		thePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(net.orm.Package.eNS_URI, thePackage);
		return thePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Phrase() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_OccursElseWhere() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_IsIndependent() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_ReferenceScheme() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_IsValueType() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicate_NameSpace() {
		return (EAttribute)predicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_Roles() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicate_IsEntity() {
		return (EAttribute)predicateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicate_Arity() {
		return (EAttribute)predicateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_Constraints() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_SchemaShapes() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_EntityRoles() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_SubTypes() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Constraints() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaShape() {
		return schemaShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Roles() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatoryConstraint() {
		return mandatoryConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandatoryConstraint_IsDisjunctive() {
		return (EAttribute)mandatoryConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniquenessConstraint() {
		return uniquenessConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniquenessConstraint_IsPrimary() {
		return (EAttribute)uniquenessConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceScheme() {
		return referenceSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConstraint() {
		return valueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalizableConstraint() {
		return externalizableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetComparisonConstraint() {
		return setComparisonConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainingValues() {
		return constrainingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainingRange() {
		return constrainingRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubSetConstraint() {
		return subSetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityConstraint() {
		return equalityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionConstraint() {
		return exclusionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubType() {
		return subTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubType_Parent() {
		return (EReference)subTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubType_Child() {
		return (EReference)subTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConstraint() {
		return frequencyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRingConstraint() {
		return ringConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcyclic() {
		return acyclicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrreflexive() {
		return irreflexiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntransitive() {
		return intransitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsymmetric() {
		return asymmetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntiSymmetric() {
		return antiSymmetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetric() {
		return symmetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityRole() {
		return entityRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRole_Entity() {
		return (EReference)entityRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRole_Role() {
		return (EReference)entityRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRole_Mandatory() {
		return (EAttribute)entityRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRole_Constraints() {
		return (EReference)entityRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factory getFactory() {
		return (Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__PHRASE);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__OCCURS_ELSE_WHERE);
		createEAttribute(entityEClass, ENTITY__IS_INDEPENDENT);
		createEReference(entityEClass, ENTITY__REFERENCE_SCHEME);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEAttribute(entityEClass, ENTITY__IS_VALUE_TYPE);

		predicateEClass = createEClass(PREDICATE);
		createEAttribute(predicateEClass, PREDICATE__NAME_SPACE);
		createEReference(predicateEClass, PREDICATE__ROLES);
		createEAttribute(predicateEClass, PREDICATE__IS_ENTITY);
		createEAttribute(predicateEClass, PREDICATE__ARITY);
		createEReference(predicateEClass, PREDICATE__CONSTRAINTS);

		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__SCHEMA_SHAPES);
		createEReference(schemaEClass, SCHEMA__ENTITY_ROLES);
		createEReference(schemaEClass, SCHEMA__SUB_TYPES);
		createEReference(schemaEClass, SCHEMA__CONSTRAINTS);

		schemaShapeEClass = createEClass(SCHEMA_SHAPE);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__ROLES);

		mandatoryConstraintEClass = createEClass(MANDATORY_CONSTRAINT);
		createEAttribute(mandatoryConstraintEClass, MANDATORY_CONSTRAINT__IS_DISJUNCTIVE);

		uniquenessConstraintEClass = createEClass(UNIQUENESS_CONSTRAINT);
		createEAttribute(uniquenessConstraintEClass, UNIQUENESS_CONSTRAINT__IS_PRIMARY);

		referenceSchemeEClass = createEClass(REFERENCE_SCHEME);

		valueConstraintEClass = createEClass(VALUE_CONSTRAINT);

		externalizableConstraintEClass = createEClass(EXTERNALIZABLE_CONSTRAINT);

		setComparisonConstraintEClass = createEClass(SET_COMPARISON_CONSTRAINT);

		constrainingValuesEClass = createEClass(CONSTRAINING_VALUES);

		constrainingRangeEClass = createEClass(CONSTRAINING_RANGE);

		subSetConstraintEClass = createEClass(SUB_SET_CONSTRAINT);

		equalityConstraintEClass = createEClass(EQUALITY_CONSTRAINT);

		exclusionConstraintEClass = createEClass(EXCLUSION_CONSTRAINT);

		subTypeEClass = createEClass(SUB_TYPE);
		createEReference(subTypeEClass, SUB_TYPE__PARENT);
		createEReference(subTypeEClass, SUB_TYPE__CHILD);

		frequencyConstraintEClass = createEClass(FREQUENCY_CONSTRAINT);

		ringConstraintEClass = createEClass(RING_CONSTRAINT);

		acyclicEClass = createEClass(ACYCLIC);

		irreflexiveEClass = createEClass(IRREFLEXIVE);

		intransitiveEClass = createEClass(INTRANSITIVE);

		asymmetricEClass = createEClass(ASYMMETRIC);

		antiSymmetricEClass = createEClass(ANTI_SYMMETRIC);

		symmetricEClass = createEClass(SYMMETRIC);

		entityRoleEClass = createEClass(ENTITY_ROLE);
		createEReference(entityRoleEClass, ENTITY_ROLE__ENTITY);
		createEReference(entityRoleEClass, ENTITY_ROLE__ROLE);
		createEAttribute(entityRoleEClass, ENTITY_ROLE__MANDATORY);
		createEReference(entityRoleEClass, ENTITY_ROLE__CONSTRAINTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleEClass.getESuperTypes().add(this.getSchemaShape());
		entityEClass.getESuperTypes().add(this.getSchemaShape());
		predicateEClass.getESuperTypes().add(this.getSchemaShape());
		predicateEClass.getESuperTypes().add(this.getEntity());
		mandatoryConstraintEClass.getESuperTypes().add(this.getExternalizableConstraint());
		uniquenessConstraintEClass.getESuperTypes().add(this.getExternalizableConstraint());
		valueConstraintEClass.getESuperTypes().add(this.getConstraint());
		externalizableConstraintEClass.getESuperTypes().add(this.getConstraint());
		setComparisonConstraintEClass.getESuperTypes().add(this.getConstraint());
		constrainingValuesEClass.getESuperTypes().add(this.getValueConstraint());
		constrainingRangeEClass.getESuperTypes().add(this.getValueConstraint());
		subSetConstraintEClass.getESuperTypes().add(this.getSetComparisonConstraint());
		equalityConstraintEClass.getESuperTypes().add(this.getSetComparisonConstraint());
		exclusionConstraintEClass.getESuperTypes().add(this.getSetComparisonConstraint());
		frequencyConstraintEClass.getESuperTypes().add(this.getConstraint());
		ringConstraintEClass.getESuperTypes().add(this.getConstraint());
		acyclicEClass.getESuperTypes().add(this.getRingConstraint());
		irreflexiveEClass.getESuperTypes().add(this.getRingConstraint());
		intransitiveEClass.getESuperTypes().add(this.getRingConstraint());
		asymmetricEClass.getESuperTypes().add(this.getRingConstraint());
		antiSymmetricEClass.getESuperTypes().add(this.getRingConstraint());
		symmetricEClass.getESuperTypes().add(this.getRingConstraint());

		// Initialize classes and features; add operations and parameters
		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Phrase(), ecorePackage.getEString(), "phrase", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_OccursElseWhere(), ecorePackage.getEBoolean(), "occursElseWhere", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_IsIndependent(), ecorePackage.getEBoolean(), "isIndependent", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_ReferenceScheme(), this.getReferenceScheme(), null, "ReferenceScheme", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEntity_IsValueType(), ecorePackage.getEBoolean(), "isValueType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicate_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicate_Roles(), this.getRole(), null, "Roles", null, 0, -1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredicate_IsEntity(), ecorePackage.getEBoolean(), "isEntity", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredicate_Arity(), ecorePackage.getEInt(), "Arity", null, 1, -1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicate_Constraints(), this.getConstraint(), null, "Constraints", null, 0, -1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_SchemaShapes(), this.getSchemaShape(), null, "schemaShapes", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_EntityRoles(), this.getEntityRole(), null, "EntityRoles", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_SubTypes(), this.getSubType(), null, "SubTypes", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Constraints(), this.getConstraint(), null, "Constraints", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaShapeEClass, SchemaShape.class, "SchemaShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Roles(), this.getRole(), null, "Roles", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mandatoryConstraintEClass, MandatoryConstraint.class, "MandatoryConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandatoryConstraint_IsDisjunctive(), ecorePackage.getEBoolean(), "isDisjunctive", null, 0, 1, MandatoryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniquenessConstraintEClass, UniquenessConstraint.class, "UniquenessConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniquenessConstraint_IsPrimary(), ecorePackage.getEBoolean(), "isPrimary", null, 0, 1, UniquenessConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceSchemeEClass, ReferenceScheme.class, "ReferenceScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueConstraintEClass, ValueConstraint.class, "ValueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalizableConstraintEClass, ExternalizableConstraint.class, "ExternalizableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(externalizableConstraintEClass, ecorePackage.getEBoolean(), "isExternal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(setComparisonConstraintEClass, SetComparisonConstraint.class, "SetComparisonConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constrainingValuesEClass, ConstrainingValues.class, "ConstrainingValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constrainingRangeEClass, ConstrainingRange.class, "ConstrainingRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subSetConstraintEClass, SubSetConstraint.class, "SubSetConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalityConstraintEClass, EqualityConstraint.class, "EqualityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusionConstraintEClass, ExclusionConstraint.class, "ExclusionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subTypeEClass, SubType.class, "SubType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubType_Parent(), this.getEntity(), null, "Parent", null, 1, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubType_Child(), this.getEntity(), null, "Child", null, 1, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyConstraintEClass, FrequencyConstraint.class, "FrequencyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ringConstraintEClass, RingConstraint.class, "RingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acyclicEClass, Acyclic.class, "Acyclic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(irreflexiveEClass, Irreflexive.class, "Irreflexive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intransitiveEClass, Intransitive.class, "Intransitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asymmetricEClass, Asymmetric.class, "Asymmetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(antiSymmetricEClass, AntiSymmetric.class, "AntiSymmetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(symmetricEClass, Symmetric.class, "Symmetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityRoleEClass, EntityRole.class, "EntityRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityRole_Entity(), this.getEntity(), null, "Entity", null, 1, 1, EntityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRole_Role(), this.getRole(), null, "Role", null, 1, 1, EntityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityRole_Mandatory(), ecorePackage.getEBoolean(), "Mandatory", "false", 0, 1, EntityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRole_Constraints(), this.getConstraint(), null, "Constraints", null, 0, -1, EntityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PackageImpl
