package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselThiCheck")
public class VesselThiCheck {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_ThiChe_Pos;//壁厚校核部位
	private String v_ThiChe_Stress;//允许/监控使用压力
	private String v_ThiChe_Dia;//实测内径
	private String v_ThiChe_Min;//实测最小壁厚
	private String v_ThiChe_Ma_Stress;//材料许用应力
	private String v_ThiChe_Cor;//腐蚀裕量
	private String v_ThiChe_Wel_Coe;//焊接接头系数
	private String v_ThiChe_Seal_Coe;//封头形状系数
	private String v_ThiChe_Tem;//允许/监控使用温度
	private String v_ThiChe_Cri;//校核选用标准
	private String v_ThiChe_Coe;//校核参数取值说明
	private String v_ThiChe_Cal;//壁厚校核计算
	private String v_ThiChe_Result;//校核结果
	private String v_ThiChe_Test_Date;//检验
	private String v_ThiChe_Proo_Date;//校对
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
	@OneToOne(mappedBy="vesselThiCheck")
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
	 * @return the v_ThiChe_Pos
	 */
	public String getV_ThiChe_Pos() {
		return v_ThiChe_Pos;
	}
	/**
	 * @param v_ThiChe_Pos the v_ThiChe_Pos to set
	 */
	public void setV_ThiChe_Pos(String v_ThiChe_Pos) {
		this.v_ThiChe_Pos = v_ThiChe_Pos;
	}
	/**
	 * @return the v_ThiChe_Stress
	 */
	public String getV_ThiChe_Stress() {
		return v_ThiChe_Stress;
	}
	/**
	 * @param v_ThiChe_Stress the v_ThiChe_Stress to set
	 */
	public void setV_ThiChe_Stress(String v_ThiChe_Stress) {
		this.v_ThiChe_Stress = v_ThiChe_Stress;
	}
	/**
	 * @return the v_ThiChe_Dia
	 */
	public String getV_ThiChe_Dia() {
		return v_ThiChe_Dia;
	}
	/**
	 * @param v_ThiChe_Dia the v_ThiChe_Dia to set
	 */
	public void setV_ThiChe_Dia(String v_ThiChe_Dia) {
		this.v_ThiChe_Dia = v_ThiChe_Dia;
	}
	/**
	 * @return the v_ThiChe_Min
	 */
	public String getV_ThiChe_Min() {
		return v_ThiChe_Min;
	}
	/**
	 * @param v_ThiChe_Min the v_ThiChe_Min to set
	 */
	public void setV_ThiChe_Min(String v_ThiChe_Min) {
		this.v_ThiChe_Min = v_ThiChe_Min;
	}
	/**
	 * @return the v_ThiChe_Ma_Stress
	 */
	public String getV_ThiChe_Ma_Stress() {
		return v_ThiChe_Ma_Stress;
	}
	/**
	 * @param v_ThiChe_Ma_Stress the v_ThiChe_Ma_Stress to set
	 */
	public void setV_ThiChe_Ma_Stress(String v_ThiChe_Ma_Stress) {
		this.v_ThiChe_Ma_Stress = v_ThiChe_Ma_Stress;
	}
	/**
	 * @return the v_ThiChe_Cor
	 */
	public String getV_ThiChe_Cor() {
		return v_ThiChe_Cor;
	}
	/**
	 * @param v_ThiChe_Cor the v_ThiChe_Cor to set
	 */
	public void setV_ThiChe_Cor(String v_ThiChe_Cor) {
		this.v_ThiChe_Cor = v_ThiChe_Cor;
	}
	/**
	 * @return the v_ThiChe_Wel_Coe
	 */
	public String getV_ThiChe_Wel_Coe() {
		return v_ThiChe_Wel_Coe;
	}
	/**
	 * @param v_ThiChe_Wel_Coe the v_ThiChe_Wel_Coe to set
	 */
	public void setV_ThiChe_Wel_Coe(String v_ThiChe_Wel_Coe) {
		this.v_ThiChe_Wel_Coe = v_ThiChe_Wel_Coe;
	}
	/**
	 * @return the v_ThiChe_Seal_Coe
	 */
	public String getV_ThiChe_Seal_Coe() {
		return v_ThiChe_Seal_Coe;
	}
	/**
	 * @param v_ThiChe_Seal_Coe the v_ThiChe_Seal_Coe to set
	 */
	public void setV_ThiChe_Seal_Coe(String v_ThiChe_Seal_Coe) {
		this.v_ThiChe_Seal_Coe = v_ThiChe_Seal_Coe;
	}
	/**
	 * @return the v_ThiChe_Tem
	 */
	public String getV_ThiChe_Tem() {
		return v_ThiChe_Tem;
	}
	/**
	 * @param v_ThiChe_Tem the v_ThiChe_Tem to set
	 */
	public void setV_ThiChe_Tem(String v_ThiChe_Tem) {
		this.v_ThiChe_Tem = v_ThiChe_Tem;
	}
	/**
	 * @return the v_ThiChe_Cri
	 */
	public String getV_ThiChe_Cri() {
		return v_ThiChe_Cri;
	}
	/**
	 * @param v_ThiChe_Cri the v_ThiChe_Cri to set
	 */
	public void setV_ThiChe_Cri(String v_ThiChe_Cri) {
		this.v_ThiChe_Cri = v_ThiChe_Cri;
	}
	/**
	 * @return the v_ThiChe_Coe
	 */
	public String getV_ThiChe_Coe() {
		return v_ThiChe_Coe;
	}
	/**
	 * @param v_ThiChe_Coe the v_ThiChe_Coe to set
	 */
	public void setV_ThiChe_Coe(String v_ThiChe_Coe) {
		this.v_ThiChe_Coe = v_ThiChe_Coe;
	}
	/**
	 * @return the v_ThiChe_Cal
	 */
	public String getV_ThiChe_Cal() {
		return v_ThiChe_Cal;
	}
	/**
	 * @param v_ThiChe_Cal the v_ThiChe_Cal to set
	 */
	public void setV_ThiChe_Cal(String v_ThiChe_Cal) {
		this.v_ThiChe_Cal = v_ThiChe_Cal;
	}
	/**
	 * @return the v_ThiChe_Result
	 */
	public String getV_ThiChe_Result() {
		return v_ThiChe_Result;
	}
	/**
	 * @param v_ThiChe_Result the v_ThiChe_Result to set
	 */
	public void setV_ThiChe_Result(String v_ThiChe_Result) {
		this.v_ThiChe_Result = v_ThiChe_Result;
	}
	/**
	 * @return the v_ThiChe_Test_Date
	 */
	public String getV_ThiChe_Test_Date() {
		return v_ThiChe_Test_Date;
	}
	/**
	 * @param v_ThiChe_Test_Date the v_ThiChe_Test_Date to set
	 */
	public void setV_ThiChe_Test_Date(String v_ThiChe_Test_Date) {
		this.v_ThiChe_Test_Date = v_ThiChe_Test_Date;
	}
	/**
	 * @return the v_ThiChe_Proo_Date
	 */
	public String getV_ThiChe_Proo_Date() {
		return v_ThiChe_Proo_Date;
	}
	/**
	 * @param v_ThiChe_Proo_Date the v_ThiChe_Proo_Date to set
	 */
	public void setV_ThiChe_Proo_Date(String v_ThiChe_Proo_Date) {
		this.v_ThiChe_Proo_Date = v_ThiChe_Proo_Date;
	}
	
	
	
}
