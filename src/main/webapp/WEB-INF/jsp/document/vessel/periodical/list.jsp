<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>文件管理<b class="tip"></b>定期检验</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
		<s:form autocomplete="off">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="8"><b>容器定期检验文件目录</b> 
                </td>
            </tr>
        </thead>
        <tbody class="myfocus">
        	<tr>
        		<td>文件名称</td>
        		<td>检验状态</td>
        		<td>文件状态</td>
        		<td>操作</td>
        		<td>文件名称</td>
        		<td>检验状态</td>
        		<td>文件状态</td>
        		<td>操作</td>
        	</tr>
        	 
            <tr>
                <td>
                	压力容器宏观检验记录 
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
                		 <s:a action="vesselMicroTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselMicroTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselMicroTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	壁厚测定记录
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
                		 <s:a action="vesselThiTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselThiTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselThiTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	壁厚校核记录
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
                		 <s:a action="vesselThiCheck_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselThiCheck_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselThiCheck_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	射线检测记录
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
                		 <s:a action="vesselRadioTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselRadioTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselRadioTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	超声检测记录
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
                		 <s:a action="vesselUltrasonicTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselUltrasonicTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselUltrasonicTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	衍射时差法（TOFD）超声检测记录
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
                		 <s:a action="vesselTOFDTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselTOFDTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselTOFDTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	磁粉检测记录
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
                		 <s:a action="vesselMagneticTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselMagneticTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselMagneticTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	渗透检测记录
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
                		 <s:a action="vesselPermTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselPermTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselPermTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	声发射检测记录
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
                		 <s:a action="vesselSonciTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselSonciTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselSonciTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	材料成分分析记录
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
                		 <s:a action="vesselMatTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselMatTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselMatTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	硬度检测记录
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
                		 <s:a action="vesselHardTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselHardTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselHardTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	金相分析记录
                </td>
                <td>
                <s:if test="#menuList[11]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>      	
            	<td>
                <s:if test="#fileList[11]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[11]">
                		<s:if test="#fileList[11]==0">
                		 <s:a action="vesselMetTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselMetTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselMetTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	安全附件检验记录
                </td>
                <td>
                <s:if test="#menuList[12]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
            	<td>
                <s:if test="#fileList[12]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[12]">
                		<s:if test="#fileList[12]==0">
                		 <s:a action="vesselSPDTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselSPDTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselSPDTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	耐压试验记录
                </td>
                <td>
                <s:if test="#menuList[13]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>      	
            	<td>
                <s:if test="#fileList[13]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[13]">
                		<s:if test="#fileList[13]==0">
                		 <s:a action="vesselPreTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselPreTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselPreTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	气密性试验记录
                </td>
                <td>
                <s:if test="#menuList[14]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
            	<td>
                <s:if test="#fileList[14]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[14]">
                		<s:if test="#fileList[14]==0">
                		 <s:a action="vesselAirTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselAirTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselAirTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	氨检漏试验记录
                </td>
                <td>
                <s:if test="#menuList[15]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
            	<td>
                <s:if test="#fileList[15]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[15]">
                		<s:if test="#fileList[15]==0">
                		 <s:a action="vesselAmmoniaTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselAmmoniaTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselAmmoniaTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	氦、卤素检漏试验记录
                </td>
                <td>
                <s:if test="#menuList[16]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
            	<td>
                <s:if test="#fileList[16]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[16]">
                		<s:if test="#fileList[16]==0">
                		 <s:a action="vesselHeTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselHeTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselHeTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	附加检验记录
                </td>
                <td>
                <s:if test="#menuList[17]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>      	
            	<td>
                <s:if test="#fileList[17]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[17]">
                		<s:if test="#fileList[17]==0">
                		 <s:a action="vesselAddTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselAddTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselAddTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	搪玻璃压力容器搪玻璃层定期检验记录
                </td>
                <td>
                <s:if test="#menuList[18]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
            	<td>
                <s:if test="#fileList[18]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[18]">
                		<s:if test="#fileList[18]==0">
                		 <s:a action="vesselGlassTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGlassTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselGlassTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	石墨压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[19]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>      	
            	<td>
                <s:if test="#fileList[19]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[19]">
                		<s:if test="#fileList[19]==0">
                		 <s:a action="vesselGraphiteTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGraphiteTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselGraphiteTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	石墨衬里压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[20]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
            	<td>
                <s:if test="#fileList[20]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[20]">
                		<s:if test="#fileList[20]==0">
                		 <s:a action="vesselGraphiteLinerTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGraphiteLinerTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselGraphiteLinerTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	玻璃钢压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[21]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>      	
            	<td>
                <s:if test="#fileList[21]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[21]">
                		<s:if test="#fileList[21]==0">
                		 <s:a action="vesselGlassSteelTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGlassSteelTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselGlassSteelTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	玻璃钢衬里压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[22]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
            	<td>
                <s:if test="#fileList[22]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[22]">
                		<s:if test="#fileList[22]==0">
                		 <s:a action="vesselGlassSteelLinerTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselGlassSteelLinerTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselGlassSteelLinerTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	塑料压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[23]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>      	
            	<td>
                <s:if test="#fileList[23]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[23]">
                		<s:if test="#fileList[23]==0">
                		 <s:a action="vesselPlasticTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselPlasticTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselPlasticTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                	塑料衬里压力容器定期检验记录附页
                </td>
                <td>
                <s:if test="#menuList[24]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>
            	<td>
                <s:if test="#fileList[24]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[24]">
                		<s:if test="#fileList[24]==0">
                		 <s:a action="vesselPlasticLinerTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselPlasticLinerTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselPlasticLinerTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
 							<div class="info2 btn btn-mini btn-danger">
							删除
						</div>
						</s:a>
					</s:else> 	
                	</s:if>
				</td>
				 <td>
                	容器定期检验结论
                </td>
                <td>
                <s:if test="#menuList[25]">完成</s:if>
                	<s:else>未完成</s:else> 
                </td>      	
            	<td>
                <s:if test="#fileList[25]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                <td>
                	<s:if test="#menuList[25]">
                		<s:if test="#fileList[25]==0">
                		 <s:a action="vesselConclusionTest_generateFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成
							</div>
						</s:a> 			            		 	
                	</s:if>
                	<s:else> 
                		<s:a action="vesselConclusionTest_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载
							</div>
						</s:a>
						<s:a action="vesselConclusionTest_deleteFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}" onclick="return confirm('您确定要删除吗？')" >
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
                <s:if test="#fileList[26]">有</s:if>
                	<s:else>无</s:else> 
                </td>
                
                 <td>
                	<s:a action="vesselPeriodicalMaintainDocument_createFinalFile?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							生成综合文档
							</div>
						</s:a>
						
						<s:a action="vesselPeriodicalMaintainDocument_download?periodicalId=%{id}&vesselMaintainId=%{vesselMaintainId}">
							<div class="btn btn-mini btn-primary reverse">
							下载综合文档
							</div>
						</s:a>	
				</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
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
