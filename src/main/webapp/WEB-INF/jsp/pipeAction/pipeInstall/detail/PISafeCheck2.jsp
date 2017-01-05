<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>压力管道安装安全质量监督检验记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>
   		  <script type="text/javascript" src="${pageContext.request.contextPath}/script/pipeAction/pisafecheck.js"></script>    		    		
   		 <style type="text/css">
			.span3{
		    	width: 70%!important;
			}
		</style>	
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="piSafeCheck2_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="8" id="center"><b>压力管道安装安全质量监督检验记录（续二）</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
            <td colspan="8" id="center"><b>六、工业管道防腐、绝热施工质量抽查记录</b></td>
        </tr>
        <tr class="tr_demo">
         	<td>序号</td>
         	<td>施工名称</td>
         	<td>管线号</td>
         	<td>防腐质量</td>
         	<td>绝热质量</td>
         	<td>施工记录</td>
         	<td>抽查结果</td>
         	<td>抽查日期</td>       	
         </tr>
        
        <tr class="tr_data">
         	<td>1</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio name="temp1" list="{'合格','不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden  cssClass="span2 inputClass" name="pi_InsPro_1"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>2</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp2" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_InsPro_2"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>3</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp3" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_InsPro_3"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>4</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp4" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_InsPro_4"></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>5</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp5" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_InsPro_5"></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>6</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp6" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_InsPro_6"></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>7</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp7" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_InsPro_7"></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>8</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp8" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_InsPro_8"></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>9</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp9" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_InsPro_9"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>10</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp10" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_InsPro_10"></s:hidden>
         	</td>
         </tr>
         
		<tr>
                <td colspan="8" id="center"><b>七、工业管道通球、扫线、干燥质量审查记录</b></td>
         </tr>
          <tr>
         	<td>序号</td>
         	<td>管线号</td>
         	<td>通球情况</td>
         	<td>扫线情况</td>
         	<td>干燥情况</td>
         	<td>相关记录</td>
         	<td>审查结果</td>
         	<td>审查日期</td>    	
         </tr>
		
		 <tr class="tr_data">
         	<td>1</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp11" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_Dry_1"></s:hidden>
         	</td>
         </tr>
		
		<tr class="tr_data">
         	<td>2</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp12" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_Dry_2"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>3</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp13" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_Dry_3"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>4</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp14" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_Dry_4"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>5</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp15" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_Dry_5"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>6</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp16" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_Dry_6"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>7</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp17" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_Dry_7"></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>8</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"></s:textfield>
         	</td>
         	<td>
         		<s:radio  name="temp18" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_Dry_8"></s:hidden>
         	</td>
         </tr>
         
         <tr>
         	<td>备注</td>
         	<td colspan="8" >
         	<s:textarea name="pi_SafeChe2_Remark" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr> 
         
          <tr>
         	<td colspan="2">监检人员</td>
         	<td colspan="2">
         		<s:textfield name="pi_SafeChe2_Per" cssClass="inputClass"></s:textfield>
         	</td>
         	<td colspan="2">日期</td>
         	<td colspan="2">
         		<div class="input-append">
                 <s:textfield  name="pi_SafeChe2_Date" cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div>
         	</td>
         </tr>
		
         <tr>
        	<td colspan="8">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 

    </table>
    </s:form>
</body>
</html>
  