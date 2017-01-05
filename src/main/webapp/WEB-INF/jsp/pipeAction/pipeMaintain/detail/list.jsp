<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>全面检验</div>
    
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
                	宏 观 检 查 记 录
                </td>
                <td>
                <s:if test="#menuList[0]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[0]">
                		 <s:a action="pipeMicroTest_editUI?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeMicroTest_delete?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeMicroTest_add?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
            </tr>
            
            <tr>
                <td>
                	 安全保护装置检查情况
                </td>
                <td>
                	 <s:if test="#menuList[1]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                
              		<s:if test="#menuList[1]">
                		 <s:a action="pipeSPDTest_editUI?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeSPDTest_delete?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeSPDTest_add?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
					
					 
				</td>
				
            </tr>
            
            
            <tr>
                <td>
                	管道测厚检查
                </td>
                <td>
                	 <s:if test="#menuList[2]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                
                	<s:if test="#menuList[2]">
                		 <s:a action="pipeThiTest_editUI?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeThiTest_delete?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeThiTest_add?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 
				</td>
				
            </tr>
            
            
            
            <tr>
                <td>
                	在用工业管道硬度测定记录
                </td>
                <td>
                	 <s:if test="#menuList[3]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                
                	<s:if test="#menuList[3]">
                		 <s:a action="pipeHardTest_editUI?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeHardTest_delete?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeHardTest_add?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 
				</td>
				
            </tr>
            
            
            <tr>
                <td>
                	 在用工业管道金相分析记录
                </td>
                <td>
                	 <s:if test="#menuList[4]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                	
                <td>
                
                	<s:if test="#menuList[4]">
                		 <s:a action="pipeMetTest_editUI?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeMetTest_delete?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeMetTest_add?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 
				</td>
				
            </tr>
            
            
            <tr>
                <td>
                	在用工业管道压力试验记录
                </td>
                <td>
                	 <s:if test="#menuList[5]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                
                	<s:if test="#menuList[5]">
                		 <s:a action="pipePreTest_editUI?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipePreTest_delete?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipePreTest_add?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 
				</td>
				
            </tr>
            
            
            <tr>
                <td>
                	在用工业管道泄漏性试验记录
                </td>
                <td>
                	 <s:if test="#menuList[6]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                <s:if test="#menuList[6]">
                		 <s:a action="pipeLeakTest_editUI?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeLeakTest_delete?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeLeakTest_add?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 
				</td>
				
            </tr>
            

            <tr>
                <td>
                	管道安全状况等级评定结果汇总表
                </td>
                <td>
                	 <s:if test="#menuList[7]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                
                	<s:if test="#menuList[7]">
                		 <s:a action="pipeAssTable_editUI?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeAssTable_delete?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeAssTable_add?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else>  
				</td>
				
            </tr>
            
             <tr>
                <td>
                	管道全面检验结论（必填）
                </td>
                <td>
                	 <s:if test="#menuList[8]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                <td>
                
                	<s:if test="#menuList[8]">
                		 <s:a action="pipeVerification_editUI?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="pipeVerification_delete?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="pipeVerification_add?detailid=%{id}&pipeMaintainId=%{pipeMaintainId}">
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
