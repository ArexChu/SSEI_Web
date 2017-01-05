package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselUltrasonicTest")
public class VesselUltrasonicTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Ult_Inst_Model;//检测仪器型号
	private String v_Ult_Inst_ID;//检测仪器编号
	private String v_Ult_Head_Type;//探头型号
	private String v_Ult_Block_Type;//试块型号及编号
	private String v_Ult_Eva_Sens;//评定灵敏度
	private String v_Ult_Det_Method;//检测方法/扫查面
	private String v_Ult_Coup;//耦 合 剂
	private String v_Ult_Compen;//补    偿
	private String v_Ult_Det_Cri;//检测标准
	private String v_Ult_Det_Ration;//检测比例、长度
	private String v_Ult_Value;//
	private String v_Ult_Result;//检测结果
	private String v_Ult_Date;//检测
	private String v_Ult_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselUltrasonicTest")
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
	 * @return the v_Ult_Inst_Model
	 */
	public String getV_Ult_Inst_Model() {
		return v_Ult_Inst_Model;
	}
	/**
	 * @param v_Ult_Inst_Model the v_Ult_Inst_Model to set
	 */
	public void setV_Ult_Inst_Model(String v_Ult_Inst_Model) {
		this.v_Ult_Inst_Model = v_Ult_Inst_Model;
	}
	/**
	 * @return the v_Ult_Inst_ID
	 */
	public String getV_Ult_Inst_ID() {
		return v_Ult_Inst_ID;
	}
	/**
	 * @param v_Ult_Inst_ID the v_Ult_Inst_ID to set
	 */
	public void setV_Ult_Inst_ID(String v_Ult_Inst_ID) {
		this.v_Ult_Inst_ID = v_Ult_Inst_ID;
	}
	/**
	 * @return the v_Ult_Head_Type
	 */
	public String getV_Ult_Head_Type() {
		return v_Ult_Head_Type;
	}
	/**
	 * @param v_Ult_Head_Type the v_Ult_Head_Type to set
	 */
	public void setV_Ult_Head_Type(String v_Ult_Head_Type) {
		this.v_Ult_Head_Type = v_Ult_Head_Type;
	}
	/**
	 * @return the v_Ult_Block_Type
	 */
	public String getV_Ult_Block_Type() {
		return v_Ult_Block_Type;
	}
	/**
	 * @param v_Ult_Block_Type the v_Ult_Block_Type to set
	 */
	public void setV_Ult_Block_Type(String v_Ult_Block_Type) {
		this.v_Ult_Block_Type = v_Ult_Block_Type;
	}
	/**
	 * @return the v_Ult_Eva_Sens
	 */
	public String getV_Ult_Eva_Sens() {
		return v_Ult_Eva_Sens;
	}
	/**
	 * @param v_Ult_Eva_Sens the v_Ult_Eva_Sens to set
	 */
	public void setV_Ult_Eva_Sens(String v_Ult_Eva_Sens) {
		this.v_Ult_Eva_Sens = v_Ult_Eva_Sens;
	}
	/**
	 * @return the v_Ult_Det_Method
	 */
	public String getV_Ult_Det_Method() {
		return v_Ult_Det_Method;
	}
	/**
	 * @param v_Ult_Det_Method the v_Ult_Det_Method to set
	 */
	public void setV_Ult_Det_Method(String v_Ult_Det_Method) {
		this.v_Ult_Det_Method = v_Ult_Det_Method;
	}
	/**
	 * @return the v_Ult_Coup
	 */
	public String getV_Ult_Coup() {
		return v_Ult_Coup;
	}
	/**
	 * @param v_Ult_Coup the v_Ult_Coup to set
	 */
	public void setV_Ult_Coup(String v_Ult_Coup) {
		this.v_Ult_Coup = v_Ult_Coup;
	}
	/**
	 * @return the v_Ult_Compen
	 */
	public String getV_Ult_Compen() {
		return v_Ult_Compen;
	}
	/**
	 * @param v_Ult_Compen the v_Ult_Compen to set
	 */
	public void setV_Ult_Compen(String v_Ult_Compen) {
		this.v_Ult_Compen = v_Ult_Compen;
	}
	/**
	 * @return the v_Ult_Det_Cri
	 */
	public String getV_Ult_Det_Cri() {
		return v_Ult_Det_Cri;
	}
	/**
	 * @param v_Ult_Det_Cri the v_Ult_Det_Cri to set
	 */
	public void setV_Ult_Det_Cri(String v_Ult_Det_Cri) {
		this.v_Ult_Det_Cri = v_Ult_Det_Cri;
	}
	/**
	 * @return the v_Ult_Det_Ration
	 */
	@Column(length=5500)
	public String getV_Ult_Det_Ration() {
		return v_Ult_Det_Ration;
	}
	/**
	 * @param v_Ult_Det_Ration the v_Ult_Det_Ration to set
	 */
	public void setV_Ult_Det_Ration(String v_Ult_Det_Ration) {
		this.v_Ult_Det_Ration = v_Ult_Det_Ration;
	}
	
	/**
	 * @return the v_Ult_Value
	 */
	public String getV_Ult_Value() {
		return v_Ult_Value;
	}
	/**
	 * @param v_Ult_Value the v_Ult_Value to set
	 */
	public void setV_Ult_Value(String v_Ult_Value) {
		this.v_Ult_Value = v_Ult_Value;
	}
	/**
	 * @return the v_Ult_Result
	 */
	public String getV_Ult_Result() {
		return v_Ult_Result;
	}
	/**
	 * @param v_Ult_Result the v_Ult_Result to set
	 */
	public void setV_Ult_Result(String v_Ult_Result) {
		this.v_Ult_Result = v_Ult_Result;
	}
	/**
	 * @return the v_Ult_Date
	 */
	public String getV_Ult_Date() {
		return v_Ult_Date;
	}
	/**
	 * @param v_Ult_Date the v_Ult_Date to set
	 */
	public void setV_Ult_Date(String v_Ult_Date) {
		this.v_Ult_Date = v_Ult_Date;
	}
	/**
	 * @return the v_Ult_Check_Date
	 */
	public String getV_Ult_Check_Date() {
		return v_Ult_Check_Date;
	}
	/**
	 * @param v_Ult_Check_Date the v_Ult_Check_Date to set
	 */
	public void setV_Ult_Check_Date(String v_Ult_Check_Date) {
		this.v_Ult_Check_Date = v_Ult_Check_Date;
	}
	
	
}
