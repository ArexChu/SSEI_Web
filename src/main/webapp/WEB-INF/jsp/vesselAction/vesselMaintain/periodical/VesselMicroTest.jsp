<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>压力容器宏观检验记录</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script>   	 				
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>检验信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="vesselMicroTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="vesselMaintainId"></s:hidden>
        <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="10" id="center"><b>压力容器宏观检验记录</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
          <tr>
         	<td>序号</td>
         	<td colspan="5" >检    验    项    目</td>
         	<td colspan="2" >检验结果</td>
         	<td colspan="2" width="30%">备注</td>
         </tr>
         <tr>
         	<td>1</td>
         	<td rowspan="6">结构检验</td>
         	<td colspan="4">封头型式</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_1" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_1_Remark" />
			</td>
         </tr>
         <tr>
         	<td>2</td>
         	<td colspan="4">封头与筒体的连接</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_2" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_2_Remark" />
			</td>
         </tr>
         <tr>
         	<td>3</td>
         	<td colspan="4">开孔位置及补强</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_3" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_3_Remark" />
			</td>
         </tr>
         <tr>
         	<td>4</td>
         	<td colspan="4">纵/（环）焊缝的布置及型式</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_4" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_4_Remark" />
			</td>
         </tr>
         <tr>
         	<td>5</td>
         	<td colspan="4">支承或者支座的型式与布置</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_5" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_5_Remark" />
			</td>
         </tr>
         <tr>
         	<td>6</td>
         	<td colspan="4">排放（疏水、排污）装置的设置</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_6" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Str_6_Remark" />
			</td>
         </tr>
         
         
          <tr>
         	<td>7</td>
         	<td rowspan="5">几何尺寸检验</td>
         	<td colspan="4">筒体同一断面上最大内径与最小内径之差</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_1" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_1_Remark" />
			</td>
         </tr>
         <tr>
         	<td>8</td>
         	<td colspan="4">纵/（环）焊缝最大对口错边量</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_2" />mm
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_2_Remark" />
			</td>
         </tr>
         <tr>
         	<td>9</td>
         	<td colspan="4">纵/（环）焊缝最大棱角度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_3" />mm
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_3_Remark" />
			</td>
         </tr>
         <tr>
         	<td>10</td>
         	<td colspan="4">纵/（环）焊缝最大咬边</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_4" />mm
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_4_Remark" />
			</td>
         </tr>
         <tr>
         	<td>11</td>
         	<td colspan="4">纵/（环）焊缝最大余高</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_5" />mm
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Geo_5_Remark" />
			</td>
         </tr>

         <tr>
         	<td>12</td>
         	<td rowspan="10">壳体外观检验</td>
         	<td colspan="4">铭牌和标志</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_1" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_1_Remark" />
			</td>
         </tr>
         <tr>
         	<td>13</td>
         	<td colspan="4">内外表面的腐蚀</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_2" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_2_Remark" />
			</td>
         </tr>
         <tr>
         	<td>14</td>
         	<td colspan="4">裂纹、泄漏、鼓包、变形、机械接触损伤、过热</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_3" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_3_Remark" />
			</td>
         </tr>
         <tr>
         	<td>15</td>
         	<td colspan="4">工卡具焊迹、电弧灼伤</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_4"/>
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_4_Remark" />
			</td>
         </tr>
         <tr>
         	<td>16</td>
         	<td colspan="4">法兰、密封面及其紧固螺栓</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_5" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_5_Remark" />
			</td>
         </tr>
         <tr>
         	<td>17</td>
         	<td colspan="4">支承、支座或者基础的下沉、倾斜、开裂</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_6" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_6_Remark" />
			</td>
         </tr>
         <tr>
         	<td>18</td>
         	<td colspan="4">地脚螺栓</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_7" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_7_Remark" />
			</td>
         </tr>
         <tr>
         	<td>19</td>
         	<td colspan="4">直立容器和球形容器支柱的铅垂度</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_8" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_8_Remark" />
			</td>
         </tr>
         <tr>
         	<td>20</td>
         	<td colspan="4">多支座卧式容器的支座膨胀孔</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_9" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_9_Remark" />
			</td>
         </tr>
         <tr>
         	<td>21</td>
         	<td colspan="4">排放（疏水、排污）装置和泄漏信号指示孔的堵塞、腐蚀、沉积物</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_10" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Appe_10_Remark" />
			</td>
         </tr>
        
          <tr>
         	<td>22</td>
         	<td rowspan="3">隔热层、衬里检验</td>
         	<td colspan="4">隔热脱落、潮湿及层下腐蚀、裂纹</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ins_1" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ins_1_Remark" />
			</td>
         </tr>
         <tr>
         	<td>23</td>
         	<td colspan="4">衬里层的破损、腐蚀、裂纹、脱落及检查孔介质流出情况</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ins_2" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ins_2_Remark" />
			</td>
         </tr>
         <tr>
         	<td>24</td>
         	<td colspan="4">堆焊层的龟裂、剥离和脱落</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ins_3" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Ins_3_Remark" />
			</td>
         </tr>
         
         <tr>
         	<td>25</td>
         	<td rowspan="2">其他检验</td>
         	<td colspan="4">夹层真空度纹</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mac_Other_1" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mac_Other_1_Remark" />
			</td>
         </tr>
         <tr>
         	<td>26</td>
         	<td colspan="4">日蒸发率</td>
         	<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mac_Other_2" />
			</td>
			<td colspan="2">
         		<s:textfield cssClass="span2 inputClass" name="v_Mac_Other_2_Remark" />
			</td>
         </tr>
   
         <tr>
         	<td>结果</td>
         	<td colspan="9" >
         	<s:textarea name="v_Mac_Result" cssClass="span2 inputClass" style="height:180px"/>
         	</td>
         </tr>
   		 <tr>
            <td colspan="2" width="20%">检验</td>
            <td colspan="3" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Mac_Test_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
            <td colspan="2" width="20%">校对</td>
            <td colspan="3" width="30%">
            <div class="input-append">
                 <s:textfield  cssClass="span2 datepicker inputClass" name="v_Mac_Proo_Date"/>
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
  