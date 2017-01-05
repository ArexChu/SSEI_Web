<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>附件列表</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	  <script type="text/javascript" src="${pageContext.request.contextPath}/script/ajaxfileupload.js"></script> 
    <script>
        $(function () {
            $("tr td:nth-child(2)").each(function(){
                if($(this).html().trim()=="无"){  
    				$(this).parent().find(".judgeHidden").hide();  
                }
            });
            $(".fileToUpload").on("change",function(){
            	var tr = $(this).parent().prev();
            	 var fileName = $(this).attr("id");
        		$.ajaxFileUpload
        		(	
        			{
        				url:'vesselPeriodicalMaintain_upLoad.action?id=<s:property value="id"/>&fileDetailName='+fileName,
        				fileElementId: fileName,
        				dataType: 'json',
        				success: function (data, status)
        				{    
        					tr.html("有");
        					tr.parent().find(".judgeHidden").show();
        				}
        			}	
        		);       		
        	});
        });
       $(function () {
       	
       });
     
    </script>
	
	</head>
	
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>定期检验<b class="tip"></b>附件列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="vesselPeriodicalMaintain_addFile" enctype="multipart/form-data">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="5"><b>管道全面检查信息附件列表</b> 
                </td>
            </tr>
        </thead>
        <tbody class="myfocus">
        	<tr>
        		<td>描述</td>
        		<td>状态</td>
        		<td>上传</td>
        		<td>注意</td>
        		<td>下载</td>
        	</tr>
        	 
            <tr>
                <td>
                	壁厚测定记录—测厚点部位图
                </td>
                <td>
                	<s:if test="#fileBoolean[0]">有</s:if>
                	<s:else>无</s:else>
                </td>
                
                <td>
                	<input type="file"  id="vesselThiTestPic" class="span2 inputClass fileToUpload"  name="document"/>
                </td>
                <td>该图片文件后缀为.jpg
                </td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselThiTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr>
            
            <tr>
                <td >
                	射线检测记录—检测部位（布片示意图）
                </td>
                <td>
                	<s:if test="#fileBoolean[1]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselRadioTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselRadioTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr>
            
            <tr>
            	<td>
                	超声检测记录—检测部位（区段）及缺陷位置示意图
                </td>
                <td>
                	<s:if test="#fileBoolean[2]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselUltrasonicTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselUltrasonicTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr>
             
            <tr>
            	<td>
                	衍射时差法（TOFD）超声检测记录—检测部位（区段）及缺陷位置示意图
                </td>
                <td>
                	<s:if test="#fileBoolean[3]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselTOFDTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselTOFDTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
             <tr>
            	<td>
                	磁粉检测记录—检测部位（区段）及缺陷位置示意图
                </td>
                <td>
                	<s:if test="#fileBoolean[4]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselMagneticTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselMagneticTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
             <tr>
            	<td>
                	渗透检测记录—检测部位及缺陷位置示意图
                </td>
                <td>
                	<s:if test="#fileBoolean[5]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselPermTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselPermTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
            
             <tr>
            	<td>
                	声发射检测记录—传感器布置简图
                </td>
                <td>
                	<s:if test="#fileBoolean[6]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselSonciTestPic1" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselSonciTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
            <tr>
            	<td>
                	声发射检测记录—加载程序图/数据及定位图
                </td>
                <td>
                	<s:if test="#fileBoolean[7]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselSonciTestPic2" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselSonciTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
            
             <tr>
            	<td>
                	材料成分分析记录—取样位置图
                </td>
                <td>
                	<s:if test="#fileBoolean[8]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselMatTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselMatTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
            
             <tr>
            	<td>
                	硬度检测记录—测点位置示意图
                </td>
                <td>
                	<s:if test="#fileBoolean[9]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselHardTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselHardTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
            
             <tr>
            	<td>
                	金相分析记录—取样分析部位示意图
                </td>
                <td>
                	<s:if test="#fileBoolean[10]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselMetTestPic1" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselMetTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
            <tr>
            	<td>
                	金相分析记录—金相照片
                </td>
                <td>
                	<s:if test="#fileBoolean[11]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselMetTestPic2" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselMetTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr>
            
             <tr>
            	<td>
                	耐压试验记录—实际试验曲线
                </td>
                <td>
                	<s:if test="#fileBoolean[12]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselPreTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselPreTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
            
             <tr>
            	<td>
                	气密性试验记录—实际试验曲线图
                </td>
                <td>
                	<s:if test="#fileBoolean[13]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselAirTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselAirTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
            
             <tr>
            	<td>
                	氨检漏试验记录—试验部位图
                </td>
                <td>
                	<s:if test="#fileBoolean[14]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselAmmoniaTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselAmmoniaTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
            
             <tr>
            	<td>
                	氦、卤素检漏试验记录—试验部位图
                </td>
                <td>
                	<s:if test="#fileBoolean[15]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="vesselHeTestPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="vesselPeriodicalMaintain_downLoad?fileDetailName=vesselHeTestPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr> 
            
                
            <tr>
            	<td colspan="6">
              		<s:a  action="vesselMaintain_list">
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
