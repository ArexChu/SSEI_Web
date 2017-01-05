package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselPlasticLinerTest")
public class VesselPlasticLinerTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_PlaL_Result1;//铭牌和标志检验
	private String v_PlaL_Result2;//衬里表面检验
	private String v_PlaL_Result3;//衬里鼓包、与基体分离情况检验
	private String v_PlaL_Result4;//5kV直流高电压检测
	private String v_PlaL_Result5;//衬里厚度测定
	private String v_PlaL_Result6;//焊缝和连接部位检验
	private String v_PlaL_Result7;//附件检验
	private String v_PlaL_Result8;//支承或者支座检验
	private String v_PlaL_Remark1;//
	private String v_PlaL_Remark2;//
	private String v_PlaL_Remark3;//
	private String v_PlaL_Remark4;//
	private String v_PlaL_Remark5;//
	private String v_PlaL_Remark6;//
	private String v_PlaL_Remark7;//
	private String v_PlaL_Remark8;//
	private String v_PlaL_Explain;
	private String v_PlaL_Date;//检测
	private String v_PlaL_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselPlasticLinerTest")
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
	 * @return the v_PlaL_Result1
	 */
	public String getV_PlaL_Result1() {
		return v_PlaL_Result1;
	}
	/**
	 * @param v_PlaL_Result1 the v_PlaL_Result1 to set
	 */
	public void setV_PlaL_Result1(String v_PlaL_Result1) {
		this.v_PlaL_Result1 = v_PlaL_Result1;
	}
	/**
	 * @return the v_PlaL_Result2
	 */
	public String getV_PlaL_Result2() {
		return v_PlaL_Result2;
	}
	/**
	 * @param v_PlaL_Result2 the v_PlaL_Result2 to set
	 */
	public void setV_PlaL_Result2(String v_PlaL_Result2) {
		this.v_PlaL_Result2 = v_PlaL_Result2;
	}
	/**
	 * @return the v_PlaL_Result3
	 */
	public String getV_PlaL_Result3() {
		return v_PlaL_Result3;
	}
	/**
	 * @param v_PlaL_Result3 the v_PlaL_Result3 to set
	 */
	public void setV_PlaL_Result3(String v_PlaL_Result3) {
		this.v_PlaL_Result3 = v_PlaL_Result3;
	}
	/**
	 * @return the v_PlaL_Result4
	 */
	public String getV_PlaL_Result4() {
		return v_PlaL_Result4;
	}
	/**
	 * @param v_PlaL_Result4 the v_PlaL_Result4 to set
	 */
	public void setV_PlaL_Result4(String v_PlaL_Result4) {
		this.v_PlaL_Result4 = v_PlaL_Result4;
	}
	/**
	 * @return the v_PlaL_Result5
	 */
	public String getV_PlaL_Result5() {
		return v_PlaL_Result5;
	}
	/**
	 * @param v_PlaL_Result5 the v_PlaL_Result5 to set
	 */
	public void setV_PlaL_Result5(String v_PlaL_Result5) {
		this.v_PlaL_Result5 = v_PlaL_Result5;
	}
	/**
	 * @return the v_PlaL_Result6
	 */
	public String getV_PlaL_Result6() {
		return v_PlaL_Result6;
	}
	/**
	 * @param v_PlaL_Result6 the v_PlaL_Result6 to set
	 */
	public void setV_PlaL_Result6(String v_PlaL_Result6) {
		this.v_PlaL_Result6 = v_PlaL_Result6;
	}
	/**
	 * @return the v_PlaL_Result7
	 */
	public String getV_PlaL_Result7() {
		return v_PlaL_Result7;
	}
	/**
	 * @param v_PlaL_Result7 the v_PlaL_Result7 to set
	 */
	public void setV_PlaL_Result7(String v_PlaL_Result7) {
		this.v_PlaL_Result7 = v_PlaL_Result7;
	}
	/**
	 * @return the v_PlaL_Result8
	 */
	public String getV_PlaL_Result8() {
		return v_PlaL_Result8;
	}
	/**
	 * @param v_PlaL_Result8 the v_PlaL_Result8 to set
	 */
	public void setV_PlaL_Result8(String v_PlaL_Result8) {
		this.v_PlaL_Result8 = v_PlaL_Result8;
	}
	/**
	 * @return the v_PlaL_Remark1
	 */
	public String getV_PlaL_Remark1() {
		return v_PlaL_Remark1;
	}
	/**
	 * @param v_PlaL_Remark1 the v_PlaL_Remark1 to set
	 */
	public void setV_PlaL_Remark1(String v_PlaL_Remark1) {
		this.v_PlaL_Remark1 = v_PlaL_Remark1;
	}
	/**
	 * @return the v_PlaL_Remark2
	 */
	public String getV_PlaL_Remark2() {
		return v_PlaL_Remark2;
	}
	/**
	 * @param v_PlaL_Remark2 the v_PlaL_Remark2 to set
	 */
	public void setV_PlaL_Remark2(String v_PlaL_Remark2) {
		this.v_PlaL_Remark2 = v_PlaL_Remark2;
	}
	/**
	 * @return the v_PlaL_Remark3
	 */
	public String getV_PlaL_Remark3() {
		return v_PlaL_Remark3;
	}
	/**
	 * @param v_PlaL_Remark3 the v_PlaL_Remark3 to set
	 */
	public void setV_PlaL_Remark3(String v_PlaL_Remark3) {
		this.v_PlaL_Remark3 = v_PlaL_Remark3;
	}
	/**
	 * @return the v_PlaL_Remark4
	 */
	public String getV_PlaL_Remark4() {
		return v_PlaL_Remark4;
	}
	/**
	 * @param v_PlaL_Remark4 the v_PlaL_Remark4 to set
	 */
	public void setV_PlaL_Remark4(String v_PlaL_Remark4) {
		this.v_PlaL_Remark4 = v_PlaL_Remark4;
	}
	/**
	 * @return the v_PlaL_Remark5
	 */
	public String getV_PlaL_Remark5() {
		return v_PlaL_Remark5;
	}
	/**
	 * @param v_PlaL_Remark5 the v_PlaL_Remark5 to set
	 */
	public void setV_PlaL_Remark5(String v_PlaL_Remark5) {
		this.v_PlaL_Remark5 = v_PlaL_Remark5;
	}
	/**
	 * @return the v_PlaL_Remark6
	 */
	public String getV_PlaL_Remark6() {
		return v_PlaL_Remark6;
	}
	/**
	 * @param v_PlaL_Remark6 the v_PlaL_Remark6 to set
	 */
	public void setV_PlaL_Remark6(String v_PlaL_Remark6) {
		this.v_PlaL_Remark6 = v_PlaL_Remark6;
	}
	/**
	 * @return the v_PlaL_Remark7
	 */
	public String getV_PlaL_Remark7() {
		return v_PlaL_Remark7;
	}
	/**
	 * @param v_PlaL_Remark7 the v_PlaL_Remark7 to set
	 */
	public void setV_PlaL_Remark7(String v_PlaL_Remark7) {
		this.v_PlaL_Remark7 = v_PlaL_Remark7;
	}
	/**
	 * @return the v_PlaL_Remark8
	 */
	public String getV_PlaL_Remark8() {
		return v_PlaL_Remark8;
	}
	/**
	 * @param v_PlaL_Remark8 the v_PlaL_Remark8 to set
	 */
	public void setV_PlaL_Remark8(String v_PlaL_Remark8) {
		this.v_PlaL_Remark8 = v_PlaL_Remark8;
	}
	/**
	 * @return the v_PlaL_Explain
	 */
	public String getV_PlaL_Explain() {
		return v_PlaL_Explain;
	}
	/**
	 * @param v_PlaL_Explain the v_PlaL_Explain to set
	 */
	public void setV_PlaL_Explain(String v_PlaL_Explain) {
		this.v_PlaL_Explain = v_PlaL_Explain;
	}
	/**
	 * @return the v_PlaL_Date
	 */
	public String getV_PlaL_Date() {
		return v_PlaL_Date;
	}
	/**
	 * @param v_PlaL_Date the v_PlaL_Date to set
	 */
	public void setV_PlaL_Date(String v_PlaL_Date) {
		this.v_PlaL_Date = v_PlaL_Date;
	}
	/**
	 * @return the v_PlaL_Check_Date
	 */
	public String getV_PlaL_Check_Date() {
		return v_PlaL_Check_Date;
	}
	/**
	 * @param v_PlaL_Check_Date the v_PlaL_Check_Date to set
	 */
	public void setV_PlaL_Check_Date(String v_PlaL_Check_Date) {
		this.v_PlaL_Check_Date = v_PlaL_Check_Date;
	}
	
	
}
