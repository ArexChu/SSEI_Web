package cn.ecust.ssei.util.jacob;
import java.io.File;
import java.util.List;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
public class JacobWord {
    private ActiveXComponent app;
    private Dispatch document;
    private Dispatch selection;
 
    // 初始化并新建Word文档
    public JacobWord() {
       ComThread.InitSTA();// 初始化Com线程
       app = new ActiveXComponent("Word.Application");// 初始化word应用程序
       app.setProperty("Visible", new Variant(false));// 设置word文档不在前台打开
       app.setProperty("AutomationSecurity", new Variant(3)); // 禁用宏
       Dispatch docs = app.getProperty("Documents").toDispatch();// 获取文挡属性
       document = Dispatch.call(docs, "Add").toDispatch(); // 创建新文档
       selection = app.getProperty("Selection").toDispatch();// 获得选定内容
    }

    // 合并Word文档

	public void mergeWord(List<File> file , String path) {
       try {
          
           for (int i = 0; i < file.size(); i++) {
              String tempFile = file.get(i).getAbsolutePath();
              if (tempFile.endsWith(".doc") || tempFile.endsWith(".docx")) {
                  Dispatch.call(selection, "MoveDown");
                  Dispatch.call(selection, "insertFile", tempFile);// 插入文件内容
                  if (i!=file.size()-1) {
                	  Dispatch.call(selection,  "InsertBreak" ,  new Variant(7) );//插入分页符
				} 
              }
           }
           Dispatch.call(document, "SaveAs", new Variant(path)); //保存到指定位置
           Dispatch.call(document, "Close", new Variant(false));// 关闭文档
       } catch (Exception ex) {
           ex.printStackTrace();
       } finally {
           app.invoke("Quit", new Variant(0));// 退出word应用
           ComThread.Release();// 释放Com线程
       }
    }

}