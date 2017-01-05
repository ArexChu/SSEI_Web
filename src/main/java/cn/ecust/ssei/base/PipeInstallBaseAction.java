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

import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.BeanUtils;

import com.opensymphony.xwork2.ActionContext;

public class PipeInstallBaseAction<T> extends BaseAction<T> {
	protected long installId;
	protected Class<T> clazz;
	 @SuppressWarnings("unchecked")
	public PipeInstallBaseAction(){
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
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		String fieldName=BeanUtils.getName(clazz);
		BeanUtils.invokeSet(pipeInstall, fieldName, clazz.newInstance());
		pipeInstallService.update(pipeInstall);
		return "toPipeInstallMenuList";
	}
	
	/**
	 * 删除的预备
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public long preDelete() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		String fieldName=BeanUtils.getName(clazz);
		T instance = (T)BeanUtils.invokeGet(pipeInstall, fieldName);
		Long id=(Long)BeanUtils.invokeGet(instance, "id");
		BeanUtils.invokeSet(pipeInstall, fieldName, null);
		return id;
	}
	
	@SuppressWarnings("unchecked")
	public String editUI() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		String fieldName=BeanUtils.getName(clazz);
		T instance = (T)BeanUtils.invokeGet(pipeInstall, fieldName);
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
	
	public String download()throws Exception {
		String path = makeSurePath();
		return out(path);
	}
	
	public String deleteFile() throws Exception{
		String path = makeSurePath();
		File file = new File(path);
		file.delete();
		return "toPipeInstallDocumentMenuList";
	}
	
	public String makeSurePath() {
		return null;
	}

	/**
	 * @return the installId
	 */
	public long getInstallId() {
		return installId;
	}

	/**
	 * @param installId the installId to set
	 */
	public void setInstallId(long installId) {
		this.installId = installId;
	}

	


}
