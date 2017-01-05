<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>公司添加</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		<script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>系统管理<b class="tip"></b>公司信息</div>
    <span class="errorClass" id="msg">${msg}</span>
    
	<s:form  action="company_%{id == 0 ? 'add' : 'edit'}">
		<s:hidden name="id"></s:hidden>
    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="6" id="center"><b>公司基本信息</b><a id="startEdit" >修改</a></td>
                	 
            	</tr>
        	</thead>
         	<tbody>
         
         	<tr>
         		<td >公司名称(全称)</td>
         		<td colspan="2">
         			<s:textfield name ="name" cssClass="inputClass" />
         		</td>
         		<td >公司地址</td>
         		<td colspan="2">
         			<s:textfield name ="address" cssClass="inputClass" />
         		</td>
         	</tr>
         
         	<tr>  
         		<td >特种设备安全管理部门</td>
         		<td colspan="2">
         			<s:textfield name ="department" cssClass="inputClass"/>
         		</td>
         		<td >邮编</td>
         		<td colspan="2">
         			<s:textfield name ="poscode" cssClass="inputClass"/>
         		</td>
         	</tr>
         	
         	<tr>
         		<td >公司联系人</td>
         		<td colspan="2">
         			<s:textfield name ="contacts" cssClass="inputClass"/>
         		</td>
         		<td >联系电话</td>
         		<td colspan="2">
         			<s:textfield name ="contactsPhone" cssClass="inputClass"/>
         		</td>
         	</tr>
        	
        	<tr>
         		<td >组织机构代码</td>
         		<td colspan="2">
         			<s:textfield name ="code" cssClass="inputClass"/>
         		</td>
         		<s:if test="%{id==0}">
         			<td >企业类型</td>
         			<td colspan="2">
         				<s:select name="type" list="#{1:'使用', 2:'制造',3:'检验'}"></s:select>	
         			</td>
         		</s:if>
         	</tr>
        	
        	
          	<tr>
            	<td colspan="6">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                     <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
            </tr> 
         </tbody> 
   	  </table>
  </s:form>
</body>
</html>
