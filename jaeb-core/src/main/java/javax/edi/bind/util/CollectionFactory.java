package javax.edi.bind.util;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CollectionFactory {
	
	private static final Logger LOG = LoggerFactory.getLogger(CollectionFactory.class);
	
	private CollectionFactory() {
		// seal
	}
	
	public static <T> T newInstance(Class collection) throws InstantiationException, IllegalAccessException {
		if(collection.isInterface()) {
			if(collection.equals(Set.class)) {
				return (T)new HashSet();
			}
			else if(collection.equals(SortedSet.class)) {
				return (T)new TreeSet();
			}
			else if(collection.equals(List.class)) {
				return (T)new LinkedList();
			}
			else if(collection.equals(Map.class)) {
				return (T)new HashMap();
			}
			else if(collection.equals(SortedMap.class)) {
				return (T)new TreeMap();
			}
			
		}
		else if(Modifier.isAbstract(collection.getModifiers())) {
			if(Set.class.isAssignableFrom(collection)) {
				return (T)new TreeSet();
			}
			else if(List.class.isAssignableFrom(collection)) {
				return (T)new LinkedList();
			}
		}
		else {
			return (T)collection.newInstance();
		}
		
		return (T)new LinkedList();
	}
}
