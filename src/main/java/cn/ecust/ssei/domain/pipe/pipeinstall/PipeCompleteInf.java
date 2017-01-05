package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeCompleteInf")
public class PipeCompleteInf {

	private long id;//管道安装竣工资料审查报告记录
	private PipeInstall pipeInstall;
	private String pi_EquIns_Check;//特种设备安装改造维修告知书
	private String pi_EquIns_Result;//
	private String pi_Assur_Check;//安装单位现场质保体系及人员任命书
	private String pi_Assur_Result;//
	private String pi_Explain_Check;//设计图纸及其技术要求（说明）
	private String pi_Explain_Result;//
	private String pi_Cons_Check;//施工组织设计（或施工方案）
	private String pi_Cons_Result;//
	private String pi_Wel_Check;//焊接工艺规程（焊接作业指导书）
	private String pi_Wel_Result;//
	private String pi_NDE_Check;//无损检测工艺和方案
	private String pi_NDE_Result;//
	private String pi_WelReg_Check;//压力管道焊工汇总登记表及其资格复印件
	private String pi_WelReg_Result;//
	private String pi_NDEBook_Check;//无损检测人员汇总登记表及其资格复印件
	private String pi_NDEBook_Result;//
	private String pi_Compon_Check;//管道组成件（含焊材）质证书及检查验收记录
	private String pi_Compon_Result;//
	private String pi_Compon_Rep_Check;//管道组成件理化试验报告
	private String pi_Compon_Rep_Result;//
	private String pi_Proc_Check;//管件加工记录
	private String pi_Proc_Result;//
	private String pi_Valve_Check;//阀门试验记录
	private String pi_Valve_Result;//
	private String pi_InsCons_Check;//组对安装施工记录
	private String pi_InsCons_Result;//
	private String pi_WelCons_Check;//管道焊接施工记录
	private String pi_WelCons_Result;//
	private String pi_compen_Check;//补偿装置安装记录
	private String pi_compen_Result;//
	private String pi_Hanger_Check;//支、吊架安装记录
	private String pi_Hanger_Result;//
	private String pi_Hidden_Check;//隐蔽工程（封闭）记录
	private String pi_Hidden_Result;//
	private String pi_WelHeat_Check;//管道焊缝热处理报告
	private String pi_WelHeat_Result;//
	private String pi_NDERep_Check;//无损检测报告
	private String pi_NDERep_Result;//
	private String pi_LeakRep_Check;//强度及泄漏性试验报告
	private String pi_LeakRep_Result;//
	private String pi_DryRep_Check;//通球、吹扫及清洗记录
	private String pi_DrykRep_Result;//
	private String pi_SafeEqu_Check;//安全保护装置调试记录
	private String pi_SafeEqu_Result;//
	private String pi_ProTest_Check;//防腐施工、绝缘测试记录
	private String pi_ProTest_Result;//
	private String pi_Sta_Ele_Check;//静电测试记录
	private String pi_Sta_Ele_Result;//
	private String pi_InsTem_Check;//保温施工记录
	private String pi_InsTem_Result;//
	private String pi_Change_Check;//设计变更通知（确认）单
	private String pi_Change_Result;//
	private String pi_Complete_Pic_Check;//竣工图（包含单线图）
	private String pi_Complete_Pic_Result;//
	private String pi_Complete_Remark;//备注
	private String pi_Complete_Per;//监检人
	private String pi_Complete_Date;//监检日期
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * @return the pipeInstall
	 */
	@OneToOne(mappedBy="pipeCompleteInf")
	public PipeInstall getPipeInstall() {
		return pipeInstall;
	}
	/**
	 * @param pipeInstall the pipeInstall to set
	 */
	public void setPipeInstall(PipeInstall pipeInstall) {
		this.pipeInstall = pipeInstall;
	}
	/**
	 * @return the pi_EquIns_Check
	 */
	public String getPi_EquIns_Check() {
		return pi_EquIns_Check;
	}
	/**
	 * @param pi_EquIns_Check the pi_EquIns_Check to set
	 */
	public void setPi_EquIns_Check(String pi_EquIns_Check) {
		this.pi_EquIns_Check = pi_EquIns_Check;
	}
	/**
	 * @return the pi_EquIns_Result
	 */
	public String getPi_EquIns_Result() {
		return pi_EquIns_Result;
	}
	/**
	 * @param pi_EquIns_Result the pi_EquIns_Result to set
	 */
	public void setPi_EquIns_Result(String pi_EquIns_Result) {
		this.pi_EquIns_Result = pi_EquIns_Result;
	}
	/**
	 * @return the pi_Assur_Check
	 */
	public String getPi_Assur_Check() {
		return pi_Assur_Check;
	}
	/**
	 * @param pi_Assur_Check the pi_Assur_Check to set
	 */
	public void setPi_Assur_Check(String pi_Assur_Check) {
		this.pi_Assur_Check = pi_Assur_Check;
	}
	/**
	 * @return the pi_Assur_Result
	 */
	public String getPi_Assur_Result() {
		return pi_Assur_Result;
	}
	/**
	 * @param pi_Assur_Result the pi_Assur_Result to set
	 */
	public void setPi_Assur_Result(String pi_Assur_Result) {
		this.pi_Assur_Result = pi_Assur_Result;
	}
	/**
	 * @return the pi_Explain_Check
	 */
	public String getPi_Explain_Check() {
		return pi_Explain_Check;
	}
	/**
	 * @param pi_Explain_Check the pi_Explain_Check to set
	 */
	public void setPi_Explain_Check(String pi_Explain_Check) {
		this.pi_Explain_Check = pi_Explain_Check;
	}
	/**
	 * @return the pi_Explain_Result
	 */
	public String getPi_Explain_Result() {
		return pi_Explain_Result;
	}
	/**
	 * @param pi_Explain_Result the pi_Explain_Result to set
	 */
	public void setPi_Explain_Result(String pi_Explain_Result) {
		this.pi_Explain_Result = pi_Explain_Result;
	}
	/**
	 * @return the pi_Cons_Check
	 */
	public String getPi_Cons_Check() {
		return pi_Cons_Check;
	}
	/**
	 * @param pi_Cons_Check the pi_Cons_Check to set
	 */
	public void setPi_Cons_Check(String pi_Cons_Check) {
		this.pi_Cons_Check = pi_Cons_Check;
	}
	/**
	 * @return the pi_Cons_Result
	 */
	public String getPi_Cons_Result() {
		return pi_Cons_Result;
	}
	/**
	 * @param pi_Cons_Result the pi_Cons_Result to set
	 */
	public void setPi_Cons_Result(String pi_Cons_Result) {
		this.pi_Cons_Result = pi_Cons_Result;
	}
	/**
	 * @return the pi_Wel_Check
	 */
	public String getPi_Wel_Check() {
		return pi_Wel_Check;
	}
	/**
	 * @param pi_Wel_Check the pi_Wel_Check to set
	 */
	public void setPi_Wel_Check(String pi_Wel_Check) {
		this.pi_Wel_Check = pi_Wel_Check;
	}
	/**
	 * @return the pi_Wel_Result
	 */
	public String getPi_Wel_Result() {
		return pi_Wel_Result;
	}
	/**
	 * @param pi_Wel_Result the pi_Wel_Result to set
	 */
	public void setPi_Wel_Result(String pi_Wel_Result) {
		this.pi_Wel_Result = pi_Wel_Result;
	}
	/**
	 * @return the pi_NDE_Check
	 */
	public String getPi_NDE_Check() {
		return pi_NDE_Check;
	}
	/**
	 * @param pi_NDE_Check the pi_NDE_Check to set
	 */
	public void setPi_NDE_Check(String pi_NDE_Check) {
		this.pi_NDE_Check = pi_NDE_Check;
	}
	/**
	 * @return the pi_NDE_Result
	 */
	public String getPi_NDE_Result() {
		return pi_NDE_Result;
	}
	/**
	 * @param pi_NDE_Result the pi_NDE_Result to set
	 */
	public void setPi_NDE_Result(String pi_NDE_Result) {
		this.pi_NDE_Result = pi_NDE_Result;
	}
	/**
	 * @return the pi_WelReg_Check
	 */
	public String getPi_WelReg_Check() {
		return pi_WelReg_Check;
	}
	/**
	 * @param pi_WelReg_Check the pi_WelReg_Check to set
	 */
	public void setPi_WelReg_Check(String pi_WelReg_Check) {
		this.pi_WelReg_Check = pi_WelReg_Check;
	}
	/**
	 * @return the pi_WelReg_Result
	 */
	public String getPi_WelReg_Result() {
		return pi_WelReg_Result;
	}
	/**
	 * @param pi_WelReg_Result the pi_WelReg_Result to set
	 */
	public void setPi_WelReg_Result(String pi_WelReg_Result) {
		this.pi_WelReg_Result = pi_WelReg_Result;
	}
	/**
	 * @return the pi_NDEBook_Check
	 */
	public String getPi_NDEBook_Check() {
		return pi_NDEBook_Check;
	}
	/**
	 * @param pi_NDEBook_Check the pi_NDEBook_Check to set
	 */
	public void setPi_NDEBook_Check(String pi_NDEBook_Check) {
		this.pi_NDEBook_Check = pi_NDEBook_Check;
	}
	/**
	 * @return the pi_NDEBook_Result
	 */
	public String getPi_NDEBook_Result() {
		return pi_NDEBook_Result;
	}
	/**
	 * @param pi_NDEBook_Result the pi_NDEBook_Result to set
	 */
	public void setPi_NDEBook_Result(String pi_NDEBook_Result) {
		this.pi_NDEBook_Result = pi_NDEBook_Result;
	}
	/**
	 * @return the pi_Compon_Check
	 */
	public String getPi_Compon_Check() {
		return pi_Compon_Check;
	}
	/**
	 * @param pi_Compon_Check the pi_Compon_Check to set
	 */
	public void setPi_Compon_Check(String pi_Compon_Check) {
		this.pi_Compon_Check = pi_Compon_Check;
	}
	/**
	 * @return the pi_Compon_Result
	 */
	public String getPi_Compon_Result() {
		return pi_Compon_Result;
	}
	/**
	 * @param pi_Compon_Result the pi_Compon_Result to set
	 */
	public void setPi_Compon_Result(String pi_Compon_Result) {
		this.pi_Compon_Result = pi_Compon_Result;
	}
	/**
	 * @return the pi_Compon_Rep_Check
	 */
	public String getPi_Compon_Rep_Check() {
		return pi_Compon_Rep_Check;
	}
	/**
	 * @param pi_Compon_Rep_Check the pi_Compon_Rep_Check to set
	 */
	public void setPi_Compon_Rep_Check(String pi_Compon_Rep_Check) {
		this.pi_Compon_Rep_Check = pi_Compon_Rep_Check;
	}
	/**
	 * @return the pi_Compon_Rep_Result
	 */
	public String getPi_Compon_Rep_Result() {
		return pi_Compon_Rep_Result;
	}
	/**
	 * @param pi_Compon_Rep_Result the pi_Compon_Rep_Result to set
	 */
	public void setPi_Compon_Rep_Result(String pi_Compon_Rep_Result) {
		this.pi_Compon_Rep_Result = pi_Compon_Rep_Result;
	}
	/**
	 * @return the pi_Proc_Check
	 */
	public String getPi_Proc_Check() {
		return pi_Proc_Check;
	}
	/**
	 * @param pi_Proc_Check the pi_Proc_Check to set
	 */
	public void setPi_Proc_Check(String pi_Proc_Check) {
		this.pi_Proc_Check = pi_Proc_Check;
	}
	/**
	 * @return the pi_Proc_Result
	 */
	public String getPi_Proc_Result() {
		return pi_Proc_Result;
	}
	/**
	 * @param pi_Proc_Result the pi_Proc_Result to set
	 */
	public void setPi_Proc_Result(String pi_Proc_Result) {
		this.pi_Proc_Result = pi_Proc_Result;
	}
	/**
	 * @return the pi_Valve_Check
	 */
	public String getPi_Valve_Check() {
		return pi_Valve_Check;
	}
	/**
	 * @param pi_Valve_Check the pi_Valve_Check to set
	 */
	public void setPi_Valve_Check(String pi_Valve_Check) {
		this.pi_Valve_Check = pi_Valve_Check;
	}
	/**
	 * @return the pi_Valve_Result
	 */
	public String getPi_Valve_Result() {
		return pi_Valve_Result;
	}
	/**
	 * @param pi_Valve_Result the pi_Valve_Result to set
	 */
	public void setPi_Valve_Result(String pi_Valve_Result) {
		this.pi_Valve_Result = pi_Valve_Result;
	}
	/**
	 * @return the pi_InsCons_Check
	 */
	public String getPi_InsCons_Check() {
		return pi_InsCons_Check;
	}
	/**
	 * @param pi_InsCons_Check the pi_InsCons_Check to set
	 */
	public void setPi_InsCons_Check(String pi_InsCons_Check) {
		this.pi_InsCons_Check = pi_InsCons_Check;
	}
	/**
	 * @return the pi_InsCons_Result
	 */
	public String getPi_InsCons_Result() {
		return pi_InsCons_Result;
	}
	/**
	 * @param pi_InsCons_Result the pi_InsCons_Result to set
	 */
	public void setPi_InsCons_Result(String pi_InsCons_Result) {
		this.pi_InsCons_Result = pi_InsCons_Result;
	}
	/**
	 * @return the pi_WelCons_Check
	 */
	public String getPi_WelCons_Check() {
		return pi_WelCons_Check;
	}
	/**
	 * @param pi_WelCons_Check the pi_WelCons_Check to set
	 */
	public void setPi_WelCons_Check(String pi_WelCons_Check) {
		this.pi_WelCons_Check = pi_WelCons_Check;
	}
	/**
	 * @return the pi_WelCons_Result
	 */
	public String getPi_WelCons_Result() {
		return pi_WelCons_Result;
	}
	/**
	 * @param pi_WelCons_Result the pi_WelCons_Result to set
	 */
	public void setPi_WelCons_Result(String pi_WelCons_Result) {
		this.pi_WelCons_Result = pi_WelCons_Result;
	}
	/**
	 * @return the pi_compen_Check
	 */
	public String getPi_compen_Check() {
		return pi_compen_Check;
	}
	/**
	 * @param pi_compen_Check the pi_compen_Check to set
	 */
	public void setPi_compen_Check(String pi_compen_Check) {
		this.pi_compen_Check = pi_compen_Check;
	}
	/**
	 * @return the pi_compen_Result
	 */
	public String getPi_compen_Result() {
		return pi_compen_Result;
	}
	/**
	 * @param pi_compen_Result the pi_compen_Result to set
	 */
	public void setPi_compen_Result(String pi_compen_Result) {
		this.pi_compen_Result = pi_compen_Result;
	}
	/**
	 * @return the pi_Hanger_Check
	 */
	public String getPi_Hanger_Check() {
		return pi_Hanger_Check;
	}
	/**
	 * @param pi_Hanger_Check the pi_Hanger_Check to set
	 */
	public void setPi_Hanger_Check(String pi_Hanger_Check) {
		this.pi_Hanger_Check = pi_Hanger_Check;
	}
	/**
	 * @return the pi_Hanger_Result
	 */
	public String getPi_Hanger_Result() {
		return pi_Hanger_Result;
	}
	/**
	 * @param pi_Hanger_Result the pi_Hanger_Result to set
	 */
	public void setPi_Hanger_Result(String pi_Hanger_Result) {
		this.pi_Hanger_Result = pi_Hanger_Result;
	}
	/**
	 * @return the pi_Hidden_Check
	 */
	public String getPi_Hidden_Check() {
		return pi_Hidden_Check;
	}
	/**
	 * @param pi_Hidden_Check the pi_Hidden_Check to set
	 */
	public void setPi_Hidden_Check(String pi_Hidden_Check) {
		this.pi_Hidden_Check = pi_Hidden_Check;
	}
	/**
	 * @return the pi_Hidden_Result
	 */
	public String getPi_Hidden_Result() {
		return pi_Hidden_Result;
	}
	/**
	 * @param pi_Hidden_Result the pi_Hidden_Result to set
	 */
	public void setPi_Hidden_Result(String pi_Hidden_Result) {
		this.pi_Hidden_Result = pi_Hidden_Result;
	}
	/**
	 * @return the pi_WelHeat_Check
	 */
	public String getPi_WelHeat_Check() {
		return pi_WelHeat_Check;
	}
	/**
	 * @param pi_WelHeat_Check the pi_WelHeat_Check to set
	 */
	public void setPi_WelHeat_Check(String pi_WelHeat_Check) {
		this.pi_WelHeat_Check = pi_WelHeat_Check;
	}
	/**
	 * @return the pi_WelHeat_Result
	 */
	public String getPi_WelHeat_Result() {
		return pi_WelHeat_Result;
	}
	/**
	 * @param pi_WelHeat_Result the pi_WelHeat_Result to set
	 */
	public void setPi_WelHeat_Result(String pi_WelHeat_Result) {
		this.pi_WelHeat_Result = pi_WelHeat_Result;
	}
	/**
	 * @return the pi_NDERep_Check
	 */
	public String getPi_NDERep_Check() {
		return pi_NDERep_Check;
	}
	/**
	 * @param pi_NDERep_Check the pi_NDERep_Check to set
	 */
	public void setPi_NDERep_Check(String pi_NDERep_Check) {
		this.pi_NDERep_Check = pi_NDERep_Check;
	}
	/**
	 * @return the pi_NDERep_Result
	 */
	public String getPi_NDERep_Result() {
		return pi_NDERep_Result;
	}
	/**
	 * @param pi_NDERep_Result the pi_NDERep_Result to set
	 */
	public void setPi_NDERep_Result(String pi_NDERep_Result) {
		this.pi_NDERep_Result = pi_NDERep_Result;
	}
	/**
	 * @return the pi_LeakRep_Check
	 */
	public String getPi_LeakRep_Check() {
		return pi_LeakRep_Check;
	}
	/**
	 * @param pi_LeakRep_Check the pi_LeakRep_Check to set
	 */
	public void setPi_LeakRep_Check(String pi_LeakRep_Check) {
		this.pi_LeakRep_Check = pi_LeakRep_Check;
	}
	/**
	 * @return the pi_LeakRep_Result
	 */
	public String getPi_LeakRep_Result() {
		return pi_LeakRep_Result;
	}
	/**
	 * @param pi_LeakRep_Result the pi_LeakRep_Result to set
	 */
	public void setPi_LeakRep_Result(String pi_LeakRep_Result) {
		this.pi_LeakRep_Result = pi_LeakRep_Result;
	}
	/**
	 * @return the pi_DryRep_Check
	 */
	public String getPi_DryRep_Check() {
		return pi_DryRep_Check;
	}
	/**
	 * @param pi_DryRep_Check the pi_DryRep_Check to set
	 */
	public void setPi_DryRep_Check(String pi_DryRep_Check) {
		this.pi_DryRep_Check = pi_DryRep_Check;
	}
	/**
	 * @return the pi_DrykRep_Result
	 */
	public String getPi_DrykRep_Result() {
		return pi_DrykRep_Result;
	}
	/**
	 * @param pi_DrykRep_Result the pi_DrykRep_Result to set
	 */
	public void setPi_DrykRep_Result(String pi_DrykRep_Result) {
		this.pi_DrykRep_Result = pi_DrykRep_Result;
	}
	/**
	 * @return the pi_SafeEqu_Check
	 */
	public String getPi_SafeEqu_Check() {
		return pi_SafeEqu_Check;
	}
	/**
	 * @param pi_SafeEqu_Check the pi_SafeEqu_Check to set
	 */
	public void setPi_SafeEqu_Check(String pi_SafeEqu_Check) {
		this.pi_SafeEqu_Check = pi_SafeEqu_Check;
	}
	/**
	 * @return the pi_SafeEqu_Result
	 */
	public String getPi_SafeEqu_Result() {
		return pi_SafeEqu_Result;
	}
	/**
	 * @param pi_SafeEqu_Result the pi_SafeEqu_Result to set
	 */
	public void setPi_SafeEqu_Result(String pi_SafeEqu_Result) {
		this.pi_SafeEqu_Result = pi_SafeEqu_Result;
	}
	/**
	 * @return the pi_ProTest_Check
	 */
	public String getPi_ProTest_Check() {
		return pi_ProTest_Check;
	}
	/**
	 * @param pi_ProTest_Check the pi_ProTest_Check to set
	 */
	public void setPi_ProTest_Check(String pi_ProTest_Check) {
		this.pi_ProTest_Check = pi_ProTest_Check;
	}
	/**
	 * @return the pi_ProTest_Result
	 */
	public String getPi_ProTest_Result() {
		return pi_ProTest_Result;
	}
	/**
	 * @param pi_ProTest_Result the pi_ProTest_Result to set
	 */
	public void setPi_ProTest_Result(String pi_ProTest_Result) {
		this.pi_ProTest_Result = pi_ProTest_Result;
	}
	/**
	 * @return the pi_Sta_Ele_Check
	 */
	public String getPi_Sta_Ele_Check() {
		return pi_Sta_Ele_Check;
	}
	/**
	 * @param pi_Sta_Ele_Check the pi_Sta_Ele_Check to set
	 */
	public void setPi_Sta_Ele_Check(String pi_Sta_Ele_Check) {
		this.pi_Sta_Ele_Check = pi_Sta_Ele_Check;
	}
	/**
	 * @return the pi_Sta_Ele_Result
	 */
	public String getPi_Sta_Ele_Result() {
		return pi_Sta_Ele_Result;
	}
	/**
	 * @param pi_Sta_Ele_Result the pi_Sta_Ele_Result to set
	 */
	public void setPi_Sta_Ele_Result(String pi_Sta_Ele_Result) {
		this.pi_Sta_Ele_Result = pi_Sta_Ele_Result;
	}
	/**
	 * @return the pi_InsTem_Check
	 */
	public String getPi_InsTem_Check() {
		return pi_InsTem_Check;
	}
	/**
	 * @param pi_InsTem_Check the pi_InsTem_Check to set
	 */
	public void setPi_InsTem_Check(String pi_InsTem_Check) {
		this.pi_InsTem_Check = pi_InsTem_Check;
	}
	/**
	 * @return the pi_InsTem_Result
	 */
	public String getPi_InsTem_Result() {
		return pi_InsTem_Result;
	}
	/**
	 * @param pi_InsTem_Result the pi_InsTem_Result to set
	 */
	public void setPi_InsTem_Result(String pi_InsTem_Result) {
		this.pi_InsTem_Result = pi_InsTem_Result;
	}
	/**
	 * @return the pi_Change_Check
	 */
	public String getPi_Change_Check() {
		return pi_Change_Check;
	}
	/**
	 * @param pi_Change_Check the pi_Change_Check to set
	 */
	public void setPi_Change_Check(String pi_Change_Check) {
		this.pi_Change_Check = pi_Change_Check;
	}
	/**
	 * @return the pi_Change_Result
	 */
	public String getPi_Change_Result() {
		return pi_Change_Result;
	}
	/**
	 * @param pi_Change_Result the pi_Change_Result to set
	 */
	public void setPi_Change_Result(String pi_Change_Result) {
		this.pi_Change_Result = pi_Change_Result;
	}
	/**
	 * @return the pi_Complete_Pic_Check
	 */
	public String getPi_Complete_Pic_Check() {
		return pi_Complete_Pic_Check;
	}
	/**
	 * @param pi_Complete_Pic_Check the pi_Complete_Pic_Check to set
	 */
	public void setPi_Complete_Pic_Check(String pi_Complete_Pic_Check) {
		this.pi_Complete_Pic_Check = pi_Complete_Pic_Check;
	}
	/**
	 * @return the pi_Complete_Pic_Result
	 */
	public String getPi_Complete_Pic_Result() {
		return pi_Complete_Pic_Result;
	}
	/**
	 * @param pi_Complete_Pic_Result the pi_Complete_Pic_Result to set
	 */
	public void setPi_Complete_Pic_Result(String pi_Complete_Pic_Result) {
		this.pi_Complete_Pic_Result = pi_Complete_Pic_Result;
	}
	/**
	 * @return the pi_Complete_Remark
	 */
	public String getPi_Complete_Remark() {
		return pi_Complete_Remark;
	}
	/**
	 * @param pi_Complete_Remark the pi_Complete_Remark to set
	 */
	public void setPi_Complete_Remark(String pi_Complete_Remark) {
		this.pi_Complete_Remark = pi_Complete_Remark;
	}
	/**
	 * @return the pi_Complete_Per
	 */
	public String getPi_Complete_Per() {
		return pi_Complete_Per;
	}
	/**
	 * @param pi_Complete_Per the pi_Complete_Per to set
	 */
	public void setPi_Complete_Per(String pi_Complete_Per) {
		this.pi_Complete_Per = pi_Complete_Per;
	}
	/**
	 * @return the pi_Complete_Date
	 */
	public String getPi_Complete_Date() {
		return pi_Complete_Date;
	}
	/**
	 * @param pi_Complete_Date the pi_Complete_Date to set
	 */
	public void setPi_Complete_Date(String pi_Complete_Date) {
		this.pi_Complete_Date = pi_Complete_Date;
	}
		
}
