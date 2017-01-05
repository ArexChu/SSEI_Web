package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_piSafeCheck2")
public class PISafeCheck2 {

	private long id;//工业管道安装安全质量监督检验记录（续二）
	private PipeInstall pipeInstall;
	private String pi_InsPro_1;//工业管道防腐、绝热施工质量抽查记录
	private String pi_InsPro_2;
	private String pi_InsPro_3;
	private String pi_InsPro_4;
	private String pi_InsPro_5;
	private String pi_InsPro_6;
	private String pi_InsPro_7;
	private String pi_InsPro_8;
	private String pi_InsPro_9;
	private String pi_InsPro_10;
	
	private String pi_Dry_1;//工业管道通球、扫线、干燥质量审查记录
	private String pi_Dry_2;
	private String pi_Dry_3;
	private String pi_Dry_4;
	private String pi_Dry_5;
	private String pi_Dry_6;
	private String pi_Dry_7;
	private String pi_Dry_8;
	
	private String pi_SafeChe2_Remark;//备注
	private String pi_SafeChe2_Per;//监检人
	private String pi_SafeChe2_Date;//监检日期
	
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
	@OneToOne(mappedBy="piSafeCheck2")
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
	 * @return the pi_InsPro_1
	 */
	public String getPi_InsPro_1() {
		return pi_InsPro_1;
	}
	/**
	 * @param pi_InsPro_1 the pi_InsPro_1 to set
	 */
	public void setPi_InsPro_1(String pi_InsPro_1) {
		this.pi_InsPro_1 = pi_InsPro_1;
	}
	/**
	 * @return the pi_InsPro_2
	 */
	public String getPi_InsPro_2() {
		return pi_InsPro_2;
	}
	/**
	 * @param pi_InsPro_2 the pi_InsPro_2 to set
	 */
	public void setPi_InsPro_2(String pi_InsPro_2) {
		this.pi_InsPro_2 = pi_InsPro_2;
	}
	/**
	 * @return the pi_InsPro_3
	 */
	public String getPi_InsPro_3() {
		return pi_InsPro_3;
	}
	/**
	 * @param pi_InsPro_3 the pi_InsPro_3 to set
	 */
	public void setPi_InsPro_3(String pi_InsPro_3) {
		this.pi_InsPro_3 = pi_InsPro_3;
	}
	/**
	 * @return the pi_InsPro_4
	 */
	public String getPi_InsPro_4() {
		return pi_InsPro_4;
	}
	/**
	 * @param pi_InsPro_4 the pi_InsPro_4 to set
	 */
	public void setPi_InsPro_4(String pi_InsPro_4) {
		this.pi_InsPro_4 = pi_InsPro_4;
	}
	/**
	 * @return the pi_InsPro_5
	 */
	public String getPi_InsPro_5() {
		return pi_InsPro_5;
	}
	/**
	 * @param pi_InsPro_5 the pi_InsPro_5 to set
	 */
	public void setPi_InsPro_5(String pi_InsPro_5) {
		this.pi_InsPro_5 = pi_InsPro_5;
	}
	/**
	 * @return the pi_InsPro_6
	 */
	public String getPi_InsPro_6() {
		return pi_InsPro_6;
	}
	/**
	 * @param pi_InsPro_6 the pi_InsPro_6 to set
	 */
	public void setPi_InsPro_6(String pi_InsPro_6) {
		this.pi_InsPro_6 = pi_InsPro_6;
	}
	/**
	 * @return the pi_InsPro_7
	 */
	public String getPi_InsPro_7() {
		return pi_InsPro_7;
	}
	/**
	 * @param pi_InsPro_7 the pi_InsPro_7 to set
	 */
	public void setPi_InsPro_7(String pi_InsPro_7) {
		this.pi_InsPro_7 = pi_InsPro_7;
	}
	/**
	 * @return the pi_InsPro_8
	 */
	public String getPi_InsPro_8() {
		return pi_InsPro_8;
	}
	/**
	 * @param pi_InsPro_8 the pi_InsPro_8 to set
	 */
	public void setPi_InsPro_8(String pi_InsPro_8) {
		this.pi_InsPro_8 = pi_InsPro_8;
	}
	/**
	 * @return the pi_InsPro_9
	 */
	public String getPi_InsPro_9() {
		return pi_InsPro_9;
	}
	/**
	 * @param pi_InsPro_9 the pi_InsPro_9 to set
	 */
	public void setPi_InsPro_9(String pi_InsPro_9) {
		this.pi_InsPro_9 = pi_InsPro_9;
	}
	/**
	 * @return the pi_InsPro_10
	 */
	public String getPi_InsPro_10() {
		return pi_InsPro_10;
	}
	/**
	 * @param pi_InsPro_10 the pi_InsPro_10 to set
	 */
	public void setPi_InsPro_10(String pi_InsPro_10) {
		this.pi_InsPro_10 = pi_InsPro_10;
	}
	
