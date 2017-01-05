package cn.ecust.ssei.util;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;


public class MyFileUtils {

	private static Properties prop;
	static {
		prop = new Properties();
		try {
			prop.load(MyFileUtils.class.getClassLoader().getResourceAsStream("document_address.properties"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 获得公司规章制度存放的路径
	 * @return
	 */
	public static String getCompanyPath() {
		return prop.getProperty("companyRules");
		
	}
	
	/**
	 * 获得公司规章制度存放的路径
	 * @return
	 */
	public static String getSqlPath() {
		return prop.getProperty("sqlBackupPath");
		
	}
	
	/**
	 * 获得管道零时文件存储地方
	 * @return
	 */
	public static String getPipeTempPath() {
		return prop.getProperty("pipeTemp");
		
	}
	
	/**
	 * 获得容器零时文件存储地方
	 * @return
	 */
	public static String getVesselTempPath() {
		return prop.getProperty("vesselTemp");
		
	}
	
	/**
	 * 按照文件名称,id号和文件的分类上传文件
	 * @return
	 */
	public static void uploadFile(Long id, String fileName, File file, int fileType) {
		String path = getFilePath(id, fileName, fileType);
		//拼接文件名称
		String finalFileName = id+"_"+fileName;
		File savefile = new File(path, finalFileName);
		try {
			FileUtils.copyFile(file, savefile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 按照文件名称,id号和文件的分类获得文件路径
	 * @return
	 */
	public static String getFilePath(Long id, String fileName, int fileType) {
		String fileRootPath = null;
		switch (fileType) {
		case 1://表示管道
			fileRootPath = prop.getProperty("pipeBasicAttachmentRootPath");
			break;
		case 2://表示容器
			fileRootPath = prop.getProperty("vesselAttachmentRootPath");
			break;
		case 3://表示管道生成word文档路径
			fileRootPath = prop.getProperty("pipeMaintainDocRootPath");
			break;
		case 4://表示容器生成word文档路径
			fileRootPath = prop.getProperty("vesselDocRootPath");
			break;			
		default:
			break;
		}
		String code = id+fileName;
		String filepath = toFileMenu(fileRootPath, code);
		return filepath;	
	}
	
	public static String getFilePathWithName(long id, String string,
			Integer pipeDocumentUpload, String name) {
		String fileRootpath = MyFileUtils.getFilePath(id, string, pipeDocumentUpload);
		String fileName = id+"_"+name;
		return fileRootpath+"/"+fileName;//最终文档生成的位置
	}
	
	
	/**
	 * 哈希打散，解决一个文件夹下多个文件的问题
	 * @param fileRootPath
	 * @param code
	 * @return
	 */
	private static String toFileMenu(String fileRootPath, String code) {
		int hCode = code.hashCode();
		String hex = Integer.toHexString(hCode);//转换为16进制
		/*
		 * 2. 获取hex的前两个字母，与root连接在一起，生成一个完整的路径,没有路径则生成
		 */
		File dirFile = new File(fileRootPath, hex.charAt(0) + "/" + hex.charAt(1));
		if(!dirFile.exists()){
			dirFile.mkdirs();
		}
		String filepath=dirFile+"";//
		return filepath;
	}
	
	/**
	 * 获得word文档模板文件路径
	 * @param id
	 * @param fileName
	 * @param fileType
	 * @return
	 */
	public static String getTempletePath(int fileType) {
		String fileRootPath = null;
		switch (fileType) {
		case 1://表示管道
			fileRootPath = prop.getProperty("pipeTempletePath");
			break;
		case 2://表示容器
			fileRootPath = prop.getProperty("vesselTempletePath");
			break;
		default:
			break;
		}
		return fileRootPath;	
	}
	
	/**
	 * 获得word文档模板文件路径下的某个文件
	 * @param i
	 * @param string
	 * @return
	 */
	public static String getTempletePathWithName(int i, String name) {
		String templeteRootPath = getTempletePath(i);//获得文件模板跟位置
		return templeteRootPath+name;//获得真正模板word文件位置
	}	
	
	
	/**
	 * 校验文件的后缀名
	 * @param pdfName
	 * @param type
	 * @return
	 */
	public static boolean validateContentType(String pdfName,
			String type) {
		return pdfName.substring(pdfName.lastIndexOf(".")+1).equals(type);
		
	}
	
	/**
	 * 校验上传文件的名字是否在规定名称的数组内
	 * @param pdfFileContentType
	 * @param type
	 * @return
	 */
	public static boolean validateFileName(String string, String[] pdfName) {
		for (int i = 0; i < pdfName.length; i++) {
			if (string.equals(pdfName[i])) {				
				return true;
			}
		}
		return false;
	}



	

}
