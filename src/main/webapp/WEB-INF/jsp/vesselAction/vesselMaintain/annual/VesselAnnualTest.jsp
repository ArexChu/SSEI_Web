<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>年度检查结论记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselAnnualTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="10" id="center"><b>压力容器年度检查记录附页</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
         
        <tr>
         	<td colspan="5">检查项目</td>
         	<td colspan="3">检查结果</td>
         	<td colspan="2">备注</td>
         </tr>
         
         <tr>
         	<td>1</td>
         	<td rowspan="10">安<br>全<br>管<br>理</td>
         	<td colspan="3">安全管理制度、安全操作规程</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_1" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_1_Reamrk" cssClass="span2 inputClass"></s:textfield>
         	</td>
         </tr>
         <tr>
         	<td>2</td>
         	<td colspan="3">设计、制造、安装、改造、维修等资料</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_2" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_2_Reamrk" cssClass="span2 inputClass"></s:textfield>
         	</td>
         </tr>
         <tr>
         	<td>3</td>
         	<td colspan="3">《使用登记表》、《使用登记证》</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_3" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_3_Reamrk" cssClass="span2 inputClass"></s:textfield>
         	</td>
         </tr>
         <tr>
         	<td>4</td>
         	<td colspan="3">作业人员持证情况</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_4" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_4_Reamrk" cssClass="span2 inputClass"></s:textfield>
         	</td>
         </tr>
         <tr>
         	<td>5</td>
         	<td colspan="3">日常维护保养、运行、定期安全检查记录</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_5" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_5_Reamrk" cssClass="span2 inputClass"></s:textfield>
         	</td>
         </tr>
         <tr>
         	<td>6</td>
         	<td colspan="3">年度检查、定期检验报告及问题处理情况</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_6" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_6_Reamrk" cssClass="span2 inputClass"></s:textfield>
         	</td>
         </tr>
         <tr>
         	<td>7</td>
         	<td colspan="3">安全附件校验、修理和更换记录</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_7" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_7_Reamrk" cssClass="span2 inputClass"></s:textfield>
         	</td>
         </tr>
         <tr>
         	<td>8</td>
         	<td colspan="3">移动式压力容器装卸记录</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_8" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_8_Reamrk" cssClass="span2 inputClass"></s:textfield>
         	</td>
         </tr>
         <tr>
         	<td>9</td>
         	<td colspan="3">应急预案和演练记录</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_9" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_9_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         <tr>
         	<td>10</td>
         	<td colspan="3">压力容器事故、故障情况记录</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_10" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_10_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
          <tr>
         	<td>11</td>
         	<td rowspan="12">容器<br>本体<br>及<br>运行<br>情况</td>
         	<td colspan="3">铭牌、漆色、标志和使用登记证的标注</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_11" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_11_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         <tr>
         	<td>12</td>
         	<td colspan="3">本体、接口（阀门、管路）部位、焊接接头缺陷情况检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_12" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_12_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
        
         
         
         <tr>
         	<td>13</td>
         	<td colspan="3">外表面腐蚀、结霜、结露情况检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_13" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_13_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         <tr>
         	<td>14</td>
         	<td colspan="3">隔热层检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_14" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_14_Reamrk" cssClass="span2 inputClass"></s:textfield>	</td>
         </tr>
         
         <tr>
         	<td>15</td>
         	<td colspan="3">检漏孔、信号孔检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_15" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_15_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         <tr>
         	<td>16</td>
         	<td colspan="3">压力容器与相邻管道或者构件异常振动、响声或者相互摩擦情况检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_16" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_16_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         <tr>
         	<td>17</td>
         	<td colspan="3">支承或者支座、基础、紧固螺栓检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_17" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_17_Reamrk" cssClass="span2 inputClass"></s:textfield>	</td>
         </tr>
         
         
         <tr>
         	<td>18</td>
         	<td colspan="3">排放（疏水、排污）装置检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_18" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_18_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         <tr>
         	<td>19</td>
         	<td colspan="3">运行期间超压、超温、超量等情况检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_19" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_19_Reamrk" cssClass="span2 inputClass"></s:textfield>	</td>
         </tr>
         
          <tr>
         	<td>20</td>
         	<td colspan="3">接地装置检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_20" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_20_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
         <tr>
         	<td>21</td>
         	<td colspan="3">监控措施是否有效实施情况检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_21" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_21_Reamrk" cssClass="span2 inputClass"></s:textfield>	</td>
         </tr>
         
         <tr>
         	<td>22</td>
         	<td colspan="3">快开门式压力容器安全联锁功能检查</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_22" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_22_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
        
        <tr>
         	<td>23</td>
         	<td rowspan="8">安<br>全<br>附<br>件</td>
         	<td colspan="3">压力表</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_23" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_23_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         <tr>
         	<td>24</td>
         	<td colspan="3">液位计</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_24" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_24_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
          <tr>
         	<td>25</td>
         	<td colspan="3">测温仪表</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_25" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_25_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
          <tr>
         	<td>26</td>
         	<td colspan="3">爆破片装置</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_26" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_26_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
          <tr>
         	<td>27</td>
         	<td colspan="3">安全阀</td>
         	<td colspan="3">
         	<s:radio name="v_Ann_27" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_27_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
          <tr>
         	<td>28</td>
         	<td colspan="3">易熔塞</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_28" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_28_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
          <tr>
         	<td>29</td>
         	<td colspan="3">导静电装置</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_29" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_29_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
          <tr>
         	<td>30</td>
         	<td colspan="3">紧急切断装置</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_30" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_30_Reamrk" cssClass="span2 inputClass"></s:textfield>	</td>
         </tr>
         <tr>
         	<td>31</td>
         	<td rowspan="3">专项<br>要求</td>
         	<td colspan="3">
         		<s:textfield name="v_Ann_31_Content" cssClass="span2 inputClass"></s:textfield>
         	
         	</td>
         	<td colspan="3">
         		<s:radio name="v_Ann_31" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         		<s:textfield name="v_Ann_31_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
          <tr>
         	<td>32</td>
         	<td colspan="3">
         		<s:textfield name="v_Ann_32_Content" cssClass="span2 inputClass"></s:textfield>
         		
         	</td>
         	<td colspan="3">
         	<s:radio name="v_Ann_32" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_32_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
         </tr>
         
         
          <tr>
         	<td>33</td>
         	<td colspan="3">
         		<s:textfield name="v_Ann_33_Content" cssClass="span2 inputClass"></s:textfield></td>
         	<td colspan="3">
         		<s:radio name="v_Ann_33" list="{'无', '合格','不合格'}"></s:radio>
         	</td>
         	<td colspan="2" >
         	<s:textfield name="v_Ann_33_Reamrk" cssClass="span2 inputClass"></s:textfield></td>
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
  