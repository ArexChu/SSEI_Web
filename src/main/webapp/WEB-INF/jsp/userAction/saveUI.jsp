<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>人员添加</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/userAction/saveUI.js"></script>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <style type="text/css">
			label {
				display: inline;
			}
		</style>
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>系统管理<b class="tip"></b>人员信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span>
    
    
	<s:form  id="saveUI" action="user_%{id == 0 ? 'add' : 'edit'}" >
		<s:hidden name="id"></s:hidden>
    	<table class="table table-striped table-bordered table-condensed list">
        	<thead>
            	<tr>
                	<td colspan="6" id="center"><b>人员基本信息</b><a id="startEdit" >修改</a></td>
            	</tr>
            	
        	</thead>
         	<tbody>
         
         	<tr>
         		<td >登录名</td>
         		<td colspan="2">
         			<s:textfield name ="loginName" cssClass="inputClass"/>
         		</td>
         		<td >姓名</td>
         		<td colspan="2">
         			<s:textfield name ="name" cssClass="inputClass"/>
         		</td>
         	</tr>
         	
      
         	<tr>
         		<td >单位</td>
         		<td colspan="2" class="detail">
                    <s:select name="companyID" id="companyID" cssClass="inputClass"
                    list="#companyList" listKey="id" listValue="name"
                    headerKey="" headerValue="==请确定单位=="/>
                	<span class="errorClass" id="companyID_Error">
                    ${errors.companyID}
                	</span>    
				</td>
         		<td >角色</td>
         		<td colspan="2" class="detail">
         			
         			<s:if test="#session.user.hasPrivilegeByName('权限设置') || #session.user.loginName=='admin'">
 							<s:select name="roleID" id="roleID" cssClass="inputClass"
                    		list="#roleList" listKey="id" listValue="name" 
                    		headerKey="" headerValue="==请确定角色=="/> 							 
						</s:if>
						<s:else>
							 ${role.name}
					</s:else>
         		</td>        		
         	</tr>

         
         	<tr>  
         		<td >性别</td>
         		<td colspan="2">
         			<s:select cssClass="inputClass" name="sex" list="#{0:'男', 1:'女'}"/>
         		</td>
         		<td >身份证</td>
         		<td colspan="2">
         			<s:textfield name ="identityCard" cssClass="inputClass"/>
         		</td>
         	</tr>
         	
         	<tr>
         		<td >联系方式</td>
         		<td colspan="2">
         			<s:textfield name ="telephone" cssClass="inputClass"/>
         		</td>
         		<td >电子邮箱</td>
         		<td colspan="2">
         			<s:textfield name ="e_Mail" id="e_Mail" cssClass="inputClass"/>
         			<span class="errorClass" id="e_Mail_Error">
                    ${errors.e_Mail}
                	</span>
         		</td>
         	</tr>
         	
         	<tr>
         		<td>
         			作业人员种类
         		</td>
         		<td colspan="5">
         			<table>
         				<s:checkboxlist name="userTypes"  list="{'01：特种设备相关管理','02：锅炉作业','03：压力容器作业','04：气瓶作业','05：压力管道作业','06：电梯作业','07：起重机械作业','08：客运索道作业',
         				'09：大型游乐设施作业','10：场(厂)内专用机动车辆作业','11：安全附件维修作业','12：特种设备焊接作业'}" >
   						</s:checkboxlist>
         			</table>
         		</td>
         	</tr>	
         	
         	<tr>
         		<td>
         			作业项目
         		</td>
         		<td colspan="5">
         			<table>
         				<s:checkboxlist name="projectTypes"  list="{'A1:特种设备安全管理负责人','A2:特种设备质量管理负责人','A3:锅炉压力容器压力管道安全管理','A4:电梯安全管理','A5:起重机械安全管理','A6:客运索道安全管理','A7:大型游乐设施安全管理','A8:场(厂)内专用机动车辆安全管理',
         				'G1:一级锅炉司炉','G2:二级锅炉司炉','G3:三级锅炉司炉','G4:一级锅炉水质处理','G5:二级锅炉水质处理','G6:锅炉能效作业',
         				'R1:固定式压力容器操作','R2:移动式压力容器充装','R3:氧舱维护保养',
         				'P1:永久气体气瓶充装','P2:液化气体气瓶充装','P3:溶解乙炔气瓶充装','P4:液化石油气瓶充装','P5:车用气瓶充装',
         				'D1:压力管道巡检维护','D2:带压封堵','D3:带压密封',
         				'T1:电梯机械安装维修','T2:电梯电气安装维修','T3:电梯司机',
         				'Q1:起重机械机械安装维修','Q2:起重机械电气安装维修','Q3:起重机械指挥','Q4:桥门式起重机司机','Q5:塔式起重机司机','Q6:门座式起重机司机','Q7:缆索式起重机司机','Q8:流动式起重机司机','Q9:升降机司机','Q10:机械式停车设备司机',
         				'S1:客运索道安装','S2:客运索道维修','S3:客运索道司机','S4:客运索道编索',
         				'Y1:大型游乐设施安装','Y2:大型游乐设施维修','Y3:大型游乐设施操作','Y4:水上游乐设施操作与维修',
         				'N1:车辆维修','N2:叉车司机','N3:搬运车牵引车推顶车司机','N4:内燃观光车司机','N5:蓄电池观光车司机',
         				'F1:安全阀校验','F2:安全阀维修','金属焊接操作','非金属焊接操作'}" >
   						</s:checkboxlist>
         			</table>
         		</td>
         	</tr>	

         	<tr>
                	<td colspan="6" id="center"><b>证件信息</b></td>
            </tr>
            
            
            <tr>
					<td colspan="2">证书名称</td>
					<td colspan="2">描述</td>
					<td colspan="2">失效时间</td>
				</tr>
            <s:iterator value="certificates">
				<tr>
					<td colspan="2">${name}</td>
					<td colspan="2">${description}</td>
					<td colspan="2">${failureData}</td>
				</tr>
			</s:iterator>
        
          	<tr>
            	<td colspan="6">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                     <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
            </tr> 
         </tbody> 
   	  </table>
  </s:form>
</body>
</html>

