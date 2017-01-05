<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>修改密码</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		  <script type="text/javascript" src="${pageContext.request.contextPath}/script/userAction/password.js"></script>
   		 <style type="text/css">
			label {
				display: inline;
			}
		</style>
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>个人信息<b class="tip"></b>修改密码</div>
	<s:form  id="password" action="user_password" >
		<s:hidden name="id"></s:hidden>
    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                <td colspan="2"><b>修改密码</b></td>
            	</tr>
        	</thead>
         	<tbody>
         
         	<tr>
         		<td>原密码</td>
         		<td colspan="2">
         			<s:password name ="oldPassword" id="s_Log_Pas" cssClass="inputClass"/>
         			<span class="errorClass" id="s_Log_Pas_Error">
    						<s:fielderror>
    							<s:param>login</s:param>
    						</s:fielderror>
                	</span>
         		</td>
         	</tr>
         	<tr>
                <td width="10%">登陆密码<font color="FF0000">*</font></td>
                <td width="500">
                   <s:password name ="password" id="s_New_Pass" cssClass="inputClass"/>
                    <span class="errorClass" id="s_New_Pass_Error">
                    	
                	</span>
                </td>
			</tr>
            <tr>
                <td>确认密码<font color="FF0000">*</font></td>
                <td>   
                	<s:password name ="rePassword" id="s_Re_New_Pass" cssClass="inputClass"/>
                	  <span class="errorClass" id="s_Re_New_Pass_Error">
                	  ${errors.s_Re_New_Pas}
                	  </span>
                </td>
            </tr>
   
          	<tr>
            	<td colspan="2">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                </td>
            </tr> 
         </tbody> 
   	  </table>
  </s:form>
</body>
</html>

