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
	<s:form  action="piSafeCheck3_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="10" id="center"><b>压力管道安装安全质量监督检验记录（续三）</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
            <td colspan="10" id="center"><b>八、工业管道强度试验、泄漏性试验记录</b></td>
        </tr>
        <tr class="tr_demo">
         	<td>序号</td>
         	<td>试验名称</td>
         	<td>设计压力</td>
         	<td>设计温度</td>
         	<td>试验压力</td>
         	<td>试验介质</td>
         	<td>稳压时间</td>
         	<td>环境温度</td>
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
         		<s:hidden  cssClass="span2 inputClass" name="pi_Leak_1"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Leak_2"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Leak_3"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Leak_4"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Leak_5"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Leak_6"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Leak_7"></s:hidden>
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
         		<s:hidden cssClass="span2 inputClass" name="pi_Leak_8"></s:hidden>
         	</td>
         </tr>
		</table>
         <table  class="table table-striped table-bordered table-condensed list">
		<tr>
                <td colspan="8" id="center"><b>九、工业管道安全保护装置检查记录</b></td>
         </tr>
          <tr>
         	<td>序号</td>
         	<td>保护装置名称</td>
         	<td >技术 参数</td>
         	<td>制造单位</td>
         	<td >校验情况</td>
         	<td>校验合格证号</td>
         	<td>结果</td> 
         	<td >有效期</td>  	
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
         		<s:radio  name="temp9" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_SafeEqu_1"></s:hidden>
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
         		<s:radio  name="temp10" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_SafeEqu_2"></s:hidden>
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
         		<s:radio  name="temp11" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_SafeEqu_3"></s:hidden>
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
         		<s:radio  name="temp12" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_SafeEqu_4"></s:hidden>
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
         		<s:radio  name="temp13" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_SafeEqu_5"></s:hidden>
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
         		<s:radio  name="temp14" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_SafeEqu_6"></s:hidden>
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
         		<s:radio  name="temp15" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_SafeEqu_7"></s:hidden>
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
         		<s:radio  name="temp16" list="{'合格', '不合格'}"></s:radio>
         	</td>
         	<td>
         		<div class="input-append">
                 <s:textfield  cssClass="span3 datepicker inputClass"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
             	</div> 	
         	</td>
         	<td>
         		<s:hidden cssClass="span2 inputClass" name="pi_SafeEqu_8"></s:hidden>
         	</td>
         </tr>
         
         <tr>
         	<td>备注</td>
         	<td colspan="8" >
         	<s:textarea name="pi_SafeChe3_Remark" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr> 
         
          <tr>
         	<td colspan="2">监检人员</td>
         	<td colspan="2">
         		<s:textfield name="pi_SafeChe3_Per" cssClass="inputClass"></s:textfield>
         	</td>
         	<td colspan="2">日期</td>
         	<td colspan="2">
         		<div class="input-append">
                 <s:textfield  name="pi_SafeChe3_Date" cssClass="span3 datepicker inputClass"/>
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
  