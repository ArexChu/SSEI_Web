<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>角色列表</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script language="javascript" src="${pageContext.request.contextPath}/script/jquery_treeview/jquery.treeview.js"></script>
		 <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/file.css" />
	     <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/script/jquery_treeview/jquery.treeview.css" />
	     <script type="text/javascript">
			$(function(){
				// 指定事件处理函数
				$("[name=privilegeIds]").click(function(){
					
					// 当选中或取消一个权限时，也同时选中或取消所有的下级权限
					$(this).siblings("ul").find("input").attr("checked", this.checked);
					
					// 当选中一个权限时，也要选中所有的直接上级权限
					if(this.checked == true){
						$(this).parents("li").children("input").attr("checked", true);
					}
				
				});
			});
		</script>
		
		<style type="text/css">
			ul,li { margin-left:100px; }
		</style>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>系统管理<b class="tip"></b>角色列表<b class="tip"></b>设置权限</div>
    
    <span class="errorClass" id="msg">${msg}</span>	
	<s:form autocomplete="off" action="role_setPrivilege"  >
	 
		<s:hidden name="id"></s:hidden>
     	 <table class="table table-striped table-bordered table-condensed center" id="list">	
        	<tbody>	
            	<tr>
					<td>				
						<input  style="float: left;"  type="checkbox" id="cbSelectAll" onclick="$('[name=privilegeIds]').attr('checked', this.checked)"/>
						<label for="cbSelectAll">全选</label>
					 </td>
            	</tr>
        		<tr>
					<td>
						<!-- 显示树状结构内容 -->
						<ul id="tree">
							<s:iterator value="#application.topPrivilegeList">
							<li>
								<input style="float: left;" type="checkbox" name="privilegeIds" value="${id}" id="cb_${id}" <s:property value="%{id in privilegeIds ? 'checked' : ''}"/> />
								<label for="cb_${id}"><span class="folder">${name}</span></label>
								<ul>
								<s:iterator value="children">
									<li>
										<input style="float: left;"  type="checkbox" name="privilegeIds" value="${id}" id="cb_${id}" <s:property value="%{id in privilegeIds ? 'checked' : ''}"/> />
										<label for="cb_${id}"><span class="folder">${name}</span></label>
										<ul>
											<s:iterator value="children">
											<li>
											<input style="float: left;"  type="checkbox" name="privilegeIds" value="${id}" id="cb_${id}" <s:property value="%{id in privilegeIds ? 'checked' : ''}"/> />
											<label for="cb_${id}"><span class="folder">${name}</span></label>
											</li>
											</s:iterator>
										</ul>
									</li>		
								</s:iterator>
								</ul>
							</li>
							</s:iterator>
						</ul>
					</td>					
				</tr>
				<tr>
            	<td colspan="2" >
            		<div style="margin-left: 120px">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                    <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a>
                    </div>
                </td>
            	</tr> 
        	</tbody>
        	
    	</table>
    	<script language="javascript">
        	$("#tree").treeview();
        </script> 	
   </s:form>
	
</body>
</html>
