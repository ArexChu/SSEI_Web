package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_piSafeCheck1")
public class PISafeCheck1 {

	private long id;//工业管道安装安全质量监督检验记录（续一）
	private PipeInstall pipeInstall;
	private String pi_Compen_1;//工业管道补偿器和热传导支承件安装质量抽查记录
	private String pi_Compen_2;
	private String pi_Compen_3;
	private String pi_Compen_4;
	private String pi_Compen_5;
	private String pi_Appurt_1;//工业管道附属设施和设备安装质量抽查记录
	private String pi_Appurt_2;
	private String pi_Appurt_3;
	private String pi_Appurt_4;
	private String pi_Appurt_5;
	private String pi_Cross_1;//工业管道穿跨越及隐蔽工程安装质量抽查记录
	private String pi_Cross_2;
	private String pi_Cross_3;
	private String pi_Cross_4;
	private String pi_Cross_5;
	private String pi_SafeChe1_Remark;//备注
	private String pi_SafeChe1_Per;//监检人
	private String pi_SafeChe1_Date;//监检日期
	
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
	@OneToOne(mappedBy="piSafeCheck1")
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
	 * @return the pi_Compen_1
	 */
	public String getPi_Compen_1() {
		return pi_Compen_1;
	}
	/**
	 * @param pi_Compen_1 the pi_Compen_1 to set
	 */
	public void setPi_Compen_1(String pi_Compen_1) {
		this.pi_Compen_1 = pi_Compen_1;
	}
	/**
	 * @return the pi_Compen_2
	 */
	public String getPi_Compen_2() {
		return pi_Compen_2;
	}
	/**
	 * @param pi_Compen_2 the pi_Compen_2 to set
	 */
	public void setPi_Compen_2(String pi_Compen_2) {
		this.pi_Compen_2 = pi_Compen_2;
	}
	/**
	 * @return the pi_Compen_3
	 */
	public String getPi_Compen_3() {
		return pi_Compen_3;
	}
	/**
	 * @param pi_Compen_3 the pi_Compen_3 to set
	 */
	public void setPi_Compen_3(String pi_Compen_3) {
		this.pi_Compen_3 = pi_Compen_3;
	}
	/**
	 * @return the pi_Compen_4
	 */
	public String getPi_Compen_4() {
		return pi_Compen_4;
	}
	/**
	 * @param pi_Compen_4 the pi_Compen_4 to set
	 */
	public void setPi_Compen_4(String pi_Compen_4) {
		this.pi_Compen_4 = pi_Compen_4;
	}
	/**
	 * @return the pi_Compen_5
	 */
	public String getPi_Compen_5() {
		return pi_Compen_5;
	}
	/**
	 * @param pi_Compen_5 the pi_Compen_5 to set
	 */
	public void setPi_Compen_5(String pi_Compen_5) {
		this.pi_Compen_5 = pi_Compen_5;
	}
	
	/**
	 * @return the pi_Appurt_1
	 */
	public String getPi_Appurt_1() {
		return pi_Appurt_1;
	}
	/**
	 * @param pi_Appurt_1 the pi_Appurt_1 to set
	 */
	public void setPi_Appurt_1(String pi_Appurt_1) {
		this.pi_Appurt_1 = pi_Appurt_1;
	}
	/**
	 * @return the pi_Appurt_2
	 */
	public String getPi_Appurt_2() {
		return pi_Appurt_2;
	}
	/**
	 * @param pi_Appurt_2 the pi_Appurt_2 to set
	 */
	public void setPi_Appurt_2(String pi_Appurt_2) {
		this.pi_Appurt_2 = pi_Appurt_2;
	}
	/**
	 * @return the pi_Appurt_3
	 */
	public String getPi_Appurt_3() {
		return pi_Appurt_3;
	}
	/**
	 * @param pi_Appurt_3 the pi_Appurt_3 to set
	 */
	public void setPi_Appurt_3(String pi_Appurt_3) {
		this.pi_Appurt_3 = pi_Appurt_3;
	}
	/**
	 * @return the pi_Appurt_4
	 */
	public String getPi_Appurt_4() {
		return pi_Appurt_4;
	}
	/**
	 * @param pi_Appurt_4 the pi_Appurt_4 to set
	 */
	public void setPi_Appurt_4(String pi_Appurt_4) {
		this.pi_Appurt_4 = pi_Appurt_4;
	}
	/**
	 * @return the pi_Appurt_5
	 */
	public String getPi_Appurt_5() {
		return pi_Appurt_5;
	}
	/**
	 * @param pi_Appurt_5 the pi_Appurt_5 to set
	 */
	public void setPi_Appurt_5(String pi_Appurt_5) {
		this.pi_Appurt_5 = pi_Appurt_5;
	}
	
