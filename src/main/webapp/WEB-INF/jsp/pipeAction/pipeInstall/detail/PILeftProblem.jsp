<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>遗留质量问题的处理意见记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>    				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="piLeftProblem_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>遗留质量问题的处理意见记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
         	<td>遗留问题</td>
         	<td colspan="8">
         	<s:textarea name="pi_Left_Prob" cssClass="span2 inputClass" style="height:150px"/>
         	</td>
         </tr>
         
          <tr>
         	<td>处理意见</td>
         	<td colspan="8" >
         	<s:textarea  name="pi_Left_Opin" cssClass="span2 inputClass" style="height:300px"/>
         	</td>
         </tr>
         

          <tr>
          <td >监检人员</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="pi_Left_Per_Name" />
         	</td>
          
         	<td>监检日期</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Left_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	 </div>
         	</td>
         </tr>           
            
         <tr>
        	<td colspan="9">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 

    </table>
    </s:form>
</body>
</html>
  