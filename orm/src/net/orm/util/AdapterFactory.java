/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm.util;

import net.orm.Acyclic;
import net.orm.AntiSymmetric;
import net.orm.Asymmetric;
import net.orm.ConstrainingRange;
import net.orm.ConstrainingValues;
import net.orm.Constraint;
import net.orm.EqualityConstraint;
import net.orm.ExclusionConstraint;
import net.orm.ExternalizableConstraint;
import net.orm.FrequencyConstraint;
import net.orm.Intransitive;
import net.orm.Irreflexive;
import net.orm.MandatoryConstraint;
import net.orm.ObjectRole;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.orm.Package
 * @generated
 */
public class AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static net.orm.Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = net.orm.Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Switch<Adapter> modelSwitch =
		new Switch<Adapter>() {
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseObject(net.orm.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseSchemaShape(SchemaShape object) {
				return createSchemaShapeAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseMandatoryConstraint(MandatoryConstraint object) {
				return createMandatoryConstraintAdapter();
			}
			@Override
			public Adapter caseUniquenessConstraint(UniquenessConstraint object) {
				return createUniquenessConstraintAdapter();
			}
			@Override
			public Adapter caseReferenceScheme(ReferenceScheme object) {
				return createReferenceSchemeAdapter();
			}
			@Override
			public Adapter caseValueConstraint(ValueConstraint object) {
				return createValueConstraintAdapter();
			}
			@Override
			public Adapter caseExternalizableConstraint(ExternalizableConstraint object) {
				return createExternalizableConstraintAdapter();
			}
			@Override
			public Adapter caseSetComparisonConstraint(SetComparisonConstraint object) {
				return createSetComparisonConstraintAdapter();
			}
			@Override
			public Adapter caseConstrainingValues(ConstrainingValues object) {
				return createConstrainingValuesAdapter();
			}
			@Override
			public Adapter caseConstrainingRange(ConstrainingRange object) {
				return createConstrainingRangeAdapter();
			}
			@Override
			public Adapter caseSubSetConstraint(SubSetConstraint object) {
				return createSubSetConstraintAdapter();
			}
			@Override
			public Adapter caseEqualityConstraint(EqualityConstraint object) {
				return createEqualityConstraintAdapter();
			}
			@Override
			public Adapter caseExclusionConstraint(ExclusionConstraint object) {
				return createExclusionConstraintAdapter();
			}
			@Override
			public Adapter caseSubType(SubType object) {
				return createSubTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyConstraint(FrequencyConstraint object) {
				return createFrequencyConstraintAdapter();
			}
			@Override
			public Adapter caseRingConstraint(RingConstraint object) {
				return createRingConstraintAdapter();
			}
			@Override
			public Adapter caseAcyclic(Acyclic object) {
				return createAcyclicAdapter();
			}
			@Override
			public Adapter caseIrreflexive(Irreflexive object) {
				return createIrreflexiveAdapter();
			}
			@Override
			public Adapter caseIntransitive(Intransitive object) {
				return createIntransitiveAdapter();
			}
			@Override
			public Adapter caseAsymmetric(Asymmetric object) {
				return createAsymmetricAdapter();
			}
			@Override
			public Adapter caseAntiSymmetric(AntiSymmetric object) {
				return createAntiSymmetricAdapter();
			}
			@Override
			public Adapter caseSymmetric(Symmetric object) {
				return createSymmetricAdapter();
			}
			@Override
			public Adapter caseObjectRole(ObjectRole object) {
				return createObjectRoleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.SchemaShape <em>Schema Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.SchemaShape
	 * @generated
	 */
	public Adapter createSchemaShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.MandatoryConstraint <em>Mandatory Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.MandatoryConstraint
	 * @generated
	 */
	public Adapter createMandatoryConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.UniquenessConstraint <em>Uniqueness Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.UniquenessConstraint
	 * @generated
	 */
	public Adapter createUniquenessConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.ReferenceScheme <em>Reference Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.ReferenceScheme
	 * @generated
	 */
	public Adapter createReferenceSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.ValueConstraint <em>Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.ValueConstraint
	 * @generated
	 */
	public Adapter createValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.ExternalizableConstraint <em>Externalizable Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.ExternalizableConstraint
	 * @generated
	 */
	public Adapter createExternalizableConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.SetComparisonConstraint <em>Set Comparison Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.SetComparisonConstraint
	 * @generated
	 */
	public Adapter createSetComparisonConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.ConstrainingValues <em>Constraining Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.ConstrainingValues
	 * @generated
	 */
	public Adapter createConstrainingValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.ConstrainingRange <em>Constraining Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.ConstrainingRange
	 * @generated
	 */
	public Adapter createConstrainingRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.SubSetConstraint <em>Sub Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.SubSetConstraint
	 * @generated
	 */
	public Adapter createSubSetConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.EqualityConstraint <em>Equality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.EqualityConstraint
	 * @generated
	 */
	public Adapter createEqualityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.ExclusionConstraint <em>Exclusion Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.ExclusionConstraint
	 * @generated
	 */
	public Adapter createExclusionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.SubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.SubType
	 * @generated
	 */
	public Adapter createSubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.FrequencyConstraint <em>Frequency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.FrequencyConstraint
	 * @generated
	 */
	public Adapter createFrequencyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.RingConstraint <em>Ring Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.RingConstraint
	 * @generated
	 */
	public Adapter createRingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Acyclic <em>Acyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Acyclic
	 * @generated
	 */
	public Adapter createAcyclicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Irreflexive <em>Irreflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Irreflexive
	 * @generated
	 */
	public Adapter createIrreflexiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Intransitive <em>Intransitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Intransitive
	 * @generated
	 */
	public Adapter createIntransitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Asymmetric <em>Asymmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Asymmetric
	 * @generated
	 */
	public Adapter createAsymmetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.AntiSymmetric <em>Anti Symmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.AntiSymmetric
	 * @generated
	 */
	public Adapter createAntiSymmetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.Symmetric <em>Symmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.Symmetric
	 * @generated
	 */
	public Adapter createSymmetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.orm.ObjectRole <em>Object Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.orm.ObjectRole
	 * @generated
	 */
	public Adapter createObjectRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AdapterFactory
