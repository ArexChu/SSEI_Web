package cn.ecust.ssei.domain.pipe.pipedetailmaintain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeVerfication")
public class PipeVerification {
	private long id;
	private PipeDetailMaintain pipeDetailMaintain;
	private String m_Original_Data;//原始资料
	private String m_Rules;//规章制度
	private String m_Items;//检验检测项目
	private String m_Gra;//安全状况等级
	private String m_Max_Pre;//最高工作压力
	private String m_Tem;//工作温度
	private String m_Med;//介质
	private String m_Limit;//监控使用的限制性条件
	private String m_Reasion;//.判废依据
	private String m_Others;//其它
	private String m_Test_Equ;//检验使用的设备名称及编号
	private String m_Test_Remark;//其他需要说明的检验情况
	private String m_Test_Date;//检验
	private String m_Check_Date;//校核
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
	 * @return the pipeDetailMaintain
	 */
	@OneToOne(mappedBy="pipeVerification")
	public PipeDetailMaintain getPipeDetailMaintain() {
		return pipeDetailMaintain;
	}
	/**
	 * @param pipeDetailMaintain the pipeDetailMaintain to set
	 */
	public void setPipeDetailMaintain(PipeDetailMaintain pipeDetailMaintain) {
		this.pipeDetailMaintain = pipeDetailMaintain;
	}
	/**
	 * @return the m_Original_Data
	 */
	public String getM_Original_Data() {
		return m_Original_Data;
	}
	/**
	 * @param m_Original_Data the m_Original_Data to set
	 */
	public void setM_Original_Data(String m_Original_Data) {
		this.m_Original_Data = m_Original_Data;
	}
	/**
	 * @return the m_Rules
	 */
	public String getM_Rules() {
		return m_Rules;
	}
	/**
	 * @param m_Rules the m_Rules to set
	 */
	public void setM_Rules(String m_Rules) {
		this.m_Rules = m_Rules;
	}
	/**
	 * @return the m_Items
	 */
	public String getM_Items() {
		return m_Items;
	}
	/**
	 * @param m_Items the m_Items to set
	 */
	public void setM_Items(String m_Items) {
		this.m_Items = m_Items;
	}
	/**
	 * @return the m_Gra
	 */
	public String getM_Gra() {
		return m_Gra;
	}
	/**
	 * @param m_Gra the m_Gra to set
	 */
	public void setM_Gra(String m_Gra) {
		this.m_Gra = m_Gra;
	}
	/**
	 * @return the m_Max_Pre
	 */
	public String getM_Max_Pre() {
		return m_Max_Pre;
	}
	/**
	 * @param m_Max_Pre the m_Max_Pre to set
	 */
	public void setM_Max_Pre(String m_Max_Pre) {
		this.m_Max_Pre = m_Max_Pre;
	}
	/**
	 * @return the m_Tem
	 */
	public String getM_Tem() {
		return m_Tem;
	}
	/**
	 * @param m_Tem the m_Tem to set
	 */
	public void setM_Tem(String m_Tem) {
		this.m_Tem = m_Tem;
	}
	/**
	 * @return the m_Med
	 */
	public String getM_Med() {
		return m_Med;
	}
	/**
	 * @param m_Med the m_Med to set
	 */
	public void setM_Med(String m_Med) {
		this.m_Med = m_Med;
	}
	/**
	 * @return the m_Limit
	 */
	public String getM_Limit() {
		return m_Limit;
	}
	/**
	 * @param m_Limit the m_Limit to set
	 */
	public void setM_Limit(String m_Limit) {
		this.m_Limit = m_Limit;
	}
	/**
	 * @return the m_Reasion
	 */
	public String getM_Reasion() {
		return m_Reasion;
	}
	/**
	 * @param m_Reasion the m_Reasion to set
	 */
	public void setM_Reasion(String m_Reasion) {
		this.m_Reasion = m_Reasion;
	}
	/**
	 * @return the m_Others
	 */
	public String getM_Others() {
		return m_Others;
	}
	/**
	 * @param m_Others the m_Others to set
	 */
	public void setM_Others(String m_Others) {
		this.m_Others = m_Others;
	}
	/**
	 * @return the m_Test_Equ
	 */
	public String getM_Test_Equ() {
		return m_Test_Equ;
	}
	/**
	 * @param m_Test_Equ the m_Test_Equ to set
	 */
	public void setM_Test_Equ(String m_Test_Equ) {
		this.m_Test_Equ = m_Test_Equ;
	}
	/**
	 * @return the m_Test_Remark
	 */
	public String getM_Test_Remark() {
		return m_Test_Remark;
	}
	/**
	 * @param m_Test_Remark the m_Test_Remark to set
	 */
	public void setM_Test_Remark(String m_Test_Remark) {
		this.m_Test_Remark = m_Test_Remark;
	}
	/**
	 * @return the m_Test_Date
	 */
	public String getM_Test_Date() {
		return m_Test_Date;
	}
	/**
	 * @param m_Test_Date the m_Test_Date to set
	 */
	public void setM_Test_Date(String m_Test_Date) {
		this.m_Test_Date = m_Test_Date;
	}
	/**
	 * @return the m_Check_Date
	 */
	public String getM_Check_Date() {
		return m_Check_Date;
	}
	/**
	 * @param m_Check_Date the m_Check_Date to set
	 */
	public void setM_Check_Date(String m_Check_Date) {
		this.m_Check_Date = m_Check_Date;
	}
	
	

}
