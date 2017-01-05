<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道测厚检查</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		  <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/tableCreater.js"></script> 		
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span> 
	<s:form  action="pipeThiTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pipeMaintainId"></s:hidden>
		<s:hidden id="tablevalue" name="p_Thi_Value"></s:hidden>
         <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="8" id="center"><b>管道测厚检查</b><a id="startEdit" >修改</a></td>
        </tr>
        </thead>
            <tr>
            	<td colspan="2">管道编号</td>
                <td colspan="2"> 
                <s:textfield cssClass="span2 inputClass" name="p_Thi_Name" />
                </td>
                <td colspan="2">表面状况</td>
                <td colspan="2">
                <input name="p_Sur_Sta_Temp" class="temp" type="checkbox" value="去漆" />
                  	去漆
				<input name="p_Sur_Sta_Temp" class="temp" type="checkbox" value="去锈" />
                  	去锈
                <input name="p_Sur_Sta_Temp" class="temp" type="checkbox" value="打磨" />
                  	打磨
                <input name="p_Sur_Sta_Temp" class="temp" type="checkbox" value="未处理" />
                  	未处理
                <s:hidden name="p_Sur_Sta" cssClass="hiddenBox" id="p_Sur_Sta" ></s:hidden>
                </td>  
            </tr>
             <tr>
                <td colspan="2">测厚仪器型号</td>
                <td colspan="2"> 
                <s:textfield cssClass="span2 inputClass" name="p_Equ_Mod" />
                </td>
                <td colspan="2">测厚仪器精度</td>
                <td colspan="2">
                <s:textfield cssClass="span2 inputClass" name="p_Equ_Acc" />
                </td>  
            </tr>
            <tr>
                <td colspan="2">测厚仪器编号</td>
                <td colspan="2"> 
                <s:textfield cssClass="span2 inputClass"  name="p_Equ_ID" />
                </td>
                <td colspan="2">使用状态</td>
                <td colspan="2">
                <s:textfield cssClass="span2 inputClass"  name="p_Use_Sta" />
                </td>  
            </tr>
            <tr>
                <td colspan="2">管件测厚比例</td>
                <td colspan="2"> 
                <s:textfield cssClass="span2 inputClass" name="p_Thi_ratio_1" />%    
                </td>
                <td colspan="2">管子测厚比例</td>
                <td colspan="2">
                <s:textfield cssClass="span2 inputClass" name="p_Thi_ratio_2" />%
                </td>  
            </tr>
            <tr>
                <td colspan="2">实测点数</td>
                <td colspan="2"> 
                <s:textfield cssClass="span2 inputClass" name="p_Thi_Num" />
                </td>
                <td colspan="2">实测最小壁厚</td>
                <td colspan="2">
                <s:textfield cssClass="span2 inputClass" name="p_Min_Thi" />mm
                </td>  
            </tr>
            <tr >
            	<td colspan="8">
            		测厚点部位图：（可另加附图）
           		 </td>
            </tr>
			<tr>
				<td colspan="100%">					
 					<div class="btn btn-mini btn-primary reverse table_add">
						添加一行
					</div>
					<div class="btn btn-mini btn-primary reverse table_delete">
						删除一行
					</div>
				</td>
			</tr>
            <tbody class="tableValue">
            <tr>
            	<td width="9%">测点编号</td>
            	<td width="16%">测点厚度（㎜）</td>
            	<td width="9%">测点编号</td>
            	<td width="16%">测点厚度（㎜）</td>
            	<td width="9%">测点编号</td>
            	<td width="16%">测点厚度（㎜）</td>
            	<td width="9%">测点编号</td>
            	<td width="16%">测点厚度（㎜）</td>
            </tr>
             <tr style="display:none">
            	<td><input class="span2 inputClass" type="text"  /></td>
            	<td><input class="span2 inputClass" type="text"  /></td>
            	<td><input class="span2 inputClass" type="text"  /></td>
            	<td><input class="span2 inputClass" type="text"  /></td>
            	<td><input class="span2 inputClass" type="text"  /></td>
            	<td><input class="span2 inputClass" type="text"  /></td>
            	<td><input class="span2 inputClass" type="text"  /></td>
            	<td><input class="span2 inputClass" type="text"  /></td>
            </tr>
            </tbody>
         <tr>
            <td >检验</td>
            <td colspan="3">
            <div class="input-append">
                 <s:textfield  cssClass="datepicker inputClass" name="p_Thi_Date"/>
                 <span class="add-on"><i class="icon-calendar"></i></span>
            </div>
            </td>
         </tr>    
         <tr>
        	<td colspan="8">
                <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                 <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
         </tr> 

    </table>
    </s:form>
</body>
</html>
  