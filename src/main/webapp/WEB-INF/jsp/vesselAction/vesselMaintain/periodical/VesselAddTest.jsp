<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>附加检验记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselAddTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>附加检验记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
         	<td colspan="6">导  静  电  装  置  检  验</td>
        </tr>
        <tr>
         	<td width="20%">测试仪器型号</td>
         	<td colspan="2" width="30%">
         		<s:textfield cssClass="span2 inputClass" name="v_Sta_Ele_ID"/>
			</td>
         	<td  width="20%">仪器精度</td>
         	<td colspan="2" width="30%">
         		<s:textfield cssClass="span2 inputClass" name="v_Sta_Ele_Acc" />
			</td>   	
         </tr>
         <tr>
         	<td>导静电电阻</td>
         	<td colspan="2">
      			<s:textfield cssClass="span2 inputClass" name="v_Sta_Ele_Res" />Ω
			</td>
         	<td>连接处电阻</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Sta_Ele_Connection" />Ω
			</td>   	
         </tr>
         <tr>
         	<td colspan="6">绝 热 层 真 空 度 检 测</td>
         </tr>
           <tr>
         	<td>真空仪型号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Add_Ins_Type" />
			</td>
         	<td>仪器精度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Add_Ins_Acc" />
			</td>   	
         </tr>   
         <tr>
         	<td>空载时真空度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Add_Ins_Degree" />Pa
			</td>
         	<td>承载时真空度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Add_Ins_Degree1" />Pa
			</td>   	
         </tr>
         <tr>
         	<td colspan="6">绝 热 层 真 空 度 检 测</td>
         </tr>
         <tr>
         	<td>真空泵型号</td>
         	<td colspan="2" >
         		<s:textfield cssClass="span2 inputClass" name="v_Tank_Type" />
			</td>
         	<td>抽真空时间</td>
         	<td colspan="2" >
         		<s:textfield cssClass="span2 inputClass" name="v_Tank_Time" />h
			</td>  	
         </tr>  
         <tr>
         	<td>置换介质</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Tank_Med" />
			</td>
         	<td>置换压力</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Tank_Pre" />
			</td>   	
         </tr>
         <tr>
         	<td>排放后罐内压力</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Tank_Discharge_Pre" />MPa
			</td>
         	<td>罐内气体含氧量(≤3%)</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Tank_Content" />
			</td>   	
          </tr>
          <tr>
			<td >罐内真空度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Tank_Degree" />Pa
			</td> 
         	<td></td>
         	<td colspan="2"></td>
         </tr>   
         <tr>
         	<td colspan="6">腐 蚀 介 质 含 量 测 定</td>
         </tr>
         <tr>
         	<td>介质名称</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Cor_Name" />
			</td>
         	<td>腐蚀介质成分</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Cor_Compon" />
			</td>   	
         </tr>
         <tr>
         	<td>腐蚀介质含量</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Cor_Content" />%
			</td>
         	<td>腐蚀速度</td>
         	<td colspan="2" >
         		<s:textfield cssClass="span2 inputClass" name="v_Cor_Speed" />mm/y
			</td>   	
         </tr>
         <tr>
			<td>腐蚀机理</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Cor_Reason" />
			</td>   
			<td></td>
			<td colspan="2"></td>	
         </tr>
         <tr>
         	<td>其他检验、检测</td>
         	<td colspan="5" >
         	<s:textarea name="v_Add_Others" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
         <tr>
         	<td>试验结果</td>
         	<td colspan="5">
         		<s:radio name="v_Add_Result" list="{'合格','不合格'}"></s:radio>
         	</td>
         </tr>
         <tr>
            <td >检验</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Add_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td >校对</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Add_Check_Date"/>
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
  