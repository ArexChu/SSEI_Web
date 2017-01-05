package cn.ecust.ssei.domain.vessel.check;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselCheckConclusionTest")
public class VesselCheckConclusionTest {

	private long id;
	private String v_M_Entrust_Com;
	private String v_M_Entrust_Com_Per;
	private VesselCheckMaintain vesselCheckMaintain;
	private String v_Check_Basic;//检验依据
	private String v_Check_Conclusion;//检验结论
	private String v_Check_Level;//安全状况等级评定为
	private String v_Check_Pre;//允许使用参数压力
	private String v_Check_Tem;//允许使用参数温度
	private String v_Check_Med;//允许使用参数介质
	private String v_Check_Other;//允许使用参数其他
	private String v_Check_Explan;//说明
	private String v_Check_Test;//检查
	private String v_Check_Check;//校对
	private String v_M_Option;//检验发现的缺陷位置、程度、性质及处理意见
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
	 * @return the vesselCheckMaintain
	 */
	@OneToOne(mappedBy="vesselCheckConclusionTest")
	public VesselCheckMaintain getVesselCheckMaintain() {
		return vesselCheckMaintain;
	}
	/**
	 * @param vesselCheckMaintain the vesselCheckMaintain to set
	 */
	
	public void setVesselCheckMaintain(VesselCheckMaintain vesselCheckMaintain) {
		this.vesselCheckMaintain = vesselCheckMaintain;
	}
	/**
	 * @return the v_Check_Basic
	 */
	public String getV_Check_Basic() {
		return v_Check_Basic;
	}
	/**
	 * @param v_Check_Basic the v_Check_Basic to set
	 */
	public void setV_Check_Basic(String v_Check_Basic) {
		this.v_Check_Basic = v_Check_Basic;
	}
	/**
	 * @return the v_Check_Conclusion
	 */
	public String getV_Check_Conclusion() {
		return v_Check_Conclusion;
	}
	/**
	 * @param v_Check_Conclusion the v_Check_Conclusion to set
	 */
	public void setV_Check_Conclusion(String v_Check_Conclusion) {
		this.v_Check_Conclusion = v_Check_Conclusion;
	}
	/**
	 * @return the v_Check_Level
	 */
	public String getV_Check_Level() {
		return v_Check_Level;
	}
	/**
	 * @param v_Check_Level the v_Check_Level to set
	 */
	public void setV_Check_Level(String v_Check_Level) {
		this.v_Check_Level = v_Check_Level;
	}
	/**
	 * @return the v_Check_Pre
	 */
	public String getV_Check_Pre() {
		return v_Check_Pre;
	}
	/**
	 * @param v_Check_Pre the v_Check_Pre to set
	 */
	public void setV_Check_Pre(String v_Check_Pre) {
		this.v_Check_Pre = v_Check_Pre;
	}
	/**
	 * @return the v_Check_Tem
	 */
	public String getV_Check_Tem() {
		return v_Check_Tem;
	}
	/**
	 * @param v_Check_Tem the v_Check_Tem to set
	 */
	public void setV_Check_Tem(String v_Check_Tem) {
		this.v_Check_Tem = v_Check_Tem;
	}
	/**
	 * @return the v_Check_Med
	 */
	public String getV_Check_Med() {
		return v_Check_Med;
	}
	/**
	 * @param v_Check_Med the v_Check_Med to set
	 */
	public void setV_Check_Med(String v_Check_Med) {
		this.v_Check_Med = v_Check_Med;
	}
	/**
	 * @return the v_Check_Other
	 */
	public String getV_Check_Other() {
		return v_Check_Other;
	}
	/**
	 * @param v_Check_Other the v_Check_Other to set
	 */
	public void setV_Check_Other(String v_Check_Other) {
		this.v_Check_Other = v_Check_Other;
	}
	/**
	 * @return the v_Check_Explan
	 */
	public String getV_Check_Explan() {
		return v_Check_Explan;
	}
	/**
	 * @param v_Check_Explan the v_Check_Explan to set
	 */
	public void setV_Check_Explan(String v_Check_Explan) {
		this.v_Check_Explan = v_Check_Explan;
	}
	/**
	 * @return the v_Check_Test
	 */
	public String getV_Check_Test() {
		return v_Check_Test;
	}
	/**
	 * @param v_Check_Test the v_Check_Test to set
	 */
	public void setV_Check_Test(String v_Check_Test) {
		this.v_Check_Test = v_Check_Test;
	}
	/**
	 * @return the v_Check_Check
	 */
	public String getV_Check_Check() {
		return v_Check_Check;
	}
	/**
	 * @param v_Check_Check the v_Check_Check to set
	 */
	public void setV_Check_Check(String v_Check_Check) {
		this.v_Check_Check = v_Check_Check;
	}
	/**
	 * @return the v_M_Option
	 */
	public String getV_M_Option() {
		return v_M_Option;
	}
	/**
	 * @param v_M_Option the v_M_Option to set
	 */
	public void setV_M_Option(String v_M_Option) {
		this.v_M_Option = v_M_Option;
	}
	/**
	 * @return the v_M_Entrust_Com
	 */
	public String getV_M_Entrust_Com() {
		return v_M_Entrust_Com;
	}
	/**
	 * @param v_M_Entrust_Com the v_M_Entrust_Com to set
	 */
	public void setV_M_Entrust_Com(String v_M_Entrust_Com) {
		this.v_M_Entrust_Com = v_M_Entrust_Com;
	}
	/**
	 * @return the v_M_Entrust_Com_Per
	 */
	public String getV_M_Entrust_Com_Per() {
		return v_M_Entrust_Com_Per;
	}
	/**
	 * @param v_M_Entrust_Com_Per the v_M_Entrust_Com_Per to set
	 */
	public void setV_M_Entrust_Com_Per(String v_M_Entrust_Com_Per) {
		this.v_M_Entrust_Com_Per = v_M_Entrust_Com_Per;
	}
	
	

}
