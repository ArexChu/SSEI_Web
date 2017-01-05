<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道硬度检查</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/tableCreater.js"></script>    			
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="pipeHardTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pipeMaintainId"></s:hidden>
		<s:hidden id="tablevalue" name="p_HB_Value"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="10" id="center"><b>管道硬度检查</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>   
        <tr>
            <td colspan="2" width="20%">仪器型号</td>
            <td colspan="3" width="30%"> 
            <s:textfield cssClass="span2 inputClass" name="p_Equ_Mod" />
            </td>
            <td colspan="2" width="20%">仪器编号</td>
            <td colspan="3" width="30%">
            <s:textfield cssClass="span2 inputClass" name="p_Equ_ID" />
            </td>  
        </tr>    
		<tr>
            <td colspan="2">测定部位</td>
            <td colspan="3"> 
            <s:textfield cssClass="span2 inputClass" name="p_Hard_Pos" />
            </td>
            <td colspan="2">评定标准</td>
            <td colspan="3">
            <s:textfield cssClass="span2 inputClass" name="p_Hard_Cri" />
            </td>  
        </tr>
        <tr>
            <td colspan="2">热处理状态</td>
            <td colspan="3">
            <s:textfield cssClass="span2 inputClass" name="p_Heat_Sta" />
            </td> 
            <td colspan="2"></td>
            <td colspan="3"></td> 
        </tr>       
        <tr>
		<td colspan="100%">					
			<div class="btn btn-mini btn-primary reverse table_add">
				添加一行
			</div>
			<div class="btn btn-mini btn-primary reverse table_delete">
				删除一行
			</div>
		</td>
		</tr>
       <tbody class="tableValue">
	   		<tr>
	          	<td colspan="2">序号</td>
	          	<td colspan="4">硬 度 值（HB）</td>
	          	<td colspan="4">硬度测定部位</td>
	        </tr>
            <tr style="display:none">
            	<td  colspan="2"><input class="span2 inputClass" type="text"  /></td>
            	<td  colspan="4"><input class="span2 inputClass" type="text"  /></td>
            	<td  colspan="4"><input class="span2 inputClass" type="text"  /></td>
            </tr>
        </tbody>

 		<tr>
            <td colspan="2">评定意见</td>
            <td colspan="8" >
             <s:textarea name="p_Ass_Opinion" cssClass="span2 inputClass" style="height:90px"/>
            </td>
        </tr>
 		<tr>
            <td colspan="2">检验</td>
            <td colspan="3">
            <div class="input-append">
                 <s:textfield  cssClass="datepicker inputClass" name="p_Hard_Data"/>
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
  