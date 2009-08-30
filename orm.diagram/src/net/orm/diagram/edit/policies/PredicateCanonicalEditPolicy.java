package net.orm.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.orm.Package;
import net.orm.diagram.edit.parts.RoleEditPart;
import net.orm.diagram.part.OrmDiagramUpdater;
import net.orm.diagram.part.OrmNodeDescriptor;
import net.orm.diagram.part.OrmVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PredicateCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = OrmDiagramUpdater.getPredicate_2001SemanticChildren(
				viewObject).iterator(); it.hasNext();) {
			result.add(((OrmNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = OrmVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case RoleEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(Package.eINSTANCE.getPredicate_Roles());
		}
		return myFeaturesToSynchronize;
	}

}
