package cn.ecust.ssei.domain.pipe.pipedetailmaintain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cn.ecust.ssei.domain.pipe.PipeMaintain;

@Entity
@Table(name="ssei_pipeDetailMaintain")
public class PipeDetailMaintain {

	private long id;
	private PipeMaintain pipeMaintain;
	private String m_Remark;//备注
	
	private PipeAssTable pipeAssTable;
	private PipeHardTest pipeHardTest;
	private PipeLeakTest pipeLeakTest;
	private PipeMetTest pipeMetTest;
	private PipeMicroTest pipeMicroTest;
	private PipePreTest pipePreTest;
	private PipeSPDTest pipeSPDTest;
	private PipeThiTest pipeThiTest;
	private PipeVerification pipeVerification;
	
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
	 * @return the pipeMaintain
	 */
	@OneToOne(mappedBy="pipeDetailMaintain")
	public PipeMaintain getPipeMaintain() {
		return pipeMaintain;
	}
	/**
	 * @param pipeMaintain the pipeMaintain to set
	 */
	public void setPipeMaintain(PipeMaintain pipeMaintain) {
		this.pipeMaintain = pipeMaintain;
	}
	
	/**
	 * @return the pipeAssTable
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeAssTableId")
	public PipeAssTable getPipeAssTable() {
		return pipeAssTable;
	}
	/**
	 * @param pipeAssTable the pipeAssTable to set
	 */
	public void setPipeAssTable(PipeAssTable pipeAssTable) {
		this.pipeAssTable = pipeAssTable;
	}
	/**
	 * @return the pipeHardTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeHardTestId")
	public PipeHardTest getPipeHardTest() {
		return pipeHardTest;
	}
	/**
	 * @param pipeHardTest the pipeHardTest to set
	 */
	public void setPipeHardTest(PipeHardTest pipeHardTest) {
		this.pipeHardTest = pipeHardTest;
	}

	/**
	 * @return the pipeLeakTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeLeakTestId")
	public PipeLeakTest getPipeLeakTest() {
		return pipeLeakTest;
	}
	/**
	 * @param pipeLeakTest the pipeLeakTest to set
	 */
	public void setPipeLeakTest(PipeLeakTest pipeLeakTest) {
		this.pipeLeakTest = pipeLeakTest;
	}
	/**
	 * @return the pipeMetTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeMetTestId")
	public PipeMetTest getPipeMetTest() {
		return pipeMetTest;
	}
	/**
	 * @param pipeMetTest the pipeMetTest to set
	 */
	public void setPipeMetTest(PipeMetTest pipeMetTest) {
		this.pipeMetTest = pipeMetTest;
	}
	/**
	 * @return the pipeMicroTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeMicroTestId")
	public PipeMicroTest getPipeMicroTest() {
		return pipeMicroTest;
	}
	/**
	 * @param pipeMicroTest the pipeMicroTest to set
	 */
	public void setPipeMicroTest(PipeMicroTest pipeMicroTest) {
		this.pipeMicroTest = pipeMicroTest;
	}
	/**
	 * @return the pipePreTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipePreTestId")
	public PipePreTest getPipePreTest() {
		return pipePreTest;
	}
	/**
	 * @param pipePreTest the pipePreTest to set
	 */
	public void setPipePreTest(PipePreTest pipePreTest) {
		this.pipePreTest = pipePreTest;
	}
	/**
	 * @return the pipeSPDTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeSPDTestId")
	public PipeSPDTest getPipeSPDTest() {
		return pipeSPDTest;
	}
	/**
	 * @param pipeSPDTest the pipeSPDTest to set
	 */
	public void setPipeSPDTest(PipeSPDTest pipeSPDTest) {
		this.pipeSPDTest = pipeSPDTest;
	}
	/**
	 * @return the pipeThiTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeThiTestId")
	public PipeThiTest getPipeThiTest() {
		return pipeThiTest;
	}
	/**
	 * @param pipeThiTest the pipeThiTest to set
	 */
	public void setPipeThiTest(PipeThiTest pipeThiTest) {
		this.pipeThiTest = pipeThiTest;
	}
	/**
	 * @return the m_Remark
	 */
	public String getM_Remark() {
		return m_Remark;
	}
	/**
	 * @param m_Remark the m_Remark to set
	 */
	public void setM_Remark(String m_Remark) {
		this.m_Remark = m_Remark;
	}
	/**
	 * @return the pipeVerification
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeVerificationId")
	public PipeVerification getPipeVerification() {
		return pipeVerification;
	}
	/**
	 * @param pipeVerification the pipeVerification to set
	 */
	public void setPipeVerification(PipeVerification pipeVerification) {
		this.pipeVerification = pipeVerification;
	}
	
	
	
}
