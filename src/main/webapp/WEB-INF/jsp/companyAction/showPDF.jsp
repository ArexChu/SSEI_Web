<%@ page language="java" import="java.util.*,java.io.*,java.lang.System.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
 	<%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
</head>
<%
	out.clear();
 	out = pageContext.pushBody();
	response.setContentType("application/pdf");
	String filePath = (String)request.getAttribute("filePath");
	 try {
	//判断该路径下的文件是否存在
 		File file = new File(filePath);
 		if (file.exists()) {
 			DataOutputStream temps = new DataOutputStream(response
			.getOutputStream());
 			DataInputStream in = new DataInputStream(
 			new FileInputStream(filePath));

 			byte[] b = new byte[2048];
 			while ((in.read(b)) != -1) {
			temps.write(b);
			temps.flush();
			}

			in.close();
			temps.close();
 		} else {
 			throw new RuntimeException("no file");
	}
 	} catch (Exception e) {
		out.println(e.getMessage());
}
%>
<body>
</body>
</html>