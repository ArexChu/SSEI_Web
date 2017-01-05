package cn.ecust.ssei.domain.pipe.pipedetailmaintain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeSPDTest")
public class PipeSPDTest {

	private long id; // 安全保护装置检查ID
	private PipeDetailMaintain pipeDetailMaintain;
	private String pre_De_Num; //压 力 表设计规定数
	private String pre_Wo_Num; //压 力 表实际安装数
	private String pre_Wo_Pos; //压 力 表安装位置
	private String pre_Valid_Date; //压 力 表有效期
	private String pre_Range; //压 力 表量程
	private String pre_Acc; //压 力 表精度
	private String pre_Dia; //压 力 表表盘直径
	private String pre_Appe; //压 力 表外观质量
	private String tem_De_Num; //测温仪表设计规定数
	private String tem_Wo_Num; //测温仪表实际安装数
	private String tem_Wo_Pos; //测温仪表安装位置
	private String tem_Valid_Date; //测温仪表有效期
	private String tem_Range; //测温仪表量程
	private String tem_Acc; //测温仪表精度
	private String tem_Appe; //测温仪表外观质量
	private String valve_De_Num; //	安全阀设计数量
	private String valve_De_Mod; //安全阀设计型号
	private String valve_De_Pre; //安全阀设计公称压力
	private String valve_De_Dia; //	安全阀设计公称通径
	private String valve_Num; //安全阀数量
	private String valve_Mod; //安全阀型号
	private String valve_Pre; //安全阀公称压力	
	private String valve_Dia; //安全阀公称通径
	private String valve_Start_Pre; //开启压力
	private String valve_Wo_Tem; //	工作温度
	private String valve_Wo_Med; //工作介质
	private String valve_Appe; //外观质量
	private String valve_Valid_Date; //	有效期
	private String valve_Seal; //铅封
	private String valve_Wo_Pos; //位置
	private String valve_Man_ID; //	制造许可证
	private String valve_Cer_ID; //合格证编号
	private String rup_De_Num; //爆破片设计数量
	private String rup_De_Mod; //	爆破片设计型号
	private String rup_De_Norm; //爆破片设计规格
	private String rup_De_Stress; //爆破片设计爆破应力
	private String rup_De_Dia; //	爆破片设计公称直径
	private String rup_De_Ma; //爆破片设计材料
	private String rup_Num; //爆破片数量
	private String rup_Mod; //爆破片型号
	private String rup_Dia; //	爆破片公称直径
	private String rup_Norm; //爆破片规格
	private String rup_Appe; //爆破片外观质量
	private String rup_Valid_Date; //爆破片有效期	
	private String rup_Wo_Pos; //爆破片安装位置
	private String rup_Cer_ID; //爆破片合格证编号
	private String rup_Man_ID; //爆破片制造许可证
	private String ecof_Man_Com; //	制造厂家
	private String ecof_Man_ID; //制造许可科正号
	private String ecof_Cer_ID; //合格证编号
	private String ecof_Norm; //	型式及规格
	private String ecof_Cut_Time; //切断时间
	private String ecof_Valid_Date; //有限期
	private String ecof_Pre_Test; //耐压试验
	private String ecof_Seal_Pre; //密封压力试验
	private String ecof_Seal; //铅封
	private String ecof_Remark; //备注
	private String ecof_Date; //测试时间
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
	@OneToOne(mappedBy="pipeSPDTest")
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
	 * @return the pre_De_Num
	 */
	public String getPre_De_Num() {
		return pre_De_Num;
	}
	/**
	 * @param pre_De_Num the pre_De_Num to set
	 */
	public void setPre_De_Num(String pre_De_Num) {
		this.pre_De_Num = pre_De_Num;
	}
	/**
	 * @return the pre_Wo_Num
	 */
	public String getPre_Wo_Num() {
		return pre_Wo_Num;
	}
	/**
	 * @param pre_Wo_Num the pre_Wo_Num to set
	 */
	public void setPre_Wo_Num(String pre_Wo_Num) {
		this.pre_Wo_Num = pre_Wo_Num;
	}
	/**
	 * @return the pre_Wo_Pos
	 */
	public String getPre_Wo_Pos() {
		return pre_Wo_Pos;
	}
	/**
	 * @param pre_Wo_Pos the pre_Wo_Pos to set
	 */
	public void setPre_Wo_Pos(String pre_Wo_Pos) {
		this.pre_Wo_Pos = pre_Wo_Pos;
	}
	/**
	 * @return the pre_Valid_Date
	 */
	public String getPre_Valid_Date() {
		return pre_Valid_Date;
	}
	/**
	 * @param pre_Valid_Date the pre_Valid_Date to set
	 */
	public void setPre_Valid_Date(String pre_Valid_Date) {
		this.pre_Valid_Date = pre_Valid_Date;
	}
	/**
	 * @return the pre_Range
	 */
	public String getPre_Range() {
		return pre_Range;
	}
	/**
	 * @param pre_Range the pre_Range to set
	 */
	public void setPre_Range(String pre_Range) {
		this.pre_Range = pre_Range;
	}
	/**
	 * @return the pre_Acc
	 */
	public String getPre_Acc() {
		return pre_Acc;
	}
	/**
	 * @param pre_Acc the pre_Acc to set
	 */
	public void setPre_Acc(String pre_Acc) {
		this.pre_Acc = pre_Acc;
	}
	/**
	 * @return the pre_Dia
	 */
	public String getPre_Dia() {
		return pre_Dia;
	}
	/**
	 * @param pre_Dia the pre_Dia to set
	 */
	public void setPre_Dia(String pre_Dia) {
		this.pre_Dia = pre_Dia;
	}
	/**
	 * @return the pre_Appe
	 */
	public String getPre_Appe() {
		return pre_Appe;
	}
	/**
	 * @param pre_Appe the pre_Appe to set
	 */
	public void setPre_Appe(String pre_Appe) {
		this.pre_Appe = pre_Appe;
	}
	/**
	 * @return the tem_De_Num
	 */
	public String getTem_De_Num() {
		return tem_De_Num;
	}
	/**
	 * @param tem_De_Num the tem_De_Num to set
	 */
	public void setTem_De_Num(String tem_De_Num) {
		this.tem_De_Num = tem_De_Num;
	}
	/**
	 * @return the tem_Wo_Num
	 */
	public String getTem_Wo_Num() {
		return tem_Wo_Num;
	}
	/**
	 * @param tem_Wo_Num the tem_Wo_Num to set
	 */
	public void setTem_Wo_Num(String tem_Wo_Num) {
		this.tem_Wo_Num = tem_Wo_Num;
	}
	/**
	 * @return the tem_Wo_Pos
	 */
	public String getTem_Wo_Pos() {
		return tem_Wo_Pos;
	}
	/**
	 * @param tem_Wo_Pos the tem_Wo_Pos to set
	 */
	public void setTem_Wo_Pos(String tem_Wo_Pos) {
		this.tem_Wo_Pos = tem_Wo_Pos;
	}
	/**
	 * @return the tem_Valid_Date
	 */
	public String getTem_Valid_Date() {
		return tem_Valid_Date;
	}
	/**
	 * @param tem_Valid_Date the tem_Valid_Date to set
	 */
	public void setTem_Valid_Date(String tem_Valid_Date) {
		this.tem_Valid_Date = tem_Valid_Date;
	}
	/**
	 * @return the tem_Range
	 */
	public String getTem_Range() {
		return tem_Range;
	}
	/**
	 * @param tem_Range the tem_Range to set
	 */
	public void setTem_Range(String tem_Range) {
		this.tem_Range = tem_Range;
	}
	/**
	 * @return the tem_Acc
	 */
	public String getTem_Acc() {
		return tem_Acc;
	}
	/**
	 * @param tem_Acc the tem_Acc to set
	 */
	public void setTem_Acc(String tem_Acc) {
		this.tem_Acc = tem_Acc;
	}
	/**
	 * @return the tem_Appe
	 */
	public String getTem_Appe() {
		return tem_Appe;
	}
	/**
	 * @param tem_Appe the tem_Appe to set
	 */
	public void setTem_Appe(String tem_Appe) {
		this.tem_Appe = tem_Appe;
	}
	/**
	 * @return the valve_De_Num
	 */
	public String getValve_De_Num() {
		return valve_De_Num;
	}
	/**
	 * @param valve_De_Num the valve_De_Num to set
	 */
	public void setValve_De_Num(String valve_De_Num) {
		this.valve_De_Num = valve_De_Num;
	}
	/**
	 * @return the valve_De_Mod
	 */
	public String getValve_De_Mod() {
		return valve_De_Mod;
	}
	/**
	 * @param valve_De_Mod the valve_De_Mod to set
	 */
	public void setValve_De_Mod(String valve_De_Mod) {
		this.valve_De_Mod = valve_De_Mod;
	}
	/**
	 * @return the valve_De_Pre
	 */
	public String getValve_De_Pre() {
		return valve_De_Pre;
	}
	/**
	 * @param valve_De_Pre the valve_De_Pre to set
	 */
	public void setValve_De_Pre(String valve_De_Pre) {
		this.valve_De_Pre = valve_De_Pre;
	}
	/**
	 * @return the valve_De_Dia
	 */
	public String getValve_De_Dia() {
		return valve_De_Dia;
	}
	/**
	 * @param valve_De_Dia the valve_De_Dia to set
	 */
	public void setValve_De_Dia(String valve_De_Dia) {
		this.valve_De_Dia = valve_De_Dia;
	}
	/**
	 * @return the valve_Num
	 */
	public String getValve_Num() {
		return valve_Num;
	}
	/**
	 * @param valve_Num the valve_Num to set
	 */
	public void setValve_Num(String valve_Num) {
		this.valve_Num = valve_Num;
	}
	/**
	 * @return the valve_Mod
	 */
	public String getValve_Mod() {
		return valve_Mod;
	}
	/**
	 * @param valve_Mod the valve_Mod to set
	 */
	public void setValve_Mod(String valve_Mod) {
		this.valve_Mod = valve_Mod;
	}
	/**
	 * @return the valve_Pre
	 */
	public String getValve_Pre() {
		return valve_Pre;
	}
	/**
	 * @param valve_Pre the valve_Pre to set
	 */
	public void setValve_Pre(String valve_Pre) {
		this.valve_Pre = valve_Pre;
	}
	/**
	 * @return the valve_Dia
	 */
	public String getValve_Dia() {
		return valve_Dia;
	}
	/**
	 * @param valve_Dia the valve_Dia to set
	 */
	public void setValve_Dia(String valve_Dia) {
		this.valve_Dia = valve_Dia;
	}
	/**
	 * @return the valve_Start_Pre
	 */
	public String getValve_Start_Pre() {
		return valve_Start_Pre;
	}
	/**
	 * @param valve_Start_Pre the valve_Start_Pre to set
	 */
	public void setValve_Start_Pre(String valve_Start_Pre) {
		this.valve_Start_Pre = valve_Start_Pre;
	}
	/**
	 * @return the valve_Wo_Tem
	 */
	public String getValve_Wo_Tem() {
		return valve_Wo_Tem;
	}
	/**
	 * @param valve_Wo_Tem the valve_Wo_Tem to set
	 */
	public void setValve_Wo_Tem(String valve_Wo_Tem) {
		this.valve_Wo_Tem = valve_Wo_Tem;
	}
	/**
	 * @return the valve_Wo_Med
	 */
	public String getValve_Wo_Med() {
		return valve_Wo_Med;
	}
	/**
	 * @param valve_Wo_Med the valve_Wo_Med to set
	 */
	public void setValve_Wo_Med(String valve_Wo_Med) {
		this.valve_Wo_Med = valve_Wo_Med;
	}
	/**
	 * @return the valve_Appe
	 */
	public String getValve_Appe() {
		return valve_Appe;
	}
	/**
	 * @param valve_Appe the valve_Appe to set
	 */
	public void setValve_Appe(String valve_Appe) {
		this.valve_Appe = valve_Appe;
	}
	/**
	 * @return the valve_Valid_Date
	 */
	public String getValve_Valid_Date() {
		return valve_Valid_Date;
	}
	/**
	 * @param valve_Valid_Date the valve_Valid_Date to set
	 */
	public void setValve_Valid_Date(String valve_Valid_Date) {
		this.valve_Valid_Date = valve_Valid_Date;
	}
	/**
	 * @return the valve_Seal
	 */
	public String getValve_Seal() {
		return valve_Seal;
	}
	/**
	 * @param valve_Seal the valve_Seal to set
	 */
	public void setValve_Seal(String valve_Seal) {
		this.valve_Seal = valve_Seal;
	}
	/**
	 * @return the valve_Wo_Pos
	 */
	public String getValve_Wo_Pos() {
		return valve_Wo_Pos;
	}
	/**
	 * @param valve_Wo_Pos the valve_Wo_Pos to set
	 */
	public void setValve_Wo_Pos(String valve_Wo_Pos) {
		this.valve_Wo_Pos = valve_Wo_Pos;
	}
	/**
	 * @return the valve_Man_ID
	 */
	public String getValve_Man_ID() {
		return valve_Man_ID;
	}
	/**
	 * @param valve_Man_ID the valve_Man_ID to set
	 */
	public void setValve_Man_ID(String valve_Man_ID) {
		this.valve_Man_ID = valve_Man_ID;
	}
	/**
	 * @return the valve_Cer_ID
	 */
	public String getValve_Cer_ID() {
		return valve_Cer_ID;
	}
	/**
	 * @param valve_Cer_ID the valve_Cer_ID to set
	 */
	public void setValve_Cer_ID(String valve_Cer_ID) {
		this.valve_Cer_ID = valve_Cer_ID;
	}
	/**
	 * @return the rup_De_Num
	 */
	public String getRup_De_Num() {
		return rup_De_Num;
	}
	/**
	 * @param rup_De_Num the rup_De_Num to set
	 */
	public void setRup_De_Num(String rup_De_Num) {
		this.rup_De_Num = rup_De_Num;
	}
	/**
	 * @return the rup_De_Mod
	 */
	public String getRup_De_Mod() {
		return rup_De_Mod;
	}
	/**
	 * @param rup_De_Mod the rup_De_Mod to set
	 */
	public void setRup_De_Mod(String rup_De_Mod) {
		this.rup_De_Mod = rup_De_Mod;
	}
	/**
	 * @return the rup_De_Norm
	 */
	public String getRup_De_Norm() {
		return rup_De_Norm;
	}
	/**
	 * @param rup_De_Norm the rup_De_Norm to set
	 */
	public void setRup_De_Norm(String rup_De_Norm) {
		this.rup_De_Norm = rup_De_Norm;
	}
	/**
	 * @return the rup_De_Stress
	 */
	public String getRup_De_Stress() {
		return rup_De_Stress;
	}
	/**
	 * @param rup_De_Stress the rup_De_Stress to set
	 */
	public void setRup_De_Stress(String rup_De_Stress) {
		this.rup_De_Stress = rup_De_Stress;
	}
	/**
	 * @return the rup_De_Dia
	 */
	public String getRup_De_Dia() {
		return rup_De_Dia;
	}
	/**
	 * @param rup_De_Dia the rup_De_Dia to set
	 */
	public void setRup_De_Dia(String rup_De_Dia) {
		this.rup_De_Dia = rup_De_Dia;
	}
	/**
	 * @return the rup_De_Ma
	 */
	public String getRup_De_Ma() {
		return rup_De_Ma;
	}
	/**
	 * @param rup_De_Ma the rup_De_Ma to set
	 */
	public void setRup_De_Ma(String rup_De_Ma) {
		this.rup_De_Ma = rup_De_Ma;
	}
	/**
	 * @return the rup_Num
	 */
	public String getRup_Num() {
		return rup_Num;
	}
	/**
	 * @param rup_Num the rup_Num to set
	 */
	public void setRup_Num(String rup_Num) {
		this.rup_Num = rup_Num;
	}
	/**
	 * @return the rup_Mod
	 */
	public String getRup_Mod() {
		return rup_Mod;
	}
	/**
	 * @param rup_Mod the rup_Mod to set
	 */
	public void setRup_Mod(String rup_Mod) {
		this.rup_Mod = rup_Mod;
	}
	/**
	 * @return the rup_Dia
	 */
	public String getRup_Dia() {
		return rup_Dia;
	}
	/**
	 * @param rup_Dia the rup_Dia to set
	 */
	public void setRup_Dia(String rup_Dia) {
		this.rup_Dia = rup_Dia;
	}
	/**
	 * @return the rup_Norm
	 */
	public String getRup_Norm() {
		return rup_Norm;
	}
	/**
	 * @param rup_Norm the rup_Norm to set
	 */
	public void setRup_Norm(String rup_Norm) {
		this.rup_Norm = rup_Norm;
	}
	/**
	 * @return the rup_Appe
	 */
	public String getRup_Appe() {
		return rup_Appe;
	}
	/**
	 * @param rup_Appe the rup_Appe to set
	 */
	public void setRup_Appe(String rup_Appe) {
		this.rup_Appe = rup_Appe;
	}
	/**
	 * @return the rup_Valid_Date
	 */
	public String getRup_Valid_Date() {
		return rup_Valid_Date;
	}
	/**
	 * @param rup_Valid_Date the rup_Valid_Date to set
	 */
	public void setRup_Valid_Date(String rup_Valid_Date) {
		this.rup_Valid_Date = rup_Valid_Date;
	}
	/**
	 * @return the rup_Wo_Pos
	 */
	public String getRup_Wo_Pos() {
		return rup_Wo_Pos;
	}
	/**
	 * @param rup_Wo_Pos the rup_Wo_Pos to set
	 */
	public void setRup_Wo_Pos(String rup_Wo_Pos) {
		this.rup_Wo_Pos = rup_Wo_Pos;
	}
	/**
	 * @return the rup_Cer_ID
	 */
	public String getRup_Cer_ID() {
		return rup_Cer_ID;
	}
	/**
	 * @param rup_Cer_ID the rup_Cer_ID to set
	 */
	public void setRup_Cer_ID(String rup_Cer_ID) {
		this.rup_Cer_ID = rup_Cer_ID;
	}
	/**
	 * @return the rup_Man_ID
	 */
	public String getRup_Man_ID() {
		return rup_Man_ID;
	}
	/**
	 * @param rup_Man_ID the rup_Man_ID to set
	 */
	public void setRup_Man_ID(String rup_Man_ID) {
		this.rup_Man_ID = rup_Man_ID;
	}
	/**
	 * @return the ecof_Man_Com
	 */
	public String getEcof_Man_Com() {
		return ecof_Man_Com;
	}
	/**
	 * @param ecof_Man_Com the ecof_Man_Com to set
	 */
	public void setEcof_Man_Com(String ecof_Man_Com) {
		this.ecof_Man_Com = ecof_Man_Com;
	}
	/**
	 * @return the ecof_Man_ID
	 */
	public String getEcof_Man_ID() {
		return ecof_Man_ID;
	}
	/**
	 * @param ecof_Man_ID the ecof_Man_ID to set
	 */
	public void setEcof_Man_ID(String ecof_Man_ID) {
		this.ecof_Man_ID = ecof_Man_ID;
	}
	/**
	 * @return the ecof_Cer_ID
	 */
	public String getEcof_Cer_ID() {
		return ecof_Cer_ID;
	}
	/**
	 * @param ecof_Cer_ID the ecof_Cer_ID to set
	 */
	public void setEcof_Cer_ID(String ecof_Cer_ID) {
		this.ecof_Cer_ID = ecof_Cer_ID;
	}
	/**
	 * @return the ecof_Norm
	 */
	public String getEcof_Norm() {
		return ecof_Norm;
	}
	/**
	 * @param ecof_Norm the ecof_Norm to set
	 */
	public void setEcof_Norm(String ecof_Norm) {
		this.ecof_Norm = ecof_Norm;
	}
	/**
	 * @return the ecof_Cut_Time
	 */
	public String getEcof_Cut_Time() {
		return ecof_Cut_Time;
	}
	/**
	 * @param ecof_Cut_Time the ecof_Cut_Time to set
	 */
	public void setEcof_Cut_Time(String ecof_Cut_Time) {
		this.ecof_Cut_Time = ecof_Cut_Time;
	}
	/**
	 * @return the ecof_Valid_Date
	 */
	public String getEcof_Valid_Date() {
		return ecof_Valid_Date;
	}
	/**
	 * @param ecof_Valid_Date the ecof_Valid_Date to set
	 */
	public void setEcof_Valid_Date(String ecof_Valid_Date) {
		this.ecof_Valid_Date = ecof_Valid_Date;
	}
	/**
	 * @return the ecof_Pre_Test
	 */
	public String getEcof_Pre_Test() {
		return ecof_Pre_Test;
	}
	/**
	 * @param ecof_Pre_Test the ecof_Pre_Test to set
	 */
	public void setEcof_Pre_Test(String ecof_Pre_Test) {
		this.ecof_Pre_Test = ecof_Pre_Test;
	}
	/**
	 * @return the ecof_Seal_Pre
	 */
	public String getEcof_Seal_Pre() {
		return ecof_Seal_Pre;
	}
	/**
	 * @param ecof_Seal_Pre the ecof_Seal_Pre to set
	 */
	public void setEcof_Seal_Pre(String ecof_Seal_Pre) {
		this.ecof_Seal_Pre = ecof_Seal_Pre;
	}
	/**
	 * @return the ecof_Seal
	 */
	public String getEcof_Seal() {
		return ecof_Seal;
	}
	/**
	 * @param ecof_Seal the ecof_Seal to set
	 */
	public void setEcof_Seal(String ecof_Seal) {
		this.ecof_Seal = ecof_Seal;
	}
	/**
	 * @return the ecof_Remark
	 */
	public String getEcof_Remark() {
		return ecof_Remark;
	}
	/**
	 * @param ecof_Remark the ecof_Remark to set
	 */
	public void setEcof_Remark(String ecof_Remark) {
		this.ecof_Remark = ecof_Remark;
	}
	/**
	 * @return the ecof_Date
	 */
	public String getEcof_Date() {
		return ecof_Date;
	}
	/**
	 * @param ecof_Date the ecof_Date to set
	 */
	public void setEcof_Date(String ecof_Date) {
		this.ecof_Date = ecof_Date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PipeSPDTest [id=" + id + ", pipeDetailMaintain="
				+ pipeDetailMaintain + ", pre_De_Num=" + pre_De_Num
				+ ", pre_Wo_Num=" + pre_Wo_Num + ", pre_Wo_Pos=" + pre_Wo_Pos
				+ ", pre_Valid_Date=" + pre_Valid_Date + ", pre_Range="
				+ pre_Range + ", pre_Acc=" + pre_Acc + ", pre_Dia=" + pre_Dia
				+ ", pre_Appe=" + pre_Appe + ", tem_De_Num=" + tem_De_Num
				+ ", tem_Wo_Num=" + tem_Wo_Num + ", tem_Wo_Pos=" + tem_Wo_Pos
				+ ", tem_Valid_Date=" + tem_Valid_Date + ", tem_Range="
				+ tem_Range + ", tem_Acc=" + tem_Acc + ", tem_Appe=" + tem_Appe
				+ ", valve_De_Num=" + valve_De_Num + ", valve_De_Mod="
				+ valve_De_Mod + ", valve_De_Pre=" + valve_De_Pre
				+ ", valve_De_Dia=" + valve_De_Dia + ", valve_Num=" + valve_Num
				+ ", valve_Mod=" + valve_Mod + ", valve_Pre=" + valve_Pre
				+ ", valve_Dia=" + valve_Dia + ", valve_Start_Pre="
				+ valve_Start_Pre + ", valve_Wo_Tem=" + valve_Wo_Tem
				+ ", valve_Wo_Med=" + valve_Wo_Med + ", valve_Appe="
				+ valve_Appe + ", valve_Valid_Date=" + valve_Valid_Date
				+ ", valve_Seal=" + valve_Seal + ", valve_Wo_Pos="
				+ valve_Wo_Pos + ", valve_Man_ID=" + valve_Man_ID
				+ ", valve_Cer_ID=" + valve_Cer_ID + ", rup_De_Num="
				+ rup_De_Num + ", rup_De_Mod=" + rup_De_Mod + ", rup_De_Norm="
				+ rup_De_Norm + ", rup_De_Stress=" + rup_De_Stress
				+ ", rup_De_Dia=" + rup_De_Dia + ", rup_De_Ma=" + rup_De_Ma
				+ ", rup_Num=" + rup_Num + ", rup_Mod=" + rup_Mod
				+ ", rup_Dia=" + rup_Dia + ", rup_Norm=" + rup_Norm
				+ ", rup_Appe=" + rup_Appe + ", rup_Valid_Date="
				+ rup_Valid_Date + ", rup_Wo_Pos=" + rup_Wo_Pos
				+ ", rup_Cer_ID=" + rup_Cer_ID + ", rup_Man_ID=" + rup_Man_ID
				+ ", ecof_Man_Com=" + ecof_Man_Com + ", ecof_Man_ID="
				+ ecof_Man_ID + ", ecof_Cer_ID=" + ecof_Cer_ID + ", ecof_Norm="
				+ ecof_Norm + ", ecof_Cut_Time=" + ecof_Cut_Time
				+ ", ecof_Valid_Date=" + ecof_Valid_Date + ", ecof_Pre_Test="
				+ ecof_Pre_Test + ", ecof_Seal_Pre=" + ecof_Seal_Pre
				+ ", ecof_Seal=" + ecof_Seal + ", ecof_Remark=" + ecof_Remark
				+ ", ecof_Date=" + ecof_Date + "]";
	}

	
	
}
