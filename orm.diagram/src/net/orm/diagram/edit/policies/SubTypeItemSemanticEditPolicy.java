package net.orm.diagram.edit.policies;

import net.orm.diagram.providers.OrmElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class SubTypeItemSemanticEditPolicy extends
		OrmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SubTypeItemSemanticEditPolicy() {
		super(OrmElementTypes.SubType_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
