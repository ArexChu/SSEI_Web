package cn.ecust.ssei.util;

import java.util.Calendar;

import jxl.Cell;

public class ExcelUtils {
	public static String getTheFormatDate(Cell cell) {
		String content = cell.getContents().trim();
		if (content.matches("[0-9]{5}")) {//42375说明是从1900 年 1 月 1 日的序列号是 1
			//excel 2013 中 1900 年是366天 ，是错的，所以要减一
			Calendar cal = Calendar.getInstance();  
	        cal.set(1900, 0, 0);  
	        cal.add(Calendar.DAY_OF_MONTH, Integer.valueOf(content)-1);
	        return cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+1+"-"+cal.get(Calendar.DAY_OF_MONTH);
			
		}
		return content;
	}
}
