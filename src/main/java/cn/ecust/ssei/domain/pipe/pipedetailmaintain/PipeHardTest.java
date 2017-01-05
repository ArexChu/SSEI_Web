package cn.ecust.ssei.domain.pipe.pipedetailmaintain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeHardTest")
public class PipeHardTest {

	private long id;//管道硬度检查ID
	private PipeDetailMaintain pipeDetailMaintain;
	private String p_Heat_Sta;//热处理状态
	private String p_Equ_Mod;//仪器型号
	private String p_Equ_ID;//仪器编号
	private String p_Hard_Pos;//测定部位
	private String p_Hard_Cri;//评定标准
	private String p_HB_Val1;//硬 度 值（HB）
	private String p_HB_Pos1;//硬度测定部位
	private String p_HB_Value;//测定结果
	private String p_Ass_Opinion;//评定意见
	private String p_Hard_Data;//管道硬度检查时间
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
	@OneToOne(mappedBy="pipeHardTest")
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
	 * @return the p_Heat_Sta
	 */
	public String getP_Heat_Sta() {
		return p_Heat_Sta;
	}
	/**
	 * @param p_Heat_Sta the p_Heat_Sta to set
	 */
	public void setP_Heat_Sta(String p_Heat_Sta) {
		this.p_Heat_Sta = p_Heat_Sta;
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
	 * @return the p_Hard_Pos
	 */
	public String getP_Hard_Pos() {
		return p_Hard_Pos;
	}
	/**
	 * @param p_Hard_Pos the p_Hard_Pos to set
	 */
	public void setP_Hard_Pos(String p_Hard_Pos) {
		this.p_Hard_Pos = p_Hard_Pos;
	}
	/**
	 * @return the p_Hard_Cri
	 */
	public String getP_Hard_Cri() {
		return p_Hard_Cri;
	}
	/**
	 * @param p_Hard_Cri the p_Hard_Cri to set
	 */
	public void setP_Hard_Cri(String p_Hard_Cri) {
		this.p_Hard_Cri = p_Hard_Cri;
	}
	/**
	 * @return the p_HB_Val1
	 */
	public String getP_HB_Val1() {
		return p_HB_Val1;
	}
	/**
	 * @param p_HB_Val1 the p_HB_Val1 to set
	 */
	public void setP_HB_Val1(String p_HB_Val1) {
		this.p_HB_Val1 = p_HB_Val1;
	}
	/**
	 * @return the p_HB_Pos1
	 */
	public String getP_HB_Pos1() {
		return p_HB_Pos1;
	}
	/**
	 * @param p_HB_Pos1 the p_HB_Pos1 to set
	 */
	public void setP_HB_Pos1(String p_HB_Pos1) {
		this.p_HB_Pos1 = p_HB_Pos1;
	}
	/**
	 * @return the p_HB_Value
	 */
	public String getP_HB_Value() {
		return p_HB_Value;
	}
	/**
	 * @param p_HB_Value the p_HB_Value to set
	 */
	public void setP_HB_Value(String p_HB_Value) {
		this.p_HB_Value = p_HB_Value;
	}
	/**
	 * @return the p_Ass_Opinion
	 */
	public String getP_Ass_Opinion() {
		return p_Ass_Opinion;
	}
	/**
	 * @param p_Ass_Opinion the p_Ass_Opinion to set
	 */
	public void setP_Ass_Opinion(String p_Ass_Opinion) {
		this.p_Ass_Opinion = p_Ass_Opinion;
	}
	/**
	 * @return the p_Hard_Data
	 */
	@Column(length=5500)
	public String getP_Hard_Data() {
		return p_Hard_Data;
	}
	/**
	 * @param p_Hard_Data the p_Hard_Data to set
	 */
	public void setP_Hard_Data(String p_Hard_Data) {
		this.p_Hard_Data = p_Hard_Data;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PipeHardTest [id=" + id + ", p_Heat_Sta=" + p_Heat_Sta
				+ ", p_Equ_Mod=" + p_Equ_Mod + ", p_Equ_ID=" + p_Equ_ID
				+ ", p_Hard_Pos=" + p_Hard_Pos + ", p_Hard_Cri=" + p_Hard_Cri
				+ ", p_HB_Val1=" + p_HB_Val1 + ", p_HB_Pos1=" + p_HB_Pos1
				+ ", p_HB_Value=" + p_HB_Value + ", p_Ass_Opinion="
				+ p_Ass_Opinion + ", p_Hard_Data=" + p_Hard_Data + "]";
	}
	
	

}
