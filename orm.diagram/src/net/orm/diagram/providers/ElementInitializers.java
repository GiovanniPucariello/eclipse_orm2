package net.orm.diagram.providers;

import net.orm.diagram.part.OrmDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = OrmDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			OrmDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}

}
