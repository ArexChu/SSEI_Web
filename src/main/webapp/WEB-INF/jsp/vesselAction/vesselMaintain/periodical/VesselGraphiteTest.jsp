<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>石墨压力容器定期检验记录附页 </title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselGraphiteTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>石墨压力容器定期检验记录附页 </b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
          <tr>
         	<td>序号</td>
         	<td colspan="5"> 检    验    项    目</td>
         	<td colspan="2">检验结果</td>
         	<td colspan="2">备注</td>
         </tr>
         
          <tr>
         	<td>1</td>
         	<td colspan="5"> 铭牌和标志检验</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Grap_Result1" />
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Grap_Remark1" />
         	</td>
         </tr>
         
         
         <tr>
         	<td>2</td>
         	<td rowspan="3">表面检验</td>
         	<td colspan="4">容器筒体、侧盖板、上下盖板变形与腐蚀 </td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Grap_Result2" />
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Grap_Remark2" />
         	</td>
         	
         </tr>
         
         <tr>
         	<td>3</td>
         	<td colspan="4">石墨件表面腐蚀、磨损、分层、掉块、裂纹</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Grap_Result3" />
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Grap_Remark3" />
         	</td>
         </tr>
         
         
          <tr>
         	<td>4</td>
         	<td colspan="4">石墨件粘接部位的粘接剂，粘接部位腐蚀、开裂和渗漏</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="v_Grap_Result4" />
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Grap_Remark4" />
         	</td>
         </tr>
         
          <tr>
         	<td>5</td>
         	<td colspan="5">法兰密封面检验</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Grap_Result5" />
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Grap_Remark5" />
         	</td>
         	
         </tr>
         
         <tr>
         	<td>6</td>
         	<td colspan="5">附件检验（阀门、压力表、液面计、温度计、防腐层） </td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Grap_Result6" />
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Grap_Remark6" />
         	</td>
         </tr>
         <tr>
         	<td>说明</td>
         	<td colspan="9">
         	<s:textarea name="v_Grap_Explain" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
  		 <tr>
            <td colspan="2" width="20%">检验</td>
            <td colspan="3" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Grap_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="2" width="20%">校对</td>
            <td colspan="3" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Grap_Check_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>                     
         <tr>
        	<td colspan="10">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 

    </table>
    </s:form>
</body>
</html>
  