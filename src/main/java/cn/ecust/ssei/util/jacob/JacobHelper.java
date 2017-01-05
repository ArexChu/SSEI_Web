package cn.ecust.ssei.util.jacob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;


@SuppressWarnings("unchecked")
public class JacobHelper {

	//定义一个 word 对象
	public ActiveXComponent objWord = null;
	
	//初始化documents的属性
	public Dispatch documents = null;
	
	
	// 选定的范围或插入点
	public Dispatch selection = null;
	
	
	//模板文件
	public Dispatch doc = null;

	
	/**
	 * 退出时 是否保存
	 * 为 true--退出时保存文件  false--退出时不保存文件
	 */
	private boolean saveOnExit;
	
	
	public boolean isSaveOnExit() {
		return saveOnExit;
	}


	public void setSaveOnExit(boolean saveOnExit) {
		this.saveOnExit = saveOnExit;
	}


	/**
	 * 构造函数   new这个对象的时候调用,要想使用这个帮助类 就必须得调用这个类的该构造函数。
	 */
	public JacobHelper() {
		
		if(objWord == null){
			
			objWord = new ActiveXComponent("Word.Application");
			objWord.setProperty("Visible", new Variant(false));
		}
		
		
		if(documents == null){
			
			documents = objWord.getProperty("Documents").toDispatch();
			
		}
		
		saveOnExit = false;
	}
	
	
	/**
	 * 根据模板、数据生成word文件
	 * @param inputPath 模板文件(包含路径)
	 * @param outPath 输出文件(包含路径)
	 * @param data  数据包(包含要填充的字段、对应的数据)
	 */
	public void toWord(String inputPath, String outPath, @SuppressWarnings("rawtypes") HashMap data){
		
		//存储的值对象
		String oldText;
		
		Object newValue;
		
		try {
			if(doc == null){
				
				doc = open(inputPath);
			}
			
			selection = select();
			
			@SuppressWarnings("rawtypes")
			Iterator keys = data.keySet().iterator();
			
			while(keys.hasNext()){
				
				oldText = (String)keys.next();
				
				newValue = data.get(oldText);
				
				
				replaceAll(selection,oldText,newValue);
			}
			save(outPath);
			System.out.println("操作成功");
		} catch (RuntimeException e) {

			System.out.println("操作word文件失败!");
			e.printStackTrace();
		}finally{
			
			if(doc != null){
				close(doc);
			}
		}
	}


	/**
	 * 关闭文件
	 * @param doc 要关闭的文件
	 */
	private void close(Dispatch doc) {

		Dispatch.call(doc, "Close",new Variant(saveOnExit));
		
		objWord.invoke("Quit", new Variant[]{});
		
		objWord = null;
	}


	/**
	 * 保存文件
	 * @param outPath 保存文件的路径
	 */
	private void save(String outPath) {

		Dispatch.call(Dispatch.call(objWord, "WordBasic").getDispatch(), "FileSaveAs",outPath);
	}


	/**
	 * 全局替换模板文件
	 * @param selection 选定内容或起始插入点
	 * @param oldText  要替换的文本
	 * @param newValue  替换为文本
	 */
	private void replaceAll(Dispatch selection, String oldText,
			Object newValue) {
		
		
		//移动到文件的开头
		moveStart(selection);
		
		if(oldText.startsWith("table") || newValue instanceof ArrayList){
			
			replaceTable(selection,oldText,(HashMap<String, String>)newValue);
		}else{
			
			String  newText = (String)newValue;
			
			if(newText == null){
				
				newText = "";
			}
			if(oldText.indexOf("image") != -1 & !newText.trim().equals("") 
					|| newText.lastIndexOf(".bmp") != -1 || newText.lastIndexOf(".jpg") != -1
					|| newText.lastIndexOf(".gif") != -1){
				
				while(find(selection,oldText)){
					
					replaceImage(selection,newText);
					Dispatch.call(selection, "MoveRight");
				}
			}else{
				
				while(find(selection,oldText)){
					
					replace(selection,newText);
					Dispatch.call(selection, "MoveRight");
				}
			}
		}
		
	}


