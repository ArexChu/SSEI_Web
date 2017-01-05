<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道基础信息</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" id="pipeExpireForm" action="pipeExpire_list">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
			  <tr>
                <td>所属使用公司</td>
                <td class="td_detail">
                    <s:select name="companyId" 
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请选择单位=="/>
				</td>
				 <td colspan="4" align="right">
                    <input class="btn btn-inverse"  type="submit" value="提交" />
                    <input class="btn btn-inverse" type="reset" value="清空" />
                </td>
            </tr>
        </tbody>
    </table>	
	
      <table class="table table-striped table-bordered table-condensed center" id="list">
        	<thead>
            	<tr class="tr_detail">
                	<td width="15%">管道编号</td>
                	<td width="15%">管道名称</td>
                	<td width="15%">所属使用公司</td>
                	<td width="10%">管道级别</td>
                	<td width="10%">管道系统</td>
                	<td width="10%">绝热层材料 </td>
                	<td width="10%">防腐层材料</td>
                	<td width="10%">下次全面检验时间 </td>
                	<td width="10%">下次在线检验时间</td>
                	
            	</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${p_ID}</td>
					<td>${p_Name}</td>
					<td>${company.name}</td>
					<td>${p_Gra}</td>
					<td>${p_Sys}</td>
					<td>${p_Ins_Ma}</td>
					<td>${p_Pro_Ma}</td>
					<td>${nextDetailMaintainDate}</td>
					<td>${nextOnlineMaintainDate}</td>

				</tr>
				</s:iterator>
				<tr><%@ include file="/WEB-INF/jsp/public/pager.jspf" %></tr>	
        	</tbody>
    	</table>
   </s:form>
   <!--分页信息-->
	
</body>
</html>
