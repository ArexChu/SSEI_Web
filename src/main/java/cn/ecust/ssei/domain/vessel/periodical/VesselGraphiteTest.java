package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselGraphiteTest")
public class VesselGraphiteTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Grap_Result1;//铭牌和标志检验
	private String v_Grap_Result2;//容器筒体、侧盖板、上下盖板变形与腐蚀
	private String v_Grap_Result3;//石墨件表面腐蚀、磨损、分层、掉块、裂纹
	private String v_Grap_Result4;//石墨件粘接部位的粘接剂，粘接部位腐蚀、开裂和渗漏	
	private String v_Grap_Result5;//法兰密封面检验
	private String v_Grap_Result6;//附件检验（阀门、压力表、液面计、温度计、防腐层）
	private String v_Grap_Remark1;//
	private String v_Grap_Remark2;//
	private String v_Grap_Remark3;//
	private String v_Grap_Remark4;//
	private String v_Grap_Remark5;//
	private String v_Grap_Remark6;//
	private String v_Grap_Explain;
	private String v_Grap_Date;//检测
	private String v_Grap_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselGraphiteTest")
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
	 * @return the v_Grap_Result1
	 */
	public String getV_Grap_Result1() {
		return v_Grap_Result1;
	}
	/**
	 * @param v_Grap_Result1 the v_Grap_Result1 to set
	 */
	public void setV_Grap_Result1(String v_Grap_Result1) {
		this.v_Grap_Result1 = v_Grap_Result1;
	}
	/**
	 * @return the v_Grap_Result2
	 */
	public String getV_Grap_Result2() {
		return v_Grap_Result2;
	}
	/**
	 * @param v_Grap_Result2 the v_Grap_Result2 to set
	 */
	public void setV_Grap_Result2(String v_Grap_Result2) {
		this.v_Grap_Result2 = v_Grap_Result2;
	}
	/**
	 * @return the v_Grap_Result3
	 */
	public String getV_Grap_Result3() {
		return v_Grap_Result3;
	}
	/**
	 * @param v_Grap_Result3 the v_Grap_Result3 to set
	 */
	public void setV_Grap_Result3(String v_Grap_Result3) {
		this.v_Grap_Result3 = v_Grap_Result3;
	}
	/**
	 * @return the v_Grap_Result4
	 */
	public String getV_Grap_Result4() {
		return v_Grap_Result4;
	}
	/**
	 * @param v_Grap_Result4 the v_Grap_Result4 to set
	 */
	public void setV_Grap_Result4(String v_Grap_Result4) {
		this.v_Grap_Result4 = v_Grap_Result4;
	}
	/**
	 * @return the v_Grap_Result5
	 */
	public String getV_Grap_Result5() {
		return v_Grap_Result5;
	}
	/**
	 * @param v_Grap_Result5 the v_Grap_Result5 to set
	 */
	public void setV_Grap_Result5(String v_Grap_Result5) {
		this.v_Grap_Result5 = v_Grap_Result5;
	}
	/**
	 * @return the v_Grap_Result6
	 */
	public String getV_Grap_Result6() {
		return v_Grap_Result6;
	}
	/**
	 * @param v_Grap_Result6 the v_Grap_Result6 to set
	 */
	public void setV_Grap_Result6(String v_Grap_Result6) {
		this.v_Grap_Result6 = v_Grap_Result6;
	}
	/**
	 * @return the v_Grap_Remark1
	 */
	public String getV_Grap_Remark1() {
		return v_Grap_Remark1;
	}
	/**
	 * @param v_Grap_Remark1 the v_Grap_Remark1 to set
	 */
	public void setV_Grap_Remark1(String v_Grap_Remark1) {
		this.v_Grap_Remark1 = v_Grap_Remark1;
	}
	/**
	 * @return the v_Grap_Remark2
	 */
	public String getV_Grap_Remark2() {
		return v_Grap_Remark2;
	}
	/**
	 * @param v_Grap_Remark2 the v_Grap_Remark2 to set
	 */
	public void setV_Grap_Remark2(String v_Grap_Remark2) {
		this.v_Grap_Remark2 = v_Grap_Remark2;
	}
	/**
	 * @return the v_Grap_Remark3
	 */
	public String getV_Grap_Remark3() {
		return v_Grap_Remark3;
	}
	/**
	 * @param v_Grap_Remark3 the v_Grap_Remark3 to set
	 */
	public void setV_Grap_Remark3(String v_Grap_Remark3) {
		this.v_Grap_Remark3 = v_Grap_Remark3;
	}
	/**
	 * @return the v_Grap_Remark4
	 */
	public String getV_Grap_Remark4() {
		return v_Grap_Remark4;
	}
	/**
	 * @param v_Grap_Remark4 the v_Grap_Remark4 to set
	 */
	public void setV_Grap_Remark4(String v_Grap_Remark4) {
		this.v_Grap_Remark4 = v_Grap_Remark4;
	}
	/**
	 * @return the v_Grap_Remark5
	 */
	public String getV_Grap_Remark5() {
		return v_Grap_Remark5;
	}
	/**
	 * @param v_Grap_Remark5 the v_Grap_Remark5 to set
	 */
	public void setV_Grap_Remark5(String v_Grap_Remark5) {
		this.v_Grap_Remark5 = v_Grap_Remark5;
	}
	/**
	 * @return the v_Grap_Remark6
	 */
	public String getV_Grap_Remark6() {
		return v_Grap_Remark6;
	}
	/**
	 * @param v_Grap_Remark6 the v_Grap_Remark6 to set
	 */
	public void setV_Grap_Remark6(String v_Grap_Remark6) {
		this.v_Grap_Remark6 = v_Grap_Remark6;
	}
	/**
	 * @return the v_Grap_Explain
	 */
	public String getV_Grap_Explain() {
		return v_Grap_Explain;
	}
	/**
	 * @param v_Grap_Explain the v_Grap_Explain to set
	 */
	public void setV_Grap_Explain(String v_Grap_Explain) {
		this.v_Grap_Explain = v_Grap_Explain;
	}
	/**
	 * @return the v_Grap_Date
	 */
	public String getV_Grap_Date() {
		return v_Grap_Date;
	}
	/**
	 * @param v_Grap_Date the v_Grap_Date to set
	 */
	public void setV_Grap_Date(String v_Grap_Date) {
		this.v_Grap_Date = v_Grap_Date;
	}
	/**
	 * @return the v_Grap_Check_Date
	 */
	public String getV_Grap_Check_Date() {
		return v_Grap_Check_Date;
	}
	/**
	 * @param v_Grap_Check_Date the v_Grap_Check_Date to set
	 */
	public void setV_Grap_Check_Date(String v_Grap_Check_Date) {
		this.v_Grap_Check_Date = v_Grap_Check_Date;
	}
	

}