	/**
	 * @return the pi_Cross_1
	 */
	public String getPi_Cross_1() {
		return pi_Cross_1;
	}
	/**
	 * @param pi_Cross_1 the pi_Cross_1 to set
	 */
	public void setPi_Cross_1(String pi_Cross_1) {
		this.pi_Cross_1 = pi_Cross_1;
	}
	/**
	 * @return the pi_Cross_2
	 */
	public String getPi_Cross_2() {
		return pi_Cross_2;
	}
	/**
	 * @param pi_Cross_2 the pi_Cross_2 to set
	 */
	public void setPi_Cross_2(String pi_Cross_2) {
		this.pi_Cross_2 = pi_Cross_2;
	}
	/**
	 * @return the pi_Cross_3
	 */
	public String getPi_Cross_3() {
		return pi_Cross_3;
	}
	/**
	 * @param pi_Cross_3 the pi_Cross_3 to set
	 */
	public void setPi_Cross_3(String pi_Cross_3) {
		this.pi_Cross_3 = pi_Cross_3;
	}
	/**
	 * @return the pi_Cross_4
	 */
	public String getPi_Cross_4() {
		return pi_Cross_4;
	}
	/**
	 * @param pi_Cross_4 the pi_Cross_4 to set
	 */
	public void setPi_Cross_4(String pi_Cross_4) {
		this.pi_Cross_4 = pi_Cross_4;
	}
	/**
	 * @return the pi_Cross_5
	 */
	public String getPi_Cross_5() {
		return pi_Cross_5;
	}
	/**
	 * @param pi_Cross_5 the pi_Cross_5 to set
	 */
	public void setPi_Cross_5(String pi_Cross_5) {
		this.pi_Cross_5 = pi_Cross_5;
	}
	
	/**
	 * @return the pi_SafeChe1_Remark
	 */
	public String getPi_SafeChe1_Remark() {
		return pi_SafeChe1_Remark;
	}
	/**
	 * @param pi_SafeChe1_Remark the pi_SafeChe1_Remark to set
	 */
	public void setPi_SafeChe1_Remark(String pi_SafeChe1_Remark) {
		this.pi_SafeChe1_Remark = pi_SafeChe1_Remark;
	}
	/**
	 * @return the pi_SafeChe1_Per
	 */
	public String getPi_SafeChe1_Per() {
		return pi_SafeChe1_Per;
	}
	/**
	 * @param pi_SafeChe1_Per the pi_SafeChe1_Per to set
	 */
	public void setPi_SafeChe1_Per(String pi_SafeChe1_Per) {
		this.pi_SafeChe1_Per = pi_SafeChe1_Per;
	}
	/**
	 * @return the pi_SafeChe1_Date
	 */
	public String getPi_SafeChe1_Date() {
		return pi_SafeChe1_Date;
	}
	/**
	 * @param pi_SafeChe1_Date the pi_SafeChe1_Date to set
	 */
	public void setPi_SafeChe1_Date(String pi_SafeChe1_Date) {
		this.pi_SafeChe1_Date = pi_SafeChe1_Date;
	}
	
	
	
	
}
