/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.orm.util;

import java.util.List;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.orm.Package
 * @generated
 */
public class Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static net.orm.Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch() {
		if (modelPackage == null) {
			modelPackage = net.orm.Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case net.orm.Package.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseSchemaShape(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseSchemaShape(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = caseSchemaShape(predicate);
				if (result == null) result = caseEntity(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.SCHEMA_SHAPE: {
				SchemaShape schemaShape = (SchemaShape)theEObject;
				T result = caseSchemaShape(schemaShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.MANDATORY_CONSTRAINT: {
				MandatoryConstraint mandatoryConstraint = (MandatoryConstraint)theEObject;
				T result = caseMandatoryConstraint(mandatoryConstraint);
				if (result == null) result = caseExternalizableConstraint(mandatoryConstraint);
				if (result == null) result = caseConstraint(mandatoryConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.UNIQUENESS_CONSTRAINT: {
				UniquenessConstraint uniquenessConstraint = (UniquenessConstraint)theEObject;
				T result = caseUniquenessConstraint(uniquenessConstraint);
				if (result == null) result = caseExternalizableConstraint(uniquenessConstraint);
				if (result == null) result = caseConstraint(uniquenessConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.REFERENCE_SCHEME: {
				ReferenceScheme referenceScheme = (ReferenceScheme)theEObject;
				T result = caseReferenceScheme(referenceScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.VALUE_CONSTRAINT: {
				ValueConstraint valueConstraint = (ValueConstraint)theEObject;
				T result = caseValueConstraint(valueConstraint);
				if (result == null) result = caseConstraint(valueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.EXTERNALIZABLE_CONSTRAINT: {
				ExternalizableConstraint externalizableConstraint = (ExternalizableConstraint)theEObject;
				T result = caseExternalizableConstraint(externalizableConstraint);
				if (result == null) result = caseConstraint(externalizableConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.SET_COMPARISON_CONSTRAINT: {
				SetComparisonConstraint setComparisonConstraint = (SetComparisonConstraint)theEObject;
				T result = caseSetComparisonConstraint(setComparisonConstraint);
				if (result == null) result = caseConstraint(setComparisonConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.CONSTRAINING_VALUES: {
				ConstrainingValues constrainingValues = (ConstrainingValues)theEObject;
				T result = caseConstrainingValues(constrainingValues);
				if (result == null) result = caseValueConstraint(constrainingValues);
				if (result == null) result = caseConstraint(constrainingValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.CONSTRAINING_RANGE: {
				ConstrainingRange constrainingRange = (ConstrainingRange)theEObject;
				T result = caseConstrainingRange(constrainingRange);
				if (result == null) result = caseValueConstraint(constrainingRange);
				if (result == null) result = caseConstraint(constrainingRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.SUB_SET_CONSTRAINT: {
				SubSetConstraint subSetConstraint = (SubSetConstraint)theEObject;
				T result = caseSubSetConstraint(subSetConstraint);
				if (result == null) result = caseSetComparisonConstraint(subSetConstraint);
				if (result == null) result = caseConstraint(subSetConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.EQUALITY_CONSTRAINT: {
				EqualityConstraint equalityConstraint = (EqualityConstraint)theEObject;
				T result = caseEqualityConstraint(equalityConstraint);
				if (result == null) result = caseSetComparisonConstraint(equalityConstraint);
				if (result == null) result = caseConstraint(equalityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.EXCLUSION_CONSTRAINT: {
				ExclusionConstraint exclusionConstraint = (ExclusionConstraint)theEObject;
				T result = caseExclusionConstraint(exclusionConstraint);
				if (result == null) result = caseSetComparisonConstraint(exclusionConstraint);
				if (result == null) result = caseConstraint(exclusionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.SUB_TYPE: {
				SubType subType = (SubType)theEObject;
				T result = caseSubType(subType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.FREQUENCY_CONSTRAINT: {
				FrequencyConstraint frequencyConstraint = (FrequencyConstraint)theEObject;
				T result = caseFrequencyConstraint(frequencyConstraint);
				if (result == null) result = caseConstraint(frequencyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.RING_CONSTRAINT: {
				RingConstraint ringConstraint = (RingConstraint)theEObject;
				T result = caseRingConstraint(ringConstraint);
				if (result == null) result = caseConstraint(ringConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.ACYCLIC: {
				Acyclic acyclic = (Acyclic)theEObject;
				T result = caseAcyclic(acyclic);
				if (result == null) result = caseRingConstraint(acyclic);
				if (result == null) result = caseConstraint(acyclic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.IRREFLEXIVE: {
				Irreflexive irreflexive = (Irreflexive)theEObject;
				T result = caseIrreflexive(irreflexive);
				if (result == null) result = caseRingConstraint(irreflexive);
				if (result == null) result = caseConstraint(irreflexive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.INTRANSITIVE: {
				Intransitive intransitive = (Intransitive)theEObject;
				T result = caseIntransitive(intransitive);
				if (result == null) result = caseRingConstraint(intransitive);
				if (result == null) result = caseConstraint(intransitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.ASYMMETRIC: {
				Asymmetric asymmetric = (Asymmetric)theEObject;
				T result = caseAsymmetric(asymmetric);
				if (result == null) result = caseRingConstraint(asymmetric);
				if (result == null) result = caseConstraint(asymmetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.ANTI_SYMMETRIC: {
				AntiSymmetric antiSymmetric = (AntiSymmetric)theEObject;
				T result = caseAntiSymmetric(antiSymmetric);
				if (result == null) result = caseRingConstraint(antiSymmetric);
				if (result == null) result = caseConstraint(antiSymmetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.SYMMETRIC: {
				Symmetric symmetric = (Symmetric)theEObject;
				T result = caseSymmetric(symmetric);
				if (result == null) result = caseRingConstraint(symmetric);
				if (result == null) result = caseConstraint(symmetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case net.orm.Package.ENTITY_ROLE: {
				EntityRole entityRole = (EntityRole)theEObject;
				T result = caseEntityRole(entityRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaShape(SchemaShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryConstraint(MandatoryConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniqueness Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniqueness Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniquenessConstraint(UniquenessConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceScheme(ReferenceScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueConstraint(ValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Externalizable Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Externalizable Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalizableConstraint(ExternalizableConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Comparison Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Comparison Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetComparisonConstraint(SetComparisonConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraining Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraining Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainingValues(ConstrainingValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraining Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraining Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainingRange(ConstrainingRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Set Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Set Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSetConstraint(SubSetConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityConstraint(EqualityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusionConstraint(ExclusionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubType(SubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConstraint(FrequencyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ring Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ring Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRingConstraint(RingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acyclic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acyclic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcyclic(Acyclic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irreflexive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irreflexive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrreflexive(Irreflexive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intransitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intransitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntransitive(Intransitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asymmetric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asymmetric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsymmetric(Asymmetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anti Symmetric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anti Symmetric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntiSymmetric(AntiSymmetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetric(Symmetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRole(EntityRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Switch
