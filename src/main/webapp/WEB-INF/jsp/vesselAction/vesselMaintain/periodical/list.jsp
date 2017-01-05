<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>定期检验</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
		<s:form autocomplete="off">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6"><b>容器定期检验目录</b> 
                </td>
            </tr>
        </thead>
        <tbody class="myfocus">
        	<tr>
        		<td>项目</td>
        		<td>状态</td>
        		<td>操作</td>
        		<td>项目</td>
        		<td>状态</td>
        		<td>操作</td>
        	</tr>
        	 
            <tr>
                <td>
                	压力容器宏观检验记录 
                </td>
                <td>
                <s:if test="#menuList[0]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[0]">
                		 <s:a action="vesselMicroTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselMicroTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselMicroTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
				<td>
                	壁厚测定记录
                </td>
                <td>
                <s:if test="#menuList[1]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[1]">
                		 <s:a action="vesselThiTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselThiTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselThiTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
			
			
			<tr>
                <td>
                	壁厚校核记录
                </td>
                <td>
                <s:if test="#menuList[2]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[2]">
                		 <s:a action="vesselThiCheck_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselThiCheck_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselThiCheck_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
				<td>
                	射线检测记录
                </td>
                <td>
                <s:if test="#menuList[3]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[3]">
                		 <s:a action="vesselRadioTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselRadioTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselRadioTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
			
			<tr>
                <td>
                	超声检测记录
                </td>
                <td>
                <s:if test="#menuList[4]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[4]">
                		 <s:a action="vesselUltrasonicTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselUltrasonicTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselUltrasonicTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
				<td>
                	衍射时差法（TOFD）超声检测记录
                </td>
                <td>
                <s:if test="#menuList[5]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[5]">
                		 <s:a action="vesselTOFDTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselTOFDTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselTOFDTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
			
			<tr>
                <td>
                	磁粉检测记录
                </td>
                <td>
                <s:if test="#menuList[6]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[6]">
                		 <s:a action="vesselMagneticTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselMagneticTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselMagneticTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
				<td>
                	渗透检测记录
                </td>
                <td>
                <s:if test="#menuList[7]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[7]">
                		 <s:a action="vesselPermTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselPermTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselPermTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
			
			<tr>
                <td>
                	声发射检测记录
                </td>
                <td>
                <s:if test="#menuList[8]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[8]">
                		 <s:a action="vesselSonciTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselSonciTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselSonciTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
				<td>
                	材料成分分析记录
                </td>
                <td>
                <s:if test="#menuList[9]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                <td>
                	<s:if test="#menuList[9]">
                		 <s:a action="vesselMatTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselMatTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselMatTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
			
			<tr>
                <td>
                	硬度检测记录
                </td>
                <td>
                <s:if test="#menuList[10]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[10]">
                		 <s:a action="vesselHardTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselHardTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselHardTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
				<td>
                	金相分析记录
                </td>
                <td>
                <s:if test="#menuList[11]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[11]">
                		 <s:a action="vesselMetTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselMetTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselMetTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
			
			<tr>
                <td>
                	安全附件检验记录
                </td>
                <td>
                <s:if test="#menuList[12]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[12]">
                		 <s:a action="vesselSPDTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselSPDTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselSPDTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
				
				<td>
                	耐压试验记录
                </td>
                <td>
                <s:if test="#menuList[13]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[13]">
                		 <s:a action="vesselPreTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselPreTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselPreTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			

           <tr>

				<td>
                	气密性试验记录
                </td>
                <td>
                <s:if test="#menuList[14]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[14]">
                		 <s:a action="vesselAirTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselAirTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselAirTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>


                <td>
                	氨检漏试验记录
                </td>
                <td>
                <s:if test="#menuList[15]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[15]">
                		 <s:a action="vesselAmmoniaTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselAmmoniaTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselAmmoniaTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
		  </tr>	
		
			<tr>		
				<td>
                	氦、卤素检漏试验记录
                </td>
                <td>
                <s:if test="#menuList[16]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[16]">
                		 <s:a action="vesselHeTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselHeTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselHeTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            
  
                <td>
                	附加检验记录
                </td>
                <td>
                <s:if test="#menuList[17]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[17]">
                		 <s:a action="vesselAddTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselAddTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselAddTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>	
			
			
			<tr>		
				<td>
                	搪玻璃压力容器搪玻璃层定期检验记录
                </td>
                <td>
                <s:if test="#menuList[18]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[18]">
                		 <s:a action="vesselGlassTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselGlassTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGlassTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            
  
                <td>
                	石墨压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[19]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[19]">
                		 <s:a action="vesselGraphiteTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselGraphiteTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGraphiteTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
			
			
			<tr>		
				<td>
                	石墨衬里压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[20]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[20]">
                		 <s:a action="vesselGraphiteLinerTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselGraphiteLinerTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGraphiteLinerTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            
  
                <td>
                	玻璃钢压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[21]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[21]">
                		 <s:a action="vesselGlassSteelTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselGlassSteelTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGlassSteelTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
			
			<tr>		
				<td>
                	玻璃钢衬里压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[22]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[22]">
                		 <s:a action="vesselGlassSteelLinerTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselGlassSteelLinerTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGlassSteelLinerTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            
  
                <td>
                	塑料压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[23]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[23]">
                		 <s:a action="vesselPlasticTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselPlasticTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselPlasticTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
			</tr>
			
           
           <tr>		
				<td>
                	塑料衬里压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[24]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[24]">
                		 <s:a action="vesselPlasticLinerTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselPlasticLinerTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselPlasticLinerTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							添加
							</div>
						</s:a>
					</s:else> 	
				</td>
            
  
               <td>
                	容器定期检验结论（必填）
                </td>
                <td>
                <s:if test="#menuList[25]">有</s:if>
                	<s:else>无</s:else> 
                	
                </td>
                
                <td>
                	<s:if test="#menuList[25]">
                		 <s:a action="vesselConclusionTest_editUI?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							查看
							</div>
						</s:a> 
					
              		 	<s:a action="vesselConclusionTest_delete?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a> 
                	</s:if>
                	<s:else> 
                		<s:a action="vesselConclusionTest_add?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
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
