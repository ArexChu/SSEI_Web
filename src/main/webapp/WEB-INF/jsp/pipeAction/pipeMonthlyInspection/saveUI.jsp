<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道月度检验</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <style type="text/css">
			label {
				display: inline;
			}
		</style>
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道月度检验</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span>
    
    
	<s:form  id="saveUI" action="pipeMonthlyInspection_%{id == 0 ? 'add' : 'edit'}" >
		<s:hidden name="id"></s:hidden>
    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="7" id="center"><b>管道月度检验</b> <a id="startEdit" >修改</a></td>
            	</tr>
            	
        	</thead>
         	<tbody>
         	
         	<tr>
         		<td colspan="1">管道系统</td>
         		<td colspan="6">
         			<s:textfield name ="pipeBasic.p_Sys" cssClass="inputClass required" readonly="true"/>
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
         		<td colspan="4">爆破片装置</td>
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
				<td colspan="4">阻火器</td>
         		<td >
         			<s:textfield name ="v_Result_9" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_9" cssClass="span2 inputClass"/>
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
				<td colspan="4">其他附件</td>
         		<td >
         			<s:textfield name ="v_Result_10" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_10" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
         		<td  rowspan="11">管道外观检查</td>
         		<td colspan="4">管道及其组成件是否有泄漏</td>
         		<td >
         			<s:textfield name ="v_Result_11" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_11" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">管道绝热层是否完好</td>
         		<td >
         			<s:textfield name ="v_Result_12" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_12" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">管道防腐层是否完好</td>
         		<td >
         			<s:textfield name ="v_Result_13" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_13" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">管道有无异常振动</td>
         		<td >
         			<s:textfield name ="v_Result_14" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_14" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">密封紧固件是否完好</td>
         		<td >
         			<s:textfield name ="v_Result_15" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_15" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			
			<tr>
				<td colspan="4">管道是否存在挠曲、下沉及异常变形</td>
         		<td >
         			<s:textfield name ="v_Result_16" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_16" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">支吊架是否完好</td>
         		<td >
         			<s:textfield name ="v_Result_17" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_17" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="4">阀门是否完好</td>
         		<td >
         			<s:textfield name ="v_Result_18" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_18" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			
			<tr>
				<td colspan="4">管道标识情况</td>
         		<td >
         			<s:textfield name ="v_Result_19" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_19" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			
			<tr>
				<td colspan="4">膨胀节有无异常</td>
         		<td >
         			<s:textfield name ="v_Result_20" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_20" cssClass="span2 inputClass"/>
				</td>
			</tr>
			<tr>
         		<td colspan="4">静电接地是否完好</td>
         		<td >
         			<s:textfield name ="v_Result_21" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_21" cssClass="span2 inputClass"/>
				</td>
			</tr>
			
			
			<tr>
         		<td  rowspan="2">其他检查</td>
         		<td colspan="4">
         			<s:textfield name ="v_Result_22" cssClass="span2 inputClass"/>
         		</td>
         		<td >
         			<s:textfield name ="v_Result_24" cssClass="span2 inputClass"/>
				</td>
				<td >
         			<s:textfield name ="v_Result_Remark_24" cssClass="span2 inputClass"/>
				</td>
			</tr>
			 
			<tr>
				<td colspan="4">
					<s:textfield name ="v_Result_23" cssClass="span2 inputClass"/>
				</td>
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

