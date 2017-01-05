package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_piSafeCheck")
public class PISafeCheck {

	private long id;//压力管道安装安全质量监督检验记录
	private PipeInstall pipeInstall;
	private String pi_Wel_Ma_1;//工业管道元件及焊接材料的材质审查记录（管子、管件、阀门、法兰、焊材等）
	private String pi_Wel_Ma_2;
	private String pi_Wel_Ma_3;
	private String pi_Wel_Ma_4;
	private String pi_Wel_Ma_5;
	private String pi_Wel_Ma_6;
	private String pi_Wel_Ma_7;
	private String pi_Wel_Ma_8;
	private String pi_Wel_Ma_9;
	private String pi_Wel_Ma_10;
	private String pi_Wel_Qua_1;//工业管道焊接质量抽查记录
	private String pi_Wel_Qua_2;
	private String pi_Wel_Qua_3;
	private String pi_Wel_Qua_4;
	private String pi_Wel_Qua_5;
	private String pi_Wel_Qua_6;
	private String pi_Wel_Qua_7;
	private String pi_Wel_Qua_8;
	private String pi_SafeChe_Remark;//备注
	private String pi_SafeChe_Per;//监检人
	private String pi_SafeChe_Date;//监检日期
	
	
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
	@OneToOne(mappedBy="piSafeCheck")
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
	 * @return the pi_Wel_Ma_1
	 */
	public String getPi_Wel_Ma_1() {
		return pi_Wel_Ma_1;
	}
	/**
	 * @param pi_Wel_Ma_1 the pi_Wel_Ma_1 to set
	 */
	public void setPi_Wel_Ma_1(String pi_Wel_Ma_1) {
		this.pi_Wel_Ma_1 = pi_Wel_Ma_1;
	}
	/**
	 * @return the pi_Wel_Ma_2
	 */
	public String getPi_Wel_Ma_2() {
		return pi_Wel_Ma_2;
	}
	/**
	 * @param pi_Wel_Ma_2 the pi_Wel_Ma_2 to set
	 */
	public void setPi_Wel_Ma_2(String pi_Wel_Ma_2) {
		this.pi_Wel_Ma_2 = pi_Wel_Ma_2;
	}
	/**
	 * @return the pi_Wel_Ma_3
	 */
	public String getPi_Wel_Ma_3() {
		return pi_Wel_Ma_3;
	}
	/**
	 * @param pi_Wel_Ma_3 the pi_Wel_Ma_3 to set
	 */
	public void setPi_Wel_Ma_3(String pi_Wel_Ma_3) {
		this.pi_Wel_Ma_3 = pi_Wel_Ma_3;
	}
	/**
	 * @return the pi_Wel_Ma_4
	 */
	public String getPi_Wel_Ma_4() {
		return pi_Wel_Ma_4;
	}
	/**
	 * @param pi_Wel_Ma_4 the pi_Wel_Ma_4 to set
	 */
	public void setPi_Wel_Ma_4(String pi_Wel_Ma_4) {
		this.pi_Wel_Ma_4 = pi_Wel_Ma_4;
	}
	/**
	 * @return the pi_Wel_Ma_5
	 */
	public String getPi_Wel_Ma_5() {
		return pi_Wel_Ma_5;
	}
	/**
	 * @param pi_Wel_Ma_5 the pi_Wel_Ma_5 to set
	 */
	public void setPi_Wel_Ma_5(String pi_Wel_Ma_5) {
		this.pi_Wel_Ma_5 = pi_Wel_Ma_5;
	}
	/**
	 * @return the pi_Wel_Ma_6
	 */
	public String getPi_Wel_Ma_6() {
		return pi_Wel_Ma_6;
	}
	/**
	 * @param pi_Wel_Ma_6 the pi_Wel_Ma_6 to set
	 */
	public void setPi_Wel_Ma_6(String pi_Wel_Ma_6) {
		this.pi_Wel_Ma_6 = pi_Wel_Ma_6;
	}
	/**
	 * @return the pi_Wel_Ma_7
	 */
	public String getPi_Wel_Ma_7() {
		return pi_Wel_Ma_7;
	}
	/**
	 * @param pi_Wel_Ma_7 the pi_Wel_Ma_7 to set
	 */
	public void setPi_Wel_Ma_7(String pi_Wel_Ma_7) {
		this.pi_Wel_Ma_7 = pi_Wel_Ma_7;
	}
	/**
	 * @return the pi_Wel_Ma_8
	 */
	public String getPi_Wel_Ma_8() {
		return pi_Wel_Ma_8;
	}
	/**
	 * @param pi_Wel_Ma_8 the pi_Wel_Ma_8 to set
	 */
	public void setPi_Wel_Ma_8(String pi_Wel_Ma_8) {
		this.pi_Wel_Ma_8 = pi_Wel_Ma_8;
	}
	/**
	 * @return the pi_Wel_Ma_9
	 */
	public String getPi_Wel_Ma_9() {
		return pi_Wel_Ma_9;
	}
	/**
	 * @param pi_Wel_Ma_9 the pi_Wel_Ma_9 to set
	 */
	public void setPi_Wel_Ma_9(String pi_Wel_Ma_9) {
		this.pi_Wel_Ma_9 = pi_Wel_Ma_9;
	}
	/**
	 * @return the pi_Wel_Ma_10
	 */
	public String getPi_Wel_Ma_10() {
		return pi_Wel_Ma_10;
	}
	/**
	 * @param pi_Wel_Ma_10 the pi_Wel_Ma_10 to set
	 */
	public void setPi_Wel_Ma_10(String pi_Wel_Ma_10) {
		this.pi_Wel_Ma_10 = pi_Wel_Ma_10;
	}
	
