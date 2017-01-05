package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselAirTest")
public class VesselAirTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Air_De_Pre;//设计压力
	private String v_Air_Permission_Pre;//允许/监控使用压力
	private String v_Air_Pre_Pre;//耐压试验压力
	private String v_Air_Pre;//气密性试验压力
	private String v_Air_Med;//试验介质
	private String v_Air_Med_Tem;//介质温度
	private String v_Air_Tem;//环境温度
	private String v_Air_Volume;//容积
	private String v_Air_Comp_Type;//压缩机型号及编号
	private String v_Air_Valve_Type;//安全阀型号及编号
	private String v_Air_Range;//压力表量程
	private String v_Air_Acc;//精度
	private String v_Air_Part;//试验部位
	private String v_Air_Process;//试验程序记录
	private String v_Air_Result;//试验结果
	private String v_Air_Remark;//试验结果
	private String v_Air_Date;//检测
	private String v_Air_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselAirTest")
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
	 * @return the v_Air_De_Pre
	 */
	public String getV_Air_De_Pre() {
		return v_Air_De_Pre;
	}
	/**
	 * @param v_Air_De_Pre the v_Air_De_Pre to set
	 */
	public void setV_Air_De_Pre(String v_Air_De_Pre) {
		this.v_Air_De_Pre = v_Air_De_Pre;
	}
	/**
	 * @return the v_Air_Permission_Pre
	 */
	public String getV_Air_Permission_Pre() {
		return v_Air_Permission_Pre;
	}
	/**
	 * @param v_Air_Permission_Pre the v_Air_Permission_Pre to set
	 */
	public void setV_Air_Permission_Pre(String v_Air_Permission_Pre) {
		this.v_Air_Permission_Pre = v_Air_Permission_Pre;
	}
	/**
	 * @return the v_Air_Pre_Pre
	 */
	public String getV_Air_Pre_Pre() {
		return v_Air_Pre_Pre;
	}
	/**
	 * @param v_Air_Pre_Pre the v_Air_Pre_Pre to set
	 */
	public void setV_Air_Pre_Pre(String v_Air_Pre_Pre) {
		this.v_Air_Pre_Pre = v_Air_Pre_Pre;
	}
	/**
	 * @return the v_Air_Pre
	 */
	public String getV_Air_Pre() {
		return v_Air_Pre;
	}
	/**
	 * @param v_Air_Pre the v_Air_Pre to set
	 */
	public void setV_Air_Pre(String v_Air_Pre) {
		this.v_Air_Pre = v_Air_Pre;
	}
	/**
	 * @return the v_Air_Med
	 */
	public String getV_Air_Med() {
		return v_Air_Med;
	}
	/**
	 * @param v_Air_Med the v_Air_Med to set
	 */
	public void setV_Air_Med(String v_Air_Med) {
		this.v_Air_Med = v_Air_Med;
	}
	/**
	 * @return the v_Air_Med_Tem
	 */
	public String getV_Air_Med_Tem() {
		return v_Air_Med_Tem;
	}
	/**
	 * @param v_Air_Med_Tem the v_Air_Med_Tem to set
	 */
	public void setV_Air_Med_Tem(String v_Air_Med_Tem) {
		this.v_Air_Med_Tem = v_Air_Med_Tem;
	}
	/**
	 * @return the v_Air_Tem
	 */
	public String getV_Air_Tem() {
		return v_Air_Tem;
	}
	/**
	 * @param v_Air_Tem the v_Air_Tem to set
	 */
	public void setV_Air_Tem(String v_Air_Tem) {
		this.v_Air_Tem = v_Air_Tem;
	}
	/**
	 * @return the v_Air_Volume
	 */
	public String getV_Air_Volume() {
		return v_Air_Volume;
	}
	/**
	 * @param v_Air_Volume the v_Air_Volume to set
	 */
	public void setV_Air_Volume(String v_Air_Volume) {
		this.v_Air_Volume = v_Air_Volume;
	}
	/**
	 * @return the v_Air_Comp_Type
	 */
	public String getV_Air_Comp_Type() {
		return v_Air_Comp_Type;
	}
	/**
	 * @param v_Air_Comp_Type the v_Air_Comp_Type to set
	 */
	public void setV_Air_Comp_Type(String v_Air_Comp_Type) {
		this.v_Air_Comp_Type = v_Air_Comp_Type;
	}
	/**
	 * @return the v_Air_Valve_Type
	 */
	public String getV_Air_Valve_Type() {
		return v_Air_Valve_Type;
	}
	/**
	 * @param v_Air_Valve_Type the v_Air_Valve_Type to set
	 */
	public void setV_Air_Valve_Type(String v_Air_Valve_Type) {
		this.v_Air_Valve_Type = v_Air_Valve_Type;
	}
	/**
	 * @return the v_Air_Range
	 */
	public String getV_Air_Range() {
		return v_Air_Range;
	}
	/**
	 * @param v_Air_Range the v_Air_Range to set
	 */
	public void setV_Air_Range(String v_Air_Range) {
		this.v_Air_Range = v_Air_Range;
	}
	/**
	 * @return the v_Air_Acc
	 */
	public String getV_Air_Acc() {
		return v_Air_Acc;
	}
	/**
	 * @param v_Air_Acc the v_Air_Acc to set
	 */
	public void setV_Air_Acc(String v_Air_Acc) {
		this.v_Air_Acc = v_Air_Acc;
	}
	/**
	 * @return the v_Air_Part
	 */
	public String getV_Air_Part() {
		return v_Air_Part;
	}
	/**
	 * @param v_Air_Part the v_Air_Part to set
	 */
	public void setV_Air_Part(String v_Air_Part) {
		this.v_Air_Part = v_Air_Part;
	}
	/**
	 * @return the v_Air_Process
	 */
	public String getV_Air_Process() {
		return v_Air_Process;
	}
	/**
	 * @param v_Air_Process the v_Air_Process to set
	 */
	public void setV_Air_Process(String v_Air_Process) {
		this.v_Air_Process = v_Air_Process;
	}
	/**
	 * @return the v_Air_Result
	 */
	public String getV_Air_Result() {
		return v_Air_Result;
	}
	/**
	 * @param v_Air_Result the v_Air_Result to set
	 */
	public void setV_Air_Result(String v_Air_Result) {
		this.v_Air_Result = v_Air_Result;
	}
	/**
	 * @return the v_Air_Remark
	 */
	public String getV_Air_Remark() {
		return v_Air_Remark;
	}
	/**
	 * @param v_Air_Remark the v_Air_Remark to set
	 */
	public void setV_Air_Remark(String v_Air_Remark) {
		this.v_Air_Remark = v_Air_Remark;
	}
	/**
	 * @return the v_Air_Date
	 */
	public String getV_Air_Date() {
		return v_Air_Date;
	}
	/**
	 * @param v_Air_Date the v_Air_Date to set
	 */
	public void setV_Air_Date(String v_Air_Date) {
		this.v_Air_Date = v_Air_Date;
	}
	/**
	 * @return the v_Air_Check_Date
	 */
	public String getV_Air_Check_Date() {
		return v_Air_Check_Date;
	}
	/**
	 * @param v_Air_Check_Date the v_Air_Check_Date to set
	 */
	public void setV_Air_Check_Date(String v_Air_Check_Date) {
		this.v_Air_Check_Date = v_Air_Check_Date;
	}
	
	
}
