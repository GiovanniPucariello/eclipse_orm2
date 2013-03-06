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
import net.orm.EqualityConstraint;
import net.orm.ExclusionConstraint;
import net.orm.ExternalizableConstraint;
import net.orm.Factory;
import net.orm.FrequencyConstraint;
import net.orm.Intransitive;
import net.orm.Irreflexive;
import net.orm.MandatoryConstraint;
import net.orm.ObjectRole;
import net.orm.Predicate;
import net.orm.ReferenceScheme;
import net.orm.RingConstraint;
import net.orm.Role;
import net.orm.SchemaDiagram;
import net.orm.SchemaDiagramMember;
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
			case net.orm.Package.ROLE: return createRole();
			case net.orm.Package.OBJECT: return createObject();
			case net.orm.Package.PREDICATE: return createPredicate();
			case net.orm.Package.SCHEMA_DIAGRAM: return createSchemaDiagram();
			case net.orm.Package.CONSTRAINT: return createConstraint();
			case net.orm.Package.MANDATORY_CONSTRAINT: return createMandatoryConstraint();
			case net.orm.Package.UNIQUENESS_CONSTRAINT: return createUniquenessConstraint();
			case net.orm.Package.REFERENCE_SCHEME: return createReferenceScheme();
			case net.orm.Package.VALUE_CONSTRAINT: return createValueConstraint();
			case net.orm.Package.EXTERNALIZABLE_CONSTRAINT: return createExternalizableConstraint();
			case net.orm.Package.SET_COMPARISON_CONSTRAINT: return createSetComparisonConstraint();
			case net.orm.Package.CONSTRAINING_VALUES: return createConstrainingValues();
			case net.orm.Package.CONSTRAINING_RANGE: return createConstrainingRange();
			case net.orm.Package.SUB_SET_CONSTRAINT: return createSubSetConstraint();
			case net.orm.Package.EQUALITY_CONSTRAINT: return createEqualityConstraint();
			case net.orm.Package.EXCLUSION_CONSTRAINT: return createExclusionConstraint();
			case net.orm.Package.SUB_TYPE: return createSubType();
			case net.orm.Package.FREQUENCY_CONSTRAINT: return createFrequencyConstraint();
			case net.orm.Package.RING_CONSTRAINT: return createRingConstraint();
			case net.orm.Package.ACYCLIC: return createAcyclic();
			case net.orm.Package.IRREFLEXIVE: return createIrreflexive();
			case net.orm.Package.INTRANSITIVE: return createIntransitive();
			case net.orm.Package.ASYMMETRIC: return createAsymmetric();
			case net.orm.Package.ANTI_SYMMETRIC: return createAntiSymmetric();
			case net.orm.Package.SYMMETRIC: return createSymmetric();
			case net.orm.Package.OBJECT_ROLE: return createObjectRole();
			case net.orm.Package.SCHEMA_DIAGRAM_MEMBER: return createSchemaDiagramMember();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.orm.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaDiagram createSchemaDiagram() {
		SchemaDiagramImpl schemaDiagram = new SchemaDiagramImpl();
		return schemaDiagram;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRole createObjectRole() {
		ObjectRoleImpl objectRole = new ObjectRoleImpl();
		return objectRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaDiagramMember createSchemaDiagramMember() {
		SchemaDiagramMemberImpl schemaDiagramMember = new SchemaDiagramMemberImpl();
		return schemaDiagramMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.orm.Package getPackage() {
		return (net.orm.Package)getEPackage();
	}




} // FactoryImpl
