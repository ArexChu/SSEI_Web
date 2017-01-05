<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道安全等级评估</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>    				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="pipeAssTable_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pipeMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>管道安全等级评估</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tr>
            <td colspan="2"> 检 查 项  目</td>
            <td colspan="2"> 检 查 情 况 概 述</td>
            <td colspan="2"> 由该项目确定的安全状况等级</td>
        </tr>
        <tr>
        	<td colspan="2">管道位置及结构</td>
        	 <td colspan="2"> 
        	 <s:textfield cssClass="span2 inputClass" name="p_pos_Sum" />
        	 </td>
        	 <td colspan="2">
        	 <s:textfield cssClass="span2 inputClass" name="p_pos_Gra" />
        	 </td>
        </tr>
        <tr>
        	<td rowspan="4">管道材质</td>
        	<td>与设计不符</td>
        	 <td colspan="2">
        	 <s:textfield cssClass="span2 inputClass" name="p_Ma_Sum_1" />
        	 </td>
        	 <td colspan="2"> 
        	 <s:textfield cssClass="span2 inputClass" name="p_Ma_Gra_1" />
        	 </td>
        </tr>
         <tr> 
        	<td>材质不明</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Ma_Sum_2"/>
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Ma_Gra_2" />
        	 </td>
        </tr>
        <tr> 
        	<td>材质劣化损伤</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Ma_Sum_3" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass"  name="p_Ma_Gra_3" />
        	 </td>
        </tr>
        <tr> 
        	<td>硬度异常</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Ma_Sum_4" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Ma_Gra_4" />
        	 </td>
        </tr>
        <tr>
        	<td colspan="2">管子及管件全面减薄</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Thi_Sum" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Thi_Gra" />
        	 </td>
        </tr>
         <tr>
        	<td colspan="2">管子局部减薄</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Thi_Part_Sum" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Thi_Part_Gra" />
        	 </td>
        </tr>
         <tr>
        	<td rowspan="7">管子焊接缺陷</td>
        	<td>裂纹</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Sum_1" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Gra_1" />
        	 </td>
        </tr>
          <tr>
             <td>咬边</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Sum_2" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Gra_2" />
        	 </td>
        </tr>
        <tr>
             <td>气孔</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Sum_3" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Gra_3" />
        	 </td>
        </tr>
        <tr>
             <td>夹渣</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Sum_4" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Gra_4" />
        	 </td>
        </tr>
        <tr>
             <td>未焊透</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Sum_5" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Gra_5" />
        	 </td>
        </tr>
        <tr>
             <td>未熔合</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Sum_6" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Gra_6" />
        	 </td>
        </tr>
        <tr>
             <td>错边</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Sum_7" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Wel_Gra_7" />
        	 </td>
        </tr>
         <tr>
        	<td rowspan="4">组成件其它异常</td>
        	<td>裂纹、皱褶、重皮</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Component_Sum_1" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Component_Gra_1" />
        	 </td>
        </tr>
        <tr>
        	<td>碰伤</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Component_Sum_2" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Component_Gra_2" />
        	 </td>
        </tr>
        <tr>
        	<td>变形</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Component_Sum_3" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Component_Gra_3" />
        	 </td>
        </tr>
         <tr>
        	<td>损坏</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Component_Sum_4" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Component_Gra_4" />
        	 </td>
        </tr>
          <tr>
        	<td colspan="2">吊支架异常</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Hanger_Sum" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Hanger_Gra" />
        	 </td>
        </tr>
        <tr>
        	<td rowspan="2">附属设施</td>
        	<td>安全保护装置</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Other_Sum_1" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Other_Gra_1" />
        	 </td>
        </tr>
          <tr>
        	<td>其它附属装置</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Other_Sum_2" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Other_Gra_2" />
        	 </td>
        </tr>
         <tr>
        	<td >压力试验</td>
        	<td >报告编号</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Pretest_Rep" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Pretest_Gra" />
        	 </td>
        </tr>
         <tr>
        	<td >泄漏试验</td>
        	<td >报告编号</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Leaktest_Rep" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Leaktest_Gra" />
        	 </td>
        </tr>
        <tr>
        	<td >无损检测</td>
        	<td >报告编号</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_NDEtest_Rep" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_NDEtest_Gra" />
        	 </td>
        </tr>
         <tr>
        	<td >金相检测</td>
        	<td >报告编号</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Mettest_Rep" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Mettest_Gra" />
        	 </td>
        </tr>
        <tr>
        	<td >材料成分分析</td>
        	<td >报告编号</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Ma_Ana_Rep" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Ma_Ana_Gra" />
        	 </td>
        </tr>
        <tr>
        	<td >硬度检测</td>
        	<td >报告编号</td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Hardtest_Rep" />
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Hardtest_Gra" />
        	 </td>
        </tr>
        <tr>
        	<td colspan="2">管道安全等级评定</td>
        	
        	 <td colspan="2"> ※项目中最低的评定级别为综合评定等级
        	 </td>
        	 <td colspan="2"> <s:textfield cssClass="span2 inputClass" name="p_Safe_Ass_Gra" />
        	 </td>
        </tr>
     <tr>
     <td>备注</td>
        <td colspan="5">
         <s:textarea name="p_Ass_Remark" cssClass="span2 inputClass" style="height:90px"/>
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
  