	/**
	 * 普通文本的替换
	 * @param selection插入点
	 * @param newText 替换为文本
	 */
	private void replace(Dispatch selection, String newText) {

		//设置替换文本
		Dispatch.put(selection, "Text", newText);
		
	}


	/**
	 * 替换图片
	 * @param selection插入点
	 * @param imagePath图片文件(全路径)
	 */
	private void replaceImage(Dispatch selection, String imagePath) {

		Dispatch.call(Dispatch.get(selection, "InLineShapes").toDispatch(), "AddPicture", imagePath);
	}


	/**
	 * 从选定内容或插入点开始查找文本
	 * @param selection  选定的内容
	 * @param oldText  要查找的文本
	 * @return
	 */
	@SuppressWarnings("static-access")
	private boolean find(Dispatch selection, String oldText) {

		//从selection所在的位置开始查询
		Dispatch find = objWord.call(selection, "Find").toDispatch();
		
		//设置要查找的内容
		Dispatch.put(find, "Text", oldText);
		
		//向前查找
		Dispatch.put(find, "Forward", "True");
		
		
		//设置格式  (该两项不能使用)
//		Dispatch.put(find, "Format", "Ture");
		
		//大小写匹配
//		Dispatch.put(find, "MatchCase", "Ture");
		
		
		//全字匹配
		Dispatch.put(find, "MatchWholeWord", "True");
		
		//查找并选中
		
		return Dispatch.call(find, "Execute").getBoolean();
	}


	/**
	 * 表格替换
	 * @param selection 插入点
	 * @param tableName  表格名称 table$R@N R从表格中的第R行开始填充，N代表word中的第N张表  
	 * 在这里 保证@后面的数值是1就可以了。
	 * @param dataList  表格中要替换字段与对应数据的值
	 */
	@SuppressWarnings("static-access")
	private void replaceTable(Dispatch selection, String tableName,
			HashMap<String, String> dataList) {

		//如果 没有传任何值到表格中来  则返回 不处理
		if(dataList.size()<=1){
			
			System.out.println("表格为空");
			return;
		}
		
		
		//表格序号(也就是填充这个word文档当中的第几张表   我们这里一般用第1张表   这个数字是由外部提供的 就是传进来的map的 表示表格的keys)
		String tbIndex = tableName.substring(tableName.lastIndexOf("@") + 1);
		
		//从第几行开始填充 （这里是表示从模板表中的第几行开始填充，本次不需要这个功能  默认从第一行开始填充）
//		int fromRow = Integer.parseInt(tableName.substring(tableName.lastIndexOf("$") + 1,tableName.lastIndexOf("@")));
		
		//所有表格对象
		Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
		
		//要填充的表格
		Dispatch table = Dispatch.call(tables, "Item",new Variant(tbIndex)).toDispatch();
		
		//得到模板表格的所有行
		Dispatch rows = Dispatch.get(table, "Rows").toDispatch();
		
		int rowsCount = Dispatch.get(rows, "Count").getInt();
		
		
		//得到模板表格最大的列数
//		Dispatch columns = Dispatch.get(table,"Columns").toDispatch();
//		int columnsCount = Dispatch.get(columns, "Count").getInt();
		
		
		//填充表格
		for(int i = 1; i<= rowsCount; i++){
			
			//获取每一行的 行对象
			Dispatch row = Dispatch.call(table, "Rows",i).toDispatch();
			
			//获取当前行 的 单元格数量 （这个非常有用）
			Dispatch cells = Dispatch.get(row, "Cells").toDispatch();
			
			//每行的单元格数量
			int cellCountByRows = Dispatch.get(cells, "Count").getInt();
			
			//填充该行的相关列
			for (int j = 1; j <= cellCountByRows; j++) {
				
				//得到单元格
				Dispatch cell = Dispatch.call(table, "Cell",new Variant(i), new Variant(j)).toDispatch();
				
				//选中单元格
				Dispatch.call(cell, "Select");
				
				//得到字体的对象  (该次不需要修改字体的样式 默认使用模板表中的样式就可以了)
//				Dispatch font = Dispatch.get(selection, "Font").toDispatch();
//				
//				//设置字体的格式
//				setFont(font, false, false, false, null, "10", "Adobe 黑体 Std R");
				
				//得到模板表中，该单元格的值
				String value = cell.call(selection, "Text").getString();
				
				//判断该单元格的值   如果该值是这种格式  则 需要替换值的内容:$#name#$
				if(value != null && !value.equals("") && value.indexOf("#") != -1){
					value=value.substring(0, value.length()-2);//将后面的换行符去掉
					Pattern p = Pattern.compile("#[^#]*#");
					Matcher m = p.matcher(value);
					StringBuffer sb = new StringBuffer();

					while(m.find()){

						//循环得到单元格里面的内容中 所有的#name#的字符串
						String arrStr = m.group();
						
						//外部传值到模板表中时是map的形式，其中以$#name#$中的name为键
						String tableKey = arrStr.substring(arrStr.indexOf("#") + 1,arrStr.lastIndexOf("#"));
						
						String kString=dataList.get(tableKey);
						if(kString!=null)
						{
						m.appendReplacement(sb, kString);//如果有的话就添加
						}
						else {
							m.appendReplacement(sb, "");//如果没有的话按照原来的替换
						}
					}
					m.appendTail(sb);
					
					Dispatch.put(selection, "Text", sb.toString());
					
					
				}
				
				
				
			}
			
			
		}
		
	}


