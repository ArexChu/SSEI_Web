<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器定期检验结论</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>  
   		 <script type="text/javascript">
   		$(function () {
   			var temp = $("#v_M_Sta").val();
   			var arr = temp.split(",");
   			$("input[name='v_M_Sta_1'][value="+arr[0]+"]").attr('checked', true);
   			$("input[name='v_M_Sta_2'][value="+arr[1]+"]").attr('checked', true);
   			$("input[name='v_M_Sta_3'][value="+arr[2]+"]").attr('checked', true);
   			
	   		$('form').submit(function(){
	   			var temp="";
	   			var v_M_Sta_1 = $("input[name='v_M_Sta_1']:checked").val();
	   			var v_M_Sta_2 =$("input[name='v_M_Sta_2']:checked").val();
	   			var v_M_Sta_3 =$("input[name='v_M_Sta_3']:checked").val();
	   			temp=v_M_Sta_1+","+v_M_Sta_2+","+v_M_Sta_3;
	   			$("#v_M_Sta").val(temp);
	   		});
   		});
   		 </script>	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselConclusionTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="v_M_Sta" id="v_M_Sta"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>容器定期检验结论</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        
        
        <tr>
         	<td>检验类别</td>
         	<td colspan="2">
         		<s:radio name="v_M_Type" list="{'首次', '定期检验 '}"></s:radio>
			</td>
         	<td>运行状态</td>
         	<td colspan="2">
         		<s:radio name="v_M_Sta_1" id="v_M_Sta_1"  list="{'自用', '租赁'}"></s:radio>/
         		<s:radio name="v_M_Sta_2" id="v_M_Sta_2"  list="{'生产', '生活'}"></s:radio>/
         		<s:radio name="v_M_Sta_3" id="v_M_Sta_3"  list="{'长期使用', '间歇使用','备用'}"></s:radio>
			</td> 	
         </tr>
        
        
        <tr>
         	<td>检验条件确认</td>
         	<td colspan="2">
         		<s:radio name="v_M_Condition" list="{'具备检验条件', '不具备检验条件 '}"></s:radio>
			</td>
         	<td>检查结论</td>
         	<td colspan="2">
         		<s:radio name="v_M_Conclusion" list="{'符合要求', '基本符合要求 ','不符合要求'}"></s:radio>
			</td> 	
         </tr>

         <tr>
         	<td colspan="6">允许（监控）使用参数</td>
         </tr>
         
          <tr>
         	<td colspan="6">经验收检查本台压力容器的安全状况等级，符合
         	<s:textfield name="v_M_Level" cssClass="inputClass"></s:textfield>
			级</td>
         </tr>
         
           <tr>
         	<td>压力</td>
         	<td colspan="2">
         		<s:textfield name="v_M_Pre" cssClass="inputClass"></s:textfield>MPa
			</td>
         	<td>温度</td>
         	<td colspan="2">
         		<s:textfield name="v_M_Tem" cssClass="inputClass"></s:textfield>℃
			</td>   	
         </tr>
         
         
        <tr>
         	<td>介质</td>
         	<td colspan="2">
         		<s:textfield name="v_M_Med" cssClass="inputClass"></s:textfield>
			</td>
         	<td>其他</td>
         	<td colspan="2">
         		<s:textfield name="v_M_Other" cssClass="inputClass"></s:textfield>
			</td>   	
         </tr>
         <tr>
         	<td colspan="1">下次定期检验日期</td>
         	<td colspan="5">
         		<div class="input-append">
                 <s:textfield  cssClass=" datepicker inputClass" name="v_M_Next_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            	</div>
         	</td>
        </tr>
          
         
         <tr>
         	<td colspan="1">需要说明情况</td>
         	<td colspan="5" height="100px">
         		<s:textarea  name="v_M_Explain" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         
         
         
         <tr>
         	<td colspan="1"> 检验发现的问题及处理意见</td>
         	<td colspan="5" height="200px">
         	<s:textarea  name="v_M_Bas_Prob" cssClass="span2 inputClass" style="height:190px"/>
         	</td>
         </tr>
         <tr>
         	<td colspan="1">资料审查问题记载</td>
         	<td colspan="5" height="200px">
         		<s:textarea  name="v_M_check_Prob" cssClass="span2 inputClass" style="height:190px"/>
         	</td>
         </tr>
         
         <tr>
         	<td colspan="1">上次全面检验问题记载</td>
         	<td colspan="5" height="200px">
         		<s:textarea  name="v_M_Prob" cssClass="span2 inputClass" style="height:190px"/>
         	</td>
         </tr>
                
          <tr>
         	<td colspan="1">检验</td>
         	<td colspan="2">
         		<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_M_Test_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            	</div>
         	</td>
         	<td colspan="1">校核</td>
         	<td colspan="2">
         		<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_M_Check_Date"/>
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
  