package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselThiTest")
public class VesselThiTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Thi_Equ_Mod;//测量仪器型号
	private String v_Thi_Equ_ID;//测量仪器编号
	private String v_Thi_Equ_Acc;//测量仪器精度
	private String v_Thi_Coup;//耦 合 剂
	private String v_Thi_Barrel;//公称厚度 筒体
	private String v_Thi_Seal;//公称厚度 封头
	private String v_Thi_Emp_1;//公称厚度 空1
	private String v_Thi_Emp_2;//公称厚度 空2
	private String v_Thi_Emp_3;//公称厚度 空3
	private String v_Thi_Emp_4;//公称厚度 空4
	private String v_Thi_Min_Barrel;//实测最小壁厚 筒体
	private String v_Thi_Min_Seal;//实测最小壁厚  封头
	private String v_Thi_Min_Emp_1;//实测最小壁厚  空1
	private String v_Thi_Min_Emp_2;//实测最小壁厚  空2
	private String v_Thi_Min_Emp_3;//实测最小壁厚  空3
	private String v_Thi_Min_Emp_4;//实测最小壁厚  空4
	private String v_Thi_Surface;//表面状况
	private String v_Thi_Num;//实测点数
	private String v_Thi_Value;//
	private String v_Thi_Result;//测定结果
	private String v_Thi_Test_Date;//检验
	private String v_Thi_Proo_Date;//校对
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
	@OneToOne(mappedBy="vesselThiTest")
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
	 * @return the v_Thi_Equ_Mod
	 */
	public String getV_Thi_Equ_Mod() {
		return v_Thi_Equ_Mod;
	}
	/**
	 * @param v_Thi_Equ_Mod the v_Thi_Equ_Mod to set
	 */
	public void setV_Thi_Equ_Mod(String v_Thi_Equ_Mod) {
		this.v_Thi_Equ_Mod = v_Thi_Equ_Mod;
	}
	/**
	 * @return the v_Thi_Equ_ID
	 */
	public String getV_Thi_Equ_ID() {
		return v_Thi_Equ_ID;
	}
	/**
	 * @param v_Thi_Equ_ID the v_Thi_Equ_ID to set
	 */
	public void setV_Thi_Equ_ID(String v_Thi_Equ_ID) {
		this.v_Thi_Equ_ID = v_Thi_Equ_ID;
	}
	/**
	 * @return the v_Thi_Equ_Acc
	 */
	public String getV_Thi_Equ_Acc() {
		return v_Thi_Equ_Acc;
	}
	/**
	 * @param v_Thi_Equ_Acc the v_Thi_Equ_Acc to set
	 */
	public void setV_Thi_Equ_Acc(String v_Thi_Equ_Acc) {
		this.v_Thi_Equ_Acc = v_Thi_Equ_Acc;
	}
	/**
	 * @return the v_Thi_Coup
	 */
	public String getV_Thi_Coup() {
		return v_Thi_Coup;
	}
	/**
	 * @param v_Thi_Coup the v_Thi_Coup to set
	 */
	public void setV_Thi_Coup(String v_Thi_Coup) {
		this.v_Thi_Coup = v_Thi_Coup;
	}
	/**
	 * @return the v_Thi_Barrel
	 */
	public String getV_Thi_Barrel() {
		return v_Thi_Barrel;
	}
	/**
	 * @param v_Thi_Barrel the v_Thi_Barrel to set
	 */
	public void setV_Thi_Barrel(String v_Thi_Barrel) {
		this.v_Thi_Barrel = v_Thi_Barrel;
	}
	/**
	 * @return the v_Thi_Seal
	 */
	public String getV_Thi_Seal() {
		return v_Thi_Seal;
	}
	/**
	 * @param v_Thi_Seal the v_Thi_Seal to set
	 */
	public void setV_Thi_Seal(String v_Thi_Seal) {
		this.v_Thi_Seal = v_Thi_Seal;
	}
	/**
	 * @return the v_Thi_Emp_1
	 */
	public String getV_Thi_Emp_1() {
		return v_Thi_Emp_1;
	}
	/**
	 * @param v_Thi_Emp_1 the v_Thi_Emp_1 to set
	 */
	public void setV_Thi_Emp_1(String v_Thi_Emp_1) {
		this.v_Thi_Emp_1 = v_Thi_Emp_1;
	}
	/**
	 * @return the v_Thi_Emp_2
	 */
	public String getV_Thi_Emp_2() {
		return v_Thi_Emp_2;
	}
	/**
	 * @param v_Thi_Emp_2 the v_Thi_Emp_2 to set
	 */
	public void setV_Thi_Emp_2(String v_Thi_Emp_2) {
		this.v_Thi_Emp_2 = v_Thi_Emp_2;
	}
	/**
	 * @return the v_Thi_Emp_3
	 */
	public String getV_Thi_Emp_3() {
		return v_Thi_Emp_3;
	}
	/**
	 * @param v_Thi_Emp_3 the v_Thi_Emp_3 to set
	 */
	public void setV_Thi_Emp_3(String v_Thi_Emp_3) {
		this.v_Thi_Emp_3 = v_Thi_Emp_3;
	}
	/**
	 * @return the v_Thi_Emp_4
	 */
	public String getV_Thi_Emp_4() {
		return v_Thi_Emp_4;
	}
	/**
	 * @param v_Thi_Emp_4 the v_Thi_Emp_4 to set
	 */
	public void setV_Thi_Emp_4(String v_Thi_Emp_4) {
		this.v_Thi_Emp_4 = v_Thi_Emp_4;
	}
	/**
	 * @return the v_Thi_Min_Barrel
	 */
	public String getV_Thi_Min_Barrel() {
		return v_Thi_Min_Barrel;
	}
	/**
	 * @param v_Thi_Min_Barrel the v_Thi_Min_Barrel to set
	 */
	public void setV_Thi_Min_Barrel(String v_Thi_Min_Barrel) {
		this.v_Thi_Min_Barrel = v_Thi_Min_Barrel;
	}
	/**
	 * @return the v_Thi_Min_Seal
	 */
	public String getV_Thi_Min_Seal() {
		return v_Thi_Min_Seal;
	}
	/**
	 * @param v_Thi_Min_Seal the v_Thi_Min_Seal to set
	 */
	public void setV_Thi_Min_Seal(String v_Thi_Min_Seal) {
		this.v_Thi_Min_Seal = v_Thi_Min_Seal;
	}
	/**
	 * @return the v_Thi_Min_Emp_1
	 */
	public String getV_Thi_Min_Emp_1() {
		return v_Thi_Min_Emp_1;
	}
	/**
	 * @param v_Thi_Min_Emp_1 the v_Thi_Min_Emp_1 to set
	 */
	public void setV_Thi_Min_Emp_1(String v_Thi_Min_Emp_1) {
		this.v_Thi_Min_Emp_1 = v_Thi_Min_Emp_1;
	}
	/**
	 * @return the v_Thi_Min_Emp_2
	 */
	public String getV_Thi_Min_Emp_2() {
		return v_Thi_Min_Emp_2;
	}
	/**
	 * @param v_Thi_Min_Emp_2 the v_Thi_Min_Emp_2 to set
	 */
	public void setV_Thi_Min_Emp_2(String v_Thi_Min_Emp_2) {
		this.v_Thi_Min_Emp_2 = v_Thi_Min_Emp_2;
	}
	/**
	 * @return the v_Thi_Min_Emp_3
	 */
	public String getV_Thi_Min_Emp_3() {
		return v_Thi_Min_Emp_3;
	}
	/**
	 * @param v_Thi_Min_Emp_3 the v_Thi_Min_Emp_3 to set
	 */
	public void setV_Thi_Min_Emp_3(String v_Thi_Min_Emp_3) {
		this.v_Thi_Min_Emp_3 = v_Thi_Min_Emp_3;
	}
	/**
	 * @return the v_Thi_Min_Emp_4
	 */
	public String getV_Thi_Min_Emp_4() {
		return v_Thi_Min_Emp_4;
	}
	/**
	 * @param v_Thi_Min_Emp_4 the v_Thi_Min_Emp_4 to set
	 */
	public void setV_Thi_Min_Emp_4(String v_Thi_Min_Emp_4) {
		this.v_Thi_Min_Emp_4 = v_Thi_Min_Emp_4;
	}
	/**
	 * @return the v_Thi_Surface
	 */
	public String getV_Thi_Surface() {
		return v_Thi_Surface;
	}
	/**
	 * @param v_Thi_Surface the v_Thi_Surface to set
	 */
	public void setV_Thi_Surface(String v_Thi_Surface) {
		this.v_Thi_Surface = v_Thi_Surface;
	}
	/**
	 * @return the v_Thi_Num
	 */
	public String getV_Thi_Num() {
		return v_Thi_Num;
	}
	/**
	 * @param v_Thi_Num the v_Thi_Num to set
	 */
	public void setV_Thi_Num(String v_Thi_Num) {
		this.v_Thi_Num = v_Thi_Num;
	}
	
	
	/**
	 * @return the v_Thi_Value
	 */
	@Column(length=5500)
	public String getV_Thi_Value() {
		return v_Thi_Value;
	}
	/**
	 * @param v_Thi_Value the v_Thi_Value to set
	 */
	public void setV_Thi_Value(String v_Thi_Value) {
		this.v_Thi_Value = v_Thi_Value;
	}
	/**
	 * @return the v_Thi_Result
	 */
	public String getV_Thi_Result() {
		return v_Thi_Result;
	}
	/**
	 * @param v_Thi_Result the v_Thi_Result to set
	 */
	public void setV_Thi_Result(String v_Thi_Result) {
		this.v_Thi_Result = v_Thi_Result;
	}
	/**
	 * @return the v_Thi_Test_Date
	 */
	public String getV_Thi_Test_Date() {
		return v_Thi_Test_Date;
	}
	/**
	 * @param v_Thi_Test_Date the v_Thi_Test_Date to set
	 */
	public void setV_Thi_Test_Date(String v_Thi_Test_Date) {
		this.v_Thi_Test_Date = v_Thi_Test_Date;
	}
	/**
	 * @return the v_Thi_Proo_Date
	 */
	public String getV_Thi_Proo_Date() {
		return v_Thi_Proo_Date;
	}
	/**
	 * @param v_Thi_Proo_Date the v_Thi_Proo_Date to set
	 */
	public void setV_Thi_Proo_Date(String v_Thi_Proo_Date) {
		this.v_Thi_Proo_Date = v_Thi_Proo_Date;
	}
	
	

}
