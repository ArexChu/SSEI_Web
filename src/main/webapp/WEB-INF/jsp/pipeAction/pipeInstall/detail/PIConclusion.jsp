<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>工业管道安装安全质量监督检验结论记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>    		
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="piConclusion_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>工业管道安装安全质量监督检验结论记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
  		<tr>
         	<td colspan="4">工程概述</td>
        </tr>
        <tr>
         	<td width="20%">工程地址</td>
         	<td width="30%">
         		<s:textfield cssClass="span2 inputClass" name="pi_Addr" />
         	</td>
         	<td width="20%">下次全面检验日期</td>
            <td width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Next_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
        </tr>     
         <tr>
        	<td >开工时间</td>
            <td >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Start_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td >竣工时间</td>
            <td >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_End_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>
         <tr>
         	<td>管道设计单位</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_De_Com" />
         	</td>
         	<td>设计证书编号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_De_Cer_ID" />
         	</td>
         </tr>
         
         <tr>
         	<td>授权监督检验文号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Insp_ID" />
         	</td>
         	<td>安装许可证编号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Install_Cer_ID" />
         	</td>
         </tr>
         
         <tr>
         	<td>防腐施工单位</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Pro_Com" />
         	</td>
         	<td>防腐资质证书编号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Pro_Cer_ID" />
         	</td>
         </tr>
         
         
         <tr>
         	<td>监理单位</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Sup_Com" />
         	</td>
         	<td>监理资质证书编号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Sup_Cer_ID" />
         	</td>
         </tr>
         
         <tr>
         	<td>检测单位</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Check_Com" />
         	</td>
         	<td>检测资质证书编号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Check_Cer_ID" />
         	</td>
         </tr>
         
         <tr>
	        <td >监督检验起止日期</td>
	        <td colspan="3">
	            <div class="input-append">
	                 <s:textfield  cssClass="datepicker inputClass" name="pi_Insp_Start_Date"/>
	                 <span class="add-on"><i class="icon-calendar"></i></span>
	                 &nbsp;&nbsp;至&nbsp;&nbsp;<s:textfield  cssClass="datepicker inputClass" name="pi_Insp_End_Date"/>
	                 <span class="add-on"><i class="icon-calendar"></i></span>
	            </div>
	          
	        </td>
	      </tr>
         
          <tr>
         	<td>管道编号</td>
         	<td colspan="3" >
         	<s:textarea name="pi_Pipe_ID" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         
         <tr>
         	<td rowspan="2">监督检验依据</td>
         	<td colspan="3" height='30px'>
         	1、《压力管道安全管理与监察规定》<br>2、《压力管道安装安全质量监督检验规则》<br>
         	
         	</td>
         </tr>
        
        <tr>
        <td colspan="3" height='50px'>
         	<s:textarea name="pi_Insp_Reasion" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
        </tr>
         <tr>
         	<td>监督检验结论</td>
         	<td>
                <s:radio name="pi_Insp_Result" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>安全状况等级</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Insp_Grade" />
         	</td>
         </tr>
         
         <tr>
         	<td>监检使用的设备名称及编号：</td>
         	<td colspan="3" >
         	<s:textarea name="pi_Check_Equ" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         
         <tr>
         	<td>监检人员</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Insp_Per_Name" />
         	</td>
         	<td>监检人员资格证号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Insp_Per_ID" />
         	</td>
         </tr>
         
          <tr>
         	<td>监检日期</td>
            <td >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Insp_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         	<td>校对人员</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Check_Per_Name" />
         	</td>
         </tr>
         
         <tr>
         	<td>校对人员资格证号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Check_Per_ID" />
         	</td>
         	<td >校对日期</td>
            <td >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_ConCheck_Date"/>
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
  