<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>相关单位安全质量管理行为的评价记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>    				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="piComInf_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>相关单位安全质量管理行为的评价记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
  		<tr>
         	<td colspan="4" width="45%">监督检验项目</td>
         	<td colspan="3">审查结果</td>
         	<td colspan="2">评价意见</td>
         </tr>
         <tr>
         	<td rowspan="4">建设单位</td>
         	<td colspan="3">设计、监理、安装、检测及防腐合同管理</td>
         	<td colspan="3">
         		<s:radio name="pi_Cons_Inf1" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td colspan="2" rowspan="4">
         	<s:textarea name="pi_Cons_Opinion" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         <tr>
         	<td colspan="3">组织设计交底和施工方案讨论</td>
         	<td colspan="3">
      			<s:radio name="pi_Cons_Inf2" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>           
  		 <tr>
         	<td colspan="3">材料采购质量控制与施工管理</td>
         	<td colspan="3">
         		<s:radio name="pi_Cons_Inf3" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
         <tr>
         	<td colspan="3">监督检验意见处理情况</td>
         	<td colspan="3">
         		<s:radio name="pi_Cons_Inf4" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>     
  		 <tr>
         	<td rowspan="4">监理单位</td>
         	<td colspan="3">监理单位资质、监理人员资格</td>
         	<td colspan="3">
         	<s:radio name="pi_Sup_Inf1" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td colspan="2" rowspan="4">
         	<s:textarea name="pi_Sup_Opinion" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         <tr>
         	<td colspan="3">监理单位质量管理体系</td>
         	<td colspan="3">
         	    <s:radio name="pi_Sup_Inf2" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
         <tr>
         	<td colspan="3">监理工作质量</td>
         	<td colspan="3">
         	    <s:radio name="pi_Sup_Inf3" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
         <tr>
         	<td colspan="3">监督检验意见处理情况</td>
         	<td colspan="3">
         	    <s:radio name="pi_Sup_Inf4" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>        
  <tr>
         	<td rowspan="7">安装单位</td>
         	<td colspan="3">安装单位资质与告知手续</td>
         	<td colspan="3">
         		<s:radio name="pi_InsCom_Inf1" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td colspan="2" rowspan="7">
         	<s:textarea name="pi_InsCom_Opinion" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
          <tr>
         	<td colspan="3">质量管理体系及专业技术、管理人员</td>
         	<td colspan="3">
         		<s:radio name="pi_InsCom_Inf2" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
         <tr>
         	<td colspan="3">材料验收及施工质量检验管理</td>
         	<td colspan="3">
         		<s:radio name="pi_InsCom_Inf3" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
         <tr>
         	<td colspan="3">焊工资格、焊评报告及焊接工艺、施工方案实施情况</td>
         	<td colspan="3">
         		<s:radio name="pi_InsCom_Inf4" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
         <tr>
         	<td colspan="3">施工技术文件管理</td>
         	<td colspan="3">
         	<s:radio name="pi_InsCom_Inf5" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
         <tr>
         	<td colspan="3">安装分包、转包管理员</td>
         	<td colspan="3">
         		<s:radio name="pi_InsCom_Inf6" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
          <tr>
         	<td colspan="3">监督检验意见处理情况</td>
         	<td colspan="3">
         		<s:radio name="pi_InsCom_Inf7" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
<tr>
         	<td rowspan="4">检测单位</td>
         	<td colspan="3">检测单位资质检测人员资格</td>
         	<td colspan="3">
         		<s:radio name="pi_CheCom_Inf1" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td colspan="2" rowspan="4">
         	<s:textarea name="pi_CheCom_Opinion" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         
         <tr>
         	<td colspan="3">检测单位质量管理体系</td>
         	<td colspan="3">
         		<s:radio name="pi_CheCom_Inf2" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
          <tr>
         	<td colspan="3">检测工作质量与检测报告</td>
         	<td colspan="3">
				<s:radio name="pi_CheCom_Inf3" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
         <tr>
         	<td colspan="3">监督检验意见处理情况</td>
         	<td colspan="3">
         		<s:radio name="pi_CheCom_Inf4" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         </tr>
           <tr>
         	<td rowspan="4">防腐单位</td>
         	<td colspan="3">防腐单位资质</td>
         	<td colspan="3">
         		<s:radio name="pi_Pro_Inf1" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td colspan="2" rowspan="4">
         	<s:textarea name="pi_Pro_Opinion" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         
         <tr>
         	<td colspan="3">防腐单位质量管理体系</td>
         	<td colspan="3">
         		<s:radio name="pi_Pro_Inf2" list="{'无', '合格', '不合格'}"></s:radio>
         	</td>
         </tr>
         <tr>
         	<td colspan="3">防腐工作质量与施工记录</td>
         	<td colspan="3">
         		<s:radio name="pi_Pro_Inf3" list="{'无', '合格', '不合格'}"></s:radio>
         	</td>
         </tr>
         <tr>
         	<td colspan="3">监督检验意见处理情况</td>
         	<td colspan="3">
         		<s:radio name="pi_Pro_Inf4" list="{'无', '合格', '不合格'}"></s:radio>
         	</td>
         </tr> 
		<tr>
         	<td>备注</td>
         	<td colspan="9" >
         	<s:textarea name="pi_InsCom_Remark" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         <tr>
         	<td >监检人员</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"  name="pi_InsCom_Per" />
         	</td>
         	<td colspan="3">日期</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_InsCom_Date"/>
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
  