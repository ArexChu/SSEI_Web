package cn.ecust.ssei.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于类型转换
 * @author smxiang
 *
 */
public class TypeHelper {
	
	/**
	 * 将List<String>转换为字符串
	 * @param array
	 * @param mark
	 * @return
	 */
	public static String listToString (List<String> array, String mark ) {
		String str="";
		if (array!=null&&array.size()!=0) {
			for (int i = 0; i < array.size(); i++) {
				str=str+array.get(i)+mark;
			}
			str=str.substring(0, str.length()-1);
		}
		return str;
	}
	/**
	 * 将字符串转换为List<String>
	 * @param str
	 * @param mark
	 * @return
	 */
	public static List<String> stringToList (String str, String mark ) {
		List<String> list = new ArrayList<String>();
		if (str!=null&&str.length()!=0) {
			String[] arr = str.split(mark);
			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}
		}	
		return list;
	}

}
