package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_piReview")
public class PIReview {

	private long id;//压力管道底片复审记录表
	private PipeInstall pipeInstall;
	private String pi_PID;//工程编号
	private String pi_Rev_PID;//管线编号
	private String pi_Rev_Ration;//检测比例
	private String pi_Rev_Cri;//评定标准
	private String pi_Rev_Num;//拍片总数
	private String pi_Rev_Che_Num;//抽查片数
	private String pi_Rev_Che_Ration;//抽查比例 
	private String pi_Rev_Gra;//合格级别
	private String pi_Rev_Che1;//管口号/底片号
	private String pi_Rev_value1;//抽查结果，数量，备注
	private String pi_Rev_value2;
	private String pi_Rev_value3;
	private String pi_Rev_value4;
	private String pi_Rev_value5;
	private String pi_Rev_value6;
	private String pi_Rev_value7;
	private String pi_Rev_value8;
	private String pi_Rev_value9;
	private String pi_Rev_value10;
	private String pi_Rev_value11;
	private String pi_Rev_value12;
	private String pi_Rev_value13;
	private String pi_Rev_value14;
	private String pi_Rev_value15;
	private String pi_Rev_value16;
	private String pi_Rev_value17;
	private String pi_Rev_value18;
	private String pi_Rev_value19;
	private String pi_Rev_value20;
	private String pi_Rev_Per_Name;
	private String pi_Rev_Date;
	
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
	 * @return the pi_PID
	 */
	public String getPi_PID() {
		return pi_PID;
	}
	/**
	 * @param pi_PID the pi_PID to set
	 */
	public void setPi_PID(String pi_PID) {
		this.pi_PID = pi_PID;
	}
	/**
	 * @return the pipeInstall
	 */
	@OneToOne(mappedBy="piReview")
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
	 * @return the pi_Rev_PID
	 */
	public String getPi_Rev_PID() {
		return pi_Rev_PID;
	}
	/**
	 * @param pi_Rev_PID the pi_Rev_PID to set
	 */
	public void setPi_Rev_PID(String pi_Rev_PID) {
		this.pi_Rev_PID = pi_Rev_PID;
	}
	/**
	 * @return the pi_Rev_Ration
	 */
	public String getPi_Rev_Ration() {
		return pi_Rev_Ration;
	}
	/**
	 * @param pi_Rev_Ration the pi_Rev_Ration to set
	 */
	public void setPi_Rev_Ration(String pi_Rev_Ration) {
		this.pi_Rev_Ration = pi_Rev_Ration;
	}
	/**
	 * @return the pi_Rev_Cri
	 */
	public String getPi_Rev_Cri() {
		return pi_Rev_Cri;
	}
	/**
	 * @param pi_Rev_Cri the pi_Rev_Cri to set
	 */
	public void setPi_Rev_Cri(String pi_Rev_Cri) {
		this.pi_Rev_Cri = pi_Rev_Cri;
	}
	/**
	 * @return the pi_Rev_Num
	 */
	public String getPi_Rev_Num() {
		return pi_Rev_Num;
	}
	/**
	 * @param pi_Rev_Num the pi_Rev_Num to set
	 */
	public void setPi_Rev_Num(String pi_Rev_Num) {
		this.pi_Rev_Num = pi_Rev_Num;
	}
	/**
	 * @return the pi_Rev_Che_Num
	 */
	public String getPi_Rev_Che_Num() {
		return pi_Rev_Che_Num;
	}
	/**
	 * @param pi_Rev_Che_Num the pi_Rev_Che_Num to set
	 */
	public void setPi_Rev_Che_Num(String pi_Rev_Che_Num) {
		this.pi_Rev_Che_Num = pi_Rev_Che_Num;
	}
	/**
	 * @return the pi_Rev_Che_Ration
	 */
	public String getPi_Rev_Che_Ration() {
		return pi_Rev_Che_Ration;
	}
	/**
	 * @param pi_Rev_Che_Ration the pi_Rev_Che_Ration to set
	 */
	public void setPi_Rev_Che_Ration(String pi_Rev_Che_Ration) {
		this.pi_Rev_Che_Ration = pi_Rev_Che_Ration;
	}
	/**
	 * @return the pi_Rev_Gra
	 */
	public String getPi_Rev_Gra() {
		return pi_Rev_Gra;
	}
	/**
	 * @param pi_Rev_Gra the pi_Rev_Gra to set
	 */
	public void setPi_Rev_Gra(String pi_Rev_Gra) {
		this.pi_Rev_Gra = pi_Rev_Gra;
	}
	/**
	 * @return the pi_Rev_Che1
	 */
	public String getPi_Rev_Che1() {
		return pi_Rev_Che1;
	}
	/**
	 * @param pi_Rev_Che1 the pi_Rev_Che1 to set
	 */
	public void setPi_Rev_Che1(String pi_Rev_Che1) {
		this.pi_Rev_Che1 = pi_Rev_Che1;
	}
	
