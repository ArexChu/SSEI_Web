package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_piSafeCheck3")
public class PISafeCheck3 {

	private long id;//工业管道安装安全质量监督检验记录（续san）
	private PipeInstall pipeInstall;
	private String pi_Leak_1;//工业管道强度试验、泄漏性试验记录
	private String pi_Leak_2;
	private String pi_Leak_3;
	private String pi_Leak_4;
	private String pi_Leak_5;
	private String pi_Leak_6;
	private String pi_Leak_7;
	private String pi_Leak_8;
	
	private String pi_SafeEqu_1;//工业管道安全保护装置检查记录
	private String pi_SafeEqu_2;
	private String pi_SafeEqu_3;
	private String pi_SafeEqu_4;
	private String pi_SafeEqu_5;
	private String pi_SafeEqu_6;
	private String pi_SafeEqu_7;
	private String pi_SafeEqu_8;
	
	private String pi_SafeChe3_Remark;//备注
	private String pi_SafeChe3_Per;//监检人
	private String pi_SafeChe3_Date;//监检日期
	
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
	@OneToOne(mappedBy="piSafeCheck3")
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
	 * @return the pi_Leak_1
	 */
	public String getPi_Leak_1() {
		return pi_Leak_1;
	}
	/**
	 * @param pi_Leak_1 the pi_Leak_1 to set
	 */
	public void setPi_Leak_1(String pi_Leak_1) {
		this.pi_Leak_1 = pi_Leak_1;
	}
	/**
	 * @return the pi_Leak_2
	 */
	public String getPi_Leak_2() {
		return pi_Leak_2;
	}
	/**
	 * @param pi_Leak_2 the pi_Leak_2 to set
	 */
	public void setPi_Leak_2(String pi_Leak_2) {
		this.pi_Leak_2 = pi_Leak_2;
	}
	/**
	 * @return the pi_Leak_3
	 */
	public String getPi_Leak_3() {
		return pi_Leak_3;
	}
	/**
	 * @param pi_Leak_3 the pi_Leak_3 to set
	 */
	public void setPi_Leak_3(String pi_Leak_3) {
		this.pi_Leak_3 = pi_Leak_3;
	}
	/**
	 * @return the pi_Leak_4
	 */
	public String getPi_Leak_4() {
		return pi_Leak_4;
	}
	/**
	 * @param pi_Leak_4 the pi_Leak_4 to set
	 */
	public void setPi_Leak_4(String pi_Leak_4) {
		this.pi_Leak_4 = pi_Leak_4;
	}
	/**
	 * @return the pi_Leak_5
	 */
	public String getPi_Leak_5() {
		return pi_Leak_5;
	}
	/**
	 * @param pi_Leak_5 the pi_Leak_5 to set
	 */
	public void setPi_Leak_5(String pi_Leak_5) {
		this.pi_Leak_5 = pi_Leak_5;
	}
	/**
	 * @return the pi_Leak_6
	 */
	public String getPi_Leak_6() {
		return pi_Leak_6;
	}
	/**
	 * @param pi_Leak_6 the pi_Leak_6 to set
	 */
	public void setPi_Leak_6(String pi_Leak_6) {
		this.pi_Leak_6 = pi_Leak_6;
	}
	/**
	 * @return the pi_Leak_7
	 */
	public String getPi_Leak_7() {
		return pi_Leak_7;
	}
	/**
	 * @param pi_Leak_7 the pi_Leak_7 to set
	 */
	public void setPi_Leak_7(String pi_Leak_7) {
		this.pi_Leak_7 = pi_Leak_7;
	}
	/**
	 * @return the pi_Leak_8
	 */
	public String getPi_Leak_8() {
		return pi_Leak_8;
	}
	/**
	 * @param pi_Leak_8 the pi_Leak_8 to set
	 */
	public void setPi_Leak_8(String pi_Leak_8) {
		this.pi_Leak_8 = pi_Leak_8;
	}
	
