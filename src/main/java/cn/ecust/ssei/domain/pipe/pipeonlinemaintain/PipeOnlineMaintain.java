package cn.ecust.ssei.domain.pipe.pipeonlinemaintain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cn.ecust.ssei.domain.pipe.PipeMaintain;

@Entity
@Table(name="ssei_pipeOnlineMaintain")
public class PipeOnlineMaintain {
	
	
	private long id;
	private PipeMaintain pipeMaintain;
	
	private PipeOnlineSubTest pipeOnlineSubTest;
	private PipeOnlineThiTest pipeOnlineThiTest;
	
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
	@OneToOne(mappedBy="pipeOnlineMaintain")
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
	 * @return the pipeOnlineSubTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeOnlineSubTestId")
	public PipeOnlineSubTest getPipeOnlineSubTest() {
		return pipeOnlineSubTest;
	}

	/**
	 * @param pipeOnlineSubTest the pipeOnlineSubTest to set
	 */
	public void setPipeOnlineSubTest(PipeOnlineSubTest pipeOnlineSubTest) {
		this.pipeOnlineSubTest = pipeOnlineSubTest;
	}

	/**
	 * @return the pipeOnlineThiTest
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeOnlineThiTestId")
	public PipeOnlineThiTest getPipeOnlineThiTest() {
		return pipeOnlineThiTest;
	}

	/**
	 * @param pipeOnlineThiTest the pipeOnlineThiTest to set
	 */
	public void setPipeOnlineThiTest(PipeOnlineThiTest pipeOnlineThiTest) {
		this.pipeOnlineThiTest = pipeOnlineThiTest;
	}
	
	
	


}
