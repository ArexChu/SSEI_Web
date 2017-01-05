package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselPermTest")
public class VesselPermTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Perm_JFC;//渗透剂型号
	private String v_Perm_Surface;//表面状况
	private String v_Perm_Clean;//清洗剂型号
	private String v_Perm_Tem;//环境温度
	private String v_Perm_Image;//显像剂型号
	private String v_Perm_Contrast;//对比试块及编号
	private String v_Perm_JFC_Time;//渗透时间
	private String v_Perm_Image_Time;//显像时间
	private String v_Perm_Cri;//检测标准
	private String v_Perm_Len;//检测比例、长度
	private String v_Perm_Value;//
	private String v_Perm_Result;//
	private String v_Perm_Date;//检测
	private String v_Perm_Check_Date;//校对
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
	@OneToOne(mappedBy="vesselPermTest")
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
	 * @return the v_Perm_JFC
	 */
	public String getV_Perm_JFC() {
		return v_Perm_JFC;
	}
	/**
	 * @param v_Perm_JFC the v_Perm_JFC to set
	 */
	public void setV_Perm_JFC(String v_Perm_JFC) {
		this.v_Perm_JFC = v_Perm_JFC;
	}
	/**
	 * @return the v_Perm_Surface
	 */
	public String getV_Perm_Surface() {
		return v_Perm_Surface;
	}
	/**
	 * @param v_Perm_Surface the v_Perm_Surface to set
	 */
	public void setV_Perm_Surface(String v_Perm_Surface) {
		this.v_Perm_Surface = v_Perm_Surface;
	}
	/**
	 * @return the v_Perm_Clean
	 */
	public String getV_Perm_Clean() {
		return v_Perm_Clean;
	}
	/**
	 * @param v_Perm_Clean the v_Perm_Clean to set
	 */
	public void setV_Perm_Clean(String v_Perm_Clean) {
		this.v_Perm_Clean = v_Perm_Clean;
	}
	/**
	 * @return the v_Perm_Tem
	 */
	public String getV_Perm_Tem() {
		return v_Perm_Tem;
	}
	/**
	 * @param v_Perm_Tem the v_Perm_Tem to set
	 */
	public void setV_Perm_Tem(String v_Perm_Tem) {
		this.v_Perm_Tem = v_Perm_Tem;
	}
	/**
	 * @return the v_Perm_Image
	 */
	public String getV_Perm_Image() {
		return v_Perm_Image;
	}
	/**
	 * @param v_Perm_Image the v_Perm_Image to set
	 */
	public void setV_Perm_Image(String v_Perm_Image) {
		this.v_Perm_Image = v_Perm_Image;
	}
	/**
	 * @return the v_Perm_Contrast
	 */
	public String getV_Perm_Contrast() {
		return v_Perm_Contrast;
	}
	/**
	 * @param v_Perm_Contrast the v_Perm_Contrast to set
	 */
	public void setV_Perm_Contrast(String v_Perm_Contrast) {
		this.v_Perm_Contrast = v_Perm_Contrast;
	}
	/**
	 * @return the v_Perm_JFC_Time
	 */
	public String getV_Perm_JFC_Time() {
		return v_Perm_JFC_Time;
	}
	/**
	 * @param v_Perm_JFC_Time the v_Perm_JFC_Time to set
	 */
	public void setV_Perm_JFC_Time(String v_Perm_JFC_Time) {
		this.v_Perm_JFC_Time = v_Perm_JFC_Time;
	}
	/**
	 * @return the v_Perm_Image_Time
	 */
	public String getV_Perm_Image_Time() {
		return v_Perm_Image_Time;
	}
	/**
	 * @param v_Perm_Image_Time the v_Perm_Image_Time to set
	 */
	public void setV_Perm_Image_Time(String v_Perm_Image_Time) {
		this.v_Perm_Image_Time = v_Perm_Image_Time;
	}
	/**
	 * @return the v_Perm_Cri
	 */
	public String getV_Perm_Cri() {
		return v_Perm_Cri;
	}
	/**
	 * @param v_Perm_Cri the v_Perm_Cri to set
	 */
	public void setV_Perm_Cri(String v_Perm_Cri) {
		this.v_Perm_Cri = v_Perm_Cri;
	}
	/**
	 * @return the v_Perm_Len
	 */
	public String getV_Perm_Len() {
		return v_Perm_Len;
	}
	/**
	 * @param v_Perm_Len the v_Perm_Len to set
	 */
	public void setV_Perm_Len(String v_Perm_Len) {
		this.v_Perm_Len = v_Perm_Len;
	}
	
	/**
	 * @return the v_Perm_Value
	 */
	@Column(length=5500)
	public String getV_Perm_Value() {
		return v_Perm_Value;
	}
	/**
	 * @param v_Perm_Value the v_Perm_Value to set
	 */
	public void setV_Perm_Value(String v_Perm_Value) {
		this.v_Perm_Value = v_Perm_Value;
	}
	/**
	 * @return the v_Perm_Result
	 */
	public String getV_Perm_Result() {
		return v_Perm_Result;
	}
	/**
	 * @param v_Perm_Result the v_Perm_Result to set
	 */
	public void setV_Perm_Result(String v_Perm_Result) {
		this.v_Perm_Result = v_Perm_Result;
	}
	/**
	 * @return the v_Perm_Date
	 */
	public String getV_Perm_Date() {
		return v_Perm_Date;
	}
	/**
	 * @param v_Perm_Date the v_Perm_Date to set
	 */
	public void setV_Perm_Date(String v_Perm_Date) {
		this.v_Perm_Date = v_Perm_Date;
	}
	/**
	 * @return the v_Perm_Check_Date
	 */
	public String getV_Perm_Check_Date() {
		return v_Perm_Check_Date;
	}
	/**
	 * @param v_Perm_Check_Date the v_Perm_Check_Date to set
	 */
	public void setV_Perm_Check_Date(String v_Perm_Check_Date) {
		this.v_Perm_Check_Date = v_Perm_Check_Date;
	}
	
	
}
