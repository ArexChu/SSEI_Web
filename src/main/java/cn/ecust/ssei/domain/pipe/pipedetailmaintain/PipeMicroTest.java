package cn.ecust.ssei.domain.pipe.pipedetailmaintain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeMicroTest")
public class PipeMicroTest {

	private long id;//管道宏观检验的ID号
	private PipeDetailMaintain pipeDetailMaintain;
	private String p_Pos;//管道位置检查
	private String p_Pos_Remark;//
	private String p_Str;//管道结构
	private String p_Str_Remark;//
	private String p_Ins;//绝热层
	private String p_Ins_Remark;//
	private String p_Pro;//防腐层
	private String p_Pro_Remark;//
	private String p_Hanger;//支吊架
	private String p_Hanger_Remark;//
	private String p_Damper;//阻尼器
	private String p_Damper_Remark;//
	private String p_Absorber;//减振器
	private String p_Absorber_Remark;//
	private String p_Compen;//补偿器
	private String p_Compen_Remark;//
	private String p_Valve;//阀  门
	private String p_Valve_Remark;//
	private String p_Fla;//法  兰
	private String p_Fla_Remark;//
	private String p_Exp;//膨胀节
	private String p_Exp_Remark;//
	private String p_Cat_Pro;//阴极保护装置
	private String p_Cat_Pro_Remark;//
	private String p_Creep;//蠕胀测点
	private String p_Creep_Remark;//
	private String p_Fla_Res;//法兰间接触电阻
	private String p_Fla_Res_Remark;//
	private String p_Gro_Res;//对地电阻
	private String p_Gro_Res_Remark;//
	private String p_Ide;//管道标识
	private String p_Ide_Remark;//
	private String p_Component;//管道组成件
	private String p_Component_Remark;//
	private String p_Wel;//焊接接头
	private String p_Wel_Remark;//
	private String p_Other;//其他
	private String p_Other_Remark;//
	private String p_Mac_Date;//宏观检查日期
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
	@OneToOne(mappedBy="pipeMicroTest")
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
	 * @return the p_Pos
	 */
	public String getP_Pos() {
		return p_Pos;
	}
	/**
	 * @param p_Pos the p_Pos to set
	 */
	public void setP_Pos(String p_Pos) {
		this.p_Pos = p_Pos;
	}
	/**
	 * @return the p_Pos_Remark
	 */
	public String getP_Pos_Remark() {
		return p_Pos_Remark;
	}
	/**
	 * @param p_Pos_Remark the p_Pos_Remark to set
	 */
	public void setP_Pos_Remark(String p_Pos_Remark) {
		this.p_Pos_Remark = p_Pos_Remark;
	}
	/**
	 * @return the p_Str
	 */
	public String getP_Str() {
		return p_Str;
	}
	/**
	 * @param p_Str the p_Str to set
	 */
	public void setP_Str(String p_Str) {
		this.p_Str = p_Str;
	}
	/**
	 * @return the p_Str_Remark
	 */
	public String getP_Str_Remark() {
		return p_Str_Remark;
	}
	/**
	 * @param p_Str_Remark the p_Str_Remark to set
	 */
	public void setP_Str_Remark(String p_Str_Remark) {
		this.p_Str_Remark = p_Str_Remark;
	}
	/**
	 * @return the p_Ins
	 */
	public String getP_Ins() {
		return p_Ins;
	}
	/**
	 * @param p_Ins the p_Ins to set
	 */
	public void setP_Ins(String p_Ins) {
		this.p_Ins = p_Ins;
	}
	/**
	 * @return the p_Ins_Remark
	 */
	public String getP_Ins_Remark() {
		return p_Ins_Remark;
	}
	/**
	 * @param p_Ins_Remark the p_Ins_Remark to set
	 */
	public void setP_Ins_Remark(String p_Ins_Remark) {
		this.p_Ins_Remark = p_Ins_Remark;
	}
	/**
	 * @return the p_Pro
	 */
	public String getP_Pro() {
		return p_Pro;
	}
	/**
	 * @param p_Pro the p_Pro to set
	 */
	public void setP_Pro(String p_Pro) {
		this.p_Pro = p_Pro;
	}
	/**
	 * @return the p_Pro_Remark
	 */
	public String getP_Pro_Remark() {
		return p_Pro_Remark;
	}
	/**
	 * @param p_Pro_Remark the p_Pro_Remark to set
	 */
	public void setP_Pro_Remark(String p_Pro_Remark) {
		this.p_Pro_Remark = p_Pro_Remark;
	}
	/**
	 * @return the p_Hanger
	 */
	public String getP_Hanger() {
		return p_Hanger;
	}
	/**
	 * @param p_Hanger the p_Hanger to set
	 */
	public void setP_Hanger(String p_Hanger) {
		this.p_Hanger = p_Hanger;
	}
	/**
	 * @return the p_Hanger_Remark
	 */
	public String getP_Hanger_Remark() {
		return p_Hanger_Remark;
	}
	/**
	 * @param p_Hanger_Remark the p_Hanger_Remark to set
	 */
	public void setP_Hanger_Remark(String p_Hanger_Remark) {
		this.p_Hanger_Remark = p_Hanger_Remark;
	}
	/**
	 * @return the p_Damper
	 */
	public String getP_Damper() {
		return p_Damper;
	}
	/**
	 * @param p_Damper the p_Damper to set
	 */
	public void setP_Damper(String p_Damper) {
		this.p_Damper = p_Damper;
	}
	/**
	 * @return the p_Damper_Remark
	 */
	public String getP_Damper_Remark() {
		return p_Damper_Remark;
	}
	/**
	 * @param p_Damper_Remark the p_Damper_Remark to set
	 */
	public void setP_Damper_Remark(String p_Damper_Remark) {
		this.p_Damper_Remark = p_Damper_Remark;
	}
	/**
	 * @return the p_Absorber
	 */
	public String getP_Absorber() {
		return p_Absorber;
	}
	/**
	 * @param p_Absorber the p_Absorber to set
	 */
	public void setP_Absorber(String p_Absorber) {
		this.p_Absorber = p_Absorber;
	}
	/**
	 * @return the p_Absorber_Remark
	 */
	public String getP_Absorber_Remark() {
		return p_Absorber_Remark;
	}
	/**
	 * @param p_Absorber_Remark the p_Absorber_Remark to set
	 */
	public void setP_Absorber_Remark(String p_Absorber_Remark) {
		this.p_Absorber_Remark = p_Absorber_Remark;
	}
	/**
	 * @return the p_Compen
	 */
	public String getP_Compen() {
		return p_Compen;
	}
	/**
	 * @param p_Compen the p_Compen to set
	 */
	public void setP_Compen(String p_Compen) {
		this.p_Compen = p_Compen;
	}
	/**
	 * @return the p_Compen_Remark
	 */
	public String getP_Compen_Remark() {
		return p_Compen_Remark;
	}
	/**
	 * @param p_Compen_Remark the p_Compen_Remark to set
	 */
	public void setP_Compen_Remark(String p_Compen_Remark) {
		this.p_Compen_Remark = p_Compen_Remark;
	}
	/**
	 * @return the p_Valve
	 */
	public String getP_Valve() {
		return p_Valve;
	}
	/**
	 * @param p_Valve the p_Valve to set
	 */
	public void setP_Valve(String p_Valve) {
		this.p_Valve = p_Valve;
	}
	/**
	 * @return the p_Valve_Remark
	 */
	public String getP_Valve_Remark() {
		return p_Valve_Remark;
	}
	/**
	 * @param p_Valve_Remark the p_Valve_Remark to set
	 */
	public void setP_Valve_Remark(String p_Valve_Remark) {
		this.p_Valve_Remark = p_Valve_Remark;
	}
	/**
	 * @return the p_Fla
	 */
	public String getP_Fla() {
		return p_Fla;
	}
	/**
	 * @param p_Fla the p_Fla to set
	 */
	public void setP_Fla(String p_Fla) {
		this.p_Fla = p_Fla;
	}
	/**
	 * @return the p_Fla_Remark
	 */
	public String getP_Fla_Remark() {
		return p_Fla_Remark;
	}
	/**
	 * @param p_Fla_Remark the p_Fla_Remark to set
	 */
	public void setP_Fla_Remark(String p_Fla_Remark) {
		this.p_Fla_Remark = p_Fla_Remark;
	}
	/**
	 * @return the p_Exp
	 */
	public String getP_Exp() {
		return p_Exp;
	}
	/**
	 * @param p_Exp the p_Exp to set
	 */
	public void setP_Exp(String p_Exp) {
		this.p_Exp = p_Exp;
	}
	/**
	 * @return the p_Exp_Remark
	 */
	public String getP_Exp_Remark() {
		return p_Exp_Remark;
	}
	/**
	 * @param p_Exp_Remark the p_Exp_Remark to set
	 */
	public void setP_Exp_Remark(String p_Exp_Remark) {
		this.p_Exp_Remark = p_Exp_Remark;
	}
	/**
	 * @return the p_Cat_Pro
	 */
	public String getP_Cat_Pro() {
		return p_Cat_Pro;
	}
	/**
	 * @param p_Cat_Pro the p_Cat_Pro to set
	 */
	public void setP_Cat_Pro(String p_Cat_Pro) {
		this.p_Cat_Pro = p_Cat_Pro;
	}
	/**
	 * @return the p_Cat_Pro_Remark
	 */
	public String getP_Cat_Pro_Remark() {
		return p_Cat_Pro_Remark;
	}
	/**
	 * @param p_Cat_Pro_Remark the p_Cat_Pro_Remark to set
	 */
	public void setP_Cat_Pro_Remark(String p_Cat_Pro_Remark) {
		this.p_Cat_Pro_Remark = p_Cat_Pro_Remark;
	}
	/**
	 * @return the p_Creep
	 */
	public String getP_Creep() {
		return p_Creep;
	}
	/**
	 * @param p_Creep the p_Creep to set
	 */
	public void setP_Creep(String p_Creep) {
		this.p_Creep = p_Creep;
	}
	/**
	 * @return the p_Creep_Remark
	 */
	public String getP_Creep_Remark() {
		return p_Creep_Remark;
	}
	/**
	 * @param p_Creep_Remark the p_Creep_Remark to set
	 */
	public void setP_Creep_Remark(String p_Creep_Remark) {
		this.p_Creep_Remark = p_Creep_Remark;
	}
	/**
	 * @return the p_Fla_Res
	 */
	public String getP_Fla_Res() {
		return p_Fla_Res;
	}
	/**
	 * @param p_Fla_Res the p_Fla_Res to set
	 */
	public void setP_Fla_Res(String p_Fla_Res) {
		this.p_Fla_Res = p_Fla_Res;
	}
	/**
	 * @return the p_Fla_Res_Remark
	 */
	public String getP_Fla_Res_Remark() {
		return p_Fla_Res_Remark;
	}
	/**
	 * @param p_Fla_Res_Remark the p_Fla_Res_Remark to set
	 */
	public void setP_Fla_Res_Remark(String p_Fla_Res_Remark) {
		this.p_Fla_Res_Remark = p_Fla_Res_Remark;
	}
	/**
	 * @return the p_Gro_Res
	 */
	public String getP_Gro_Res() {
		return p_Gro_Res;
	}
	/**
	 * @param p_Gro_Res the p_Gro_Res to set
	 */
	public void setP_Gro_Res(String p_Gro_Res) {
		this.p_Gro_Res = p_Gro_Res;
	}
	/**
	 * @return the p_Gro_Res_Remark
	 */
	public String getP_Gro_Res_Remark() {
		return p_Gro_Res_Remark;
	}
	/**
	 * @param p_Gro_Res_Remark the p_Gro_Res_Remark to set
	 */
	public void setP_Gro_Res_Remark(String p_Gro_Res_Remark) {
		this.p_Gro_Res_Remark = p_Gro_Res_Remark;
	}
	/**
	 * @return the p_Ide
	 */
	public String getP_Ide() {
		return p_Ide;
	}
	/**
	 * @param p_Ide the p_Ide to set
	 */
	public void setP_Ide(String p_Ide) {
		this.p_Ide = p_Ide;
	}
	/**
	 * @return the p_Ide_Remark
	 */
	public String getP_Ide_Remark() {
		return p_Ide_Remark;
	}
	/**
	 * @param p_Ide_Remark the p_Ide_Remark to set
	 */
	public void setP_Ide_Remark(String p_Ide_Remark) {
		this.p_Ide_Remark = p_Ide_Remark;
	}
	/**
	 * @return the p_Component
	 */
	public String getP_Component() {
		return p_Component;
	}
	/**
	 * @param p_Component the p_Component to set
	 */
	public void setP_Component(String p_Component) {
		this.p_Component = p_Component;
	}
	/**
	 * @return the p_Component_Remark
	 */
	public String getP_Component_Remark() {
		return p_Component_Remark;
	}
	/**
	 * @param p_Component_Remark the p_Component_Remark to set
	 */
	public void setP_Component_Remark(String p_Component_Remark) {
		this.p_Component_Remark = p_Component_Remark;
	}
	/**
	 * @return the p_Wel
	 */
	public String getP_Wel() {
		return p_Wel;
	}
	/**
	 * @param p_Wel the p_Wel to set
	 */
	public void setP_Wel(String p_Wel) {
		this.p_Wel = p_Wel;
	}
	/**
	 * @return the p_Wel_Remark
	 */
	public String getP_Wel_Remark() {
		return p_Wel_Remark;
	}
	/**
	 * @param p_Wel_Remark the p_Wel_Remark to set
	 */
	public void setP_Wel_Remark(String p_Wel_Remark) {
		this.p_Wel_Remark = p_Wel_Remark;
	}
	/**
	 * @return the p_Other
	 */
	public String getP_Other() {
		return p_Other;
	}
	/**
	 * @param p_Other the p_Other to set
	 */
	public void setP_Other(String p_Other) {
		this.p_Other = p_Other;
	}
	/**
	 * @return the p_Other_Remark
	 */
	public String getP_Other_Remark() {
		return p_Other_Remark;
	}
	/**
	 * @param p_Other_Remark the p_Other_Remark to set
	 */
	public void setP_Other_Remark(String p_Other_Remark) {
		this.p_Other_Remark = p_Other_Remark;
	}
	/**
	 * @return the p_Mac_Date
	 */
	public String getP_Mac_Date() {
		return p_Mac_Date;
	}
	/**
	 * @param p_Mac_Date the p_Mac_Date to set
	 */
	public void setP_Mac_Date(String p_Mac_Date) {
		this.p_Mac_Date = p_Mac_Date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PipeMicroTest [id=" + id + ", pipeDetailMaintain="
				+ pipeDetailMaintain + ", p_Pos=" + p_Pos + ", p_Pos_Remark="
				+ p_Pos_Remark + ", p_Str=" + p_Str + ", p_Str_Remark="
				+ p_Str_Remark + ", p_Ins=" + p_Ins + ", p_Ins_Remark="
				+ p_Ins_Remark + ", p_Pro=" + p_Pro + ", p_Pro_Remark="
				+ p_Pro_Remark + ", p_Hanger=" + p_Hanger
				+ ", p_Hanger_Remark=" + p_Hanger_Remark + ", p_Damper="
				+ p_Damper + ", p_Damper_Remark=" + p_Damper_Remark
				+ ", p_Absorber=" + p_Absorber + ", p_Absorber_Remark="
				+ p_Absorber_Remark + ", p_Compen=" + p_Compen
				+ ", p_Compen_Remark=" + p_Compen_Remark + ", p_Valve="
				+ p_Valve + ", p_Valve_Remark=" + p_Valve_Remark + ", p_Fla="
				+ p_Fla + ", p_Fla_Remark=" + p_Fla_Remark + ", p_Exp=" + p_Exp
				+ ", p_Exp_Remark=" + p_Exp_Remark + ", p_Cat_Pro=" + p_Cat_Pro
				+ ", p_Cat_Pro_Remark=" + p_Cat_Pro_Remark + ", p_Creep="
				+ p_Creep + ", p_Creep_Remark=" + p_Creep_Remark
				+ ", p_Fla_Res=" + p_Fla_Res + ", p_Fla_Res_Remark="
				+ p_Fla_Res_Remark + ", p_Gro_Res=" + p_Gro_Res
				+ ", p_Gro_Res_Remark=" + p_Gro_Res_Remark + ", p_Ide=" + p_Ide
				+ ", p_Ide_Remark=" + p_Ide_Remark + ", p_Component="
				+ p_Component + ", p_Component_Remark=" + p_Component_Remark
				+ ", p_Wel=" + p_Wel + ", p_Wel_Remark=" + p_Wel_Remark
				+ ", p_Other=" + p_Other + ", p_Other_Remark=" + p_Other_Remark
				+ ", p_Mac_Date=" + p_Mac_Date + "]";
	}

	
	
	
	
	
	
}
