package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselRadioTest")
public class VesselRadioTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Radio_Type;//源种类
	private String v_Radio_Sen_Mode;//增感方式
	private String v_Radio_Det;//探伤机型号
	private String v_Radio_Equ_ID;//仪器编号
	private String v_Radio_Tube_Voltage;//管电压/源活度
	private String v_Radio_Tube_Current;//管电流
	private String v_Radio_Iqi_Mod;//象质计型号
	private String v_Radio_Iqi_Coe;//象质计指数
	private String v_Radio_Tran_Mode;//透照方式
	private String v_Radio_Expo;//曝光时间
	private String v_Radio_Focal_Dis;//焦   距
	private String v_Radio_Focal_Size;//焦点尺寸
	private String v_Radio_Film_Type;//胶片类型
	private String v_Radio_Film_Density;//底片黑度
	private String v_Radio_Cri;//检测标准
	private String v_Radio_Ration;//检测比例、长度
	private String v_Radio_value;//检 测 底 片 评 定 表1
	private String v_Radio_Result;//评片结果
	private String v_Radio_Per;//检测人员
	private String v_Radio_Per_Date;//检测时间
	private String v_Radio_Date;//评片
	private String v_Radio_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselRadioTest")
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
	 * @return the v_Radio_Type
	 */
	public String getV_Radio_Type() {
		return v_Radio_Type;
	}
	/**
	 * @param v_Radio_Type the v_Radio_Type to set
	 */
	public void setV_Radio_Type(String v_Radio_Type) {
		this.v_Radio_Type = v_Radio_Type;
	}
	/**
	 * @return the v_Radio_Sen_Mode
	 */
	public String getV_Radio_Sen_Mode() {
		return v_Radio_Sen_Mode;
	}
	/**
	 * @param v_Radio_Sen_Mode the v_Radio_Sen_Mode to set
	 */
	public void setV_Radio_Sen_Mode(String v_Radio_Sen_Mode) {
		this.v_Radio_Sen_Mode = v_Radio_Sen_Mode;
	}
	/**
	 * @return the v_Radio_Det
	 */
	public String getV_Radio_Det() {
		return v_Radio_Det;
	}
	/**
	 * @param v_Radio_Det the v_Radio_Det to set
	 */
	public void setV_Radio_Det(String v_Radio_Det) {
		this.v_Radio_Det = v_Radio_Det;
	}
	/**
	 * @return the v_Radio_Equ_ID
	 */
	public String getV_Radio_Equ_ID() {
		return v_Radio_Equ_ID;
	}
	/**
	 * @param v_Radio_Equ_ID the v_Radio_Equ_ID to set
	 */
	public void setV_Radio_Equ_ID(String v_Radio_Equ_ID) {
		this.v_Radio_Equ_ID = v_Radio_Equ_ID;
	}
	/**
	 * @return the v_Radio_Tube_Voltage
	 */
	public String getV_Radio_Tube_Voltage() {
		return v_Radio_Tube_Voltage;
	}
	/**
	 * @param v_Radio_Tube_Voltage the v_Radio_Tube_Voltage to set
	 */
	public void setV_Radio_Tube_Voltage(String v_Radio_Tube_Voltage) {
		this.v_Radio_Tube_Voltage = v_Radio_Tube_Voltage;
	}
	/**
	 * @return the v_Radio_Tube_Current
	 */
	public String getV_Radio_Tube_Current() {
		return v_Radio_Tube_Current;
	}
	/**
	 * @param v_Radio_Tube_Current the v_Radio_Tube_Current to set
	 */
	public void setV_Radio_Tube_Current(String v_Radio_Tube_Current) {
		this.v_Radio_Tube_Current = v_Radio_Tube_Current;
	}
	/**
	 * @return the v_Radio_Iqi_Mod
	 */
	public String getV_Radio_Iqi_Mod() {
		return v_Radio_Iqi_Mod;
	}
	/**
	 * @param v_Radio_Iqi_Mod the v_Radio_Iqi_Mod to set
	 */
	public void setV_Radio_Iqi_Mod(String v_Radio_Iqi_Mod) {
		this.v_Radio_Iqi_Mod = v_Radio_Iqi_Mod;
	}
	/**
	 * @return the v_Radio_Iqi_Coe
	 */
	public String getV_Radio_Iqi_Coe() {
		return v_Radio_Iqi_Coe;
	}
	/**
	 * @param v_Radio_Iqi_Coe the v_Radio_Iqi_Coe to set
	 */
	public void setV_Radio_Iqi_Coe(String v_Radio_Iqi_Coe) {
		this.v_Radio_Iqi_Coe = v_Radio_Iqi_Coe;
	}
	/**
	 * @return the v_Radio_Tran_Mode
	 */
	public String getV_Radio_Tran_Mode() {
		return v_Radio_Tran_Mode;
	}
	/**
	 * @param v_Radio_Tran_Mode the v_Radio_Tran_Mode to set
	 */
	public void setV_Radio_Tran_Mode(String v_Radio_Tran_Mode) {
		this.v_Radio_Tran_Mode = v_Radio_Tran_Mode;
	}
	/**
	 * @return the v_Radio_Expo
	 */
	public String getV_Radio_Expo() {
		return v_Radio_Expo;
	}
	/**
	 * @param v_Radio_Expo the v_Radio_Expo to set
	 */
	public void setV_Radio_Expo(String v_Radio_Expo) {
		this.v_Radio_Expo = v_Radio_Expo;
	}
	/**
	 * @return the v_Radio_Focal_Dis
	 */
	public String getV_Radio_Focal_Dis() {
		return v_Radio_Focal_Dis;
	}
	/**
	 * @param v_Radio_Focal_Dis the v_Radio_Focal_Dis to set
	 */
	public void setV_Radio_Focal_Dis(String v_Radio_Focal_Dis) {
		this.v_Radio_Focal_Dis = v_Radio_Focal_Dis;
	}
	/**
	 * @return the v_Radio_Focal_Size
	 */
	public String getV_Radio_Focal_Size() {
		return v_Radio_Focal_Size;
	}
	/**
	 * @param v_Radio_Focal_Size the v_Radio_Focal_Size to set
	 */
	public void setV_Radio_Focal_Size(String v_Radio_Focal_Size) {
		this.v_Radio_Focal_Size = v_Radio_Focal_Size;
	}
	/**
	 * @return the v_Radio_Film_Type
	 */
	public String getV_Radio_Film_Type() {
		return v_Radio_Film_Type;
	}
	/**
	 * @param v_Radio_Film_Type the v_Radio_Film_Type to set
	 */
	public void setV_Radio_Film_Type(String v_Radio_Film_Type) {
		this.v_Radio_Film_Type = v_Radio_Film_Type;
	}
	/**
	 * @return the v_Radio_Film_Density
	 */
	public String getV_Radio_Film_Density() {
		return v_Radio_Film_Density;
	}
	/**
	 * @param v_Radio_Film_Density the v_Radio_Film_Density to set
	 */
	public void setV_Radio_Film_Density(String v_Radio_Film_Density) {
		this.v_Radio_Film_Density = v_Radio_Film_Density;
	}
	/**
	 * @return the v_Radio_Cri
	 */
	public String getV_Radio_Cri() {
		return v_Radio_Cri;
	}
	/**
	 * @param v_Radio_Cri the v_Radio_Cri to set
	 */
	public void setV_Radio_Cri(String v_Radio_Cri) {
		this.v_Radio_Cri = v_Radio_Cri;
	}
	/**
	 * @return the v_Radio_Ration
	 */
	public String getV_Radio_Ration() {
		return v_Radio_Ration;
	}
	/**
	 * @param v_Radio_Ration the v_Radio_Ration to set
	 */
	public void setV_Radio_Ration(String v_Radio_Ration) {
		this.v_Radio_Ration = v_Radio_Ration;
	}
	
	/**
	 * @return the v_Radio_value
	 */
	@Column(length=5500)
	public String getV_Radio_value() {
		return v_Radio_value;
	}
	/**
	 * @param v_Radio_value the v_Radio_value to set
	 */
	public void setV_Radio_value(String v_Radio_value) {
		this.v_Radio_value = v_Radio_value;
	}
	/**
	 * @return the v_Radio_Result
	 */
	public String getV_Radio_Result() {
		return v_Radio_Result;
	}
	/**
	 * @param v_Radio_Result the v_Radio_Result to set
	 */
	public void setV_Radio_Result(String v_Radio_Result) {
		this.v_Radio_Result = v_Radio_Result;
	}
	/**
	 * @return the v_Radio_Per
	 */
	public String getV_Radio_Per() {
		return v_Radio_Per;
	}
	/**
	 * @param v_Radio_Per the v_Radio_Per to set
	 */
	public void setV_Radio_Per(String v_Radio_Per) {
		this.v_Radio_Per = v_Radio_Per;
	}
	/**
	 * @return the v_Radio_Per_Date
	 */
	public String getV_Radio_Per_Date() {
		return v_Radio_Per_Date;
	}
	/**
	 * @param v_Radio_Per_Date the v_Radio_Per_Date to set
	 */
	public void setV_Radio_Per_Date(String v_Radio_Per_Date) {
		this.v_Radio_Per_Date = v_Radio_Per_Date;
	}
	/**
	 * @return the v_Radio_Date
	 */
	public String getV_Radio_Date() {
		return v_Radio_Date;
	}
	/**
	 * @param v_Radio_Date the v_Radio_Date to set
	 */
	public void setV_Radio_Date(String v_Radio_Date) {
		this.v_Radio_Date = v_Radio_Date;
	}
	/**
	 * @return the v_Radio_Check_Date
	 */
	public String getV_Radio_Check_Date() {
		return v_Radio_Check_Date;
	}
	/**
	 * @param v_Radio_Check_Date the v_Radio_Check_Date to set
	 */
	public void setV_Radio_Check_Date(String v_Radio_Check_Date) {
		this.v_Radio_Check_Date = v_Radio_Check_Date;
	}
	

}
