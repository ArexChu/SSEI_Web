<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>证书列表</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>系统管理<b class="tip"></b>证书列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="certificates_list">
     	 <table class="table table-striped table-bordered table-condensed center" id="list">
        	<thead>
            	<tr class="tr_detail">
                	<td width="10%">证书名称</td>
               	 	<td width="10%">描述</td>
                	<td width="10%">失效时间</td>
                	<td width="5%">操作 </td>
                	<td width="5%">操作 </td>
            		</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="certificates">
				<tr>
					<td>${name}</td>
					<td>${description}</td>
					<td>${failureData}</td>
					<td>
						<s:a  action="certificates_editUI?id=%{id}&userId=%{userId}">
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
						</s:a>
					</td>
					<td>
 						<s:a action="certificates_delete?id=%{id}&userId=%{userId}" onclick="return confirm('您确定要删除吗？')" >
 						<div class="info2 btn btn-mini btn-danger">
						 删除
						</div>
 						</s:a>
 					</td>
				</tr>
				</s:iterator>
				<tr>
					<td colspan="100%">
						<s:a  action="certificates_addUI?userId=%{userId}">
						<div class="btn btn-mini btn-primary reverse">
						添加证书
						</div>
						</s:a>
						<s:a  action="user_list.action">
						<div class="btn btn-mini btn-primary reverse">
						返回
						</div>
						</s:a>
					</td>
				</tr>
        	</tbody>
    	</table>
   </s:form>
   <!--分页信息-->
	
</body>
</html>
