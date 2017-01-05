package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselHardTest")
public class VesselHardTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Hard_Equ_Mode;//测量仪器型号
	private String v_Hard_Equ_ID;//测量仪器编号
	private String v_Hard_Mat;//主体材质
	private String v_Hard_Heat;//热处理状态
	private String v_Hard_Cri;//检测标准
	private String v_Hard_Unit;//硬度单位
	private String v_Hard_Value;//
	private String v_Hard_Result;//
	private String v_Hard_Date;//检测
	private String v_Hard_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselHardTest")
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
	 * @return the v_Hard_Equ_Mode
	 */
	public String getV_Hard_Equ_Mode() {
		return v_Hard_Equ_Mode;
	}
	/**
	 * @param v_Hard_Equ_Mode the v_Hard_Equ_Mode to set
	 */
	public void setV_Hard_Equ_Mode(String v_Hard_Equ_Mode) {
		this.v_Hard_Equ_Mode = v_Hard_Equ_Mode;
	}
	/**
	 * @return the v_Hard_Equ_ID
	 */
	public String getV_Hard_Equ_ID() {
		return v_Hard_Equ_ID;
	}
	/**
	 * @param v_Hard_Equ_ID the v_Hard_Equ_ID to set
	 */
	public void setV_Hard_Equ_ID(String v_Hard_Equ_ID) {
		this.v_Hard_Equ_ID = v_Hard_Equ_ID;
	}
	/**
	 * @return the v_Hard_Mat
	 */
	public String getV_Hard_Mat() {
		return v_Hard_Mat;
	}
	/**
	 * @param v_Hard_Mat the v_Hard_Mat to set
	 */
	public void setV_Hard_Mat(String v_Hard_Mat) {
		this.v_Hard_Mat = v_Hard_Mat;
	}
	/**
	 * @return the v_Hard_Heat
	 */
	public String getV_Hard_Heat() {
		return v_Hard_Heat;
	}
	/**
	 * @param v_Hard_Heat the v_Hard_Heat to set
	 */
	public void setV_Hard_Heat(String v_Hard_Heat) {
		this.v_Hard_Heat = v_Hard_Heat;
	}
	/**
	 * @return the v_Hard_Cri
	 */
	public String getV_Hard_Cri() {
		return v_Hard_Cri;
	}
	/**
	 * @param v_Hard_Cri the v_Hard_Cri to set
	 */
	public void setV_Hard_Cri(String v_Hard_Cri) {
		this.v_Hard_Cri = v_Hard_Cri;
	}
	/**
	 * @return the v_Hard_Unit
	 */
	public String getV_Hard_Unit() {
		return v_Hard_Unit;
	}
	/**
	 * @param v_Hard_Unit the v_Hard_Unit to set
	 */
	public void setV_Hard_Unit(String v_Hard_Unit) {
		this.v_Hard_Unit = v_Hard_Unit;
	}
	
	/**
	 * @return the v_Hard_Value
	 */
	@Column(length=5500)
	public String getV_Hard_Value() {
		return v_Hard_Value;
	}
	/**
	 * @param v_Hard_Value the v_Hard_Value to set
	 */
	public void setV_Hard_Value(String v_Hard_Value) {
		this.v_Hard_Value = v_Hard_Value;
	}
	/**
	 * @return the v_Hard_Result
	 */
	public String getV_Hard_Result() {
		return v_Hard_Result;
	}
	/**
	 * @param v_Hard_Result the v_Hard_Result to set
	 */
	public void setV_Hard_Result(String v_Hard_Result) {
		this.v_Hard_Result = v_Hard_Result;
	}
	/**
	 * @return the v_Hard_Date
	 */
	public String getV_Hard_Date() {
		return v_Hard_Date;
	}
	/**
	 * @param v_Hard_Date the v_Hard_Date to set
	 */
	public void setV_Hard_Date(String v_Hard_Date) {
		this.v_Hard_Date = v_Hard_Date;
	}
	/**
	 * @return the v_Hard_Check_Date
	 */
	public String getV_Hard_Check_Date() {
		return v_Hard_Check_Date;
	}
	/**
	 * @param v_Hard_Check_Date the v_Hard_Check_Date to set
	 */
	public void setV_Hard_Check_Date(String v_Hard_Check_Date) {
		this.v_Hard_Check_Date = v_Hard_Check_Date;
	}
	
	

}
