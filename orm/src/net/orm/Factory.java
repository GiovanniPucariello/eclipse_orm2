/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.orm.Package
 * @generated
 */
public interface Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Factory eINSTANCE = net.orm.impl.FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate</em>'.
	 * @generated
	 */
	Predicate createPredicate();

	/**
	 * Returns a new object of class '<em>Schema Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Diagram</em>'.
	 * @generated
	 */
	SchemaDiagram createSchemaDiagram();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Mandatory Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Constraint</em>'.
	 * @generated
	 */
	MandatoryConstraint createMandatoryConstraint();

	/**
	 * Returns a new object of class '<em>Uniqueness Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniqueness Constraint</em>'.
	 * @generated
	 */
	UniquenessConstraint createUniquenessConstraint();

	/**
	 * Returns a new object of class '<em>Reference Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Scheme</em>'.
	 * @generated
	 */
	ReferenceScheme createReferenceScheme();

	/**
	 * Returns a new object of class '<em>Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Constraint</em>'.
	 * @generated
	 */
	ValueConstraint createValueConstraint();

	/**
	 * Returns a new object of class '<em>Externalizable Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Externalizable Constraint</em>'.
	 * @generated
	 */
	ExternalizableConstraint createExternalizableConstraint();

	/**
	 * Returns a new object of class '<em>Set Comparison Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Comparison Constraint</em>'.
	 * @generated
	 */
	SetComparisonConstraint createSetComparisonConstraint();

	/**
	 * Returns a new object of class '<em>Constraining Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraining Values</em>'.
	 * @generated
	 */
	ConstrainingValues createConstrainingValues();

	/**
	 * Returns a new object of class '<em>Constraining Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraining Range</em>'.
	 * @generated
	 */
	ConstrainingRange createConstrainingRange();

	/**
	 * Returns a new object of class '<em>Sub Set Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Set Constraint</em>'.
	 * @generated
	 */
	SubSetConstraint createSubSetConstraint();

	/**
	 * Returns a new object of class '<em>Equality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality Constraint</em>'.
	 * @generated
	 */
	EqualityConstraint createEqualityConstraint();

	/**
	 * Returns a new object of class '<em>Exclusion Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusion Constraint</em>'.
	 * @generated
	 */
	ExclusionConstraint createExclusionConstraint();

	/**
	 * Returns a new object of class '<em>Sub Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Type</em>'.
	 * @generated
	 */
	SubType createSubType();

	/**
	 * Returns a new object of class '<em>Frequency Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frequency Constraint</em>'.
	 * @generated
	 */
	FrequencyConstraint createFrequencyConstraint();

	/**
	 * Returns a new object of class '<em>Ring Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ring Constraint</em>'.
	 * @generated
	 */
	RingConstraint createRingConstraint();

	/**
	 * Returns a new object of class '<em>Acyclic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acyclic</em>'.
	 * @generated
	 */
	Acyclic createAcyclic();

	/**
	 * Returns a new object of class '<em>Irreflexive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irreflexive</em>'.
	 * @generated
	 */
	Irreflexive createIrreflexive();

	/**
	 * Returns a new object of class '<em>Intransitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intransitive</em>'.
	 * @generated
	 */
	Intransitive createIntransitive();

	/**
	 * Returns a new object of class '<em>Asymmetric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asymmetric</em>'.
	 * @generated
	 */
	Asymmetric createAsymmetric();

	/**
	 * Returns a new object of class '<em>Anti Symmetric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anti Symmetric</em>'.
	 * @generated
	 */
	AntiSymmetric createAntiSymmetric();

	/**
	 * Returns a new object of class '<em>Symmetric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symmetric</em>'.
	 * @generated
	 */
	Symmetric createSymmetric();

	/**
	 * Returns a new object of class '<em>Object Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Role</em>'.
	 * @generated
	 */
	ObjectRole createObjectRole();

	/**
	 * Returns a new object of class '<em>Schema Diagram Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Diagram Member</em>'.
	 * @generated
	 */
	SchemaDiagramMember createSchemaDiagramMember();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Package getPackage();

} //Factory
