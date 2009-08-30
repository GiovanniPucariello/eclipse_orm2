package net.orm.diagram.part;

import java.util.ArrayList;
import java.util.List;

import net.orm.diagram.providers.OrmElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class OrmPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createEntityValueCreation2Group());
		paletteRoot.add(createPredicates3Group());
		paletteRoot.add(createConstraints4Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(new PaletteSeparator());
		return paletteContainer;
	}

	/**
	 * Creates "Entity Value Creation" palette tool group
	 * @generated
	 */
	private PaletteContainer createEntityValueCreation2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.EntityValueCreation2Group_title);
		paletteContainer.setId("createEntityValueCreation2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(Messages.EntityValueCreation2Group_desc);
		paletteContainer.add(createEntity1CreationTool());
		paletteContainer.add(createValue2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Predicates" palette tool group
	 * @generated
	 */
	private PaletteContainer createPredicates3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Predicates3Group_title);
		paletteContainer.setId("createPredicates3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Predicates3Group_desc);
		paletteContainer.add(createUnary1CreationTool());
		paletteContainer.add(createBinary2CreationTool());
		paletteContainer.add(createTertiary3CreationTool());
		paletteContainer.add(createPredicate4CreationTool());
		paletteContainer.add(createRole5CreationTool());
		paletteContainer.add(createEntityRole6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Constraints" palette tool group
	 * @generated
	 */
	private PaletteContainer createConstraints4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Constraints4Group_title);
		paletteContainer.setId("createConstraints4Group"); //$NON-NLS-1$
		paletteContainer.add(createUniquenessConstraint1CreationTool());
		paletteContainer.add(createSubType2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OrmElementTypes.Entity_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entity1CreationTool_title,
				Messages.Entity1CreationTool_desc, types);
		entry.setId("createEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrmElementTypes
				.getImageDescriptor(OrmElementTypes.Entity_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValue2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Value2CreationTool_title,
				Messages.Value2CreationTool_desc, null, null) {
		};
		entry.setId("createValue2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnary1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Unary1CreationTool_title,
				Messages.Unary1CreationTool_desc, null, null) {
		};
		entry.setId("createUnary1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBinary2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Binary2CreationTool_title,
				Messages.Binary2CreationTool_desc, null, null) {
		};
		entry.setId("createBinary2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTertiary3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Tertiary3CreationTool_title,
				Messages.Tertiary3CreationTool_desc, null, null) {
		};
		entry.setId("createTertiary3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPredicate4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OrmElementTypes.Predicate_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Predicate4CreationTool_title,
				Messages.Predicate4CreationTool_desc, types);
		entry.setId("createPredicate4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrmElementTypes
				.getImageDescriptor(OrmElementTypes.Predicate_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OrmElementTypes.Role_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Role5CreationTool_title,
				Messages.Role5CreationTool_desc, types);
		entry.setId("createRole5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrmElementTypes
				.getImageDescriptor(OrmElementTypes.Role_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntityRole6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(OrmElementTypes.EntityRole_4001);
		types.add(OrmElementTypes.EntityRole_4004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EntityRole6CreationTool_title,
				Messages.EntityRole6CreationTool_desc, types);
		entry.setId("createEntityRole6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrmElementTypes
				.getImageDescriptor(OrmElementTypes.EntityRole_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUniquenessConstraint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OrmElementTypes.UniquenessConstraint_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.UniquenessConstraint1CreationTool_title,
				Messages.UniquenessConstraint1CreationTool_desc, types);
		entry.setId("createUniquenessConstraint1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrmElementTypes
				.getImageDescriptor(OrmElementTypes.UniquenessConstraint_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubType2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(OrmElementTypes.SubType_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SubType2CreationTool_title,
				Messages.SubType2CreationTool_desc, types);
		entry.setId("createSubType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OrmElementTypes
				.getImageDescriptor(OrmElementTypes.SubType_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
