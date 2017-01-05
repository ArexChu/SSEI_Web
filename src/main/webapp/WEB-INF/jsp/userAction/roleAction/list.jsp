<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>角色列表</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>系统管理<b class="tip"></b>角色列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="role_list">
     	 <table class="table table-striped table-bordered table-condensed center" id="list">
        	<thead>
            	<tr class="tr_detail">
                	<td width="10%">角色名称</td>
               	 	<td width="20%">角色说明</td>
               	 	<td width="10%">适用企业类型</td>
                	<td width="20%" colspan="3">操作 </td>
            		</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="roleList">
				<tr>
					<td>${name}</td>
					<td>${description}</td>
					<td>
						<s:if test="companyType==1">使用</s:if>
						<s:elseif test="companyType==2">制造</s:elseif>
						<s:else>检验</s:else>
					</td>
					<td>
						<s:a  action="role_editUI?id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
						</s:a>
					</td>
					
					<td>
						<s:a  action="role_setPrivilegeUI?id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						设置权限
						</div>
						</s:a>
					</td>
					
					<td>
 						<s:a action="role_delete?id=%{id}" onclick="return confirm('您确定要删除吗？')" >
 						<div class="info2 btn btn-mini btn-danger">
						 删除
						</div>
 						</s:a>
 					</td>
				</tr>
				</s:iterator>
				<tr>
					<td colspan="100%">
						<s:a  action="role_addUI">
						<div class="btn btn-mini btn-primary reverse">
						添加角色
						</div>
						</s:a>
					</td>
				</tr>
        	</tbody>
    	</table>
   </s:form>
	
</body>
</html>