	/**
	 * @return the pi_SafeEqu_1
	 */
	public String getPi_SafeEqu_1() {
		return pi_SafeEqu_1;
	}
	/**
	 * @param pi_SafeEqu_1 the pi_SafeEqu_1 to set
	 */
	public void setPi_SafeEqu_1(String pi_SafeEqu_1) {
		this.pi_SafeEqu_1 = pi_SafeEqu_1;
	}
	/**
	 * @return the pi_SafeEqu_2
	 */
	public String getPi_SafeEqu_2() {
		return pi_SafeEqu_2;
	}
	/**
	 * @param pi_SafeEqu_2 the pi_SafeEqu_2 to set
	 */
	public void setPi_SafeEqu_2(String pi_SafeEqu_2) {
		this.pi_SafeEqu_2 = pi_SafeEqu_2;
	}
	/**
	 * @return the pi_SafeEqu_3
	 */
	public String getPi_SafeEqu_3() {
		return pi_SafeEqu_3;
	}
	/**
	 * @param pi_SafeEqu_3 the pi_SafeEqu_3 to set
	 */
	public void setPi_SafeEqu_3(String pi_SafeEqu_3) {
		this.pi_SafeEqu_3 = pi_SafeEqu_3;
	}
	/**
	 * @return the pi_SafeEqu_4
	 */
	public String getPi_SafeEqu_4() {
		return pi_SafeEqu_4;
	}
	/**
	 * @param pi_SafeEqu_4 the pi_SafeEqu_4 to set
	 */
	public void setPi_SafeEqu_4(String pi_SafeEqu_4) {
		this.pi_SafeEqu_4 = pi_SafeEqu_4;
	}
	/**
	 * @return the pi_SafeEqu_5
	 */
	public String getPi_SafeEqu_5() {
		return pi_SafeEqu_5;
	}
	/**
	 * @param pi_SafeEqu_5 the pi_SafeEqu_5 to set
	 */
	public void setPi_SafeEqu_5(String pi_SafeEqu_5) {
		this.pi_SafeEqu_5 = pi_SafeEqu_5;
	}
	/**
	 * @return the pi_SafeEqu_6
	 */
	public String getPi_SafeEqu_6() {
		return pi_SafeEqu_6;
	}
	/**
	 * @param pi_SafeEqu_6 the pi_SafeEqu_6 to set
	 */
	public void setPi_SafeEqu_6(String pi_SafeEqu_6) {
		this.pi_SafeEqu_6 = pi_SafeEqu_6;
	}
	/**
	 * @return the pi_SafeEqu_7
	 */
	public String getPi_SafeEqu_7() {
		return pi_SafeEqu_7;
	}
	/**
	 * @param pi_SafeEqu_7 the pi_SafeEqu_7 to set
	 */
	public void setPi_SafeEqu_7(String pi_SafeEqu_7) {
		this.pi_SafeEqu_7 = pi_SafeEqu_7;
	}
	/**
	 * @return the pi_SafeEqu_8
	 */
	public String getPi_SafeEqu_8() {
		return pi_SafeEqu_8;
	}
	/**
	 * @param pi_SafeEqu_8 the pi_SafeEqu_8 to set
	 */
	public void setPi_SafeEqu_8(String pi_SafeEqu_8) {
		this.pi_SafeEqu_8 = pi_SafeEqu_8;
	}
	
	/**
	 * @return the pi_SafeChe3_Remark
	 */
	public String getPi_SafeChe3_Remark() {
		return pi_SafeChe3_Remark;
	}
	/**
	 * @param pi_SafeChe3_Remark the pi_SafeChe3_Remark to set
	 */
	public void setPi_SafeChe3_Remark(String pi_SafeChe3_Remark) {
		this.pi_SafeChe3_Remark = pi_SafeChe3_Remark;
	}
	/**
	 * @return the pi_SafeChe3_Per
	 */
	public String getPi_SafeChe3_Per() {
		return pi_SafeChe3_Per;
	}
	/**
	 * @param pi_SafeChe3_Per the pi_SafeChe3_Per to set
	 */
	public void setPi_SafeChe3_Per(String pi_SafeChe3_Per) {
		this.pi_SafeChe3_Per = pi_SafeChe3_Per;
	}
	/**
	 * @return the pi_SafeChe3_Date
	 */
	public String getPi_SafeChe3_Date() {
		return pi_SafeChe3_Date;
	}
	/**
	 * @param pi_SafeChe3_Date the pi_SafeChe3_Date to set
	 */
	public void setPi_SafeChe3_Date(String pi_SafeChe3_Date) {
		this.pi_SafeChe3_Date = pi_SafeChe3_Date;
	}

}
