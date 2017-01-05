package cn.ecust.ssei.domain.vessel.annual;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cn.ecust.ssei.domain.vessel.VesselMaintain;

@Entity
@Table(name="ssei_vesselAnnualMaintain")
public class VesselAnnualMaintain {
	private long id;
	private VesselMaintain vesselMaintain;
	private VesselAnnualTest vesselAnnualTest;
	private VesselAnnualConclusionTest vesselAnnualConclusionTest;
	
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
	 * @return the vesselMaintain
	 */
	@OneToOne(mappedBy="vesselAnnualMaintain")
	public VesselMaintain getVesselMaintain() {
		return vesselMaintain;
	}
	/**
	 * @param vesselMaintain the vesselMaintain to set
	 */
	public void setVesselMaintain(VesselMaintain vesselMaintain) {
		this.vesselMaintain = vesselMaintain;
	}
	/**
	 * @return the vesselAnnualTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselAnnualTestId")
	public VesselAnnualTest getVesselAnnualTest() {
		return vesselAnnualTest;
	}
	/**
	 * @param vesselAnnualTest the vesselAnnualTest to set
	 */
	public void setVesselAnnualTest(VesselAnnualTest vesselAnnualTest) {
		this.vesselAnnualTest = vesselAnnualTest;
	}
	/**
	 * @return the vesselAnnualConclusionTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselAnnualConclusionTestId")
	public VesselAnnualConclusionTest getVesselAnnualConclusionTest() {
		return vesselAnnualConclusionTest;
	}
	/**
	 * @param vesselAnnualConclusionTest the vesselAnnualConclusionTest to set
	 */
	public void setVesselAnnualConclusionTest(
			VesselAnnualConclusionTest vesselAnnualConclusionTest) {
		this.vesselAnnualConclusionTest = vesselAnnualConclusionTest;
	}
	
	
	
}
