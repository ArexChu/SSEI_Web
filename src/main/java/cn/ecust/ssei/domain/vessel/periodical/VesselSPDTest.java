package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselSPDTest")
public class VesselSPDTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Valve_Type;//安全阀型  号
	private String v_Valve_Num;//安全阀数  量
	private String v_Valve_Check_Date;//安全阀校验日期
	private String v_Valve_Seal_Pre;//安全阀密封压力
	private String v_Valve_Set_Pre;//安全阀整定压力
	private String v_Valve_Pos;//安全阀安装位置
	private String v_Rup_Type;//爆破片型  号
	private String v_Rup_Num;//爆破片数  量
	private String v_Rup_Spe;//爆破片规  格
	private String v_Rup_Replace_Fre;//爆破片更换周期要求
	private String v_Rup_Replace_Date;//爆破片更换日期
	private String v_Rup_Pos;//爆破片安装位置
	private String v_PreGage_Range;//压力表量程
	private String v_PreGage_Num;//压力表数量
	private String v_PreGage_Acc;//压力表精度
	private String v_PreGage_Date;//压力表检定日期
	private String v_PreGage_Rep_ID;//压力表检定报告编号
	private String v_PreGage_Pos;//压力表安装位置
	private String v_ECOF_Type;//紧急切断装置型式及规格
	private String v_ECOF_Num;//紧急切断装置数  量
	private String v_ECOF_Pre;//紧急切断装置耐压试验压力
	private String v_ECOF_Airt;//紧急切断装置密闭试验压力
	private String v_ECOF_Cut;//紧急切断装置切断时间
	private String v_ECOF_Man;//紧急切断装置检修记录
	private String v_ECOF_Pos;//紧急切断装置安装位置
	private String v_ECOF_Appe;//紧急切断装置外  观
	private String v_CG_Type;//液位计型  式
	private String v_CG_Num;//液位计数  量
	private String v_CG_Content;//液位计容器充装量
	private String v_CG_Pos;//液位计安装位置
	private String v_CG_Appe;//液位计外  观
	private String v_CG_Error;//液位计误  差
	private String v_Tem_Type;//测温仪表型号
	private String v_Tem_Valid_Date;//测温仪表有效期
	private String v_Tem_Appe;//测温仪表外观
	private String v_AH_Pre;//气象软管压力
	private String v_AH_Med;//气象软管介质
	private String v_AH_Time;//气象软管时间
	private String v_LPH_Pre;//液相软管压力
	private String v_LPH_Med;//液相软管介质
	private String v_LPH_Time;//液相软管时间
	private String v_SPD_Others;//其他阀门、附件检验
	private String v_SPD_Result;//
	private String v_SPD_Date;//检测
	private String v_SPD_Check_Date;//校对
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
	 * @return the vesselPeriodicalMaintain
	 */
	@OneToOne(mappedBy="vesselSPDTest")
	public VesselPeriodicalMaintain getVesselPeriodicalMaintain() {
		return vesselPeriodicalMaintain;
	}
	/**
	 * @param vesselPeriodicalMaintain the vesselPeriodicalMaintain to set
	 */
	public void setVesselPeriodicalMaintain(
			VesselPeriodicalMaintain vesselPeriodicalMaintain) {
		this.vesselPeriodicalMaintain = vesselPeriodicalMaintain;
	}
	/**
	 * @return the v_Valve_Type
	 */
	public String getV_Valve_Type() {
		return v_Valve_Type;
	}
	/**
	 * @param v_Valve_Type the v_Valve_Type to set
	 */
	public void setV_Valve_Type(String v_Valve_Type) {
		this.v_Valve_Type = v_Valve_Type;
	}
	/**
	 * @return the v_Valve_Num
	 */
	public String getV_Valve_Num() {
		return v_Valve_Num;
	}
	/**
	 * @param v_Valve_Num the v_Valve_Num to set
	 */
	public void setV_Valve_Num(String v_Valve_Num) {
		this.v_Valve_Num = v_Valve_Num;
	}
	/**
	 * @return the v_Valve_Check_Date
	 */
	public String getV_Valve_Check_Date() {
		return v_Valve_Check_Date;
	}
	/**
	 * @param v_Valve_Check_Date the v_Valve_Check_Date to set
	 */
	public void setV_Valve_Check_Date(String v_Valve_Check_Date) {
		this.v_Valve_Check_Date = v_Valve_Check_Date;
	}
	/**
	 * @return the v_Valve_Seal_Pre
	 */
	public String getV_Valve_Seal_Pre() {
		return v_Valve_Seal_Pre;
	}
	/**
	 * @param v_Valve_Seal_Pre the v_Valve_Seal_Pre to set
	 */
	public void setV_Valve_Seal_Pre(String v_Valve_Seal_Pre) {
		this.v_Valve_Seal_Pre = v_Valve_Seal_Pre;
	}
	/**
	 * @return the v_Valve_Set_Pre
	 */
	public String getV_Valve_Set_Pre() {
		return v_Valve_Set_Pre;
	}
	/**
	 * @param v_Valve_Set_Pre the v_Valve_Set_Pre to set
	 */
	public void setV_Valve_Set_Pre(String v_Valve_Set_Pre) {
		this.v_Valve_Set_Pre = v_Valve_Set_Pre;
	}
	/**
	 * @return the v_Valve_Pos
	 */
	public String getV_Valve_Pos() {
		return v_Valve_Pos;
	}
	/**
	 * @param v_Valve_Pos the v_Valve_Pos to set
	 */
	public void setV_Valve_Pos(String v_Valve_Pos) {
		this.v_Valve_Pos = v_Valve_Pos;
	}
	/**
	 * @return the v_Rup_Type
	 */
	public String getV_Rup_Type() {
		return v_Rup_Type;
	}
	/**
	 * @param v_Rup_Type the v_Rup_Type to set
	 */
	public void setV_Rup_Type(String v_Rup_Type) {
		this.v_Rup_Type = v_Rup_Type;
	}
	/**
	 * @return the v_Rup_Num
	 */
	public String getV_Rup_Num() {
		return v_Rup_Num;
	}
	/**
	 * @param v_Rup_Num the v_Rup_Num to set
	 */
	public void setV_Rup_Num(String v_Rup_Num) {
		this.v_Rup_Num = v_Rup_Num;
	}
	/**
	 * @return the v_Rup_Spe
	 */
	public String getV_Rup_Spe() {
		return v_Rup_Spe;
	}
	/**
	 * @param v_Rup_Spe the v_Rup_Spe to set
	 */
	public void setV_Rup_Spe(String v_Rup_Spe) {
		this.v_Rup_Spe = v_Rup_Spe;
	}
	/**
	 * @return the v_Rup_Replace_Fre
	 */
	public String getV_Rup_Replace_Fre() {
		return v_Rup_Replace_Fre;
	}
	/**
	 * @param v_Rup_Replace_Fre the v_Rup_Replace_Fre to set
	 */
	public void setV_Rup_Replace_Fre(String v_Rup_Replace_Fre) {
		this.v_Rup_Replace_Fre = v_Rup_Replace_Fre;
	}
	/**
	 * @return the v_Rup_Replace_Date
	 */
	public String getV_Rup_Replace_Date() {
		return v_Rup_Replace_Date;
	}
	/**
	 * @param v_Rup_Replace_Date the v_Rup_Replace_Date to set
	 */
	public void setV_Rup_Replace_Date(String v_Rup_Replace_Date) {
		this.v_Rup_Replace_Date = v_Rup_Replace_Date;
	}
	/**
	 * @return the v_Rup_Pos
	 */
	public String getV_Rup_Pos() {
		return v_Rup_Pos;
	}
	/**
	 * @param v_Rup_Pos the v_Rup_Pos to set
	 */
	public void setV_Rup_Pos(String v_Rup_Pos) {
		this.v_Rup_Pos = v_Rup_Pos;
	}
	/**
	 * @return the v_PreGage_Range
	 */
	public String getV_PreGage_Range() {
		return v_PreGage_Range;
	}
	/**
	 * @param v_PreGage_Range the v_PreGage_Range to set
	 */
	public void setV_PreGage_Range(String v_PreGage_Range) {
		this.v_PreGage_Range = v_PreGage_Range;
	}
	/**
	 * @return the v_PreGage_Num
	 */
	public String getV_PreGage_Num() {
		return v_PreGage_Num;
	}
	/**
	 * @param v_PreGage_Num the v_PreGage_Num to set
	 */
	public void setV_PreGage_Num(String v_PreGage_Num) {
		this.v_PreGage_Num = v_PreGage_Num;
	}
	/**
	 * @return the v_PreGage_Acc
	 */
	public String getV_PreGage_Acc() {
		return v_PreGage_Acc;
	}
	/**
	 * @param v_PreGage_Acc the v_PreGage_Acc to set
	 */
	public void setV_PreGage_Acc(String v_PreGage_Acc) {
		this.v_PreGage_Acc = v_PreGage_Acc;
	}
	/**
	 * @return the v_PreGage_Date
	 */
	public String getV_PreGage_Date() {
		return v_PreGage_Date;
	}
	/**
	 * @param v_PreGage_Date the v_PreGage_Date to set
	 */
	public void setV_PreGage_Date(String v_PreGage_Date) {
		this.v_PreGage_Date = v_PreGage_Date;
	}
	/**
	 * @return the v_PreGage_Rep_ID
	 */
	public String getV_PreGage_Rep_ID() {
		return v_PreGage_Rep_ID;
	}
	/**
	 * @param v_PreGage_Rep_ID the v_PreGage_Rep_ID to set
	 */
	public void setV_PreGage_Rep_ID(String v_PreGage_Rep_ID) {
		this.v_PreGage_Rep_ID = v_PreGage_Rep_ID;
	}
	/**
	 * @return the v_PreGage_Pos
	 */
	public String getV_PreGage_Pos() {
		return v_PreGage_Pos;
	}
	/**
	 * @param v_PreGage_Pos the v_PreGage_Pos to set
	 */
	public void setV_PreGage_Pos(String v_PreGage_Pos) {
		this.v_PreGage_Pos = v_PreGage_Pos;
	}
	/**
	 * @return the v_ECOF_Type
	 */
	public String getV_ECOF_Type() {
		return v_ECOF_Type;
	}
	/**
	 * @param v_ECOF_Type the v_ECOF_Type to set
	 */
	public void setV_ECOF_Type(String v_ECOF_Type) {
		this.v_ECOF_Type = v_ECOF_Type;
	}
	/**
	 * @return the v_ECOF_Num
	 */
	public String getV_ECOF_Num() {
		return v_ECOF_Num;
	}
	/**
	 * @param v_ECOF_Num the v_ECOF_Num to set
	 */
	public void setV_ECOF_Num(String v_ECOF_Num) {
		this.v_ECOF_Num = v_ECOF_Num;
	}
	/**
	 * @return the v_ECOF_Pre
	 */
	public String getV_ECOF_Pre() {
		return v_ECOF_Pre;
	}
	/**
	 * @param v_ECOF_Pre the v_ECOF_Pre to set
	 */
	public void setV_ECOF_Pre(String v_ECOF_Pre) {
		this.v_ECOF_Pre = v_ECOF_Pre;
	}
	/**
	 * @return the v_ECOF_Airt
	 */
	public String getV_ECOF_Airt() {
		return v_ECOF_Airt;
	}
	/**
	 * @param v_ECOF_Airt the v_ECOF_Airt to set
	 */
	public void setV_ECOF_Airt(String v_ECOF_Airt) {
		this.v_ECOF_Airt = v_ECOF_Airt;
	}
	/**
	 * @return the v_ECOF_Cut
	 */
	public String getV_ECOF_Cut() {
		return v_ECOF_Cut;
	}
	/**
	 * @param v_ECOF_Cut the v_ECOF_Cut to set
	 */
	public void setV_ECOF_Cut(String v_ECOF_Cut) {
		this.v_ECOF_Cut = v_ECOF_Cut;
	}
	/**
	 * @return the v_ECOF_Man
	 */
	public String getV_ECOF_Man() {
		return v_ECOF_Man;
	}
	/**
	 * @param v_ECOF_Man the v_ECOF_Man to set
	 */
	public void setV_ECOF_Man(String v_ECOF_Man) {
		this.v_ECOF_Man = v_ECOF_Man;
	}
	/**
	 * @return the v_ECOF_Pos
	 */
	public String getV_ECOF_Pos() {
		return v_ECOF_Pos;
	}
	/**
	 * @param v_ECOF_Pos the v_ECOF_Pos to set
	 */
	public void setV_ECOF_Pos(String v_ECOF_Pos) {
		this.v_ECOF_Pos = v_ECOF_Pos;
	}
	/**
	 * @return the v_ECOF_Appe
	 */
	public String getV_ECOF_Appe() {
		return v_ECOF_Appe;
	}
	/**
	 * @param v_ECOF_Appe the v_ECOF_Appe to set
	 */
	public void setV_ECOF_Appe(String v_ECOF_Appe) {
		this.v_ECOF_Appe = v_ECOF_Appe;
	}
	/**
	 * @return the v_CG_Type
	 */
	public String getV_CG_Type() {
		return v_CG_Type;
	}
	/**
	 * @param v_CG_Type the v_CG_Type to set
	 */
	public void setV_CG_Type(String v_CG_Type) {
		this.v_CG_Type = v_CG_Type;
	}
	/**
	 * @return the v_CG_Num
	 */
	public String getV_CG_Num() {
		return v_CG_Num;
	}
	/**
	 * @param v_CG_Num the v_CG_Num to set
	 */
	public void setV_CG_Num(String v_CG_Num) {
		this.v_CG_Num = v_CG_Num;
	}
	/**
	 * @return the v_CG_Content
	 */
	public String getV_CG_Content() {
		return v_CG_Content;
	}
	/**
	 * @param v_CG_Content the v_CG_Content to set
	 */
	public void setV_CG_Content(String v_CG_Content) {
		this.v_CG_Content = v_CG_Content;
	}
	/**
	 * @return the v_CG_Pos
	 */
	public String getV_CG_Pos() {
		return v_CG_Pos;
	}
	/**
	 * @param v_CG_Pos the v_CG_Pos to set
	 */
	public void setV_CG_Pos(String v_CG_Pos) {
		this.v_CG_Pos = v_CG_Pos;
	}
	/**
	 * @return the v_CG_Appe
	 */
	public String getV_CG_Appe() {
		return v_CG_Appe;
	}
	/**
	 * @param v_CG_Appe the v_CG_Appe to set
	 */
	public void setV_CG_Appe(String v_CG_Appe) {
		this.v_CG_Appe = v_CG_Appe;
	}
	/**
	 * @return the v_CG_Error
	 */
	public String getV_CG_Error() {
		return v_CG_Error;
	}
	/**
	 * @param v_CG_Error the v_CG_Error to set
	 */
	public void setV_CG_Error(String v_CG_Error) {
		this.v_CG_Error = v_CG_Error;
	}
	/**
	 * @return the v_Tem_Type
	 */
	public String getV_Tem_Type() {
		return v_Tem_Type;
	}
	/**
	 * @param v_Tem_Type the v_Tem_Type to set
	 */
	public void setV_Tem_Type(String v_Tem_Type) {
		this.v_Tem_Type = v_Tem_Type;
	}
	/**
	 * @return the v_Tem_Valid_Date
	 */
	public String getV_Tem_Valid_Date() {
		return v_Tem_Valid_Date;
	}
	/**
	 * @param v_Tem_Valid_Date the v_Tem_Valid_Date to set
	 */
	public void setV_Tem_Valid_Date(String v_Tem_Valid_Date) {
		this.v_Tem_Valid_Date = v_Tem_Valid_Date;
	}
	/**
	 * @return the v_Tem_Appe
	 */
	public String getV_Tem_Appe() {
		return v_Tem_Appe;
	}
	/**
	 * @param v_Tem_Appe the v_Tem_Appe to set
	 */
	public void setV_Tem_Appe(String v_Tem_Appe) {
		this.v_Tem_Appe = v_Tem_Appe;
	}
	/**
	 * @return the v_AH_Pre
	 */
	public String getV_AH_Pre() {
		return v_AH_Pre;
	}
	/**
	 * @param v_AH_Pre the v_AH_Pre to set
	 */
	public void setV_AH_Pre(String v_AH_Pre) {
		this.v_AH_Pre = v_AH_Pre;
	}
	/**
	 * @return the v_AH_Med
	 */
	public String getV_AH_Med() {
		return v_AH_Med;
	}
	/**
	 * @param v_AH_Med the v_AH_Med to set
	 */
	public void setV_AH_Med(String v_AH_Med) {
		this.v_AH_Med = v_AH_Med;
	}
	/**
	 * @return the v_AH_Time
	 */
	public String getV_AH_Time() {
		return v_AH_Time;
	}
	/**
	 * @param v_AH_Time the v_AH_Time to set
	 */
	public void setV_AH_Time(String v_AH_Time) {
		this.v_AH_Time = v_AH_Time;
	}
	/**
	 * @return the v_LPH_Pre
	 */
	public String getV_LPH_Pre() {
		return v_LPH_Pre;
	}
	/**
	 * @param v_LPH_Pre the v_LPH_Pre to set
	 */
	public void setV_LPH_Pre(String v_LPH_Pre) {
		this.v_LPH_Pre = v_LPH_Pre;
	}
	/**
	 * @return the v_LPH_Med
	 */
	public String getV_LPH_Med() {
		return v_LPH_Med;
	}
	/**
	 * @param v_LPH_Med the v_LPH_Med to set
	 */
	public void setV_LPH_Med(String v_LPH_Med) {
		this.v_LPH_Med = v_LPH_Med;
	}
	/**
	 * @return the v_LPH_Time
	 */
	public String getV_LPH_Time() {
		return v_LPH_Time;
	}
	/**
	 * @param v_LPH_Time the v_LPH_Time to set
	 */
	public void setV_LPH_Time(String v_LPH_Time) {
		this.v_LPH_Time = v_LPH_Time;
	}
	/**
	 * @return the v_SPD_Others
	 */
	public String getV_SPD_Others() {
		return v_SPD_Others;
	}
	/**
	 * @param v_SPD_Others the v_SPD_Others to set
	 */
	public void setV_SPD_Others(String v_SPD_Others) {
		this.v_SPD_Others = v_SPD_Others;
	}
	/**
	 * @return the v_SPD_Result
	 */
	public String getV_SPD_Result() {
		return v_SPD_Result;
	}
	/**
	 * @param v_SPD_Result the v_SPD_Result to set
	 */
	public void setV_SPD_Result(String v_SPD_Result) {
		this.v_SPD_Result = v_SPD_Result;
	}
	/**
	 * @return the v_SPD_Date
	 */
	public String getV_SPD_Date() {
		return v_SPD_Date;
	}
	/**
	 * @param v_SPD_Date the v_SPD_Date to set
	 */
	public void setV_SPD_Date(String v_SPD_Date) {
		this.v_SPD_Date = v_SPD_Date;
	}
	/**
	 * @return the v_SPD_Check_Date
	 */
	public String getV_SPD_Check_Date() {
		return v_SPD_Check_Date;
	}
	/**
	 * @param v_SPD_Check_Date the v_SPD_Check_Date to set
	 */
	public void setV_SPD_Check_Date(String v_SPD_Check_Date) {
		this.v_SPD_Check_Date = v_SPD_Check_Date;
	}
	
	
	

}
