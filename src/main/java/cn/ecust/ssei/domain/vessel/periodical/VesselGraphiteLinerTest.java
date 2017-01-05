package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselGraphiteLinerTest")
public class VesselGraphiteLinerTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_GraL_Result1;//铭牌和标志检验
	private String v_GraL_Result2;//外表面检验
	private String v_GraL_Result3;//法兰密封面检验
	private String v_GraL_Result4;//附件检验（阀门、压力表、液面计、温度计、防腐层
	private String v_GraL_Remark1;//
	private String v_GraL_Remark2;//
	private String v_GraL_Remark3;//
	private String v_GraL_Remark4;//
	private String v_GraL_Explain;
	private String v_GraL_Date;//检测
	private String v_GraL_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselGraphiteLinerTest")
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
	 * @return the v_GraL_Result1
	 */
	public String getV_GraL_Result1() {
		return v_GraL_Result1;
	}
	/**
	 * @param v_GraL_Result1 the v_GraL_Result1 to set
	 */
	public void setV_GraL_Result1(String v_GraL_Result1) {
		this.v_GraL_Result1 = v_GraL_Result1;
	}
	/**
	 * @return the v_GraL_Result2
	 */
	public String getV_GraL_Result2() {
		return v_GraL_Result2;
	}
	/**
	 * @param v_GraL_Result2 the v_GraL_Result2 to set
	 */
	public void setV_GraL_Result2(String v_GraL_Result2) {
		this.v_GraL_Result2 = v_GraL_Result2;
	}
	/**
	 * @return the v_GraL_Result3
	 */
	public String getV_GraL_Result3() {
		return v_GraL_Result3;
	}
	/**
	 * @param v_GraL_Result3 the v_GraL_Result3 to set
	 */
	public void setV_GraL_Result3(String v_GraL_Result3) {
		this.v_GraL_Result3 = v_GraL_Result3;
	}
	/**
	 * @return the v_GraL_Result4
	 */
	public String getV_GraL_Result4() {
		return v_GraL_Result4;
	}
	/**
	 * @param v_GraL_Result4 the v_GraL_Result4 to set
	 */
	public void setV_GraL_Result4(String v_GraL_Result4) {
		this.v_GraL_Result4 = v_GraL_Result4;
	}
	
	/**
	 * @return the v_GraL_Remark1
	 */
	public String getV_GraL_Remark1() {
		return v_GraL_Remark1;
	}
	/**
	 * @param v_GraL_Remark1 the v_GraL_Remark1 to set
	 */
	public void setV_GraL_Remark1(String v_GraL_Remark1) {
		this.v_GraL_Remark1 = v_GraL_Remark1;
	}
	/**
	 * @return the v_GraL_Remark2
	 */
	public String getV_GraL_Remark2() {
		return v_GraL_Remark2;
	}
	/**
	 * @param v_GraL_Remark2 the v_GraL_Remark2 to set
	 */
	public void setV_GraL_Remark2(String v_GraL_Remark2) {
		this.v_GraL_Remark2 = v_GraL_Remark2;
	}
	/**
	 * @return the v_GraL_Remark3
	 */
	public String getV_GraL_Remark3() {
		return v_GraL_Remark3;
	}
	/**
	 * @param v_GraL_Remark3 the v_GraL_Remark3 to set
	 */
	public void setV_GraL_Remark3(String v_GraL_Remark3) {
		this.v_GraL_Remark3 = v_GraL_Remark3;
	}
	/**
	 * @return the v_GraL_Remark4
	 */
	public String getV_GraL_Remark4() {
		return v_GraL_Remark4;
	}
	/**
	 * @param v_GraL_Remark4 the v_GraL_Remark4 to set
	 */
	public void setV_GraL_Remark4(String v_GraL_Remark4) {
		this.v_GraL_Remark4 = v_GraL_Remark4;
	}
	
	/**
	 * @return the v_GraL_Explain
	 */
	public String getV_GraL_Explain() {
		return v_GraL_Explain;
	}
	/**
	 * @param v_GraL_Explain the v_GraL_Explain to set
	 */
	public void setV_GraL_Explain(String v_GraL_Explain) {
		this.v_GraL_Explain = v_GraL_Explain;
	}
	/**
	 * @return the v_GraL_Date
	 */
	public String getV_GraL_Date() {
		return v_GraL_Date;
	}
	/**
	 * @param v_GraL_Date the v_GraL_Date to set
	 */
	public void setV_GraL_Date(String v_GraL_Date) {
		this.v_GraL_Date = v_GraL_Date;
	}
	/**
	 * @return the v_GraL_Check_Date
	 */
	public String getV_GraL_Check_Date() {
		return v_GraL_Check_Date;
	}
	/**
	 * @param v_GraL_Check_Date the v_GraL_Check_Date to set
	 */
	public void setV_GraL_Check_Date(String v_GraL_Check_Date) {
		this.v_GraL_Check_Date = v_GraL_Check_Date;
	}
	
	
	
}
