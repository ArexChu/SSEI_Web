<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>在用工业管道在线检验记录（2）</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		  <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/tableCreater.js"></script> 		
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="pipeOnlineSubTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pipeMaintainId"></s:hidden>
		<s:hidden name="onlineid"></s:hidden>
		<s:hidden id="tablevalue" name="p_Thi_Value"></s:hidden>
         <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="6" id="center"><b>在线检验记录2</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
            <tr>
        		<td>资料准备</td>
        		<td colspan="5">
        		<input name="m_OL_Prep_Temp" class="temp"  type="checkbox" value="管道平面布置图" />
                    	管道平面布置图
 					<input name="m_OL_Prep_Temp"  class="temp"  type="checkbox" value="管道工艺流程图" />
                    	管道工艺流程图
                    <input name="m_OL_Prep_Temp" class="temp"  type="checkbox" value="单线图" />
                    	单线图
                     <input name="m_OL_Prep_Temp"  class="temp"  type="checkbox" value="历次在线检验报告" />
                    	历次在线检验报告
                   	 <input name="m_OL_Prep_Temp"  class="temp"  type="checkbox" value="历次全面检验报告" />
                    	历次全面检验报告
                    <input name="m_OL_Prep_Temp" class="temp"   type="checkbox" value="运行参数等技术资料" />
                    	运行参数等技术资料
                    <s:hidden name ="m_OL_Prep" cssClass="hiddenBox" id="m_OL_Prep"></s:hidden>	 
        		</td>
        	</tr>
        	<tr>
        		<td>记录审查</td>
        		<td colspan="5">
        		<input name="m_OL_Check_Temp"  class="temp" type="checkbox" value="管道运行记录" />
                    	管道运行记录
 					<input name="m_OL_Check_Temp"  class="temp" type="checkbox" value="管道开停车记录" />
                    	管道开停车记录
                    <input name="m_OL_Check_Temp"   class="temp" type="checkbox" value="管道隐患监护措施实施情况记录" />
                    	管道隐患监护措施实施情况记录
                     <input name="m_OL_Check_Temp"  class="temp" type="checkbox" value="管道改造施工记录" />
                    	管道改造施工记录
                   	 <input name="m_OL_Check_Temp"  class="temp" type="checkbox" value="检修报告" />
                    	检修报告
                    <input name="m_OL_Check_Temp"  class="temp" type="checkbox" value="管道事故处理记录" />
                    	管道事故处理记录
                    <input name="m_OL_Check_Temp"  class="temp" type="checkbox" value="检验方案" />
                    	检验方案	
                     <s:hidden name ="m_OL_Check" cssClass="hiddenBox" id="m_OL_Check"></s:hidden>	 
        		</td>
        	</tr>
        	<tr>
        		<td>问题记载</td>
        		<td colspan="5" height='110px'>
        		 <s:textarea cssClass="span2 inputClass" name="m_Bas_Prob"  style="height:90px"/>
        		</td>
        	</tr>
        <tr>
        		<td colspan="6" >
        		检查项目及检查结果
        		</td>
        </tr>
        <tr>
        	<td>管道表面</td>
        	<td>
        	<s:textfield cssClass="span2 inputClass" name="p_Surface" />
			</td>
			<td>焊接接头</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Wel" />
			</td>
			<td>泄漏</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Leak" />
			</td>
        </tr>
        <tr>
        	<td>绝热层</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Ins" />
			</td>
			<td>防腐层</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Pro" />        
			</td>
			<td>管道振动</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Vib" />   
			</td>
        </tr>
          <tr>
        	<td>支吊架</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Hanger" />   
			</td>
			<td>阀  门</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Valve" />   
			</td>
			<td>膨胀节</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Exp" />           
			</td>
        </tr>
          <tr>
        	<td>法兰</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Fla" /> 
			</td>
			<td>管道结构</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Str" /> 
			</td>
			<td>管道标识</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Ide" /> 
			</td>
        </tr>
          <tr>
        	<td>法兰间接触电阻</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Fla_Res" /> 
			</td>
			<td>对地电阻</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Gro_Res" />   
			</td>
			<td>壁厚测定</td>
        	<td>
        		<s:textfield cssClass="span2 inputClass" name="p_Thi" /> 
			</td>
        </tr>
          <tr>
        	<td>其它</td>
        	<td >
        		<s:textfield cssClass="span2 inputClass" name="p_Other" /> 
			</td>
			<td>下次在线检验日期</td>
				<td>
					<div class="input-append">
                     <s:textfield  cssClass="datepicker inputClass" name="nextOnlineMaintainDate"/>
                     <span class="add-on"><i class="icon-calendar"></i></span>
                </div>
			</td>
        </tr>
        <tr>
        	<td rowspan="2">安全保护装置</td>
        	<td>压力表</td>
        	<td>测温仪表</td>
        	<td>安全阀</td>
        	<td>爆破片装置</td>
        	<td>其它</td>
        </tr>
        <tr>
        	<td><s:textfield  cssClass="span2 inputClass" name="m_OL_Pre"/></td>
        	<td><s:textfield  cssClass="span2 inputClass" name="m_OL_Tem"/></td>
        	<td><s:textfield  cssClass="span2 inputClass" name="m_OL_Valve"/></td>
        	<td><s:textfield  cssClass="span2 inputClass" name="m_OL_Rup"/></td>
        	<td><s:textfield  cssClass="span2 inputClass" name="m_OL_Others"/></td>
        </tr>
   <tr>
        		<td>缺陷情况说明</td>
        		<td colspan="5" height='110px'>
        		 <s:textarea cssClass="span2 inputClass" name="m_OL_Bug" style="height:90px" />
        		</td>
        	</tr>
        	  <tr>
        		<td>缺陷处理情况说明</td>
        		<td colspan="5" height='110px'>
        		 <s:textarea cssClass="span2 inputClass" name="m_OL_Bug_Sol" style="height:90px" />
        		</td>
        	</tr>
        	 <tr>
        		<td>检验结果</td>
        		<td colspan="5" height='110px'>
        		 <s:textarea cssClass="span2 inputClass" name="m_OL_Result" style="height:90px" />
        		</td>
        	</tr>
        	<tr>
            	<td>检验</td>
				<td colspan="2">
				<div class="input-append">
                     <s:textfield  cssClass="datepicker inputClass" name="m_Test_Date"/>
                     <span class="add-on"><i class="icon-calendar"></i></span>
                </div>
				</td>
				<td>校核</td>
				<td colspan="2">
				<div class="input-append">
                     <s:textfield  cssClass="datepicker inputClass" name="m_Check_Date"/>
                     <span class="add-on"><i class="icon-calendar"></i></span>
                </div>
				</td>            
            </tr>   
         <tr>
        	<td colspan="6">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 

    </table>
    </s:form>
</body>
</html>
  