<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道安装</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>文件管理<b class="tip"></b>全面安装</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
		<s:form autocomplete="off">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="4"><b>工业管道安装安全质量监督检验记录文件列表</b> 
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
                	工业管道安装安全质量监督检验结论记录
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
                		 <s:a action="piConclusion_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piConclusion_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piConclusion_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	监督检验的工业管道基本情况记录
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
                		 <s:a action="piBasic_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piBasic_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piBasic_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	监督检验的工作内容及工作基本情况记录
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
                		 <s:a action="piCheckInf_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piCheckInf_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piCheckInf_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	对相关单位安全质量管理行为的评价记录
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
                		 <s:a action="piComInf_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piComInf_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piComInf_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	工业管道安装安全质量监督检验记录
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
                		 <s:a action="piSafeCheck_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piSafeCheck_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piSafeCheck_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	工业管道安装安全质量监督检验记录(续一)
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
                		 <s:a action="piSafeCheck1_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piSafeCheck1_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piSafeCheck1_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	工业管道安装安全质量监督检验记录（续二）
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
                		 <s:a action="piSafeCheck2_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piSafeCheck2_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piSafeCheck2_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	工业管道安装安全质量监督检验记录（续三）
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
                		 <s:a action="piSafeCheck3_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piSafeCheck3_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piSafeCheck3_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	工业管道安装竣工资料审查报告记录
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
                		 <s:a action="pipeCompleteInf_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="pipeCompleteInf_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="pipeCompleteInf_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	遗留质量问题的处理意见记录
                </td>
                 <td>
                	 <s:if test="#menuList[9]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
                
                <td>
                <s:if test="#fileList[9]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                	 <s:if test="#menuList[9]">
                	 	<s:if test="#fileList[9]==0">
                		 <s:a action="piLeftProblem_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piLeftProblem_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piLeftProblem_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                	压力管道底片复审记录表
                </td>
                 <td>
                	 <s:if test="#menuList[10]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
                
                <td>
                <s:if test="#fileList[10]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                	<s:if test="#menuList[10]">
                		<s:if test="#fileList[10]==0">
                		 <s:a action="piReview_generateFile?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="piReview_download?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="piReview_deleteFile?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
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
                <s:if test="#fileList[11]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                 <td>
                	<s:a action="pipeInstallDocument_createFinalFile?id=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							生成综合文档
							</div>
						</s:a>
						
						<s:a action="pipeInstallDocument_download?id=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							下载综合文档
							</div>
						</s:a>	
				</td>
            </tr>
             
             
            <tr>
            	<td colspan="100%">
              		<s:a  action="pipeInstallDocument_list">
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
