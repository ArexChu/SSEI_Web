package cn.ecust.ssei.domain.vessel.annual;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselAnnualConclusionTest")
public class VesselAnnualConclusionTest {
	private long id;
	private VesselAnnualMaintain vesselAnnualMaintain;
	private String v_Ann_Type;//设备型号
	private String v_Ann_Basic;//检验依据
	private String v_Ann_Conclusion;//检验结论
	private String v_Ann_Level;//安全状况等级评定为
	private String v_Ann_Pre;//允许使用参数压力
	private String v_Ann_Tem;//允许使用参数温度
	private String v_Ann_Med;//允许使用参数介质
	private String v_Ann_Explan;//说明
	private String v_Ann_Test;//检查
	private String v_Ann_Check;//校对
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
	 * @return the vesselAnnualMaintain
	 */
	@OneToOne(mappedBy="vesselAnnualConclusionTest")
	public VesselAnnualMaintain getVesselAnnualMaintain() {
		return vesselAnnualMaintain;
	}
	/**
	 * @param vesselAnnualMaintain the vesselAnnualMaintain to set
	 */
	public void setVesselAnnualMaintain(VesselAnnualMaintain vesselAnnualMaintain) {
		this.vesselAnnualMaintain = vesselAnnualMaintain;
	}
	/**
	 * @return the v_Ann_Basic
	 */
	public String getV_Ann_Basic() {
		return v_Ann_Basic;
	}
	/**
	 * @param v_Ann_Basic the v_Ann_Basic to set
	 */
	public void setV_Ann_Basic(String v_Ann_Basic) {
		this.v_Ann_Basic = v_Ann_Basic;
	}
	/**
	 * @return the v_Ann_Conclusion
	 */
	public String getV_Ann_Conclusion() {
		return v_Ann_Conclusion;
	}
	/**
	 * @param v_Ann_Conclusion the v_Ann_Conclusion to set
	 */
	public void setV_Ann_Conclusion(String v_Ann_Conclusion) {
		this.v_Ann_Conclusion = v_Ann_Conclusion;
	}
	/**
	 * @return the v_Ann_Level
	 */
	public String getV_Ann_Level() {
		return v_Ann_Level;
	}
	/**
	 * @param v_Ann_Level the v_Ann_Level to set
	 */
	public void setV_Ann_Level(String v_Ann_Level) {
		this.v_Ann_Level = v_Ann_Level;
	}
	/**
	 * @return the v_Ann_Pre
	 */
	public String getV_Ann_Pre() {
		return v_Ann_Pre;
	}
	/**
	 * @param v_Ann_Pre the v_Ann_Pre to set
	 */
	public void setV_Ann_Pre(String v_Ann_Pre) {
		this.v_Ann_Pre = v_Ann_Pre;
	}
	/**
	 * @return the v_Ann_Tem
	 */
	public String getV_Ann_Tem() {
		return v_Ann_Tem;
	}
	/**
	 * @param v_Ann_Tem the v_Ann_Tem to set
	 */
	public void setV_Ann_Tem(String v_Ann_Tem) {
		this.v_Ann_Tem = v_Ann_Tem;
	}
	/**
	 * @return the v_Ann_Med
	 */
	public String getV_Ann_Med() {
		return v_Ann_Med;
	}
	/**
	 * @param v_Ann_Med the v_Ann_Med to set
	 */
	public void setV_Ann_Med(String v_Ann_Med) {
		this.v_Ann_Med = v_Ann_Med;
	}
	/**
	 * @return the v_Ann_Explan
	 */
	public String getV_Ann_Explan() {
		return v_Ann_Explan;
	}
	/**
	 * @param v_Ann_Explan the v_Ann_Explan to set
	 */
	public void setV_Ann_Explan(String v_Ann_Explan) {
		this.v_Ann_Explan = v_Ann_Explan;
	}
	/**
	 * @return the v_Ann_Test
	 */
	public String getV_Ann_Test() {
		return v_Ann_Test;
	}
	/**
	 * @param v_Ann_Test the v_Ann_Test to set
	 */
	public void setV_Ann_Test(String v_Ann_Test) {
		this.v_Ann_Test = v_Ann_Test;
	}
	/**
	 * @return the v_Ann_Check
	 */
	public String getV_Ann_Check() {
		return v_Ann_Check;
	}
	/**
	 * @param v_Ann_Check the v_Ann_Check to set
	 */
	public void setV_Ann_Check(String v_Ann_Check) {
		this.v_Ann_Check = v_Ann_Check;
	}
	/**
	 * @return the v_Ann_Type
	 */
	public String getV_Ann_Type() {
		return v_Ann_Type;
	}
	/**
	 * @param v_Ann_Type the v_Ann_Type to set
	 */
	public void setV_Ann_Type(String v_Ann_Type) {
		this.v_Ann_Type = v_Ann_Type;
	}
	
	
}
