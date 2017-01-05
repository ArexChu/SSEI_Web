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
	<s:form  action="piSafeCheck_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="8" id="center"><b>压力管道安装安全质量监督检验记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
            <td colspan="8" id="center"><b>一、工业管道元件及焊接材料的材质审查记录（管子、管件、阀门、法兰、焊材等）</b></td>
        </tr>
        <tr class="tr_demo">
         	<td>序号</td>
         	<td>元件名称</td>
         	<td>材料牌号</td>
         	<td>规格型号</td>
         	<td>制造单位</td>
         	<td>质量证明书编号</td>
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
         		<s:hidden  cssClass="span2 inputClass" name="pi_Wel_Ma_1"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Ma_2"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Ma_3"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Ma_4"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Ma_5"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Ma_6"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Ma_7"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Ma_8"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Ma_9"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Ma_10"></s:hidden>
         	</td>
         </tr>
         
		<tr>
                <td colspan="8" id="center"><b>二、工业管道焊接质量抽查记录</b></td>
         </tr>
          <tr>
         	<td>序号</td>
         	<td>管线管口号</td>
         	<td>焊工资质</td>
         	<td>焊接工艺</td>
         	<td>焊缝外观</td>
         	<td>错边量（mm）</td>
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
         		<s:radio  name="temp11" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Qua_1"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Qua_2"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Qua_3"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Qua_4"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Qua_5"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Qua_6"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Qua_7"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Wel_Qua_8"></s:hidden>
         	</td>
         </tr>
         
         <tr>
         	<td>备注</td>
         	<td colspan="8" >
         	<s:textarea name="pi_SafeChe_Remark" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr> 
         
          <tr>
         	<td colspan="2">监检人员</td>
         	<td colspan="2">
         		<s:textfield name="pi_SafeChe_Per" cssClass="inputClass"></s:textfield>
         	</td>
         	<td colspan="2">日期</td>
         	<td colspan="2">
         		<div class="input-append">
                 <s:textfield  name="pi_SafeChe_Date" cssClass="span3 datepicker inputClass"/>
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
  