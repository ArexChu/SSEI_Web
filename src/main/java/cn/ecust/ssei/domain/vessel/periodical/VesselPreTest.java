package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselPreTest")
public class VesselPreTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Pre_De;//设计压力
	private String v_Pre_Permission;//允许/监控使用压力
	private String v_Pre_Test_Pre;//试验压力
	private String v_Pre_De_Main_Mat;//主体材质
	private String v_Pre_Med;//试验介质
	private String v_Pre_Med_Tem;//介质温度
	private String v_Pre_Part;//试压部位
	private String v_Pre_Tem;//环境温度
	private String v_Pre_Range;//压力表量程
	private String v_Pre_Acc;//精度
	private String v_Pre_Type;//机泵型号
	private String v_Pre_Check_Stress;//试验前应力校核结果：
	private String v_Pre_Process;//试验程序记录
	private String v_Pre_Result;//试验结果
	private String v_Pre_Date;//检测
	private String v_Pre_Check_Date;//校对
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
	 * @return the vesselPeriodicalMaintain
	 */
	@OneToOne(mappedBy="vesselPreTest")
	public VesselPeriodicalMaintain getVesselPeriodicalMaintain() {
		return vesselPeriodicalMaintain;
	}
	/**
	 * @param vesselPeriodicalMaintain the vesselPeriodicalMaintain to set
	 */
	public void setVesselPeriodicalMaintain(
			VesselPeriodicalMaintain vesselPeriodicalMaintain) {
		this.vesselPeriodicalMaintain = vesselPeriodicalMaintain;
	}
	/**
	 * @return the v_Pre_De
	 */
	public String getV_Pre_De() {
		return v_Pre_De;
	}
	/**
	 * @param v_Pre_De the v_Pre_De to set
	 */
	public void setV_Pre_De(String v_Pre_De) {
		this.v_Pre_De = v_Pre_De;
	}
	/**
	 * @return the v_Pre_Permission
	 */
	public String getV_Pre_Permission() {
		return v_Pre_Permission;
	}
	/**
	 * @param v_Pre_Permission the v_Pre_Permission to set
	 */
	public void setV_Pre_Permission(String v_Pre_Permission) {
		this.v_Pre_Permission = v_Pre_Permission;
	}
	/**
	 * @return the v_Pre_Test_Pre
	 */
	public String getV_Pre_Test_Pre() {
		return v_Pre_Test_Pre;
	}
	/**
	 * @param v_Pre_Test_Pre the v_Pre_Test_Pre to set
	 */
	public void setV_Pre_Test_Pre(String v_Pre_Test_Pre) {
		this.v_Pre_Test_Pre = v_Pre_Test_Pre;
	}
	/**
	 * @return the v_Pre_De_Main_Mat
	 */
	public String getV_Pre_De_Main_Mat() {
		return v_Pre_De_Main_Mat;
	}
	/**
	 * @param v_Pre_De_Main_Mat the v_Pre_De_Main_Mat to set
	 */
	public void setV_Pre_De_Main_Mat(String v_Pre_De_Main_Mat) {
		this.v_Pre_De_Main_Mat = v_Pre_De_Main_Mat;
	}
	/**
	 * @return the v_Pre_Med
	 */
	public String getV_Pre_Med() {
		return v_Pre_Med;
	}
	/**
	 * @param v_Pre_Med the v_Pre_Med to set
	 */
	public void setV_Pre_Med(String v_Pre_Med) {
		this.v_Pre_Med = v_Pre_Med;
	}
	/**
	 * @return the v_Pre_Med_Tem
	 */
	public String getV_Pre_Med_Tem() {
		return v_Pre_Med_Tem;
	}
	/**
	 * @param v_Pre_Med_Tem the v_Pre_Med_Tem to set
	 */
	public void setV_Pre_Med_Tem(String v_Pre_Med_Tem) {
		this.v_Pre_Med_Tem = v_Pre_Med_Tem;
	}
	/**
	 * @return the v_Pre_Part
	 */
	public String getV_Pre_Part() {
		return v_Pre_Part;
	}
	/**
	 * @param v_Pre_Part the v_Pre_Part to set
	 */
	public void setV_Pre_Part(String v_Pre_Part) {
		this.v_Pre_Part = v_Pre_Part;
	}
	/**
	 * @return the v_Pre_Tem
	 */
	public String getV_Pre_Tem() {
		return v_Pre_Tem;
	}
	/**
	 * @param v_Pre_Tem the v_Pre_Tem to set
	 */
	public void setV_Pre_Tem(String v_Pre_Tem) {
		this.v_Pre_Tem = v_Pre_Tem;
	}
	/**
	 * @return the v_Pre_Range
	 */
	public String getV_Pre_Range() {
		return v_Pre_Range;
	}
	/**
	 * @param v_Pre_Range the v_Pre_Range to set
	 */
	public void setV_Pre_Range(String v_Pre_Range) {
		this.v_Pre_Range = v_Pre_Range;
	}
	/**
	 * @return the v_Pre_Acc
	 */
	public String getV_Pre_Acc() {
		return v_Pre_Acc;
	}
	/**
	 * @param v_Pre_Acc the v_Pre_Acc to set
	 */
	public void setV_Pre_Acc(String v_Pre_Acc) {
		this.v_Pre_Acc = v_Pre_Acc;
	}
	/**
	 * @return the v_Pre_Type
	 */
	public String getV_Pre_Type() {
		return v_Pre_Type;
	}
	/**
	 * @param v_Pre_Type the v_Pre_Type to set
	 */
	public void setV_Pre_Type(String v_Pre_Type) {
		this.v_Pre_Type = v_Pre_Type;
	}
	/**
	 * @return the v_Pre_Check_Stress
	 */
	public String getV_Pre_Check_Stress() {
		return v_Pre_Check_Stress;
	}
	/**
	 * @param v_Pre_Check_Stress the v_Pre_Check_Stress to set
	 */
	public void setV_Pre_Check_Stress(String v_Pre_Check_Stress) {
		this.v_Pre_Check_Stress = v_Pre_Check_Stress;
	}
	/**
	 * @return the v_Pre_Process
	 */
	public String getV_Pre_Process() {
		return v_Pre_Process;
	}
	/**
	 * @param v_Pre_Process the v_Pre_Process to set
	 */
	public void setV_Pre_Process(String v_Pre_Process) {
		this.v_Pre_Process = v_Pre_Process;
	}
	/**
	 * @return the v_Pre_Result
	 */
	public String getV_Pre_Result() {
		return v_Pre_Result;
	}
	/**
	 * @param v_Pre_Result the v_Pre_Result to set
	 */
	public void setV_Pre_Result(String v_Pre_Result) {
		this.v_Pre_Result = v_Pre_Result;
	}
	/**
	 * @return the v_Pre_Date
	 */
	public String getV_Pre_Date() {
		return v_Pre_Date;
	}
	/**
	 * @param v_Pre_Date the v_Pre_Date to set
	 */
	public void setV_Pre_Date(String v_Pre_Date) {
		this.v_Pre_Date = v_Pre_Date;
	}
	/**
	 * @return the v_Pre_Check_Date
	 */
	public String getV_Pre_Check_Date() {
		return v_Pre_Check_Date;
	}
	/**
	 * @param v_Pre_Check_Date the v_Pre_Check_Date to set
	 */
	public void setV_Pre_Check_Date(String v_Pre_Check_Date) {
		this.v_Pre_Check_Date = v_Pre_Check_Date;
	}
	
	
	
}
