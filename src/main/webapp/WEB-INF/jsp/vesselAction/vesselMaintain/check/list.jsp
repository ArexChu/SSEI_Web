<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>验收检验</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
		<s:form autocomplete="off">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6"><b>容器验收检验目录</b> 
                </td>
            </tr>
        </thead>
        <tbody class="myfocus">
        	<tr>
        		<td>项目</td>
        		<td>状态</td>
        		<td>操作</td>        		
        	</tr>
        	 
            <tr>
                <td>
                	压力容器验收检查记录
                </td>
                <td>
                <s:if test="#menuList[0]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[0]">
                		 <s:a action="vesselCheckConclusionTest_editUI?checkId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
							<s:a action="vesselCheckConclusionTest_delete?checkId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselCheckConclusionTest_add?checkId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
			
			
			<tr>
				<td>
                	资料审查及外观检查记录
                </td>
                <td>
                <s:if test="#menuList[1]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[1]">
                		 <s:a action="vesselCheckTest_editUI?checkId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselCheckTest_delete?checkId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselCheckTest_add?checkId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
                  
            <tr>
            	<td colspan="100%">
              		<s:a  action="vesselMaintain_list.action">
						<div class="btn  btn-primary reverse">
						返回
						</div>
					</s:a> 
				</td>
            </tr> 
       </tbody> 
      </table>
      </s:form>
	
</body>
</html>
