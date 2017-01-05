<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>射线检测记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	 	 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/tableCreater.js"></script> 		
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselRadioTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
		<s:hidden id="tablevalue" name="v_Radio_value"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>射线检测记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
   <tr>
         	<td>源种类</td>
         	<td colspan="2">
         	    <s:radio name="v_Radio_Type" list="{'X射线','Ir192','Co60','其他'}"></s:radio>
			</td>
         	<td>增感方式</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Radio_Sen_Mode"/>
			</td>   	
         </tr>
         
          <tr>
         	<td>探伤机型号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Radio_Det" />
			</td>
         	<td>仪器编号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Radio_Equ_ID" />
			</td>   	
         </tr>
   
         		
		  <tr>
         	<td>管电压/源活度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Radio_Tube_Voltage" />KV/Ci
			</td>
         	<td>管电流</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Tube_Current" />mA
			</td>   	
         </tr>
   
		
		  <tr>
         	<td>象质计型号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Iqi_Mod" />
			</td>
         	<td>象质计指数</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Iqi_Coe" />
			</td>   	
         </tr>
   	
		
		  <tr>
         	<td>透照方式</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Tran_Mode" />
			</td>
         	<td>曝光时间</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Expo" />min
			</td>   	
         </tr>
		 <tr>
         	<td>焦   距</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Focal_Dis" />min
			</td>
         	<td>焦点尺寸</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Focal_Size" />min
			</td>   	
         </tr>
		 <tr>
         	<td>胶片类型</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Film_Type" />
			</td>
         	<td>底片黑度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Film_Density" />
			</td>   	
         </tr>
		 <tr>
         	<td>检测标准</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Cri" />
			</td>
         	<td>检测比例、长度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"   name="v_Radio_Ration" />
			</td>   	
         </tr>
         <tr>
         	<td colspan="6">检 测 底 片 评 定 表</td>
		 </tr>
         <tr>
 	    <td colspan="100%">					
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
	         	<td>底片编号</td>
	         	<td>一次透照长度(mm)</td>
	         	<td>缺陷位置</td>
	         	<td>缺陷性质及缺陷尺寸(mm)</td>
	         	<td>评定</td>
	         	<td>备注</td>
	        </tr>  
            <tr style="display:none">
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            	<td ><input class="span2 inputClass" type="text"  /></td>
            </tr>
         </tbody>            
    	<tr>
         	<td>评片结果</td>
         	<td colspan="5" >
         	<s:textarea name="v_Radio_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
         
         <tr>
         	<td colspan="1">检测人员</td>
         	<td colspan="2">
         			<s:textfield cssClass="span2 inputClass" name="v_Radio_Per" />
         	</td>
         	<td colspan="1">检测时间</td>
         	<td colspan="2" >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Radio_Per_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>
		 <tr>
		 	<td colspan="1">评片</td>
         	<td colspan="2" >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Radio_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         	<td colspan="1">校对</td>
         	<td colspan="2" >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Radio_Check_Date"/>
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
  