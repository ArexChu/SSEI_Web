<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>文件管理<b class="tip"></b>全面检验</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
		<s:form autocomplete="off">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="4"><b>管道全面检验文件目录</b> 
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
                	宏 观 检 查 记 录
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
                		 <s:a action="pipeMicroTest_generateFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipeMicroTest_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeMicroTest_deleteFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	 安全保护装置检查情况
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
                		 <s:a action="pipeSPDTest_generateFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeSPDTest_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeSPDTest_deleteFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	管道测厚检查
                </td>
                <td>
                	<s:if test="#menuList[2]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
               
               <td>
                <s:if test="#fileList[2]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                	<s:if test="#menuList[2]">
                		<s:if test="#fileList[2]==0">
                		 <s:a action="pipeThiTest_generateFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipeThiTest_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeThiTest_deleteFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	在用工业管道硬度测定记录
                </td>
                <td>
                	<s:if test="#menuList[3]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
               
               <td>
                <s:if test="#fileList[3]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                 <td>
                 	<s:if test="#menuList[3]">
                 		<s:if test="#fileList[3]==0">
                		 <s:a action="pipeHardTest_generateFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipeHardTest_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeHardTest_deleteFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	 在用工业管道金相分析记录
                </td>
                <td>
                	<s:if test="#menuList[4]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
               
               <td>
                <s:if test="#fileList[4]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                	
                <td>
                	<s:if test="#menuList[4]">
                		<s:if test="#fileList[4]==0">
                		 <s:a action="pipeMetTest_generateFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipeMetTest_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeMetTest_deleteFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	在用工业管道压力试验记录
                </td>
               <td>
                	<s:if test="#menuList[5]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
               
               <td>
                <s:if test="#fileList[5]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                 <td>
                 	<s:if test="#menuList[5]">
                 		<s:if test="#fileList[5]==0">
                		 <s:a action="pipePreTest_generateFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipePreTest_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipePreTest_deleteFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	在用工业管道泄漏性试验记录
                </td>
                <td>
                	<s:if test="#menuList[6]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
               
               <td>
                <s:if test="#fileList[6]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                 <td>
                 	<s:if test="#menuList[6]">
                 	<s:if test="#fileList[6]==0">
                		 <s:a action="pipeLeakTest_generateFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipeLeakTest_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeLeakTest_deleteFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	管道安全状况等级评定结果汇总表
                </td>
                <td>
                	<s:if test="#menuList[7]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
               
               <td>
                <s:if test="#fileList[7]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                 <td>
                 	<s:if test="#menuList[7]">
                 		<s:if test="#fileList[7]==0">
                		 <s:a action="pipeAssTable_generateFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipeAssTable_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeAssTable_deleteFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	管道全面检验结论（必填）
                </td>
                <td>
                	<s:if test="#menuList[8]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
               
               <td>
                <s:if test="#fileList[8]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                 <td>
                 	<s:if test="#menuList[8]">
                 		<s:if test="#fileList[8]==0">
                		 <s:a action="pipeVerification_generateFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipeVerification_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeVerification_deleteFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                <s:if test="#fileList[9]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                 <td>
                	<s:a action="pipeDetailMaintainDocument_createFinalFile?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成综合文档
							</div>
						</s:a>
						
						<s:a action="pipeDetailMaintainDocument_download?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
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
