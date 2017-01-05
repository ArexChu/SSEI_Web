package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="ssei_piBasic")
public class PIBasic {

	private long id;//工业管道基本情况记录
	private PipeInstall pipeInstall;
	private String pi_De_Pre;//设计压力
	private String pi_De_Tem;//设计温度
	private String pi_Wo_Med;//输送介质
	private String pi_Gra;//管道级别
	private String pi_De_Cri;//管道设计标准
	private String pi_Ins_Cri;//管道安装标准
	private String pi_Len;//管道长度
	private String pi_Wel_Num;//焊口数量
	private String pi_Wel_Cri;//焊评标准
	private String pi_Wel_Rep;//焊评报告号
	private String pi_Wel_ID;//焊接工艺号
	private String pi_Hidden_Len;//管道隐蔽长度
	private String pi_Hidden_Wel;//隐蔽焊口
	private String pi_Corss_Cri;//穿跨越标准
	private String pi_Corss_Num;//穿跨越数
	private String pi_Corss_Method;//穿跨越方法
	private String pi_Corss_Len;//穿跨越总长度
	private String pi_Che_Wel;//检测焊口
	private String pi_Che_Cri;//检测标准
	private String pi_Che_Ration;//检测比例
	private String pi_Qua_Gra;//合格级别
	private String pi_Che_Method;//检测方法
	private String pi_Basic_Remark;//备注
	private String pi_Basic_Per;//监检人员
	private String pi_Basic_Date;//日期
	
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
	@OneToOne(mappedBy="piBasic")
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
	 * @return the pi_De_Pre
	 */
	public String getPi_De_Pre() {
		return pi_De_Pre;
	}
	/**
	 * @param pi_De_Pre the pi_De_Pre to set
	 */
	public void setPi_De_Pre(String pi_De_Pre) {
		this.pi_De_Pre = pi_De_Pre;
	}
	/**
	 * @return the pi_De_Tem
	 */
	public String getPi_De_Tem() {
		return pi_De_Tem;
	}
	/**
	 * @param pi_De_Tem the pi_De_Tem to set
	 */
	public void setPi_De_Tem(String pi_De_Tem) {
		this.pi_De_Tem = pi_De_Tem;
	}
	/**
	 * @return the pi_Wo_Med
	 */
	public String getPi_Wo_Med() {
		return pi_Wo_Med;
	}
	/**
	 * @param pi_Wo_Med the pi_Wo_Med to set
	 */
	public void setPi_Wo_Med(String pi_Wo_Med) {
		this.pi_Wo_Med = pi_Wo_Med;
	}
	/**
	 * @return the pi_Gra
	 */
	public String getPi_Gra() {
		return pi_Gra;
	}
	/**
	 * @param pi_Gra the pi_Gra to set
	 */
	public void setPi_Gra(String pi_Gra) {
		this.pi_Gra = pi_Gra;
	}
	/**
	 * @return the pi_De_Cri
	 */
	public String getPi_De_Cri() {
		return pi_De_Cri;
	}
	/**
	 * @param pi_De_Cri the pi_De_Cri to set
	 */
	public void setPi_De_Cri(String pi_De_Cri) {
		this.pi_De_Cri = pi_De_Cri;
	}
	/**
	 * @return the pi_Ins_Cri
	 */
	public String getPi_Ins_Cri() {
		return pi_Ins_Cri;
	}
	/**
	 * @param pi_Ins_Cri the pi_Ins_Cri to set
	 */
	public void setPi_Ins_Cri(String pi_Ins_Cri) {
		this.pi_Ins_Cri = pi_Ins_Cri;
	}
	/**
	 * @return the pi_Len
	 */
	public String getPi_Len() {
		return pi_Len;
	}
	/**
	 * @param pi_Len the pi_Len to set
	 */
	public void setPi_Len(String pi_Len) {
		this.pi_Len = pi_Len;
	}
	/**
	 * @return the pi_Wel_Num
	 */
	public String getPi_Wel_Num() {
		return pi_Wel_Num;
	}
	/**
	 * @param pi_Wel_Num the pi_Wel_Num to set
	 */
	public void setPi_Wel_Num(String pi_Wel_Num) {
		this.pi_Wel_Num = pi_Wel_Num;
	}
	/**
	 * @return the pi_Wel_Cri
	 */
	public String getPi_Wel_Cri() {
		return pi_Wel_Cri;
	}
	/**
	 * @param pi_Wel_Cri the pi_Wel_Cri to set
	 */
	public void setPi_Wel_Cri(String pi_Wel_Cri) {
		this.pi_Wel_Cri = pi_Wel_Cri;
	}
	/**
	 * @return the pi_Wel_Rep
	 */
	public String getPi_Wel_Rep() {
		return pi_Wel_Rep;
	}
	/**
	 * @param pi_Wel_Rep the pi_Wel_Rep to set
	 */
	public void setPi_Wel_Rep(String pi_Wel_Rep) {
		this.pi_Wel_Rep = pi_Wel_Rep;
	}
	/**
	 * @return the pi_Wel_ID
	 */
	public String getPi_Wel_ID() {
		return pi_Wel_ID;
	}
	/**
	 * @param pi_Wel_ID the pi_Wel_ID to set
	 */
	public void setPi_Wel_ID(String pi_Wel_ID) {
		this.pi_Wel_ID = pi_Wel_ID;
	}
	/**
	 * @return the pi_Hidden_Len
	 */
	public String getPi_Hidden_Len() {
		return pi_Hidden_Len;
	}
	/**
	 * @param pi_Hidden_Len the pi_Hidden_Len to set
	 */
	public void setPi_Hidden_Len(String pi_Hidden_Len) {
		this.pi_Hidden_Len = pi_Hidden_Len;
	}
	/**
	 * @return the pi_Hidden_Wel
	 */
	public String getPi_Hidden_Wel() {
		return pi_Hidden_Wel;
	}
	/**
	 * @param pi_Hidden_Wel the pi_Hidden_Wel to set
	 */
	public void setPi_Hidden_Wel(String pi_Hidden_Wel) {
		this.pi_Hidden_Wel = pi_Hidden_Wel;
	}
	/**
	 * @return the pi_Corss_Cri
	 */
	public String getPi_Corss_Cri() {
		return pi_Corss_Cri;
	}
	/**
	 * @param pi_Corss_Cri the pi_Corss_Cri to set
	 */
	public void setPi_Corss_Cri(String pi_Corss_Cri) {
		this.pi_Corss_Cri = pi_Corss_Cri;
	}
	/**
	 * @return the pi_Corss_Num
	 */
	public String getPi_Corss_Num() {
		return pi_Corss_Num;
	}
	/**
	 * @param pi_Corss_Num the pi_Corss_Num to set
	 */
	public void setPi_Corss_Num(String pi_Corss_Num) {
		this.pi_Corss_Num = pi_Corss_Num;
	}
	/**
	 * @return the pi_Corss_Method
	 */
	public String getPi_Corss_Method() {
		return pi_Corss_Method;
	}
	/**
	 * @param pi_Corss_Method the pi_Corss_Method to set
	 */
	public void setPi_Corss_Method(String pi_Corss_Method) {
		this.pi_Corss_Method = pi_Corss_Method;
	}
	/**
	 * @return the pi_Corss_Len
	 */
	public String getPi_Corss_Len() {
		return pi_Corss_Len;
	}
	/**
	 * @param pi_Corss_Len the pi_Corss_Len to set
	 */
	public void setPi_Corss_Len(String pi_Corss_Len) {
		this.pi_Corss_Len = pi_Corss_Len;
	}
	/**
	 * @return the pi_Che_Wel
	 */
	public String getPi_Che_Wel() {
		return pi_Che_Wel;
	}
	/**
	 * @param pi_Che_Wel the pi_Che_Wel to set
	 */
	public void setPi_Che_Wel(String pi_Che_Wel) {
		this.pi_Che_Wel = pi_Che_Wel;
	}
	/**
	 * @return the pi_Che_Cri
	 */
	public String getPi_Che_Cri() {
		return pi_Che_Cri;
	}
	/**
	 * @param pi_Che_Cri the pi_Che_Cri to set
	 */
	public void setPi_Che_Cri(String pi_Che_Cri) {
		this.pi_Che_Cri = pi_Che_Cri;
	}
	/**
	 * @return the pi_Che_Ration
	 */
	public String getPi_Che_Ration() {
		return pi_Che_Ration;
	}
	/**
	 * @param pi_Che_Ration the pi_Che_Ration to set
	 */
	public void setPi_Che_Ration(String pi_Che_Ration) {
		this.pi_Che_Ration = pi_Che_Ration;
	}
	/**
	 * @return the pi_Qua_Gra
	 */
	public String getPi_Qua_Gra() {
		return pi_Qua_Gra;
	}
	/**
	 * @param pi_Qua_Gra the pi_Qua_Gra to set
	 */
	public void setPi_Qua_Gra(String pi_Qua_Gra) {
		this.pi_Qua_Gra = pi_Qua_Gra;
	}
	/**
	 * @return the pi_Che_Method
	 */
	public String getPi_Che_Method() {
		return pi_Che_Method;
	}
	/**
	 * @param pi_Che_Method the pi_Che_Method to set
	 */
	public void setPi_Che_Method(String pi_Che_Method) {
		this.pi_Che_Method = pi_Che_Method;
	}
	/**
	 * @return the pi_Basic_Remark
	 */
	public String getPi_Basic_Remark() {
		return pi_Basic_Remark;
	}
	/**
	 * @param pi_Basic_Remark the pi_Basic_Remark to set
	 */
	public void setPi_Basic_Remark(String pi_Basic_Remark) {
		this.pi_Basic_Remark = pi_Basic_Remark;
	}
	/**
	 * @return the pi_Basic_Per
	 */
	public String getPi_Basic_Per() {
		return pi_Basic_Per;
	}
	/**
	 * @param pi_Basic_Per the pi_Basic_Per to set
	 */
	public void setPi_Basic_Per(String pi_Basic_Per) {
		this.pi_Basic_Per = pi_Basic_Per;
	}
	/**
	 * @return the pi_Basic_Date
	 */
	public String getPi_Basic_Date() {
		return pi_Basic_Date;
	}
	/**
	 * @param pi_Basic_Date the pi_Basic_Date to set
	 */
	public void setPi_Basic_Date(String pi_Basic_Date) {
		this.pi_Basic_Date = pi_Basic_Date;
	}
	
	
	
	
	

}
