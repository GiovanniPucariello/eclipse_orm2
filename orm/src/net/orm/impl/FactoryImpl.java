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
import net.orm.Package;
import net.orm.Predicate;
import net.orm.ReferenceScheme;
import net.orm.RingConstraint;
import net.orm.Role;
import net.orm.Schema;
import net.orm.SetComparisonConstraint;
import net.orm.SubSetConstraint;
import net.orm.SubType;
import net.orm.Symmetric;
import net.orm.UniquenessConstraint;
import net.orm.ValueConstraint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class FactoryImpl extends EFactoryImpl implements Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static Factory init() {
		try {
			Factory theFactory = (Factory)EPackage.Registry.INSTANCE.getEFactory("http:///net.orm/orm.ecore"); 
			if (theFactory != null) {
				return theFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Package.ROLE: return createRole();
			case Package.ENTITY: return createEntity();
			case Package.PREDICATE: return createPredicate();
			case Package.SCHEMA: return createSchema();
			case Package.CONSTRAINT: return createConstraint();
			case Package.MANDATORY_CONSTRAINT: return createMandatoryConstraint();
			case Package.UNIQUENESS_CONSTRAINT: return createUniquenessConstraint();
			case Package.REFERENCE_SCHEME: return createReferenceScheme();
			case Package.VALUE_CONSTRAINT: return createValueConstraint();
			case Package.EXTERNALIZABLE_CONSTRAINT: return createExternalizableConstraint();
			case Package.SET_COMPARISON_CONSTRAINT: return createSetComparisonConstraint();
			case Package.CONSTRAINING_VALUES: return createConstrainingValues();
			case Package.CONSTRAINING_RANGE: return createConstrainingRange();
			case Package.SUB_SET_CONSTRAINT: return createSubSetConstraint();
			case Package.EQUALITY_CONSTRAINT: return createEqualityConstraint();
			case Package.EXCLUSION_CONSTRAINT: return createExclusionConstraint();
			case Package.SUB_TYPE: return createSubType();
			case Package.FREQUENCY_CONSTRAINT: return createFrequencyConstraint();
			case Package.RING_CONSTRAINT: return createRingConstraint();
			case Package.ACYCLIC: return createAcyclic();
			case Package.IRREFLEXIVE: return createIrreflexive();
			case Package.INTRANSITIVE: return createIntransitive();
			case Package.ASYMMETRIC: return createAsymmetric();
			case Package.ANTI_SYMMETRIC: return createAntiSymmetric();
			case Package.SYMMETRIC: return createSymmetric();
			case Package.ENTITY_ROLE: return createEntityRole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryConstraint createMandatoryConstraint() {
		MandatoryConstraintImpl mandatoryConstraint = new MandatoryConstraintImpl();
		return mandatoryConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UniquenessConstraint createUniquenessConstraint() {
		UniquenessConstraintImpl uniquenessConstraint = new UniquenessConstraintImpl();
		return uniquenessConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceScheme createReferenceScheme() {
		ReferenceSchemeImpl referenceScheme = new ReferenceSchemeImpl();
		return referenceScheme;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraint createValueConstraint() {
		ValueConstraintImpl valueConstraint = new ValueConstraintImpl();
		return valueConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalizableConstraint createExternalizableConstraint() {
		ExternalizableConstraintImpl externalizableConstraint = new ExternalizableConstraintImpl();
		return externalizableConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SetComparisonConstraint createSetComparisonConstraint() {
		SetComparisonConstraintImpl setComparisonConstraint = new SetComparisonConstraintImpl();
		return setComparisonConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainingValues createConstrainingValues() {
		ConstrainingValuesImpl constrainingValues = new ConstrainingValuesImpl();
		return constrainingValues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainingRange createConstrainingRange() {
		ConstrainingRangeImpl constrainingRange = new ConstrainingRangeImpl();
		return constrainingRange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SubSetConstraint createSubSetConstraint() {
		SubSetConstraintImpl subSetConstraint = new SubSetConstraintImpl();
		return subSetConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityConstraint createEqualityConstraint() {
		EqualityConstraintImpl equalityConstraint = new EqualityConstraintImpl();
		return equalityConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusionConstraint createExclusionConstraint() {
		ExclusionConstraintImpl exclusionConstraint = new ExclusionConstraintImpl();
		return exclusionConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SubType createSubType() {
		SubTypeImpl subType = new SubTypeImpl();
		return subType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraint createFrequencyConstraint() {
		FrequencyConstraintImpl frequencyConstraint = new FrequencyConstraintImpl();
		return frequencyConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RingConstraint createRingConstraint() {
		RingConstraintImpl ringConstraint = new RingConstraintImpl();
		return ringConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Acyclic createAcyclic() {
		AcyclicImpl acyclic = new AcyclicImpl();
		return acyclic;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Irreflexive createIrreflexive() {
		IrreflexiveImpl irreflexive = new IrreflexiveImpl();
		return irreflexive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Intransitive createIntransitive() {
		IntransitiveImpl intransitive = new IntransitiveImpl();
		return intransitive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Asymmetric createAsymmetric() {
		AsymmetricImpl asymmetric = new AsymmetricImpl();
		return asymmetric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AntiSymmetric createAntiSymmetric() {
		AntiSymmetricImpl antiSymmetric = new AntiSymmetricImpl();
		return antiSymmetric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Symmetric createSymmetric() {
		SymmetricImpl symmetric = new SymmetricImpl();
		return symmetric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRole createEntityRole() {
		EntityRoleImpl entityRole = new EntityRoleImpl();
		return entityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package getPackage() {
		return (Package)getEPackage();
	}



} // FactoryImpl
