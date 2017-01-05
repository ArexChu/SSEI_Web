<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>安全保护装置检查情况</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <style type="text/css">
			label {
				display: inline;
			}
		.span2{
		    width: 90%!important;
		}
		</style>
	
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span>
    
    
	<s:form  action="pipeSPDTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pipeMaintainId"></s:hidden>
         <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="9" id="center"><b>安全保护装置检查情况</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
        <tbody>
         <tr>
            <td colspan="9" id="center">压&nbsp;&nbsp;&nbsp;力&nbsp;&nbsp;&nbsp;表&nbsp;&nbsp;&nbsp;检&nbsp;&nbsp;&nbsp;查</td> 
        </tr>
        <tr>
           <td colspan="2">设计规定数</td>
           <td > 
           <s:textfield cssClass="span2 inputClass" name="pre_De_Num" />
           </td>
           <td >实际安装数</td>
           <td >
           <s:textfield cssClass="span2 inputClass" name="pre_Wo_Num" />
           </td>
           <td >安装位置</td>
           <td>
           <s:textfield cssClass="span2 inputClass" name="pre_Wo_Pos" />
           </td>
           <td>有效期</td>
           <td >
           <s:textfield cssClass="span2 inputClass" name="pre_Valid_Date" />
           </td>     
        </tr>   
        <tr>
			<td colspan="2">量程</td>
			<td>
			<s:textfield cssClass="span2 inputClass" name="pre_Range" />
			</td>
			<td>精度</td>
			<td>
			<s:textfield cssClass="span2 inputClass" name="pre_Acc" />
			</td>
			<td>表盘直径</td>
			<td>
			<s:textfield cssClass="span2 inputClass" name="pre_Dia" />
			</td>
			<td>外观质量</td>
			<td >
			<s:textfield cssClass="span2 inputClass" name="pre_Appe" />
			</td>
		 </tr>
		 
         <tr>
            <td colspan="9" id="center">测&nbsp;&nbsp;&nbsp;温&nbsp;&nbsp;&nbsp;仪&nbsp;&nbsp;&nbsp;表&nbsp;&nbsp;&nbsp;检&nbsp;&nbsp;&nbsp;查</td> 
         </tr>
         <tr>
             <td colspan="2">设计规定数</td>
             <td >
             <s:textfield cssClass="span2 inputClass" name="tem_De_Num" />
             </td>
             <td >实际安装数</td>
             <td>
             <s:textfield cssClass="span2 inputClass" name="tem_Wo_Num" />
             </td>
             <td >安装位置</td>
             <td>
             <s:textfield cssClass="span2 inputClass" name="tem_Wo_Pos" />
             </td>
             <td>有效期</td>
             <td>
             <s:textfield cssClass="span2 inputClass" name="tem_Valid_Date" />
             </td>
          </tr>
          <tr>
              <td colspan="2">量程</td>
              <td>
              <s:textfield cssClass="span2 inputClass" name="tem_Range" />
              </td>
              <td>精度</td>
              <td>
              <s:textfield cssClass="span2 inputClass" name="tem_Acc" />
              </td>
              <td>外观质量</td>
              <td>
              <s:textfield cssClass="span2 inputClass" name="tem_Appe" />
              </td>
              <td></td>
              <td></td>
          </tr>
          <tr>
              <td colspan="9" id="center">安&nbsp;&nbsp;&nbsp;全&nbsp;&nbsp;&nbsp;阀&nbsp;&nbsp;&nbsp;检&nbsp;&nbsp;&nbsp;查</td> 
          </tr>
          <tr>
            <td>设计要求</td>
            <td width="5%">数量</td>
            <td>
             <s:textfield cssClass="span2 inputClass"  name="valve_De_Num" />
            </td>
            <td>型号</td>
            <td>
             <s:textfield cssClass="span2 inputClass"  name="valve_De_Mod" />
            </td>
            <td>公称压力</td>
            <td>
             <s:textfield cssClass="span2 inputClass"  name="valve_De_Pre" />
            </td>
            <td>公称通径</td>
            <td>
             <s:textfield cssClass="span2 inputClass" name="valve_De_Dia" />
            </td>
         </tr>
         <tr>
            <td rowspan="4" id="white">检查情况</td>
            <td>数量</td>
            <td>
             <s:textfield cssClass="span2 inputClass" name="valve_Num" />
            </td>
            <td>型号</td>
            <td>
             <s:textfield cssClass="span2 inputClass" name="valve_Mod" />
            </td>
            <td>公称压力</td>
            <td>
             <s:textfield cssClass="span2 inputClass" name="valve_Pre" />
            </td>
            <td>公称通径</td>
            <td>
             <s:textfield cssClass="span2 inputClass" name="valve_Dia" />
            </td>
        </tr>
        <tr>
          <td>开启压力</td>
          <td>
           <s:textfield cssClass="span2 inputClass" name="valve_Start_Pre" />
          </td>
          <td>工作温度</td>
          <td>
           <s:textfield cssClass="span2 inputClass" name="valve_Wo_Tem" />
          </td>
          <td>工作介质</td>
          <td>
           <s:textfield cssClass="span2 inputClass" name="valve_Wo_Med" />
          </td>
          <td></td>
          <td></td>
       </tr>
       <tr>
           <td>外观质量</td>
           <td>
           <s:textfield cssClass="span2 inputClass"  name="valve_Appe" />
           </td>
           <td>有效期</td>
           <td>
           <s:textfield cssClass="span2 inputClass"  name="valve_Valid_Date" />
           </td>
           <td>铅封</td>
           <td>
           <s:textfield cssClass="span2 inputClass"  name="valve_Seal" />
           </td>
           <td></td>
           <td></td>
       </tr>
       <tr>
           <td>安装位置</td>
           <td>
           <s:textfield cssClass="span2 inputClass"  name="valve_Wo_Pos" />
           </td>
           <td>合格证编号</td>
           <td>
           <s:textfield cssClass="span2 inputClass"  name="valve_Cer_ID" />
           </td>
           <td>制造许可证</td>
           <td>
           <s:textfield cssClass="span2 inputClass"  name="valve_Man_ID" />
           </td>
           <td></td>
           <td></td>
       </tr>
       
  
       <tr>
          <td colspan="9" id="center">爆&nbsp;&nbsp;&nbsp;破&nbsp;&nbsp;&nbsp;片&nbsp;&nbsp;&nbsp;装&nbsp;&nbsp;&nbsp;置&nbsp;&nbsp;&nbsp;检&nbsp;&nbsp;&nbsp;查</td> 
       </tr>
       <tr>
           <td rowspan="2">设计要求</td>
           <td>数量</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_De_Num" />
           </td>
           <td>型号</td>
           <td>
             <s:textfield cssClass="span2 inputClass" name="rup_De_Mod" />
           </td>
           <td>规格</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_De_Norm" />
           </td>
           <td></td>
           <td></td>
        </tr>
        <tr>
           <td>爆破应力</td>
           <td>
             <s:textfield cssClass="span2 inputClass" name="rup_De_Stress" />
           </td>
           <td>公称直径</td>
           <td>
             <s:textfield cssClass="span2 inputClass" name="rup_De_Dia" />
           </td>
           <td>材料</td>
           <td>
             <s:textfield cssClass="span2 inputClass" name="rup_De_Ma" />
           </td>
           <td></td>
           <td></td>
        </tr>
        <tr>
           <td rowspan="3">检查情况</td>
           <td>数量</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_Num" />
           </td>
           <td>型号</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_Mod" />
           </td>
           <td>规格</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_Norm" />
           </td>
           <td></td>
           <td></td>
        </tr>
        <tr>
           <td>公称直径</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_Dia" />
           </td>
           <td>外观质量</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_Appe" />
           </td>
           <td>有效期</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_Valid_Date" />
           </td>
           <td></td>
           <td></td>
        </tr>
        <tr>
           <td>安装位置</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_Wo_Pos" />
           </td>
           <td>合格证编号</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_Cer_ID" />
           </td>
           <td>制造许可证</td>
           <td>
             <s:textfield cssClass="span2 inputClass"  name="rup_Man_ID" />
           </td>
           <td></td>
           <td></td>
        </tr>
        
        
        <tr>
            <td colspan="9" id="center">紧&nbsp;&nbsp;&nbsp;急&nbsp;&nbsp;&nbsp;切&nbsp;&nbsp;&nbsp;断&nbsp;&nbsp;&nbsp;阀&nbsp;&nbsp;&nbsp;检&nbsp;&nbsp;&nbsp;查</td> 
        </tr>
        <tr>   
            <td>制造厂家</td>
            <td colspan="2">
              <s:textfield cssClass="span2 inputClass" name="ecof_Man_Com" />
            </td>
            <td>制造许可证号</td>
            <td colspan="2">
              <s:textfield cssClass="span2 inputClass" name="ecof_Man_ID" />
            </td>
            <td>合格证编号</td>
            <td colspan="2">
              <s:textfield cssClass="span2 inputClass"  name="ecof_Cer_ID" />
            </td>
        </tr>
        <tr>
            <td>型式及规格</td>
             <td colspan="2">
               <s:textfield cssClass="span2 inputClass"  name="ecof_Norm" />
             </td>
            <td>切段时间</td>
             <td colspan="2">
               <s:textfield cssClass="span2 inputClass"  name="ecof_Cut_Time" />
             </td>
            <td>有效期</td>
             <td colspan="2">
               <s:textfield cssClass="span2 inputClass"  name="ecof_Valid_Date" />
             </td>
        </tr>
        <tr>
            <td>耐压试验</td>
            <td colspan="2">
               <s:textfield cssClass="span2 inputClass"  name="ecof_Pre_Test" />
            </td>
            <td>密封压力试验</td>
            <td colspan="2">
              <s:textfield cssClass="span2 inputClass"  name="ecof_Seal_Pre" />
            </td>
            <td>铅封</td>
            <td colspan="2">
              <s:textfield cssClass="span2 inputClass"  name="ecof_Seal" />
            </td>
        </tr>
        <tr>
            <td >备注</td>
            <td colspan="8">
             <s:textarea cssClass="span8 inputClass" name="ecof_Remark" style="height:80px"/>
            </td>
        </tr>
        <tr>
            <td >日期</td>
            <td colspan="9">
            <div class="input-append">
                 <s:textfield  cssClass="datepicker inputClass" name="p_Mac_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
          </tr>

         <tr>
        	<td colspan="9">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 
        </tbody>
    </table>
    </s:form>
</body>
</html>
  