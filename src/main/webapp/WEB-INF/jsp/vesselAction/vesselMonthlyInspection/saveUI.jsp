<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器月度检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <style type="text/css">
			label {
				display: inline;
			}
		</style>
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>容器月度检验</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span>
    
    
	<s:form  id="saveUI" action="vesselMonthlyInspection_%{id == 0 ? 'add' : 'edit'}" >
		<s:hidden name="id"></s:hidden>
    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="7" id="center"><b>容器月度检验</b> <a id="startEdit" >修改</a></td>
            	</tr>
            	
        	</thead>
         	<tbody>
         	
         	<tr>
         		<td colspan="1">产品编号</td>
         		<td colspan="6">
         			<s:textfield name ="vesselBasic.v_Product_ID" cssClass="inputClass required" readonly="true"/>
         		</td>
			</tr>
         	
         	<tr>
         		<td colspan="5">检验项目</td>
         		<td colspan="1">检验结果</td>
         		<td colspan="1">备注</td>
			</tr>
			
			<tr>
         		<td  rowspan="3">操作工况安全</td>
         		<td colspan="4">工作温度（有无超温）</td>
         		<td >
         			<s:textfield name ="v_Result_1" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_1" cssClass="span2 inputClass"/>
				</td>
			</tr>
			<tr>
         		<td colspan="4">工作压力（有无超压））</td>
         		<td >
         			<s:textfield name ="v_Result_2" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_2" cssClass="span2 inputClass"/>
				</td>
			</tr>
			<tr>
         		<td colspan="4">工作介质（有无异常）</td>
         		<td >
         			<s:textfield name ="v_Result_3" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_3" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
         		<td  rowspan="7">安全附件</td>
         		<td colspan="4">安全阀</td>
         		<td >
         			<s:textfield name ="v_Result_4" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_4" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
         		<td colspan="4">爆破片</td>
         		<td >
         			<s:textfield name ="v_Result_5" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_5" cssClass="span2 inputClass"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">紧急切断装置</td>
         		<td >
         			<s:textfield name ="v_Result_6" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_6" cssClass="span2 inputClass"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">压力表</td>
         		<td >
         			<s:textfield name ="v_Result_7" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_7" cssClass="span2 inputClass"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">温度计</td>
         		<td >
         			<s:textfield name ="v_Result_8" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_8" cssClass="span2 inputClass"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">液位计</td>
         		<td >
         			<s:textfield name ="v_Result_9" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_9" cssClass="span2 inputClass"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">其他附件</td>
         		<td >
         			<s:textfield name ="v_Result_10" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_10" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
         		<td  rowspan="10">壳体外观检查</td>
         		<td colspan="4">铭牌和标志</td>
         		<td >
         			<s:textfield name ="v_Result_11" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_11" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">内外表面的腐蚀</td>
         		<td >
         			<s:textfield name ="v_Result_12" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_12" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">裂纹、泄漏、鼓包、变形、机械接触损伤、过热</td>
         		<td >
         			<s:textfield name ="v_Result_13" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_13" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">工卡具焊迹、电弧灼伤</td>
         		<td >
         			<s:textfield name ="v_Result_14" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_14" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">密封紧固件</td>
         		<td >
         			<s:textfield name ="v_Result_15" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_15" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			
			<tr>
				<td colspan="4">支承、支座或者基础的下沉、倾斜、开裂</td>
         		<td >
         			<s:textfield name ="v_Result_16" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_16" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">地脚螺栓</td>
         		<td >
         			<s:textfield name ="v_Result_17" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_17" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">直立容器和球形容器支柱的铅垂度</td>
         		<td >
         			<s:textfield name ="v_Result_18" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_18" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			
			<tr>
				<td colspan="4">多支座卧式容器的支座膨胀孔</td>
         		<td >
         			<s:textfield name ="v_Result_19" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_19" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			
			<tr>
				<td colspan="4">排放（疏水、排污）装置和泄漏信号指示孔的堵塞、腐蚀、沉积物</td>
         		<td >
         			<s:textfield name ="v_Result_20" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_20" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
         		<td  rowspan="3">隔热层、衬里检查</td>
         		<td colspan="4">隔热脱落、潮湿及层下腐蚀、裂纹</td>
         		<td >
         			<s:textfield name ="v_Result_21" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_21" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">衬里层的破损、腐蚀、裂纹、脱落及检查孔介质流出情况</td>
         		<td >
         			<s:textfield name ="v_Result_22" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_22" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">堆焊层的腐蚀、裂纹、剥离和脱落</td>
         		<td >
         			<s:textfield name ="v_Result_23" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_23" cssClass="span2 inputClass"/>
				</td>
			</tr> 
			
			<tr>
         		<td  rowspan="2">其他检查</td>
         		<td colspan="4">夹层真空度</td>
         		<td >
         			<s:textfield name ="v_Result_24" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_24" cssClass="span2 inputClass"/>
				</td>
			</tr>
			 
			<tr>
				<td colspan="4">日蒸发率</td>
         		<td >
         			<s:textfield name ="v_Result_25" cssClass="span2 inputClass "/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_25" cssClass="span2 inputClass "/>
				</td>
			</tr> 
			
			<tr>
         		<td colspan="1">存在的其他问题及整改要求</td>
         		<td colspan="6">
         			<s:textarea name="v_Problem" cssClass="span2 inputClass" style="height:80px"/>
         		</td>
			</tr>
			
			<tr>
         		<td colspan="1">检验人员</td>
         		<td colspan="3">
         			<s:textfield name ="v_Persion" cssClass="inputClass"/>
         		</td>
         		<td colspan="1">检验时间</td>
         		<td colspan="2">
         			<div class="input-append">
	                   	<s:textfield  cssClass="datepicker inputClass" name="v_Date"/>
	                   	<span class="add-on"><i class="icon-calendar"></i></span>
	                </div>
         		</td>
			</tr>
			         	
          	<tr>
            	<td colspan="7">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                     <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
            </tr> 
         </tbody> 
   	  </table>
  </s:form>
</body>
</html>

