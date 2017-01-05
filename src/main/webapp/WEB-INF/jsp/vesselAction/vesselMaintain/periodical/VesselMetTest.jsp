<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>金相分析记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselMetTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>金相分析记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
         <tr>
         	<td>分析仪器型号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Met_Equ_Mode" />
			</td>
         	<td>分析仪器编号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Met_Equ_ID" />
			</td>   	
         </tr>
         <tr>
         	<td>腐蚀方法</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Met_Cor" />
			</td>
         	<td>抛光方法</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Met_Pol" />
			</td>   	
         </tr>
		 <tr>
         	<td>执行标准</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Met_Cri" />
			</td>
         	<td>金相组织</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Met_Part" />
			</td>   	
         </tr>
         
         
          <tr>
         	<td>主体材质</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Met_Mat" />
			</td>
         	<td>热处理状态</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Met_Heat" />
			</td>   	
         </tr>
         <tr>
         	<td>分析结果：</td>
         	<td colspan="5" >
         	<s:textarea name="v_Met_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
          <tr>
            <td colspan="1">分析</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Met_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="1">校对</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Met_Check_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>         
         <tr>
        	<td colspan="6">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 
    </table>
    </s:form>
</body>
</html>
  