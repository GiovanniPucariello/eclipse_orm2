package net.orm.diagram.edit.parts;

import net.orm.diagram.edit.policies.EntityRole2ItemSemanticEditPolicy;
import net.orm.diagram.figures.EntityRoleFigure;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EntityRole2EditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public EntityRole2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EntityRole2ItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new EntityRoleFigure();
	}

	/**
	 * @generated
	 */
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
