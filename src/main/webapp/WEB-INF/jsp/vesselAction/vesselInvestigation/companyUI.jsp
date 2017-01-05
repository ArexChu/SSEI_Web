<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>企业资料审查</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <style type="text/css">
			label {
				display: inline;
			}
		</style>
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>资料审查</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span>

    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="6" id="center"><b>企业基本信息</b></td>
            	</tr>
            	
        	</thead>
         	<tbody>
         
         	<tr>
         		<td width="17%">公司名称(全称)</td>
         		<td width="30%" colspan="2">
         			${name}
         		</td >
         		<td width="17%">公司地址</td>
         		<td  width="33%" colspan="2">
         			${address}
         		</td>
         	</tr>
         
         	<tr>  
         		<td >特种设备安全管理部门</td>
         		<td colspan="2">
         			${department}
         		</td>
         		<td >邮编</td>
         		<td colspan="2">
         			${poscode}
         		</td>
         	</tr>
         	
         	<tr>
         		<td >公司联系人</td>
         		<td colspan="2">
         			${contacts}
         		</td>
         		<td >联系电话</td>
         		<td colspan="2">
         			${contactsPhone}
         		</td>
         	</tr>
        	
        	<tr>
         		<td >组织机构代码</td>
         		<td colspan="2">
         			${code}
         		</td>
         		<td >企业类型</td>
         		<td colspan="2">
        			<s:if test="type==1">使用</s:if>
					<s:elseif test="type==2">制造</s:elseif>
					<s:else>检验</s:else>	
         		</td>
         	</tr>
      </tbody> 
   	</table>
   	 
   	<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6"><b>企业管理制度</b> 
                </td>
            </tr>
        </thead>
        <tbody class="myfocus">
        	<tr>
        		<td width="50%" colspan="2">描述</td>
        		<td  width="25%" colspan="2">状态</td>
        		<td width="25%" colspan="2">查看</td>
        	</tr>
        	 
            <tr>
                <td colspan="2">
                	 <s:a action="company_showPDF?detailName=operationRules&id=%{id}" target="_blank" >
                	操作规程
                	</s:a>
                </td>
                <td colspan="2">
                	<s:if test="#fileBoolean[0]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td colspan="2">
              		 <s:a action="company_showPDF?detailName=operationRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a>
				</td> 
            </tr>
            
            <tr>
                <td colspan="2">
                	<s:a action="company_showPDF?detailName=recordRules&id=%{id}" target="_blank" >
                	档案管理规定
                	</s:a>
                </td>
                <td colspan="2">
                	<s:if test="#fileBoolean[1]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td colspan="2">
              		 <s:a action="company_showPDF?detailName=recordRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
            </tr>
            
            <tr>
            	<td colspan="2">
                	<s:a action="company_showPDF?detailName=maintainRules&id=%{id}" target="_blank" >
                	维护、运行记录规定
                	</s:a>
                </td>
                <td colspan="2">
                	<s:if test="#fileBoolean[2]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td colspan="2">
              		 <s:a action="company_showPDF?detailName=maintainRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
            </tr>
            
            <tr>
            	<td colspan="2">
                	<s:a action="company_showPDF?detailName=userRules&id=%{id}" target="_blank" >
                	人员培训规定
                	</s:a>
                </td >
                <td colspan="2">
                	<s:if test="#fileBoolean[3]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td colspan="2">
              		<s:a action="company_showPDF?detailName=userRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
            </tr>
            
            <tr>
            	<td colspan="2">
                	<s:a action="company_showPDF?detailName=dangerRules&id=%{id}" target="_blank" >
                	隐患治理规定
                	</s:a>
                </td>
                <td colspan="2">
                	<s:if test="#fileBoolean[4]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td colspan="2">
              		 <s:a action="company_showPDF?detailName=dangerRules&id=%{id}" target="_blank" >
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
            </tr>
            
            <tr>
            	<td colspan="2">
                	<s:a action="company_showPDF?detailName=reportRules&id=%{id}" target="_blank" >
                	事故报告规定
                	</s:a>
                </td>
                <td colspan="2">
                	<s:if test="#fileBoolean[5]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td colspan="2">
              		 <s:a action="company_showPDF?detailName=reportRules&id=%{id}" target="_blank" >
						<div class="btn  btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
            </tr>
            
            
            <tr>
            	<td colspan="2" style="color: blue;">
                	<s:a action="company_showPDF?detailName=emergencyRules&id=%{id}" target="_blank" >
                	应急预案
                	</s:a>
                </td>
                <td colspan="2">
                	<s:if test="#fileBoolean[6]">有</s:if>
                	<s:else>无</s:else>
                </td>
                <td colspan="2">
              		<s:a action="company_showPDF?detailName=emergencyRules&id=%{id}" target="_blank" >
						<div class="btn  btn-mini btn-primary reverse">
						查看
						</div>
					</s:a> 
				</td>
            </tr>

       </tbody> 
      </table> 
      <s:iterator value="users">
         <table  class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="5" id="center"><b>人员基本信息</b></td>
            	</tr>
            	
        	</thead>
         	<tbody>
         		<tr>
         			<td width="20%">姓名</td>
         			<td width="20%" >
         				${name}
         			</td>
         			<td width="20%">性别</td>
         			<td width="20%" >
       					<s:if test="sex==0">男</s:if>
						<s:else>女</s:else>	
         			</td>
         			<td width="20%">
         				<s:a action="user_editUI?id=%{id}" >
						<div class="btn  btn-mini btn-primary reverse">
						查看具体
						</div>
					</s:a> 
         			
         			</td>
         		</tr>   		        		
            <s:if test="certificates.size!=0">
            <tr>
                	<td colspan="5"><b>证件信息</b></td>
            </tr>
            <tr>
					<td colspan="1">证书名称</td>
					<td colspan="3">描述</td>
					<td colspan="1">失效时间</td>
			</tr>
            <s:iterator value="certificates">
				<tr>
					<td colspan="1">${name}</td>
					<td colspan="3">${description}</td>
					<td colspan="1">${failureData}</td>
				</tr>
			</s:iterator>
			</s:if>
			</tbody> 
   	  </table>
    </s:iterator>
    <table>
    	<tr>
       		<td colspan="6">
          	<a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
   		</tr>
    </table> 
</body>
</html>