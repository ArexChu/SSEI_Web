package cn.ecust.ssei.domain.pipe.pipedetailmaintain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeMetTest")
public class PipeMetTest {

private long id;//金相分析ID
private PipeDetailMaintain pipeDetailMaintain;
private String p_Heat_Sta;//热处理状态
private String p_Met_Pos;//取样部位
private String p_Sample_ID;//试样编号
private String p_Equ_Mod;//仪器型号
private String p_Equ_ID;//仪器编号
private String p_Cor_Method;//腐蚀方法
private String p_Pol_Method;//抛光方法
private String p_Amp_Times;//放大倍数
private String p_Met_Cri;//执行标准
private String p_Ana_Result;//分析结果
private String p_Met_Data;//金相分析日期
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
@OneToOne(mappedBy="pipeMetTest")
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
 * @return the p_Met_Pos
 */
public String getP_Met_Pos() {
	return p_Met_Pos;
}
/**
 * @param p_Met_Pos the p_Met_Pos to set
 */
public void setP_Met_Pos(String p_Met_Pos) {
	this.p_Met_Pos = p_Met_Pos;
}
/**
 * @return the p_Sample_ID
 */
public String getP_Sample_ID() {
	return p_Sample_ID;
}
/**
 * @param p_Sample_ID the p_Sample_ID to set
 */
public void setP_Sample_ID(String p_Sample_ID) {
	this.p_Sample_ID = p_Sample_ID;
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
 * @return the p_Cor_Method
 */
public String getP_Cor_Method() {
	return p_Cor_Method;
}
/**
 * @param p_Cor_Method the p_Cor_Method to set
 */
public void setP_Cor_Method(String p_Cor_Method) {
	this.p_Cor_Method = p_Cor_Method;
}
/**
 * @return the p_Pol_Method
 */
public String getP_Pol_Method() {
	return p_Pol_Method;
}
/**
 * @param p_Pol_Method the p_Pol_Method to set
 */
public void setP_Pol_Method(String p_Pol_Method) {
	this.p_Pol_Method = p_Pol_Method;
}
/**
 * @return the p_Amp_Times
 */
public String getP_Amp_Times() {
	return p_Amp_Times;
}
/**
 * @param p_Amp_Times the p_Amp_Times to set
 */
public void setP_Amp_Times(String p_Amp_Times) {
	this.p_Amp_Times = p_Amp_Times;
}
/**
 * @return the p_Met_Cri
 */
public String getP_Met_Cri() {
	return p_Met_Cri;
}
/**
 * @param p_Met_Cri the p_Met_Cri to set
 */
public void setP_Met_Cri(String p_Met_Cri) {
	this.p_Met_Cri = p_Met_Cri;
}
/**
 * @return the p_Ana_Result
 */
public String getP_Ana_Result() {
	return p_Ana_Result;
}
/**
 * @param p_Ana_Result the p_Ana_Result to set
 */
public void setP_Ana_Result(String p_Ana_Result) {
	this.p_Ana_Result = p_Ana_Result;
}
/**
 * @return the p_Met_Data
 */
public String getP_Met_Data() {
	return p_Met_Data;
}
/**
 * @param p_Met_Data the p_Met_Data to set
 */
public void setP_Met_Data(String p_Met_Data) {
	this.p_Met_Data = p_Met_Data;
}



}
