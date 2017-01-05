<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器检验提醒</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		  <script type="text/javascript" src="${pageContext.request.contextPath}/script/ajaxfileupload.js"></script> 
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>容器列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" id="vesselExpireForm" action="vesselExpire_list">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
			  
            <tr> 	
            	<td>使用单位</td>
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
                <td width="15%">产品编号</td>
                <td width="15%">容器名称</td>
                <td width="20%">使用单位</td>
                <td width="10%">设备品种</td>
                <td width="10%">设备使用地点</td>
                <td width="10%">主体结构形式 </td>
                <td width="10%">投入使用日期</td>
                <td width="10%">下次定期检验日期 </td>
                <td width="10%">下次年度检验日期</td>
            	</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${v_Product_ID}</td>
                	<td>${v_Name}</td>
					<td>${v_Use_Com.name}</td>
                	<td>${v_Type}</td>
                	<td>${v_Use_Addr}</td>
                	<td>${v_Mainbody_Str}</td>
                	<td>${v_Start_Date}</td>
                	<td>${v_M_Next_Date}</td>
                	<td>${v_M_Next_Ann_Date}</td>
				</tr>
				</s:iterator>
				<tr><%@ include file="/WEB-INF/jsp/public/pager.jspf" %></tr>	
        	</tbody>
    	</table>
   </s:form>
   <!--分页信息-->
	
</body>
</html>
