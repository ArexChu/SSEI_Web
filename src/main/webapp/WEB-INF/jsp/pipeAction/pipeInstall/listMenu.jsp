<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道安装</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>全面安装</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
		<s:form autocomplete="off">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="3"><b>工业管道安装安全质量监督检验记录</b> 
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
                	工业管道安装安全质量监督检验结论记录
                </td>
                <td>
                <s:if test="#menuList[0]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[0]">
                		 <s:a action="piConclusion_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piConclusion_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piConclusion_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
            </tr>
            
            <tr>
                <td>
                	监督检验的工业管道基本情况记录
                </td>
                <td>
                	 <s:if test="#menuList[1]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
              		<s:if test="#menuList[1]">
                		 <s:a action="piBasic_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piBasic_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piBasic_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr>

            
            <tr>
                <td>
                	监督检验的工作内容及工作基本情况记录
                </td>
                <td>
                	 <s:if test="#menuList[2]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
              		<s:if test="#menuList[2]">
                		 <s:a action="piCheckInf_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piCheckInf_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piCheckInf_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr>
            
            <tr>
                <td>
                	对相关单位安全质量管理行为的评价记录
                </td>
                <td>
                	 <s:if test="#menuList[3]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
              		<s:if test="#menuList[3]">
                		 <s:a action="piComInf_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piComInf_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piComInf_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr>
                
            <tr>
                <td>
                	工业管道安装安全质量监督检验记录
                </td>
                <td>
                	 <s:if test="#menuList[4]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
              		<s:if test="#menuList[4]">
                		 <s:a action="piSafeCheck_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piSafeCheck_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piSafeCheck_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr> 
            
             <tr>
                <td>
                	工业管道安装安全质量监督检验记录(续一)
                </td>
                <td>
                	 <s:if test="#menuList[5]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
              		<s:if test="#menuList[5]">
                		 <s:a action="piSafeCheck1_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piSafeCheck1_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piSafeCheck1_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr> 
            
             <tr>
                <td>
                	工业管道安装安全质量监督检验记录（续二）
                </td>
                <td>
                	 <s:if test="#menuList[6]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
              		<s:if test="#menuList[6]">
                		 <s:a action="piSafeCheck2_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piSafeCheck2_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piSafeCheck2_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr> 
            
            
             <tr>
                <td>
                	工业管道安装安全质量监督检验记录（续三）
                </td>
                <td>
                	 <s:if test="#menuList[7]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
              		<s:if test="#menuList[7]">
                		 <s:a action="piSafeCheck3_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piSafeCheck3_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piSafeCheck3_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr> 
            
            <tr>
                <td>
                	工业管道安装竣工资料审查报告记录
                </td>
                <td>
                	 <s:if test="#menuList[8]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
              		<s:if test="#menuList[8]">
                		 <s:a action="pipeCompleteInf_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeCompleteInf_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeCompleteInf_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr> 
            
            
            <tr>
                <td>
                	遗留质量问题的处理意见记录
                </td>
                <td>
                	 <s:if test="#menuList[9]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
              		<s:if test="#menuList[9]">
                		 <s:a action="piLeftProblem_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piLeftProblem_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piLeftProblem_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr> 
                
           <tr>
                <td>
                	压力管道底片复审记录表
                </td>
                <td>
                	 <s:if test="#menuList[10]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
              		<s:if test="#menuList[10]">
                		 <s:a action="piReview_editUI?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="piReview_delete?installId=%{id}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="piReview_add?installId=%{id}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            </tr> 
                
             
            <tr>
            	<td colspan="100%">
              		<s:a  action="pipeInstall_list.action">
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
