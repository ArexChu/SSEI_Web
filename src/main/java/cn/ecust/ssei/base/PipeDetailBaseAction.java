package cn.ecust.ssei.base;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.ParameterizedType;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeDetailMaintain;
import cn.ecust.ssei.util.BeanUtils;

import com.opensymphony.xwork2.ActionContext;

public class PipeDetailBaseAction<T> extends BaseAction<T> {
	
	protected long detailid;
	protected long pipeMaintainId;
	protected Class<T> clazz;
	@SuppressWarnings("unchecked")
	public PipeDetailBaseAction(){
		// 使用反射技术得到T的真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); // 获取当前new的对象的 泛型的父类 类型
			this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; // 获取第一个类型参数的真实类型
	 }
	/**
	 * 新增
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception{
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		String fieldName=BeanUtils.getName(clazz);
		BeanUtils.invokeSet(pipeDetailMaintain, fieldName, clazz.newInstance());
		pipeDetailMaintainService.update(pipeDetailMaintain);
		return "toPipeDetailMaintainList";
	}
	
	/**
	 * 删除预处理
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public long preDelete() throws Exception{
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		String fieldName=BeanUtils.getName(clazz);
		T instance = (T)BeanUtils.invokeGet(pipeDetailMaintain, fieldName);
		Long id=(Long)BeanUtils.invokeGet(instance, "id");
		BeanUtils.invokeSet(pipeDetailMaintain, fieldName, null);
		return id;
	}
	
	@SuppressWarnings("unchecked")
	public String editUI() throws Exception{
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		String fieldName=BeanUtils.getName(clazz);
		T instance = (T)BeanUtils.invokeGet(pipeDetailMaintain, fieldName);
		ActionContext.getContext().getValueStack().push(instance);
		return "saveUI";
	}
	
	public String out(String path) {
		HttpServletResponse response = ServletActionContext.getResponse();
		    try {
		      // path是指欲下载的文件的路径。
		      File file = new File(path);
		      // 取得文件名。
		      String filename = file.getName();
		      // 以流的形式下载文件
		      InputStream fis = new BufferedInputStream(new FileInputStream(path));
		      byte[] buffer = new byte[fis.available()];
		      fis.read(buffer);
		      fis.close();
		      //清空response
		      response.reset();
		      //设置response的Header
		      String filenameString = new String(filename.getBytes("gbk"),"iso-8859-1");
		      response.addHeader("Content-Disposition", "attachment;filename=" + filenameString);
		      response.addHeader("Content-Length", "" + file.length());
		      OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
		      response.setContentType("application/octet-stream");
		      toClient.write(buffer);
		      toClient.flush();
		      toClient.close();
		    } catch (IOException ex) {
		      return null;
		    }
		    return null;
	}
	
	
	
	/**
	 * @return the detailid
	 */
	public long getDetailid() {
		return detailid;
	}
	/**
	 * @param detailid the detailid to set
	 */
	public void setDetailid(long detailid) {
		this.detailid = detailid;
	}
	/**
	 * @return the pipeMaintainId
	 */
	public long getPipeMaintainId() {
		return pipeMaintainId;
	}
	/**
	 * @param pipeMaintainId the pipeMaintainId to set
	 */
	public void setPipeMaintainId(long pipeMaintainId) {
		this.pipeMaintainId = pipeMaintainId;
	}

}
