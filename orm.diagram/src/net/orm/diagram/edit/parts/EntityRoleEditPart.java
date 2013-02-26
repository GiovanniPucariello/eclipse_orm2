package net.orm.diagram.edit.parts;

import net.orm.EntityRole;
import net.orm.diagram.edit.policies.EntityRoleItemSemanticEditPolicy;
import net.orm.diagram.figures.CircleDecoration;
import net.orm.diagram.figures.EntityRoleFigure;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EntityRoleEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public EntityRoleEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EntityRoleItemSemanticEditPolicy());
	}

	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		Notification n = notification;
		if (n.getFeature() instanceof EAttribute) {
			EAttribute a = (EAttribute) n.getFeature();
			switch (a.getFeatureID()) {
			case net.orm.Package.ENTITY_ROLE__MANDATORY:
				refreshVisuals();
				break;
			default:
				break;
			}
		}

	}

	protected void refreshVisuals() {
		EntityRoleFigure figure = getPrimaryShape();
		EntityRole model = (EntityRole) ((Edge) getModel()).getElement();
		if (model.isMandatory())
			figure.setSourceDecoration(new CircleDecoration());
		else
			figure.setSourceDecoration(null);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * 
	 */

	protected Connection createConnectionFigure() {
		return new EntityRoleFigure();
	}

	public EntityRoleFigure getPrimaryShape() {
		return (EntityRoleFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class EntityRoleFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public EntityRoleFigure() {

		}

	}

}
