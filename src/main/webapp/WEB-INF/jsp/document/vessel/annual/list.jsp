<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>文件管理<b class="tip"></b>年度检验</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
		<s:form autocomplete="off">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="4"><b>容器年度检验文件目录</b> 
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
                	压力容器年度检查结论记录
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
                		 <s:a action="vesselAnnualConclusionTest_generateFile?annualId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselAnnualConclusionTest_download?annualId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselAnnualConclusionTest_deleteFile?annualId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	压力容器年度检查记录附页
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
                		 <s:a action="vesselAnnualTest_generateFile?annualId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselAnnualTest_download?annualId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselAnnualTest_deleteFile?annualId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	<s:a action="vesselAnnualMaintainDocument_createFinalFile?annualId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成综合文档
							</div>
						</s:a>
						
						<s:a action="vesselAnnualMaintainDocument_download?annualId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载综合文档
							</div>
						</s:a>	
				</td>
            </tr>
    		              
            <tr>
            	<td colspan="100%">
              		<s:a  action="vesselMaintainDocument_list.action">
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
