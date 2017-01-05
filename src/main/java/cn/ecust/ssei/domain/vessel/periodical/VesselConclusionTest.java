package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselConclusionTest")
public class VesselConclusionTest {
	
	private long id;
	private VesselPeriodicalMaintain  vesselPeriodicalMaintain;
	private String v_M_Type;//用于定期检验类别
	private String v_M_Sta;//运行状态
	private String v_M_Basic;//检验依据
	private String v_M_Explain;//说明：
	private String v_M_Test_Date;//检验
	private String v_M_Check_Date;//校核
	private String v_M_check_Prob;//原始资料及记录审查问题记载
	private String v_M_Prob;//上次全面检验及自上次全面检验以来历次在线检验问题记载
	private String v_M_Condition;//检验条件确认
	private String v_M_Conclusion;//检验结论
	private String v_M_Level;//经检验本台压力容器的安全状况等级评定为      级
	private String v_M_Pre;//允许使用参数压力
	private String v_M_Tem;//允许使用参数温度
	private String v_M_Med;//允许使用参数介质
	private String v_M_Other;//允许使用参数其他
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
	@OneToOne(mappedBy="vesselConclusionTest")
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
	 * @return the v_M_Type
	 */
	public String getV_M_Type() {
		return v_M_Type;
	}
	/**
	 * @param v_M_Type the v_M_Type to set
	 */
	public void setV_M_Type(String v_M_Type) {
		this.v_M_Type = v_M_Type;
	}
	/**
	 * @return the v_M_Sta
	 */
	public String getV_M_Sta() {
		return v_M_Sta;
	}
	/**
	 * @param v_M_Sta the v_M_Sta to set
	 */
	public void setV_M_Sta(String v_M_Sta) {
		this.v_M_Sta = v_M_Sta;
	}
	/**
	 * @return the v_M_Basic
	 */
	public String getV_M_Basic() {
		return v_M_Basic;
	}
	/**
	 * @param v_M_Basic the v_M_Basic to set
	 */
	public void setV_M_Basic(String v_M_Basic) {
		this.v_M_Basic = v_M_Basic;
	}
	/**
	 * @return the v_M_Explain
	 */
	public String getV_M_Explain() {
		return v_M_Explain;
	}
	/**
	 * @param v_M_Explain the v_M_Explain to set
	 */
	public void setV_M_Explain(String v_M_Explain) {
		this.v_M_Explain = v_M_Explain;
	}
	/**
	 * @return the v_M_Test_Date
	 */
	public String getV_M_Test_Date() {
		return v_M_Test_Date;
	}
	/**
	 * @param v_M_Test_Date the v_M_Test_Date to set
	 */
	public void setV_M_Test_Date(String v_M_Test_Date) {
		this.v_M_Test_Date = v_M_Test_Date;
	}
	/**
	 * @return the v_M_Check_Date
	 */
	public String getV_M_Check_Date() {
		return v_M_Check_Date;
	}
	/**
	 * @param v_M_Check_Date the v_M_Check_Date to set
	 */
	public void setV_M_Check_Date(String v_M_Check_Date) {
		this.v_M_Check_Date = v_M_Check_Date;
	}
	
	/**
	 * @return the v_M_check_Prob
	 */
	public String getV_M_check_Prob() {
		return v_M_check_Prob;
	}
	/**
	 * @param v_M_check_Prob the v_M_check_Prob to set
	 */
	public void setV_M_check_Prob(String v_M_check_Prob) {
		this.v_M_check_Prob = v_M_check_Prob;
	}
	/**
	 * @return the v_M_Prob
	 */
	public String getV_M_Prob() {
		return v_M_Prob;
	}
	/**
	 * @param v_M_Prob the v_M_Prob to set
	 */
	public void setV_M_Prob(String v_M_Prob) {
		this.v_M_Prob = v_M_Prob;
	}
	/**
	 * @return the v_M_Condition
	 */
	public String getV_M_Condition() {
		return v_M_Condition;
	}
	/**
	 * @param v_M_Condition the v_M_Condition to set
	 */
	public void setV_M_Condition(String v_M_Condition) {
		this.v_M_Condition = v_M_Condition;
	}
	/**
	 * @return the v_M_Conclusion
	 */
	public String getV_M_Conclusion() {
		return v_M_Conclusion;
	}
	/**
	 * @param v_M_Conclusion the v_M_Conclusion to set
	 */
	public void setV_M_Conclusion(String v_M_Conclusion) {
		this.v_M_Conclusion = v_M_Conclusion;
	}
	/**
	 * @return the v_M_Level
	 */
	public String getV_M_Level() {
		return v_M_Level;
	}
	/**
	 * @param v_M_Level the v_M_Level to set
	 */
	public void setV_M_Level(String v_M_Level) {
		this.v_M_Level = v_M_Level;
	}
	/**
	 * @return the v_M_Pre
	 */
	public String getV_M_Pre() {
		return v_M_Pre;
	}
	/**
	 * @param v_M_Pre the v_M_Pre to set
	 */
	public void setV_M_Pre(String v_M_Pre) {
		this.v_M_Pre = v_M_Pre;
	}
	/**
	 * @return the v_M_Tem
	 */
	public String getV_M_Tem() {
		return v_M_Tem;
	}
	/**
	 * @param v_M_Tem the v_M_Tem to set
	 */
	public void setV_M_Tem(String v_M_Tem) {
		this.v_M_Tem = v_M_Tem;
	}
	/**
	 * @return the v_M_Med
	 */
	public String getV_M_Med() {
		return v_M_Med;
	}
	/**
	 * @param v_M_Med the v_M_Med to set
	 */
	public void setV_M_Med(String v_M_Med) {
		this.v_M_Med = v_M_Med;
	}
	/**
	 * @return the v_M_Other
	 */
	public String getV_M_Other() {
		return v_M_Other;
	}
	/**
	 * @param v_M_Other the v_M_Other to set
	 */
	public void setV_M_Other(String v_M_Other) {
		this.v_M_Other = v_M_Other;
	}
	
	
}
