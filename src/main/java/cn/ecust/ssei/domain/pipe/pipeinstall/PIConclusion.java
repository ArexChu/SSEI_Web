package cn.ecust.ssei.domain.pipe.pipeinstall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_piConclusion")
public class PIConclusion {

	private long id;//监督检验结论记录
	private PipeInstall pipeInstall;
	private String pi_Addr;//工程地址
	private String pi_Start_Date;//开工时间
	private String pi_End_Date;//竣工时间
	private String pi_De_Com;//设计单位
	private String pi_De_Cer_ID;//设计证书编号
	private String pi_Install_Cer_ID;//安装许可证编号
	private String pi_Pro_Com;//防腐施工单位
	private String pi_Pro_Cer_ID;//防腐资质证书编号
	private String pi_Sup_Com;//监理单位
	private String pi_Sup_Cer_ID;//监理资质证书编号
	private String pi_Check_Com;//检测单位
	private String pi_Check_Cer_ID;//检测资质证书编号
	private String pi_Insp_ID;//授权监督检验文号
	private String pi_Insp_Start_Date;//监督检验起止日期
	private String pi_Insp_End_Date;//监督检验起止日期
	private String pi_Pipe_ID;//管道编号
	private String pi_Insp_Reasion;//监督检验依据
	private String pi_Insp_Result;//监督检验结论：
	private String  pi_Insp_Grade;//安全状况等级
	private String  pi_Next_Date;//下次全面检验日期
	private String  pi_Check_Equ;//监检使用的设备名称及编号
	private String  pi_Insp_Per_Name;//监检
	private String  pi_Insp_Per_ID;//资格证号
	private String  pi_Insp_Date;//日期
	private String  pi_Check_Per_Name;//校对
	private String  pi_Check_Per_ID;//资格证号
	private String  pi_ConCheck_Date;//日期
	
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
	@OneToOne(mappedBy="piConclusion")
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
	 * @return the pi_Addr
	 */
	public String getPi_Addr() {
		return pi_Addr;
	}
	/**
	 * @param pi_Addr the pi_Addr to set
	 */
	public void setPi_Addr(String pi_Addr) {
		this.pi_Addr = pi_Addr;
	}
	/**
	 * @return the pi_Start_Date
	 */
	public String getPi_Start_Date() {
		return pi_Start_Date;
	}
	/**
	 * @param pi_Start_Date the pi_Start_Date to set
	 */
	public void setPi_Start_Date(String pi_Start_Date) {
		this.pi_Start_Date = pi_Start_Date;
	}
	/**
	 * @return the pi_End_Date
	 */
	public String getPi_End_Date() {
		return pi_End_Date;
	}
	/**
	 * @param pi_End_Date the pi_End_Date to set
	 */
	public void setPi_End_Date(String pi_End_Date) {
		this.pi_End_Date = pi_End_Date;
	}
	/**
	 * @return the pi_De_Cer_ID
	 */
	public String getPi_De_Cer_ID() {
		return pi_De_Cer_ID;
	}
	/**
	 * @param pi_De_Cer_ID the pi_De_Cer_ID to set
	 */
	public void setPi_De_Cer_ID(String pi_De_Cer_ID) {
		this.pi_De_Cer_ID = pi_De_Cer_ID;
	}
	/**
	 * @return the pi_Install_Cer_ID
	 */
	public String getPi_Install_Cer_ID() {
		return pi_Install_Cer_ID;
	}
	/**
	 * @param pi_Install_Cer_ID the pi_Install_Cer_ID to set
	 */
	public void setPi_Install_Cer_ID(String pi_Install_Cer_ID) {
		this.pi_Install_Cer_ID = pi_Install_Cer_ID;
	}
	/**
	 * @return the pi_Pro_Com
	 */
	public String getPi_Pro_Com() {
		return pi_Pro_Com;
	}
	/**
	 * @param pi_Pro_Com the pi_Pro_Com to set
	 */
	public void setPi_Pro_Com(String pi_Pro_Com) {
		this.pi_Pro_Com = pi_Pro_Com;
	}
	/**
	 * @return the pi_Pro_Cer_ID
	 */
	public String getPi_Pro_Cer_ID() {
		return pi_Pro_Cer_ID;
	}
	/**
	 * @param pi_Pro_Cer_ID the pi_Pro_Cer_ID to set
	 */
	public void setPi_Pro_Cer_ID(String pi_Pro_Cer_ID) {
		this.pi_Pro_Cer_ID = pi_Pro_Cer_ID;
	}
	/**
	 * @return the pi_Sup_Com
	 */
	public String getPi_Sup_Com() {
		return pi_Sup_Com;
	}
	/**
	 * @param pi_Sup_Com the pi_Sup_Com to set
	 */
	public void setPi_Sup_Com(String pi_Sup_Com) {
		this.pi_Sup_Com = pi_Sup_Com;
	}
	/**
	 * @return the pi_Sup_Cer_ID
	 */
	public String getPi_Sup_Cer_ID() {
		return pi_Sup_Cer_ID;
	}
	/**
	 * @param pi_Sup_Cer_ID the pi_Sup_Cer_ID to set
	 */
	public void setPi_Sup_Cer_ID(String pi_Sup_Cer_ID) {
		this.pi_Sup_Cer_ID = pi_Sup_Cer_ID;
	}
	/**
	 * @return the pi_Check_Com
	 */
	public String getPi_Check_Com() {
		return pi_Check_Com;
	}
	/**
	 * @param pi_Check_Com the pi_Check_Com to set
	 */
	public void setPi_Check_Com(String pi_Check_Com) {
		this.pi_Check_Com = pi_Check_Com;
	}
	/**
	 * @return the pi_Check_Cer_ID
	 */
	public String getPi_Check_Cer_ID() {
		return pi_Check_Cer_ID;
	}
	/**
	 * @param pi_Check_Cer_ID the pi_Check_Cer_ID to set
	 */
	public void setPi_Check_Cer_ID(String pi_Check_Cer_ID) {
		this.pi_Check_Cer_ID = pi_Check_Cer_ID;
	}
	/**
	 * @return the pi_Insp_ID
	 */
	public String getPi_Insp_ID() {
		return pi_Insp_ID;
	}
	/**
	 * @param pi_Insp_ID the pi_Insp_ID to set
	 */
	public void setPi_Insp_ID(String pi_Insp_ID) {
		this.pi_Insp_ID = pi_Insp_ID;
	}
	/**
	 * @return the pi_Insp_Start_Date
	 */
	public String getPi_Insp_Start_Date() {
		return pi_Insp_Start_Date;
	}
	/**
	 * @param pi_Insp_Start_Date the pi_Insp_Start_Date to set
	 */
	public void setPi_Insp_Start_Date(String pi_Insp_Start_Date) {
		this.pi_Insp_Start_Date = pi_Insp_Start_Date;
	}
	/**
	 * @return the pi_Insp_End_Date
	 */
	public String getPi_Insp_End_Date() {
		return pi_Insp_End_Date;
	}
	/**
	 * @param pi_Insp_End_Date the pi_Insp_End_Date to set
	 */
	public void setPi_Insp_End_Date(String pi_Insp_End_Date) {
		this.pi_Insp_End_Date = pi_Insp_End_Date;
	}
	/**
	 * @return the pi_Pipe_ID
	 */
	public String getPi_Pipe_ID() {
		return pi_Pipe_ID;
	}
	/**
	 * @param pi_Pipe_ID the pi_Pipe_ID to set
	 */
	public void setPi_Pipe_ID(String pi_Pipe_ID) {
		this.pi_Pipe_ID = pi_Pipe_ID;
	}
	/**
	 * @return the pi_Insp_Reasion
	 */
	public String getPi_Insp_Reasion() {
		return pi_Insp_Reasion;
	}
	/**
	 * @param pi_Insp_Reasion the pi_Insp_Reasion to set
	 */
	public void setPi_Insp_Reasion(String pi_Insp_Reasion) {
		this.pi_Insp_Reasion = pi_Insp_Reasion;
	}
	
