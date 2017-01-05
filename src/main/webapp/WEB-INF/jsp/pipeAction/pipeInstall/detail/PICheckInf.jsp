<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>工作内容及工作基本情况记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>    			
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="piCheckInf_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>工作内容及工作基本情况记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
  		<tr>
         	<td width="5%">序号</td>
         	<td colspan="3">监督检验项目</td>
         	<td width="5%">类别</td>
         	<td colspan="2">
         		检查结果
         	</td>
         	<td width="10%">工作见证</td>
         	<td colspan="2">确认日期</td>
         </tr>
         <tr>
         	<td>1</td>
         	<td colspan="3">安装告知书</td>
         	<td>A</td>
         	<td colspan="2">
                <s:radio name="pi_Check1_inf" list="{'无', '合格', '不合格'}"></s:radio>  
         	</td>
         	<td>告知书</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check1_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>           
         <tr>
         	<td>2</td>
         	<td colspan="3">设计单位资质及图纸审查</td>
         	<td>C</td>
         	<td colspan="2">
                <s:radio name="pi_Check2_inf" list="{'无', '合格', '不合格'}"></s:radio>  
         	</td>
         	<td>图纸</td>
         	<td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check2_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>    
            </td>     	
         </tr>
         <tr>
         	<td>3</td>
         	<td colspan="3">设计变更及材料代用手续</td>
         	<td>C</td>
         	<td colspan="2">
         	 	<s:radio name="pi_Check3_inf" list="{'无', '合格', '不合格'}"></s:radio>  
         	</td>
         	<td>修改单</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check3_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>
         <tr>
         	<td>4</td>
         	<td colspan="3">施工方案及焊接工艺评定</td>
         	<td>B</td>
         	<td colspan="2">
         	  	<s:radio name="pi_Check4_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>方案、评定</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check4_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>
         <tr>
         	<td>5</td>
         	<td colspan="3">焊接、探伤人员资格审查</td>
         	<td>B</td>
         	<td colspan="2">
         	 	<s:radio name="pi_Check5_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>证书</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check5_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>
          <tr>
         	<td>6</td>
         	<td colspan="3">管道元件、焊接材料质量证明文件</td>
         	<td>B</td>
         	<td colspan="2">
         	    <s:radio name="pi_Check6_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>质量证明书</td>
         	<td colspan="2">
       		<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check6_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>
          <tr>
         	<td>7</td>
         	<td colspan="3">阀门强度与密封性试验</td>
         	<td>C</td>
         	<td colspan="2">
         	  	<s:radio name="pi_Check7_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check7_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>
          <tr>
         	<td>8</td>
         	<td colspan="3">管道布置及焊缝检查</td>
         	<td>C</td>
         	<td colspan="2">
         	  	<s:radio name="pi_Check8_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check8_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>
          <tr>
         	<td>9</td>
         	<td colspan="3">支吊架安装质量检查</td>
         	<td>C</td>
         	<td colspan="2">
         	  	<s:radio name="pi_Check9_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check9_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>
         <tr>
         	<td>10</td>
         	<td colspan="3">可拆件/补偿器/阀门/法兰安装质量抽查</td>
         	<td>C</td>
         	<td colspan="2">
         	  	<s:radio name="pi_Check10_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check10_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>           
  <tr>
         	<td>11</td>
         	<td colspan="3">射线底片抽审</td>
         	<td>A</td>
         	<td colspan="2">
         		<s:radio name="pi_Check11_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>复评记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check11_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>
         <tr>
         	<td>12</td>
         	<td colspan="3">无损检测结果质量评定</td>
         	<td>C</td>
         	<td colspan="2">
         		<s:radio name="pi_Check12_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>检测报告</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check12_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>	
			</td>
         </tr>
           <tr>
         	<td>13</td>
         	<td colspan="3">管道强度试验</td>
         	<td>A</td>
         	<td colspan="2">
         		<s:radio name="pi_Check13_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check13_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
			</td>
         </tr>
          <tr>
         	<td>14</td>
         	<td colspan="3">管道泄漏性试验</td>
         	<td>C</td>
         	<td colspan="2">
         		<s:radio name="pi_Check14_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check14_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>		
			</td>
         </tr>
          <tr>
         	<td>15</td>
         	<td colspan="3">管道附属设备安装质量</td>
         	<td>C</td>
         	<td colspan="2">
         		<s:radio name="pi_Check15_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check15_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>	
			</td>
         </tr>
          <tr>
         	<td>16</td>
         	<td colspan="3">防静电设施安装质量</td>
         	<td>C</td>
         	<td colspan="2">
         		<s:radio name="pi_Check16_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check16_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>		
			</td>
         </tr>
          <tr>
         	<td>17</td>
         	<td colspan="3">管道吹扫、清洗、通球质量</td>
         	<td>C</td>
         	<td colspan="2">
         		<s:radio name="pi_Check17_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check17_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>	
			</td>
         </tr>
         <tr>
         	<td>18</td>
         	<td colspan="3">管道防腐、绝热施工质量抽查</td>
         	<td>C</td>
         	<td colspan="2">
         	<s:radio name="pi_Check18_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check18_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>	
			</td>
         </tr>
         <tr>
         	<td>19</td>
         	<td colspan="3">管道安全附件检查</td>
         	<td>C</td>
         	<td colspan="2">
         		<s:radio name="pi_Check19_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>施工记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check19_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>	
			</td>
         </tr>
         <tr>
         	<td>20</td>
         	<td colspan="3">相关单位安全质量管理行为</td>
         	<td>B</td>
         	<td colspan="2">
         		<s:radio name="pi_Check20_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>评价记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check20_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>	
			</td>
         </tr>
          <tr>
         	<td>21</td>
         	<td colspan="3">安装竣工技术文件审查</td>
         	<td>C</td>
         	<td colspan="2">
         		<s:radio name="pi_Check21_inf" list="{'无', '合格', '不合格'}"></s:radio> 
         	</td>
         	<td>审查记录</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Check21_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>		
			</td>
         </tr>  
                 
		 <tr>
         	<td>结论</td>
         	<td colspan="9" >
         	<s:textarea name="pi_Check_Result" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         <tr>
         	<td>备注</td>
         	<td colspan="9" >
         	<s:textarea name="pi_Check_Remark" cssClass="span2 inputClass" style="height:90px"/>
         	</td>
         </tr>
         <tr>
         	<td colspan="2">监检人员</td>
         	<td colspan="3">
         		<s:textfield cssClass="span2 inputClass" name="pi_Check_Per" />
         	</td>
         	<td colspan="2">日期</td>
         	<td colspan="3">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_CheckInf_Date"/>
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
  