	/**
	 * @return the pi_Wel_Qua_1
	 */
	public String getPi_Wel_Qua_1() {
		return pi_Wel_Qua_1;
	}
	/**
	 * @param pi_Wel_Qua_1 the pi_Wel_Qua_1 to set
	 */
	public void setPi_Wel_Qua_1(String pi_Wel_Qua_1) {
		this.pi_Wel_Qua_1 = pi_Wel_Qua_1;
	}
	/**
	 * @return the pi_Wel_Qua_2
	 */
	public String getPi_Wel_Qua_2() {
		return pi_Wel_Qua_2;
	}
	/**
	 * @param pi_Wel_Qua_2 the pi_Wel_Qua_2 to set
	 */
	public void setPi_Wel_Qua_2(String pi_Wel_Qua_2) {
		this.pi_Wel_Qua_2 = pi_Wel_Qua_2;
	}
	/**
	 * @return the pi_Wel_Qua_3
	 */
	public String getPi_Wel_Qua_3() {
		return pi_Wel_Qua_3;
	}
	/**
	 * @param pi_Wel_Qua_3 the pi_Wel_Qua_3 to set
	 */
	public void setPi_Wel_Qua_3(String pi_Wel_Qua_3) {
		this.pi_Wel_Qua_3 = pi_Wel_Qua_3;
	}
	/**
	 * @return the pi_Wel_Qua_4
	 */
	public String getPi_Wel_Qua_4() {
		return pi_Wel_Qua_4;
	}
	/**
	 * @param pi_Wel_Qua_4 the pi_Wel_Qua_4 to set
	 */
	public void setPi_Wel_Qua_4(String pi_Wel_Qua_4) {
		this.pi_Wel_Qua_4 = pi_Wel_Qua_4;
	}
	/**
	 * @return the pi_Wel_Qua_5
	 */
	public String getPi_Wel_Qua_5() {
		return pi_Wel_Qua_5;
	}
	/**
	 * @param pi_Wel_Qua_5 the pi_Wel_Qua_5 to set
	 */
	public void setPi_Wel_Qua_5(String pi_Wel_Qua_5) {
		this.pi_Wel_Qua_5 = pi_Wel_Qua_5;
	}
	/**
	 * @return the pi_Wel_Qua_6
	 */
	public String getPi_Wel_Qua_6() {
		return pi_Wel_Qua_6;
	}
	/**
	 * @param pi_Wel_Qua_6 the pi_Wel_Qua_6 to set
	 */
	public void setPi_Wel_Qua_6(String pi_Wel_Qua_6) {
		this.pi_Wel_Qua_6 = pi_Wel_Qua_6;
	}
	/**
	 * @return the pi_Wel_Qua_7
	 */
	public String getPi_Wel_Qua_7() {
		return pi_Wel_Qua_7;
	}
	/**
	 * @param pi_Wel_Qua_7 the pi_Wel_Qua_7 to set
	 */
	public void setPi_Wel_Qua_7(String pi_Wel_Qua_7) {
		this.pi_Wel_Qua_7 = pi_Wel_Qua_7;
	}
	/**
	 * @return the pi_Wel_Qua_8
	 */
	public String getPi_Wel_Qua_8() {
		return pi_Wel_Qua_8;
	}
	/**
	 * @param pi_Wel_Qua_8 the pi_Wel_Qua_8 to set
	 */
	public void setPi_Wel_Qua_8(String pi_Wel_Qua_8) {
		this.pi_Wel_Qua_8 = pi_Wel_Qua_8;
	}
	
	/**
	 * @return the pi_SafeChe_Remark
	 */
	public String getPi_SafeChe_Remark() {
		return pi_SafeChe_Remark;
	}
	/**
	 * @param pi_SafeChe_Remark the pi_SafeChe_Remark to set
	 */
	public void setPi_SafeChe_Remark(String pi_SafeChe_Remark) {
		this.pi_SafeChe_Remark = pi_SafeChe_Remark;
	}
	/**
	 * @return the pi_SafeChe_Per
	 */
	public String getPi_SafeChe_Per() {
		return pi_SafeChe_Per;
	}
	/**
	 * @param pi_SafeChe_Per the pi_SafeChe_Per to set
	 */
	public void setPi_SafeChe_Per(String pi_SafeChe_Per) {
		this.pi_SafeChe_Per = pi_SafeChe_Per;
	}
	/**
	 * @return the pi_SafeChe_Date
	 */
	public String getPi_SafeChe_Date() {
		return pi_SafeChe_Date;
	}
	/**
	 * @param pi_SafeChe_Date the pi_SafeChe_Date to set
	 */
	public void setPi_SafeChe_Date(String pi_SafeChe_Date) {
		this.pi_SafeChe_Date = pi_SafeChe_Date;
	}
	
	
	

}
