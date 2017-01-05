<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>检验列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="pipeMaintainDocument_list">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
			  <tr>
			  	<td >检验编号</td>
                <td class="detail">
                    <s:textfield name="m_ID" id="m_ID" cssClass="inputClass" type="text"/>
                </td>
                <td >装置名称</td>
                <td class="detail">
                    <s:textfield name="pipeBasic.p_Equ_Name" id="p_ID" cssClass="inputClass" type="text"/>
                </td>
                <td>管道名称</td>
                <td class="td_detail">
                    <s:textfield name="pipeBasic.p_Name" id="p_Name" cssClass="inputClass" type="text"/>
                </td>
            </tr>
            <tr>
            <td>所属使用公司</td>
                <td class="td_detail">
                    <s:select name="companyID" 
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请选择单位=="/>
				</td>
                <td>管道系统</td>
                <td class="td_detail">
                    <s:textfield name="pipeBasic.p_Sys" id="p_Sys" cssClass="inputClass" type="text"/>
                </td>
                <td>检验性质</td>
                <td class="td_detail">
                     <s:select name="m_Prop" list="{'全面', '在线'}" headerKey="" headerValue="检验性质"/>
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
                	<td width="15%">检验编号</td>
                	<td width="15%">装置名称</td>
                	<td width="15%">管道名称</td>
                	<td width="15%">所属使用公司</td>
                	<td width="10%">管道系统</td>
                	<td width="10%">检验性质</td>
                	<td width="15%">操作 </td>
            	</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${m_ID}</td>
					<td>${pipeBasic.p_Equ_Name}</td>
					<td>${pipeBasic.p_Name}</td>
					<td>${pipeBasic.company.name}</td>
					<td>${pipeBasic.p_Sys}</td>
					<td>${m_Prop}</td>
					<td>
						<s:a  action="%{m_Prop == '全面' ? 'pipeDetailMaintainDocument' : 'pipeOnlineMaintainDocument'}_list?pipeMaintainId=%{id}">
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
