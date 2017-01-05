<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>壁厚校核记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselThiCheck_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>壁厚校核记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
 		<tr>
         	<td>壁厚校核部位</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Pos" />
			</td>
         	<td>允许/监控使用压力</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Stress" />MPa
			</td>
         	<td>实测内径</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Dia" />mm
			</td>      	
         </tr>
         <tr>
         	<td>实测最小壁厚</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Min" />mm
			</td>
         	<td>材料许用应力</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Ma_Stress" />MPa
			</td>
         	<td>腐蚀裕量</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Cor" />mm
			</td>      	
         </tr>
         <tr>
         	<td>焊接接头系数</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Wel_Coe" />
			</td>
         	<td>封头形状系数</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Seal_Coe" />
			</td>
         	<td>允许/监控使用温度</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Tem" />℃
			</td>      	
         </tr>
         <tr>
         	<td>校核选用标准</td>
         	<td colspan="5">
         		<s:textfield cssClass="span2 inputClass" name="v_ThiChe_Cri" />
			</td>
		</tr>
        <tr>
         	<td>校核参数取值说明</td>
         	<td colspan="5" >
         	<s:textarea name="v_ThiChe_Coe" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
        </tr>
        <tr>
         	<td>壁厚校核计算</td>
         	<td colspan="5" >
         	<s:textarea name="v_ThiChe_Cal" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
        </tr>
        <tr>
         	<td>校核结果</td>
         	<td colspan="5" >
         	<s:textarea name="v_ThiChe_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
  	 	 <tr>
            <td colspan="1">检测</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_ThiChe_Test_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="1">校对</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_ThiChe_Proo_Date"/>
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
  