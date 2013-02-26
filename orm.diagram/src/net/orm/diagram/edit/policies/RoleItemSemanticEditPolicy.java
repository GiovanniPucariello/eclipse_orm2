package net.orm.diagram.edit.policies;

import java.util.Iterator;

import net.orm.diagram.edit.commands.EntityRole2CreateCommand;
import net.orm.diagram.edit.commands.EntityRole2ReorientCommand;
import net.orm.diagram.edit.commands.EntityRoleCreateCommand;
import net.orm.diagram.edit.commands.EntityRoleReorientCommand;
import net.orm.diagram.edit.commands.UniquenessConstraintCreateCommand;
import net.orm.diagram.edit.commands.UniquenessConstraintReorientCommand;
import net.orm.diagram.edit.parts.EntityRole2EditPart;
import net.orm.diagram.edit.parts.EntityRoleEditPart;
import net.orm.diagram.edit.parts.UniquenessConstraintEditPart;
import net.orm.diagram.part.OrmVisualIDRegistry;
import net.orm.diagram.providers.OrmElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RoleItemSemanticEditPolicy extends OrmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoleItemSemanticEditPolicy() {
		super(OrmElementTypes.Role_3001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (OrmVisualIDRegistry.getVisualID(incomingLink) == EntityRoleEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (OrmVisualIDRegistry.getVisualID(incomingLink) == UniquenessConstraintEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (OrmVisualIDRegistry.getVisualID(outgoingLink) == EntityRole2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (OrmVisualIDRegistry.getVisualID(outgoingLink) == UniquenessConstraintEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OrmElementTypes.EntityRole_4001 == req.getElementType()) {
			return null;
		}
		if (OrmElementTypes.EntityRole_4004 == req.getElementType()) {
			return getGEFWrapper(new EntityRole2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (OrmElementTypes.UniquenessConstraint_4002 == req.getElementType()) {
			return getGEFWrapper(new UniquenessConstraintCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OrmElementTypes.EntityRole_4001 == req.getElementType()) {
			return getGEFWrapper(new EntityRoleCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (OrmElementTypes.EntityRole_4004 == req.getElementType()) {
			return null;
		}
		if (OrmElementTypes.UniquenessConstraint_4002 == req.getElementType()) {
			return getGEFWrapper(new UniquenessConstraintCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EntityRoleEditPart.VISUAL_ID:
			return getGEFWrapper(new EntityRoleReorientCommand(req));
		case EntityRole2EditPart.VISUAL_ID:
			return getGEFWrapper(new EntityRole2ReorientCommand(req));
		case UniquenessConstraintEditPart.VISUAL_ID:
			return getGEFWrapper(new UniquenessConstraintReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
