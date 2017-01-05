package cn.ecust.ssei.domain.vessel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualMaintain;
import cn.ecust.ssei.domain.vessel.check.VesselCheckMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;

@Entity
@Table(name="ssei_vesselMaintain")
public class VesselMaintain {

	private long id;
	private String v_M_Massion_ID;//任务号
	private String v_M_ID;//编号
	private String v_M_Mode;//检验总类别
	private String v_M_Date;//检验日期
	private String v_M_Bas_Prob;//问题记载
	private String v_finished;//是否完成 1：代表未完成      2：代表完成
	private VesselBasic vesselBasic;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private VesselCheckMaintain vesselCheckMaintain;
	private VesselAnnualMaintain vesselAnnualMaintain;
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
	 * @return the v_finished
	 */
	public String getV_finished() {
		return v_finished;
	}
	/**
	 * @param v_finished the v_finished to set
	 */
	public void setV_finished(String v_finished) {
		this.v_finished = v_finished;
	}
	/**
	 * @return the v_M_Massion_ID
	 */
	public String getV_M_Massion_ID() {
		return v_M_Massion_ID;
	}
	/**
	 * @param v_M_Massion_ID the v_M_Massion_ID to set
	 */
	public void setV_M_Massion_ID(String v_M_Massion_ID) {
		this.v_M_Massion_ID = v_M_Massion_ID;
	}
	/**
	 * @return the v_M_Bas_Prob
	 */
	public String getV_M_Bas_Prob() {
		return v_M_Bas_Prob;
	}
	/**
	 * @param v_M_Bas_Prob the v_M_Bas_Prob to set
	 */
	public void setV_M_Bas_Prob(String v_M_Bas_Prob) {
		this.v_M_Bas_Prob = v_M_Bas_Prob;
	}
	/**
	 * @return the v_M_ID
	 */
	public String getV_M_ID() {
		return v_M_ID;
	}
	/**
	 * @param v_M_ID the v_M_ID to set
	 */
	public void setV_M_ID(String v_M_ID) {
		this.v_M_ID = v_M_ID;
	}
	/**
	 * @return the v_M_Mode
	 */
	public String getV_M_Mode() {
		return v_M_Mode;
	}
	/**
	 * @param v_M_Mode the v_M_Mode to set
	 */
	public void setV_M_Mode(String v_M_Mode) {
		this.v_M_Mode = v_M_Mode;
	}
	/**
	 * @return the v_M_Date
	 */
	public String getV_M_Date() {
		return v_M_Date;
	}
	/**
	 * @param v_M_Date the v_M_Date to set
	 */
	public void setV_M_Date(String v_M_Date) {
		this.v_M_Date = v_M_Date;
	}
	/**
	 * @return the vesselBasic
	 */
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="vesselId")
	public VesselBasic getVesselBasic() {
		return vesselBasic;
	}
	/**
	 * @param vesselBasic the vesselBasic to set
	 */
	public void setVesselBasic(VesselBasic vesselBasic) {
		this.vesselBasic = vesselBasic;
	}
	/**
	 * @return the vesselPeriodicalMaintain
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "periodicalId")
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
	 * @return the vesselCheckMaintain
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "checkId")
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
	 * @return the vesselAnnualMaintain
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "annualId")
	public VesselAnnualMaintain getVesselAnnualMaintain() {
		return vesselAnnualMaintain;
	}
	/**
	 * @param vesselAnnualMaintain the vesselAnnualMaintain to set
	 */
	public void setVesselAnnualMaintain(VesselAnnualMaintain vesselAnnualMaintain) {
		this.vesselAnnualMaintain = vesselAnnualMaintain;
	}


}
