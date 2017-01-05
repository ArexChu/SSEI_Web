<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>硬度检测记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/tableCreater.js"></script> 		
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselHardTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
		<s:hidden id="tablevalue" name="v_Hard_Value"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>硬度检测记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
          <tr>
         	<td>检测仪器型号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Hard_Equ_Mode" />
			</td>
         	<td>检测仪器编号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Hard_Equ_ID" />
			</td>   	
         </tr>
         
          <tr>
         	<td>主体材质</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Hard_Mat" />
			</td>
         	<td>热处理状态</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Hard_Heat" />
			</td>   	
         </tr>

		
		  <tr>
         	<td>检测标准</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Hard_Cri" />
			</td>
         	<td>硬度单位</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Hard_Unit" />
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
	          	<td >测点编号</td>
	          	<td >测点硬度</td>
	          	<td >测点位置</td>
	          	<td >测点编号</td>
	          	<td >测点硬度</td>
	          	<td >测点位置</td>
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
         	<td>检测结果</td>
         	<td colspan="5" >
         	<s:textarea name="v_Hard_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
		 <tr>
            <td colspan="1" width="20%">检验</td>
            <td colspan="2" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Hard_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="1" width="20%">校对</td>
            <td colspan="2" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Hard_Check_Date"/>
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
  