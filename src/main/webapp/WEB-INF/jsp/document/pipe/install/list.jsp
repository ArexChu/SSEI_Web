<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道安装</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>文件管理<b class="tip"></b>管道安装</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="pipeInstallDocument_list">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
			  <tr>
                <td >项目编号</td>
                <td class="detail">
                    <s:textfield name="pi_ID" id="pi_ID" cssClass="inputClass" type="text"/>
                </td>
                <td>项目名称</td>
                <td class="td_detail">
                    <s:textfield name="pi_Name" id="pi_Name" cssClass="inputClass" type="text"/>
                </td>
                <td>建设单位</td>
                <td class="td_detail">
                    <s:select name="constructComId" 
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请选择单位=="/>
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
                	<td width="15%">项目编号</td>
                	<td width="15%">项目名称</td>
                	<td width="15%">建设单位</td>
                	<td width="10%">安装单位</td>
                	<td width="10%">监督检验日期</td>
                	<td width="15%">操作 </td>
            	</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${pi_ID}</td>
					<td>${pi_Name}</td>
					<td>${pi_Cons_Com.name}</td>
					<td>${pi_Ins_Com.name}</td>
					<td>${pi_Check_Date}</td>
					<td>
						<s:a  action="pipeInstallDocument_toFileUI?id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						文件列表
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
