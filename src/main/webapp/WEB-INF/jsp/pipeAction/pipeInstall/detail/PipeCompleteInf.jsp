<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道安装竣工资料审查报告记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>    				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="pipeCompleteInf_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="installId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>管道安装竣工资料审查报告记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
 		<tr>
         	<td>序号</td>
         	<td colspan="4" width="35%">文    件    名    称</td>
         	<td colspan="3">审查结果</td>
         	<td colspan="2">结果说明</td>
        </tr>
        <tr>
         	<td>1</td>
         	<td colspan="4">特种设备安装改造维修告知书</td>
         	<td colspan="3">
         		<s:radio name="pi_EquIns_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_EquIns_Result" />
			</td>
        </tr>  
        <tr>
         	<td>2</td>
         	<td colspan="4">安装单位现场质保体系及人员任命书</td>
         	<td colspan="3">
         		<s:radio name="pi_Assur_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="pi_Assur_Result" />
			</td>
         </tr>
         
         <tr>
         	<td>3</td>
         	<td colspan="4">设计图纸及其技术要求（说明）</td>
         	<td colspan="3">
         		<s:radio name="pi_Explain_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Explain_Result" />
			</td>
         </tr>
         
         <tr>
         	<td>4</td>
         	<td colspan="4">施工组织设计（或施工方案）</td>
         	<td colspan="3">
         		<s:radio name="pi_Cons_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Cons_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>5</td>
         	<td colspan="4">焊接工艺规程（焊接作业指导书）</td>
         	<td colspan="3">
         		<s:radio name="pi_Wel_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Wel_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>6</td>
         	<td colspan="4">无损检测工艺和方案</td>
         	<td colspan="3">
         		<s:radio name="pi_NDE_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_NDE_Result" />
			</td>
         </tr>
         
         <tr>
         	<td>7</td>
         	<td colspan="4">压力管道焊工汇总登记表及其资格复印件</td>
         	<td colspan="3">
         		<s:radio name="pi_WelReg_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_WelReg_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>8</td>
         	<td colspan="4">无损检测人员汇总登记表及其资格复印件</td>
         	<td colspan="3">
         		<s:radio name="pi_NDEBook_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_NDEBook_Result" />
			</td>
         </tr>
         
         <tr>
         	<td>9</td>
         	<td colspan="4">管道组成件（含焊材）质证书及检查验收记录</td>
         	<td colspan="3">
         		<s:radio name="pi_Compon_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Compon_Result" />
			</td>
         </tr>
         
         <tr>
         	<td>10</td>
         	<td colspan="4">管道组成件理化试验报告</td>
         	<td colspan="3">
         		<s:radio name="pi_Compon_Rep_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Compon_Rep_Result" />
			</td>
         </tr>
         
         
          <tr>
         	<td>11</td>
         	<td colspan="4">管件加工记录</td>
         	<td colspan="3">
         		<s:radio name="pi_Proc_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Proc_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>12</td>
         	<td colspan="4">阀门试验记录</td>
         	<td colspan="3">
         		<s:radio name="pi_Valve_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Valve_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>13</td>
         	<td colspan="4">组对安装施工记录录</td>
         	<td colspan="3">
         		<s:radio name="pi_InsCons_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_InsCons_Result" />
			</td>
         </tr>
         
         
         <tr>
         	<td>14</td>
         	<td colspan="4">管道焊接施工记录</td>
         	<td colspan="3">
         		<s:radio name="pi_WelCons_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_WelCons_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>15</td>
         	<td colspan="4">补偿装置安装记录</td>
         	<td colspan="3">
         		<s:radio name="pi_compen_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_compen_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>16</td>
         	<td colspan="4">支、吊架安装记录</td>
         	<td colspan="3">
         		<s:radio name="pi_Hanger_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Hanger_Result" />
			</td>
         </tr>
         
         <tr>
         	<td>17</td>
         	<td colspan="4">隐蔽工程（封闭）记录录</td>
         	<td colspan="3">
         		<s:radio name="pi_Hidden_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Hidden_Result" />
			</td>
         </tr>
          <tr>
         	<td>18</td>
         	<td colspan="4">管道焊缝热处理报告</td>
         	<td colspan="3">
         		<s:radio name="pi_WelHeat_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_WelHeat_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>19</td>
         	<td colspan="4">无损检测报告</td>
         	<td colspan="3">
         		<s:radio name="pi_NDERep_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_NDERep_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>20</td>
         	<td colspan="4">强度及泄漏性试验报告</td>
         	<td colspan="3">
         		<s:radio name="pi_LeakRep_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_LeakRep_Result" />
			</td>
         </tr>
         
         <tr>
         	<td>21</td>
         	<td colspan="4">通球、吹扫及清洗记录</td>
         	<td colspan="3">
         		<s:radio name="pi_DryRep_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_DrykRep_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>22</td>
         	<td colspan="4">安全保护装置调试记录</td>
         	<td colspan="3">
         	<s:radio name="pi_SafeEqu_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_SafeEqu_Result" />
			</td>
         </tr>
         
         <tr>
         	<td>23</td>
         	<td colspan="4">防腐施工、绝缘测试记录</td>
         	<td colspan="3">
         		<s:radio name="pi_ProTest_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_ProTest_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>24</td>
         	<td colspan="4">静电测试记录</td>
         	<td colspan="3">
         		<s:radio name="pi_Sta_Ele_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="pi_Sta_Ele_Result" />
			</td>
         </tr>
         
          <tr>
         	<td>25</td>
         	<td colspan="4">保温施工记录</td>
         	<td colspan="3">
         	<s:radio name="pi_InsTem_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass"  name="pi_InsTem_Result" />
			</td>
         </tr>
         
           <tr>
         	<td>26</td>
         	<td colspan="4">设计变更通知（确认）单</td>
         	<td colspan="3">
         		<s:radio name="pi_Change_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Change_Result" />
			</td>
         </tr>
         <tr>
         	<td>27</td>
         	<td colspan="4">竣工图（包含单线图）</td>
         	<td colspan="3">
         		<s:radio name="pi_Complete_Pic_Check" list="{'符合要求', '不符合要求'}"></s:radio> 
			</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="pi_Complete_Pic_Result" />
			</td>
         </tr>            
 		<tr>
         	<td>备注</td>
         	<td colspan="8" >
         	<s:textarea name="pi_Complete_Remark" cssClass="span2 inputClass" style="height:100px"/>
         	</td>
         </tr>
         <tr>
         	<td >监检人员</td>
         	<td colspan="4">
         		<s:textfield cssClass="span2 inputClass" name="pi_Complete_Per" />
         	</td>
         	<td colspan="3">日期</td>
         	<td colspan="2">
         		<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="pi_Complete_Date"/>
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
  