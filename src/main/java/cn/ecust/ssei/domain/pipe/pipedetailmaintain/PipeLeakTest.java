package cn.ecust.ssei.domain.pipe.pipedetailmaintain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeLeakTest")
public class PipeLeakTest {

	private long id;//泄露性检查ID
	private PipeDetailMaintain pipeDetailMaintain;
	private String p_Max_Pre;//最高工作压力
	private String p_Exp_Med;//试验介质
	private String p_Exp_Pre;//试验压力
	private String p_Med_Tem;//介质温度
	private String p_Amb_Tem;//环境温度
	private String p_Pump_Pre_Cri;//机泵出口压力表规格
	private String p_Pump_Pre_Acc;//机泵出口压力表精度
	private String p_Line_Pre_Cri;//管线压力表规格
	private String p_Line_Pre_Acc;//管线压力表精度
	private String p_Pump_Type;//机泵型号及编号
	private String p_Ope_Cri;//执行标准
	private String p_Leak_Result;//压力试验结论
	private String p_Leak_Data;//压力检测日期
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
	@OneToOne(mappedBy="pipeLeakTest")
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
	 * @return the p_Max_Pre
	 */
	public String getP_Max_Pre() {
		return p_Max_Pre;
	}
	/**
	 * @param p_Max_Pre the p_Max_Pre to set
	 */
	public void setP_Max_Pre(String p_Max_Pre) {
		this.p_Max_Pre = p_Max_Pre;
	}
	/**
	 * @return the p_Exp_Med
	 */
	public String getP_Exp_Med() {
		return p_Exp_Med;
	}
	/**
	 * @param p_Exp_Med the p_Exp_Med to set
	 */
	public void setP_Exp_Med(String p_Exp_Med) {
		this.p_Exp_Med = p_Exp_Med;
	}
	/**
	 * @return the p_Exp_Pre
	 */
	public String getP_Exp_Pre() {
		return p_Exp_Pre;
	}
	/**
	 * @param p_Exp_Pre the p_Exp_Pre to set
	 */
	public void setP_Exp_Pre(String p_Exp_Pre) {
		this.p_Exp_Pre = p_Exp_Pre;
	}
	/**
	 * @return the p_Med_Tem
	 */
	public String getP_Med_Tem() {
		return p_Med_Tem;
	}
	/**
	 * @param p_Med_Tem the p_Med_Tem to set
	 */
	public void setP_Med_Tem(String p_Med_Tem) {
		this.p_Med_Tem = p_Med_Tem;
	}
	/**
	 * @return the p_Amb_Tem
	 */
	public String getP_Amb_Tem() {
		return p_Amb_Tem;
	}
	/**
	 * @param p_Amb_Tem the p_Amb_Tem to set
	 */
	public void setP_Amb_Tem(String p_Amb_Tem) {
		this.p_Amb_Tem = p_Amb_Tem;
	}
	/**
	 * @return the p_Pump_Pre_Cri
	 */
	public String getP_Pump_Pre_Cri() {
		return p_Pump_Pre_Cri;
	}
	/**
	 * @param p_Pump_Pre_Cri the p_Pump_Pre_Cri to set
	 */
	public void setP_Pump_Pre_Cri(String p_Pump_Pre_Cri) {
		this.p_Pump_Pre_Cri = p_Pump_Pre_Cri;
	}
	/**
	 * @return the p_Pump_Pre_Acc
	 */
	public String getP_Pump_Pre_Acc() {
		return p_Pump_Pre_Acc;
	}
	/**
	 * @param p_Pump_Pre_Acc the p_Pump_Pre_Acc to set
	 */
	public void setP_Pump_Pre_Acc(String p_Pump_Pre_Acc) {
		this.p_Pump_Pre_Acc = p_Pump_Pre_Acc;
	}
	/**
	 * @return the p_Line_Pre_Cri
	 */
	public String getP_Line_Pre_Cri() {
		return p_Line_Pre_Cri;
	}
	/**
	 * @param p_Line_Pre_Cri the p_Line_Pre_Cri to set
	 */
	public void setP_Line_Pre_Cri(String p_Line_Pre_Cri) {
		this.p_Line_Pre_Cri = p_Line_Pre_Cri;
	}
	/**
	 * @return the p_Line_Pre_Acc
	 */
	public String getP_Line_Pre_Acc() {
		return p_Line_Pre_Acc;
	}
	/**
	 * @param p_Line_Pre_Acc the p_Line_Pre_Acc to set
	 */
	public void setP_Line_Pre_Acc(String p_Line_Pre_Acc) {
		this.p_Line_Pre_Acc = p_Line_Pre_Acc;
	}
	/**
	 * @return the p_Pump_Type
	 */
	public String getP_Pump_Type() {
		return p_Pump_Type;
	}
	/**
	 * @param p_Pump_Type the p_Pump_Type to set
	 */
	public void setP_Pump_Type(String p_Pump_Type) {
		this.p_Pump_Type = p_Pump_Type;
	}
	/**
	 * @return the p_Ope_Cri
	 */
	public String getP_Ope_Cri() {
		return p_Ope_Cri;
	}
	/**
	 * @param p_Ope_Cri the p_Ope_Cri to set
	 */
	public void setP_Ope_Cri(String p_Ope_Cri) {
		this.p_Ope_Cri = p_Ope_Cri;
	}
	/**
	 * @return the p_Leak_Result
	 */
	public String getP_Leak_Result() {
		return p_Leak_Result;
	}
	/**
	 * @param p_Leak_Result the p_Leak_Result to set
	 */
	public void setP_Leak_Result(String p_Leak_Result) {
		this.p_Leak_Result = p_Leak_Result;
	}
	/**
	 * @return the p_Leak_Data
	 */
	public String getP_Leak_Data() {
		return p_Leak_Data;
	}
	/**
	 * @param p_Leak_Data the p_Leak_Data to set
	 */
	public void setP_Leak_Data(String p_Leak_Data) {
		this.p_Leak_Data = p_Leak_Data;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PipeLeakTest [id=" + id + ", pipeDetailMaintain="
				+ pipeDetailMaintain + ", p_Max_Pre=" + p_Max_Pre
				+ ", p_Exp_Med=" + p_Exp_Med + ", p_Exp_Pre=" + p_Exp_Pre
				+ ", p_Med_Tem=" + p_Med_Tem + ", p_Amb_Tem=" + p_Amb_Tem
				+ ", p_Pump_Pre_Cri=" + p_Pump_Pre_Cri + ", p_Pump_Pre_Acc="
				+ p_Pump_Pre_Acc + ", p_Line_Pre_Cri=" + p_Line_Pre_Cri
				+ ", p_Line_Pre_Acc=" + p_Line_Pre_Acc + ", p_Pump_Type="
				+ p_Pump_Type + ", p_Ope_Cri=" + p_Ope_Cri + ", p_Leak_Result="
				+ p_Leak_Result + ", p_Leak_Data=" + p_Leak_Data + "]";
	}
	
	
}