	/**
	 * @return the pi_Rev_value1
	 */
	public String getPi_Rev_value1() {
		return pi_Rev_value1;
	}
	/**
	 * @param pi_Rev_value1 the pi_Rev_value1 to set
	 */
	public void setPi_Rev_value1(String pi_Rev_value1) {
		this.pi_Rev_value1 = pi_Rev_value1;
	}
	/**
	 * @return the pi_Rev_value2
	 */
	public String getPi_Rev_value2() {
		return pi_Rev_value2;
	}
	/**
	 * @param pi_Rev_value2 the pi_Rev_value2 to set
	 */
	public void setPi_Rev_value2(String pi_Rev_value2) {
		this.pi_Rev_value2 = pi_Rev_value2;
	}
	/**
	 * @return the pi_Rev_value3
	 */
	public String getPi_Rev_value3() {
		return pi_Rev_value3;
	}
	/**
	 * @param pi_Rev_value3 the pi_Rev_value3 to set
	 */
	public void setPi_Rev_value3(String pi_Rev_value3) {
		this.pi_Rev_value3 = pi_Rev_value3;
	}
	/**
	 * @return the pi_Rev_value4
	 */
	public String getPi_Rev_value4() {
		return pi_Rev_value4;
	}
	/**
	 * @param pi_Rev_value4 the pi_Rev_value4 to set
	 */
	public void setPi_Rev_value4(String pi_Rev_value4) {
		this.pi_Rev_value4 = pi_Rev_value4;
	}
	/**
	 * @return the pi_Rev_value5
	 */
	public String getPi_Rev_value5() {
		return pi_Rev_value5;
	}
	/**
	 * @param pi_Rev_value5 the pi_Rev_value5 to set
	 */
	public void setPi_Rev_value5(String pi_Rev_value5) {
		this.pi_Rev_value5 = pi_Rev_value5;
	}
	/**
	 * @return the pi_Rev_value6
	 */
	public String getPi_Rev_value6() {
		return pi_Rev_value6;
	}
	/**
	 * @param pi_Rev_value6 the pi_Rev_value6 to set
	 */
	public void setPi_Rev_value6(String pi_Rev_value6) {
		this.pi_Rev_value6 = pi_Rev_value6;
	}
	/**
	 * @return the pi_Rev_value7
	 */
	public String getPi_Rev_value7() {
		return pi_Rev_value7;
	}
	/**
	 * @param pi_Rev_value7 the pi_Rev_value7 to set
	 */
	public void setPi_Rev_value7(String pi_Rev_value7) {
		this.pi_Rev_value7 = pi_Rev_value7;
	}
	/**
	 * @return the pi_Rev_value8
	 */
	public String getPi_Rev_value8() {
		return pi_Rev_value8;
	}
	/**
	 * @param pi_Rev_value8 the pi_Rev_value8 to set
	 */
	public void setPi_Rev_value8(String pi_Rev_value8) {
		this.pi_Rev_value8 = pi_Rev_value8;
	}
	/**
	 * @return the pi_Rev_value9
	 */
	public String getPi_Rev_value9() {
		return pi_Rev_value9;
	}
	/**
	 * @param pi_Rev_value9 the pi_Rev_value9 to set
	 */
	public void setPi_Rev_value9(String pi_Rev_value9) {
		this.pi_Rev_value9 = pi_Rev_value9;
	}
	/**
	 * @return the pi_Rev_value10
	 */
	public String getPi_Rev_value10() {
		return pi_Rev_value10;
	}
	/**
	 * @param pi_Rev_value10 the pi_Rev_value10 to set
	 */
	public void setPi_Rev_value10(String pi_Rev_value10) {
		this.pi_Rev_value10 = pi_Rev_value10;
	}
	/**
	 * @return the pi_Rev_value11
	 */
	public String getPi_Rev_value11() {
		return pi_Rev_value11;
	}
	/**
	 * @param pi_Rev_value11 the pi_Rev_value11 to set
	 */
	public void setPi_Rev_value11(String pi_Rev_value11) {
		this.pi_Rev_value11 = pi_Rev_value11;
	}
	/**
	 * @return the pi_Rev_value12
	 */
	public String getPi_Rev_value12() {
		return pi_Rev_value12;
	}
	/**
	 * @param pi_Rev_value12 the pi_Rev_value12 to set
	 */
	public void setPi_Rev_value12(String pi_Rev_value12) {
		this.pi_Rev_value12 = pi_Rev_value12;
	}
	/**
	 * @return the pi_Rev_value13
	 */
	public String getPi_Rev_value13() {
		return pi_Rev_value13;
	}
	/**
	 * @param pi_Rev_value13 the pi_Rev_value13 to set
	 */
	public void setPi_Rev_value13(String pi_Rev_value13) {
		this.pi_Rev_value13 = pi_Rev_value13;
	}
	/**
	 * @return the pi_Rev_value14
	 */
	public String getPi_Rev_value14() {
		return pi_Rev_value14;
	}
	/**
	 * @param pi_Rev_value14 the pi_Rev_value14 to set
	 */
	public void setPi_Rev_value14(String pi_Rev_value14) {
		this.pi_Rev_value14 = pi_Rev_value14;
	}
	/**
	 * @return the pi_Rev_value15
	 */
	public String getPi_Rev_value15() {
		return pi_Rev_value15;
	}
	/**
	 * @param pi_Rev_value15 the pi_Rev_value15 to set
	 */
	public void setPi_Rev_value15(String pi_Rev_value15) {
		this.pi_Rev_value15 = pi_Rev_value15;
	}
	/**
	 * @return the pi_Rev_value16
	 */
	public String getPi_Rev_value16() {
		return pi_Rev_value16;
	}
	/**
	 * @param pi_Rev_value16 the pi_Rev_value16 to set
	 */
	public void setPi_Rev_value16(String pi_Rev_value16) {
		this.pi_Rev_value16 = pi_Rev_value16;
	}
	/**
	 * @return the pi_Rev_value17
	 */
	public String getPi_Rev_value17() {
		return pi_Rev_value17;
	}
	/**
	 * @param pi_Rev_value17 the pi_Rev_value17 to set
	 */
	public void setPi_Rev_value17(String pi_Rev_value17) {
		this.pi_Rev_value17 = pi_Rev_value17;
	}
	/**
	 * @return the pi_Rev_value18
	 */
	public String getPi_Rev_value18() {
		return pi_Rev_value18;
	}
	/**
	 * @param pi_Rev_value18 the pi_Rev_value18 to set
	 */
	public void setPi_Rev_value18(String pi_Rev_value18) {
		this.pi_Rev_value18 = pi_Rev_value18;
	}
	/**
	 * @return the pi_Rev_value19
	 */
	public String getPi_Rev_value19() {
		return pi_Rev_value19;
	}
	/**
	 * @param pi_Rev_value19 the pi_Rev_value19 to set
	 */
	public void setPi_Rev_value19(String pi_Rev_value19) {
		this.pi_Rev_value19 = pi_Rev_value19;
	}
	/**
	 * @return the pi_Rev_value20
	 */
	public String getPi_Rev_value20() {
		return pi_Rev_value20;
	}
	/**
	 * @param pi_Rev_value20 the pi_Rev_value20 to set
	 */
	public void setPi_Rev_value20(String pi_Rev_value20) {
		this.pi_Rev_value20 = pi_Rev_value20;
	}
	/**
	 * @return the pi_Rev_Per_Name
	 */
	public String getPi_Rev_Per_Name() {
		return pi_Rev_Per_Name;
	}
	/**
	 * @param pi_Rev_Per_Name the pi_Rev_Per_Name to set
	 */
	public void setPi_Rev_Per_Name(String pi_Rev_Per_Name) {
		this.pi_Rev_Per_Name = pi_Rev_Per_Name;
	}
	/**
	 * @return the pi_Rev_Date
	 */
	public String getPi_Rev_Date() {
		return pi_Rev_Date;
	}
	/**
	 * @param pi_Rev_Date the pi_Rev_Date to set
	 */
	public void setPi_Rev_Date(String pi_Rev_Date) {
		this.pi_Rev_Date = pi_Rev_Date;
	}
	
	
}
