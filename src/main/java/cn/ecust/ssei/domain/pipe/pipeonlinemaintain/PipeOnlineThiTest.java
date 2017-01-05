package cn.ecust.ssei.domain.pipe.pipeonlinemaintain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeOnlineThiTest")
public class PipeOnlineThiTest {
	
	private long id;//管壁测厚检查ID
	private String m_Ol_Last_ID;//上次在线检验报告编号
	private String m_OL_Single_ID;//上次在线检验单线图编号
	private PipeOnlineMaintain pipeOnlineMaintain;
	private String p_Thi_Name;//管道编号（为了自己填的）
	private String p_Sur_Sta;//表面状况
	private String p_Equ_Mod;//测厚仪器型号
	private String p_Equ_Acc;//测厚仪器精度
	private String p_Equ_ID;//测厚仪器编号
	private String p_Use_Sta;//使用状态
	private String p_Thi_ratio_1;//管件测厚比例
	private String p_Thi_ratio_2;//管子测厚比例
	private String p_Thi_Num;//实测点数
	private String p_Min_Thi;//实测最小壁厚
	private String p_Thi_Value;//检验值
	private String p_Thi_Date;//壁厚检测检查日期
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
	 * @return the pipeOnlineMaintain
	 */
	@OneToOne(mappedBy="pipeOnlineThiTest")
	public PipeOnlineMaintain getPipeOnlineMaintain() {
		return pipeOnlineMaintain;
	}
	/**
	 * @param pipeOnlineMaintain the pipeOnlineMaintain to set
	 */
	public void setPipeOnlineMaintain(PipeOnlineMaintain pipeOnlineMaintain) {
		this.pipeOnlineMaintain = pipeOnlineMaintain;
	}
	/**
	 * @return the p_Thi_Name
	 */
	public String getP_Thi_Name() {
		return p_Thi_Name;
	}
	/**
	 * @param p_Thi_Name the p_Thi_Name to set
	 */
	public void setP_Thi_Name(String p_Thi_Name) {
		this.p_Thi_Name = p_Thi_Name;
	}
	/**
	 * @return the p_Sur_Sta
	 */
	public String getP_Sur_Sta() {
		return p_Sur_Sta;
	}
	/**
	 * @param p_Sur_Sta the p_Sur_Sta to set
	 */
	public void setP_Sur_Sta(String p_Sur_Sta) {
		this.p_Sur_Sta = p_Sur_Sta;
	}
	/**
	 * @return the p_Equ_Mod
	 */
	public String getP_Equ_Mod() {
		return p_Equ_Mod;
	}
	/**
	 * @param p_Equ_Mod the p_Equ_Mod to set
	 */
	public void setP_Equ_Mod(String p_Equ_Mod) {
		this.p_Equ_Mod = p_Equ_Mod;
	}
	/**
	 * @return the p_Equ_Acc
	 */
	public String getP_Equ_Acc() {
		return p_Equ_Acc;
	}
	/**
	 * @param p_Equ_Acc the p_Equ_Acc to set
	 */
	public void setP_Equ_Acc(String p_Equ_Acc) {
		this.p_Equ_Acc = p_Equ_Acc;
	}
	/**
	 * @return the p_Equ_ID
	 */
	public String getP_Equ_ID() {
		return p_Equ_ID;
	}
	/**
	 * @param p_Equ_ID the p_Equ_ID to set
	 */
	public void setP_Equ_ID(String p_Equ_ID) {
		this.p_Equ_ID = p_Equ_ID;
	}
	/**
	 * @return the p_Use_Sta
	 */
	public String getP_Use_Sta() {
		return p_Use_Sta;
	}
	/**
	 * @param p_Use_Sta the p_Use_Sta to set
	 */
	public void setP_Use_Sta(String p_Use_Sta) {
		this.p_Use_Sta = p_Use_Sta;
	}
	/**
	 * @return the p_Thi_ratio_1
	 */
	public String getP_Thi_ratio_1() {
		return p_Thi_ratio_1;
	}
	/**
	 * @param p_Thi_ratio_1 the p_Thi_ratio_1 to set
	 */
	public void setP_Thi_ratio_1(String p_Thi_ratio_1) {
		this.p_Thi_ratio_1 = p_Thi_ratio_1;
	}
	/**
	 * @return the p_Thi_ratio_2
	 */
	public String getP_Thi_ratio_2() {
		return p_Thi_ratio_2;
	}
	/**
	 * @param p_Thi_ratio_2 the p_Thi_ratio_2 to set
	 */
	public void setP_Thi_ratio_2(String p_Thi_ratio_2) {
		this.p_Thi_ratio_2 = p_Thi_ratio_2;
	}
	/**
	 * @return the p_Thi_Num
	 */
	public String getP_Thi_Num() {
		return p_Thi_Num;
	}
	/**
	 * @param p_Thi_Num the p_Thi_Num to set
	 */
	public void setP_Thi_Num(String p_Thi_Num) {
		this.p_Thi_Num = p_Thi_Num;
	}
	/**
	 * @return the p_Min_Thi
	 */
	public String getP_Min_Thi() {
		return p_Min_Thi;
	}
	/**
	 * @param p_Min_Thi the p_Min_Thi to set
	 */
	public void setP_Min_Thi(String p_Min_Thi) {
		this.p_Min_Thi = p_Min_Thi;
	}
	/**
	 * @return the p_Thi_Value
	 */
	@Column(length=5500)
	public String getP_Thi_Value() {
		return p_Thi_Value;
	}
	/**
	 * @param p_Thi_Value the p_Thi_Value to set
	 */
	public void setP_Thi_Value(String p_Thi_Value) {
		this.p_Thi_Value = p_Thi_Value;
	}
	/**
	 * @return the p_Thi_Date
	 */
	public String getP_Thi_Date() {
		return p_Thi_Date;
	}
	/**
	 * @param p_Thi_Date the p_Thi_Date to set
	 */
	public void setP_Thi_Date(String p_Thi_Date) {
		this.p_Thi_Date = p_Thi_Date;
	}
	/**
	 * @return the m_Ol_Last_ID
	 */
	public String getM_Ol_Last_ID() {
		return m_Ol_Last_ID;
	}
	/**
	 * @param m_Ol_Last_ID the m_Ol_Last_ID to set
	 */
	public void setM_Ol_Last_ID(String m_Ol_Last_ID) {
		this.m_Ol_Last_ID = m_Ol_Last_ID;
	}
	/**
	 * @return the m_OL_Single_ID
	 */
	public String getM_OL_Single_ID() {
		return m_OL_Single_ID;
	}
	/**
	 * @param m_OL_Single_ID the m_OL_Single_ID to set
	 */
	public void setM_OL_Single_ID(String m_OL_Single_ID) {
		this.m_OL_Single_ID = m_OL_Single_ID;
	}
	
	

}
