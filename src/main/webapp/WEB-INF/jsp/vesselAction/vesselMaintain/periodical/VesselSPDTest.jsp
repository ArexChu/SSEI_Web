<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>安全附件检验记录 </title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselSPDTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="7" id="center"><b>安全附件检验记录 </b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
  		<tr>
         	<td rowspan="3">安全阀</td>
         	<td>型  号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Valve_Type" />
         	</td>
         	<td>数  量</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Valve_Num" />
         	</td>
         </tr>
         
          <tr>
         	<td>校验日期</td>
         	<td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Valve_Check_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
         	</td>
         	<td>密封压力</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Valve_Seal_Pre"  />MPa
         	</td>
         </tr>
         
           <tr>
         	<td>整定压力</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Valve_Set_Pre"  />MPa
         	</td>
         	<td>安装位置</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Valve_Pos"  />
         	</td>
         </tr>
         <tr>
         	<td rowspan="3">爆破片装置</td>
         	<td>型  号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Rup_Type"  />
         	</td>
         	<td>数  量</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Rup_Num"  />
         	</td>
         </tr>
         
          <tr>
         	<td>规  格</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Rup_Spe" />
         	</td>
         	<td>更换周期要求</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Rup_Replace_Fre"  />
         	</td>
         </tr>
         
           <tr>
         	<td>更换日期</td>
         	<td colspan="2">
         	<div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Rup_Replace_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
         	</td>
         	<td>安装位置</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Rup_Pos"  />
         	</td>
         </tr>    
         <tr>
         	<td rowspan="3">压力表</td>
         	<td>量程</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_PreGage_Range"  />MPa
         	</td>
         	<td>数  量</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_PreGage_Num"  />
         	</td>
         </tr>
         
          <tr>
         	<td>精度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_PreGage_Acc" />
         	</td>
         	<td>检定日期</td>
         	<td colspan="2">
         	 <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_PreGage_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
         	</td>
         </tr>
         
           <tr>
         	<td>检定报告编号</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_PreGage_Rep_ID"  />
         	</td>
         	<td>安装位置</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_PreGage_Pos"  />
         	</td>
         </tr>
         <tr>
         	<td rowspan="4">紧急切断装置</td>
         	<td>型式及规格</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_ECOF_Type" />
         	</td>
         	<td>数  量</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_ECOF_Num" />
         	</td>
         </tr>
         
          <tr>
         	<td>耐压试验压力</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_ECOF_Pre" />MPa
         	</td>
         	<td>密闭试验压力</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_ECOF_Airt" /><span class="add-on"><i class="icon-calendar"/></span>MPa
         	</td>
         </tr>
         <tr>
         	<td>切断时间</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_ECOF_Cut" />S
         	</td>
         	<td>检修记录</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_ECOF_Man" />
         	</td>
         </tr>
         <tr>
         	<td>安装位置</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_ECOF_Pos" />
         	</td>
         	<td>外  观</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_ECOF_Appe" />
         	</td>
         </tr>
         
         
           
         <tr>
         	<td rowspan="3">液位（面）计</td>
         	<td>型  式</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_CG_Type" />
         	</td>
         	<td>数  量</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_CG_Num"  />
         	</td>
         </tr>
         
          <tr>
         	<td>容器充装量</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_CG_Content" />m3
         	</td>
         	<td>安装位置</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_CG_Pos" />
         	</td>
         </tr>
         <tr>
         	<td>外  观</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_CG_Appe" />
         	</td>
         	<td>误  差</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_CG_Error"  />
         	</td>
         </tr>
         <tr>
         	<td >测温仪表</td>
         	<td>型  号</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Tem_Type"  />
         	</td>
         	<td>有效期</td>
         	<td >
         	 <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Tem_Valid_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
         	</td>
         	<td>外观</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_Tem_Appe"  />
         	</td>
         </tr>
         <tr>
         	<td >气相软管</td>
         	<td>试验压力</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_AH_Pre"  />MPa
         	</td>
         	<td>试验介质</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_AH_Med"  />
         	</td>
         	<td>保压时间</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_AH_Time"  />min
         	</td>
         </tr>
         <tr>
         	<td >液相软管</td>
         	<td>试验压力</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_LPH_Pre"  />MPa
         	</td>
         	<td>试验介质</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_LPH_Med" />
         	</td>
         	<td>保压时间</td>
         	<td >
         		<s:textfield cssClass="span2 inputClass" name="v_LPH_Time"  />min
         	</td>
         </tr>  
         <tr>
         	<td>其他阀门、附件检验</td>
         	<td colspan="6" height="100px">
         	<s:textarea name="v_SPD_Others" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
         <tr>
         	<td>检验结果</td>
         	<td colspan="6" height="100px">
         	<s:textarea name="v_SPD_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
  	 	 <tr>
            <td colspan="1">检测</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_SPD_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="2">校对</td>
            <td colspan="2">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_SPD_Check_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>  
         <tr>
        	<td colspan="7">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 

    </table>
    </s:form>
</body>
</html>
  