	/**
	 * @return the pi_Dry_1
	 */
	public String getPi_Dry_1() {
		return pi_Dry_1;
	}
	/**
	 * @param pi_Dry_1 the pi_Dry_1 to set
	 */
	public void setPi_Dry_1(String pi_Dry_1) {
		this.pi_Dry_1 = pi_Dry_1;
	}
	/**
	 * @return the pi_Dry_2
	 */
	public String getPi_Dry_2() {
		return pi_Dry_2;
	}
	/**
	 * @param pi_Dry_2 the pi_Dry_2 to set
	 */
	public void setPi_Dry_2(String pi_Dry_2) {
		this.pi_Dry_2 = pi_Dry_2;
	}
	/**
	 * @return the pi_Dry_3
	 */
	public String getPi_Dry_3() {
		return pi_Dry_3;
	}
	/**
	 * @param pi_Dry_3 the pi_Dry_3 to set
	 */
	public void setPi_Dry_3(String pi_Dry_3) {
		this.pi_Dry_3 = pi_Dry_3;
	}
	/**
	 * @return the pi_Dry_4
	 */
	public String getPi_Dry_4() {
		return pi_Dry_4;
	}
	/**
	 * @param pi_Dry_4 the pi_Dry_4 to set
	 */
	public void setPi_Dry_4(String pi_Dry_4) {
		this.pi_Dry_4 = pi_Dry_4;
	}
	/**
	 * @return the pi_Dry_5
	 */
	public String getPi_Dry_5() {
		return pi_Dry_5;
	}
	/**
	 * @param pi_Dry_5 the pi_Dry_5 to set
	 */
	public void setPi_Dry_5(String pi_Dry_5) {
		this.pi_Dry_5 = pi_Dry_5;
	}
	/**
	 * @return the pi_Dry_6
	 */
	public String getPi_Dry_6() {
		return pi_Dry_6;
	}
	/**
	 * @param pi_Dry_6 the pi_Dry_6 to set
	 */
	public void setPi_Dry_6(String pi_Dry_6) {
		this.pi_Dry_6 = pi_Dry_6;
	}
	/**
	 * @return the pi_Dry_7
	 */
	public String getPi_Dry_7() {
		return pi_Dry_7;
	}
	/**
	 * @param pi_Dry_7 the pi_Dry_7 to set
	 */
	public void setPi_Dry_7(String pi_Dry_7) {
		this.pi_Dry_7 = pi_Dry_7;
	}
	/**
	 * @return the pi_Dry_8
	 */
	public String getPi_Dry_8() {
		return pi_Dry_8;
	}
	/**
	 * @param pi_Dry_8 the pi_Dry_8 to set
	 */
	public void setPi_Dry_8(String pi_Dry_8) {
		this.pi_Dry_8 = pi_Dry_8;
	}
	
	/**
	 * @return the pi_SafeChe2_Remark
	 */
	public String getPi_SafeChe2_Remark() {
		return pi_SafeChe2_Remark;
	}
	/**
	 * @param pi_SafeChe2_Remark the pi_SafeChe2_Remark to set
	 */
	public void setPi_SafeChe2_Remark(String pi_SafeChe2_Remark) {
		this.pi_SafeChe2_Remark = pi_SafeChe2_Remark;
	}
	/**
	 * @return the pi_SafeChe2_Per
	 */
	public String getPi_SafeChe2_Per() {
		return pi_SafeChe2_Per;
	}
	/**
	 * @param pi_SafeChe2_Per the pi_SafeChe2_Per to set
	 */
	public void setPi_SafeChe2_Per(String pi_SafeChe2_Per) {
		this.pi_SafeChe2_Per = pi_SafeChe2_Per;
	}
	/**
	 * @return the pi_SafeChe2_Date
	 */
	public String getPi_SafeChe2_Date() {
		return pi_SafeChe2_Date;
	}
	/**
	 * @param pi_SafeChe2_Date the pi_SafeChe2_Date to set
	 */
	public void setPi_SafeChe2_Date(String pi_SafeChe2_Date) {
		this.pi_SafeChe2_Date = pi_SafeChe2_Date;
	}
	
	
	
}
