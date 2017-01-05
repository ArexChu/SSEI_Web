package cn.ecust.ssei.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.apache.commons.beanutils.PropertyUtilsBean;
public class BeanUtils {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Method getGetMethod(Class objectClass, String fieldName) {     
	    StringBuffer sb = new StringBuffer();     
	    sb.append("get");     
	    sb.append(fieldName.substring(0, 1).toUpperCase());     
	    sb.append(fieldName.substring(1));     
	    try {     
	        return objectClass.getMethod(sb.toString());     
	    } catch (Exception e) {     
	    }     
	    return null;     
	}     
	     
	     
	@SuppressWarnings({ "unchecked", "rawtypes" })     
	public static Method getSetMethod(Class objectClass, String fieldName) {     
	    try {     
	        Class[] parameterTypes = new Class[1];     
	        Field field = objectClass.getDeclaredField(fieldName);     
	        parameterTypes[0] = field.getType();     
	        StringBuffer sb = new StringBuffer();     
	        sb.append("set");     
	        sb.append(fieldName.substring(0, 1).toUpperCase());     
	        sb.append(fieldName.substring(1));     
	        Method method = objectClass.getMethod(sb.toString(), parameterTypes);     
	        return method;     
	    } catch (Exception e) {     
	        e.printStackTrace();     
	    }     
	    return null;     
	}     
	     
	     
	public static void invokeSet(Object o, String fieldName, Object value) {     
	    Method method = getSetMethod(o.getClass(), fieldName);     
	    try {     
	        method.invoke(o, new Object[] { value });     
	    } catch (Exception e) {     
	        e.printStackTrace();     
	    }     
	}     
	     
	     
	public static Object invokeGet(Object o, String fieldName) {     
	    Method method = getGetMethod(o.getClass(), fieldName);     
	    try {     
	        return method.invoke(o, new Object[0]);     
	    } catch (Exception e) {     
	        e.printStackTrace();     
	    }     
	    return null;     
	}
	
	/**
	 * 根据类拿到其默认对象的名字
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static String getName(Class clazz){
		String className = clazz.getName().substring(clazz.getName().lastIndexOf('.')+1);
		String name = toObjectName(className);
		return name;	
	}
	
	private static String toObjectName(String className) {
		char[] array = className.toCharArray();
		int i =0;
		array[i++]+=32;
		while (Character.isUpperCase(array[i])) {
			if (Character.isUpperCase(array[i+1])) {
				array[i]+=32;
			}
			i++;
		}
		return String.valueOf(array);
	}
	
	   @SuppressWarnings({ "rawtypes", "unchecked" })
	public static HashMap beanToMap(Object obj) { 
		   HashMap params = new HashMap(0); 
        try { 
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean(); 
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj); 
            for (int i = 0; i < descriptors.length; i++) { 
                String name = descriptors[i].getName(); 
                String finalName="#"+name+"#";
                if (!"class".equals(name)) { 
                	try {
                		String value =(String)propertyUtilsBean.getNestedProperty(obj, name);
                		params.put(finalName,value ); 
					} catch (Exception e) {
						//如果取出的值的类型不能装换为String，那么就是long或者是外键，不处理就可以了
					}
                } 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return params; 
}
	
	
	
	
	
	
}
