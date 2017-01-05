<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>容器基础信息</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <style type="text/css">
			label {
				display: inline;
			}
		</style>
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>容器管理<b class="tip"></b>容器信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span>
    
    
	<s:form  id="saveUI" action="vesselBasic_%{id == 0 ? 'add' : 'edit'}" >
		<s:hidden name="id"></s:hidden>
    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="7" id="center"><b>容器基本信息</b> <a id="startEdit" >修改</a></td>
            	</tr>
            	
        	</thead>
         	<tbody>
         
         	<tr>
         		<td colspan="3">使用单位名称</td>
         		<td  class="detail">
                    <s:select name="v_Use_Com.id" cssClass="inputClass required"
                    list="#useCompanyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请确定单位=="/>   
				</td>
				<td colspan="2">设计单位名称</td>
         		<td  class="detail">
                    <s:select name="v_De_Com.id" cssClass="inputClass required"
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请确定单位=="/>   
				</td>
			</tr>
			
			<tr>
         		<td  colspan="3">制造单位名称</td>
         		<td class="detail">
                    <s:select name="v_Man_Com.id" id="companyID" cssClass="inputClass required"
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请确定单位=="/>   
				</td>
				<td colspan="2">安装单位名称</td>
         		<td  class="detail">
                    <s:select name="v_Install_Com.id" id="companyID" cssClass="inputClass required"
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请确定单位=="/>   
				</td>
			</tr>
			
			<tr>
         		<td colspan="3">注册登记机构</td>
         		<td >
         			<s:textfield name ="v_Reg_Com" cssClass="inputClass"/>
         		</td>
         		<td colspan="2">设备代码</td>
         		<td >
         			<s:textfield name ="v_Equ_ID" cssClass="inputClass"/>
         		</td>
			</tr>
			
			<tr>
         		<td colspan="3">使用证号</td>
         		<td >
         			<s:textfield name ="v_Use_ID" cssClass="inputClass"/>
         		</td>
         		<td colspan="2">产品编号</td>
         		<td >
         			<s:textfield name ="v_Product_ID" cssClass="inputClass"/>
         		</td>
			</tr>
			
			
			<tr>
         		<td  colspan="3">单位内编号</td>
         		<td>
         			<s:textfield name ="v_Inuse_Com_ID" cssClass="inputClass"/>
         		</td>
         		<td colspan="2">容器名称</td>
         		<td >
         			<s:textfield name ="v_Name" cssClass="inputClass"/>
         		</td>
			</tr>
			
			<tr>
         		<td colspan="3">设备使用地点</td>
         		<td>
         			<s:textfield cssClass="inputClass" name="v_Use_Addr"/>
         		</td>
         		<td colspan="2">设备品种</td>
         		<td>
         			<s:textfield cssClass="inputClass" name="v_Type" />
         		</td>
          </tr>
			
			
		 <tr>
         	<td colspan="3">主体结构形式</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Mainbody_Str" />
         	</td>
			<td colspan="2">容器图号</td>
         	<td>
         		<s:textfield cssClass="inputClass"  name="v_Pic_ID"/>
         	</td>
         </tr>
         
         
          <tr>
         	<td colspan="3">设计日期</td>
         	<td>
         		<div class="input-append">
                   	<s:textfield  cssClass="datepicker inputClass" name="v_De_Date"/>
                   	<span class="add-on"><i class="icon-calendar"></i></span>
                </div>
         	</td>
         	<td colspan="2">产品标准</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Product_Cri" />
         	</td>
         </tr>

         <tr>
         	<td colspan="3">制造日期</td>
         	<td>
         		<div class="input-append">
                   	<s:textfield  cssClass="datepicker inputClass" name="v_Man_Date"/>
                   	<span class="add-on"><i class="icon-calendar"></i></span>
                </div>
         	</td>
         	<td colspan="2">制造单位许可号</td>
         	<td>
         		<s:textfield cssClass="inputClass"  name="v_M_Man_Permission_ID"  />
         	</td>
         </tr>
         
          <tr>
         	<td colspan="3">安装告知书号</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_M_Ins_ID" />
         	</td>
         	<td colspan="2">安装单位许可号</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_M_Ins_Permission_ID"/>
         	</td>
         </tr>
         
         
          <tr>
         	<td colspan="3">安装完成日期</td>
         	<td>
         		<div class="input-append">
                   	<s:textfield  cssClass="datepicker inputClass" name="v_M_Ins_End_Date"/>
                   	<span class="add-on"><i class="icon-calendar"></i></span>
                </div>
         	</td>
         	<td colspan="2">设计单位许可号</td>
         	<td>
         		 <s:textfield cssClass="inputClass" name="v_M_De_ID" />
         	</td>
         </tr>

          <tr>
         	<td colspan="3">投入使用日期</td>
         	<td>
         		<div class="input-append">
                   	<s:textfield  cssClass="datepicker inputClass" name="v_Start_Date"/>
                   	<span class="add-on"><i class="icon-calendar"></i></span>
                </div>
         	</td>
         	<td colspan="2">设计使用年限</td>
         	<td>
         		 <s:textfield cssClass="inputClass" name="v_De_Life" />
         	</td>
         </tr>
         
         <tr>
         	<td colspan="3">支座型式</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Seat_Type" />
         	</td>
         	<td colspan="2">安装型式</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Install_Type" />
         	</td>
         </tr>
         
          <tr>
         	<td colspan="3">保温绝热方式</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Pro_Ins_Type"/>
         	</td>
         	<td colspan="2">容器内径</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Inside_Dia" />mm
         	</td>
         </tr>
         
           <tr>
         	<td colspan="3">容器高/长</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Len" />mm
         	</td>
         	<td colspan="2">
         		<s:radio name="v_C_Volume" list="{'容积m3', '换热面积m2'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Volume" />m3( m2)
         	</td>
         </tr>
         
           <tr>
         	<td colspan="3">最大允许充装量</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Max_Volume" />kg
         	</td>
         	<td colspan="2">封头</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Head"/>
         	</td>
         </tr>
         
           <tr>
         	<td colspan="3">安装形式</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_M_Ins_Type" />
         	</td>
         	<td colspan="2"></td>
         	<td>
         		
         	</td>
         </tr>
         
           <tr>
         	<td rowspan="10" width=10%>性能参数</td>
         	<td rowspan="2" width=15%>设计压力</td>
         	<td width="15%">
         		<s:radio name="v_De_Pre_C_Shell" list="{'壳体', '壳程'}"></s:radio> 
         	</td>
         	<td  width=15%>
         		<s:textfield cssClass="inputClass" name="v_De_Pre_Shell"/>MPa
         	</td>
         	<td rowspan="2" width=15%>工作压力</td>
         	<td width="15%">
         		<s:radio name="v_Wo_Pre_C_Shell" list="{'壳体', '壳程'}"></s:radio> 
         	</td>
         	<td  width=15%>
         		<s:textfield cssClass="inputClass" name="v_Wo_Pre_Shell" />MPa
         	</td>
         </tr>
         
         <tr>
         	<td>
         		<s:radio name="v_De_Pre_C_Jacket" list="{'夹套', '管程'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_De_Pre_Jacket"/>MPa
         	</td>
         	<td>
         		<s:radio name="v_Wo_Pre_C_Jacket" list="{'夹套', '管程'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Wo_Pre_Jacket"/>MPa
         	</td>
         </tr>

          <tr>
         	<td rowspan="2" >设计温度</td>
         	<td>
         		<s:radio name="v_De_Tem_C_Shell" list="{'壳体', '壳程'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass"  name="v_De_Tem_Shell"/>℃
         	</td>
         	<td rowspan="2">工作温度</td>
         	<td>
         		<s:radio name="v_Wo_Tem_C_Shell" list="{'壳体', '壳程'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass"  name="v_Wo_Tem_Shell"/>℃
         	</td>
         </tr>
         
         <tr>
         	<td>
         		<s:radio name="v_De_Tem_C_Jacket" list="{'夹套', '管程'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass"  name="v_De_Tem_Jacket"/>℃
         	</td>
         	<td>
         		<s:radio name="v_Wo_Tem_C_Jacket" list="{'夹套', '管程'}"></s:radio>
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass"  name="v_Wo_Tem_Jacket"/>℃
         	</td>
         </tr>
         
         <tr>
         	<td rowspan="2" >腐蚀裕度</td>
         	<td>
         		筒体
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Cor_Barrel_Body"/>
         	</td>
         	<td rowspan="2">介质</td>
         	<td>
         		<s:radio name="v_Med_C_Shell" list="{'壳体', '壳程'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Med_Shell"/>
         	</td>
         </tr>
         
         <tr>
         	<td>
         		封头
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Cor_Seal_Head"/>
         	</td>
         	<td>
         		<s:radio name="v_Med_C_Jacket" list="{'夹套', '管程'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Med_Jacket"/>
         	</td>
         </tr>
         
         <tr>
         	<td rowspan="4" >材质</td>
         	<td>
         		筒体
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Ma_Barrel_Body"/>
         	</td>
         	<td rowspan="4">厚度</td>
         	<td>
         		筒体
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Thi_Barrel_Body"/>mm
         	</td>
         </tr>
         
         <tr>
         	<td>
         		封头
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Ma_Seal_Head" />
         	</td>
         	<td>
         		封头
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Thi_Seal_Head"/>mm
         	</td>
         </tr>
         
         <tr>
         	<td>
         		<s:radio name="v_Ma_C_Jacket" list="{'夹套', '换热器'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Ma_Jacket"/>
         	</td>
         	<td>
         		<s:radio name="v_Thi_C_Jacket" list="{'夹套', '换热器'}"></s:radio> 
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Thi_Jacket"/>mm
         	</td>
         </tr>
         
         <tr>
         	<td>
         		衬里
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Ma_Liner" />
         	</td>
         	<td>
         		衬里
         	</td>
         	<td>
         		<s:textfield cssClass="inputClass" name="v_Thi_Liner" />mm
         	</td>
         </tr>
			         	
          	<tr>
            	<td colspan="7">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                     <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
            </tr> 
         </tbody> 
   	  </table>
  </s:form>
</body>
</html>

