package net.orm.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.orm.Entity;
import net.orm.EntityRole;
import net.orm.Package;
import net.orm.Predicate;
import net.orm.Role;
import net.orm.Schema;
import net.orm.SchemaShape;
import net.orm.SubType;
import net.orm.UniquenessConstraint;
import net.orm.diagram.edit.parts.EntityEditPart;
import net.orm.diagram.edit.parts.EntityRole2EditPart;
import net.orm.diagram.edit.parts.EntityRoleEditPart;
import net.orm.diagram.edit.parts.PredicateEditPart;
import net.orm.diagram.edit.parts.RoleEditPart;
import net.orm.diagram.edit.parts.SchemaEditPart;
import net.orm.diagram.edit.parts.SubTypeEditPart;
import net.orm.diagram.edit.parts.UniquenessConstraintEditPart;
import net.orm.diagram.providers.OrmElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OrmDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (OrmVisualIDRegistry.getVisualID(view)) {
		case PredicateEditPart.VISUAL_ID:
			return getPredicate_2001SemanticChildren(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPredicate_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Predicate modelElement = (Predicate) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getRoles().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = OrmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new OrmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSchema_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Schema modelElement = (Schema) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSchemaShapes().iterator(); it
				.hasNext();) {
			SchemaShape childElement = (SchemaShape) it.next();
			int visualID = OrmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PredicateEditPart.VISUAL_ID) {
				result.add(new OrmNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new OrmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (OrmVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000ContainedLinks(view);
		case PredicateEditPart.VISUAL_ID:
			return getPredicate_2001ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2002ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3001ContainedLinks(view);
		case EntityRoleEditPart.VISUAL_ID:
			return getEntityRole_4001ContainedLinks(view);
		case EntityRole2EditPart.VISUAL_ID:
			return getEntityRole_4004ContainedLinks(view);
		case UniquenessConstraintEditPart.VISUAL_ID:
			return getUniquenessConstraint_4002ContainedLinks(view);
		case SubTypeEditPart.VISUAL_ID:
			return getSubType_4003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (OrmVisualIDRegistry.getVisualID(view)) {
		case PredicateEditPart.VISUAL_ID:
			return getPredicate_2001IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2002IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3001IncomingLinks(view);
		case EntityRoleEditPart.VISUAL_ID:
			return getEntityRole_4001IncomingLinks(view);
		case EntityRole2EditPart.VISUAL_ID:
			return getEntityRole_4004IncomingLinks(view);
		case UniquenessConstraintEditPart.VISUAL_ID:
			return getUniquenessConstraint_4002IncomingLinks(view);
		case SubTypeEditPart.VISUAL_ID:
			return getSubType_4003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (OrmVisualIDRegistry.getVisualID(view)) {
		case PredicateEditPart.VISUAL_ID:
			return getPredicate_2001OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2002OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3001OutgoingLinks(view);
		case EntityRoleEditPart.VISUAL_ID:
			return getEntityRole_4001OutgoingLinks(view);
		case EntityRole2EditPart.VISUAL_ID:
			return getEntityRole_4004OutgoingLinks(view);
		case UniquenessConstraintEditPart.VISUAL_ID:
			return getUniquenessConstraint_4002OutgoingLinks(view);
		case SubTypeEditPart.VISUAL_ID:
			return getSubType_4003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSchema_1000ContainedLinks(View view) {
		Schema modelElement = (Schema) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_EntityRole_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_EntityRole_4004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_SubType_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPredicate_2001ContainedLinks(View view) {
		Predicate modelElement = (Predicate) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_UniquenessConstraint_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntity_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntityRole_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntityRole_4004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUniquenessConstraint_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubType_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPredicate_2001IncomingLinks(View view) {
		Predicate modelElement = (Predicate) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_EntityRole_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubType_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntity_2002IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_EntityRole_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubType_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_3001IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_EntityRole_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UniquenessConstraint_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntityRole_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntityRole_4004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUniquenessConstraint_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubType_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPredicate_2001OutgoingLinks(View view) {
		Predicate modelElement = (Predicate) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_EntityRole_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SubType_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntity_2002OutgoingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_EntityRole_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SubType_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_3001OutgoingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_EntityRole_4004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UniquenessConstraint_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntityRole_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntityRole_4004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUniquenessConstraint_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubType_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_EntityRole_4001(
			Schema container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getEntityRoles().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EntityRole) {
				continue;
			}
			EntityRole link = (EntityRole) linkObject;
			if (EntityRoleEditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getRole();
			Entity src = link.getEntity();
			result.add(new OrmLinkDescriptor(src, dst, link,
					OrmElementTypes.EntityRole_4001,
					EntityRoleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_EntityRole_4004(
			Schema container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getEntityRoles().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EntityRole) {
				continue;
			}
			EntityRole link = (EntityRole) linkObject;
			if (EntityRole2EditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getEntity();
			Role src = link.getRole();
			result.add(new OrmLinkDescriptor(src, dst, link,
					OrmElementTypes.EntityRole_4004,
					EntityRole2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_UniquenessConstraint_4002(
			Predicate container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UniquenessConstraint) {
				continue;
			}
			UniquenessConstraint link = (UniquenessConstraint) linkObject;
			if (UniquenessConstraintEditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getRoles();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Role) {
				continue;
			}
			Role dst = (Role) theTarget;
			List sources = link.getRoles();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Role) {
				continue;
			}
			Role src = (Role) theSource;
			result.add(new OrmLinkDescriptor(src, dst, link,
					OrmElementTypes.UniquenessConstraint_4002,
					UniquenessConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_SubType_4003(
			Schema container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getSubTypes().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SubType) {
				continue;
			}
			SubType link = (SubType) linkObject;
			if (SubTypeEditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getParent();
			Entity src = link.getChild();
			result.add(new OrmLinkDescriptor(src, dst, link,
					OrmElementTypes.SubType_4003, SubTypeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_EntityRole_4001(
			Role target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != Package.eINSTANCE
					.getEntityRole_Role()
					|| false == setting.getEObject() instanceof EntityRole) {
				continue;
			}
			EntityRole link = (EntityRole) setting.getEObject();
			if (EntityRoleEditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity src = link.getEntity();
			result.add(new OrmLinkDescriptor(src, target, link,
					OrmElementTypes.EntityRole_4001,
					EntityRoleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_EntityRole_4004(
			Entity target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != Package.eINSTANCE
					.getEntityRole_Entity()
					|| false == setting.getEObject() instanceof EntityRole) {
				continue;
			}
			EntityRole link = (EntityRole) setting.getEObject();
			if (EntityRole2EditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role src = link.getRole();
			result.add(new OrmLinkDescriptor(src, target, link,
					OrmElementTypes.EntityRole_4004,
					EntityRole2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_UniquenessConstraint_4002(
			Role target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != Package.eINSTANCE
					.getConstraint_Roles()
					|| false == setting.getEObject() instanceof UniquenessConstraint) {
				continue;
			}
			UniquenessConstraint link = (UniquenessConstraint) setting
					.getEObject();
			if (UniquenessConstraintEditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getRoles();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Role) {
				continue;
			}
			Role src = (Role) theSource;
			result.add(new OrmLinkDescriptor(src, target, link,
					OrmElementTypes.UniquenessConstraint_4002,
					UniquenessConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_SubType_4003(
			Entity target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != Package.eINSTANCE
					.getSubType_Parent()
					|| false == setting.getEObject() instanceof SubType) {
				continue;
			}
			SubType link = (SubType) setting.getEObject();
			if (SubTypeEditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity src = link.getChild();
			result.add(new OrmLinkDescriptor(src, target, link,
					OrmElementTypes.SubType_4003, SubTypeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_EntityRole_4001(
			Entity source) {
		Schema container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Schema) {
				container = (Schema) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getEntityRoles().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EntityRole) {
				continue;
			}
			EntityRole link = (EntityRole) linkObject;
			if (EntityRoleEditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getRole();
			Entity src = link.getEntity();
			if (src != source) {
				continue;
			}
			result.add(new OrmLinkDescriptor(src, dst, link,
					OrmElementTypes.EntityRole_4001,
					EntityRoleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_EntityRole_4004(
			Role source) {
		Schema container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Schema) {
				container = (Schema) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getEntityRoles().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EntityRole) {
				continue;
			}
			EntityRole link = (EntityRole) linkObject;
			if (EntityRole2EditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getEntity();
			Role src = link.getRole();
			if (src != source) {
				continue;
			}
			result.add(new OrmLinkDescriptor(src, dst, link,
					OrmElementTypes.EntityRole_4004,
					EntityRole2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_UniquenessConstraint_4002(
			Role source) {
		Predicate container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Predicate) {
				container = (Predicate) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UniquenessConstraint) {
				continue;
			}
			UniquenessConstraint link = (UniquenessConstraint) linkObject;
			if (UniquenessConstraintEditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getRoles();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Role) {
				continue;
			}
			Role dst = (Role) theTarget;
			List sources = link.getRoles();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Role) {
				continue;
			}
			Role src = (Role) theSource;
			if (src != source) {
				continue;
			}
			result.add(new OrmLinkDescriptor(src, dst, link,
					OrmElementTypes.UniquenessConstraint_4002,
					UniquenessConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_SubType_4003(
			Entity source) {
		Schema container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Schema) {
				container = (Schema) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getSubTypes().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SubType) {
				continue;
			}
			SubType link = (SubType) linkObject;
			if (SubTypeEditPart.VISUAL_ID != OrmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getParent();
			Entity src = link.getChild();
			if (src != source) {
				continue;
			}
			result.add(new OrmLinkDescriptor(src, dst, link,
					OrmElementTypes.SubType_4003, SubTypeEditPart.VISUAL_ID));
		}
		return result;
	}

}
