package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_piComInf")
public class PIComInf {

	private long id;//相关单位安全质量管理行为的评价记录
	private PipeInstall pipeInstall;
	private String pi_Cons_Inf1;//设计、监理、安装、检测及防腐合同管理
	private String pi_Cons_Inf2;//组织设计交底和施工方案讨论
	private String pi_Cons_Inf3;//材料采购质量控制与施工管理
	private String pi_Cons_Inf4;//监督检验意见处理情况
	private String pi_Cons_Opinion;//评价意见
	private String pi_Sup_Inf1;//监理单位资质、监理人员资格
	private String pi_Sup_Inf2;//监理单位质量管理体系
	private String pi_Sup_Inf3;//监理工作质量
	private String pi_Sup_Inf4;//监督检验意见处理情况
	private String pi_Sup_Opinion;//评价意见
	private String pi_InsCom_Inf1;//安装单位资质与告知手续
	private String pi_InsCom_Inf2;//质量管理体系及专业技术、管理人员
	private String pi_InsCom_Inf3;//材料验收及施工质量检验管理
	private String pi_InsCom_Inf4;//焊工资格、焊评报告及焊接工艺、施工方案实施情况
	private String pi_InsCom_Inf5;//施工技术文件管理
	private String pi_InsCom_Inf6;//安装分包、转包管理
	private String pi_InsCom_Inf7;//监督检验意见处理情况
	private String pi_InsCom_Opinion;//评价意见
	private String pi_CheCom_Inf1;//检测单位资质检测人员资格
	private String pi_CheCom_Inf2;//检测单位质量管理体系
	private String pi_CheCom_Inf3;//检测工作质量与检测报告
	private String pi_CheCom_Inf4;//监督检验意见处理情况
	private String pi_CheCom_Opinion;//评价意见
	private String pi_Pro_Inf1;//防腐单位资质
	private String pi_Pro_Inf2;//防腐单位质量管理体系
	private String pi_Pro_Inf3;//防腐工作质量与施工记录
	private String pi_Pro_Inf4;//监督检验意见处理情况
	private String pi_Pro_Opinion;//评价意见
	private String pi_InsCom_Remark;//备注
	private String pi_InsCom_Per;//监检人
	private String pi_InsCom_Date;//监检日期
	
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
	@OneToOne(mappedBy="piComInf")
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
	 * @return the pi_Cons_Inf1
	 */
	public String getPi_Cons_Inf1() {
		return pi_Cons_Inf1;
	}
	/**
	 * @param pi_Cons_Inf1 the pi_Cons_Inf1 to set
	 */
	public void setPi_Cons_Inf1(String pi_Cons_Inf1) {
		this.pi_Cons_Inf1 = pi_Cons_Inf1;
	}
	/**
	 * @return the pi_Cons_Inf2
	 */
	public String getPi_Cons_Inf2() {
		return pi_Cons_Inf2;
	}
	/**
	 * @param pi_Cons_Inf2 the pi_Cons_Inf2 to set
	 */
	public void setPi_Cons_Inf2(String pi_Cons_Inf2) {
		this.pi_Cons_Inf2 = pi_Cons_Inf2;
	}
	/**
	 * @return the pi_Cons_Inf3
	 */
	public String getPi_Cons_Inf3() {
		return pi_Cons_Inf3;
	}
	/**
	 * @param pi_Cons_Inf3 the pi_Cons_Inf3 to set
	 */
	public void setPi_Cons_Inf3(String pi_Cons_Inf3) {
		this.pi_Cons_Inf3 = pi_Cons_Inf3;
	}
	/**
	 * @return the pi_Cons_Inf4
	 */
	public String getPi_Cons_Inf4() {
		return pi_Cons_Inf4;
	}
	/**
	 * @param pi_Cons_Inf4 the pi_Cons_Inf4 to set
	 */
	public void setPi_Cons_Inf4(String pi_Cons_Inf4) {
		this.pi_Cons_Inf4 = pi_Cons_Inf4;
	}
	/**
	 * @return the pi_Cons_Opinion
	 */
	public String getPi_Cons_Opinion() {
		return pi_Cons_Opinion;
	}
	/**
	 * @param pi_Cons_Opinion the pi_Cons_Opinion to set
	 */
	public void setPi_Cons_Opinion(String pi_Cons_Opinion) {
		this.pi_Cons_Opinion = pi_Cons_Opinion;
	}
	/**
	 * @return the pi_Sup_Inf1
	 */
	public String getPi_Sup_Inf1() {
		return pi_Sup_Inf1;
	}
	/**
	 * @param pi_Sup_Inf1 the pi_Sup_Inf1 to set
	 */
	public void setPi_Sup_Inf1(String pi_Sup_Inf1) {
		this.pi_Sup_Inf1 = pi_Sup_Inf1;
	}
	/**
	 * @return the pi_Sup_Inf2
	 */
	public String getPi_Sup_Inf2() {
		return pi_Sup_Inf2;
	}
	/**
	 * @param pi_Sup_Inf2 the pi_Sup_Inf2 to set
	 */
	public void setPi_Sup_Inf2(String pi_Sup_Inf2) {
		this.pi_Sup_Inf2 = pi_Sup_Inf2;
	}
	/**
	 * @return the pi_Sup_Inf3
	 */
	public String getPi_Sup_Inf3() {
		return pi_Sup_Inf3;
	}
	/**
	 * @param pi_Sup_Inf3 the pi_Sup_Inf3 to set
	 */
	public void setPi_Sup_Inf3(String pi_Sup_Inf3) {
		this.pi_Sup_Inf3 = pi_Sup_Inf3;
	}
	/**
	 * @return the pi_Sup_Inf4
	 */
	public String getPi_Sup_Inf4() {
		return pi_Sup_Inf4;
	}
	/**
	 * @param pi_Sup_Inf4 the pi_Sup_Inf4 to set
	 */
	public void setPi_Sup_Inf4(String pi_Sup_Inf4) {
		this.pi_Sup_Inf4 = pi_Sup_Inf4;
	}
	/**
	 * @return the pi_Sup_Opinion
	 */
	public String getPi_Sup_Opinion() {
		return pi_Sup_Opinion;
	}
	/**
	 * @param pi_Sup_Opinion the pi_Sup_Opinion to set
	 */
	public void setPi_Sup_Opinion(String pi_Sup_Opinion) {
		this.pi_Sup_Opinion = pi_Sup_Opinion;
	}
	/**
	 * @return the pi_InsCom_Inf1
	 */
	public String getPi_InsCom_Inf1() {
		return pi_InsCom_Inf1;
	}
	/**
	 * @param pi_InsCom_Inf1 the pi_InsCom_Inf1 to set
	 */
	public void setPi_InsCom_Inf1(String pi_InsCom_Inf1) {
		this.pi_InsCom_Inf1 = pi_InsCom_Inf1;
	}
	/**
	 * @return the pi_InsCom_Inf2
	 */
	public String getPi_InsCom_Inf2() {
		return pi_InsCom_Inf2;
	}
	/**
	 * @param pi_InsCom_Inf2 the pi_InsCom_Inf2 to set
	 */
	public void setPi_InsCom_Inf2(String pi_InsCom_Inf2) {
		this.pi_InsCom_Inf2 = pi_InsCom_Inf2;
	}
	/**
	 * @return the pi_InsCom_Inf3
	 */
	public String getPi_InsCom_Inf3() {
		return pi_InsCom_Inf3;
	}
	/**
	 * @param pi_InsCom_Inf3 the pi_InsCom_Inf3 to set
	 */
	public void setPi_InsCom_Inf3(String pi_InsCom_Inf3) {
		this.pi_InsCom_Inf3 = pi_InsCom_Inf3;
	}
	/**
	 * @return the pi_InsCom_Inf4
	 */
	public String getPi_InsCom_Inf4() {
		return pi_InsCom_Inf4;
	}
	/**
	 * @param pi_InsCom_Inf4 the pi_InsCom_Inf4 to set
	 */
	public void setPi_InsCom_Inf4(String pi_InsCom_Inf4) {
		this.pi_InsCom_Inf4 = pi_InsCom_Inf4;
	}
	/**
	 * @return the pi_InsCom_Inf5
	 */
	public String getPi_InsCom_Inf5() {
		return pi_InsCom_Inf5;
	}
	/**
	 * @param pi_InsCom_Inf5 the pi_InsCom_Inf5 to set
	 */
	public void setPi_InsCom_Inf5(String pi_InsCom_Inf5) {
		this.pi_InsCom_Inf5 = pi_InsCom_Inf5;
	}
	/**
	 * @return the pi_InsCom_Inf6
	 */
	public String getPi_InsCom_Inf6() {
		return pi_InsCom_Inf6;
	}
	/**
	 * @param pi_InsCom_Inf6 the pi_InsCom_Inf6 to set
	 */
	public void setPi_InsCom_Inf6(String pi_InsCom_Inf6) {
		this.pi_InsCom_Inf6 = pi_InsCom_Inf6;
	}
	/**
	 * @return the pi_InsCom_Inf7
	 */
	public String getPi_InsCom_Inf7() {
		return pi_InsCom_Inf7;
	}
	/**
	 * @param pi_InsCom_Inf7 the pi_InsCom_Inf7 to set
	 */
	public void setPi_InsCom_Inf7(String pi_InsCom_Inf7) {
		this.pi_InsCom_Inf7 = pi_InsCom_Inf7;
	}
	/**
	 * @return the pi_InsCom_Opinion
	 */
	public String getPi_InsCom_Opinion() {
		return pi_InsCom_Opinion;
	}
	/**
	 * @param pi_InsCom_Opinion the pi_InsCom_Opinion to set
	 */
	public void setPi_InsCom_Opinion(String pi_InsCom_Opinion) {
		this.pi_InsCom_Opinion = pi_InsCom_Opinion;
	}
	/**
	 * @return the pi_CheCom_Inf1
	 */
	public String getPi_CheCom_Inf1() {
		return pi_CheCom_Inf1;
	}
	/**
	 * @param pi_CheCom_Inf1 the pi_CheCom_Inf1 to set
	 */
	public void setPi_CheCom_Inf1(String pi_CheCom_Inf1) {
		this.pi_CheCom_Inf1 = pi_CheCom_Inf1;
	}
	/**
	 * @return the pi_CheCom_Inf2
	 */
	public String getPi_CheCom_Inf2() {
		return pi_CheCom_Inf2;
	}
	/**
	 * @param pi_CheCom_Inf2 the pi_CheCom_Inf2 to set
	 */
	public void setPi_CheCom_Inf2(String pi_CheCom_Inf2) {
		this.pi_CheCom_Inf2 = pi_CheCom_Inf2;
	}
	/**
	 * @return the pi_CheCom_Inf3
	 */
	public String getPi_CheCom_Inf3() {
		return pi_CheCom_Inf3;
	}
	/**
	 * @param pi_CheCom_Inf3 the pi_CheCom_Inf3 to set
	 */
	public void setPi_CheCom_Inf3(String pi_CheCom_Inf3) {
		this.pi_CheCom_Inf3 = pi_CheCom_Inf3;
	}
	/**
	 * @return the pi_CheCom_Inf4
	 */
	public String getPi_CheCom_Inf4() {
		return pi_CheCom_Inf4;
	}
	/**
	 * @param pi_CheCom_Inf4 the pi_CheCom_Inf4 to set
	 */
	public void setPi_CheCom_Inf4(String pi_CheCom_Inf4) {
		this.pi_CheCom_Inf4 = pi_CheCom_Inf4;
	}
	/**
	 * @return the pi_CheCom_Opinion
	 */
	public String getPi_CheCom_Opinion() {
		return pi_CheCom_Opinion;
	}
	/**
	 * @param pi_CheCom_Opinion the pi_CheCom_Opinion to set
	 */
	public void setPi_CheCom_Opinion(String pi_CheCom_Opinion) {
		this.pi_CheCom_Opinion = pi_CheCom_Opinion;
	}
	/**
	 * @return the pi_Pro_Inf1
	 */
	public String getPi_Pro_Inf1() {
		return pi_Pro_Inf1;
	}
	/**
	 * @param pi_Pro_Inf1 the pi_Pro_Inf1 to set
	 */
	public void setPi_Pro_Inf1(String pi_Pro_Inf1) {
		this.pi_Pro_Inf1 = pi_Pro_Inf1;
	}
	/**
	 * @return the pi_Pro_Inf2
	 */
	public String getPi_Pro_Inf2() {
		return pi_Pro_Inf2;
	}
	/**
	 * @param pi_Pro_Inf2 the pi_Pro_Inf2 to set
	 */
	public void setPi_Pro_Inf2(String pi_Pro_Inf2) {
		this.pi_Pro_Inf2 = pi_Pro_Inf2;
	}
	/**
	 * @return the pi_Pro_Inf3
	 */
	public String getPi_Pro_Inf3() {
		return pi_Pro_Inf3;
	}
	/**
	 * @param pi_Pro_Inf3 the pi_Pro_Inf3 to set
	 */
	public void setPi_Pro_Inf3(String pi_Pro_Inf3) {
		this.pi_Pro_Inf3 = pi_Pro_Inf3;
	}
	/**
	 * @return the pi_Pro_Inf4
	 */
	public String getPi_Pro_Inf4() {
		return pi_Pro_Inf4;
	}
	/**
	 * @param pi_Pro_Inf4 the pi_Pro_Inf4 to set
	 */
	public void setPi_Pro_Inf4(String pi_Pro_Inf4) {
		this.pi_Pro_Inf4 = pi_Pro_Inf4;
	}
	/**
	 * @return the pi_Pro_Opinion
	 */
	public String getPi_Pro_Opinion() {
		return pi_Pro_Opinion;
	}
	/**
	 * @param pi_Pro_Opinion the pi_Pro_Opinion to set
	 */
	public void setPi_Pro_Opinion(String pi_Pro_Opinion) {
		this.pi_Pro_Opinion = pi_Pro_Opinion;
	}
	/**
	 * @return the pi_InsCom_Remark
	 */
	public String getPi_InsCom_Remark() {
		return pi_InsCom_Remark;
	}
	/**
	 * @param pi_InsCom_Remark the pi_InsCom_Remark to set
	 */
	public void setPi_InsCom_Remark(String pi_InsCom_Remark) {
		this.pi_InsCom_Remark = pi_InsCom_Remark;
	}
	/**
	 * @return the pi_InsCom_Per
	 */
	public String getPi_InsCom_Per() {
		return pi_InsCom_Per;
	}
	/**
	 * @param pi_InsCom_Per the pi_InsCom_Per to set
	 */
	public void setPi_InsCom_Per(String pi_InsCom_Per) {
		this.pi_InsCom_Per = pi_InsCom_Per;
	}
	/**
	 * @return the pi_InsCom_Date
	 */
	public String getPi_InsCom_Date() {
		return pi_InsCom_Date;
	}
	/**
	 * @param pi_InsCom_Date the pi_InsCom_Date to set
	 */
	public void setPi_InsCom_Date(String pi_InsCom_Date) {
		this.pi_InsCom_Date = pi_InsCom_Date;
	}
	
	
	
	
	
}
