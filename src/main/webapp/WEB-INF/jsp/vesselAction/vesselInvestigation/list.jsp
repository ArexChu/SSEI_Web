<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器基础信息</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>容器列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="vesselInvestigation_list">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
       <tbody class="myfocus">
			  <tr>
                <td >产品编号</td>
                <td class="detail">
                    <s:textfield name="v_Product_ID" id="v_Product_ID" cssClass="inputClass" type="text"/>
                </td>
                <td>容器名称</td>
                <td class="td_detail">
                    <s:textfield name="v_Name" id="v_Name" cssClass="inputClass" type="text"/>
                </td>
                <td>使用单位</td>
                <td class="td_detail">
                    <s:select name="companyID" 
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请选择单位=="/>
				</td>
            </tr>
             <tr>
                <td >设备品种</td>
                <td class="detail">
                	<s:textfield name="v_Type" id="v_Type" cssClass="inputClass" type="text"/>
                </td>
                <td>设备使用地点</td>
                <td class="td_detail">
                    <s:textfield name="v_Use_Addr" id="v_Use_Addr" cssClass="inputClass" type="text"/>
                </td>
                <td>主体结构形式</td>
                <td class="td_detail">
                	  <s:textfield name="v_Mainbody_Str" id="v_Mainbody_Str" cssClass="inputClass" type="text"/>
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
                	<td width="15%">产品编号</td>
                <td width="15%">容器名称</td>
                <td width="20%">使用单位</td>
                <td width="10%">设备品种</td>
                <td width="10%">设备使用地点</td>
                <td width="10%">操作 </td>
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
					<td>
						<s:a action="vesselSchemeDetail_addUI?basicId=%{id}">
 						<div class="btn btn-mini btn-primary reverse">
						 新增检验记录
						</div>
						</s:a>	
						<s:a  action="vesselInvestigation_companyUI?companyID=%{v_Use_Com.id}">
						<div class="btn btn-mini btn-primary reverse">
						企业资料
						</div>
						</s:a>						
 						<s:a action="vesselBasic_editUI?id=%{id}">
 						<div class="btn btn-mini btn-primary reverse">
						 设备资料
						</div>
						</s:a>	
						<s:a  action="vesselSchemeDetail_listRecord?basicId=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						历次检验记录
						</div>
						</s:a>						
 						<s:a action="vesselSchemeDetail_listProblem?basicId=%{id}">
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
