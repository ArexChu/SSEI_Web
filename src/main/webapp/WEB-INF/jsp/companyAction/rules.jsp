<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>公司列表</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>系统管理<b class="tip"></b>公司管理<b class="tip"></b>管理制度</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="company_rule" enctype="multipart/form-data">
		<s:hidden name="id"></s:hidden>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6"><b>公司规章制度</b> 
                </td>
            </tr>
        </thead>
        <tbody class="myfocus">
        	<tr>
        		<td colspan="2">描述</td>
        		<td>状态</td>
        		<td>上传</td>
        		<td>下载</td>
        		<td colspan="2">注意事项</td>
        	</tr>
        	 
            <tr>
                <td colspan="2">
                	 <s:a action="company_showPDF?detailName=operationRules&id=%{id}"  target="_blank" >
                	操作规程
                	</s:a>
                </td>
                <td>
                	<s:if test="#fileBoolean[0]">有</s:if>
                	<s:else>无</s:else>
                </td>
                
                <td>
                	<input id="operationRules" type="file" class="span2 inputClass" name="pdf"/>
                </td>
                <td>
              		 <s:a action="company_showPDF?detailName=operationRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
        		<td colspan="2">类型为pdf，命名为“operationRules”
        		</td>
            </tr>
            
            <tr>
                <td colspan="2">
                	<s:a action="company_showPDF?detailName=recordRules&id=%{id}" target="_blank" >
                	档案管理规定
                	</s:a>
                </td>
                <td>
                	<s:if test="#fileBoolean[1]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input id="recordRules" type="file" class="span2 inputClass" name="pdf"/>
                </td>
                <td>
              		 <s:a action="company_showPDF?detailName=recordRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
                
        		<td colspan="2">类型为pdf，命名为“recordRules”
        		</td>
            </tr>
            
            <tr>
            	<td colspan="2">
                	<s:a action="company_showPDF?detailName=maintainRules&id=%{id}" target="_blank" >
                	维护、运行记录规定
                	</s:a>
                </td>
                <td>
                	<s:if test="#fileBoolean[2]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input id="maintainRules" type="file" class="span2 inputClass" name="pdf"/>
                </td>
                <td>
              		 <s:a action="company_showPDF?detailName=maintainRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
        		<td colspan="2">类型为pdf，命名为“maintainRules”
        		</td>
            </tr>
            
            <tr>
            	<td colspan="2">
                	<s:a action="company_showPDF?detailName=userRules&id=%{id}" target="_blank" >
                	人员培训规定
                	</s:a>
                </td>
                <td>
                	<s:if test="#fileBoolean[3]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input id="userRules" type="file" class="span2 inputClass" name="pdf"/>
                </td>
                <td>
              		<s:a action="company_showPDF?detailName=userRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
        		<td colspan="2">类型为pdf，命名为“userRules”
        		</td>
            </tr>
            
            <tr>
            	<td colspan="2">
                	<s:a action="company_showPDF?detailName=dangerRules&id=%{id}" target="_blank" >
                	隐患治理规定
                	</s:a>
                </td>
                <td>
                	<s:if test="#fileBoolean[4]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input id="dangerRules" type="file" class="span2 inputClass" name="pdf"/>
                </td>
                <td>
              		 <s:a action="company_showPDF?detailName=dangerRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
        		<td colspan="2">类型为pdf，命名为“dangerRules”
        		</td>
            </tr>
            
            <tr>
            	<td colspan="2">
                	<s:a action="company_showPDF?detailName=reportRules&id=%{id}" target="_blank" >
                	事故报告规定
                	</s:a>
                </td>
                <td>
                	<s:if test="#fileBoolean[5]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input id="reportRules" type="file" class="span2 inputClass" name="pdf"/>
                </td>
                <td>
              		 <s:a action="company_showPDF?detailName=reportRules&id=%{id}" target="_blank" >
						<div class="btn  btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
        		<td colspan="2">类型为pdf，命名为“reportRules”
        		</td>
            </tr>
            
            
            <tr>
            	<td colspan="2" style="color: blue;">
                	<s:a action="company_showPDF?detailName=emergencyRules&id=%{id}" target="_blank" >
                	应急预案
                	</s:a>
                </td>
                <td>
                	<s:if test="#fileBoolean[6]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td>
                	<input id="emergencyRules" type="file" class="span2 inputClass" name="pdf"/>
                </td>
                <td>
              		<s:a action="company_showPDF?detailName=emergencyRules&id=%{id}" target="_blank" >
						<div class="btn  btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
        		<td colspan="2">类型为pdf，命名为“emergencyRules”
        		</td>
            </tr>
            
            <tr>
            	<td colspan="6">
                    <input class="btn btn-inverse" id="submit" type="submit" value="上传"/>
              		<s:a  action="company_list.action">
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
