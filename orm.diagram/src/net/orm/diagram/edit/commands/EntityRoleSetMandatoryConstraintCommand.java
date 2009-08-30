package net.orm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

public class EntityRoleSetMandatoryConstraintCommand extends EditElementCommand {

	protected EntityRoleSetMandatoryConstraintCommand(String label,
			EObject elementToEdit, IEditCommandRequest request) {
		super(label, elementToEdit, request);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}

}
