package net.orm.diagram.part;

import net.orm.Package;
import net.orm.Schema;
import net.orm.diagram.edit.parts.EntityEditPart;
import net.orm.diagram.edit.parts.EntityNameEditPart;
import net.orm.diagram.edit.parts.EntityRole2EditPart;
import net.orm.diagram.edit.parts.EntityRoleEditPart;
import net.orm.diagram.edit.parts.PredicateEditPart;
import net.orm.diagram.edit.parts.RoleEditPart;
import net.orm.diagram.edit.parts.SchemaEditPart;
import net.orm.diagram.edit.parts.SubTypeEditPart;
import net.orm.diagram.edit.parts.UniquenessConstraintEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class OrmVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "orm.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SchemaEditPart.MODEL_ID.equals(view.getType())) {
				return SchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.orm.diagram.part.OrmVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				OrmDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Package.eINSTANCE.getSchema().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Schema) domainElement)) {
			return SchemaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = net.orm.diagram.part.OrmVisualIDRegistry
				.getModelID(containerView);
		if (!SchemaEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SchemaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.orm.diagram.part.OrmVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PredicateEditPart.VISUAL_ID:
			if (Package.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			break;
		case SchemaEditPart.VISUAL_ID:
			if (Package.eINSTANCE.getPredicate().isSuperTypeOf(
					domainElement.eClass())) {
				return PredicateEditPart.VISUAL_ID;
			}
			if (Package.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.orm.diagram.part.OrmVisualIDRegistry
				.getModelID(containerView);
		if (!SchemaEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SchemaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.orm.diagram.part.OrmVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SchemaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PredicateEditPart.VISUAL_ID:
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SchemaEditPart.VISUAL_ID:
			if (PredicateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Package.eINSTANCE.getEntityRole().isSuperTypeOf(
				domainElement.eClass())) {
			return EntityRoleEditPart.VISUAL_ID;
		}
		if (Package.eINSTANCE.getEntityRole().isSuperTypeOf(
				domainElement.eClass())) {
			return EntityRole2EditPart.VISUAL_ID;
		}
		if (Package.eINSTANCE.getUniquenessConstraint().isSuperTypeOf(
				domainElement.eClass())) {
			return UniquenessConstraintEditPart.VISUAL_ID;
		}
		if (Package.eINSTANCE.getSubType()
				.isSuperTypeOf(domainElement.eClass())) {
			return SubTypeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Schema element) {
		return true;
	}

}
