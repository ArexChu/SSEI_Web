<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
    	<title>管道基础信息</title>
   		 <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
   		 <script type="text/javascript" src="${pageContext.request.contextPath}/script/commons/commons.js"></script> 
   		 <style type="text/css">
			label {
				display: inline;
			}
		</style>	
	</head>
	<body>
	<div class="alert alert-info">当前位置<b class="tip"></b>管道管理<b class="tip"></b>管道信息</div>
    <span class="errorClass" id="msg"><s:fielderror></s:fielderror></span>
    
	<s:form  action="pipeMicroTest_edit" >
		<s:hidden name="id"></s:hidden>
		<s:hidden name="pipeMaintainId"></s:hidden>
         <table class="table table-striped table-bordered table-condensed list" >
        <thead >
        <tr>
            <td colspan="3" id="center"><b>宏 观 检 查 记 录</b><a id="startEdit" >修改</a></td>
        </tr>
            <tr>
                <td  width="10%"><b>检查项目</b></td>
                <td  width="1200"><b>检查结果</b></td>
                <td  width="15%"><b>备注</b></td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>管道位置</td>
                <td> 
                	<input name="p_Pos_Temp" class="temp" type="checkbox" value="正常" />
                    	正常
 					<input name="p_Pos_Temp" class="temp" type="checkbox" value="碰撞" />
                    	碰撞
                    <input name="p_Pos_Temp" class="temp" type="checkbox" value="摩擦" />
                    	摩擦
                   <s:hidden name ="p_Pos" cssClass="hiddenBox" id="p_Pos"></s:hidden>
                </td>
                <td>
                	<s:textfield name ="p_Pos_Remark" cssClass="inputClass"/>
                </td>
            </tr>
            
            <tr>
              <td >管道结构<font></font></td>
              <td> 
                	<input name="p_Str_Temp" class="temp" type="checkbox" value="正常" />
                    	正常
 					<input name="p_Str_Temp" class="temp" type="checkbox" value="翘曲" />
                    	翘曲
                    <input name="p_Str_Temp" class="temp" type="checkbox" value="下沉" />
                    	下沉
                    <input name="p_Str_Temp" class="temp" type="checkbox" value="异常变形" />
                    	异常变形
                    <s:hidden name ="p_Str" cssClass="hiddenBox" id="p_Str"></s:hidden>
               </td>
               <td>
                	<s:textfield name ="p_Str_Remark" cssClass="inputClass"/>
               </td>   
            </tr>
            
            <tr>
               <td >绝热层<font></font></td>
               <td> 
                	<input name="p_Ins_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Ins_Temp" class="temp" type="checkbox" value="破损" />
                    	破损
                    <input name="p_Ins_Temp" class="temp" type="checkbox" value="脱落" />
                    	脱落
                    <input name="p_Ins_Temp" class="temp" type="checkbox" value="下沉" />
                    	跑冷
                    <input name="p_Ins_Temp" class="temp" type="checkbox" value="下沉" />
                    	无绝热层
                    <s:hidden name="p_Ins" cssClass="hiddenBox" id="p_Ins" ></s:hidden>
                </td>
                <td>
                	<s:textfield name="p_Ins_Remark" cssClass="inputClass" />
                </td>  
            </tr>
            
            <tr>
                <td >防腐层<font></font></td>
                <td> 
                	<input name="p_Pro_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Pro_Temp" class="temp" type="checkbox" value="破损" />
                    	破损
                    <input name="p_Pro_Temp" class="temp" type="checkbox" value="脱落" />
                    	脱落
                    <input name="p_Pro_Temp" class="temp" type="checkbox" value="无防腐层" />
                    	无防腐层
                    <s:hidden name="p_Pro" cssClass="hiddenBox" id="p_Pro" ></s:hidden>
              
                </td>
                <td>
                	<s:textfield name="p_Pro_Remark" cssClass="inputClass" />
                </td>  
            </tr>
            
            <tr>
                <td >支吊架<font></font></td>
                <td> 
                	<input name="p_Hanger_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Hanger_Temp" class="temp" type="checkbox" value="间距不合理" />
                    	间距不合理
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="脱落" />
                    	脱落
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="变形" />
                    	变形
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="腐蚀" />
                    	腐蚀
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="与管道接触处积水" />
                    	与管道接触处积水<br/>
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="恒力弹簧支吊架转体位移指示越限" />
                    	恒力弹簧支吊架转体位移指示越限
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="变力弹簧支吊架偏斜" />
                    	变力弹簧支吊架偏斜<br/>
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="变力弹簧支吊架失载" />
                    	变力弹簧支吊架失载
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="刚性支吊架状态异常" />
                    	刚性支吊架状态异常
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="吊杆损坏" />
                    	吊杆损坏
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="吊杆异常" />
                    	吊杆异常<br/>
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="吊杆连接配件损坏" />
                    	吊杆连接配件损坏
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="吊杆连接配件异常" />
                    	吊杆连接配件异常
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="转导向支架卡涩" />
                    	转导向支架卡涩
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="承载结构变形" />
                    	承载结构变形<br/>
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="承载机构上主要受力焊接接头存在裂纹" />
                    	承载机构上主要受力焊接接头存在裂纹
                    <input name="p_Hanger_Temp" class="temp" type="checkbox" value="支承辅助钢结构上主要受力焊接接头存在裂纹" />
                    	支承辅助钢结构上主要受力焊接接头存在裂纹
                    <s:hidden name="p_Hanger" cssClass="hiddenBox" id="p_Hanger" ></s:hidden>
                </td>
                <td>
                	<s:textfield name="p_Hanger_Remark" cssClass="inputClass"/>
                </td>
            </tr>
          
            <tr>
                <td >阻尼器<font></font></td>
                <td> 
                	<input name="p_Damper_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Damper_Temp" class="temp" type="checkbox" value="位移异常" />
                    	位移异常
                    <input name="p_Damper_Temp" class="temp" type="checkbox" value="液压阻尼器液位正常" />
                    	液压阻尼器液位正常
                    <input name="p_Damper_Temp" class="temp" type="checkbox" value="无" />
                    	无
                    <s:hidden name="p_Damper" cssClass="hiddenBox" id="p_Damper" ></s:hidden>
              
                </td>
                <td>
                	<s:textfield name="p_Damper_Remark" cssClass="inputClass"/>
                </td>
            </tr>
            
            <tr>
                <td >减振器<font></font></td>
                <td> 
                	<input name="p_Absorber_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Absorber_Temp" class="temp" type="checkbox" value="位移异常" />
                    	位移异常
                    <input name="p_Absorber_Temp" class="temp" type="checkbox" value="无" />
                    	无
                    <s:hidden name="p_Absorber" cssClass="hiddenBox" id="p_Absorber" ></s:hidden>
              
                </td>
                <td>
                	<s:textfield name="p_Absorber_Remark" cssClass="inputClass" />
                </td>
            </tr>
            
            <tr>
                <td >补偿器<font></font></td>
                <td> 
                	<input name="p_Compen_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Compen_Temp" class="temp" type="checkbox" value="损坏" />
                    	损坏
                    <input name="p_Compen_Temp" class="temp" type="checkbox" value="未采用补偿器" />
                    	未采用补偿器
                    <input name="p_Compen_Temp" class="temp" type="checkbox" value="不需要补偿器" />
                    	不需要补偿器
                    <s:hidden name="p_Compen" cssClass="hiddenBox" id="p_Compen" ></s:hidden>
                </td>
                <td>
                	<s:textfield name="p_Compen_Remark" cssClass="inputClass" />
                </td>
            </tr>
            
            <tr>
                <td >阀门<font></font></td>
                <td> 
                	<input name="p_Valve_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Valve_Temp" class="temp" type="checkbox" value="腐蚀" />
                    	腐蚀
                    <input name="p_Valve_Temp" class="temp" type="checkbox" value="裂缝" />
                    	裂缝
                    <input name="p_Valve_Temp" class="temp" type="checkbox" value="缩孔" />
                    	缩孔
                    <input name="p_Valve_Temp" class="temp" type="checkbox" value="连接螺栓松动" />
                    	连接螺栓松动
                    <input name="p_Valve_Temp" class="temp" type="checkbox" value="操作不灵活" />
                    	操作不灵活
                    <input name="p_Valve_Temp" class="temp" type="checkbox" value="无" />
                    	无
                    <s:hidden name="p_Valve" cssClass="hiddenBox" id="p_Valve" ></s:hidden>
                </td>
                <td>
                	<s:textfield name="p_Valve_Remark" cssClass="inputClass"/>
                </td>
            </tr>
            
             <tr>
                <td >法兰<font></font></td>
                <td> 
                	<input name="p_Fla_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Fla_Temp" class="temp" type="checkbox" value="偏口" />
                    	偏口
                    <input name="p_Fla_Temp" class="temp" type="checkbox" value="紧固件不齐全" />
                    	紧固件不齐全
                    <input name="p_Fla_Temp" class="temp" type="checkbox" value="紧固件不符合要求" />
                    	紧固件不符合要求
                    <input name="p_Fla_Temp" class="temp" type="checkbox" value="紧固件松动" />
                    	紧固件松动
                    <input name="p_Fla_Temp" class="temp" type="checkbox" value="紧固件腐蚀" />
                    	紧固件腐蚀
                    <input name="p_Fla_Temp" class="temp" type="checkbox" value="无" />
                    	无
                    <s:hidden name="p_Fla" cssClass="hiddenBox" id="p_Fla" ></s:hidden>
                 </td>
                 <td>
                	<s:textfield name="p_Fla_Remark" cssClass="inputClass"/>
                 </td>
            </tr>
            
             <tr>
                 <td >膨胀节<font></font></td>
                 <td> 
                	<input name="p_Exp_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Exp_Temp" class="temp" type="checkbox" value="波纹管膨胀节划痕" />
                    	波纹管膨胀节划痕
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="波纹管膨胀节凹痕" />
                    	波纹管膨胀节凹痕
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="波纹管膨胀节腐蚀" />
                    	波纹管膨胀节腐蚀
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="波纹管膨胀节开裂" />
                    	波纹管膨胀节开裂<br/>
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="波纹管膨胀节间距异常" />
                    	波纹管膨胀节间距异常
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="波纹管膨胀节失稳" />
                    	波纹管膨胀节失稳
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="铰链型膨胀节铰链变形" />
                    	铰链型膨胀节铰链变形<br/>
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="铰链型膨胀节铰链脱落" />
                    	铰链型膨胀节铰链脱落
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="铰链型膨胀节销轴变形" />
                    	铰链型膨胀节销轴变形
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="铰链型膨胀节销轴脱落" />
                    	铰链型膨胀节销轴脱落<br/>
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="拉杆式膨胀节拉杆异常" />
                    	拉杆式膨胀节拉杆异常
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="拉杆式膨胀节螺栓异常" />
                    	拉杆式膨胀节螺栓异常
                    <input name="p_Exp_Temp" class="temp" type="checkbox" value="拉杆式膨胀节连接支座异常" />
                    	拉杆式膨胀节连接支座异常
                    <s:hidden name="p_Exp" cssClass="hiddenBox" id="p_Exp" ></s:hidden>
                 </td>
                 <td>
                	<s:textfield name="p_Exp_Remark" cssClass="inputClass"/>
                 </td>
            </tr>
            
            <tr>
                 <td >阴极保护装置<font></font></td>
                 <td> 
                	<input name="p_Cat_Pro_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Cat_Pro_Temp" class="temp" type="checkbox" value="异常" />
                    	异常
                    <input name="p_Cat_Pro_Temp" class="temp" type="checkbox" value="损坏" />
                    	损坏
                    <input name="p_Cat_Pro_Temp" class="temp" type="checkbox" value="无" />
                    	无
                    <s:hidden name="p_Cat_Pro" cssClass="hiddenBox" id="p_Cat_Pro" ></s:hidden>
              
                </td>
                <td>
                	<s:textfield name="p_Cat_Pro_Remark" cssClass="inputClass" />
                </td>
             </tr>
            
             <tr>
                <td >蠕胀测点<font>*</font></td>
                <td> 
                	<input name="p_Creep_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Creep_Temp" class="temp" type="checkbox" value="损坏" />
                    	损坏
                    <input name="p_Creep_Temp" class="temp" type="checkbox" value="无" />
                    	无
                    <s:hidden name="p_Creep" cssClass="hiddenBox" id="p_Creep" ></s:hidden>
              
                </td>
                <td>
                	<s:textfield name="p_Creep_Remark" cssClass="inputClass"/>
                </td>
            </tr>
            
            <tr>
                <td >法兰间接触电阻<font></font></td>
                <td> 
                	<input name="p_Fla_Res_Temp" class="temp" type="checkbox" value="合格" />
                    	合格
 					<input name="p_Fla_Res_Temp" class="temp" type="checkbox" value="大于0.03Ω" />
                    	大于0.03Ω
                    <input name="p_Fla_Res_Temp" class="temp" type="checkbox" value="无此项" />
                    	无此项
                    <s:hidden name="p_Fla_Res" cssClass="hiddenBox" id="p_Fla_Res" ></s:hidden>
                </td>
                <td>
                	<s:textfield name="p_Fla_Res_Remark" cssClass="inputClass"/>
                </td>   
            </tr>
            
            <tr>
               <td>对地电阻<font></font></td>
               <td> 
                	<input name="p_Gro_Res_Temp" class="temp" type="checkbox" value="合格" />
                    	合格
 					<input name="p_Gro_Res_Temp" class="temp" type="checkbox" value="大于100Ω" />
                    	大于100Ω
                    <input name="p_Gro_Res_Temp" class="temp" type="checkbox" value="无此项" />
                    	无此项
                    <s:hidden name="p_Gro_Res" cssClass="hiddenBox" id="p_Gro_Res" ></s:hidden>
               </td>
               <td>
                	<s:textfield name="p_Gro_Res_Remark" cssClass="inputClass"/>
               </td> 
            </tr>
            
            <tr>
               <td >管道标识<font></font></td>
               <td> 
                	<input name="p_Ide_Temp" class="temp" type="checkbox" value="合格" />
                    	合格
 					<input name="p_Ide_Temp" class="temp" type="checkbox" value="标识错误" />
                    	标识错误
                    <input name="p_Ide_Temp" class="temp" type="checkbox" value="标识不清" />
                  		  标识不清
                  	<input name="p_Ide_Temp" class="temp" type="checkbox" value="无标识" />
                  		  无标识
                  	<s:hidden name="p_Ide" cssClass="hiddenBox" id="p_Ide" ></s:hidden>
                </td>
                <td>
                	<s:textfield name="p_Ide_Remark" cssClass="inputClass"/>
                </td>
            </tr>
            
            <tr>
                <td >管道组成件<font></font></td>
                <td> 
                	<input name="p_Component_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Component_Temp" class="temp" type="checkbox" value="裂缝" />
                    	裂缝
                    <input name="p_Component_Temp" class="temp" type="checkbox" value="皱褶" />
                    	皱褶
                    <input name="p_Component_Temp" class="temp" type="checkbox" value="重皮" />
                    	重皮
                    <input name="p_Component_Temp" class="temp" type="checkbox" value="碰伤" />
                    	碰伤
                    <input name="p_Component_Temp" class="temp" type="checkbox" value="变形" />
                    	变形
                    <input name="component" class="temp" type="checkbox" value="腐蚀" />
                    	腐蚀
                    <s:hidden name="p_Component" cssClass="hiddenBox" id="p_Component" ></s:hidden>
                </td>
                <td>
                	<s:textfield name="p_Component_Remark" cssClass="inputClass"/>
                </td>
            </tr>
            
            <tr>
               <td >焊接接头<font></font></td>
               <td> 
                	<input name="p_Wel_Temp" class="temp" type="checkbox" value="完好" />
                    	完好
 					<input name="p_Wel_Temp" class="temp" type="checkbox" value="裂纹" />
                    	裂纹
                    <input name="p_Wel_Temp" class="temp" type="checkbox" value="错边" />
                    	错边
                    <input name="p_Wel_Temp" class="temp" type="checkbox" value="咬边" />
                    	咬边
                    <s:hidden name="p_Wel" cssClass="hiddenBox" id="p_Wel" ></s:hidden>
                </td>
                <td>
                	<s:textfield name="p_Wel_Remark" cssClass="inputClass" />
                </td>
            </tr>
            
            <tr>
                <td>其他</td>
                <td>
                    <s:textfield name="p_Other" cssClass="inputClass" ></s:textfield>
                </td>
                <td>
                	<s:textfield name="p_Other_Remark" cssClass="inputClass" />
                </td>
            </tr>
            
            <tr>
                <td >日期</td>
                <td colspan="3">
                <div class="input-append">
                     <s:textfield  cssClass="datepicker inputClass" name="p_Mac_Date"/>
                     <span class="add-on"><i class="icon-calendar"></i></span>
                </div>
                </td>
            </tr>
            
            
           <tr>
            	<td colspan="3">
                    <input class="btn btn-inverse" id="submit" type="submit" value="提交"/>
                     <a href="javascript:history.go(-1);"><input class="btn btn-inverse" type="button" value="返回"/></a></td>
            </tr> 
        </tbody>
    </table>
    </s:form>
</body>
</html>
  