<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>耐压试验记录 </title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>  
   		 <script type="text/javascript">
			$(function () {
				mutilInputToOne("v_Pre_Process");
				
	 		});
		</script> 	 				
	<style type="css/"></style>
	
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselPreTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="4" id="center"><b>耐压试验记录 </b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
         	<td>设计压力</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_De" />MPa
			</td>
         	<td>允许/监控使用压力</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_Permission" />MPa
			</td>   	
         </tr>
         
          <tr>
         	<td>试验压力</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_Test_Pre" />MPa
			</td>
         	<td>主体材质</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_De_Main_Mat" />
			</td>   	
         </tr>
   
         		
		  <tr>
         	<td>试验介质</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_Med" />
			</td>
         	<td>介质温度</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_Med_Tem" />℃
			</td>   	
         </tr>
   
		<tr>
         	<td>试压部位</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_Part" />
			</td>
         	<td>环境温度</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_Tem" />℃
			</td>   	
         </tr>
		
		
		  <tr>
         	<td>压力表</td>
         	<td >
         		量程<s:textfield cssClass="span3 inputClass"  name="v_Pre_Range"/>Mpa
         		精度<s:textfield cssClass="span3 inputClass"  name="v_Pre_Acc"/>级
			</td>
         	<td>机泵型号</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_Type" />
			</td>   	
         </tr>
   	
		
		  <tr>
         	<td>试验前应力校核结果</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"  name="v_Pre_Check_Stress" />
			</td>
          	
         </tr>

          <tr>
         	<td colspan="4">试验程序记录</td>
		</tr>
         
         <tr>
         	<td colspan="4">
         		缓慢升压至试验压力<s:textfield cssClass="span3 inputClass"  id="v_Pre_Process_Temp_1" name="v_Pre_Process_Temp"/>Mpa,
         		保压<s:textfield cssClass="span3 inputClass" id="v_Pre_Process_Temp_2"  name="v_Pre_Process_Temp" />min；
			</td>
		</tr>
		<tr>
         	<td colspan="4">
         		缓慢降压至最高工作压力<s:textfield cssClass="span3 inputClass" id="v_Pre_Process_Temp_3"  name="v_Pre_Process_Temp"/>Mpa,
         		保压<s:textfield cssClass="span3 inputClass" id="v_Pre_Process_Temp_4"   name="v_Pre_Process_Temp" />min；
			</td>
		</tr>
		<tr>
         	<td colspan="4">
         		检验容器<s:textfield cssClass="inputClass" id="v_Pre_Process_Temp_5"  name="v_Pre_Process_Temp"/>渗漏，
         		<s:textfield cssClass="span3 inputClass" id="v_Pre_Process_Temp_6"   name="v_Pre_Process_Temp" />可见的变形，
         		<s:textfield cssClass="span3 inputClass" id="v_Pre_Process_Temp_7"  name="v_Pre_Process_Temp" />异常的响声。
			</td>
			<td>
				<s:hidden cssClass=" inputClass" name="v_Pre_Process" />
			</td>
         </tr>
         <tr>
         	<td>试验结果</td>
         	<td colspan="3">
         	   <s:radio name="v_Pre_Result" list="{'合格','不合格'}"></s:radio>
         	</td>
         </tr>
  	 	 <tr>
            <td colspan="1" width="20%">分析</td>
            <td colspan="1" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Pre_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="1" width="20%">校对</td>
            <td colspan="1" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Pre_Check_Date"/>
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
  