<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>资料审查及外观检查记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselCheckTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="10" id="center"><b>资料审查及外观检查记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
         
        <tr>
         	<td colspan="2">检查项目</td>
         	<td colspan="2">结果</td>
         	<td colspan="1">备注</td>
         	<td colspan="2">检查项目</td>
         	<td colspan="2">结果</td>
         	<td colspan="1">备注</td>
         </tr>
         
         <tr>
         	<td colspan="2">铭牌</td>
         	<td colspan="2">
         		<s:radio name="v_Che_1" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_1_Remark" cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td colspan="2">堆焊层质量</td>
         	<td colspan="2">
         		<s:radio name="v_Che_2" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_2_Remark" cssClass="span2 inputClass"></s:textfield>	</td>
         </tr>
         
         <tr>
         	<td colspan="2">内表面质量</td>
         	<td colspan="2">
         		<s:radio name="v_Che_3" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_3_Remark" cssClass="span2 inputClass"></s:textfield>	</td>
         	<td colspan="2">支承的型式与布置</td>
         	<td colspan="2">
         		<s:radio name="v_Che_4" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         	<s:textfield name="v_Che_4_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         <tr>
         	<td colspan="2">外表面质量</td>
         	<td colspan="2">
         		<s:radio name="v_Che_5" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_5_Remark" cssClass="span2 inputClass"></s:textfield></td>
         	<td colspan="2">排放装置的设置</td>
         	<td colspan="2">
         		<s:radio name="v_Che_6" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         	<s:textfield name="v_Che_6_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         
         <tr>
         	<td colspan="2">焊缝余高</td>
         	<td colspan="2">
         		<s:radio name="v_Che_7" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_7_Remark" cssClass="span2 inputClass"></s:textfield></td>
         	<td colspan="2">基础开裂倾斜</td>
         	<td colspan="2">
         		<s:radio name="v_Che_8" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_8_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         
         
         <tr>
         	<td colspan="2">焊缝错边</td>
         	<td colspan="2">
         		<s:radio name="v_Che_9" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_9_Remark" cssClass="span2 inputClass"></s:textfield>	</td>
         	<td colspan="2">防腐质量</td>
         	<td colspan="2">
         		<s:radio name="v_Che_10" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_11_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         <tr>
         	<td colspan="2">焊缝咬边</td>
         	<td colspan="2">
         		<s:radio name="v_Che_11" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_11_Remark" cssClass="span2 inputClass"></s:textfield></td>
         	<td colspan="2">绝热质量</td>
         	<td colspan="2">
         		<s:radio name="v_Che_12" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_12_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         
         <tr>
         	<td colspan="2">焊缝棱角度</td>
         	<td colspan="2">
         		<s:radio name="v_Che_13" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_13_Remark" cssClass="span2 inputClass"></s:textfield></td>
         	<td colspan="2">衬里质量</td>
         	<td colspan="2">
         		<s:radio name="v_Che_14" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_14_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         
         
         <tr>
         	<td colspan="2">封头型式</td>
         	<td colspan="2">
         		<s:radio name="v_Che_15" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_15_Remark" cssClass="span2 inputClass"></s:textfield></td>
         	<td colspan="2">地脚螺栓</td>
         	<td colspan="2">
         		<s:radio name="v_Che_16" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_16_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         <tr>
         	<td colspan="2">封头与筒体的连接</td>
         	<td colspan="2">
         		<s:radio name="v_Che_17" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_17_Remark" cssClass="span2 inputClass"></s:textfield></td>
         	<td colspan="2">卧式容器的支座膨胀孔</td>
         	<td colspan="2">
         		<s:radio name="v_Che_18" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_18_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         
         <tr>
         	<td colspan="2">开孔位置及补强</td>
         	<td colspan="2">
         		<s:radio name="v_Che_19" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_19_Remark" cssClass="span2 inputClass"></s:textfield></td>
         	<td colspan="2">水平度或者铅垂度</td>
         	<td colspan="2">
         		<s:radio name="v_Che_20" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_20_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         <tr>
         	<td colspan="2">焊缝的布置及型式</td>
         	<td colspan="2">
         		<s:radio name="v_Che_21" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_20_Remark" cssClass="span2 inputClass"></s:textfield></td>
         	<td colspan="2">快开门安全联锁装置</td>
         	<td colspan="2">
         		<s:radio name="v_Che_22" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_22_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         <tr>
         	<td colspan="2">法兰、密封面及其紧固螺栓</td>
         	<td colspan="2">
         	<s:radio name="v_Che_23" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         	<s:textfield name="v_Che_23_Remark" cssClass="span2 inputClass"></s:textfield>	</td>
         	<td colspan="2">静电接地</td>
         	<td colspan="2">
         		<s:radio name="v_Che_24" list="{'无', '合格 ','不合格'}"></s:radio>
         	</td>
         	<td colspan="1" >
         		<s:textfield name="v_Che_24_Remark" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         <tr>
         	<td colspan="2">需要说明情况
         	</td>
         
         	<td colspan="8" height="200px">
         		<s:textarea name="v_Che_Explan" cssClass="span2 inputClass" style="height:190px"/>
         	</td>

         	
         </tr>
         <tr>
         	<td colspan="2">结论
         	</td>
         	<td colspan="8" height="200px">
         		<s:textarea name="v_Che_Result" cssClass="span2 inputClass" style="height:190px"/>
       
         	</td>
         </tr>
         
         <tr>
         	<td colspan="2">检验</td>
         	<td colspan="3">
         		<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Che_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            	</div>
         	  	</td>
         	<td colspan="2">校对</td>
         	<td colspan="3">
         		<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Che_Che_Date"/>
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
  