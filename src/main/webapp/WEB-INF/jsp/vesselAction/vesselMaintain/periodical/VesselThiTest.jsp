<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>壁厚测定记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/tableCreater.js"></script> 	
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselThiTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
		<s:hidden id="tablevalue" name="v_Thi_Value"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="12" id="center"><b>壁厚测定记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
  		<tr>
         	<td colspan="3">测量仪器型号</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Equ_Mod" />
         	</td>
         	<td colspan="3">测量仪器编号</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Equ_ID" />
			</td>
         </tr>
         
         <tr>
         	<td colspan="3">测量仪器精度</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Equ_Acc" />
         	</td>
         	<td colspan="3">耦 合 剂</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Coup" />
			</td>
         </tr>
         
          <tr>
         	<td rowspan="2">公称厚度</td>
         	<td>筒体</td>
         	<td colspan="4">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Barrel" />mm
         	</td>
         	<td rowspan="2">实测最小壁厚</td>
         	<td>筒体</td>
         	<td colspan="4">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Min_Barrel" />mm
			</td>
         </tr>
         
          <tr>
         	<td>封头</td>
         	<td colspan="4">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Seal" />mm
         	</td>
         	<td>封头</td>
         	<td colspan="4">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Min_Seal" />mm
			</td>
         </tr>
         
           <tr>
         	<td colspan="1">表面状况</td>
         	<td colspan="5">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Surface" />
         	</td>
         	<td colspan="1">实测点数</td>
         	<td colspan="5">
         		<s:textfield cssClass="span2 inputClass" name="v_Thi_Num" />
			</td>
        </tr>
   		<tr>
   			<td colspan="12">测厚记录</td>
   		</tr>
   		<tr>
   		    <td colspan="12">					
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
	   			<td>测点编号</td>
	   			<td>测点厚度(mm)</td>
	   			<td>测点编号</td>
	   			<td>测点厚度(mm)</td>
	   			<td>测点编号</td>
	   			<td>测点厚度(mm)</td>
	   			<td>测点编号</td>
	   			<td>测点厚度(mm)</td>
	   			<td>测点编号</td>
	   			<td>测点厚度(mm)</td>
	   			<td>测点编号</td>
	   			<td>测点厚度(mm)</td>
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
         	<td>测定结果</td>
         	<td colspan="11">
         	   	<s:radio name="v_Thi_Result" list="{'合格','不合格'}"></s:radio>
         	</td>
         </tr>
         <tr>
            <td colspan="3">检验</td>
            <td colspan="3">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Thi_Test_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="3">校对</td>
            <td colspan="3">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Thi_Proo_Date"/>
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
  