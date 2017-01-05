<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>文件管理<b class="tip"></b>容器列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="vesselMaintainDocument_list">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
			  <tr>
			  	<td >任务号</td>
                <td class="detail">
                    <s:textfield name="v_M_Massion_ID" id="v_M_Massion_ID" cssClass="inputClass" type="text"/>
                </td>
                <td >编号</td>
                <td class="detail">
                    <s:textfield name="v_M_ID" id="v_M_ID" cssClass="inputClass" type="text"/>
                </td>
                <td>使用单位</td>
                <td class="td_detail">
                    <s:select name="companyID" 
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请选择单位=="/>
				</td>
            </tr>
            <tr>
            <td>产品编号</td>
                <td class="detail">
                    <s:textfield name="vesselBasic.v_Product_ID"  cssClass="inputClass" type="text"/>
                </td>
                <td>检验性质</td>
                <td class="td_detail">
                   	<s:select cssClass="inputClass" name="v_M_Mode" list="{'定期', '验收','年度'}" headerKey="" headerValue="请选择检验性质"  />
                </td>
                <td>容器名称</td>
                <td class="td_detail">
                     <s:textfield name="vesselBasic.v_Name"  cssClass="inputClass" type="text"/>
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
                	<td width="15%">任务号</td>
                	<td width="15%">编号</td>
                	<td width="15%">使用单位</td>
                	<td width="15%">产品编号</td>
                	<td width="10%">检验性质</td>
                	<td width="10%">容器名称</td>
                	<td width="15%">操作 </td>
            	</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${v_M_Massion_ID}</td>
					<td>${v_M_ID}</td>
					<td>${vesselBasic.v_Use_Com.name}</td>
					<td>${vesselBasic.v_Product_ID}</td>
					<td>${v_M_Mode}</td>
					<td>${vesselBasic.v_Name}</td>
					<td>
						<s:a  action="%{v_M_Mode == '定期' ? 'vesselPeriodicalMaintainDocument' : v_M_Mode=='年度' ? 'vesselAnnualMaintainDocument' : 'vesselCheckMaintainDocument'}_list?vesselMaintainId=%{id}">
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
