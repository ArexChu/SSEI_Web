<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道安装</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <style type="text/css">
			label {
				display: inline;
			}
		</style>
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道安装</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span>
    
    
	<s:form  id="saveUI" action="pipeInstall_%{id == 0 ? 'add' : 'edit'}" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pi_finished"></s:hidden>
    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="2" id="center"><b>工业管道安装安全质量监督检验记录 </b> <a id="startEdit" >修改</a></td>
            	</tr>
            	
        	</thead>
         	<tbody>
         
         	<tr>
         		<td >项目编号</td>
         		<td  class="detail">
         			<s:textfield name ="pi_ID" cssClass="inputClass required"/>
				</td>
			</tr>
			<tr>
				<td >项目名称</td>
         		<td colspan="2">
         			<s:textfield name ="pi_Name" cssClass="inputClass required"/>
         		</td>
			</tr>
			
			
			<tr>
         		<td >建设单位</td>
         		<td class="detail">
         			<s:select name="pi_Cons_Com.id"  cssClass="inputClass required"
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请确定单位=="/>
				</td>
			</tr>
			<tr>
				<td >安装单位</td>
         		<td >
         			<s:select name="pi_Ins_Com.id"  cssClass="inputClass required"
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请确定单位=="/>
         		</td>
			</tr>
			
			
			<tr>
         		<td >监督检验日期</td>
         		<td class="detail">
                    <div class="input-append">
                        <s:textfield cssClass="datepicker inputClass required" name="pi_Check_Date"  /><span class="add-on"><i class="icon-calendar"></i></span>
                    </div>
				</td>
         	</tr>
        	
          	<tr>
            	<td colspan="2">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                     <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
            </tr> 
         </tbody> 
   	  </table>
  </s:form>
</body>
</html>

