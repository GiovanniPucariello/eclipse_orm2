/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.orm.Factory
 * @model kind="package"
 * @generated
 */
public interface Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///net.orm/orm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.orm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Package eINSTANCE = net.orm.impl.PackageImpl.init();

	/**
	 * The meta object id for the '{@link net.orm.impl.SchemaShapeImpl <em>Schema Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.SchemaShapeImpl
	 * @see net.orm.impl.PackageImpl#getSchemaShape()
	 * @generated
	 */
	int SCHEMA_SHAPE = 4;

	/**
	 * The number of structural features of the '<em>Schema Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_SHAPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.RoleImpl
	 * @see net.orm.impl.PackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The feature id for the '<em><b>Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PHRASE = SCHEMA_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = SCHEMA_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.orm.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.EntityImpl
	 * @see net.orm.impl.PackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Occurs Else Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OCCURS_ELSE_WHERE = SCHEMA_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Independent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_INDEPENDENT = SCHEMA_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERENCE_SCHEME = SCHEMA_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = SCHEMA_SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_VALUE_TYPE = SCHEMA_SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = SCHEMA_SHAPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.orm.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.PredicateImpl
	 * @see net.orm.impl.PackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 2;

	/**
	 * The feature id for the '<em><b>Occurs Else Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OCCURS_ELSE_WHERE = SCHEMA_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Independent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IS_INDEPENDENT = SCHEMA_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__REFERENCE_SCHEME = SCHEMA_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NAME = SCHEMA_SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IS_VALUE_TYPE = SCHEMA_SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NAME_SPACE = SCHEMA_SHAPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__ROLES = SCHEMA_SHAPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IS_ENTITY = SCHEMA_SHAPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Arity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__ARITY = SCHEMA_SHAPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__CONSTRAINTS = SCHEMA_SHAPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = SCHEMA_SHAPE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link net.orm.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.SchemaImpl
	 * @see net.orm.impl.PackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Schema Shapes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SCHEMA_SHAPES = 0;

	/**
	 * The feature id for the '<em><b>Entity Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ENTITY_ROLES = 1;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SUB_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CONSTRAINTS = 3;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.orm.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.ConstraintImpl
	 * @see net.orm.impl.PackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ROLES = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.orm.impl.MandatoryConstraintImpl <em>Mandatory Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.MandatoryConstraintImpl
	 * @see net.orm.impl.PackageImpl#getMandatoryConstraint()
	 * @generated
	 */
	int MANDATORY_CONSTRAINT = 6;

	/**
	 * The meta object id for the '{@link net.orm.impl.ExternalizableConstraintImpl <em>Externalizable Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.ExternalizableConstraintImpl
	 * @see net.orm.impl.PackageImpl#getExternalizableConstraint()
	 * @generated
	 */
	int EXTERNALIZABLE_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALIZABLE_CONSTRAINT__ROLES = CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Externalizable Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALIZABLE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CONSTRAINT__ROLES = EXTERNALIZABLE_CONSTRAINT__ROLES;

	/**
	 * The feature id for the '<em><b>Is Disjunctive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CONSTRAINT__IS_DISJUNCTIVE = EXTERNALIZABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mandatory Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CONSTRAINT_FEATURE_COUNT = EXTERNALIZABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.orm.impl.UniquenessConstraintImpl <em>Uniqueness Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.UniquenessConstraintImpl
	 * @see net.orm.impl.PackageImpl#getUniquenessConstraint()
	 * @generated
	 */
	int UNIQUENESS_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUENESS_CONSTRAINT__ROLES = EXTERNALIZABLE_CONSTRAINT__ROLES;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUENESS_CONSTRAINT__IS_PRIMARY = EXTERNALIZABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uniqueness Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUENESS_CONSTRAINT_FEATURE_COUNT = EXTERNALIZABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.orm.impl.ReferenceSchemeImpl <em>Reference Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.ReferenceSchemeImpl
	 * @see net.orm.impl.PackageImpl#getReferenceScheme()
	 * @generated
	 */
	int REFERENCE_SCHEME = 8;

	/**
	 * The number of structural features of the '<em>Reference Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEME_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.ValueConstraintImpl <em>Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.ValueConstraintImpl
	 * @see net.orm.impl.PackageImpl#getValueConstraint()
	 * @generated
	 */
	int VALUE_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT__ROLES = CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.SetComparisonConstraintImpl <em>Set Comparison Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.SetComparisonConstraintImpl
	 * @see net.orm.impl.PackageImpl#getSetComparisonConstraint()
	 * @generated
	 */
	int SET_COMPARISON_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COMPARISON_CONSTRAINT__ROLES = CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Set Comparison Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COMPARISON_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.ConstrainingValuesImpl <em>Constraining Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.ConstrainingValuesImpl
	 * @see net.orm.impl.PackageImpl#getConstrainingValues()
	 * @generated
	 */
	int CONSTRAINING_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_VALUES__ROLES = VALUE_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Constraining Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_VALUES_FEATURE_COUNT = VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.ConstrainingRangeImpl <em>Constraining Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.ConstrainingRangeImpl
	 * @see net.orm.impl.PackageImpl#getConstrainingRange()
	 * @generated
	 */
	int CONSTRAINING_RANGE = 13;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_RANGE__ROLES = VALUE_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Constraining Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINING_RANGE_FEATURE_COUNT = VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.SubSetConstraintImpl <em>Sub Set Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.SubSetConstraintImpl
	 * @see net.orm.impl.PackageImpl#getSubSetConstraint()
	 * @generated
	 */
	int SUB_SET_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SET_CONSTRAINT__ROLES = SET_COMPARISON_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Sub Set Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SET_CONSTRAINT_FEATURE_COUNT = SET_COMPARISON_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.EqualityConstraintImpl <em>Equality Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.EqualityConstraintImpl
	 * @see net.orm.impl.PackageImpl#getEqualityConstraint()
	 * @generated
	 */
	int EQUALITY_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_CONSTRAINT__ROLES = SET_COMPARISON_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Equality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_CONSTRAINT_FEATURE_COUNT = SET_COMPARISON_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.ExclusionConstraintImpl <em>Exclusion Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.ExclusionConstraintImpl
	 * @see net.orm.impl.PackageImpl#getExclusionConstraint()
	 * @generated
	 */
	int EXCLUSION_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_CONSTRAINT__ROLES = SET_COMPARISON_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Exclusion Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_CONSTRAINT_FEATURE_COUNT = SET_COMPARISON_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.SubTypeImpl <em>Sub Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.SubTypeImpl
	 * @see net.orm.impl.PackageImpl#getSubType()
	 * @generated
	 */
	int SUB_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__CHILD = 1;

	/**
	 * The number of structural features of the '<em>Sub Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.orm.impl.FrequencyConstraintImpl <em>Frequency Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.FrequencyConstraintImpl
	 * @see net.orm.impl.PackageImpl#getFrequencyConstraint()
	 * @generated
	 */
	int FREQUENCY_CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONSTRAINT__ROLES = CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Frequency Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.RingConstraintImpl <em>Ring Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.RingConstraintImpl
	 * @see net.orm.impl.PackageImpl#getRingConstraint()
	 * @generated
	 */
	int RING_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_CONSTRAINT__ROLES = CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Ring Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.AcyclicImpl <em>Acyclic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.AcyclicImpl
	 * @see net.orm.impl.PackageImpl#getAcyclic()
	 * @generated
	 */
	int ACYCLIC = 20;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACYCLIC__ROLES = RING_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Acyclic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACYCLIC_FEATURE_COUNT = RING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.IrreflexiveImpl <em>Irreflexive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.IrreflexiveImpl
	 * @see net.orm.impl.PackageImpl#getIrreflexive()
	 * @generated
	 */
	int IRREFLEXIVE = 21;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE__ROLES = RING_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Irreflexive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_FEATURE_COUNT = RING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.IntransitiveImpl <em>Intransitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.IntransitiveImpl
	 * @see net.orm.impl.PackageImpl#getIntransitive()
	 * @generated
	 */
	int INTRANSITIVE = 22;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRANSITIVE__ROLES = RING_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Intransitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRANSITIVE_FEATURE_COUNT = RING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.AsymmetricImpl <em>Asymmetric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.AsymmetricImpl
	 * @see net.orm.impl.PackageImpl#getAsymmetric()
	 * @generated
	 */
	int ASYMMETRIC = 23;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC__ROLES = RING_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Asymmetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYMMETRIC_FEATURE_COUNT = RING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.AntiSymmetricImpl <em>Anti Symmetric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.AntiSymmetricImpl
	 * @see net.orm.impl.PackageImpl#getAntiSymmetric()
	 * @generated
	 */
	int ANTI_SYMMETRIC = 24;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_SYMMETRIC__ROLES = RING_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Anti Symmetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_SYMMETRIC_FEATURE_COUNT = RING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.SymmetricImpl <em>Symmetric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.SymmetricImpl
	 * @see net.orm.impl.PackageImpl#getSymmetric()
	 * @generated
	 */
	int SYMMETRIC = 25;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC__ROLES = RING_CONSTRAINT__ROLES;

	/**
	 * The number of structural features of the '<em>Symmetric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_FEATURE_COUNT = RING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.orm.impl.EntityRoleImpl <em>Entity Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.orm.impl.EntityRoleImpl
	 * @see net.orm.impl.PackageImpl#getEntityRole()
	 * @generated
	 */
	int ENTITY_ROLE = 26;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ROLE__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ROLE__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ROLE__MANDATORY = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ROLE__CONSTRAINTS = 3;

	/**
	 * The number of structural features of the '<em>Entity Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ROLE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link net.orm.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see net.orm.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.Role#getPhrase <em>Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phrase</em>'.
	 * @see net.orm.Role#getPhrase()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Phrase();

	/**
	 * Returns the meta object for class '{@link net.orm.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see net.orm.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.Entity#isOccursElseWhere <em>Occurs Else Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurs Else Where</em>'.
	 * @see net.orm.Entity#isOccursElseWhere()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_OccursElseWhere();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.Entity#isIsIndependent <em>Is Independent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Independent</em>'.
	 * @see net.orm.Entity#isIsIndependent()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_IsIndependent();

	/**
	 * Returns the meta object for the reference '{@link net.orm.Entity#getReferenceScheme <em>Reference Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Scheme</em>'.
	 * @see net.orm.Entity#getReferenceScheme()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ReferenceScheme();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.orm.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.Entity#isIsValueType <em>Is Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Value Type</em>'.
	 * @see net.orm.Entity#isIsValueType()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_IsValueType();

	/**
	 * Returns the meta object for class '{@link net.orm.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see net.orm.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.Predicate#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see net.orm.Predicate#getNameSpace()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_NameSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link net.orm.Predicate#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see net.orm.Predicate#getRoles()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Roles();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.Predicate#isIsEntity <em>Is Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entity</em>'.
	 * @see net.orm.Predicate#isIsEntity()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_IsEntity();

	/**
	 * Returns the meta object for the attribute list '{@link net.orm.Predicate#getArity <em>Arity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arity</em>'.
	 * @see net.orm.Predicate#getArity()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Arity();

	/**
	 * Returns the meta object for the containment reference list '{@link net.orm.Predicate#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see net.orm.Predicate#getConstraints()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Constraints();

	/**
	 * Returns the meta object for class '{@link net.orm.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see net.orm.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link net.orm.Schema#getSchemaShapes <em>Schema Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Shapes</em>'.
	 * @see net.orm.Schema#getSchemaShapes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_SchemaShapes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.orm.Schema#getEntityRoles <em>Entity Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Roles</em>'.
	 * @see net.orm.Schema#getEntityRoles()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_EntityRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link net.orm.Schema#getSubTypes <em>Sub Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Types</em>'.
	 * @see net.orm.Schema#getSubTypes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_SubTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.orm.Schema#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see net.orm.Schema#getConstraints()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Constraints();

	/**
	 * Returns the meta object for class '{@link net.orm.SchemaShape <em>Schema Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Shape</em>'.
	 * @see net.orm.SchemaShape
	 * @generated
	 */
	EClass getSchemaShape();

	/**
	 * Returns the meta object for class '{@link net.orm.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see net.orm.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference list '{@link net.orm.Constraint#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see net.orm.Constraint#getRoles()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Roles();

	/**
	 * Returns the meta object for class '{@link net.orm.MandatoryConstraint <em>Mandatory Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Constraint</em>'.
	 * @see net.orm.MandatoryConstraint
	 * @generated
	 */
	EClass getMandatoryConstraint();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.MandatoryConstraint#isIsDisjunctive <em>Is Disjunctive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disjunctive</em>'.
	 * @see net.orm.MandatoryConstraint#isIsDisjunctive()
	 * @see #getMandatoryConstraint()
	 * @generated
	 */
	EAttribute getMandatoryConstraint_IsDisjunctive();

	/**
	 * Returns the meta object for class '{@link net.orm.UniquenessConstraint <em>Uniqueness Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniqueness Constraint</em>'.
	 * @see net.orm.UniquenessConstraint
	 * @generated
	 */
	EClass getUniquenessConstraint();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.UniquenessConstraint#isIsPrimary <em>Is Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary</em>'.
	 * @see net.orm.UniquenessConstraint#isIsPrimary()
	 * @see #getUniquenessConstraint()
	 * @generated
	 */
	EAttribute getUniquenessConstraint_IsPrimary();

	/**
	 * Returns the meta object for class '{@link net.orm.ReferenceScheme <em>Reference Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Scheme</em>'.
	 * @see net.orm.ReferenceScheme
	 * @generated
	 */
	EClass getReferenceScheme();

	/**
	 * Returns the meta object for class '{@link net.orm.ValueConstraint <em>Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Constraint</em>'.
	 * @see net.orm.ValueConstraint
	 * @generated
	 */
	EClass getValueConstraint();

	/**
	 * Returns the meta object for class '{@link net.orm.ExternalizableConstraint <em>Externalizable Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Externalizable Constraint</em>'.
	 * @see net.orm.ExternalizableConstraint
	 * @generated
	 */
	EClass getExternalizableConstraint();

	/**
	 * Returns the meta object for class '{@link net.orm.SetComparisonConstraint <em>Set Comparison Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Comparison Constraint</em>'.
	 * @see net.orm.SetComparisonConstraint
	 * @generated
	 */
	EClass getSetComparisonConstraint();

	/**
	 * Returns the meta object for class '{@link net.orm.ConstrainingValues <em>Constraining Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraining Values</em>'.
	 * @see net.orm.ConstrainingValues
	 * @generated
	 */
	EClass getConstrainingValues();

	/**
	 * Returns the meta object for class '{@link net.orm.ConstrainingRange <em>Constraining Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraining Range</em>'.
	 * @see net.orm.ConstrainingRange
	 * @generated
	 */
	EClass getConstrainingRange();

	/**
	 * Returns the meta object for class '{@link net.orm.SubSetConstraint <em>Sub Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Set Constraint</em>'.
	 * @see net.orm.SubSetConstraint
	 * @generated
	 */
	EClass getSubSetConstraint();

	/**
	 * Returns the meta object for class '{@link net.orm.EqualityConstraint <em>Equality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Constraint</em>'.
	 * @see net.orm.EqualityConstraint
	 * @generated
	 */
	EClass getEqualityConstraint();

	/**
	 * Returns the meta object for class '{@link net.orm.ExclusionConstraint <em>Exclusion Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion Constraint</em>'.
	 * @see net.orm.ExclusionConstraint
	 * @generated
	 */
	EClass getExclusionConstraint();

	/**
	 * Returns the meta object for class '{@link net.orm.SubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Type</em>'.
	 * @see net.orm.SubType
	 * @generated
	 */
	EClass getSubType();

	/**
	 * Returns the meta object for the reference '{@link net.orm.SubType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see net.orm.SubType#getParent()
	 * @see #getSubType()
	 * @generated
	 */
	EReference getSubType_Parent();

	/**
	 * Returns the meta object for the reference '{@link net.orm.SubType#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see net.orm.SubType#getChild()
	 * @see #getSubType()
	 * @generated
	 */
	EReference getSubType_Child();

	/**
	 * Returns the meta object for class '{@link net.orm.FrequencyConstraint <em>Frequency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Constraint</em>'.
	 * @see net.orm.FrequencyConstraint
	 * @generated
	 */
	EClass getFrequencyConstraint();

	/**
	 * Returns the meta object for class '{@link net.orm.RingConstraint <em>Ring Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ring Constraint</em>'.
	 * @see net.orm.RingConstraint
	 * @generated
	 */
	EClass getRingConstraint();

	/**
	 * Returns the meta object for class '{@link net.orm.Acyclic <em>Acyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acyclic</em>'.
	 * @see net.orm.Acyclic
	 * @generated
	 */
	EClass getAcyclic();

	/**
	 * Returns the meta object for class '{@link net.orm.Irreflexive <em>Irreflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irreflexive</em>'.
	 * @see net.orm.Irreflexive
	 * @generated
	 */
	EClass getIrreflexive();

	/**
	 * Returns the meta object for class '{@link net.orm.Intransitive <em>Intransitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intransitive</em>'.
	 * @see net.orm.Intransitive
	 * @generated
	 */
	EClass getIntransitive();

	/**
	 * Returns the meta object for class '{@link net.orm.Asymmetric <em>Asymmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asymmetric</em>'.
	 * @see net.orm.Asymmetric
	 * @generated
	 */
	EClass getAsymmetric();

	/**
	 * Returns the meta object for class '{@link net.orm.AntiSymmetric <em>Anti Symmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anti Symmetric</em>'.
	 * @see net.orm.AntiSymmetric
	 * @generated
	 */
	EClass getAntiSymmetric();

	/**
	 * Returns the meta object for class '{@link net.orm.Symmetric <em>Symmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symmetric</em>'.
	 * @see net.orm.Symmetric
	 * @generated
	 */
	EClass getSymmetric();

	/**
	 * Returns the meta object for class '{@link net.orm.EntityRole <em>Entity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Role</em>'.
	 * @see net.orm.EntityRole
	 * @generated
	 */
	EClass getEntityRole();

	/**
	 * Returns the meta object for the reference '{@link net.orm.EntityRole#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see net.orm.EntityRole#getEntity()
	 * @see #getEntityRole()
	 * @generated
	 */
	EReference getEntityRole_Entity();

	/**
	 * Returns the meta object for the reference '{@link net.orm.EntityRole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see net.orm.EntityRole#getRole()
	 * @see #getEntityRole()
	 * @generated
	 */
	EReference getEntityRole_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.orm.EntityRole#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see net.orm.EntityRole#isMandatory()
	 * @see #getEntityRole()
	 * @generated
	 */
	EAttribute getEntityRole_Mandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link net.orm.EntityRole#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see net.orm.EntityRole#getConstraints()
	 * @see #getEntityRole()
	 * @generated
	 */
	EReference getEntityRole_Constraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Factory getFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.orm.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.RoleImpl
		 * @see net.orm.impl.PackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Phrase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__PHRASE = eINSTANCE.getRole_Phrase();

		/**
		 * The meta object literal for the '{@link net.orm.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.EntityImpl
		 * @see net.orm.impl.PackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Occurs Else Where</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__OCCURS_ELSE_WHERE = eINSTANCE.getEntity_OccursElseWhere();

		/**
		 * The meta object literal for the '<em><b>Is Independent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IS_INDEPENDENT = eINSTANCE.getEntity_IsIndependent();

		/**
		 * The meta object literal for the '<em><b>Reference Scheme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REFERENCE_SCHEME = eINSTANCE.getEntity_ReferenceScheme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Is Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IS_VALUE_TYPE = eINSTANCE.getEntity_IsValueType();

		/**
		 * The meta object literal for the '{@link net.orm.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.PredicateImpl
		 * @see net.orm.impl.PackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__NAME_SPACE = eINSTANCE.getPredicate_NameSpace();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__ROLES = eINSTANCE.getPredicate_Roles();

		/**
		 * The meta object literal for the '<em><b>Is Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__IS_ENTITY = eINSTANCE.getPredicate_IsEntity();

		/**
		 * The meta object literal for the '<em><b>Arity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__ARITY = eINSTANCE.getPredicate_Arity();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__CONSTRAINTS = eINSTANCE.getPredicate_Constraints();

		/**
		 * The meta object literal for the '{@link net.orm.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.SchemaImpl
		 * @see net.orm.impl.PackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Schema Shapes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__SCHEMA_SHAPES = eINSTANCE.getSchema_SchemaShapes();

		/**
		 * The meta object literal for the '<em><b>Entity Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ENTITY_ROLES = eINSTANCE.getSchema_EntityRoles();

		/**
		 * The meta object literal for the '<em><b>Sub Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__SUB_TYPES = eINSTANCE.getSchema_SubTypes();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__CONSTRAINTS = eINSTANCE.getSchema_Constraints();

		/**
		 * The meta object literal for the '{@link net.orm.impl.SchemaShapeImpl <em>Schema Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.SchemaShapeImpl
		 * @see net.orm.impl.PackageImpl#getSchemaShape()
		 * @generated
		 */
		EClass SCHEMA_SHAPE = eINSTANCE.getSchemaShape();

		/**
		 * The meta object literal for the '{@link net.orm.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.ConstraintImpl
		 * @see net.orm.impl.PackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__ROLES = eINSTANCE.getConstraint_Roles();

		/**
		 * The meta object literal for the '{@link net.orm.impl.MandatoryConstraintImpl <em>Mandatory Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.MandatoryConstraintImpl
		 * @see net.orm.impl.PackageImpl#getMandatoryConstraint()
		 * @generated
		 */
		EClass MANDATORY_CONSTRAINT = eINSTANCE.getMandatoryConstraint();

		/**
		 * The meta object literal for the '<em><b>Is Disjunctive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANDATORY_CONSTRAINT__IS_DISJUNCTIVE = eINSTANCE.getMandatoryConstraint_IsDisjunctive();

		/**
		 * The meta object literal for the '{@link net.orm.impl.UniquenessConstraintImpl <em>Uniqueness Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.UniquenessConstraintImpl
		 * @see net.orm.impl.PackageImpl#getUniquenessConstraint()
		 * @generated
		 */
		EClass UNIQUENESS_CONSTRAINT = eINSTANCE.getUniquenessConstraint();

		/**
		 * The meta object literal for the '<em><b>Is Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUENESS_CONSTRAINT__IS_PRIMARY = eINSTANCE.getUniquenessConstraint_IsPrimary();

		/**
		 * The meta object literal for the '{@link net.orm.impl.ReferenceSchemeImpl <em>Reference Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.ReferenceSchemeImpl
		 * @see net.orm.impl.PackageImpl#getReferenceScheme()
		 * @generated
		 */
		EClass REFERENCE_SCHEME = eINSTANCE.getReferenceScheme();

		/**
		 * The meta object literal for the '{@link net.orm.impl.ValueConstraintImpl <em>Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.ValueConstraintImpl
		 * @see net.orm.impl.PackageImpl#getValueConstraint()
		 * @generated
		 */
		EClass VALUE_CONSTRAINT = eINSTANCE.getValueConstraint();

		/**
		 * The meta object literal for the '{@link net.orm.impl.ExternalizableConstraintImpl <em>Externalizable Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.ExternalizableConstraintImpl
		 * @see net.orm.impl.PackageImpl#getExternalizableConstraint()
		 * @generated
		 */
		EClass EXTERNALIZABLE_CONSTRAINT = eINSTANCE.getExternalizableConstraint();

		/**
		 * The meta object literal for the '{@link net.orm.impl.SetComparisonConstraintImpl <em>Set Comparison Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.SetComparisonConstraintImpl
		 * @see net.orm.impl.PackageImpl#getSetComparisonConstraint()
		 * @generated
		 */
		EClass SET_COMPARISON_CONSTRAINT = eINSTANCE.getSetComparisonConstraint();

		/**
		 * The meta object literal for the '{@link net.orm.impl.ConstrainingValuesImpl <em>Constraining Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.ConstrainingValuesImpl
		 * @see net.orm.impl.PackageImpl#getConstrainingValues()
		 * @generated
		 */
		EClass CONSTRAINING_VALUES = eINSTANCE.getConstrainingValues();

		/**
		 * The meta object literal for the '{@link net.orm.impl.ConstrainingRangeImpl <em>Constraining Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.ConstrainingRangeImpl
		 * @see net.orm.impl.PackageImpl#getConstrainingRange()
		 * @generated
		 */
		EClass CONSTRAINING_RANGE = eINSTANCE.getConstrainingRange();

		/**
		 * The meta object literal for the '{@link net.orm.impl.SubSetConstraintImpl <em>Sub Set Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.SubSetConstraintImpl
		 * @see net.orm.impl.PackageImpl#getSubSetConstraint()
		 * @generated
		 */
		EClass SUB_SET_CONSTRAINT = eINSTANCE.getSubSetConstraint();

		/**
		 * The meta object literal for the '{@link net.orm.impl.EqualityConstraintImpl <em>Equality Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.EqualityConstraintImpl
		 * @see net.orm.impl.PackageImpl#getEqualityConstraint()
		 * @generated
		 */
		EClass EQUALITY_CONSTRAINT = eINSTANCE.getEqualityConstraint();

		/**
		 * The meta object literal for the '{@link net.orm.impl.ExclusionConstraintImpl <em>Exclusion Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.ExclusionConstraintImpl
		 * @see net.orm.impl.PackageImpl#getExclusionConstraint()
		 * @generated
		 */
		EClass EXCLUSION_CONSTRAINT = eINSTANCE.getExclusionConstraint();

		/**
		 * The meta object literal for the '{@link net.orm.impl.SubTypeImpl <em>Sub Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.SubTypeImpl
		 * @see net.orm.impl.PackageImpl#getSubType()
		 * @generated
		 */
		EClass SUB_TYPE = eINSTANCE.getSubType();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TYPE__PARENT = eINSTANCE.getSubType_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TYPE__CHILD = eINSTANCE.getSubType_Child();

		/**
		 * The meta object literal for the '{@link net.orm.impl.FrequencyConstraintImpl <em>Frequency Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.FrequencyConstraintImpl
		 * @see net.orm.impl.PackageImpl#getFrequencyConstraint()
		 * @generated
		 */
		EClass FREQUENCY_CONSTRAINT = eINSTANCE.getFrequencyConstraint();

		/**
		 * The meta object literal for the '{@link net.orm.impl.RingConstraintImpl <em>Ring Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.RingConstraintImpl
		 * @see net.orm.impl.PackageImpl#getRingConstraint()
		 * @generated
		 */
		EClass RING_CONSTRAINT = eINSTANCE.getRingConstraint();

		/**
		 * The meta object literal for the '{@link net.orm.impl.AcyclicImpl <em>Acyclic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.AcyclicImpl
		 * @see net.orm.impl.PackageImpl#getAcyclic()
		 * @generated
		 */
		EClass ACYCLIC = eINSTANCE.getAcyclic();

		/**
		 * The meta object literal for the '{@link net.orm.impl.IrreflexiveImpl <em>Irreflexive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.IrreflexiveImpl
		 * @see net.orm.impl.PackageImpl#getIrreflexive()
		 * @generated
		 */
		EClass IRREFLEXIVE = eINSTANCE.getIrreflexive();

		/**
		 * The meta object literal for the '{@link net.orm.impl.IntransitiveImpl <em>Intransitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.IntransitiveImpl
		 * @see net.orm.impl.PackageImpl#getIntransitive()
		 * @generated
		 */
		EClass INTRANSITIVE = eINSTANCE.getIntransitive();

		/**
		 * The meta object literal for the '{@link net.orm.impl.AsymmetricImpl <em>Asymmetric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.AsymmetricImpl
		 * @see net.orm.impl.PackageImpl#getAsymmetric()
		 * @generated
		 */
		EClass ASYMMETRIC = eINSTANCE.getAsymmetric();

		/**
		 * The meta object literal for the '{@link net.orm.impl.AntiSymmetricImpl <em>Anti Symmetric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.AntiSymmetricImpl
		 * @see net.orm.impl.PackageImpl#getAntiSymmetric()
		 * @generated
		 */
		EClass ANTI_SYMMETRIC = eINSTANCE.getAntiSymmetric();

		/**
		 * The meta object literal for the '{@link net.orm.impl.SymmetricImpl <em>Symmetric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.SymmetricImpl
		 * @see net.orm.impl.PackageImpl#getSymmetric()
		 * @generated
		 */
		EClass SYMMETRIC = eINSTANCE.getSymmetric();

		/**
		 * The meta object literal for the '{@link net.orm.impl.EntityRoleImpl <em>Entity Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.orm.impl.EntityRoleImpl
		 * @see net.orm.impl.PackageImpl#getEntityRole()
		 * @generated
		 */
		EClass ENTITY_ROLE = eINSTANCE.getEntityRole();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ROLE__ENTITY = eINSTANCE.getEntityRole_Entity();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ROLE__ROLE = eINSTANCE.getEntityRole_Role();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ROLE__MANDATORY = eINSTANCE.getEntityRole_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ROLE__CONSTRAINTS = eINSTANCE.getEntityRole_Constraints();

	}

} //Package
