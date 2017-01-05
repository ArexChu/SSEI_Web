<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>超声检测记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	 	 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/tableCreater.js"></script> 	
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselUltrasonicTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
		<s:hidden id="tablevalue" name="v_Ult_Value"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="8" id="center"><b>超声检测记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
   		<tr>
         	<td colspan="2">检测仪器型号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Inst_Model" />
			</td>
         	<td colspan="2">检测仪器编号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Inst_ID" />
			</td>   	
         </tr>
         <tr>
         	<td colspan="2">探头型号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Head_Type" />
			</td>
         	<td colspan="2">试块型号及编号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Block_Type" />
			</td>   	
         </tr>
         <tr>
         	<td colspan="2">评定灵敏度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Eva_Sens" />dB
			</td>
         	<td colspan="2">检测方法/扫查面</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Det_Method" />
			</td>   	
         </tr>
         
         
         <tr>
         	<td colspan="2">耦 合 剂</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Coup" />
			</td>
         	<td colspan="2">补    偿</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Compen" />dB
			</td>   	
         </tr>
         
         
         <tr>
         	<td colspan="2">检测标准</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Det_Cri" />
			</td>
         	<td colspan="2">检测比例、长度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ult_Det_Ration" />
			</td>   	
         </tr>
         <tr>
         	<td colspan="8">检 测 结 果 评 定 表</td>
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
        <tbody class="tableValue">
	   		<tr>
	         	<td>区段编号</td>
	         	<td>缺陷位置</td>
	         	<td>缺陷埋藏深度(mm)</td>
	         	<td>缺陷指示长度(mm)</td>
	         	<td>缺陷高度(mm)</td>
	         	<td>缺陷反射波幅</td>
	         	<td>评定级别</td>
	         	<td>备注</td>
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
            </tr>
         </tbody>    
  		<tr>
         	<td>检测结果</td>
         	<td colspan="7" >
         	<s:textarea name="v_Ult_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
         <tr>
            <td colspan="2">检验</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Ult_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="2">校对</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Ult_Check_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>                      
         <tr>
        	<td colspan="8">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 

    </table>
    </s:form>
</body>
</html>
  