	/**
	 * 把插入点移动到文件的首位置
	 * @param selection  插入点
	 */
	private void moveStart(Dispatch selection) {

		Dispatch.call(selection, "HomeKey", new Variant(6));
	}


	/**
	 * 选定内容
	 * @return Dispatch对象  选定的范围或插入点
	 */
	private Dispatch select() {

		return objWord.getProperty("Selection").toDispatch();
	}


	/**
	 * 打开模板文件
	 * @param inputPath 文件路径
	 * @return Dispatch
	 */
	private Dispatch open(String inputPath) {

		Dispatch dispatch = null;
		try {
			dispatch = Dispatch.call(documents, "Open", inputPath).toDispatch();
		} catch (RuntimeException e) {
			
			System.out.println("读取文件失败!");
			e.printStackTrace();
		}
		return dispatch;
		
	}
	
	
	/*
	 * 合并单元格 
	 *     
	 * @param tableIndex 
	 * @param fstCellRowIdx 
	 * @param fstCellColIdx 
	 * @param secCellRowIdx 
	 * @param secCellColIdx 
	 */
	 public void mergeCell(int tableIndex, int fstCellRowIdx, int fstCellColIdx, int secCellRowIdx, int secCellColIdx) { 
	    // 所有表格 
	    Dispatch tables = Dispatch.get(doc, "Tables").toDispatch(); 
	    // 要填充的表格 
	    Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex)) 
	                    .toDispatch(); 
	    Dispatch fstCell = Dispatch.call(table, "Cell", 
	                    new Variant(fstCellRowIdx), new Variant(fstCellColIdx)) 
	                    .toDispatch(); 
	    Dispatch secCell = Dispatch.call(table, "Cell", 
	                    new Variant(secCellRowIdx), new Variant(secCellColIdx)) 
	                    .toDispatch(); 
	    Dispatch.call(fstCell, "Merge", secCell); 
	}
	
	 
	 /**
      * 在指定的单元格里填写数据 
      *     
      * @param tableIndex 
      * @param cellRowIdx 
      * @param cellColIdx 
      * @param txt 
      */ 
	 public void putTxtToCell(int tableIndex, int cellRowIdx, int cellColIdx,  
	            String txt) {  
	        // 所有表格  
	        Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();  
	        // 要填充的表格  
	        Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex))  
	                .toDispatch();  
	        Dispatch cell = Dispatch.call(table, "Cell", new Variant(cellRowIdx),  
	                new Variant(cellColIdx)).toDispatch();  
	        Dispatch.call(cell, "Select");  
	        Dispatch selection = Dispatch.get(objWord, "Selection").toDispatch(); // 输入内容需要的对象  
	        Dispatch.put(selection, "Text", txt);  
	    }  
	 
	 
	 /**
	  * 在指定行前面增加行
	  *
	  * @param tableIndex
	  *            word文件中的第N张表(从1开始)
	  * @param rowIndex
	  *            指定行的序号(从1开始)
	  */
	 public void addTableRow(int tableIndex, int rowIndex) {
	  // 所有表格
	  Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
	  // 要填充的表格
	  Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex))
	    .toDispatch();
	  // 表格的所有行
	  Dispatch rows = Dispatch.get(table, "Rows").toDispatch();
	  Dispatch row = Dispatch.call(rows, "Item", new Variant(rowIndex))
	    .toDispatch();
	  Dispatch.call(rows, "Add", new Variant(row));
	 }
	 
 
	 /**
	  * 在第1行前增加一行
	  *
	  * @param tableIndex
	  *  word文档中的第N张表(从1开始)
	  */
	 public void addFirstTableRow(int tableIndex) {
	  // 所有表格
	  Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
	  // 要填充的表格
	  Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex))
	    .toDispatch();
	  // 表格的所有行
	  Dispatch rows = Dispatch.get(table, "Rows").toDispatch();
	  Dispatch row = Dispatch.get(rows, "First").toDispatch();
	  Dispatch.call(rows, "Add", new Variant(row));
	 }
	 /**
	  * 在最后1行前增加一行
	  *
	  * @param tableIndex
	  *            word文档中的第N张表(从1开始)
	  */
	 public void addLastTableRow(int tableIndex) {
	  // 所有表格
	  Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
	  // 要填充的表格
	  Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex))
	    .toDispatch();
	  // 表格的所有行
	  Dispatch rows = Dispatch.get(table, "Rows").toDispatch();
	  Dispatch row = Dispatch.get(rows, "Last").toDispatch();
	  Dispatch.call(rows, "Add", new Variant(row));
	 }
	 /**
	  * 增加一行
	  *
	  * @param tableIndex
	  *            word文档中的第N张表(从1开始)
	  */
	 public void addRow(int tableIndex) {
	  Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
	  // 要填充的表格
	  Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex))
	    .toDispatch();
	  // 表格的所有行
	  Dispatch rows = Dispatch.get(table, "Rows").toDispatch();
	  Dispatch.call(rows, "Add");
	 }
	 /**
	  * 增加一列
	  *
	  * @param tableIndex
	  *            word文档中的第N张表(从1开始)
	  */
	 public void addCol(int tableIndex) {
	  // 所有表格
	  Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
	  // 要填充的表格
	  Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex))
	    .toDispatch();
	  // 表格的所有行
	  Dispatch cols = Dispatch.get(table, "Columns").toDispatch();
	  Dispatch.call(cols, "Add").toDispatch();
	  Dispatch.call(cols, "AutoFit");
	 }
	 /**
	  * 在指定列前面增加表格的列
	  *
	  * @param tableIndex
	  *            word文档中的第N张表(从1开始)
	  * @param colIndex
	  *            制定列的序号 (从1开始)
	  */
	 public void addTableCol(int tableIndex, int colIndex) {
	  // 所有表格
	  Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
	  // 要填充的表格
	  Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex))
	    .toDispatch();
	  // 表格的所有行
	  Dispatch cols = Dispatch.get(table, "Columns").toDispatch();
	  Dispatch col = Dispatch.call(cols, "Item", new Variant(colIndex))
	    .toDispatch();
	  // Dispatch col = Dispatch.get(cols, "First").toDispatch();
	  Dispatch.call(cols, "Add", col).toDispatch();
	  Dispatch.call(cols, "AutoFit");
	 }
	 /**
	  * 在第1列前增加一列
	  *
	  * @param tableIndex
	  *            word文档中的第N张表(从1开始)
	  */
	 public void addFirstTableCol(int tableIndex) {
	  Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
	  // 要填充的表格
	  Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex))
	    .toDispatch();
	  // 表格的所有行
	  Dispatch cols = Dispatch.get(table, "Columns").toDispatch();
	  Dispatch col = Dispatch.get(cols, "First").toDispatch();
	  Dispatch.call(cols, "Add", col).toDispatch();
	  Dispatch.call(cols, "AutoFit");
	 }
	 /**
	  * 在最后一列前增加一列
	  *
	  * @param tableIndex
	  *            word文档中的第N张表(从1开始)
	  */
	 public void addLastTableCol(int tableIndex) {
	  Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
	  // 要填充的表格
	  Dispatch table = Dispatch.call(tables, "Item", new Variant(tableIndex))
	    .toDispatch();
	  // 表格的所有行
	  Dispatch cols = Dispatch.get(table, "Columns").toDispatch();
	  Dispatch col = Dispatch.get(cols, "Last").toDispatch();
	  Dispatch.call(cols, "Add", col).toDispatch();
	  Dispatch.call(cols, "AutoFit");
	 }
	
	 /**
	  * 设置当前选定内容的字体
	  * @param font  字体对象
	  * @param bold  是否有边框 
	  * @param italic  是否是斜体
	  * @param underLineSize 下划线
	  * @param colorSize  字体颜色
	  * @param size  字体大小
	  * @param name  字体名称
	  */
	 public void setFont(Dispatch font,boolean bold, boolean italic, boolean underLine,
	   String colorSize, String size, String name) {
		 
		  Dispatch.put(font, "Name", new Variant(name));
		  Dispatch.put(font, "Bold", new Variant(bold));
		  Dispatch.put(font, "Italic", new Variant(italic));
		  Dispatch.put(font, "Underline", new Variant(underLine));
		  Dispatch.put(font, "Color", colorSize);
		  Dispatch.put(font, "Size", size);
	 }
	 
	 /**
	  * 
	  * @param inPath 模板地址
	  * @param outPath 输出地址
	  * @param num 记录数目
	  */
	 public void addRowAndValueInThi(String inPath, String outPath, int num){
		 if(doc == null){
			doc = open(inPath);
		 }
		 try {
			 setSaveOnExit(true);
			 // 所有表格
			 Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
			 // 要填充的表格
			 Dispatch table = Dispatch.call(tables, "Item", new Variant(1)).toDispatch();
			 Dispatch rows = Dispatch.call(table, "Rows").toDispatch();
			 @SuppressWarnings("deprecation")
			int rowsCount = Dispatch.get(rows,"Count").toInt();
			 if (num>152) {
					/**
					 * 增加相应的行数
					 */
					int toaddnum = (int) Math.ceil((num-152)/8);
					int count=153;
					for (int i = 0; i < toaddnum; i++) {
						addTableRow(1, rowsCount-3+i);
						for(int j=0;j<8;j++ ){
							if (count%2==1) {
								int show = count/2+1;
								putTxtToCell(1,rowsCount-3+i,j+1,"#"+show+"#");
								
							}else {
								int show = count/2;
								putTxtToCell(1,rowsCount-3+i,j+1,"#p_Thi_"+show+"#");
							}
							count++;
							
						}
					}				
			 	}
			 	save(outPath);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(doc != null){
				close(doc);
				doc=null;
			}
		}
	 }
	 
	 
	 public void addRowAndValueInOnlineThi(String inPath, String outPath, int num){
		 if(doc == null){
			doc = open(inPath);
		 }
		 try {
			 setSaveOnExit(true);
			 // 所有表格
			 Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
			 // 要填充的表格
			 Dispatch table = Dispatch.call(tables, "Item", new Variant(1)).toDispatch();
			 Dispatch rows = Dispatch.call(table, "Rows").toDispatch();
			 @SuppressWarnings("deprecation")
			int rowsCount = Dispatch.get(rows,"Count").toInt();
			 if (num>100) {
					/**
					 * 增加相应的行数
					 */
					int toaddnum = (int) Math.ceil((float)(num-100)/20);
					int count=101;
					for (int i = 0; i < toaddnum; i++) {
						addTableRow(1, rowsCount-2+i*2);
						putTxtToCell(1,rowsCount-2+i*2,1,"厚度（mm）");
						addTableRow(1, rowsCount-2+i*2);
						putTxtToCell(1,rowsCount-2+i*2,1,"测点编号");
						int rowNum = num-100-20*i;
						if (rowNum>20) {
							rowNum=20;
						}
						for(int j=0;j<rowNum;j++ ){
							int temp = j/2+1;
							if (count%2==1) {				
								putTxtToCell(1,rowsCount-2+i*2,temp+1,"#temp"+count+"#");
							}else {
								putTxtToCell(1,rowsCount-1+i*2,temp+1,"#temp"+count+"#");
							}
							count++;
							
						}
					}				
			 	}
			 	mergeCell(1, 12, 1, 13, 1);
			 	mergeCell(1, 12, 2, 13, 2);
			 	save(outPath);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(doc != null){
				close(doc);
				doc=null;
			}
		}
	 }
	 
	 
	 
	 public void addRowAndValueInHard(String inPath, String outPath, int num){
		 if(doc == null){
			doc = open(inPath);
		 }
		 setSaveOnExit(true);
		 // 所有表格
		 Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
		 // 要填充的表格
		 Dispatch table = Dispatch.call(tables, "Item", new Variant(1)).toDispatch();
		 Dispatch rows = Dispatch.call(table, "Rows").toDispatch();
		 @SuppressWarnings("deprecation")
		int rowsCount = Dispatch.get(rows,"Count").toInt();
		 if (num>45) {
				/**
				 * 增加相应的行数
				 */
				int toaddnum = (int) Math.ceil((num-45)/3);
				int count=46;
				for (int i = 0; i < toaddnum; i++) {
					addTableRow(1, rowsCount-3+i);
					for(int j=0;j<3;j++ ){
						putTxtToCell(1,rowsCount-3+i,j+1,"#"+count+"#");
						count++;
					}
				}				
		 	}
		 	save(outPath);
	 		if(doc != null){
				close(doc);
				doc=null;
			}
	 }
	 
	 
	 public void addRowAndValueInVessel(String inPath, String outPath, int num, int maxNum, int lastNum){
		 if(doc == null){
			doc = open(inPath);
		 }
		 setSaveOnExit(true);
		 // 所有表格
		 Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
		 // 要填充的表格
		 Dispatch table = Dispatch.call(tables, "Item", new Variant(1)).toDispatch();
		 Dispatch rows = Dispatch.call(table, "Rows").toDispatch();
		 Dispatch columns = Dispatch.call(table, "Columns").toDispatch();
		 @SuppressWarnings("deprecation")
		int rowsCount = Dispatch.get(rows,"Count").toInt();
		 @SuppressWarnings("deprecation")
		int columnCount = Dispatch.get(columns,"Count").toInt();
		 if (num>maxNum) {
				/**
				 * 增加相应的行数
				 */
			 int toaddnum = (int) Math.ceil((float)(num-maxNum)/columnCount);
				int count=maxNum+1;
				for (int i = 0; i < toaddnum; i++) {
					int rowNum = num-maxNum-columnCount*i;
					if (rowNum>columnCount) {
						rowNum=columnCount;
					}
					addTableRow(1, rowsCount-lastNum+i);
					for(int j=0;j<rowNum;j++ ){
						putTxtToCell(1,rowsCount-lastNum+i,j+1,"#"+count+"#");
						count++;
					}
				}			
		 	}
		 	save(outPath);
	 		if(doc != null){
				close(doc);
				doc=null;
			}
	 }
	 
	 
	
}



