<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道基础信息</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <style type="text/css">
			label {
				display: inline;
			}
		</style>
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span>
    
    
	<s:form  id="saveUI" action="pipeBasic_%{id == 0 ? 'add' : 'edit'}" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="p_submited"></s:hidden>
		<s:hidden name="p_checkType"></s:hidden>
    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="6" id="center"><b>管道基本信息</b> <a id="startEdit" >修改</a></td>
            	</tr>
            	
        	</thead>
         	<tbody>
         
         	<tr>
         		<td >使用单位名称</td>
         		<td colspan="2" class="detail">
                    <s:select name="companyID" id="companyID" cssClass="inputClass"
                    list="#useCompanyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请确定单位=="/>
                	<span class="errorClass" id="companyID_Error">
                    ${errors.companyID}
                	</span>    
				</td>
				<td >管道系统</td>
         		<td colspan="2">
         			<s:textfield name ="p_Sys" cssClass="inputClass"/>
         		</td>
			</tr>
			<tr>
         		<td >管道编号</td>
         		<td colspan="2">
         			<s:textfield name ="p_ID" cssClass="inputClass"/>
         		</td>
         		<td >设计单位</td>
         		<td colspan="2" class="detail">
                    <s:select name="p_De_Com"  cssClass="inputClass"
                    list="#companyList" listKey="name" listValue="name"
                    headerKey="" headerValue="==设计单位=="/>  
				</td>
			</tr>
			<tr>
         		<td >管道名称</td>
         		<td colspan="2">
         			<s:textfield name ="p_Name" cssClass="inputClass"/>
         		</td>       		  
         		<td >设计日期</td>
         		<td colspan="2">
         			<div class="input-append">
                   		<s:textfield  cssClass="datepicker inputClass" name="p_De_Date"/>
                   		<span class="add-on"><i class="icon-calendar"></i></span>
                	</div>
                </td>
            </tr>
              
           	<tr>
         		<td >装置名称</td>
         		<td colspan="2">
         			<s:textfield name ="p_Equ_Name" cssClass="inputClass"/>
         		</td>
         		<td >设计规范</td>
         		<td colspan="2">
         			<s:textfield name ="p_De_Norm" cssClass="inputClass"/>
         		</td>
 			</tr>
         	
         	<tr>
         		<td >管道级别</td>
         		<td colspan="2">
         			<s:textfield name ="p_Gra" cssClass="inputClass"/>
         		</td>
         		<td >安装单位</td>
         		<td colspan="2" class="detail">
                    <s:select name="p_Ins_Com"  cssClass="inputClass"
                    list="#companyList" listKey="name" listValue="name"
                    headerKey="" headerValue="==安装单位=="/> 
				</td>
			</tr>
         	
         	<tr>
         		<td >管道长度</td>
         		<td colspan="2">
         			<s:textfield name ="p_Len" cssClass="inputClass"/>
         		</td>
         
         		<td >安装与验收规范</td>
         		<td colspan="2">
         			<s:textfield name ="p_Ins_Norm" cssClass="inputClass"/>
         		</td>
        	</tr>
         	
         	<tr>
         		<td >起始位置</td>
         		<td colspan="2">
         			<s:textfield name ="p_Start_Pos" cssClass="inputClass"/>
         		</td>
         		<td >验收日期</td>
         		<td colspan="2">
         			<div class="input-append">
                   		<s:textfield  cssClass="datepicker inputClass" name="p_Che_Bef_Date"/>
                   		<span class="add-on"><i class="icon-calendar"></i></span>
                	</div>
                </td>
            </tr>
            
            <tr>
         		<td >终止位置</td>
         		<td colspan="2">
         			<s:textfield name ="p_End_Pos" cssClass="inputClass"/>
         		</td>
         	
         		<td >投用日期</td>
         		<td colspan="2">
         			<div class="input-append">
                   		<s:textfield  cssClass="datepicker inputClass" name="p_Use_Date"/>
                   		<span class="add-on"><i class="icon-calendar"></i></span>
                	</div>
                </td>
            </tr>
            
            <tr>
         		<td >敷设方式</td>
         		<td colspan="2">
         			<s:radio name="p_Lay" list="{'架空', '埋地'}"></s:radio>
         		</td>
         	
         		<td >实际使用时间</td>
         		<td colspan="2">
         			<s:textfield name ="p_Act_Use_Date" cssClass="inputClass"/>
                </td>
         	</tr>
         	
         	<tr>
         		<td >设计压力</td>
         		<td colspan="2">
         			<s:textfield name ="p_De_Pre" cssClass="inputClass"/>
         		</td>
         		<td >工作压力</td>
         		<td colspan="2">
         			<s:textfield name ="p_Wo_Pre" cssClass="inputClass"/>
         		</td>
         	</tr>
         	
         	<tr>
         		<td >设计温度</td>
         		<td colspan="2">
         			<s:textfield name ="p_De_Tem" cssClass="inputClass"/>
         		</td>
         		<td >工作温度</td>
         		<td colspan="2">
         			<s:textfield name ="p_Wo_Tem" cssClass="inputClass"/>
         		</td>
         	</tr>
         	
         	<tr>
         		<td >管子材料牌号</td>
         		<td colspan="2">
         			<s:textfield name ="p_Ma_Gra" cssClass="inputClass"/>
         		</td>
         		<td >工作介质</td>
         		<td colspan="2">
         			<s:textfield name ="p_Wo_Med" cssClass="inputClass"/>
         		</td>
         	</tr>
         	
         	<tr>
         		<td rowspan="2">管道规格<br />(外径×壁厚)</td>
         		<td colspan="2" rowspan="2">
         			<s:textfield name ="p_Out_Rad" cssClass="inputClass"/><br/>
         			<s:textfield name ="p_Thi" cssClass="inputClass"/>
         		</td>
         		<td >绝热层材料</td>
         		<td colspan="2">
         			<s:textfield name ="p_Ins_Ma" cssClass="inputClass"/>
         		</td>
         	</tr>
         	
         	<tr>
         		<td >绝热层厚度</td>
         		<td colspan="2">
         			<s:textfield name ="p_Ins_Thi" cssClass="inputClass"/>
         		</td>
         	</tr>
         	<tr>
         		<td >腐蚀裕量</td>
         		<td colspan="2">
         			<s:textfield name ="p_Pro_Mar" cssClass="inputClass"/>
         		</td>

         		<td >防腐层材料</td>
         		<td colspan="2">
         			<s:textfield name ="p_Pro_Ma" cssClass="inputClass"/>
         		</td>
         	</tr>
        	
        	<tr>
         		<td >注册代码</td>
         		<td colspan="2">
         			<s:textfield name ="p_Reg_Code" cssClass="inputClass"/>
         		</td>

         		<td >最高工作压力</td>
         		<td colspan="2">
         			<s:textfield name ="p_Max_Pre" cssClass="inputClass"/>
         		</td>
         	</tr>
         	
         	<tr>
         		<td >最高工作温度</td>
         		<td colspan="2">
         			<s:textfield name ="p_Max_Tem" cssClass="inputClass"/>
         		</td>

         		<td >安全状况等级</td>
         		<td colspan="2">
         			<s:textfield name ="p_Sec_Rank" cssClass="inputClass"/>
         		</td>
         	</tr>        	
         	
         	<tr>
         		<td >工艺图号</td>
         		<td colspan="2">
         			<s:textfield name ="p_Pro_Num" cssClass="inputClass"/>
         		</td>

         		<td >管道标识</td>
         		<td colspan="2">
         			<s:textfield name ="p_Sign" cssClass="inputClass"/>
         		</td>
         	</tr>          	
 
          	<tr>
         		<td >对接焊口数量</td>
         		<td colspan="2">
         			<s:textfield name ="p_Butt_Joint" cssClass="inputClass"/>
         		</td>

         		<td >角接焊口数量</td>
         		<td colspan="2">
         			<s:textfield name ="p_Corner_Joint" cssClass="inputClass"/>
         		</td>
         	</tr>            	
         	
          	<tr>
				<td >总焊口数量</td>
         		<td colspan="2">
         			<s:textfield name ="p_Total_Joint" cssClass="inputClass"/>
         		</td>
         		<td >三通数量</td>
         		<td colspan="2">
         			<s:textfield name ="p_T_Cock" cssClass="inputClass"/>
         		</td>	
         	</tr>     	

     		<tr>
				<td >弯头数量</td>
         		<td colspan="2">
         			<s:textfield name ="p_Elbow" cssClass="inputClass"/>
         		</td>
         		<td >变径管数量</td>
         		<td colspan="2">
         			<s:textfield name ="p_Reducer" cssClass="inputClass"/>
         		</td>	
         	</tr> 
         	
     		<tr>
				<td >轴侧图数</td>
         		<td colspan="2">
         			<s:textfield name ="p_Axial_View" cssClass="inputClass"/>
         		</td>
         		<td >安装日期</td>
         		<td colspan="2">
         			<div class="input-append">
                   		<s:textfield  cssClass="datepicker inputClass" name="p_Install_Date"/>
                   		<span class="add-on"><i class="icon-calendar"></i></span>
                	</div>
                </td>
         	</tr>        	
         	
     		<tr>
				<td >使用证号</td>
         		<td colspan="2">
         			<s:textfield name ="p_Cer_Num" cssClass="inputClass"/>
         		</td>
         		<td >管道规格</td>
         		<td colspan="2">
         			<s:textfield name ="p_Speci" cssClass="inputClass"/>
         		</td>	
         	</tr> 
         	
        <tr>
            <td >备注</td>
            <td colspan="7">
             <s:textarea cssClass="span7 inputClass" name="p_Comment" style="height:80px"/>
            </td>
        </tr>
         	
          	<tr>
            	<td colspan="6">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                     <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
            </tr> 
         </tbody> 
   	  </table>
  </s:form>
</body>
</html>

