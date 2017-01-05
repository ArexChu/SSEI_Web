<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>压力管道底片复审记录表</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>
   		   <script type="text/javascript" src="${pageContext.request.contextPath}/script/pipeAction/pireview.js"></script>    		    		    			
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="piReview_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="10" id="center"><b>压力管道底片复审记录表</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
		<tr>
         	<td colspan="2" width="20%">工程编号</td>
         	<td colspan="3" width="30%">
         		<s:textfield cssClass="span2 inputClass" name="pi_PID" />
         	</td>
         	<td colspan="2" width="20%">管线编号</td>
         	<td colspan="3" width="30%">
         		<s:textfield cssClass="span2 inputClass" name="pi_Rev_PID" />
         	</td>
         </tr>
         
         <tr>
         	<td colspan="2">检测比例</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="pi_Rev_Ration" />
         	</td>
         	<td colspan="2">评定标准</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="pi_Rev_Cri" />
         	</td>
         </tr>
         
          <tr>
         	<td colspan="2">拍片总数</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="pi_Rev_Num" />
         	</td>
         	<td colspan="2">抽查片数</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="pi_Rev_Che_Num" />
         	</td>
         </tr>
         
           <tr>
         	<td colspan="2">抽查比例 </td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="pi_Rev_Che_Ration" />
         	</td>
         	<td colspan="2">合格级别</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="pi_Rev_Gra" />
         	</td>
         </tr>
         <tr class="tr_demo">
         	<td  width="10%">序号 </td>
         	<td  colspan="2" width="20%">管口号/底片号</td>
         	<td  width="30%" colspan="3">抽查结果</td>
         	<td  width="10%">底片数量</td> 
         	<td  colspan="3" width="30%">备注</td>  	
         </tr>
         
         <tr class="tr_data">
         	<td>1</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp1" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value1" ></s:hidden>
         	</td>
         </tr>
 
         <tr class="tr_data">
         	<td>2</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp2" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value2" ></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>3</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp3" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value3" ></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>4</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp4" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value4" ></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>5</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp5" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value5" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>6</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp6" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value6" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>7</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp7" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value7" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>8</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp8" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value8" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>9</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp9" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value9" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>10</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp10" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value10" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>11</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp11" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value11" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>12</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp12" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value12" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>13</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp13" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value13" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>14</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp14" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value14" ></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>15</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp15" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value15" ></s:hidden>
         	</td>
         </tr>
         
         <tr class="tr_data">
         	<td>16</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp16" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value16" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>17</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp17" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value17" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>18</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp18" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value18" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>19</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp19" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value19" ></s:hidden>
         	</td>
         </tr>
         
         
         <tr class="tr_data">
         	<td>20</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3" width="30%">
         		<s:radio name="temp20" list="{'认可', '需重拍','需重评'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"/>	
         	</td>
         	<td>
         		<s:hidden name="pi_Rev_value20" ></s:hidden>
         	</td>
         </tr>
         
                    
		 <tr>
         	<td colspan="2">监检人员</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass"  name="pi_Rev_Per_Name" />
         	</td>
         	<td colspan="2">日期</td>
         	<td colspan="3">
         	    <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Rev_Date"/>
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
  