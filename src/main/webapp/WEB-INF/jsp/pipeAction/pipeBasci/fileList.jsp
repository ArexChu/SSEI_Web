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
        				url:'pipeBasic_upLoad.action?id=<s:property value="id"/>&fileDetailName='+fileName,
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

    </script>
	
	</head>
	
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>基础信息<b class="tip"></b>附件列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="pipeBasic_addFile" enctype="multipart/form-data">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="5"><b>管道基础信息附件列表</b> 
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
                	压力管道附属信息表
                </td>
                <td>
                	<s:if test="#fileBoolean[0]">有</s:if>
                	<s:else>无</s:else>
                </td>
                
                <td>
                	<input type="file"  id="pipeAttachTable" class="span2 inputClass fileToUpload"  name="document"/>
                </td>
                <td>该文件为excel文件，后缀为.xlsx
                </td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="pipeBasic_downLoad?fileDetailName=pipeAttachTable&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr>
            
            <tr>
                <td >
                	管道单线图
                </td>
                <td>
                	<s:if test="#fileBoolean[1]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="pipeBasicPic" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该图片文件后缀为.jpg</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="pipeBasic_downLoad?fileDetailName=pipeBasicPic&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr>
            
            <tr>
            	<td>
                	其它
                </td>
                <td>
                	<s:if test="#fileBoolean[2]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input type="file" id="otherPdf" class="span2 inputClass fileToUpload" name="document"/>
                </td>
                <td>该文件为pdf文件,后缀为.pdf</td>
                <td>
                	<div class = "judgeHidden">
              		 <s:a action="pipeBasic_downLoad?fileDetailName=otherPdf&id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						
						下载
						</div>
					</s:a> 
					</div>
				</td>
            </tr>
                  
            <tr>
            	<td colspan="6">
              		<s:a  action="%{backurl}_list.action">
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
