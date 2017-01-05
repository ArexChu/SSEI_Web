<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>公司列表</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>系统管理<b class="tip"></b>公司列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="company_list">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
			  <tr>
              	<td >公司类型</td>
				<td class="detail">
                	<s:select name="type" list="#{0:'请选择',1:'使用', 2:'制造',3:'检验'}"/>
               	</td>
               	<td >公司名称</td>
				<td class="detail">
                	<s:textfield name="name"></s:textfield>
               	</td>
               	 <td colspan="6" align="right">
                    <input class="btn btn-inverse"  type="submit" value="提交" />
                    <input class="btn btn-inverse" type="reset" value="清空" />
                </td>
            </tr>
        </tbody>
    </table>	
	
      <table class="table table-striped table-bordered table-condensed center" id="list">
        	<thead>
            	<tr class="tr_detail">
                	<td width="20%">公司名称</td>
                	<td width="20%">公司地址</td>
               	 	<td width="10%">邮编</td>
                	<td width="10%">联系人</td>
                	<td width="10%">联系人电话 </td>
                	<td width="15%" colspan="3">操作 </td> 
            		</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${name}</td>
					<td>${address}</td>
					<td>${poscode}</td>
					<td>${contacts}</td>
					<td>${contactsPhone}</td>
					<td>
						<s:a  action="company_editUI?id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
						</s:a>
						<s:a  action="company_ruleUI?id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						规章制度
						</div>
						</s:a>
						<s:a action="company_delete?id=%{id}" onclick="return confirm('确定要删除吗？')" >
 						<div class="info2 btn btn-mini btn-danger">
						 删除
						</div>
 						</s:a>
					</td>
			
				</tr>
				</s:iterator>
				<tr>
					<td colspan="100">
						<s:a  action="company_addUI">
						<div class="btn btn-mini btn-primary reverse">
						添加公司
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
