package net.orm.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.orm.Package;
import net.orm.diagram.edit.parts.EntityEditPart;
import net.orm.diagram.edit.parts.EntityRole2EditPart;
import net.orm.diagram.edit.parts.EntityRoleEditPart;
import net.orm.diagram.edit.parts.PredicateEditPart;
import net.orm.diagram.edit.parts.RoleEditPart;
import net.orm.diagram.edit.parts.SchemaEditPart;
import net.orm.diagram.edit.parts.SubTypeEditPart;
import net.orm.diagram.edit.parts.UniquenessConstraintEditPart;
import net.orm.diagram.part.OrmDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class OrmElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private OrmElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Schema_1000 = getElementType("orm.diagram.Schema_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Predicate_2001 = getElementType("orm.diagram.Predicate_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2002 = getElementType("orm.diagram.Entity_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_3001 = getElementType("orm.diagram.Role_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityRole_4001 = getElementType("orm.diagram.EntityRole_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityRole_4004 = getElementType("orm.diagram.EntityRole_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UniquenessConstraint_4002 = getElementType("orm.diagram.UniquenessConstraint_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SubType_4003 = getElementType("orm.diagram.SubType_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return OrmDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Schema_1000, Package.eINSTANCE.getSchema());

			elements.put(Predicate_2001, Package.eINSTANCE.getPredicate());

			elements.put(Entity_2002, Package.eINSTANCE.getEntity());

			elements.put(Role_3001, Package.eINSTANCE.getRole());

			elements.put(EntityRole_4001, Package.eINSTANCE.getEntityRole());

			elements.put(EntityRole_4004, Package.eINSTANCE.getEntityRole());

			elements.put(UniquenessConstraint_4002, Package.eINSTANCE
					.getUniquenessConstraint());

			elements.put(SubType_4003, Package.eINSTANCE.getSubType());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Schema_1000);
			KNOWN_ELEMENT_TYPES.add(Predicate_2001);
			KNOWN_ELEMENT_TYPES.add(Entity_2002);
			KNOWN_ELEMENT_TYPES.add(Role_3001);
			KNOWN_ELEMENT_TYPES.add(EntityRole_4001);
			KNOWN_ELEMENT_TYPES.add(EntityRole_4004);
			KNOWN_ELEMENT_TYPES.add(UniquenessConstraint_4002);
			KNOWN_ELEMENT_TYPES.add(SubType_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SchemaEditPart.VISUAL_ID:
			return Schema_1000;
		case PredicateEditPart.VISUAL_ID:
			return Predicate_2001;
		case EntityEditPart.VISUAL_ID:
			return Entity_2002;
		case RoleEditPart.VISUAL_ID:
			return Role_3001;
		case EntityRoleEditPart.VISUAL_ID:
			return EntityRole_4001;
		case EntityRole2EditPart.VISUAL_ID:
			return EntityRole_4004;
		case UniquenessConstraintEditPart.VISUAL_ID:
			return UniquenessConstraint_4002;
		case SubTypeEditPart.VISUAL_ID:
			return SubType_4003;
		}
		return null;
	}

}
