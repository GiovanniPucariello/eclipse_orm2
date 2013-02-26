package net.orm.diagram.edit.policies;

import net.orm.diagram.part.OrmVisualIDRegistry;
import net.orm.diagram.providers.OrmElementTypes;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EntityRoleItemSemanticEditPolicy extends
		OrmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityRoleItemSemanticEditPolicy() {
		super(OrmElementTypes.EntityRole_4001);
	}

	@Override
	public Command getCommand(Request request) {
		return super.getCommand(request);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
