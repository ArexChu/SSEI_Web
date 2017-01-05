package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cn.ecust.ssei.domain.Company;

@Entity
@Table(name="ssei_pipeInstall")
public class PipeInstall {

	private long id;
	private String pi_ID;//项目编号
	private String pi_Name;//项目名称
	private Company pi_Cons_Com;//建设单位
	private Company pi_Ins_Com;//安装单位
	private String pi_Check_Date;//监督检验日期
	private String pi_finished;//安装是否完成 1：未完成 2：完成

	/**
	 * 包含的检验项目
	 */
	private PIBasic piBasic;//工业管道基本情况记录
	private PICheckInf piCheckInf;//工作内容及工作基本情况记录
	private PIComInf piComInf;//相关单位安全质量管理行为的评价记录
	private PIConclusion piConclusion;//监督检验结论记录
	private PipeCompleteInf pipeCompleteInf;//管道安装竣工资料审查报告记录
	private PIReview piReview;//压力管道底片复审记录表
	private PISafeCheck piSafeCheck;//压力管道安装安全质量监督检验记录
	private PISafeCheck1 piSafeCheck1;//工业管道安装安全质量监督检验记录（续一）
	private PISafeCheck2 piSafeCheck2;//工业管道安装安全质量监督检验记录（续二）
	private PISafeCheck3 piSafeCheck3;//工业管道安装安全质量监督检验记录（续三）
	private PILeftProblem piLeftProblem;//遗留质量问题的处理意见记录

	/**
	 * @return the piBasic
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piBasciId")
	public PIBasic getPiBasic() {
		return piBasic;
	}
	
	
	
	
	/**
	 * @return the pi_finished
	 */
	public String getPi_finished() {
		return pi_finished;
	}




	/**
	 * @param pi_finished the pi_finished to set
	 */
	public void setPi_finished(String pi_finished) {
		this.pi_finished = pi_finished;
	}




	/**
	 * @param piBasic the piBasic to set
	 */
	public void setPiBasic(PIBasic piBasic) {
		this.piBasic = piBasic;
	}

	/**
	 * @return the piCheckInf
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piCheckInfId")
	public PICheckInf getPiCheckInf() {
		return piCheckInf;
	}

	/**
	 * @param piCheckInf the piCheckInf to set
	 */
	public void setPiCheckInf(PICheckInf piCheckInf) {
		this.piCheckInf = piCheckInf;
	}

	/**
	 * @return the piComInf
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piComInfId")
	public PIComInf getPiComInf() {
		return piComInf;
	}

	/**
	 * @param piComInf the piComInf to set
	 */
	public void setPiComInf(PIComInf piComInf) {
		this.piComInf = piComInf;
	}

	/**
	 * @return the piConclusion
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piConclusionId")
	public PIConclusion getPiConclusion() {
		return piConclusion;
	}

	/**
	 * @param piConclusion the piConclusion to set
	 */
	public void setPiConclusion(PIConclusion piConclusion) {
		this.piConclusion = piConclusion;
	}

	/**
	 * @return the pipeCompleteInf
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "pipeCompleteInfId")
	public PipeCompleteInf getPipeCompleteInf() {
		return pipeCompleteInf;
	}

	/**
	 * @param pipeCompleteInf the pipeCompleteInf to set
	 */
	public void setPipeCompleteInf(PipeCompleteInf pipeCompleteInf) {
		this.pipeCompleteInf = pipeCompleteInf;
	}

	/**
	 * @return the piReview
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piReviewId")
	public PIReview getPiReview() {
		return piReview;
	}

	/**
	 * @param piReview the piReview to set
	 */
	public void setPiReview(PIReview piReview) {
		this.piReview = piReview;
	}

	/**
	 * @return the piSafeCheck
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piSafeCheck")
	public PISafeCheck getPiSafeCheck() {
		return piSafeCheck;
	}

	/**
	 * @param piSafeCheck the piSafeCheck to set
	 */
	public void setPiSafeCheck(PISafeCheck piSafeCheck) {
		this.piSafeCheck = piSafeCheck;
	}

	/**
	 * @return the piSafeCheck1
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piSafeCheck1")
	public PISafeCheck1 getPiSafeCheck1() {
		return piSafeCheck1;
	}

	/**
	 * @param piSafeCheck1 the piSafeCheck1 to set
	 */
	public void setPiSafeCheck1(PISafeCheck1 piSafeCheck1) {
		this.piSafeCheck1 = piSafeCheck1;
	}

	/**
	 * @return the piSafeCheck2
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piSafeCheck2")
	public PISafeCheck2 getPiSafeCheck2() {
		return piSafeCheck2;
	}

	/**
	 * @param piSafeCheck2 the piSafeCheck2 to set
	 */
	public void setPiSafeCheck2(PISafeCheck2 piSafeCheck2) {
		this.piSafeCheck2 = piSafeCheck2;
	}

	/**
	 * @return the piSafeCheck3
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piSafeCheck3")
	public PISafeCheck3 getPiSafeCheck3() {
		return piSafeCheck3;
	}

	/**
	 * @param piSafeCheck3 the piSafeCheck3 to set
	 */
	public void setPiSafeCheck3(PISafeCheck3 piSafeCheck3) {
		this.piSafeCheck3 = piSafeCheck3;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	
	/**
	 * @return the pi_Cons_Com
	 */
	@ManyToOne
	@JoinColumn(name="constructComId")
	public Company getPi_Cons_Com() {
		return pi_Cons_Com;
	}



	/**
	 * @param pi_Cons_Com the pi_Cons_Com to set
	 */
	public void setPi_Cons_Com(Company pi_Cons_Com) {
		this.pi_Cons_Com = pi_Cons_Com;
	}
	

	/**
	 * @return the piLeftProblem
	 */
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "piLeftProblemId")
	public PILeftProblem getPiLeftProblem() {
		return piLeftProblem;
	}

	/**
	 * @param piLeftProblem the piLeftProblem to set
	 */
	public void setPiLeftProblem(PILeftProblem piLeftProblem) {
		this.piLeftProblem = piLeftProblem;
	}

	/**
	 * @return the pi_Ins_Com
	 */
	@ManyToOne
	@JoinColumn(name="installComId")
	public Company getPi_Ins_Com() {
		return pi_Ins_Com;
	}



	/**
	 * @param pi_Ins_Com the pi_Ins_Com to set
	 */
	public void setPi_Ins_Com(Company pi_Ins_Com) {
		this.pi_Ins_Com = pi_Ins_Com;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the pi_ID
	 */
	public String getPi_ID() {
		return pi_ID;
	}

	/**
	 * @param pi_ID the pi_ID to set
	 */
	public void setPi_ID(String pi_ID) {
		this.pi_ID = pi_ID;
	}

	/**
	 * @return the pi_Name
	 */
	public String getPi_Name() {
		return pi_Name;
	}

	/**
	 * @param pi_Name the pi_Name to set
	 */
	public void setPi_Name(String pi_Name) {
		this.pi_Name = pi_Name;
	}

	/**
	 * @return the pi_Check_Date
	 */
	public String getPi_Check_Date() {
		return pi_Check_Date;
	}

	/**
	 * @param pi_Check_Date the pi_Check_Date to set
	 */
	public void setPi_Check_Date(String pi_Check_Date) {
		this.pi_Check_Date = pi_Check_Date;
	}

	
	
	
	
}
