<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>人员列表</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>系统管理<b class="tip"></b>人员列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" action="user_list">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
			  <tr>
              	<td >员工名称</td>
              	<td class="detail">
                	<s:textfield name ="name" class="inputClass"/>
               	</td>
               	<td >单位名称</td>
              	<td class="detail">
                    <s:select name="companyID" 
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请选择单位=="/>
				</td>
            </tr>
             <tr>
              	<td >作业人员种类</td>
              	<td class="detail">
                	<s:textfield name ="userTypeSearch" class="inputClass"/>
               	</td>
               	<td >作业项目</td>
				<td class="detail">
                	<s:textfield name ="projectTypeSearch" class="inputClass"/>
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
                	<td width="10%">姓名</td>
               	 	<td width="5%">性别</td>
                	<td width="10%">联系方式</td>
                	<td width="10%">邮箱 </td>
                	<td width="5%">证书数量 </td>
                	<td width="20%">操作 </td>
            		</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${name}</td>
					<td>${sex== 0 ? '男' : '女'}</td>
					<td>${telephone}</td>
					<td>${e_Mail}</td>
					<td><s:property value="certificates.size"/></td>
					<td>
						<s:a  action="user_editUI?id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
						</s:a>
						<s:a action="certificates_list?userId=%{id}" >
 						<div class="btn btn-mini btn-primary reverse">
						 证书管理
						</div>
 						</s:a>
 						<s:a action="user_delete?id=%{id}" onclick="return confirm('您确定要删除吗？')" >
 						<div class="info2 btn btn-mini btn-danger">
						 删除
						</div>
 						</s:a>
 						<s:a action="user_initPassword?id=%{id}" onclick="return confirm('您确认初始化密码为ssei吗？')" >
 						<div class="info2 btn btn-mini btn-danger">
						初始化密码
						</div>
 						</s:a>
					</td>
				</tr>
				</s:iterator>
				<tr>
					<td colspan="100">
						<s:a  action="user_addUI">
						<div class="btn btn-mini btn-primary reverse">
						添加人员
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
