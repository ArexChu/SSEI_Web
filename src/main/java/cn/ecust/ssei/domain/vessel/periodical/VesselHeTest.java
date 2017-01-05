package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselHeTest")
public class VesselHeTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_He_Equ_Mod;//仪器型号
	private String v_He_Equ_ID;//仪器编号
	private String v_He_Equ_Acc;//仪器精度量程
	private String v_He_Test_Method;//检测方式
	private String v_He_Type;//试漏气体
	private String v_He_Pre;//试验压力
	private String v_He_Keep;//保压时间
	private String v_He_Ration;//泄漏率
	private String v_He_Part;//试验部位
	private String v_He_Result;//试验结果
	private String v_He_Date;//检测
	private String v_He_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselHeTest")
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
	 * @return the v_He_Equ_Mod
	 */
	public String getV_He_Equ_Mod() {
		return v_He_Equ_Mod;
	}
	/**
	 * @param v_He_Equ_Mod the v_He_Equ_Mod to set
	 */
	public void setV_He_Equ_Mod(String v_He_Equ_Mod) {
		this.v_He_Equ_Mod = v_He_Equ_Mod;
	}
	/**
	 * @return the v_He_Equ_ID
	 */
	public String getV_He_Equ_ID() {
		return v_He_Equ_ID;
	}
	/**
	 * @param v_He_Equ_ID the v_He_Equ_ID to set
	 */
	public void setV_He_Equ_ID(String v_He_Equ_ID) {
		this.v_He_Equ_ID = v_He_Equ_ID;
	}
	/**
	 * @return the v_He_Equ_Acc
	 */
	public String getV_He_Equ_Acc() {
		return v_He_Equ_Acc;
	}
	/**
	 * @param v_He_Equ_Acc the v_He_Equ_Acc to set
	 */
	public void setV_He_Equ_Acc(String v_He_Equ_Acc) {
		this.v_He_Equ_Acc = v_He_Equ_Acc;
	}
	/**
	 * @return the v_He_Test_Method
	 */
	public String getV_He_Test_Method() {
		return v_He_Test_Method;
	}
	/**
	 * @param v_He_Test_Method the v_He_Test_Method to set
	 */
	public void setV_He_Test_Method(String v_He_Test_Method) {
		this.v_He_Test_Method = v_He_Test_Method;
	}
	/**
	 * @return the v_He_Type
	 */
	public String getV_He_Type() {
		return v_He_Type;
	}
	/**
	 * @param v_He_Type the v_He_Type to set
	 */
	public void setV_He_Type(String v_He_Type) {
		this.v_He_Type = v_He_Type;
	}
	/**
	 * @return the v_He_Pre
	 */
	public String getV_He_Pre() {
		return v_He_Pre;
	}
	/**
	 * @param v_He_Pre the v_He_Pre to set
	 */
	public void setV_He_Pre(String v_He_Pre) {
		this.v_He_Pre = v_He_Pre;
	}
	/**
	 * @return the v_He_Keep
	 */
	public String getV_He_Keep() {
		return v_He_Keep;
	}
	/**
	 * @param v_He_Keep the v_He_Keep to set
	 */
	public void setV_He_Keep(String v_He_Keep) {
		this.v_He_Keep = v_He_Keep;
	}
	/**
	 * @return the v_He_Ration
	 */
	public String getV_He_Ration() {
		return v_He_Ration;
	}
	/**
	 * @param v_He_Ration the v_He_Ration to set
	 */
	public void setV_He_Ration(String v_He_Ration) {
		this.v_He_Ration = v_He_Ration;
	}
	/**
	 * @return the v_He_Part
	 */
	public String getV_He_Part() {
		return v_He_Part;
	}
	/**
	 * @param v_He_Part the v_He_Part to set
	 */
	public void setV_He_Part(String v_He_Part) {
		this.v_He_Part = v_He_Part;
	}
	/**
	 * @return the v_He_Result
	 */
	public String getV_He_Result() {
		return v_He_Result;
	}
	/**
	 * @param v_He_Result the v_He_Result to set
	 */
	public void setV_He_Result(String v_He_Result) {
		this.v_He_Result = v_He_Result;
	}
	/**
	 * @return the v_He_Date
	 */
	public String getV_He_Date() {
		return v_He_Date;
	}
	/**
	 * @param v_He_Date the v_He_Date to set
	 */
	public void setV_He_Date(String v_He_Date) {
		this.v_He_Date = v_He_Date;
	}
	/**
	 * @return the v_He_Check_Date
	 */
	public String getV_He_Check_Date() {
		return v_He_Check_Date;
	}
	/**
	 * @param v_He_Check_Date the v_He_Check_Date to set
	 */
	public void setV_He_Check_Date(String v_He_Check_Date) {
		this.v_He_Check_Date = v_He_Check_Date;
	}
	
}
