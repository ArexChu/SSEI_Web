package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselMagneticTest")
public class VesselMagneticTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Mag_Equ_Model;//检测仪器型号
	private String v_Mag_Equ_ID;//检测仪器编号
	private String v_Mag_Mod;//磁粉类型
	private String v_Mag_Sus;//磁 悬 液
	private String v_Mag_Sens;//灵敏度试片
	private String v_Mag_Method;//磁化方法
	private String v_Mag_Cur;//提升力/磁化电流
	private String v_Mag_Spr;//喷洒方法
	private String v_Mag_Cri;//检测标准
	private String v_Mag_Len;//检测比例、长度
	private String v_Mag_Value;//
	private String v_Mag_Result;//检测结果
	private String v_Mag_Date;//检测
	private String v_Mag_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselMagneticTest")
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
	 * @return the v_Mag_Equ_Model
	 */
	public String getV_Mag_Equ_Model() {
		return v_Mag_Equ_Model;
	}
	/**
	 * @param v_Mag_Equ_Model the v_Mag_Equ_Model to set
	 */
	public void setV_Mag_Equ_Model(String v_Mag_Equ_Model) {
		this.v_Mag_Equ_Model = v_Mag_Equ_Model;
	}
	/**
	 * @return the v_Mag_Equ_ID
	 */
	public String getV_Mag_Equ_ID() {
		return v_Mag_Equ_ID;
	}
	/**
	 * @param v_Mag_Equ_ID the v_Mag_Equ_ID to set
	 */
	public void setV_Mag_Equ_ID(String v_Mag_Equ_ID) {
		this.v_Mag_Equ_ID = v_Mag_Equ_ID;
	}
	/**
	 * @return the v_Mag_Mod
	 */
	public String getV_Mag_Mod() {
		return v_Mag_Mod;
	}
	/**
	 * @param v_Mag_Mod the v_Mag_Mod to set
	 */
	public void setV_Mag_Mod(String v_Mag_Mod) {
		this.v_Mag_Mod = v_Mag_Mod;
	}
	/**
	 * @return the v_Mag_Sus
	 */
	public String getV_Mag_Sus() {
		return v_Mag_Sus;
	}
	/**
	 * @param v_Mag_Sus the v_Mag_Sus to set
	 */
	public void setV_Mag_Sus(String v_Mag_Sus) {
		this.v_Mag_Sus = v_Mag_Sus;
	}
	/**
	 * @return the v_Mag_Sens
	 */
	public String getV_Mag_Sens() {
		return v_Mag_Sens;
	}
	/**
	 * @param v_Mag_Sens the v_Mag_Sens to set
	 */
	public void setV_Mag_Sens(String v_Mag_Sens) {
		this.v_Mag_Sens = v_Mag_Sens;
	}
	/**
	 * @return the v_Mag_Method
	 */
	public String getV_Mag_Method() {
		return v_Mag_Method;
	}
	/**
	 * @param v_Mag_Method the v_Mag_Method to set
	 */
	public void setV_Mag_Method(String v_Mag_Method) {
		this.v_Mag_Method = v_Mag_Method;
	}
	/**
	 * @return the v_Mag_Cur
	 */
	public String getV_Mag_Cur() {
		return v_Mag_Cur;
	}
	/**
	 * @param v_Mag_Cur the v_Mag_Cur to set
	 */
	public void setV_Mag_Cur(String v_Mag_Cur) {
		this.v_Mag_Cur = v_Mag_Cur;
	}
	/**
	 * @return the v_Mag_Spr
	 */
	public String getV_Mag_Spr() {
		return v_Mag_Spr;
	}
	/**
	 * @param v_Mag_Spr the v_Mag_Spr to set
	 */
	public void setV_Mag_Spr(String v_Mag_Spr) {
		this.v_Mag_Spr = v_Mag_Spr;
	}
	/**
	 * @return the v_Mag_Cri
	 */
	public String getV_Mag_Cri() {
		return v_Mag_Cri;
	}
	/**
	 * @param v_Mag_Cri the v_Mag_Cri to set
	 */
	public void setV_Mag_Cri(String v_Mag_Cri) {
		this.v_Mag_Cri = v_Mag_Cri;
	}
	/**
	 * @return the v_Mag_Len
	 */
	public String getV_Mag_Len() {
		return v_Mag_Len;
	}
	/**
	 * @param v_Mag_Len the v_Mag_Len to set
	 */
	public void setV_Mag_Len(String v_Mag_Len) {
		this.v_Mag_Len = v_Mag_Len;
	}
	
	/**
	 * @return the v_Mag_Value
	 */
	@Column(length=5500)
	public String getV_Mag_Value() {
		return v_Mag_Value;
	}
	/**
	 * @param v_Mag_Value the v_Mag_Value to set
	 */
	public void setV_Mag_Value(String v_Mag_Value) {
		this.v_Mag_Value = v_Mag_Value;
	}
	/**
	 * @return the v_Mag_Result
	 */
	public String getV_Mag_Result() {
		return v_Mag_Result;
	}
	/**
	 * @param v_Mag_Result the v_Mag_Result to set
	 */
	public void setV_Mag_Result(String v_Mag_Result) {
		this.v_Mag_Result = v_Mag_Result;
	}
	/**
	 * @return the v_Mag_Date
	 */
	public String getV_Mag_Date() {
		return v_Mag_Date;
	}
	/**
	 * @param v_Mag_Date the v_Mag_Date to set
	 */
	public void setV_Mag_Date(String v_Mag_Date) {
		this.v_Mag_Date = v_Mag_Date;
	}
	/**
	 * @return the v_Mag_Check_Date
	 */
	public String getV_Mag_Check_Date() {
		return v_Mag_Check_Date;
	}
	/**
	 * @param v_Mag_Check_Date the v_Mag_Check_Date to set
	 */
	public void setV_Mag_Check_Date(String v_Mag_Check_Date) {
		this.v_Mag_Check_Date = v_Mag_Check_Date;
	}
	
	

}
