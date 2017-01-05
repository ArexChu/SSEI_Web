package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselMatTest")
public class VesselMatTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Mat_Samp_Method;//取样方法
	private String v_Mat_Part;//检测部位
	private String v_Mat_Equ_Mode;//仪器型号
	private String v_Mat_Equ_ID;//仪器编号
	private String v_Mat_Ana_Method;//分析方法
	private String v_Mat_Ana_Cri;//分析方法标准
	private String v_Mat_Ele;//元素及含量
	private String v_Mat_Value;//
	private String v_Mat_Result;//
	private String v_Mat_Date;//检测
	private String v_Mat_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselMatTest")
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
	 * @return the v_Mat_Samp_Method
	 */
	public String getV_Mat_Samp_Method() {
		return v_Mat_Samp_Method;
	}
	/**
	 * @param v_Mat_Samp_Method the v_Mat_Samp_Method to set
	 */
	public void setV_Mat_Samp_Method(String v_Mat_Samp_Method) {
		this.v_Mat_Samp_Method = v_Mat_Samp_Method;
	}
	/**
	 * @return the v_Mat_Part
	 */
	public String getV_Mat_Part() {
		return v_Mat_Part;
	}
	/**
	 * @param v_Mat_Part the v_Mat_Part to set
	 */
	public void setV_Mat_Part(String v_Mat_Part) {
		this.v_Mat_Part = v_Mat_Part;
	}
	/**
	 * @return the v_Mat_Equ_Mode
	 */
	public String getV_Mat_Equ_Mode() {
		return v_Mat_Equ_Mode;
	}
	/**
	 * @param v_Mat_Equ_Mode the v_Mat_Equ_Mode to set
	 */
	public void setV_Mat_Equ_Mode(String v_Mat_Equ_Mode) {
		this.v_Mat_Equ_Mode = v_Mat_Equ_Mode;
	}
	/**
	 * @return the v_Mat_Equ_ID
	 */
	public String getV_Mat_Equ_ID() {
		return v_Mat_Equ_ID;
	}
	/**
	 * @param v_Mat_Equ_ID the v_Mat_Equ_ID to set
	 */
	public void setV_Mat_Equ_ID(String v_Mat_Equ_ID) {
		this.v_Mat_Equ_ID = v_Mat_Equ_ID;
	}
	/**
	 * @return the v_Mat_Ana_Method
	 */
	public String getV_Mat_Ana_Method() {
		return v_Mat_Ana_Method;
	}
	/**
	 * @param v_Mat_Ana_Method the v_Mat_Ana_Method to set
	 */
	public void setV_Mat_Ana_Method(String v_Mat_Ana_Method) {
		this.v_Mat_Ana_Method = v_Mat_Ana_Method;
	}
	/**
	 * @return the v_Mat_Ana_Cri
	 */
	public String getV_Mat_Ana_Cri() {
		return v_Mat_Ana_Cri;
	}
	/**
	 * @param v_Mat_Ana_Cri the v_Mat_Ana_Cri to set
	 */
	public void setV_Mat_Ana_Cri(String v_Mat_Ana_Cri) {
		this.v_Mat_Ana_Cri = v_Mat_Ana_Cri;
	}
	/**
	 * @return the v_Mat_Ele
	 */
	public String getV_Mat_Ele() {
		return v_Mat_Ele;
	}
	/**
	 * @param v_Mat_Ele the v_Mat_Ele to set
	 */
	public void setV_Mat_Ele(String v_Mat_Ele) {
		this.v_Mat_Ele = v_Mat_Ele;
	}
	
	/**
	 * @return the v_Mat_Value
	 */
	@Column(length=5500)
	public String getV_Mat_Value() {
		return v_Mat_Value;
	}
	/**
	 * @param v_Mat_Value the v_Mat_Value to set
	 */
	public void setV_Mat_Value(String v_Mat_Value) {
		this.v_Mat_Value = v_Mat_Value;
	}
	/**
	 * @return the v_Mat_Result
	 */
	public String getV_Mat_Result() {
		return v_Mat_Result;
	}
	/**
	 * @param v_Mat_Result the v_Mat_Result to set
	 */
	public void setV_Mat_Result(String v_Mat_Result) {
		this.v_Mat_Result = v_Mat_Result;
	}
	/**
	 * @return the v_Mat_Date
	 */
	public String getV_Mat_Date() {
		return v_Mat_Date;
	}
	/**
	 * @param v_Mat_Date the v_Mat_Date to set
	 */
	public void setV_Mat_Date(String v_Mat_Date) {
		this.v_Mat_Date = v_Mat_Date;
	}
	/**
	 * @return the v_Mat_Check_Date
	 */
	public String getV_Mat_Check_Date() {
		return v_Mat_Check_Date;
	}
	/**
	 * @param v_Mat_Check_Date the v_Mat_Check_Date to set
	 */
	public void setV_Mat_Check_Date(String v_Mat_Check_Date) {
		this.v_Mat_Check_Date = v_Mat_Check_Date;
	}
	
	
	

}
