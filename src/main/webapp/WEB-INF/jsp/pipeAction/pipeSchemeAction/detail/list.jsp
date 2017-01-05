<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道基础信息</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>检验准备</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="pipeScheme_listDetail">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
			  <tr>
			  	<td>管道系统</td>
                <td class="td_detail">
                    <s:textfield name="p_Sys" id="p_Sys" cssClass="inputClass" type="text"/>
                </td>
			  	
                <td>所属使用公司</td>
                <td class="td_detail">
                    <s:select name="companyID" 
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请选择单位=="/>
				</td>
				
				<td>装置名称</td>
                <td class="td_detail">
                    <s:textfield name="p_Equ_Name" id="p_Equ_Name" cssClass="inputClass" type="text"/>
                </td>    
            </tr>          
             <tr> <td colspan="6" align="right">
                    <input class="btn btn-inverse"  type="submit" value="提交" />
                    <input class="btn btn-inverse" type="reset" value="清空" />
                </td>
            </tr>
        </tbody>
    </table>	
	
      <table class="table table-striped table-bordered table-condensed center" id="list">
        	<thead>
            	<tr class="tr_detail">
                	<td width="15%">管道系统</td>
                	<td width="15%">装置名称</td>
                	<td width="20%">所属使用公司</td>
                	<td width="10%">下次年检时间</td>
                	<td width="20%">操作 </td>
            	</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${p_Sys}</td>
					<td>${p_Equ_Name}</td>
					<td>${company.name}</td>
					<td>${nextDetailMaintainDate}</td>
					<td>
						<s:a action="pipeSchemeDetail_addUI?basicId=%{id}">
 						<div class="btn btn-mini btn-primary reverse">
						 新增检验记录
						</div>
						</s:a>	
						<s:a  action="pipeInvestigation_companyUI?company.id=%{company.id}">
						<div class="btn btn-mini btn-primary reverse">
						企业资料
						</div>
						</s:a>						
 						<s:a action="pipeScheme_editUI?id=%{id}">
 						<div class="btn btn-mini btn-primary reverse">
						 设备资料
						</div>
						</s:a>						
						<s:a  action="pipeSchemeDetail_listRecord?basicId=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						历次检验记录
						</div>
						</s:a>						
 						<s:a action="pipeSchemeDetail_listProblem?basicId=%{id}">
 						<div class="info2 btn btn-mini btn-danger">
						 问题记载
						</div>
						</s:a>						
					</td>
				</tr>
				</s:iterator>
				
				<tr><%@ include file="/WEB-INF/jsp/public/pager.jspf" %></tr>	
        	</tbody>
    	</table>
   </s:form>
   <!--分页信息-->
	
</body>
</html>
