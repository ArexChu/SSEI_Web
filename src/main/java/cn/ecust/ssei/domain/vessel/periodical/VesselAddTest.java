package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselAddTest")
public class VesselAddTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Sta_Ele_ID;//测试仪器型号
	private String v_Sta_Ele_Acc;//仪器精度
	private String v_Sta_Ele_Res;//导静电电阻
	private String v_Sta_Ele_Connection;//连接处电阻
	private String v_Add_Ins_Type;//真空仪型号
	private String v_Add_Ins_Acc;//仪器精度
	private String v_Add_Ins_Degree;//空载时真空度
	private String v_Add_Ins_Degree1;//承载时真空度
	private String v_Tank_Type;//真空泵型号
	private String v_Tank_Time;//抽真空时间
	private String v_Tank_Degree;//罐内真空度
	private String v_Tank_Med;//置换介质
	private String v_Tank_Pre;//置换压力
	private String v_Tank_Discharge_Pre;//排放后罐内压力
	private String v_Tank_Content;//罐内气体含氧量(≤3%)
	private String v_Cor_Name;//介质名称
	private String v_Cor_Compon;//腐蚀介质成分
	private String v_Cor_Content;//腐蚀介质含量
	private String v_Cor_Speed;//腐蚀速度
	private String v_Cor_Reason;//腐蚀机理
	private String v_Add_Others;//其他检验、检测
	private String v_Add_Result;//检测结果
	private String v_Add_Date;//检测
	private String v_Add_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselAddTest")
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
	 * @return the v_Sta_Ele_ID
	 */
	public String getV_Sta_Ele_ID() {
		return v_Sta_Ele_ID;
	}
	/**
	 * @param v_Sta_Ele_ID the v_Sta_Ele_ID to set
	 */
	public void setV_Sta_Ele_ID(String v_Sta_Ele_ID) {
		this.v_Sta_Ele_ID = v_Sta_Ele_ID;
	}
	/**
	 * @return the v_Sta_Ele_Acc
	 */
	public String getV_Sta_Ele_Acc() {
		return v_Sta_Ele_Acc;
	}
	/**
	 * @param v_Sta_Ele_Acc the v_Sta_Ele_Acc to set
	 */
	public void setV_Sta_Ele_Acc(String v_Sta_Ele_Acc) {
		this.v_Sta_Ele_Acc = v_Sta_Ele_Acc;
	}
	/**
	 * @return the v_Sta_Ele_Res
	 */
	public String getV_Sta_Ele_Res() {
		return v_Sta_Ele_Res;
	}
	/**
	 * @param v_Sta_Ele_Res the v_Sta_Ele_Res to set
	 */
	public void setV_Sta_Ele_Res(String v_Sta_Ele_Res) {
		this.v_Sta_Ele_Res = v_Sta_Ele_Res;
	}
	/**
	 * @return the v_Sta_Ele_Connection
	 */
	public String getV_Sta_Ele_Connection() {
		return v_Sta_Ele_Connection;
	}
	/**
	 * @param v_Sta_Ele_Connection the v_Sta_Ele_Connection to set
	 */
	public void setV_Sta_Ele_Connection(String v_Sta_Ele_Connection) {
		this.v_Sta_Ele_Connection = v_Sta_Ele_Connection;
	}
	/**
	 * @return the v_Add_Ins_Type
	 */
	public String getV_Add_Ins_Type() {
		return v_Add_Ins_Type;
	}
	/**
	 * @param v_Add_Ins_Type the v_Add_Ins_Type to set
	 */
	public void setV_Add_Ins_Type(String v_Add_Ins_Type) {
		this.v_Add_Ins_Type = v_Add_Ins_Type;
	}
	/**
	 * @return the v_Add_Ins_Acc
	 */
	public String getV_Add_Ins_Acc() {
		return v_Add_Ins_Acc;
	}
	/**
	 * @param v_Add_Ins_Acc the v_Add_Ins_Acc to set
	 */
	public void setV_Add_Ins_Acc(String v_Add_Ins_Acc) {
		this.v_Add_Ins_Acc = v_Add_Ins_Acc;
	}
	/**
	 * @return the v_Add_Ins_Degree
	 */
	public String getV_Add_Ins_Degree() {
		return v_Add_Ins_Degree;
	}
	/**
	 * @param v_Add_Ins_Degree the v_Add_Ins_Degree to set
	 */
	public void setV_Add_Ins_Degree(String v_Add_Ins_Degree) {
		this.v_Add_Ins_Degree = v_Add_Ins_Degree;
	}
	/**
	 * @return the v_Add_Ins_Degree1
	 */
	public String getV_Add_Ins_Degree1() {
		return v_Add_Ins_Degree1;
	}
	/**
	 * @param v_Add_Ins_Degree1 the v_Add_Ins_Degree1 to set
	 */
	public void setV_Add_Ins_Degree1(String v_Add_Ins_Degree1) {
		this.v_Add_Ins_Degree1 = v_Add_Ins_Degree1;
	}
	/**
	 * @return the v_Tank_Type
	 */
	public String getV_Tank_Type() {
		return v_Tank_Type;
	}
	/**
	 * @param v_Tank_Type the v_Tank_Type to set
	 */
	public void setV_Tank_Type(String v_Tank_Type) {
		this.v_Tank_Type = v_Tank_Type;
	}
	/**
	 * @return the v_Tank_Time
	 */
	public String getV_Tank_Time() {
		return v_Tank_Time;
	}
	/**
	 * @param v_Tank_Time the v_Tank_Time to set
	 */
	public void setV_Tank_Time(String v_Tank_Time) {
		this.v_Tank_Time = v_Tank_Time;
	}
	/**
	 * @return the v_Tank_Degree
	 */
	public String getV_Tank_Degree() {
		return v_Tank_Degree;
	}
	/**
	 * @param v_Tank_Degree the v_Tank_Degree to set
	 */
	public void setV_Tank_Degree(String v_Tank_Degree) {
		this.v_Tank_Degree = v_Tank_Degree;
	}
	/**
	 * @return the v_Tank_Med
	 */
	public String getV_Tank_Med() {
		return v_Tank_Med;
	}
	/**
	 * @param v_Tank_Med the v_Tank_Med to set
	 */
	public void setV_Tank_Med(String v_Tank_Med) {
		this.v_Tank_Med = v_Tank_Med;
	}
	/**
	 * @return the v_Tank_Pre
	 */
	public String getV_Tank_Pre() {
		return v_Tank_Pre;
	}
	/**
	 * @param v_Tank_Pre the v_Tank_Pre to set
	 */
	public void setV_Tank_Pre(String v_Tank_Pre) {
		this.v_Tank_Pre = v_Tank_Pre;
	}
	/**
	 * @return the v_Tank_Discharge_Pre
	 */
	public String getV_Tank_Discharge_Pre() {
		return v_Tank_Discharge_Pre;
	}
	/**
	 * @param v_Tank_Discharge_Pre the v_Tank_Discharge_Pre to set
	 */
	public void setV_Tank_Discharge_Pre(String v_Tank_Discharge_Pre) {
		this.v_Tank_Discharge_Pre = v_Tank_Discharge_Pre;
	}
	/**
	 * @return the v_Tank_Content
	 */
	public String getV_Tank_Content() {
		return v_Tank_Content;
	}
	/**
	 * @param v_Tank_Content the v_Tank_Content to set
	 */
	public void setV_Tank_Content(String v_Tank_Content) {
		this.v_Tank_Content = v_Tank_Content;
	}
	/**
	 * @return the v_Cor_Name
	 */
	public String getV_Cor_Name() {
		return v_Cor_Name;
	}
	/**
	 * @param v_Cor_Name the v_Cor_Name to set
	 */
	public void setV_Cor_Name(String v_Cor_Name) {
		this.v_Cor_Name = v_Cor_Name;
	}
	/**
	 * @return the v_Cor_Compon
	 */
	public String getV_Cor_Compon() {
		return v_Cor_Compon;
	}
	/**
	 * @param v_Cor_Compon the v_Cor_Compon to set
	 */
	public void setV_Cor_Compon(String v_Cor_Compon) {
		this.v_Cor_Compon = v_Cor_Compon;
	}
	/**
	 * @return the v_Cor_Content
	 */
	public String getV_Cor_Content() {
		return v_Cor_Content;
	}
	/**
	 * @param v_Cor_Content the v_Cor_Content to set
	 */
	public void setV_Cor_Content(String v_Cor_Content) {
		this.v_Cor_Content = v_Cor_Content;
	}
	/**
	 * @return the v_Cor_Speed
	 */
	public String getV_Cor_Speed() {
		return v_Cor_Speed;
	}
	/**
	 * @param v_Cor_Speed the v_Cor_Speed to set
	 */
	public void setV_Cor_Speed(String v_Cor_Speed) {
		this.v_Cor_Speed = v_Cor_Speed;
	}
	/**
	 * @return the v_Cor_Reason
	 */
	public String getV_Cor_Reason() {
		return v_Cor_Reason;
	}
	/**
	 * @param v_Cor_Reason the v_Cor_Reason to set
	 */
	public void setV_Cor_Reason(String v_Cor_Reason) {
		this.v_Cor_Reason = v_Cor_Reason;
	}
	/**
	 * @return the v_Add_Others
	 */
	public String getV_Add_Others() {
		return v_Add_Others;
	}
	/**
	 * @param v_Add_Others the v_Add_Others to set
	 */
	public void setV_Add_Others(String v_Add_Others) {
		this.v_Add_Others = v_Add_Others;
	}
	/**
	 * @return the v_Add_Result
	 */
	public String getV_Add_Result() {
		return v_Add_Result;
	}
	/**
	 * @param v_Add_Result the v_Add_Result to set
	 */
	public void setV_Add_Result(String v_Add_Result) {
		this.v_Add_Result = v_Add_Result;
	}
	/**
	 * @return the v_Add_Date
	 */
	public String getV_Add_Date() {
		return v_Add_Date;
	}
	/**
	 * @param v_Add_Date the v_Add_Date to set
	 */
	public void setV_Add_Date(String v_Add_Date) {
		this.v_Add_Date = v_Add_Date;
	}
	/**
	 * @return the v_Add_Check_Date
	 */
	public String getV_Add_Check_Date() {
		return v_Add_Check_Date;
	}
	/**
	 * @param v_Add_Check_Date the v_Add_Check_Date to set
	 */
	public void setV_Add_Check_Date(String v_Add_Check_Date) {
		this.v_Add_Check_Date = v_Add_Check_Date;
	}
	
	

}
