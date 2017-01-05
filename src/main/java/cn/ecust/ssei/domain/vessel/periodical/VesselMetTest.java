package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselMetTest")
public class VesselMetTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Met_Equ_Mode;//分析仪器型号
	private String v_Met_Equ_ID;//分析仪器编号
	private String v_Met_Cor;//腐蚀方法
	private String v_Met_Pol;//抛光方法
	private String v_Met_Cri;//执行标准
	private String v_Met_Part;//金相组织
	private String v_Met_Mat;//主体材质
	private String v_Met_Heat;//热处理状态
	private String v_Met_Result;//
	private String v_Met_Date;//检测
	private String v_Met_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselMetTest")
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
	 * @return the v_Met_Equ_Mode
	 */
	public String getV_Met_Equ_Mode() {
		return v_Met_Equ_Mode;
	}
	/**
	 * @param v_Met_Equ_Mode the v_Met_Equ_Mode to set
	 */
	public void setV_Met_Equ_Mode(String v_Met_Equ_Mode) {
		this.v_Met_Equ_Mode = v_Met_Equ_Mode;
	}
	/**
	 * @return the v_Met_Equ_ID
	 */
	public String getV_Met_Equ_ID() {
		return v_Met_Equ_ID;
	}
	/**
	 * @param v_Met_Equ_ID the v_Met_Equ_ID to set
	 */
	public void setV_Met_Equ_ID(String v_Met_Equ_ID) {
		this.v_Met_Equ_ID = v_Met_Equ_ID;
	}
	/**
	 * @return the v_Met_Cor
	 */
	public String getV_Met_Cor() {
		return v_Met_Cor;
	}
	/**
	 * @param v_Met_Cor the v_Met_Cor to set
	 */
	public void setV_Met_Cor(String v_Met_Cor) {
		this.v_Met_Cor = v_Met_Cor;
	}
	/**
	 * @return the v_Met_Pol
	 */
	public String getV_Met_Pol() {
		return v_Met_Pol;
	}
	/**
	 * @param v_Met_Pol the v_Met_Pol to set
	 */
	public void setV_Met_Pol(String v_Met_Pol) {
		this.v_Met_Pol = v_Met_Pol;
	}
	/**
	 * @return the v_Met_Cri
	 */
	public String getV_Met_Cri() {
		return v_Met_Cri;
	}
	/**
	 * @param v_Met_Cri the v_Met_Cri to set
	 */
	public void setV_Met_Cri(String v_Met_Cri) {
		this.v_Met_Cri = v_Met_Cri;
	}
	/**
	 * @return the v_Met_Part
	 */
	public String getV_Met_Part() {
		return v_Met_Part;
	}
	/**
	 * @param v_Met_Part the v_Met_Part to set
	 */
	public void setV_Met_Part(String v_Met_Part) {
		this.v_Met_Part = v_Met_Part;
	}
	/**
	 * @return the v_Met_Mat
	 */
	public String getV_Met_Mat() {
		return v_Met_Mat;
	}
	/**
	 * @param v_Met_Mat the v_Met_Mat to set
	 */
	public void setV_Met_Mat(String v_Met_Mat) {
		this.v_Met_Mat = v_Met_Mat;
	}
	/**
	 * @return the v_Met_Heat
	 */
	public String getV_Met_Heat() {
		return v_Met_Heat;
	}
	/**
	 * @param v_Met_Heat the v_Met_Heat to set
	 */
	public void setV_Met_Heat(String v_Met_Heat) {
		this.v_Met_Heat = v_Met_Heat;
	}
	/**
	 * @return the v_Met_Result
	 */
	public String getV_Met_Result() {
		return v_Met_Result;
	}
	/**
	 * @param v_Met_Result the v_Met_Result to set
	 */
	public void setV_Met_Result(String v_Met_Result) {
		this.v_Met_Result = v_Met_Result;
	}
	/**
	 * @return the v_Met_Date
	 */
	public String getV_Met_Date() {
		return v_Met_Date;
	}
	/**
	 * @param v_Met_Date the v_Met_Date to set
	 */
	public void setV_Met_Date(String v_Met_Date) {
		this.v_Met_Date = v_Met_Date;
	}
	/**
	 * @return the v_Met_Check_Date
	 */
	public String getV_Met_Check_Date() {
		return v_Met_Check_Date;
	}
	/**
	 * @param v_Met_Check_Date the v_Met_Check_Date to set
	 */
	public void setV_Met_Check_Date(String v_Met_Check_Date) {
		this.v_Met_Check_Date = v_Met_Check_Date;
	}
	
	
	

}
