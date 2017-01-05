<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道月度检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>月度检验</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="pipeMonthlyInspection_list">
	<s:hidden name="pipeBasic.p_Sys"></s:hidden>
	<td class="detail">
                </td>
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
            <tr>
            	<td>开始日期</td>
                <td class="detail">
                	<div class="input-append">
	                   	<s:textfield  cssClass="datepicker inputClass" name="startDate"/>
	                   	<span class="add-on"><i class="icon-calendar"></i></span>
	                </div>
                </td>
                <td>结束日期</td>
                <td class="td_detail">
                	<div class="input-append">
	                   	<s:textfield  cssClass="datepicker inputClass" name="endDate"/>
	                   	<span class="add-on"><i class="icon-calendar"></i></span>
	                </div>
                </td>
                <td colspan="2">
                    <input class="btn btn-inverse"  type="submit" value="提交" />
                    <input class="btn btn-inverse" type="reset" value="清空" />
                </td>
            </tr>
        </tbody>
    </table>	
	
      <table class="table table-striped table-bordered table-condensed center" id="list">
        	<thead>
            	<tr class="tr_detail">
            		<td width="20%">使用单位</td>
                	<td width="20%">管道系统</td>
                	<td width="20%">检验日期</td>
                	<td width="20%">管道名称</td>
                	<td width="20%">操作 </td>
            	</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${pipeBasic.company.name}</td>
					<td>${pipeBasic.p_Sys}</td>
					<td>${v_Date}</td>
					<td>${pipeBasic.p_Name}</td>
					<td>
						<s:a  action="pipeMonthlyInspection_editUI?id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
						</s:a>					
 						<s:a action="pipeMonthlyInspection_delete?id=%{id}&pipeBasic.p_Sys=%{pipeBasic.p_Sys}" onclick="return confirm('您确定要删除吗？')" >
 						<div class="info2 btn btn-mini btn-danger">
						 删除
						</div>
						</s:a>
					</td>
				</tr>
				</s:iterator>
				<tr>
					<td colspan="100">
						<s:a action="pipeMonthlyInspection_addUI?pipeBasic.p_Sys=%{pipeBasic.p_Sys}">
							<div class="btn btn-mini btn-primary reverse">
							添加月度检验
							</div>
						</s:a>
						<s:a  action="pipeScheme_list.action">
							<div class="btn btn-mini btn-primary reverse">
							返回
							</div>
						</s:a>
					</td>
				</tr>
				<tr><%@ include file="/WEB-INF/jsp/public/pager.jspf" %></tr>	
        	</tbody>
    	</table>
   </s:form>
   <!--分页信息-->
	
</body>
</html>
