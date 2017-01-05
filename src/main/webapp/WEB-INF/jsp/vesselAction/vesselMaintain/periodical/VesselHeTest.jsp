<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>氦、卤素检漏试验记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselHeTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="4" id="center"><b>氦、卤素检漏试验记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
         	<td>仪器型号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_He_Equ_Mod" />
			</td>
         	<td>仪器编号</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_He_Equ_ID" />
			</td>   	
         </tr>
         <tr>
         	<td>仪器精度量程</td>
         	<td >
      			<s:textfield cssClass="span2 inputClass" name="v_He_Equ_Acc" />
			</td>
         	<td>检测方式</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_He_Test_Method" />
			</td>   	
         </tr>
         <tr>
         	<td>试漏气体</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_He_Type" />
			</td>
         	<td>试验压力</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_He_Pre" />MPa
			</td>   	
         </tr>
         <tr>
         	<td>保压时间</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_He_Keep" />min
			</td>
         	<td>泄漏率</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_He_Ration" />Paml/s
			</td>   	
         </tr>
         <tr>
         	<td>试验部位</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="v_He_Part" />
			</td>  	
         </tr>
         <tr>
         	<td>试验结果</td>
         	<td colspan="3" >
         	<s:textarea name="v_He_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
 		 <tr>
            <td colspan="1" width="20%">检验</td>
            <td colspan="1" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_He_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="1" width="20%">校对</td>
            <td colspan="1" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_He_Check_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>                                        
         <tr>
        	<td colspan="4">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 
    </table>
    </s:form>
</body>
</html>
  