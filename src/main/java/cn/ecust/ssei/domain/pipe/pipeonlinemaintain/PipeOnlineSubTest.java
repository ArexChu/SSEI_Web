package cn.ecust.ssei.domain.pipe.pipeonlinemaintain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeOnlineSubTest")
public class PipeOnlineSubTest {
	
	private long id;
	private PipeOnlineMaintain pipeOnlineMaintain;
	private String m_OL_Prep;//资料准备
	private String m_OL_Check;//记录审查
	private String p_Surface;//管道表面
	private String p_Other;//其他
	private String p_Wel;//焊接接头
	private String p_Leak;//泄漏
	private String p_Ins;//绝热层
	private String p_Pro;//防腐层
	private String p_Vib;//管道振动
	private String p_Hanger;//支吊架
	private String p_Valve;//阀门
	private String p_Exp;//膨胀节
	private String p_Fla;//法兰
	private String p_Str;//管道结构
	private String p_Ide;//管道标识
	private String p_Fla_Res;//法兰间接触电阻
	private String p_Gro_Res;//对地电阻
	private String p_Thi;//壁厚测定
	private String m_OL_Pre;//压力表
	private String m_OL_Tem;//测温仪表
	private String m_OL_Valve;//安全阀
	private String m_OL_Rup;//爆破片装置
	private String m_OL_Others;//其它
	private String m_OL_Bug;//缺陷情况说明
	private String m_OL_Bug_Sol;//缺陷处理情况说明
	private String m_OL_Result;//检验结果
	private String m_Test_Date;//检验人员
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
	 * @return the pipeOnlineMaintain
	 */
	@OneToOne(mappedBy="pipeOnlineSubTest")
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
	 * @return the m_OL_Prep
	 */
	public String getM_OL_Prep() {
		return m_OL_Prep;
	}
	/**
	 * @param m_OL_Prep the m_OL_Prep to set
	 */
	public void setM_OL_Prep(String m_OL_Prep) {
		this.m_OL_Prep = m_OL_Prep;
	}
	/**
	 * @return the m_OL_Check
	 */
	public String getM_OL_Check() {
		return m_OL_Check;
	}
	/**
	 * @param m_OL_Check the m_OL_Check to set
	 */
	public void setM_OL_Check(String m_OL_Check) {
		this.m_OL_Check = m_OL_Check;
	}
	/**
	 * @return the p_Surface
	 */
	public String getP_Surface() {
		return p_Surface;
	}
	/**
	 * @param p_Surface the p_Surface to set
	 */
	public void setP_Surface(String p_Surface) {
		this.p_Surface = p_Surface;
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
	 * @return the p_Leak
	 */
	public String getP_Leak() {
		return p_Leak;
	}
	/**
	 * @param p_Leak the p_Leak to set
	 */
	public void setP_Leak(String p_Leak) {
		this.p_Leak = p_Leak;
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
	 * @return the p_Vib
	 */
	public String getP_Vib() {
		return p_Vib;
	}
	/**
	 * @param p_Vib the p_Vib to set
	 */
	public void setP_Vib(String p_Vib) {
		this.p_Vib = p_Vib;
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
	 * @return the p_Thi
	 */
	public String getP_Thi() {
		return p_Thi;
	}
	/**
	 * @param p_Thi the p_Thi to set
	 */
	public void setP_Thi(String p_Thi) {
		this.p_Thi = p_Thi;
	}
	/**
	 * @return the m_OL_Pre
	 */
	public String getM_OL_Pre() {
		return m_OL_Pre;
	}
	/**
	 * @param m_OL_Pre the m_OL_Pre to set
	 */
	public void setM_OL_Pre(String m_OL_Pre) {
		this.m_OL_Pre = m_OL_Pre;
	}
	/**
	 * @return the m_OL_Tem
	 */
	public String getM_OL_Tem() {
		return m_OL_Tem;
	}
	/**
	 * @param m_OL_Tem the m_OL_Tem to set
	 */
	public void setM_OL_Tem(String m_OL_Tem) {
		this.m_OL_Tem = m_OL_Tem;
	}
	/**
	 * @return the m_OL_Valve
	 */
	public String getM_OL_Valve() {
		return m_OL_Valve;
	}
	/**
	 * @param m_OL_Valve the m_OL_Valve to set
	 */
	public void setM_OL_Valve(String m_OL_Valve) {
		this.m_OL_Valve = m_OL_Valve;
	}
	/**
	 * @return the m_OL_Rup
	 */
	public String getM_OL_Rup() {
		return m_OL_Rup;
	}
	/**
	 * @param m_OL_Rup the m_OL_Rup to set
	 */
	public void setM_OL_Rup(String m_OL_Rup) {
		this.m_OL_Rup = m_OL_Rup;
	}
	/**
	 * @return the m_OL_Others
	 */
	public String getM_OL_Others() {
		return m_OL_Others;
	}
	/**
	 * @param m_OL_Others the m_OL_Others to set
	 */
	public void setM_OL_Others(String m_OL_Others) {
		this.m_OL_Others = m_OL_Others;
	}
	/**
	 * @return the m_OL_Bug
	 */
	public String getM_OL_Bug() {
		return m_OL_Bug;
	}
	/**
	 * @param m_OL_Bug the m_OL_Bug to set
	 */
	public void setM_OL_Bug(String m_OL_Bug) {
		this.m_OL_Bug = m_OL_Bug;
	}
	/**
	 * @return the m_OL_Bug_Sol
	 */
	public String getM_OL_Bug_Sol() {
		return m_OL_Bug_Sol;
	}
	/**
	 * @param m_OL_Bug_Sol the m_OL_Bug_Sol to set
	 */
	public void setM_OL_Bug_Sol(String m_OL_Bug_Sol) {
		this.m_OL_Bug_Sol = m_OL_Bug_Sol;
	}
	/**
	 * @return the m_OL_Result
	 */
	public String getM_OL_Result() {
		return m_OL_Result;
	}
	/**
	 * @param m_OL_Result the m_OL_Result to set
	 */
	public void setM_OL_Result(String m_OL_Result) {
		this.m_OL_Result = m_OL_Result;
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
	
	

}
