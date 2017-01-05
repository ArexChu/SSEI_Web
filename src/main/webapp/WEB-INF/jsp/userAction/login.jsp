<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>承压特种设备管理系统</title>
    <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
    <link rel="stylesheet" type="text/css" href="style/userAction/login.css" />
    <script type="text/javascript" src="script/userAction/login.js"></script>
	<script type="text/javascript">
	$(function() {/*Map<String(Cookie名称),Cookie(Cookie本身)>*/
		// 获取cookie中的用户名
		var loginName = window.decodeURI("${cookie.loginNmae.value}");
		if("${user.loginName}") {
			loginName = "${user.loginName}";
		}
		$("#s_Log_Name").val(loginName);
	});
	</script>
	<script type="text/javascript">
		$(function(){
			document.forms[0].loginName.focus();
		});
		
		// 在被嵌套时就刷新上级窗口
		if(window.parent != window){
			window.parent.location.reload(true);
		}
	</script>
	
  </head>
  <body>
  	<div class="myframe-left"></div>
    <div class="main">
    	<s:form action="user_login" autocomplete="off" id="userlogin">
    		<table>
    			<tr>
    				<td>
    					<span class="errorClass" id="msg" >
                		</span>
                		<s:textfield id="s_Log_Name" name="loginName"  cssClass="inputClass"></s:textfield>
    					<span class="errorClass" id="s_Log_Name_Error">
                		</span>
    				</td>
    			</tr>
    			<tr>
    				<td>
    					<s:password id="s_Log_Pas" name="password"  cssClass="inputClass"></s:password>
                   		 <span class="errorClass" id="s_Log_Pas_Error">
                   		 	<s:fielderror>
    							<s:param>login</s:param>
    						</s:fielderror>
                		</span>
    				</td>
    			</tr>
    			<tr>
    				<td>
    					<s:textfield type="text" name="verifyCode" id="s_VerifyCode" cssClass="inputClass"/>
    					<img src="/SSEI/VerifyCodeServlet" id="imgVerifyCode"/>
    					<span class="errorClass" id="s_VerifyCode_Error">
    						<s:fielderror>
    							<s:param>verifyCode</s:param>
    						</s:fielderror>
                	  	</span>
    				</td>
    			</tr>
       			<tr>
    				<td>
    					<input type="submit" id="submit" value="登&nbsp;陆" class="btn btn-primary btn-large login">

    				</td>
    			</tr>
    		</table>	
    	</s:form>		  
    </div>
    <div class="myframe-right" id="myframe-right" ></div>   
</body>
</html>
  