<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>气密性试验记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <script type="text/javascript">
			$(function () {
				mutilInputToOne("v_Air_Process");
				
	 		});
		</script>	   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselAirTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="4" id="center"><b>气密性试验记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
 		<tr>
         	<td  width="20%">设计压力</td>
         	<td  width="30%">
         		<s:textfield cssClass="span2 inputClass" name="v_Air_De_Pre" />MPa
			</td>
         	<td  width="20%">允许/监控使用压力</td>
         	<td  width="30%" >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Permission_Pre" />MPa
			</td>   	
         </tr>
         <tr>
         	<td>耐压试验压力</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Pre_Pre" />MPa
			</td>
         	<td>气密性试验压力</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Pre" />MPa
			</td>   	
         </tr>	
		 <tr>
         	<td>试验介质</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Med" />
			</td>
         	<td>介质温度</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Med_Tem" />℃
			</td>   	
         </tr>
		 <tr>
         	<td>环境温度</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Tem" />℃	
			</td>
         	<td>容积</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Volume" />m3
			</td>   	
         </tr>
         <tr>
         	<td>压缩机型号及编号</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Comp_Type" />	
			</td>
         	<td>安全阀型号及编号</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Valve_Type" />
			</td>   	
         </tr>
         <tr>
         	<td>压力表量程,精度</td>
         	<td >
         		量程<s:textfield cssClass="span3 inputClass" name="v_Air_Range" />Mpa,
         		精度<s:textfield cssClass="span3 inputClass" name="v_Air_Acc" />级	
			</td>
         	<td>试验部位</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Air_Part" />
			</td>   	
         </tr>
         <tr>
         	<td colspan="4">试验程序记录</td>
		 </tr>
          <tr>
         	<td colspan="4">
         		缓慢升压至试验压力<s:textfield cssClass="span3 inputClass" id="v_Air_Process_Temp_1" name="v_Air_Process_Temp" />Mpa,
         		保压<s:textfield cssClass="span3 inputClass" id="v_Air_Process_Temp_2" name="v_Air_Process_Temp" style="width:28%"/>min；
			</td>
		</tr>
		<tr>
         	<td colspan="4">
         		检验容器及连接部位<s:textfield cssClass="span3 inputClass" id="v_Air_Process_Temp_3" name="v_Air_Process_Temp" />泄漏，
         		<s:textfield cssClass="span3 inputClass" id="v_Air_Process_Temp_4" name="v_Air_Process_Temp" />异常现象。
			</td>
			<td>
				<s:hidden cssClass=" inputClass" name="v_Air_Process" />
			</td>
		</tr>
        <tr>
         	<td>试验结果</td>
         	<td colspan="3">
         	    <s:radio name="v_Air_Result" list="{'合格','不合格'}"></s:radio>
         	</td>
         </tr>
         <tr>
         	<td>备注</td>
         	<td colspan="3">
         	<s:textarea name="v_Air_Remark" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
          <tr>
            <td >检验</td>
            <td >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Air_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td >校对</td>
            <td >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Air_Check_Date"/>
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
  