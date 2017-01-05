<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>工业管道基本情况记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="piBasic_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>工业管道基本情况记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
         	<td>设计压力</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_De_Pre" />MPa
         	</td>
         	<td>设计温度</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_De_Tem" />℃
         	</td>
        </tr>
        <tr>
         	<td>输送介质</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Wo_Med" />
         	</td>
         	<td>管道级别</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Gra" />
         	</td>
        </tr>
        <tr>
         	<td>管道设计标准</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_De_Cri" />
         	</td>
         	<td>管道安装标准</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"  name="pi_Ins_Cri" />
         	</td>
        </tr>            
    <tr>
         	<td>管道长度</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Len" />m
         	</td>
         	<td>焊口数量</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Wel_Num" />道
         	</td>
         </tr>
         <tr>
         	<td>焊评标准</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Wel_Cri" />
         	</td>
         	<td>焊评报告号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Wel_Rep" />
         	</td>
         </tr>
         <tr>
         	<td>焊接工艺号</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Wel_ID" />
         	</td>
         	<td>管道隐蔽长度</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Hidden_Len"/>m
         	</td>
         </tr>
         <tr>
         	<td>隐蔽焊口</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Hidden_Wel" />道
         	</td>
         	<td>穿跨越标准</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Corss_Cri"/>
         	</td>
         </tr>
         <tr>
         	<td>穿跨越数</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Corss_Num" />处
         	</td>
         	<td>穿跨越方法</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Corss_Method" />
         	</td>
         </tr>
         <tr>
         	<td>穿跨越总长度</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Corss_Len"/>m
         	</td>
         	<td>检测焊口</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Che_Wel" />道
         	</td>
         </tr>
          <tr>
         	<td>检测标准</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Che_Cri"/>
         	</td>
         	<td>检测比例</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Che_Ration"/>%
         	</td>
         </tr>
          <tr>
         	<td>合格级别</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Qua_Gra" />级
         	</td>
         	<td>检测方法</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Che_Method" />
         	</td>
         </tr>
         <tr>
         	<td>备注</td>
         	<td colspan="3">
         	<s:textarea name="pi_Basic_Remark" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>  
  		 <tr>
         	<td>监检人员</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass" name="pi_Basic_Per" />
         	</td>
         	<td >日期</td>
            <td >
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Basic_Date"/>
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
  