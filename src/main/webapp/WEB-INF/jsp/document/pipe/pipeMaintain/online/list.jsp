<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>文件管理<b class="tip"></b>在线检验</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
		<s:form autocomplete="off">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="4"><b>管道在线检验文件目录</b> 
                </td>
            </tr>
        </thead>
        <tbody class="myfocus">
        	<tr>
        		<td>文件名称</td>
        		<td>检验状态</td>
        		<td>文件状态</td>
        		<td>操作</td>
        	</tr>
        	 
            <tr>
                <td>
                	在用工业管道在线检验记录（1）
                </td>
                <td>
                <s:if test="#menuList[0]">完成</s:if>
                	<s:else>未完成</s:else> 
                	
                </td>
            	
            	<td>
                <s:if test="#fileList[0]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                	<s:if test="#menuList[0]">
                		<s:if test="#fileList[0]==0">
                		 <s:a action="pipeOnlineThiTest_generateFile?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipeOnlineThiTest_download?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeOnlineThiTest_deleteFile?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				
            </tr>
            
            <tr>
                <td>
                	 在用工业管道在线检验记录（2）
                </td>
                <td>
                	 <s:if test="#menuList[1]">完成</s:if>
                	<s:else>未完成</s:else> 
                	
                </td>
                
                <td>
                <s:if test="#fileList[1]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                 <s:if test="#menuList[1]">
					<s:if test="#fileList[1]==0">
                		 <s:a action="pipeOnlineSubTest_generateFile?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeOnlineSubTest_download?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeOnlineSubTest_deleteFile?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 
				</s:if>
				</td>
            </tr>
            
    		 <tr>
                <td>
                	综合文档（是以上文档的集合）
                </td>
                <td>
                	 
                </td>
               
               <td>
                <s:if test="#fileList[2]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                 <td>
                	<s:a action="pipeOnlineMaintainDocument_createFinalFile?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成综合文档
							</div>
						</s:a>
						
						<s:a action="pipeOnlineMaintainDocument_download?onlineid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载综合文档
							</div>
						</s:a>	
				</td>
            </tr>
    		              
            <tr>
            	<td colspan="100%">
              		<s:a  action="pipeMaintainDocument_list.action">
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
