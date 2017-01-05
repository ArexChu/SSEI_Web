package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselTOFDTest")
public class VesselTOFDTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_TOFD_Equ_Model;//检测仪器型号
	private String v_TOFD_Equ_ID;//检测仪器编号
	private String v_TOFD_Head_Type;//探头型号
	private String v_TOFD_Block_Type;//试块型号及编号
	private String v_TOFD_Eva_Sens;//评定灵敏度
	private String v_TOFD_Det_Method;//检测方法/扫查面
	private String v_TOFD_Coup;//耦 合 剂
	private String v_TOFD_Compen;//补    偿
	private String v_TOFD_Det_Cri;//检测标准
	private String v_TOFD_Det_Ration;//检测比例、长度
	private String v_TOFD_Cha_1;//通道一
	private String v_TOFD_Cha_2;//
	private String v_TOFD_Cha_3;//
	private String v_TOFD_Cha_4;//
	private String v_TOFD_Cha_Dis;//通道间距
	private String v_TOFD_Value;//
	private String v_TOFD_Result;//
	private String v_TOFD_Date;//检测
	private String v_TOFD_Check_Date;//校对
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	
	/**
	 * @return the v_TOFD_Value
	 */
	@Column(length=5500)
	public String getV_TOFD_Value() {
		return v_TOFD_Value;
	}


	/**
	 * @param v_TOFD_Value the v_TOFD_Value to set
	 */
	public void setV_TOFD_Value(String v_TOFD_Value) {
		this.v_TOFD_Value = v_TOFD_Value;
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
	@OneToOne(mappedBy="vesselTOFDTest")
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
	 * @return the v_TOFD_Equ_Model
	 */
	public String getV_TOFD_Equ_Model() {
		return v_TOFD_Equ_Model;
	}
	/**
	 * @param v_TOFD_Equ_Model the v_TOFD_Equ_Model to set
	 */
	public void setV_TOFD_Equ_Model(String v_TOFD_Equ_Model) {
		this.v_TOFD_Equ_Model = v_TOFD_Equ_Model;
	}
	/**
	 * @return the v_TOFD_Equ_ID
	 */
	public String getV_TOFD_Equ_ID() {
		return v_TOFD_Equ_ID;
	}
	/**
	 * @param v_TOFD_Equ_ID the v_TOFD_Equ_ID to set
	 */
	public void setV_TOFD_Equ_ID(String v_TOFD_Equ_ID) {
		this.v_TOFD_Equ_ID = v_TOFD_Equ_ID;
	}
	/**
	 * @return the v_TOFD_Head_Type
	 */
	public String getV_TOFD_Head_Type() {
		return v_TOFD_Head_Type;
	}
	/**
	 * @param v_TOFD_Head_Type the v_TOFD_Head_Type to set
	 */
	public void setV_TOFD_Head_Type(String v_TOFD_Head_Type) {
		this.v_TOFD_Head_Type = v_TOFD_Head_Type;
	}
	/**
	 * @return the v_TOFD_Block_Type
	 */
	public String getV_TOFD_Block_Type() {
		return v_TOFD_Block_Type;
	}
	/**
	 * @param v_TOFD_Block_Type the v_TOFD_Block_Type to set
	 */
	public void setV_TOFD_Block_Type(String v_TOFD_Block_Type) {
		this.v_TOFD_Block_Type = v_TOFD_Block_Type;
	}
	/**
	 * @return the v_TOFD_Eva_Sens
	 */
	public String getV_TOFD_Eva_Sens() {
		return v_TOFD_Eva_Sens;
	}
	/**
	 * @param v_TOFD_Eva_Sens the v_TOFD_Eva_Sens to set
	 */
	public void setV_TOFD_Eva_Sens(String v_TOFD_Eva_Sens) {
		this.v_TOFD_Eva_Sens = v_TOFD_Eva_Sens;
	}
	/**
	 * @return the v_TOFD_Det_Method
	 */
	public String getV_TOFD_Det_Method() {
		return v_TOFD_Det_Method;
	}
	/**
	 * @param v_TOFD_Det_Method the v_TOFD_Det_Method to set
	 */
	public void setV_TOFD_Det_Method(String v_TOFD_Det_Method) {
		this.v_TOFD_Det_Method = v_TOFD_Det_Method;
	}
	/**
	 * @return the v_TOFD_Coup
	 */
	public String getV_TOFD_Coup() {
		return v_TOFD_Coup;
	}
	/**
	 * @param v_TOFD_Coup the v_TOFD_Coup to set
	 */
	public void setV_TOFD_Coup(String v_TOFD_Coup) {
		this.v_TOFD_Coup = v_TOFD_Coup;
	}
	/**
	 * @return the v_TOFD_Compen
	 */
	public String getV_TOFD_Compen() {
		return v_TOFD_Compen;
	}
	/**
	 * @param v_TOFD_Compen the v_TOFD_Compen to set
	 */
	public void setV_TOFD_Compen(String v_TOFD_Compen) {
		this.v_TOFD_Compen = v_TOFD_Compen;
	}
	/**
	 * @return the v_TOFD_Det_Cri
	 */
	public String getV_TOFD_Det_Cri() {
		return v_TOFD_Det_Cri;
	}
	/**
	 * @param v_TOFD_Det_Cri the v_TOFD_Det_Cri to set
	 */
	public void setV_TOFD_Det_Cri(String v_TOFD_Det_Cri) {
		this.v_TOFD_Det_Cri = v_TOFD_Det_Cri;
	}
	/**
	 * @return the v_TOFD_Det_Ration
	 */
	public String getV_TOFD_Det_Ration() {
		return v_TOFD_Det_Ration;
	}
	/**
	 * @param v_TOFD_Det_Ration the v_TOFD_Det_Ration to set
	 */
	public void setV_TOFD_Det_Ration(String v_TOFD_Det_Ration) {
		this.v_TOFD_Det_Ration = v_TOFD_Det_Ration;
	}
	/**
	 * @return the v_TOFD_Cha_1
	 */
	public String getV_TOFD_Cha_1() {
		return v_TOFD_Cha_1;
	}
	/**
	 * @param v_TOFD_Cha_1 the v_TOFD_Cha_1 to set
	 */
	public void setV_TOFD_Cha_1(String v_TOFD_Cha_1) {
		this.v_TOFD_Cha_1 = v_TOFD_Cha_1;
	}
	/**
	 * @return the v_TOFD_Cha_2
	 */
	public String getV_TOFD_Cha_2() {
		return v_TOFD_Cha_2;
	}
	/**
	 * @param v_TOFD_Cha_2 the v_TOFD_Cha_2 to set
	 */
	public void setV_TOFD_Cha_2(String v_TOFD_Cha_2) {
		this.v_TOFD_Cha_2 = v_TOFD_Cha_2;
	}
	/**
	 * @return the v_TOFD_Cha_3
	 */
	public String getV_TOFD_Cha_3() {
		return v_TOFD_Cha_3;
	}
	/**
	 * @param v_TOFD_Cha_3 the v_TOFD_Cha_3 to set
	 */
	public void setV_TOFD_Cha_3(String v_TOFD_Cha_3) {
		this.v_TOFD_Cha_3 = v_TOFD_Cha_3;
	}
	/**
	 * @return the v_TOFD_Cha_4
	 */
	public String getV_TOFD_Cha_4() {
		return v_TOFD_Cha_4;
	}
	/**
	 * @param v_TOFD_Cha_4 the v_TOFD_Cha_4 to set
	 */
	public void setV_TOFD_Cha_4(String v_TOFD_Cha_4) {
		this.v_TOFD_Cha_4 = v_TOFD_Cha_4;
	}
	/**
	 * @return the v_TOFD_Cha_Dis
	 */
	public String getV_TOFD_Cha_Dis() {
		return v_TOFD_Cha_Dis;
	}
	/**
	 * @param v_TOFD_Cha_Dis the v_TOFD_Cha_Dis to set
	 */
	public void setV_TOFD_Cha_Dis(String v_TOFD_Cha_Dis) {
		this.v_TOFD_Cha_Dis = v_TOFD_Cha_Dis;
	}
	/**
	 * @return the v_TOFD_Result
	 */
	public String getV_TOFD_Result() {
		return v_TOFD_Result;
	}
	/**
	 * @param v_TOFD_Result the v_TOFD_Result to set
	 */
	public void setV_TOFD_Result(String v_TOFD_Result) {
		this.v_TOFD_Result = v_TOFD_Result;
	}
	/**
	 * @return the v_TOFD_Date
	 */
	public String getV_TOFD_Date() {
		return v_TOFD_Date;
	}
	/**
	 * @param v_TOFD_Date the v_TOFD_Date to set
	 */
	public void setV_TOFD_Date(String v_TOFD_Date) {
		this.v_TOFD_Date = v_TOFD_Date;
	}
	/**
	 * @return the v_TOFD_Check_Date
	 */
	public String getV_TOFD_Check_Date() {
		return v_TOFD_Check_Date;
	}
	/**
	 * @param v_TOFD_Check_Date the v_TOFD_Check_Date to set
	 */
	public void setV_TOFD_Check_Date(String v_TOFD_Check_Date) {
		this.v_TOFD_Check_Date = v_TOFD_Check_Date;
	}
	

}
