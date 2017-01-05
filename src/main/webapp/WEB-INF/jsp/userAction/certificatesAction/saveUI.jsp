<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>证件信息</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
		<script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 

	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>系统管理<b class="tip"></b>证件信息</div>
    <span class="errorClass" id="msg">${msg}</span>
	<s:form  action="certificates_%{id == 0 ? 'add' : 'edit'}?userId=%{userId}">
		<s:hidden name="id"></s:hidden>
    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="2" id="center"><b>证书基本信息</b><a id="startEdit" >修改</a></td>
            	</tr>
            	
        	</thead>
         	<tbody>
         
         	<tr>
         		<td >证书名称</td>
         		<td >
         			<s:textfield name ="name" cssClass="inputClass"/>
         		</td>
         	</tr>
         	<tr>
         		<td >描述</td>
         		<td >
         			<s:textarea name ="description" style="height:80px" cssClass="inputClass"/>
         		</td>
         	</tr>
         	
         	<tr>
         		<td >失效时间</td>
         		<td class="detail">
                    <div class="input-append">
                        <s:textfield cssClass="datepicker inputClass" name="failureData" /><span class="add-on"><i class="icon-calendar"></i></span>
                    </div>
				</td>
         	</tr>
       
          	<tr>
            	<td colspan="2">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                    <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
            </tr> 
         </tbody> 
   	  </table>
  </s:form>

</body>
</html>