	/**
	 * @return the pi_Insp_Result
	 */
	public String getPi_Insp_Result() {
		return pi_Insp_Result;
	}
	/**
	 * @param pi_Insp_Result the pi_Insp_Result to set
	 */
	public void setPi_Insp_Result(String pi_Insp_Result) {
		this.pi_Insp_Result = pi_Insp_Result;
	}
	/**
	 * @return the pi_Insp_Grade
	 */
	public String getPi_Insp_Grade() {
		return pi_Insp_Grade;
	}
	/**
	 * @param pi_Insp_Grade the pi_Insp_Grade to set
	 */
	public void setPi_Insp_Grade(String pi_Insp_Grade) {
		this.pi_Insp_Grade = pi_Insp_Grade;
	}
	/**
	 * @return the pi_Next_Date
	 */
	public String getPi_Next_Date() {
		return pi_Next_Date;
	}
	/**
	 * @param pi_Next_Date the pi_Next_Date to set
	 */
	public void setPi_Next_Date(String pi_Next_Date) {
		this.pi_Next_Date = pi_Next_Date;
	}
	/**
	 * @return the pi_Check_Equ
	 */
	public String getPi_Check_Equ() {
		return pi_Check_Equ;
	}
	/**
	 * @param pi_Check_Equ the pi_Check_Equ to set
	 */
	public void setPi_Check_Equ(String pi_Check_Equ) {
		this.pi_Check_Equ = pi_Check_Equ;
	}
	/**
	 * @return the pi_Insp_Per_Name
	 */
	public String getPi_Insp_Per_Name() {
		return pi_Insp_Per_Name;
	}
	/**
	 * @param pi_Insp_Per_Name the pi_Insp_Per_Name to set
	 */
	public void setPi_Insp_Per_Name(String pi_Insp_Per_Name) {
		this.pi_Insp_Per_Name = pi_Insp_Per_Name;
	}
	/**
	 * @return the pi_Insp_Per_ID
	 */
	public String getPi_Insp_Per_ID() {
		return pi_Insp_Per_ID;
	}
	/**
	 * @param pi_Insp_Per_ID the pi_Insp_Per_ID to set
	 */
	public void setPi_Insp_Per_ID(String pi_Insp_Per_ID) {
		this.pi_Insp_Per_ID = pi_Insp_Per_ID;
	}
	/**
	 * @return the pi_Insp_Date
	 */
	public String getPi_Insp_Date() {
		return pi_Insp_Date;
	}
	/**
	 * @param pi_Insp_Date the pi_Insp_Date to set
	 */
	public void setPi_Insp_Date(String pi_Insp_Date) {
		this.pi_Insp_Date = pi_Insp_Date;
	}
	/**
	 * @return the pi_Check_Per_Name
	 */
	public String getPi_Check_Per_Name() {
		return pi_Check_Per_Name;
	}
	/**
	 * @param pi_Check_Per_Name the pi_Check_Per_Name to set
	 */
	public void setPi_Check_Per_Name(String pi_Check_Per_Name) {
		this.pi_Check_Per_Name = pi_Check_Per_Name;
	}
	/**
	 * @return the pi_Check_Per_ID
	 */
	public String getPi_Check_Per_ID() {
		return pi_Check_Per_ID;
	}
	/**
	 * @param pi_Check_Per_ID the pi_Check_Per_ID to set
	 */
	public void setPi_Check_Per_ID(String pi_Check_Per_ID) {
		this.pi_Check_Per_ID = pi_Check_Per_ID;
	}
    
	/**
	 * @return the pi_ConCheck_Date
	 */
	public String getPi_ConCheck_Date() {
		return pi_ConCheck_Date;
	}
	/**
	 * @param pi_ConCheck_Date the pi_ConCheck_Date to set
	 */
	public void setPi_ConCheck_Date(String pi_ConCheck_Date) {
		this.pi_ConCheck_Date = pi_ConCheck_Date;
	}
	/**
	 * @return the pi_De_Com
	 */
	public String getPi_De_Com() {
		return pi_De_Com;
	}
	/**
	 * @param pi_De_Com the pi_De_Com to set
	 */
	public void setPi_De_Com(String pi_De_Com) {
		this.pi_De_Com = pi_De_Com;
	}
		
	
}
