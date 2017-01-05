package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselGlassSteelLinerTest")
public class VesselGlassSteelLinerTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_GlaSL_Result1;//铭牌和标志检验
	private String v_GlaSL_Result2;//衬里表面检验
	private String v_GlaSL_Result3;//衬里鼓包、与基体分离情况检验
	private String v_GlaSL_Result4;//连接部位检验
	private String v_GlaSL_Result5;//附件防腐层检验
	private String v_GlaSL_Result6;//玻璃钢层厚度测定
	private String v_GlaSL_Remark1;//
	private String v_GlaSL_Remark2;//
	private String v_GlaSL_Remark3;//
	private String v_GlaSL_Remark4;//
	private String v_GlaSL_Remark5;//
	private String v_GlaSL_Remark6;//
	private String v_GlaSL_Explain;
	private String v_GlaSL_Date;//检测
	private String v_GlaSL_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselGlassSteelLinerTest")
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
	 * @return the v_GlaSL_Result1
	 */
	public String getV_GlaSL_Result1() {
		return v_GlaSL_Result1;
	}
	/**
	 * @param v_GlaSL_Result1 the v_GlaSL_Result1 to set
	 */
	public void setV_GlaSL_Result1(String v_GlaSL_Result1) {
		this.v_GlaSL_Result1 = v_GlaSL_Result1;
	}
	/**
	 * @return the v_GlaSL_Result2
	 */
	public String getV_GlaSL_Result2() {
		return v_GlaSL_Result2;
	}
	/**
	 * @param v_GlaSL_Result2 the v_GlaSL_Result2 to set
	 */
	public void setV_GlaSL_Result2(String v_GlaSL_Result2) {
		this.v_GlaSL_Result2 = v_GlaSL_Result2;
	}
	/**
	 * @return the v_GlaSL_Result3
	 */
	public String getV_GlaSL_Result3() {
		return v_GlaSL_Result3;
	}
	/**
	 * @param v_GlaSL_Result3 the v_GlaSL_Result3 to set
	 */
	public void setV_GlaSL_Result3(String v_GlaSL_Result3) {
		this.v_GlaSL_Result3 = v_GlaSL_Result3;
	}
	/**
	 * @return the v_GlaSL_Result4
	 */
	public String getV_GlaSL_Result4() {
		return v_GlaSL_Result4;
	}
	/**
	 * @param v_GlaSL_Result4 the v_GlaSL_Result4 to set
	 */
	public void setV_GlaSL_Result4(String v_GlaSL_Result4) {
		this.v_GlaSL_Result4 = v_GlaSL_Result4;
	}
	/**
	 * @return the v_GlaSL_Result5
	 */
	public String getV_GlaSL_Result5() {
		return v_GlaSL_Result5;
	}
	/**
	 * @param v_GlaSL_Result5 the v_GlaSL_Result5 to set
	 */
	public void setV_GlaSL_Result5(String v_GlaSL_Result5) {
		this.v_GlaSL_Result5 = v_GlaSL_Result5;
	}
	/**
	 * @return the v_GlaSL_Result6
	 */
	public String getV_GlaSL_Result6() {
		return v_GlaSL_Result6;
	}
	/**
	 * @param v_GlaSL_Result6 the v_GlaSL_Result6 to set
	 */
	public void setV_GlaSL_Result6(String v_GlaSL_Result6) {
		this.v_GlaSL_Result6 = v_GlaSL_Result6;
	}
	/**
	 * @return the v_GlaSL_Remark1
	 */
	public String getV_GlaSL_Remark1() {
		return v_GlaSL_Remark1;
	}
	/**
	 * @param v_GlaSL_Remark1 the v_GlaSL_Remark1 to set
	 */
	public void setV_GlaSL_Remark1(String v_GlaSL_Remark1) {
		this.v_GlaSL_Remark1 = v_GlaSL_Remark1;
	}
	/**
	 * @return the v_GlaSL_Remark2
	 */
	public String getV_GlaSL_Remark2() {
		return v_GlaSL_Remark2;
	}
	/**
	 * @param v_GlaSL_Remark2 the v_GlaSL_Remark2 to set
	 */
	public void setV_GlaSL_Remark2(String v_GlaSL_Remark2) {
		this.v_GlaSL_Remark2 = v_GlaSL_Remark2;
	}
	/**
	 * @return the v_GlaSL_Remark3
	 */
	public String getV_GlaSL_Remark3() {
		return v_GlaSL_Remark3;
	}
	/**
	 * @param v_GlaSL_Remark3 the v_GlaSL_Remark3 to set
	 */
	public void setV_GlaSL_Remark3(String v_GlaSL_Remark3) {
		this.v_GlaSL_Remark3 = v_GlaSL_Remark3;
	}
	/**
	 * @return the v_GlaSL_Remark4
	 */
	public String getV_GlaSL_Remark4() {
		return v_GlaSL_Remark4;
	}
	/**
	 * @param v_GlaSL_Remark4 the v_GlaSL_Remark4 to set
	 */
	public void setV_GlaSL_Remark4(String v_GlaSL_Remark4) {
		this.v_GlaSL_Remark4 = v_GlaSL_Remark4;
	}
	/**
	 * @return the v_GlaSL_Remark5
	 */
	public String getV_GlaSL_Remark5() {
		return v_GlaSL_Remark5;
	}
	/**
	 * @param v_GlaSL_Remark5 the v_GlaSL_Remark5 to set
	 */
	public void setV_GlaSL_Remark5(String v_GlaSL_Remark5) {
		this.v_GlaSL_Remark5 = v_GlaSL_Remark5;
	}
	/**
	 * @return the v_GlaSL_Remark6
	 */
	public String getV_GlaSL_Remark6() {
		return v_GlaSL_Remark6;
	}
	/**
	 * @param v_GlaSL_Remark6 the v_GlaSL_Remark6 to set
	 */
	public void setV_GlaSL_Remark6(String v_GlaSL_Remark6) {
		this.v_GlaSL_Remark6 = v_GlaSL_Remark6;
	}
	/**
	 * @return the v_GlaSL_Explain
	 */
	public String getV_GlaSL_Explain() {
		return v_GlaSL_Explain;
	}
	/**
	 * @param v_GlaSL_Explain the v_GlaSL_Explain to set
	 */
	public void setV_GlaSL_Explain(String v_GlaSL_Explain) {
		this.v_GlaSL_Explain = v_GlaSL_Explain;
	}
	/**
	 * @return the v_GlaSL_Date
	 */
	public String getV_GlaSL_Date() {
		return v_GlaSL_Date;
	}
	/**
	 * @param v_GlaSL_Date the v_GlaSL_Date to set
	 */
	public void setV_GlaSL_Date(String v_GlaSL_Date) {
		this.v_GlaSL_Date = v_GlaSL_Date;
	}
	/**
	 * @return the v_GlaSL_Check_Date
	 */
	public String getV_GlaSL_Check_Date() {
		return v_GlaSL_Check_Date;
	}
	/**
	 * @param v_GlaSL_Check_Date the v_GlaSL_Check_Date to set
	 */
	public void setV_GlaSL_Check_Date(String v_GlaSL_Check_Date) {
		this.v_GlaSL_Check_Date = v_GlaSL_Check_Date;
	}

	
	
	
}
