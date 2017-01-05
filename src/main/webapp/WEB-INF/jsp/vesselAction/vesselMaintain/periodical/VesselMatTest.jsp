<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>材料成分分析记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	 	 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/tableCreater.js"></script> 
	 	  <script type="text/javascript">
			$(function () {
				mutilInputToOne("v_Mat_Ele");
	 		});
		</script>	 
	 	 	
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselMatTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
		<s:hidden id="tablevalue" name="v_Mat_Value"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="12" id="center"><b>材料成分分析记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
          <tr>
         	<td colspan="3" >取样方法</td>
         	<td colspan="3" >
         		<s:textfield cssClass="span2 inputClass" name="v_Mat_Samp_Method" />
			</td>
         	<td colspan="3" >检测部位</td>
         	<td colspan="3" >
         		<s:textfield cssClass="span2 inputClass" name="v_Mat_Part" />
			</td>   	
         </tr>
         
         
          <tr>
         	<td colspan="3">仪器型号</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="v_Mat_Equ_Mode" />
			</td>
         	<td colspan="3">仪器编号</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="v_Mat_Equ_ID" />
			</td>   	
         </tr>
          <tr>
         	<td colspan="3">分析方法</td>
         	<td colspan="3">
         		<s:radio name="v_Mat_Ana_Method" list="{'化学','光谱'}"></s:radio>
			</td>
         	<td colspan="3">分析方法标准</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="v_Mat_Ana_Cri" />
			</td>   	
         </tr>
         <tr>
   		    <td colspan="10">					
			<div class="btn btn-mini btn-primary reverse table_add">
				添加一行
			</div>
			<div class="btn btn-mini btn-primary reverse table_delete">
				删除一行
			</div>
		    </td>
		 </tr>
         <tr>
         	<td rowspan="2">序号</td>
         	<td rowspan="2">取样位置</td>
         	<td rowspan="2">标称材质</td>
         	<td colspan="8">元素及含量 （%）</td>
         	<td rowspan="2">备注</td>
         </tr>
         <tr>
         	<td >
         		<s:textfield cssClass="span2 inputClass" id="v_Mat_Ele_Temp_1" style="width:50px" name="v_Mat_Ele_Temp" />
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" id="v_Mat_Ele_Temp_2" style="width:50px" name="v_Mat_Ele_Temp" />
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" id="v_Mat_Ele_Temp_3" style="width:50px" name="v_Mat_Ele_Temp" />
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" id="v_Mat_Ele_Temp_4" style="width:50px" name="v_Mat_Ele_Temp" />
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" id="v_Mat_Ele_Temp_5" style="width:50px" name="v_Mat_Ele_Temp" />
         	</td>
         		<td>
         		<s:textfield cssClass="span2 inputClass" id="v_Mat_Ele_Temp_6" style="width:50px" name="v_Mat_Ele_Temp" />
         	</td>
         		<td>
         		<s:textfield cssClass="span2 inputClass" id="v_Mat_Ele_Temp_7" style="width:50px" name="v_Mat_Ele_Temp" />
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" id="v_Mat_Ele_Temp_8" style="width:50px" name="v_Mat_Ele_Temp" />
         	</td>
         	<td>
         		<s:hidden cssClass="inputClass" name="v_Mat_Ele"  />
         	</td>	
         </tr>
  
        <tbody class="tableValue">
	   		<tr>
	   			<td> </td>
	   			<td></td>
	   			<td></td>
	   			<td></td>
	   			<td></td>
	   			<td> </td>
	   			<td> </td>
	   			<td> </td>
	   			<td> </td>
	   			<td> </td>
	   			<td> </td>
	   			<td> </td>
	   		</tr>    
            <tr style="display:none">
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            </tr>
         </tbody>   

  		<tr>
         	<td>分析结果</td>
         	<td colspan="11">
         	<s:textarea name="v_Mat_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
          <tr>
            <td colspan="3">分析</td>
            <td colspan="3">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Mat_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="3">校对</td>
            <td colspan="3">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Mat_Check_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>                   
         <tr>
        	<td colspan="12">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 

    </table>
    </s:form>
</body>
</html>
  