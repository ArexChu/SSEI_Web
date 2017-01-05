<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>金相分析</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>    			
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="pipeMetTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pipeMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="8" id="center"><b>金相分析</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
            <td colspan="2">取样部位</td>
            <td colspan="2"> 
            <s:textfield cssClass="span2 inputClass" name="p_Met_Pos"/>
            </td>
            <td colspan="2">试样编号</td>
            <td colspan="2">
             <s:textfield cssClass="span2 inputClass" name="p_Sample_ID"/>
            </td>  
        </tr>
        <tr>
           <td colspan="2">仪器型号</td>
           <td colspan="2"> 
           <s:textfield cssClass="span2 inputClass" name="p_Equ_Mod"/>
           </td>
           <td colspan="2">仪器编号</td>
           <td colspan="2">
            <s:textfield cssClass="span2 inputClass" name="p_Equ_ID"/>
           </td>  
        </tr>
        <tr>
            <td colspan="2">腐蚀方法</td>
            <td colspan="2"> 
            <s:textfield cssClass="span2 inputClass" name="p_Cor_Method"/>
            </td>
            <td colspan="2">抛光方法</td>
            <td colspan="2">
             <s:textfield cssClass="span2 inputClass" name="p_Pol_Method"/>
            </td>  
        </tr>
        <tr>
            <td colspan="2">放大倍数</td>
            <td colspan="2"> 
            <s:textfield cssClass="span2 inputClass" name="p_Amp_Times" />
            </td>
            <td colspan="2">执行标准</td>
            <td colspan="2">
             <s:textfield cssClass="span2 inputClass" name="p_Met_Cri" />
            </td>  
        </tr>
        <tr>
            <td colspan="2">热处理状态</td>
            <td colspan="2">
            <s:textfield cssClass="span2 inputClass" name="p_Heat_Sta" />
            </td>  
            <td colspan="2"></td>
            <td colspan="2"></td> 
        </tr>
        <tr>
           <td colspan="2">分析结果
           </td>
           <td colspan="6">
           <s:textarea name="p_Ana_Result" cssClass="span2 inputClass" style="height:90px"/>
           </td>    
        </tr>
  		<tr>
            <td colspan="2">检验</td>
            <td colspan="3">
            <div class="input-append">
                 <s:textfield  cssClass="datepicker inputClass" name="p_Met_Data"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
        </tr>        
        <tr>
        	<td colspan="9">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 

    </table>
    </s:form>
</body>
</html>
  