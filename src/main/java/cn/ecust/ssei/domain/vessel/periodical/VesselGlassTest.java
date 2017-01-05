package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselGlassTest")
public class VesselGlassTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Gla_Result1;//铭牌和标志检验
	private String v_Gla_Result2;//表面检验
	private String v_Gla_Result3;//直流高电压试验10kV
	private String v_Gla_Result4;//厚度测定
	private String v_Gla_Result5;///卡子、活套法兰、压力表、液面计、温度计
	private String v_Gla_Result6;//密封面、密封垫片、结构层
	private String v_Gla_Result7;//放料阀、孔板防腐层
	private String v_Gla_Result8;//夹套介质进口管口挡板检验
	private String v_Gla_Result9;//搪玻璃层修复部位检验
	private String v_Gla_Remark1;
	private String v_Gla_Remark2;
	private String v_Gla_Remark3;
	private String v_Gla_Remark4;
	private String v_Gla_Remark5;
	private String v_Gla_Remark6;
	private String v_Gla_Remark7;
	private String v_Gla_Remark8;
	private String v_Gla_Remark9;
	private String v_Gla_Explain;
	private String v_Gla_Date;//检测
	private String v_Gla_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselGlassTest")
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
	 * @return the v_Gla_Result1
	 */
	public String getV_Gla_Result1() {
		return v_Gla_Result1;
	}
	/**
	 * @param v_Gla_Result1 the v_Gla_Result1 to set
	 */
	public void setV_Gla_Result1(String v_Gla_Result1) {
		this.v_Gla_Result1 = v_Gla_Result1;
	}
	/**
	 * @return the v_Gla_Result2
	 */
	public String getV_Gla_Result2() {
		return v_Gla_Result2;
	}
	/**
	 * @param v_Gla_Result2 the v_Gla_Result2 to set
	 */
	public void setV_Gla_Result2(String v_Gla_Result2) {
		this.v_Gla_Result2 = v_Gla_Result2;
	}
	/**
	 * @return the v_Gla_Result3
	 */
	public String getV_Gla_Result3() {
		return v_Gla_Result3;
	}
	/**
	 * @param v_Gla_Result3 the v_Gla_Result3 to set
	 */
	public void setV_Gla_Result3(String v_Gla_Result3) {
		this.v_Gla_Result3 = v_Gla_Result3;
	}
	/**
	 * @return the v_Gla_Result4
	 */
	public String getV_Gla_Result4() {
		return v_Gla_Result4;
	}
	/**
	 * @param v_Gla_Result4 the v_Gla_Result4 to set
	 */
	public void setV_Gla_Result4(String v_Gla_Result4) {
		this.v_Gla_Result4 = v_Gla_Result4;
	}
	/**
	 * @return the v_Gla_Result5
	 */
	public String getV_Gla_Result5() {
		return v_Gla_Result5;
	}
	/**
	 * @param v_Gla_Result5 the v_Gla_Result5 to set
	 */
	public void setV_Gla_Result5(String v_Gla_Result5) {
		this.v_Gla_Result5 = v_Gla_Result5;
	}
	/**
	 * @return the v_Gla_Result6
	 */
	public String getV_Gla_Result6() {
		return v_Gla_Result6;
	}
	/**
	 * @param v_Gla_Result6 the v_Gla_Result6 to set
	 */
	public void setV_Gla_Result6(String v_Gla_Result6) {
		this.v_Gla_Result6 = v_Gla_Result6;
	}
	/**
	 * @return the v_Gla_Result7
	 */
	public String getV_Gla_Result7() {
		return v_Gla_Result7;
	}
	/**
	 * @param v_Gla_Result7 the v_Gla_Result7 to set
	 */
	public void setV_Gla_Result7(String v_Gla_Result7) {
		this.v_Gla_Result7 = v_Gla_Result7;
	}
	/**
	 * @return the v_Gla_Result8
	 */
	public String getV_Gla_Result8() {
		return v_Gla_Result8;
	}
	/**
	 * @param v_Gla_Result8 the v_Gla_Result8 to set
	 */
	public void setV_Gla_Result8(String v_Gla_Result8) {
		this.v_Gla_Result8 = v_Gla_Result8;
	}
	/**
	 * @return the v_Gla_Result9
	 */
	public String getV_Gla_Result9() {
		return v_Gla_Result9;
	}
	/**
	 * @param v_Gla_Result9 the v_Gla_Result9 to set
	 */
	public void setV_Gla_Result9(String v_Gla_Result9) {
		this.v_Gla_Result9 = v_Gla_Result9;
	}
	/**
	 * @return the v_Gla_Remark1
	 */
	public String getV_Gla_Remark1() {
		return v_Gla_Remark1;
	}
	/**
	 * @param v_Gla_Remark1 the v_Gla_Remark1 to set
	 */
	public void setV_Gla_Remark1(String v_Gla_Remark1) {
		this.v_Gla_Remark1 = v_Gla_Remark1;
	}
	/**
	 * @return the v_Gla_Remark2
	 */
	public String getV_Gla_Remark2() {
		return v_Gla_Remark2;
	}
	/**
	 * @param v_Gla_Remark2 the v_Gla_Remark2 to set
	 */
	public void setV_Gla_Remark2(String v_Gla_Remark2) {
		this.v_Gla_Remark2 = v_Gla_Remark2;
	}
	/**
	 * @return the v_Gla_Remark3
	 */
	public String getV_Gla_Remark3() {
		return v_Gla_Remark3;
	}
	/**
	 * @param v_Gla_Remark3 the v_Gla_Remark3 to set
	 */
	public void setV_Gla_Remark3(String v_Gla_Remark3) {
		this.v_Gla_Remark3 = v_Gla_Remark3;
	}
	/**
	 * @return the v_Gla_Remark4
	 */
	public String getV_Gla_Remark4() {
		return v_Gla_Remark4;
	}
	/**
	 * @param v_Gla_Remark4 the v_Gla_Remark4 to set
	 */
	public void setV_Gla_Remark4(String v_Gla_Remark4) {
		this.v_Gla_Remark4 = v_Gla_Remark4;
	}
	/**
	 * @return the v_Gla_Remark5
	 */
	public String getV_Gla_Remark5() {
		return v_Gla_Remark5;
	}
	/**
	 * @param v_Gla_Remark5 the v_Gla_Remark5 to set
	 */
	public void setV_Gla_Remark5(String v_Gla_Remark5) {
		this.v_Gla_Remark5 = v_Gla_Remark5;
	}
	/**
	 * @return the v_Gla_Remark6
	 */
	public String getV_Gla_Remark6() {
		return v_Gla_Remark6;
	}
	/**
	 * @param v_Gla_Remark6 the v_Gla_Remark6 to set
	 */
	public void setV_Gla_Remark6(String v_Gla_Remark6) {
		this.v_Gla_Remark6 = v_Gla_Remark6;
	}
	/**
	 * @return the v_Gla_Remark7
	 */
	public String getV_Gla_Remark7() {
		return v_Gla_Remark7;
	}
	/**
	 * @param v_Gla_Remark7 the v_Gla_Remark7 to set
	 */
	public void setV_Gla_Remark7(String v_Gla_Remark7) {
		this.v_Gla_Remark7 = v_Gla_Remark7;
	}
	/**
	 * @return the v_Gla_Remark8
	 */
	public String getV_Gla_Remark8() {
		return v_Gla_Remark8;
	}
	/**
	 * @param v_Gla_Remark8 the v_Gla_Remark8 to set
	 */
	public void setV_Gla_Remark8(String v_Gla_Remark8) {
		this.v_Gla_Remark8 = v_Gla_Remark8;
	}
	/**
	 * @return the v_Gla_Remark9
	 */
	public String getV_Gla_Remark9() {
		return v_Gla_Remark9;
	}
	/**
	 * @param v_Gla_Remark9 the v_Gla_Remark9 to set
	 */
	public void setV_Gla_Remark9(String v_Gla_Remark9) {
		this.v_Gla_Remark9 = v_Gla_Remark9;
	}
	/**
	 * @return the v_Gla_Explain
	 */
	public String getV_Gla_Explain() {
		return v_Gla_Explain;
	}
	/**
	 * @param v_Gla_Explain the v_Gla_Explain to set
	 */
	public void setV_Gla_Explain(String v_Gla_Explain) {
		this.v_Gla_Explain = v_Gla_Explain;
	}
	/**
	 * @return the v_Gla_Date
	 */
	public String getV_Gla_Date() {
		return v_Gla_Date;
	}
	/**
	 * @param v_Gla_Date the v_Gla_Date to set
	 */
	public void setV_Gla_Date(String v_Gla_Date) {
		this.v_Gla_Date = v_Gla_Date;
	}
	/**
	 * @return the v_Gla_Check_Date
	 */
	public String getV_Gla_Check_Date() {
		return v_Gla_Check_Date;
	}
	/**
	 * @param v_Gla_Check_Date the v_Gla_Check_Date to set
	 */
	public void setV_Gla_Check_Date(String v_Gla_Check_Date) {
		this.v_Gla_Check_Date = v_Gla_Check_Date;
	}
	

}
