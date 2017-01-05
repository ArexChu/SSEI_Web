package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_piCheckInf")
public class PICheckInf {
	
	private long id;//工作内容及工作基本情况记录
	private PipeInstall pipeInstall;
	private String pi_Check1_inf;//安装告知书
	private String pi_Check1_Date;//
	private String pi_Check2_inf;//设计单位资质及图纸审查
	private String pi_Check2_Date;//
	private String pi_Check3_inf;//设计变更及材料代用手续
	private String pi_Check3_Date;//
	private String pi_Check4_inf;//施工方案及焊接工艺评定
	private String pi_Check4_Date;//
	private String pi_Check5_inf;//焊接、探伤人员资格审查
	private String pi_Check5_Date;//
	private String pi_Check6_inf;//管道元件、焊接材料质量证明文件
	private String pi_Check6_Date;//
	private String pi_Check7_inf;//阀门强度与密封性试验
	private String pi_Check7_Date;//
	private String pi_Check8_inf;//管道布置及焊缝检查
	private String pi_Check8_Date;//
	private String pi_Check9_inf;//支吊架安装质量检查
	private String pi_Check9_Date;//
	private String pi_Check10_inf;//可拆件/补偿器/阀门/法兰安装质量抽查
	private String pi_Check10_Date;//
	private String pi_Check11_inf;//射线底片抽审
	private String pi_Check11_Date;//
	private String pi_Check12_inf;//无损检测结果质量评定
	private String pi_Check12_Date;//
	private String pi_Check13_inf;//管道强度试验
	private String pi_Check13_Date;//
	private String pi_Check14_inf;//管道泄漏性试验
	private String pi_Check14_Date;//
	private String pi_Check15_inf;//管道附属设备安装质量
	private String pi_Check15_Date;//
	private String pi_Check16_inf;//防静电设施安装质量
	private String pi_Check16_Date;//
	private String pi_Check17_inf;//管道吹扫、清洗、通球质量
	private String pi_Check17_Date;//
	private String pi_Check18_inf;//管道防腐、绝热施工质量抽查
	private String pi_Check18_Date;//
	private String pi_Check19_inf;//管道安全附件检查
	private String pi_Check19_Date;//
	private String pi_Check20_inf;//相关单位安全质量管理行为
	private String pi_Check20_Date;//
	private String pi_Check21_inf;//安装竣工技术文件审查
	private String pi_Check21_Date;//
	private String pi_Check_Result;//结论
	private String pi_Check_Remark;//备注
	private String pi_Check_Per;//监检人
	private String pi_CheckInf_Date;//监检日期
	
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
	@OneToOne(mappedBy="piCheckInf")
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
	 * @return the pi_Check1_inf
	 */
	public String getPi_Check1_inf() {
		return pi_Check1_inf;
	}
	/**
	 * @param pi_Check1_inf the pi_Check1_inf to set
	 */
	public void setPi_Check1_inf(String pi_Check1_inf) {
		this.pi_Check1_inf = pi_Check1_inf;
	}
	/**
	 * @return the pi_Check1_Date
	 */
	public String getPi_Check1_Date() {
		return pi_Check1_Date;
	}
	/**
	 * @param pi_Check1_Date the pi_Check1_Date to set
	 */
	public void setPi_Check1_Date(String pi_Check1_Date) {
		this.pi_Check1_Date = pi_Check1_Date;
	}
	/**
	 * @return the pi_Check2_inf
	 */
	public String getPi_Check2_inf() {
		return pi_Check2_inf;
	}
	/**
	 * @param pi_Check2_inf the pi_Check2_inf to set
	 */
	public void setPi_Check2_inf(String pi_Check2_inf) {
		this.pi_Check2_inf = pi_Check2_inf;
	}
	/**
	 * @return the pi_Check2_Date
	 */
	public String getPi_Check2_Date() {
		return pi_Check2_Date;
	}
	/**
	 * @param pi_Check2_Date the pi_Check2_Date to set
	 */
	public void setPi_Check2_Date(String pi_Check2_Date) {
		this.pi_Check2_Date = pi_Check2_Date;
	}
	/**
	 * @return the pi_Check3_inf
	 */
	public String getPi_Check3_inf() {
		return pi_Check3_inf;
	}
	/**
	 * @param pi_Check3_inf the pi_Check3_inf to set
	 */
	public void setPi_Check3_inf(String pi_Check3_inf) {
		this.pi_Check3_inf = pi_Check3_inf;
	}
	/**
	 * @return the pi_Check3_Date
	 */
	public String getPi_Check3_Date() {
		return pi_Check3_Date;
	}
	/**
	 * @param pi_Check3_Date the pi_Check3_Date to set
	 */
	public void setPi_Check3_Date(String pi_Check3_Date) {
		this.pi_Check3_Date = pi_Check3_Date;
	}
	/**
	 * @return the pi_Check4_inf
	 */
	public String getPi_Check4_inf() {
		return pi_Check4_inf;
	}
	/**
	 * @param pi_Check4_inf the pi_Check4_inf to set
	 */
	public void setPi_Check4_inf(String pi_Check4_inf) {
		this.pi_Check4_inf = pi_Check4_inf;
	}
	/**
	 * @return the pi_Check4_Date
	 */
	public String getPi_Check4_Date() {
		return pi_Check4_Date;
	}
	/**
	 * @param pi_Check4_Date the pi_Check4_Date to set
	 */
	public void setPi_Check4_Date(String pi_Check4_Date) {
		this.pi_Check4_Date = pi_Check4_Date;
	}
	/**
	 * @return the pi_Check5_inf
	 */
	public String getPi_Check5_inf() {
		return pi_Check5_inf;
	}
	/**
	 * @param pi_Check5_inf the pi_Check5_inf to set
	 */
	public void setPi_Check5_inf(String pi_Check5_inf) {
		this.pi_Check5_inf = pi_Check5_inf;
	}
	/**
	 * @return the pi_Check5_Date
	 */
	public String getPi_Check5_Date() {
		return pi_Check5_Date;
	}
	/**
	 * @param pi_Check5_Date the pi_Check5_Date to set
	 */
	public void setPi_Check5_Date(String pi_Check5_Date) {
		this.pi_Check5_Date = pi_Check5_Date;
	}
	/**
	 * @return the pi_Check6_inf
	 */
	public String getPi_Check6_inf() {
		return pi_Check6_inf;
	}
	/**
	 * @param pi_Check6_inf the pi_Check6_inf to set
	 */
	public void setPi_Check6_inf(String pi_Check6_inf) {
		this.pi_Check6_inf = pi_Check6_inf;
	}
	/**
	 * @return the pi_Check6_Date
	 */
	public String getPi_Check6_Date() {
		return pi_Check6_Date;
	}
	/**
	 * @param pi_Check6_Date the pi_Check6_Date to set
	 */
	public void setPi_Check6_Date(String pi_Check6_Date) {
		this.pi_Check6_Date = pi_Check6_Date;
	}
	/**
	 * @return the pi_Check7_inf
	 */
	public String getPi_Check7_inf() {
		return pi_Check7_inf;
	}
	/**
	 * @param pi_Check7_inf the pi_Check7_inf to set
	 */
	public void setPi_Check7_inf(String pi_Check7_inf) {
		this.pi_Check7_inf = pi_Check7_inf;
	}
	/**
	 * @return the pi_Check7_Date
	 */
	public String getPi_Check7_Date() {
		return pi_Check7_Date;
	}
	/**
	 * @param pi_Check7_Date the pi_Check7_Date to set
	 */
	public void setPi_Check7_Date(String pi_Check7_Date) {
		this.pi_Check7_Date = pi_Check7_Date;
	}
	/**
	 * @return the pi_Check8_inf
	 */
	public String getPi_Check8_inf() {
		return pi_Check8_inf;
	}
	/**
	 * @param pi_Check8_inf the pi_Check8_inf to set
	 */
	public void setPi_Check8_inf(String pi_Check8_inf) {
		this.pi_Check8_inf = pi_Check8_inf;
	}
	/**
	 * @return the pi_Check8_Date
	 */
	public String getPi_Check8_Date() {
		return pi_Check8_Date;
	}
	/**
	 * @param pi_Check8_Date the pi_Check8_Date to set
	 */
	public void setPi_Check8_Date(String pi_Check8_Date) {
		this.pi_Check8_Date = pi_Check8_Date;
	}
	/**
	 * @return the pi_Check9_inf
	 */
	public String getPi_Check9_inf() {
		return pi_Check9_inf;
	}
	/**
	 * @param pi_Check9_inf the pi_Check9_inf to set
	 */
	public void setPi_Check9_inf(String pi_Check9_inf) {
		this.pi_Check9_inf = pi_Check9_inf;
	}
	/**
	 * @return the pi_Check9_Date
	 */
	public String getPi_Check9_Date() {
		return pi_Check9_Date;
	}
	/**
	 * @param pi_Check9_Date the pi_Check9_Date to set
	 */
	public void setPi_Check9_Date(String pi_Check9_Date) {
		this.pi_Check9_Date = pi_Check9_Date;
	}
	/**
	 * @return the pi_Check10_inf
	 */
	public String getPi_Check10_inf() {
		return pi_Check10_inf;
	}
	/**
	 * @param pi_Check10_inf the pi_Check10_inf to set
	 */
	public void setPi_Check10_inf(String pi_Check10_inf) {
		this.pi_Check10_inf = pi_Check10_inf;
	}
	/**
	 * @return the pi_Check10_Date
	 */
	public String getPi_Check10_Date() {
		return pi_Check10_Date;
	}
	/**
	 * @param pi_Check10_Date the pi_Check10_Date to set
	 */
	public void setPi_Check10_Date(String pi_Check10_Date) {
		this.pi_Check10_Date = pi_Check10_Date;
	}
	/**
	 * @return the pi_Check11_inf
	 */
	public String getPi_Check11_inf() {
		return pi_Check11_inf;
	}
	/**
	 * @param pi_Check11_inf the pi_Check11_inf to set
	 */
	public void setPi_Check11_inf(String pi_Check11_inf) {
		this.pi_Check11_inf = pi_Check11_inf;
	}
	/**
	 * @return the pi_Check11_Date
	 */
	public String getPi_Check11_Date() {
		return pi_Check11_Date;
	}
	/**
	 * @param pi_Check11_Date the pi_Check11_Date to set
	 */
	public void setPi_Check11_Date(String pi_Check11_Date) {
		this.pi_Check11_Date = pi_Check11_Date;
	}
	/**
	 * @return the pi_Check12_inf
	 */
	public String getPi_Check12_inf() {
		return pi_Check12_inf;
	}
	/**
	 * @param pi_Check12_inf the pi_Check12_inf to set
	 */
	public void setPi_Check12_inf(String pi_Check12_inf) {
		this.pi_Check12_inf = pi_Check12_inf;
	}
	/**
	 * @return the pi_Check12_Date
	 */
	public String getPi_Check12_Date() {
		return pi_Check12_Date;
	}
	/**
	 * @param pi_Check12_Date the pi_Check12_Date to set
	 */
	public void setPi_Check12_Date(String pi_Check12_Date) {
		this.pi_Check12_Date = pi_Check12_Date;
	}
	/**
	 * @return the pi_Check13_inf
	 */
	public String getPi_Check13_inf() {
		return pi_Check13_inf;
	}
	/**
	 * @param pi_Check13_inf the pi_Check13_inf to set
	 */
	public void setPi_Check13_inf(String pi_Check13_inf) {
		this.pi_Check13_inf = pi_Check13_inf;
	}
	/**
	 * @return the pi_Check13_Date
	 */
	public String getPi_Check13_Date() {
		return pi_Check13_Date;
	}
	/**
	 * @param pi_Check13_Date the pi_Check13_Date to set
	 */
	public void setPi_Check13_Date(String pi_Check13_Date) {
		this.pi_Check13_Date = pi_Check13_Date;
	}
	/**
	 * @return the pi_Check14_inf
	 */
	public String getPi_Check14_inf() {
		return pi_Check14_inf;
	}
	/**
	 * @param pi_Check14_inf the pi_Check14_inf to set
	 */
	public void setPi_Check14_inf(String pi_Check14_inf) {
		this.pi_Check14_inf = pi_Check14_inf;
	}
	/**
	 * @return the pi_Check14_Date
	 */
	public String getPi_Check14_Date() {
		return pi_Check14_Date;
	}
	/**
	 * @param pi_Check14_Date the pi_Check14_Date to set
	 */
	public void setPi_Check14_Date(String pi_Check14_Date) {
		this.pi_Check14_Date = pi_Check14_Date;
	}
	/**
	 * @return the pi_Check15_inf
	 */
	public String getPi_Check15_inf() {
		return pi_Check15_inf;
	}
	/**
	 * @param pi_Check15_inf the pi_Check15_inf to set
	 */
	public void setPi_Check15_inf(String pi_Check15_inf) {
		this.pi_Check15_inf = pi_Check15_inf;
	}
	/**
	 * @return the pi_Check15_Date
	 */
	public String getPi_Check15_Date() {
		return pi_Check15_Date;
	}
	/**
	 * @param pi_Check15_Date the pi_Check15_Date to set
	 */
	public void setPi_Check15_Date(String pi_Check15_Date) {
		this.pi_Check15_Date = pi_Check15_Date;
	}
	/**
	 * @return the pi_Check16_inf
	 */
	public String getPi_Check16_inf() {
		return pi_Check16_inf;
	}
	/**
	 * @param pi_Check16_inf the pi_Check16_inf to set
	 */
	public void setPi_Check16_inf(String pi_Check16_inf) {
		this.pi_Check16_inf = pi_Check16_inf;
	}
	/**
	 * @return the pi_Check16_Date
	 */
	public String getPi_Check16_Date() {
		return pi_Check16_Date;
	}
	/**
	 * @param pi_Check16_Date the pi_Check16_Date to set
	 */
	public void setPi_Check16_Date(String pi_Check16_Date) {
		this.pi_Check16_Date = pi_Check16_Date;
	}
	/**
	 * @return the pi_Check17_inf
	 */
	public String getPi_Check17_inf() {
		return pi_Check17_inf;
	}
	/**
	 * @param pi_Check17_inf the pi_Check17_inf to set
	 */
	public void setPi_Check17_inf(String pi_Check17_inf) {
		this.pi_Check17_inf = pi_Check17_inf;
	}
	/**
	 * @return the pi_Check17_Date
	 */
	public String getPi_Check17_Date() {
		return pi_Check17_Date;
	}
	/**
	 * @param pi_Check17_Date the pi_Check17_Date to set
	 */
	public void setPi_Check17_Date(String pi_Check17_Date) {
		this.pi_Check17_Date = pi_Check17_Date;
	}
	/**
	 * @return the pi_Check18_inf
	 */
	public String getPi_Check18_inf() {
		return pi_Check18_inf;
	}
	/**
	 * @param pi_Check18_inf the pi_Check18_inf to set
	 */
	public void setPi_Check18_inf(String pi_Check18_inf) {
		this.pi_Check18_inf = pi_Check18_inf;
	}
	/**
	 * @return the pi_Check18_Date
	 */
	public String getPi_Check18_Date() {
		return pi_Check18_Date;
	}
	/**
	 * @param pi_Check18_Date the pi_Check18_Date to set
	 */
	public void setPi_Check18_Date(String pi_Check18_Date) {
		this.pi_Check18_Date = pi_Check18_Date;
	}
	/**
	 * @return the pi_Check19_inf
	 */
	public String getPi_Check19_inf() {
		return pi_Check19_inf;
	}
	/**
	 * @param pi_Check19_inf the pi_Check19_inf to set
	 */
	public void setPi_Check19_inf(String pi_Check19_inf) {
		this.pi_Check19_inf = pi_Check19_inf;
	}
	/**
	 * @return the pi_Check19_Date
	 */
	public String getPi_Check19_Date() {
		return pi_Check19_Date;
	}
	/**
	 * @param pi_Check19_Date the pi_Check19_Date to set
	 */
	public void setPi_Check19_Date(String pi_Check19_Date) {
		this.pi_Check19_Date = pi_Check19_Date;
	}
	/**
	 * @return the pi_Check20_inf
	 */
	public String getPi_Check20_inf() {
		return pi_Check20_inf;
	}
	/**
	 * @param pi_Check20_inf the pi_Check20_inf to set
	 */
	public void setPi_Check20_inf(String pi_Check20_inf) {
		this.pi_Check20_inf = pi_Check20_inf;
	}
	/**
	 * @return the pi_Check20_Date
	 */
	public String getPi_Check20_Date() {
		return pi_Check20_Date;
	}
	/**
	 * @param pi_Check20_Date the pi_Check20_Date to set
	 */
	public void setPi_Check20_Date(String pi_Check20_Date) {
		this.pi_Check20_Date = pi_Check20_Date;
	}
	/**
	 * @return the pi_Check21_inf
	 */
	public String getPi_Check21_inf() {
		return pi_Check21_inf;
	}
	/**
	 * @param pi_Check21_inf the pi_Check21_inf to set
	 */
	public void setPi_Check21_inf(String pi_Check21_inf) {
		this.pi_Check21_inf = pi_Check21_inf;
	}
	/**
	 * @return the pi_Check21_Date
	 */
	public String getPi_Check21_Date() {
		return pi_Check21_Date;
	}
	/**
	 * @param pi_Check21_Date the pi_Check21_Date to set
	 */
	public void setPi_Check21_Date(String pi_Check21_Date) {
		this.pi_Check21_Date = pi_Check21_Date;
	}
	/**
	 * @return the pi_Check_Result
	 */
	public String getPi_Check_Result() {
		return pi_Check_Result;
	}
	/**
	 * @param pi_Check_Result the pi_Check_Result to set
	 */
	public void setPi_Check_Result(String pi_Check_Result) {
		this.pi_Check_Result = pi_Check_Result;
	}
	/**
	 * @return the pi_Check_Remark
	 */
	public String getPi_Check_Remark() {
		return pi_Check_Remark;
	}
	/**
	 * @param pi_Check_Remark the pi_Check_Remark to set
	 */
	public void setPi_Check_Remark(String pi_Check_Remark) {
		this.pi_Check_Remark = pi_Check_Remark;
	}
	/**
	 * @return the pi_Check_Per
	 */
	public String getPi_Check_Per() {
		return pi_Check_Per;
	}
	/**
	 * @param pi_Check_Per the pi_Check_Per to set
	 */
	public void setPi_Check_Per(String pi_Check_Per) {
		this.pi_Check_Per = pi_Check_Per;
	}
	/**
	 * @return the pi_CheckInf_Date
	 */
	public String getPi_CheckInf_Date() {
		return pi_CheckInf_Date;
	}
	/**
	 * @param pi_CheckInf_Date the pi_CheckInf_Date to set
	 */
	public void setPi_CheckInf_Date(String pi_CheckInf_Date) {
		this.pi_CheckInf_Date = pi_CheckInf_Date;
	}


}
