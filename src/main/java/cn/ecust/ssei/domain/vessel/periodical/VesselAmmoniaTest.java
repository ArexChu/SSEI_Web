package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselAmmoniaTest")
public class VesselAmmoniaTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Amm_De_Pre;//试验压力
	private String v_Amm_Level;//氨浓度
	private String v_Amm_Range;//压力表量程
	private String v_Amm_Acc;//精度
	private String v_Amm_Tem;//环境温度
	private String v_Amm_Test;//试纸（试剂）
	private String v_Amm_Keep_Tem;//保压时间
	private String v_Amm_Part;//试验部位
	private String v_Amm_Result;//试验结果
	private String v_Amm_Date;//检测
	private String v_Amm_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselAmmoniaTest")
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
	 * @return the v_Amm_De_Pre
	 */
	public String getV_Amm_De_Pre() {
		return v_Amm_De_Pre;
	}
	/**
	 * @param v_Amm_De_Pre the v_Amm_De_Pre to set
	 */
	public void setV_Amm_De_Pre(String v_Amm_De_Pre) {
		this.v_Amm_De_Pre = v_Amm_De_Pre;
	}
	/**
	 * @return the v_Amm_Level
	 */
	public String getV_Amm_Level() {
		return v_Amm_Level;
	}
	/**
	 * @param v_Amm_Level the v_Amm_Level to set
	 */
	public void setV_Amm_Level(String v_Amm_Level) {
		this.v_Amm_Level = v_Amm_Level;
	}
	/**
	 * @return the v_Amm_Range
	 */
	public String getV_Amm_Range() {
		return v_Amm_Range;
	}
	/**
	 * @param v_Amm_Range the v_Amm_Range to set
	 */
	public void setV_Amm_Range(String v_Amm_Range) {
		this.v_Amm_Range = v_Amm_Range;
	}
	/**
	 * @return the v_Amm_Acc
	 */
	public String getV_Amm_Acc() {
		return v_Amm_Acc;
	}
	/**
	 * @param v_Amm_Acc the v_Amm_Acc to set
	 */
	public void setV_Amm_Acc(String v_Amm_Acc) {
		this.v_Amm_Acc = v_Amm_Acc;
	}
	/**
	 * @return the v_Amm_Tem
	 */
	public String getV_Amm_Tem() {
		return v_Amm_Tem;
	}
	/**
	 * @param v_Amm_Tem the v_Amm_Tem to set
	 */
	public void setV_Amm_Tem(String v_Amm_Tem) {
		this.v_Amm_Tem = v_Amm_Tem;
	}
	/**
	 * @return the v_Amm_Test
	 */
	public String getV_Amm_Test() {
		return v_Amm_Test;
	}
	/**
	 * @param v_Amm_Test the v_Amm_Test to set
	 */
	public void setV_Amm_Test(String v_Amm_Test) {
		this.v_Amm_Test = v_Amm_Test;
	}
	/**
	 * @return the v_Amm_Keep_Tem
	 */
	public String getV_Amm_Keep_Tem() {
		return v_Amm_Keep_Tem;
	}
	/**
	 * @param v_Amm_Keep_Tem the v_Amm_Keep_Tem to set
	 */
	public void setV_Amm_Keep_Tem(String v_Amm_Keep_Tem) {
		this.v_Amm_Keep_Tem = v_Amm_Keep_Tem;
	}
	/**
	 * @return the v_Amm_Part
	 */
	public String getV_Amm_Part() {
		return v_Amm_Part;
	}
	/**
	 * @param v_Amm_Part the v_Amm_Part to set
	 */
	public void setV_Amm_Part(String v_Amm_Part) {
		this.v_Amm_Part = v_Amm_Part;
	}
	/**
	 * @return the v_Amm_Result
	 */
	public String getV_Amm_Result() {
		return v_Amm_Result;
	}
	/**
	 * @param v_Amm_Result the v_Amm_Result to set
	 */
	public void setV_Amm_Result(String v_Amm_Result) {
		this.v_Amm_Result = v_Amm_Result;
	}
	/**
	 * @return the v_Amm_Date
	 */
	public String getV_Amm_Date() {
		return v_Amm_Date;
	}
	/**
	 * @param v_Amm_Date the v_Amm_Date to set
	 */
	public void setV_Amm_Date(String v_Amm_Date) {
		this.v_Amm_Date = v_Amm_Date;
	}
	/**
	 * @return the v_Amm_Check_Date
	 */
	public String getV_Amm_Check_Date() {
		return v_Amm_Check_Date;
	}
	/**
	 * @param v_Amm_Check_Date the v_Amm_Check_Date to set
	 */
	public void setV_Amm_Check_Date(String v_Amm_Check_Date) {
		this.v_Amm_Check_Date = v_Amm_Check_Date;
	}
	

}
