package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_piLeftProblem")
public class PILeftProblem {

	private long id;//遗留质量问题的处理意见记录
	private PipeInstall pipeInstall;
	private String pi_Left_Prob;//遗留问题：
	private String pi_Left_Opin;//处理意见：
	private String pi_Left_Per_Name;//监检：
	private String pi_Left_Date;//监检日期
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
	 * @return the pipeInstall
	 */
	@OneToOne(mappedBy="piLeftProblem")
	public PipeInstall getPipeInstall() {
		return pipeInstall;
	}
	/**
	 * @param pipeInstall the pipeInstall to set
	 */
	public void setPipeInstall(PipeInstall pipeInstall) {
		this.pipeInstall = pipeInstall;
	}
	/**
	 * @return the pi_Left_Prob
	 */
	public String getPi_Left_Prob() {
		return pi_Left_Prob;
	}
	/**
	 * @param pi_Left_Prob the pi_Left_Prob to set
	 */
	public void setPi_Left_Prob(String pi_Left_Prob) {
		this.pi_Left_Prob = pi_Left_Prob;
	}
	/**
	 * @return the pi_Left_Opin
	 */
	public String getPi_Left_Opin() {
		return pi_Left_Opin;
	}
	/**
	 * @param pi_Left_Opin the pi_Left_Opin to set
	 */
	public void setPi_Left_Opin(String pi_Left_Opin) {
		this.pi_Left_Opin = pi_Left_Opin;
	}
	/**
	 * @return the pi_Left_Per_Name
	 */
	public String getPi_Left_Per_Name() {
		return pi_Left_Per_Name;
	}
	/**
	 * @param pi_Left_Per_Name the pi_Left_Per_Name to set
	 */
	public void setPi_Left_Per_Name(String pi_Left_Per_Name) {
		this.pi_Left_Per_Name = pi_Left_Per_Name;
	}
	/**
	 * @return the pi_Left_Date
	 */
	public String getPi_Left_Date() {
		return pi_Left_Date;
	}
	/**
	 * @param pi_Left_Date the pi_Left_Date to set
	 */
	public void setPi_Left_Date(String pi_Left_Date) {
		this.pi_Left_Date = pi_Left_Date;
	}
	
	

}
