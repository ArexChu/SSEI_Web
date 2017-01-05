package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselSonciTest")
public class VesselSonciTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Sonic_Cri;//检测标准
	private String v_Sonic_Pre;//试验压力
	private String v_Sonic_Equ_Type;//仪器型号
	private String v_Sonic_Equ_ID;//仪器编号
	private String v_Sonic_Method;//检测方式
	private String v_Sonic_Fre;//检测频率
	private String v_Sonic_Sensor;//传感器型号
	private String v_Sonic_Fixed_Mode;//固定方式
	private String v_Sonic_Coup;//耦合剂
	private String v_Sonic_Sensor_Num;//传感器数量
	private String v_Sonic_Sensor_Sens;//传感器平均灵敏度
	private String v_Sonic_Sensor_Max;//最大灵敏度
	private String v_Sonic_Noise;//背景噪声
	private String v_Sonic_Thr;//门槛电平
	private String v_Sonic_Sensor_Min;//最小灵敏度
	private String v_Sonic_Gain;//增   益
	private String v_Sonic_Source;//模拟源
	private String v_Sonic_Sensor_Dis;//传感器最大间距
	private String v_Sonic_Source_Dis;//模拟源距离
	private String v_Sonic_Sensor_ID;//衰减测量传感器号
	private String v_Sonic_Amp;//信号幅度
	private String v_Sonic_Result;//
	private String v_Sonic_Date;//检测
	private String v_Sonic_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselSonciTest")
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
	 * @return the v_Sonic_Cri
	 */
	public String getV_Sonic_Cri() {
		return v_Sonic_Cri;
	}
	/**
	 * @param v_Sonic_Cri the v_Sonic_Cri to set
	 */
	public void setV_Sonic_Cri(String v_Sonic_Cri) {
		this.v_Sonic_Cri = v_Sonic_Cri;
	}
	/**
	 * @return the v_Sonic_Pre
	 */
	public String getV_Sonic_Pre() {
		return v_Sonic_Pre;
	}
	/**
	 * @param v_Sonic_Pre the v_Sonic_Pre to set
	 */
	public void setV_Sonic_Pre(String v_Sonic_Pre) {
		this.v_Sonic_Pre = v_Sonic_Pre;
	}
	/**
	 * @return the v_Sonic_Equ_Type
	 */
	public String getV_Sonic_Equ_Type() {
		return v_Sonic_Equ_Type;
	}
	/**
	 * @param v_Sonic_Equ_Type the v_Sonic_Equ_Type to set
	 */
	public void setV_Sonic_Equ_Type(String v_Sonic_Equ_Type) {
		this.v_Sonic_Equ_Type = v_Sonic_Equ_Type;
	}
	/**
	 * @return the v_Sonic_Equ_ID
	 */
	public String getV_Sonic_Equ_ID() {
		return v_Sonic_Equ_ID;
	}
	/**
	 * @param v_Sonic_Equ_ID the v_Sonic_Equ_ID to set
	 */
	public void setV_Sonic_Equ_ID(String v_Sonic_Equ_ID) {
		this.v_Sonic_Equ_ID = v_Sonic_Equ_ID;
	}
	/**
	 * @return the v_Sonic_Method
	 */
	public String getV_Sonic_Method() {
		return v_Sonic_Method;
	}
	/**
	 * @param v_Sonic_Method the v_Sonic_Method to set
	 */
	public void setV_Sonic_Method(String v_Sonic_Method) {
		this.v_Sonic_Method = v_Sonic_Method;
	}
	/**
	 * @return the v_Sonic_Fre
	 */
	public String getV_Sonic_Fre() {
		return v_Sonic_Fre;
	}
	/**
	 * @param v_Sonic_Fre the v_Sonic_Fre to set
	 */
	public void setV_Sonic_Fre(String v_Sonic_Fre) {
		this.v_Sonic_Fre = v_Sonic_Fre;
	}
	/**
	 * @return the v_Sonic_Sensor
	 */
	public String getV_Sonic_Sensor() {
		return v_Sonic_Sensor;
	}
	/**
	 * @param v_Sonic_Sensor the v_Sonic_Sensor to set
	 */
	public void setV_Sonic_Sensor(String v_Sonic_Sensor) {
		this.v_Sonic_Sensor = v_Sonic_Sensor;
	}
	/**
	 * @return the v_Sonic_Fixed_Mode
	 */
	public String getV_Sonic_Fixed_Mode() {
		return v_Sonic_Fixed_Mode;
	}
	/**
	 * @param v_Sonic_Fixed_Mode the v_Sonic_Fixed_Mode to set
	 */
	public void setV_Sonic_Fixed_Mode(String v_Sonic_Fixed_Mode) {
		this.v_Sonic_Fixed_Mode = v_Sonic_Fixed_Mode;
	}
	/**
	 * @return the v_Sonic_Coup
	 */
	public String getV_Sonic_Coup() {
		return v_Sonic_Coup;
	}
	/**
	 * @param v_Sonic_Coup the v_Sonic_Coup to set
	 */
	public void setV_Sonic_Coup(String v_Sonic_Coup) {
		this.v_Sonic_Coup = v_Sonic_Coup;
	}
	/**
	 * @return the v_Sonic_Sensor_Num
	 */
	public String getV_Sonic_Sensor_Num() {
		return v_Sonic_Sensor_Num;
	}
	/**
	 * @param v_Sonic_Sensor_Num the v_Sonic_Sensor_Num to set
	 */
	public void setV_Sonic_Sensor_Num(String v_Sonic_Sensor_Num) {
		this.v_Sonic_Sensor_Num = v_Sonic_Sensor_Num;
	}
	/**
	 * @return the v_Sonic_Sensor_Sens
	 */
	public String getV_Sonic_Sensor_Sens() {
		return v_Sonic_Sensor_Sens;
	}
	/**
	 * @param v_Sonic_Sensor_Sens the v_Sonic_Sensor_Sens to set
	 */
	public void setV_Sonic_Sensor_Sens(String v_Sonic_Sensor_Sens) {
		this.v_Sonic_Sensor_Sens = v_Sonic_Sensor_Sens;
	}
	/**
	 * @return the v_Sonic_Sensor_Max
	 */
	public String getV_Sonic_Sensor_Max() {
		return v_Sonic_Sensor_Max;
	}
	/**
	 * @param v_Sonic_Sensor_Max the v_Sonic_Sensor_Max to set
	 */
	public void setV_Sonic_Sensor_Max(String v_Sonic_Sensor_Max) {
		this.v_Sonic_Sensor_Max = v_Sonic_Sensor_Max;
	}
	/**
	 * @return the v_Sonic_Noise
	 */
	public String getV_Sonic_Noise() {
		return v_Sonic_Noise;
	}
	/**
	 * @param v_Sonic_Noise the v_Sonic_Noise to set
	 */
	public void setV_Sonic_Noise(String v_Sonic_Noise) {
		this.v_Sonic_Noise = v_Sonic_Noise;
	}
	/**
	 * @return the v_Sonic_Thr
	 */
	public String getV_Sonic_Thr() {
		return v_Sonic_Thr;
	}
	/**
	 * @param v_Sonic_Thr the v_Sonic_Thr to set
	 */
	public void setV_Sonic_Thr(String v_Sonic_Thr) {
		this.v_Sonic_Thr = v_Sonic_Thr;
	}
	/**
	 * @return the v_Sonic_Sensor_Min
	 */
	public String getV_Sonic_Sensor_Min() {
		return v_Sonic_Sensor_Min;
	}
	/**
	 * @param v_Sonic_Sensor_Min the v_Sonic_Sensor_Min to set
	 */
	public void setV_Sonic_Sensor_Min(String v_Sonic_Sensor_Min) {
		this.v_Sonic_Sensor_Min = v_Sonic_Sensor_Min;
	}
	/**
	 * @return the v_Sonic_Gain
	 */
	public String getV_Sonic_Gain() {
		return v_Sonic_Gain;
	}
	/**
	 * @param v_Sonic_Gain the v_Sonic_Gain to set
	 */
	public void setV_Sonic_Gain(String v_Sonic_Gain) {
		this.v_Sonic_Gain = v_Sonic_Gain;
	}
	/**
	 * @return the v_Sonic_Source
	 */
	public String getV_Sonic_Source() {
		return v_Sonic_Source;
	}
	/**
	 * @param v_Sonic_Source the v_Sonic_Source to set
	 */
	public void setV_Sonic_Source(String v_Sonic_Source) {
		this.v_Sonic_Source = v_Sonic_Source;
	}
	/**
	 * @return the v_Sonic_Sensor_Dis
	 */
	public String getV_Sonic_Sensor_Dis() {
		return v_Sonic_Sensor_Dis;
	}
	/**
	 * @param v_Sonic_Sensor_Dis the v_Sonic_Sensor_Dis to set
	 */
	public void setV_Sonic_Sensor_Dis(String v_Sonic_Sensor_Dis) {
		this.v_Sonic_Sensor_Dis = v_Sonic_Sensor_Dis;
	}
	/**
	 * @return the v_Sonic_Source_Dis
	 */
	public String getV_Sonic_Source_Dis() {
		return v_Sonic_Source_Dis;
	}
	/**
	 * @param v_Sonic_Source_Dis the v_Sonic_Source_Dis to set
	 */
	public void setV_Sonic_Source_Dis(String v_Sonic_Source_Dis) {
		this.v_Sonic_Source_Dis = v_Sonic_Source_Dis;
	}
	/**
	 * @return the v_Sonic_Sensor_ID
	 */
	public String getV_Sonic_Sensor_ID() {
		return v_Sonic_Sensor_ID;
	}
	/**
	 * @param v_Sonic_Sensor_ID the v_Sonic_Sensor_ID to set
	 */
	public void setV_Sonic_Sensor_ID(String v_Sonic_Sensor_ID) {
		this.v_Sonic_Sensor_ID = v_Sonic_Sensor_ID;
	}
	/**
	 * @return the v_Sonic_Amp
	 */
	public String getV_Sonic_Amp() {
		return v_Sonic_Amp;
	}
	/**
	 * @param v_Sonic_Amp the v_Sonic_Amp to set
	 */
	public void setV_Sonic_Amp(String v_Sonic_Amp) {
		this.v_Sonic_Amp = v_Sonic_Amp;
	}
	/**
	 * @return the v_Sonic_Result
	 */
	public String getV_Sonic_Result() {
		return v_Sonic_Result;
	}
	/**
	 * @param v_Sonic_Result the v_Sonic_Result to set
	 */
	public void setV_Sonic_Result(String v_Sonic_Result) {
		this.v_Sonic_Result = v_Sonic_Result;
	}
	/**
	 * @return the v_Sonic_Date
	 */
	public String getV_Sonic_Date() {
		return v_Sonic_Date;
	}
	/**
	 * @param v_Sonic_Date the v_Sonic_Date to set
	 */
	public void setV_Sonic_Date(String v_Sonic_Date) {
		this.v_Sonic_Date = v_Sonic_Date;
	}
	/**
	 * @return the v_Sonic_Check_Date
	 */
	public String getV_Sonic_Check_Date() {
		return v_Sonic_Check_Date;
	}
	/**
	 * @param v_Sonic_Check_Date the v_Sonic_Check_Date to set
	 */
	public void setV_Sonic_Check_Date(String v_Sonic_Check_Date) {
		this.v_Sonic_Check_Date = v_Sonic_Check_Date;
	}
	

}
