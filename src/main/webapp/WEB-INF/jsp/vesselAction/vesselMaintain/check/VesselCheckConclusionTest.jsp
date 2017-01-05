<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>验收检查结论记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselCheckConclusionTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>压力容器验收检查记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        
        <tr>
         	<td>检查结论</td>
         	<td colspan="2">
         		<s:radio name="v_Check_Conclusion" list="{'符合要求', '基本符合要求 ','不符合要求'}"></s:radio>
			</td>
			 <td></td>
         	<td colspan="2">
			</td>	
         </tr> 
         
         <tr>
         	<td>委托单位</td>
         	<td colspan="2">
         	<s:textfield name="v_M_Entrust_Com" cssClass="inputClass"></s:textfield>
			</td>
			 <td>委托单位联系人</td>
         	<td colspan="2">
         		<s:textfield name="v_M_Entrust_Com_Per" cssClass="inputClass"></s:textfield>
			</td>	
         </tr> 
         
         
         <tr>
         	<td rowspan="2">检查依据</td>
         	<td colspan="5" height='30px'>
         	1、相关单位委托书<br/>
      		2、有关压力容器规范规章标准
         	</td>
         </tr>
          <tr>
        	<td colspan="5" height='50px'>
         		<s:textarea name="v_Check_Basic" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
        </tr>
        
        
         <tr>
         	<td colspan="6">允许（监控）使用参数</td>
         </tr>
          <tr>
         	<td>压力</td>
         	<td colspan="2">
         		<s:textfield name="v_Check_Pre" cssClass="inputClass"></s:textfield>MPa
			</td>
         	<td>温度</td>
         	<td colspan="2">
         		<s:textfield name="v_Check_Tem" cssClass="inputClass"></s:textfield>℃
			</td>   	
         </tr>
         
         
        <tr>
         	<td>介质</td>
         	<td colspan="2">
         		<s:textfield name="v_Check_Med" cssClass="inputClass"></s:textfield>
			</td>
         	<td>其他</td>
         	<td colspan="2">
         		<s:textfield name="v_Check_Other" cssClass="inputClass"></s:textfield>
			</td>   	
         </tr>
         <tr>
         	<td>安全状况等级</td>
         	<td colspan="2">
         		<s:textfield name="v_Check_Level" cssClass="inputClass"></s:textfield>
			</td>
         	<td colspan="1">下次定期检验日期</td>
         	<td colspan="2">
         		<div class="input-append">
                 <s:textfield  cssClass=" datepicker inputClass" name="v_M_Next_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            	</div>
         	</td>
        </tr>  
           <tr>
         	<td colspan="1">需要说明情况</td>
         	<td colspan="5" height="100px">
         		<s:textarea  name="v_Check_Explan" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         <tr>
         	<td colspan="1"> 检验发现的问题及处理意见</td>
         	<td colspan="5" height="200px">
         	<s:textarea  name="v_M_Bas_Prob" cssClass="span2 inputClass" style="height:190px"/>
         	</td>
         </tr>  
          
         <tr>
         	<td colspan="1">检验</td>
         	<td colspan="2">
         		<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Check_Test"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            	</div>
         	</td>
         	<td colspan="1">校核</td>
         	<td colspan="2">
         		<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Check_Check"/>
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
  