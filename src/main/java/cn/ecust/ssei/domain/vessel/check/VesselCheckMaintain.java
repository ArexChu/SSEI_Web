package cn.ecust.ssei.domain.vessel.check;

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
@Table(name="ssei_vesselCheckMaintain")
public class VesselCheckMaintain {

	private long id;
	private VesselMaintain vesselMaintain;
	private VesselCheckTest vesselCheckTest;
	private VesselCheckConclusionTest vesselCheckConclusionTest;
	
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
	@OneToOne(mappedBy="vesselCheckMaintain")
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
	 * @return the vesselCheckTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselCheckTestId")
	public VesselCheckTest getVesselCheckTest() {
		return vesselCheckTest;
	}
	/**
	 * @param vesselCheckTest the vesselCheckTest to set
	 */
	public void setVesselCheckTest(VesselCheckTest vesselCheckTest) {
		this.vesselCheckTest = vesselCheckTest;
	}
	/**
	 * @return the vesselCheckConclusionTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselCheckConclusionTestId")
	public VesselCheckConclusionTest getVesselCheckConclusionTest() {
		return vesselCheckConclusionTest;
	}
	/**
	 * @param vesselCheckConclusionTest the vesselCheckConclusionTest to set
	 */
	public void setVesselCheckConclusionTest(
			VesselCheckConclusionTest vesselCheckConclusionTest) {
		this.vesselCheckConclusionTest = vesselCheckConclusionTest;
	}
	
	

}
