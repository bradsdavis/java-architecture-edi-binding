package javax.edi.bind.hierarchy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

import javax.edi.bind.annotations.EDIHierarchicalIdentifier;
import javax.edi.bind.annotations.EDIHierarchicalParentReference;
import javax.edi.bind.util.FieldAwareConverter;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.convert.ConversionException;

public class HierarchyUtil {
	
	private static final Set<Class> hierarchyReferenceCache = new HashSet<Class>();

	public static boolean segmentGroupHasHierarchyReference(Class clz) {
		if(clz.getDeclaredFields().length > 0) {
			Field field = clz.getDeclaredFields()[0];
			return isHierarchyReference(field.getType());
		}
		
		return false;
	}
	
	
	public static boolean isHierarchyReference(Class clz) {
		if(hierarchyReferenceCache.contains(clz)) {
			return true;
		}
		
		boolean id = false; 
		boolean parentId = false;
		
		for(Field field : clz.getDeclaredFields()) {
			if(field.isAnnotationPresent(EDIHierarchicalIdentifier.class)) {
				id = true;
			}
			else if(field.isAnnotationPresent(EDIHierarchicalParentReference.class)) {
				parentId = true;
			}
		}
		
		if(id && parentId) {
			hierarchyReferenceCache.add(clz);
		}

		return id && parentId;
	}
	
	public static HierarchyReference generateHierarchyReference(Object obj) throws ConversionException {
		String id = null; 
		String parentId = null;
		
		try {
		for(Field field : obj.getClass().getDeclaredFields()) {
			if(field.isAnnotationPresent(EDIHierarchicalIdentifier.class)) {
				id = FieldAwareConverter.convertToString(field, BeanUtils.getProperty(obj, field.getName()));
			}
			else if(field.isAnnotationPresent(EDIHierarchicalParentReference.class)) {
				parentId = FieldAwareConverter.convertToString(field, BeanUtils.getProperty(obj, field.getName()));
			}
		}
		}
		catch(Exception e) {
			throw new ConversionException("Exception converting to HierarchyReference.", e);
		}
		
		if(id == null) {
			throw new RuntimeException("Object: "+obj.getClass().getCanonicalName()+" is not an hierarchy object.");
		}
		return new HierarchyReference(id, parentId);
	}
	
	
}
