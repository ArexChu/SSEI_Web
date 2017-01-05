<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>磁粉检测记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	 	 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/tableCreater.js"></script> 		
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselMagneticTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
		<s:hidden id="tablevalue" name="v_Mag_Value"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>磁粉检测记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
         	<td>检测仪器型号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Mag_Equ_Model" />
			</td>
         	<td>检测仪器编号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Mag_Equ_ID" />
			</td>   	
         </tr>
         
          <tr>
         	<td>磁粉类型</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Mag_Mod" />
			</td>
         	<td>磁 悬 液</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mag_Sus" />
			</td>   	
         </tr>
   
         		
		  <tr>
         	<td>灵敏度试片</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mag_Sens" />
			</td>
         	<td>磁化方法</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mag_Method" />
			</td>   	
         </tr>
   
		
		  <tr>
         	<td>提升力/磁化电流</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mag_Cur" />
			</td>
         	<td>喷洒方法</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mag_Spr" />
			</td>   	
         </tr>
		 <tr>
         	<td>检测标准</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mag_Cri" />
			</td>
         	<td>检测比例、长度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mag_Len" />
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
	          	<td >区段编号</td>
	          	<td >缺陷位置</td>
	          	<td >缺陷磁痕尺寸(mm)</td>
	          	<td >缺陷性质</td>
	          	<td >评定</td>
	          	<td >备注</td>
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
         	<s:textarea name="v_Mag_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
		 <tr>
            <td colspan="1" width="20%">评片</td>
            <td colspan="2" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Mag_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="1" width="20%">校对</td>
            <td colspan="2" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Mag_Check_Date"/>
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
  