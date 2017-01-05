<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道全面检验结论</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>    			
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="pipeVerification_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pipeMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>管道全面检验结论</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
 		<tr>
              <td rowspan="2">检验检测项目<font color="FF0000"></font></td>
              <td>原始资料</td>
              <td >
                <input name="m_Original_Data_Temp" class="temp" type="checkbox" value="有" />
                  	有
				<input name="m_Original_Data_Temp" class="temp" type="checkbox" value="部分" />
                  	部分
                <input name="m_Original_Data_Temp" class="temp" type="checkbox" value="无" />
                  	无
                <s:hidden cssClass="hiddenBox" id="m_Original_Data" name="m_Original_Data"/>
              </td>
              <td>规章制度<font color="FF0000"></font></td>
              <td >
                <input name="m_Rules_Temp" class="temp" type="checkbox" value="有" />
                  	有
				<input name="m_Rules_Temp" class="temp" type="checkbox" value="不健全" />
                  	不健全
                <input name="m_Rules_Temp" class="temp" type="checkbox" value="无" />
                  	无
                <s:hidden cssClass="hiddenBox" id="m_Rules" name="m_Rules"/>
              </td>
         </tr>           
		 <tr>
           	  <td colspan="5">
           		<input name="m_Items_Temp" class="temp" type="checkbox" value="宏观检验" />
                   	宏观检验
           		<input name="m_Items_Temp" class="temp" type="checkbox" value="管道测厚" />
                   	管道测厚
           		<input name="m_Items_Temp" class="temp" type="checkbox" value="射线探伤" />
                   	射线探伤
                <input name="m_Items_Temp" class="temp" type="checkbox" value="超声探伤" />
                   	超声探伤
           		<input name="m_Items_Temp" class="temp" type="checkbox" value="磁粉探伤" />
                   	磁粉探伤
                <input name="m_Items_Temp" class="temp" type="checkbox" value="渗透探伤" />
                   	渗透探伤<br/> 	  	
                <input name="m_Items_Temp" class="temp" type="checkbox" value="材料分析" />
                   	材料分析   	
                <input name="m_Items_Temp" class="temp" type="checkbox" value="硬度测定" />
                   	硬度测定
                <input name="m_Items_Temp" class="temp" type="checkbox" value="压力试验" />
                   	压力试验 
                <input name="m_Items_Temp" class="temp" type="checkbox" value="泄漏试验" />
                   	泄漏试验     	
                <input name="m_Items_Temp" class="temp" type="checkbox" value="安全附件检查" />
                   	安全附件检查    	
                <input name="m_Items_Temp" class="temp" type="checkbox" value="单线图" />
                   	单线图   	     	
                <s:hidden cssClass="hiddenBox" id="m_Items" name="m_Items" />   	   	
           	</td>
        </tr>  
         
        <tr>
            	<td>安全状况等级</td>
				<td colspan="2">
				<s:textfield name="m_Gra" cssClass="span2 inputClass" />
				</td>
				<td>最高工作压力</td>
				<td colspan="2">
				<s:textfield name="m_Max_Pre" cssClass="span2 inputClass" />
				</td>            
         </tr>
         <tr>
            	<td>工作温度</td>
				<td colspan="2">
				
				<s:textfield name="m_Tem" cssClass="span2 inputClass" />
				</td>
				<td>介质</td>
				<td colspan="2">
				<s:textfield name="m_Med" cssClass="span2 inputClass"  />
				</td>            
         </tr>
         <tr>
            	<td>监控使用的限制性条件</td>
				<td colspan="2">
				<s:textfield name="m_Limit" cssClass="span2 inputClass" />
				</td>
				<td>判废依据</td>
				<td colspan="2">
				<s:textfield name="m_Reasion" cssClass="span2 inputClass" />
				</td>            
          </tr>
            <tr>
				<td >下次全面检验日期</td>
	            <td colspan="2">
	            <div class="input-append">
	                <s:textfield  cssClass="datepicker inputClass required" name="nextDetailMaintainDate"/>
	                <span class="add-on"><i class="icon-calendar"></i></span>
	            </div>
	            </td>				
				<td></td>
				<td colspan="2">
				</td>            
            </tr>
             <tr>
            	<td>其它</td>
				<td colspan="5" >
				<s:textarea name="m_Others" cssClass="span2 inputClass" style="height:90px"/>
				</td>           
            </tr> 
            <tr>
            	<td>检验使用的设备名称及编号</td>
				<td colspan="5" >
				<s:textarea name="m_Test_Equ" cssClass="span2 inputClass" style="height:90px"/>
				</td>           
            </tr>
            <tr>
            	<td>其他需要说明的检验情况</td>
				<td colspan="5" >
				<s:textarea name="m_Test_Remark" cssClass="span2 inputClass" style="height:90px"/>
				</td>           
            </tr> 
            <tr>
            	<td>本次检验问题记载</td>
				<td colspan="5" >
				<s:textarea name="m_Bas_Prob" cssClass="span2 inputClass" style="height:90px"/>
				</td>           
            </tr>           
  			<tr>
	            <td >检验</td>
	            <td colspan="2">
	            <div class="input-append">
	                 <s:textfield  cssClass="datepicker inputClass" name="m_Test_Date"/>
	                 <span class="add-on"><i class="icon-calendar"></i></span>
	            </div>
	            </td>
	            <td >校核</td>
	            <td colspan="2">
	            <div class="input-append">
	                 <s:textfield  cssClass="datepicker inputClass" name="m_Check_Date"/>
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
  