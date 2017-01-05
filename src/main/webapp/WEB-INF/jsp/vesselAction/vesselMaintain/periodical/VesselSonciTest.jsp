<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>声发射检测记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselSonciTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>声发射检测记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
   		<tr>
         	<td>检测标准</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Cri" />
			</td>
         	<td>试验压力</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Pre" />MPa
			</td>  
			<td>仪器型号</td>
			<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Equ_Type" />
			</td>   	
         </tr>
         <tr>
         	<td>检测方式</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Method" />
			</td>
         	<td>检测频率</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Fre" />
			</td>  
			<td>仪器编号</td>
			<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Equ_ID" />
			</td>   	
          </tr>
          <tr>
         	<td>传感器型号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Sensor" />
			</td>
         	<td>固定方式</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Fixed_Mode" />
			</td>  
			<td>耦合剂</td>
			<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Coup" />
			</td>   	
         </tr>
         <tr>
         	<td>传感器数量</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Sensor_Num" />
			</td>
         	<td>传感器平均灵敏度</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Sensor_Sens" />DB
			</td>  
			<td>最大灵敏度</td>
			<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Sensor_Max" />DB
			</td>   	
         </tr>
         <tr>
         	<td>背景噪声</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Noise" />DB
			</td>
         	<td>门槛电平</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Thr" />DB
			</td>  
			<td>最小灵敏度</td>
			<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Sensor_Min" />DB
			</td>   	
         </tr>
         <tr>
         	<td>增   益</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Gain" />DB
			</td>
         	<td>模拟源</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Source" />
			</td>  
			<td>传感器最大间距</td>
			<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Sensor_Dis" />mm
			</td>   	
         </tr>
         <tr>
         	<td>模拟源距离</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Source_Dis" />m
			</td>
         	<td>衰减测量传感器号</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Sensor_ID" />
			</td>  
			<td>信号幅度</td>
			<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Sonic_Amp" />DB
			</td>   	
         </tr>
         <tr>
         	<td>检测结果及评定</td>
         	<td colspan="5">
         	<s:textarea name="v_Sonic_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
  	 	 <tr>
            <td colspan="1">检测</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Sonic_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="1">校对</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Sonic_Check_Date"/>
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
  