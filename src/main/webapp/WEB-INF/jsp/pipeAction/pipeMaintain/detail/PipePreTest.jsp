<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>压力检测</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>    				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="pipePreTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pipeMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>压力检测</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>

         <tr>
             <td colspan="2" width="20%">试验介质</td>
             <td colspan="2" width="30%"> 
             <s:textfield cssClass="span2 inputClass" name="p_Exp_Med" />
             </td>
             <td colspan="2" width="20%">试验压力</td>
             <td colspan="2" width="30%">
              <s:textfield cssClass="span2 inputClass" name="p_Exp_Pre" />MPa
             </td>  
         </tr>
         <tr>
             <td colspan="2">介质温度</td>
             <td colspan="2"> 
             <s:textfield cssClass="span2 inputClass" name="p_Med_Tem" />℃
             </td>
             <td colspan="2">环境温度</td>
             <td colspan="2">
              <s:textfield cssClass="span2 inputClass" name="p_Amb_Tem" />℃
             </td>  
         </tr>
         <tr>
             <td colspan="2">机泵出口压力表规格</td>
             <td colspan="2"> 
             <s:textfield cssClass="span2 inputClass" name="p_Pump_Pre_Cri" />MPa
             </td>
             <td colspan="2">机泵出口压力表精度</td>
             <td colspan="2">
              <s:textfield cssClass="span2 inputClass" name="p_Pump_Pre_Acc" />级
             </td>  
         </tr>
         <tr>
             <td colspan="2">管线压力表规格</td>
             <td colspan="2"> 
             <s:textfield cssClass="span2 inputClass" name="p_Line_Pre_Cri" />MPa
             </td>
             <td colspan="2">管线压力表精度</td>
             <td colspan="2">
              <s:textfield cssClass="span2 inputClass" name="p_Line_Pre_Acc" />级
             </td>  
         </tr>
         <tr>
             <td colspan="2">机泵型号及编号</td>
             <td colspan="2"> 
             <s:textfield cssClass="span2 inputClass" name="p_Pump_Type" />
             </td>
             <td colspan="2">执行标准</td>
             <td colspan="2">
              <s:textfield cssClass="span2 inputClass" name="p_Ope_Cri"/>
             </td>  
         </tr>
         <tr>
             <td colspan="2">最高工作压力</td>
             <td colspan="2">
              <s:textfield cssClass="span2 inputClass" name="p_Max_Pre" />MPa
             </td>  
             <td colspan="2"></td>
             <td colspan="2"></td> 
         </tr>
         <tr>
	         <td colspan="2">压力试验结论
	         </td>
	         <td colspan="6">
	          <s:textarea name="p_Pre_Result" cssClass="span2 inputClass" style="height:90px"/>
	         </td>
         </tr>      
      	 <tr>
            <td colspan="2">检验</td>
            <td colspan="3">
            <div class="input-append">
                 <s:textfield  cssClass="datepicker inputClass" name="p_Pre_Data"/>
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
  