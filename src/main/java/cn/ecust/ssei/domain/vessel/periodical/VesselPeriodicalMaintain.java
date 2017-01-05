package cn.ecust.ssei.domain.vessel.periodical;

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
@Table(name="ssei_vesselPeriodicalMaintain")
public class VesselPeriodicalMaintain{
	
	private long id;
	
	private VesselMaintain vesselMaintain;
	private VesselAddTest vesselAddTest;
	private VesselAirTest vesselAirTest;
	private VesselAmmoniaTest vesselAmmoniaTest;
	private VesselGlassSteelLinerTest vesselGlassSteelLinerTest;
	private VesselGlassSteelTest vesselGlassSteelTest;
	private VesselGlassTest vesselGlassTest;
	private VesselGraphiteLinerTest vesselGraphiteLinerTest;
	private VesselGraphiteTest vesselGraphiteTest;
	private VesselHardTest vesselHardTest;
	private VesselHeTest vesselHeTest;
	private VesselMagneticTest vesselMagneticTest;
	private VesselMatTest vesselMatTest;
	private VesselMetTest vesselMetTest;
	private VesselMicroTest vesselMicroTest;
	private VesselPermTest vesselPermTest;
	private VesselPlasticLinerTest vesselPlasticLinerTest;
	private VesselPlasticTest vesselPlasticTest;
	private VesselPreTest vesselPreTest;
	private VesselRadioTest vesselRadioTest;
	private VesselSonciTest vesselSonciTest;
	private VesselSPDTest vesselSPDTest;
	private VesselThiCheck vesselThiCheck;
	private VesselThiTest vesselThiTest;
	private VesselTOFDTest vesselTOFDTest;
	private VesselUltrasonicTest vesselUltrasonicTest;
	private VesselConclusionTest vesselConclusionTest;
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
	 * @return the vesselAddTest
	 */
	
	
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselAddTestId")
	public VesselAddTest getVesselAddTest() {
		return vesselAddTest;
	}
	/**
	 * @return the vesselMaintain
	 */
	@OneToOne(mappedBy="vesselPeriodicalMaintain")
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
	 * @param vesselAddTest the vesselAddTest to set
	 */
	public void setVesselAddTest(VesselAddTest vesselAddTest) {
		this.vesselAddTest = vesselAddTest;
	}
	/**
	 * @return the vesselAirTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselAirTestId")
	public VesselAirTest getVesselAirTest() {
		return vesselAirTest;
	}
	/**
	 * @param vesselAirTest the vesselAirTest to set
	 */
	public void setVesselAirTest(VesselAirTest vesselAirTest) {
		this.vesselAirTest = vesselAirTest;
	}
	/**
	 * @return the vesselAmmoniaTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselAmmoniaTestId")
	public VesselAmmoniaTest getVesselAmmoniaTest() {
		return vesselAmmoniaTest;
	}
	/**
	 * @param vesselAmmoniaTest the vesselAmmoniaTest to set
	 */
	public void setVesselAmmoniaTest(VesselAmmoniaTest vesselAmmoniaTest) {
		this.vesselAmmoniaTest = vesselAmmoniaTest;
	}
	/**
	 * @return the vesselGlassSteelLinerTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselGlassSteelLinerTestId")
	public VesselGlassSteelLinerTest getVesselGlassSteelLinerTest() {
		return vesselGlassSteelLinerTest;
	}
	/**
	 * @param vesselGlassSteelLinerTest the vesselGlassSteelLinerTest to set
	 */
	public void setVesselGlassSteelLinerTest(
			VesselGlassSteelLinerTest vesselGlassSteelLinerTest) {
		this.vesselGlassSteelLinerTest = vesselGlassSteelLinerTest;
	}
	/**
	 * @return the vesselGlassSteelTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselGlassSteelTestId")
	public VesselGlassSteelTest getVesselGlassSteelTest() {
		return vesselGlassSteelTest;
	}
	/**
	 * @param vesselGlassSteelTest the vesselGlassSteelTest to set
	 */
	public void setVesselGlassSteelTest(VesselGlassSteelTest vesselGlassSteelTest) {
		this.vesselGlassSteelTest = vesselGlassSteelTest;
	}
	/**
	 * @return the vesselGlassTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselGlassTestId")
	public VesselGlassTest getVesselGlassTest() {
		return vesselGlassTest;
	}
	/**
	 * @param vesselGlassTest the vesselGlassTest to set
	 */
	public void setVesselGlassTest(VesselGlassTest vesselGlassTest) {
		this.vesselGlassTest = vesselGlassTest;
	}
	/**
	 * @return the vesselGraphiteLinerTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselGraphiteLinerTestId")
	public VesselGraphiteLinerTest getVesselGraphiteLinerTest() {
		return vesselGraphiteLinerTest;
	}
	/**
	 * @param vesselGraphiteLinerTest the vesselGraphiteLinerTest to set
	 */
	public void setVesselGraphiteLinerTest(
			VesselGraphiteLinerTest vesselGraphiteLinerTest) {
		this.vesselGraphiteLinerTest = vesselGraphiteLinerTest;
	}
	/**
	 * @return the vesselGraphiteTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselGraphiteTestId")
	public VesselGraphiteTest getVesselGraphiteTest() {
		return vesselGraphiteTest;
	}
	/**
	 * @param vesselGraphiteTest the vesselGraphiteTest to set
	 */
	public void setVesselGraphiteTest(VesselGraphiteTest vesselGraphiteTest) {
		this.vesselGraphiteTest = vesselGraphiteTest;
	}
	/**
	 * @return the vesselHardTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselHardTestId")
	public VesselHardTest getVesselHardTest() {
		return vesselHardTest;
	}
	/**
	 * @param vesselHardTest the vesselHardTest to set
	 */
	public void setVesselHardTest(VesselHardTest vesselHardTest) {
		this.vesselHardTest = vesselHardTest;
	}
	/**
	 * @return the vesselHeTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselHeTestId")
	public VesselHeTest getVesselHeTest() {
		return vesselHeTest;
	}
	/**
	 * @param vesselHeTest the vesselHeTest to set
	 */
	public void setVesselHeTest(VesselHeTest vesselHeTest) {
		this.vesselHeTest = vesselHeTest;
	}
	/**
	 * @return the vesselMagneticTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselMagneticTestId")
	public VesselMagneticTest getVesselMagneticTest() {
		return vesselMagneticTest;
	}
	/**
	 * @param vesselMagneticTest the vesselMagneticTest to set
	 */
	public void setVesselMagneticTest(VesselMagneticTest vesselMagneticTest) {
		this.vesselMagneticTest = vesselMagneticTest;
	}
	/**
	 * @return the vesselMatTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselMatTestId")
	public VesselMatTest getVesselMatTest() {
		return vesselMatTest;
	}
	/**
	 * @param vesselMatTest the vesselMatTest to set
	 */
	public void setVesselMatTest(VesselMatTest vesselMatTest) {
		this.vesselMatTest = vesselMatTest;
	}
	/**
	 * @return the vesselMetTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselMetTestId")
	public VesselMetTest getVesselMetTest() {
		return vesselMetTest;
	}
	/**
	 * @param vesselMetTest the vesselMetTest to set
	 */
	public void setVesselMetTest(VesselMetTest vesselMetTest) {
		this.vesselMetTest = vesselMetTest;
	}
	/**
	 * @return the vesselMicroTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselMicroTestId")
	public VesselMicroTest getVesselMicroTest() {
		return vesselMicroTest;
	}
	/**
	 * @param vesselMicroTest the vesselMicroTest to set
	 */
	public void setVesselMicroTest(VesselMicroTest vesselMicroTest) {
		this.vesselMicroTest = vesselMicroTest;
	}
	/**
	 * @return the vesselPermTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselPermTestId")
	public VesselPermTest getVesselPermTest() {
		return vesselPermTest;
	}
	/**
	 * @param vesselPermTest the vesselPermTest to set
	 */
	public void setVesselPermTest(VesselPermTest vesselPermTest) {
		this.vesselPermTest = vesselPermTest;
	}
	/**
	 * @return the vesselPlasticLinerTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselPlasticLinerTestId")
	public VesselPlasticLinerTest getVesselPlasticLinerTest() {
		return vesselPlasticLinerTest;
	}
	/**
	 * @param vesselPlasticLinerTest the vesselPlasticLinerTest to set
	 */
	public void setVesselPlasticLinerTest(
			VesselPlasticLinerTest vesselPlasticLinerTest) {
		this.vesselPlasticLinerTest = vesselPlasticLinerTest;
	}
	/**
	 * @return the vesselPlasticTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselPlasticTestId")
	public VesselPlasticTest getVesselPlasticTest() {
		return vesselPlasticTest;
	}
	/**
	 * @param vesselPlasticTest the vesselPlasticTest to set
	 */
	public void setVesselPlasticTest(VesselPlasticTest vesselPlasticTest) {
		this.vesselPlasticTest = vesselPlasticTest;
	}
	/**
	 * @return the vesselPreTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselPreTestId")
	public VesselPreTest getVesselPreTest() {
		return vesselPreTest;
	}
	/**
	 * @param vesselPreTest the vesselPreTest to set
	 */
	public void setVesselPreTest(VesselPreTest vesselPreTest) {
		this.vesselPreTest = vesselPreTest;
	}
	/**
	 * @return the vesselRadioTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselRadioTestId")
	public VesselRadioTest getVesselRadioTest() {
		return vesselRadioTest;
	}
	/**
	 * @param vesselRadioTest the vesselRadioTest to set
	 */
	public void setVesselRadioTest(VesselRadioTest vesselRadioTest) {
		this.vesselRadioTest = vesselRadioTest;
	}
	/**
	 * @return the vesselSonciTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselSonciTestId")
	public VesselSonciTest getVesselSonciTest() {
		return vesselSonciTest;
	}
	/**
	 * @param vesselSonciTest the vesselSonciTest to set
	 */
	public void setVesselSonciTest(VesselSonciTest vesselSonciTest) {
		this.vesselSonciTest = vesselSonciTest;
	}
	/**
	 * @return the vesselSPDTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselSPDTestId")
	public VesselSPDTest getVesselSPDTest() {
		return vesselSPDTest;
	}
	/**
	 * @param vesselSPDTest the vesselSPDTest to set
	 */
	public void setVesselSPDTest(VesselSPDTest vesselSPDTest) {
		this.vesselSPDTest = vesselSPDTest;
	}
	/**
	 * @return the vesselThiCheck
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselThiCheckId")
	public VesselThiCheck getVesselThiCheck() {
		return vesselThiCheck;
	}
	/**
	 * @param vesselThiCheck the vesselThiCheck to set
	 */
	public void setVesselThiCheck(VesselThiCheck vesselThiCheck) {
		this.vesselThiCheck = vesselThiCheck;
	}
	/**
	 * @return the vesselThiTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselThiTestId")
	public VesselThiTest getVesselThiTest() {
		return vesselThiTest;
	}
	/**
	 * @param vesselThiTest the vesselThiTest to set
	 */
	public void setVesselThiTest(VesselThiTest vesselThiTest) {
		this.vesselThiTest = vesselThiTest;
	}
	/**
	 * @return the vesselTOFDTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselTOFDTestId")
	public VesselTOFDTest getVesselTOFDTest() {
		return vesselTOFDTest;
	}
	/**
	 * @param vesselTOFDTest the vesselTOFDTest to set
	 */
	public void setVesselTOFDTest(VesselTOFDTest vesselTOFDTest) {
		this.vesselTOFDTest = vesselTOFDTest;
	}
	/**
	 * @return the vesselUltrasonicTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselUltrasonicTestId")
	public VesselUltrasonicTest getVesselUltrasonicTest() {
		return vesselUltrasonicTest;
	}
	/**
	 * @param vesselUltrasonicTest the vesselUltrasonicTest to set
	 */
	public void setVesselUltrasonicTest(VesselUltrasonicTest vesselUltrasonicTest) {
		this.vesselUltrasonicTest = vesselUltrasonicTest;
	}
	/**
	 * @return the vesselConclusionTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "vesselConclusionTestId")
	public VesselConclusionTest getVesselConclusionTest() {
		return vesselConclusionTest;
	}
	/**
	 * @param vesselConclusionTest the vesselConclusionTest to set
	 */
	public void setVesselConclusionTest(VesselConclusionTest vesselConclusionTest) {
		this.vesselConclusionTest = vesselConclusionTest;
	}
	 
	
	
}
