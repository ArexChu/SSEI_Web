<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>在线检验</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
		<s:form autocomplete="off">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="3"><b>管道全面检验目录</b> 
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
                	在用工业管道在线检验记录（1）
                </td>
                <td>
                <s:if test="#menuList[0]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[0]">
                		 <s:a action="pipeOnlineThiTest_editUI?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeOnlineThiTest_delete?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeOnlineThiTest_add?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
            </tr>
            
            <tr>
                <td>
                	 在用工业管道在线检验记录（2）
                </td>
                <td>
                	 <s:if test="#menuList[1]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                
              		<s:if test="#menuList[1]">
                		 <s:a action="pipeOnlineSubTest_editUI?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeOnlineSubTest_delete?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeOnlineSubTest_add?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
					
					 
				</td>
				
            </tr>
            
                  
            <tr>
            	<td colspan="100%">
              		<s:a  action="pipeMaintain_list.action">
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
