<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器基础信息</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		  <script type="text/javascript" src="${pageContext.request.contextPath}/script/ajaxfileupload.js"></script> 
   		 <script type="text/javascript">
			$(function () { 
	 			$(".generateFileBox").click(function(){
	 				$("#inputexcel").click();	
	 			});
	 			
	 			 $(".fileToUpload").on("change",function(){
	         		$.ajaxFileUpload
	         		(	
	         			{
	         				url:'vesselBasic_excelIn.action',
	         				fileElementId: 'inputexcel',
	         				dataType: 'json',
	         				success: function (data, status)
	         				{    
	         					alert('导入成功');
	         					history.go(0);
	         				}
	         			}	
	         		);       		
	         	});
			 });
			
			function excelOut(){
				$("#vesselBasicForm").attr("action","vesselBasic_excelOut.action");
				$("#vesselBasicForm").submit();
			}
		</script>
	</head>
  	<body>
  
    <div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>容器列表</div>
    
    <span class="errorClass" id="msg">${msg}</span>
 	
	<s:form autocomplete="off" id="vesselBasicForm" action="vesselBasic_list">
		<table class="table table-striped table-bordered table-condensed">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写筛选条件 </td>
            </tr>
        </thead>
        <tbody class="myfocus">
			  <tr>
                <td >产品编号</td>
                <td class="detail">
                    <s:textfield name="v_Product_ID" id="v_Product_ID" cssClass="inputClass" type="text"/>
                </td>
                <td>容器名称</td>
                <td class="td_detail">
                    <s:textfield name="v_Name" id="v_Name" cssClass="inputClass" type="text"/>
                </td>
                <td>使用单位</td>
                <td class="td_detail">
                    <s:select name="companyID" 
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请选择单位=="/>
				</td>
            </tr>
             <tr>
                <td >设备品种</td>
                <td class="detail">
                	<s:textfield name="v_Type" id="v_Type" cssClass="inputClass" type="text"/>
                </td>
                <td>设备使用地点</td>
                <td class="td_detail">
                    <s:textfield name="v_Use_Addr" id="v_Use_Addr" cssClass="inputClass" type="text"/>
                </td>
                <td>主体结构形式</td>
                <td class="td_detail">
                	  <s:textfield name="v_Mainbody_Str" id="v_Mainbody_Str" cssClass="inputClass" type="text"/>
                </td>
            </tr>
             <tr> <td colspan="6" align="right">
                    <input class="btn btn-inverse"  type="submit" value="提交" />
                    <input class="btn btn-inverse" type="reset" value="清空" />
                </td>
            </tr>
        </tbody>
    </table>	
	
      <table class="table table-striped table-bordered table-condensed center" id="list">
        	<thead>
            	<tr class="tr_detail">
                <td width="15%">产品编号</td>
                <td width="15%">容器名称</td>
                <td width="20%">使用单位</td>
                <td width="10%">设备品种</td>
                <td width="10%">设备使用地点</td>
                <td width="10%">主体结构形式 </td>
                <td width="10%">投入使用日期</td>
                <td width="10%">操作 </td>
            	</tr>
        	</thead>
        	<tbody>
        		<s:iterator value="recordList">
				<tr>
					<td>${v_Product_ID}</td>
                	<td>${v_Name}</td>
               	 	<td>${v_Use_Com.name}</td>
                	<td>${v_Type}</td>
                	<td>${v_Use_Addr}</td>
                	<td>${v_Mainbody_Str}</td>
                	<td>${v_Start_Date}</td>
					<td>
						<s:a  action="vesselBasic_editUI?id=%{id}">
						<div class="btn btn-mini btn-primary reverse">
						查看
						</div>
						</s:a>
						<s:a  action="vesselBasic_toFileList?id=%{id}&backurl=vesselBasic">
						<div class="btn btn-mini btn-primary reverse">
						附件
						</div>
						</s:a>						
 						<s:a action="vesselBasic_delete?id=%{id}" onclick="return confirm('您确定要删除吗？')" >
 						<div class="info2 btn btn-mini btn-danger">
						 删除
						</div>
						</s:a>
							<s:a action="vesselMonthlyInspection_list?vesselBasic.v_Product_ID=%{v_Product_ID}">
 						<div class="btn btn-mini btn-primary reverse">
						 月度检验
						</div>
						</s:a>
												
					</td>
				</tr>
				</s:iterator>
				<tr>
					<td colspan="100">
						<s:a  action="vesselBasic_addUI">
						<div class="btn btn-mini btn-primary reverse">
						添加容器
						</div>
						</s:a>
						<a href="javascript:excelOut();">
						<div class="btn btn-mini btn-primary reverse">
							导出excel表格
						</div>
						</a>				
						<div class="btn btn-mini btn-primary reverse generateFileBox">
						导入excel表格
						</div>
						<input type="file"  id="inputexcel" class="span2 inputClass fileToUpload"  style="display: none;" name="document"/>
					</td>
					
				</tr>
				<tr><%@ include file="/WEB-INF/jsp/public/pager.jspf" %></tr>	
        	</tbody>
    	</table>
   </s:form>
   <!--分页信息-->
	
</body>
</html>
