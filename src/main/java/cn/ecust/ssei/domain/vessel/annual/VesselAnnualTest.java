package cn.ecust.ssei.domain.vessel.annual;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselAnnualTest")
public class VesselAnnualTest {

	private long id;
	private VesselAnnualMaintain vesselAnnualMaintain;
	private String v_Ann_1;//安全管理制度、安全操作规程
	private String v_Ann_2;//设计、制造、安装、改造、维修等资料
	private String v_Ann_3;//《使用登记表》、《使用登记证》
	private String v_Ann_4;//作业人员持证情况
	private String v_Ann_5;//日常维护保养、运行、定期安全检查记录
	private String v_Ann_6;//年度检查、定期检验报告及问题处理情况
	private String v_Ann_7;//安全附件校验、修理和更换记录
	private String v_Ann_8;//移动式压力容器装卸记录
	private String v_Ann_9;//应急预案和演练记录
	private String v_Ann_10;//压力容器事故、故障情况记录
	private String v_Ann_11;//铭牌、漆色、标志和使用登记证的标注
	private String v_Ann_12;//本体、接口（阀门、管路）部位、焊接接头缺陷情况检查
	private String v_Ann_13;//外表面腐蚀、结霜、结露情况检查
	private String v_Ann_14;//隔热层检查
	private String v_Ann_15;//检漏孔、信号孔检查
	private String v_Ann_16;//压力容器与相邻管道或者构件异常振动、响声或者相互摩擦情况检查
	private String v_Ann_17;//支承或者支座、基础、紧固螺栓检查
	private String v_Ann_18;//排放（疏水、排污）装置检查
	private String v_Ann_19;//运行期间超压、超温、超量等情况检查
	private String v_Ann_20;//接地装置检查
	private String v_Ann_21;//监控措施是否有效实施情况检查
	private String v_Ann_22;//快开门式压力容器安全联锁功能检查
	private String v_Ann_23;//压力表
	private String v_Ann_24;//液位计
	private String v_Ann_25;//测温仪表
	private String v_Ann_26;//爆破片装置
	private String v_Ann_27;//安全阀
	private String v_Ann_28;//易熔塞
	private String v_Ann_29;//导静电装置
	private String v_Ann_30;//紧急切断装置	
	private String v_Ann_31;//专项要求1
	private String v_Ann_32;//专项要求2
	private String v_Ann_33;//专项要求3
	private String v_Ann_31_Content;//专项要求1内容
	private String v_Ann_32_Content;//专项要求2内容
	private String v_Ann_33_Content;//专项要求3内容
	private String v_Ann_1_Reamrk;//
	private String v_Ann_2_Reamrk;//
	private String v_Ann_3_Reamrk;//
	private String v_Ann_4_Reamrk;//
	private String v_Ann_5_Reamrk;//
	private String v_Ann_6_Reamrk;//
	private String v_Ann_7_Reamrk;//
	private String v_Ann_8_Reamrk;//
	private String v_Ann_9_Reamrk;//
	private String v_Ann_10_Reamrk;//
	private String v_Ann_11_Reamrk;//
	private String v_Ann_12_Reamrk;//
	private String v_Ann_13_Reamrk;//
	private String v_Ann_14_Reamrk;//
	private String v_Ann_15_Reamrk;//
	private String v_Ann_16_Reamrk;//
	private String v_Ann_17_Reamrk;//
	private String v_Ann_18_Reamrk;//
	private String v_Ann_19_Reamrk;//
	private String v_Ann_20_Reamrk;//
	private String v_Ann_21_Reamrk;//
	private String v_Ann_22_Reamrk;//
	private String v_Ann_23_Reamrk;//
	private String v_Ann_24_Reamrk;//
	private String v_Ann_25_Reamrk;//
	private String v_Ann_26_Reamrk;//
	private String v_Ann_27_Reamrk;//
	private String v_Ann_28_Reamrk;//
	private String v_Ann_29_Reamrk;//
	private String v_Ann_30_Reamrk;//
	private String v_Ann_31_Reamrk;//
	private String v_Ann_32_Reamrk;//
	private String v_Ann_33_Reamrk;//
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
	 * @return the vesselAnnualMaintain
	 */
	@OneToOne(mappedBy="vesselAnnualTest")
	public VesselAnnualMaintain getVesselAnnualMaintain() {
		return vesselAnnualMaintain;
	}
	/**
	 * @param vesselAnnualMaintain the vesselAnnualMaintain to set
	 */
	public void setVesselAnnualMaintain(VesselAnnualMaintain vesselAnnualMaintain) {
		this.vesselAnnualMaintain = vesselAnnualMaintain;
	}
	/**
	 * @return the v_Ann_1
	 */
	public String getV_Ann_1() {
		return v_Ann_1;
	}
	/**
	 * @param v_Ann_1 the v_Ann_1 to set
	 */
	public void setV_Ann_1(String v_Ann_1) {
		this.v_Ann_1 = v_Ann_1;
	}
	/**
	 * @return the v_Ann_2
	 */
	public String getV_Ann_2() {
		return v_Ann_2;
	}
	/**
	 * @param v_Ann_2 the v_Ann_2 to set
	 */
	public void setV_Ann_2(String v_Ann_2) {
		this.v_Ann_2 = v_Ann_2;
	}
	/**
	 * @return the v_Ann_3
	 */
	public String getV_Ann_3() {
		return v_Ann_3;
	}
	/**
	 * @param v_Ann_3 the v_Ann_3 to set
	 */
	public void setV_Ann_3(String v_Ann_3) {
		this.v_Ann_3 = v_Ann_3;
	}
	/**
	 * @return the v_Ann_4
	 */
	public String getV_Ann_4() {
		return v_Ann_4;
	}
	/**
	 * @param v_Ann_4 the v_Ann_4 to set
	 */
	public void setV_Ann_4(String v_Ann_4) {
		this.v_Ann_4 = v_Ann_4;
	}
	/**
	 * @return the v_Ann_5
	 */
	public String getV_Ann_5() {
		return v_Ann_5;
	}
	/**
	 * @param v_Ann_5 the v_Ann_5 to set
	 */
	public void setV_Ann_5(String v_Ann_5) {
		this.v_Ann_5 = v_Ann_5;
	}
	/**
	 * @return the v_Ann_6
	 */
	public String getV_Ann_6() {
		return v_Ann_6;
	}
	/**
	 * @param v_Ann_6 the v_Ann_6 to set
	 */
	public void setV_Ann_6(String v_Ann_6) {
		this.v_Ann_6 = v_Ann_6;
	}
	/**
	 * @return the v_Ann_7
	 */
	public String getV_Ann_7() {
		return v_Ann_7;
	}
	/**
	 * @param v_Ann_7 the v_Ann_7 to set
	 */
	public void setV_Ann_7(String v_Ann_7) {
		this.v_Ann_7 = v_Ann_7;
	}
	/**
	 * @return the v_Ann_8
	 */
	public String getV_Ann_8() {
		return v_Ann_8;
	}
	/**
	 * @param v_Ann_8 the v_Ann_8 to set
	 */
	public void setV_Ann_8(String v_Ann_8) {
		this.v_Ann_8 = v_Ann_8;
	}
	/**
	 * @return the v_Ann_9
	 */
	public String getV_Ann_9() {
		return v_Ann_9;
	}
	/**
	 * @param v_Ann_9 the v_Ann_9 to set
	 */
	public void setV_Ann_9(String v_Ann_9) {
		this.v_Ann_9 = v_Ann_9;
	}
	/**
	 * @return the v_Ann_10
	 */
	public String getV_Ann_10() {
		return v_Ann_10;
	}
	/**
	 * @param v_Ann_10 the v_Ann_10 to set
	 */
	public void setV_Ann_10(String v_Ann_10) {
		this.v_Ann_10 = v_Ann_10;
	}
	/**
	 * @return the v_Ann_11
	 */
	public String getV_Ann_11() {
		return v_Ann_11;
	}
	/**
	 * @param v_Ann_11 the v_Ann_11 to set
	 */
	public void setV_Ann_11(String v_Ann_11) {
		this.v_Ann_11 = v_Ann_11;
	}
	/**
	 * @return the v_Ann_12
	 */
	public String getV_Ann_12() {
		return v_Ann_12;
	}
	/**
	 * @param v_Ann_12 the v_Ann_12 to set
	 */
	public void setV_Ann_12(String v_Ann_12) {
		this.v_Ann_12 = v_Ann_12;
	}
	/**
	 * @return the v_Ann_13
	 */
	public String getV_Ann_13() {
		return v_Ann_13;
	}
	/**
	 * @param v_Ann_13 the v_Ann_13 to set
	 */
	public void setV_Ann_13(String v_Ann_13) {
		this.v_Ann_13 = v_Ann_13;
	}
	/**
	 * @return the v_Ann_14
	 */
	public String getV_Ann_14() {
		return v_Ann_14;
	}
	/**
	 * @param v_Ann_14 the v_Ann_14 to set
	 */
	public void setV_Ann_14(String v_Ann_14) {
		this.v_Ann_14 = v_Ann_14;
	}
	/**
	 * @return the v_Ann_15
	 */
	public String getV_Ann_15() {
		return v_Ann_15;
	}
	/**
	 * @param v_Ann_15 the v_Ann_15 to set
	 */
	public void setV_Ann_15(String v_Ann_15) {
		this.v_Ann_15 = v_Ann_15;
	}
	/**
	 * @return the v_Ann_16
	 */
	public String getV_Ann_16() {
		return v_Ann_16;
	}
	/**
	 * @param v_Ann_16 the v_Ann_16 to set
	 */
	public void setV_Ann_16(String v_Ann_16) {
		this.v_Ann_16 = v_Ann_16;
	}
	/**
	 * @return the v_Ann_17
	 */
	public String getV_Ann_17() {
		return v_Ann_17;
	}
	/**
	 * @param v_Ann_17 the v_Ann_17 to set
	 */
	public void setV_Ann_17(String v_Ann_17) {
		this.v_Ann_17 = v_Ann_17;
	}
	/**
	 * @return the v_Ann_18
	 */
	public String getV_Ann_18() {
		return v_Ann_18;
	}
	/**
	 * @param v_Ann_18 the v_Ann_18 to set
	 */
	public void setV_Ann_18(String v_Ann_18) {
		this.v_Ann_18 = v_Ann_18;
	}
	/**
	 * @return the v_Ann_19
	 */
	public String getV_Ann_19() {
		return v_Ann_19;
	}
	/**
	 * @param v_Ann_19 the v_Ann_19 to set
	 */
	public void setV_Ann_19(String v_Ann_19) {
		this.v_Ann_19 = v_Ann_19;
	}
	/**
	 * @return the v_Ann_20
	 */
	public String getV_Ann_20() {
		return v_Ann_20;
	}
	/**
	 * @param v_Ann_20 the v_Ann_20 to set
	 */
	public void setV_Ann_20(String v_Ann_20) {
		this.v_Ann_20 = v_Ann_20;
	}
	/**
	 * @return the v_Ann_21
	 */
	public String getV_Ann_21() {
		return v_Ann_21;
	}
	/**
	 * @param v_Ann_21 the v_Ann_21 to set
	 */
	public void setV_Ann_21(String v_Ann_21) {
		this.v_Ann_21 = v_Ann_21;
	}
	/**
	 * @return the v_Ann_22
	 */
	public String getV_Ann_22() {
		return v_Ann_22;
	}
	/**
	 * @param v_Ann_22 the v_Ann_22 to set
	 */
	public void setV_Ann_22(String v_Ann_22) {
		this.v_Ann_22 = v_Ann_22;
	}
	/**
	 * @return the v_Ann_23
	 */
	public String getV_Ann_23() {
		return v_Ann_23;
	}
	/**
	 * @param v_Ann_23 the v_Ann_23 to set
	 */
	public void setV_Ann_23(String v_Ann_23) {
		this.v_Ann_23 = v_Ann_23;
	}
	/**
	 * @return the v_Ann_24
	 */
	public String getV_Ann_24() {
		return v_Ann_24;
	}
	/**
	 * @param v_Ann_24 the v_Ann_24 to set
	 */
	public void setV_Ann_24(String v_Ann_24) {
		this.v_Ann_24 = v_Ann_24;
	}
	/**
	 * @return the v_Ann_25
	 */
	public String getV_Ann_25() {
		return v_Ann_25;
	}
	/**
	 * @param v_Ann_25 the v_Ann_25 to set
	 */
	public void setV_Ann_25(String v_Ann_25) {
		this.v_Ann_25 = v_Ann_25;
	}
	/**
	 * @return the v_Ann_26
	 */
	public String getV_Ann_26() {
		return v_Ann_26;
	}
	/**
	 * @param v_Ann_26 the v_Ann_26 to set
	 */
	public void setV_Ann_26(String v_Ann_26) {
		this.v_Ann_26 = v_Ann_26;
	}
	/**
	 * @return the v_Ann_27
	 */
	public String getV_Ann_27() {
		return v_Ann_27;
	}
	/**
	 * @param v_Ann_27 the v_Ann_27 to set
	 */
	public void setV_Ann_27(String v_Ann_27) {
		this.v_Ann_27 = v_Ann_27;
	}
	/**
	 * @return the v_Ann_28
	 */
	public String getV_Ann_28() {
		return v_Ann_28;
	}
	/**
	 * @param v_Ann_28 the v_Ann_28 to set
	 */
	public void setV_Ann_28(String v_Ann_28) {
		this.v_Ann_28 = v_Ann_28;
	}
	/**
	 * @return the v_Ann_29
	 */
	public String getV_Ann_29() {
		return v_Ann_29;
	}
	/**
	 * @param v_Ann_29 the v_Ann_29 to set
	 */
	public void setV_Ann_29(String v_Ann_29) {
		this.v_Ann_29 = v_Ann_29;
	}
	/**
	 * @return the v_Ann_30
	 */
	public String getV_Ann_30() {
		return v_Ann_30;
	}
	/**
	 * @param v_Ann_30 the v_Ann_30 to set
	 */
	public void setV_Ann_30(String v_Ann_30) {
		this.v_Ann_30 = v_Ann_30;
	}
	/**
	 * @return the v_Ann_31
	 */
	public String getV_Ann_31() {
		return v_Ann_31;
	}
	/**
	 * @param v_Ann_31 the v_Ann_31 to set
	 */
	public void setV_Ann_31(String v_Ann_31) {
		this.v_Ann_31 = v_Ann_31;
	}
	/**
	 * @return the v_Ann_32
	 */
	public String getV_Ann_32() {
		return v_Ann_32;
	}
	/**
	 * @param v_Ann_32 the v_Ann_32 to set
	 */
	public void setV_Ann_32(String v_Ann_32) {
		this.v_Ann_32 = v_Ann_32;
	}
	/**
	 * @return the v_Ann_33
	 */
	public String getV_Ann_33() {
		return v_Ann_33;
	}
	/**
	 * @param v_Ann_33 the v_Ann_33 to set
	 */
	public void setV_Ann_33(String v_Ann_33) {
		this.v_Ann_33 = v_Ann_33;
	}
	/**
	 * @return the v_Ann_31_Content
	 */
	public String getV_Ann_31_Content() {
		return v_Ann_31_Content;
	}
	/**
	 * @param v_Ann_31_Content the v_Ann_31_Content to set
	 */
	public void setV_Ann_31_Content(String v_Ann_31_Content) {
		this.v_Ann_31_Content = v_Ann_31_Content;
	}
	/**
	 * @return the v_Ann_32_Content
	 */
	public String getV_Ann_32_Content() {
		return v_Ann_32_Content;
	}
	/**
	 * @param v_Ann_32_Content the v_Ann_32_Content to set
	 */
	public void setV_Ann_32_Content(String v_Ann_32_Content) {
		this.v_Ann_32_Content = v_Ann_32_Content;
	}
	/**
	 * @return the v_Ann_33_Content
	 */
	public String getV_Ann_33_Content() {
		return v_Ann_33_Content;
	}
	/**
	 * @param v_Ann_33_Content the v_Ann_33_Content to set
	 */
	public void setV_Ann_33_Content(String v_Ann_33_Content) {
		this.v_Ann_33_Content = v_Ann_33_Content;
	}
	/**
	 * @return the v_Ann_1_Reamrk
	 */
	public String getV_Ann_1_Reamrk() {
		return v_Ann_1_Reamrk;
	}
	/**
	 * @param v_Ann_1_Reamrk the v_Ann_1_Reamrk to set
	 */
	public void setV_Ann_1_Reamrk(String v_Ann_1_Reamrk) {
		this.v_Ann_1_Reamrk = v_Ann_1_Reamrk;
	}
	/**
	 * @return the v_Ann_2_Reamrk
	 */
	public String getV_Ann_2_Reamrk() {
		return v_Ann_2_Reamrk;
	}
	/**
	 * @param v_Ann_2_Reamrk the v_Ann_2_Reamrk to set
	 */
	public void setV_Ann_2_Reamrk(String v_Ann_2_Reamrk) {
		this.v_Ann_2_Reamrk = v_Ann_2_Reamrk;
	}
	/**
	 * @return the v_Ann_3_Reamrk
	 */
	public String getV_Ann_3_Reamrk() {
		return v_Ann_3_Reamrk;
	}
	/**
	 * @param v_Ann_3_Reamrk the v_Ann_3_Reamrk to set
	 */
	public void setV_Ann_3_Reamrk(String v_Ann_3_Reamrk) {
		this.v_Ann_3_Reamrk = v_Ann_3_Reamrk;
	}
	/**
	 * @return the v_Ann_4_Reamrk
	 */
	public String getV_Ann_4_Reamrk() {
		return v_Ann_4_Reamrk;
	}
	/**
	 * @param v_Ann_4_Reamrk the v_Ann_4_Reamrk to set
	 */
	public void setV_Ann_4_Reamrk(String v_Ann_4_Reamrk) {
		this.v_Ann_4_Reamrk = v_Ann_4_Reamrk;
	}
	/**
	 * @return the v_Ann_5_Reamrk
	 */
	public String getV_Ann_5_Reamrk() {
		return v_Ann_5_Reamrk;
	}
	/**
	 * @param v_Ann_5_Reamrk the v_Ann_5_Reamrk to set
	 */
	public void setV_Ann_5_Reamrk(String v_Ann_5_Reamrk) {
		this.v_Ann_5_Reamrk = v_Ann_5_Reamrk;
	}
	/**
	 * @return the v_Ann_6_Reamrk
	 */
	public String getV_Ann_6_Reamrk() {
		return v_Ann_6_Reamrk;
	}
	/**
	 * @param v_Ann_6_Reamrk the v_Ann_6_Reamrk to set
	 */
	public void setV_Ann_6_Reamrk(String v_Ann_6_Reamrk) {
		this.v_Ann_6_Reamrk = v_Ann_6_Reamrk;
	}
	/**
	 * @return the v_Ann_7_Reamrk
	 */
	public String getV_Ann_7_Reamrk() {
		return v_Ann_7_Reamrk;
	}
	/**
	 * @param v_Ann_7_Reamrk the v_Ann_7_Reamrk to set
	 */
	public void setV_Ann_7_Reamrk(String v_Ann_7_Reamrk) {
		this.v_Ann_7_Reamrk = v_Ann_7_Reamrk;
	}
	/**
	 * @return the v_Ann_8_Reamrk
	 */
	public String getV_Ann_8_Reamrk() {
		return v_Ann_8_Reamrk;
	}
	/**
	 * @param v_Ann_8_Reamrk the v_Ann_8_Reamrk to set
	 */
	public void setV_Ann_8_Reamrk(String v_Ann_8_Reamrk) {
		this.v_Ann_8_Reamrk = v_Ann_8_Reamrk;
	}
	/**
	 * @return the v_Ann_9_Reamrk
	 */
	public String getV_Ann_9_Reamrk() {
		return v_Ann_9_Reamrk;
	}
	/**
	 * @param v_Ann_9_Reamrk the v_Ann_9_Reamrk to set
	 */
	public void setV_Ann_9_Reamrk(String v_Ann_9_Reamrk) {
		this.v_Ann_9_Reamrk = v_Ann_9_Reamrk;
	}
	/**
	 * @return the v_Ann_10_Reamrk
	 */
	public String getV_Ann_10_Reamrk() {
		return v_Ann_10_Reamrk;
	}
	/**
	 * @param v_Ann_10_Reamrk the v_Ann_10_Reamrk to set
	 */
	public void setV_Ann_10_Reamrk(String v_Ann_10_Reamrk) {
		this.v_Ann_10_Reamrk = v_Ann_10_Reamrk;
	}
	/**
	 * @return the v_Ann_11_Reamrk
	 */
	public String getV_Ann_11_Reamrk() {
		return v_Ann_11_Reamrk;
	}
	/**
	 * @param v_Ann_11_Reamrk the v_Ann_11_Reamrk to set
	 */
	public void setV_Ann_11_Reamrk(String v_Ann_11_Reamrk) {
		this.v_Ann_11_Reamrk = v_Ann_11_Reamrk;
	}
	/**
	 * @return the v_Ann_12_Reamrk
	 */
	public String getV_Ann_12_Reamrk() {
		return v_Ann_12_Reamrk;
	}
	/**
	 * @param v_Ann_12_Reamrk the v_Ann_12_Reamrk to set
	 */
	public void setV_Ann_12_Reamrk(String v_Ann_12_Reamrk) {
		this.v_Ann_12_Reamrk = v_Ann_12_Reamrk;
	}
	/**
	 * @return the v_Ann_13_Reamrk
	 */
	public String getV_Ann_13_Reamrk() {
		return v_Ann_13_Reamrk;
	}
	/**
	 * @param v_Ann_13_Reamrk the v_Ann_13_Reamrk to set
	 */
	public void setV_Ann_13_Reamrk(String v_Ann_13_Reamrk) {
		this.v_Ann_13_Reamrk = v_Ann_13_Reamrk;
	}
	/**
	 * @return the v_Ann_14_Reamrk
	 */
	public String getV_Ann_14_Reamrk() {
		return v_Ann_14_Reamrk;
	}
	/**
	 * @param v_Ann_14_Reamrk the v_Ann_14_Reamrk to set
	 */
	public void setV_Ann_14_Reamrk(String v_Ann_14_Reamrk) {
		this.v_Ann_14_Reamrk = v_Ann_14_Reamrk;
	}
	/**
	 * @return the v_Ann_15_Reamrk
	 */
	public String getV_Ann_15_Reamrk() {
		return v_Ann_15_Reamrk;
	}
	/**
	 * @param v_Ann_15_Reamrk the v_Ann_15_Reamrk to set
	 */
	public void setV_Ann_15_Reamrk(String v_Ann_15_Reamrk) {
		this.v_Ann_15_Reamrk = v_Ann_15_Reamrk;
	}
	/**
	 * @return the v_Ann_16_Reamrk
	 */
	public String getV_Ann_16_Reamrk() {
		return v_Ann_16_Reamrk;
	}
	/**
	 * @param v_Ann_16_Reamrk the v_Ann_16_Reamrk to set
	 */
	public void setV_Ann_16_Reamrk(String v_Ann_16_Reamrk) {
		this.v_Ann_16_Reamrk = v_Ann_16_Reamrk;
	}
	/**
	 * @return the v_Ann_17_Reamrk
	 */
	public String getV_Ann_17_Reamrk() {
		return v_Ann_17_Reamrk;
	}
	/**
	 * @param v_Ann_17_Reamrk the v_Ann_17_Reamrk to set
	 */
	public void setV_Ann_17_Reamrk(String v_Ann_17_Reamrk) {
		this.v_Ann_17_Reamrk = v_Ann_17_Reamrk;
	}
	/**
	 * @return the v_Ann_18_Reamrk
	 */
	public String getV_Ann_18_Reamrk() {
		return v_Ann_18_Reamrk;
	}
	/**
	 * @param v_Ann_18_Reamrk the v_Ann_18_Reamrk to set
	 */
	public void setV_Ann_18_Reamrk(String v_Ann_18_Reamrk) {
		this.v_Ann_18_Reamrk = v_Ann_18_Reamrk;
	}
	/**
	 * @return the v_Ann_19_Reamrk
	 */
	public String getV_Ann_19_Reamrk() {
		return v_Ann_19_Reamrk;
	}
	/**
	 * @param v_Ann_19_Reamrk the v_Ann_19_Reamrk to set
	 */
	public void setV_Ann_19_Reamrk(String v_Ann_19_Reamrk) {
		this.v_Ann_19_Reamrk = v_Ann_19_Reamrk;
	}
	/**
	 * @return the v_Ann_20_Reamrk
	 */
	public String getV_Ann_20_Reamrk() {
		return v_Ann_20_Reamrk;
	}
	/**
	 * @param v_Ann_20_Reamrk the v_Ann_20_Reamrk to set
	 */
	public void setV_Ann_20_Reamrk(String v_Ann_20_Reamrk) {
		this.v_Ann_20_Reamrk = v_Ann_20_Reamrk;
	}
	/**
	 * @return the v_Ann_21_Reamrk
	 */
	public String getV_Ann_21_Reamrk() {
		return v_Ann_21_Reamrk;
	}
	/**
	 * @param v_Ann_21_Reamrk the v_Ann_21_Reamrk to set
	 */
	public void setV_Ann_21_Reamrk(String v_Ann_21_Reamrk) {
		this.v_Ann_21_Reamrk = v_Ann_21_Reamrk;
	}
	/**
	 * @return the v_Ann_22_Reamrk
	 */
	public String getV_Ann_22_Reamrk() {
		return v_Ann_22_Reamrk;
	}
	/**
	 * @param v_Ann_22_Reamrk the v_Ann_22_Reamrk to set
	 */
	public void setV_Ann_22_Reamrk(String v_Ann_22_Reamrk) {
		this.v_Ann_22_Reamrk = v_Ann_22_Reamrk;
	}
	/**
	 * @return the v_Ann_23_Reamrk
	 */
	public String getV_Ann_23_Reamrk() {
		return v_Ann_23_Reamrk;
	}
	/**
	 * @param v_Ann_23_Reamrk the v_Ann_23_Reamrk to set
	 */
	public void setV_Ann_23_Reamrk(String v_Ann_23_Reamrk) {
		this.v_Ann_23_Reamrk = v_Ann_23_Reamrk;
	}
	/**
	 * @return the v_Ann_24_Reamrk
	 */
	public String getV_Ann_24_Reamrk() {
		return v_Ann_24_Reamrk;
	}
	/**
	 * @param v_Ann_24_Reamrk the v_Ann_24_Reamrk to set
	 */
	public void setV_Ann_24_Reamrk(String v_Ann_24_Reamrk) {
		this.v_Ann_24_Reamrk = v_Ann_24_Reamrk;
	}
	/**
	 * @return the v_Ann_25_Reamrk
	 */
	public String getV_Ann_25_Reamrk() {
		return v_Ann_25_Reamrk;
	}
	/**
	 * @param v_Ann_25_Reamrk the v_Ann_25_Reamrk to set
	 */
	public void setV_Ann_25_Reamrk(String v_Ann_25_Reamrk) {
		this.v_Ann_25_Reamrk = v_Ann_25_Reamrk;
	}
	/**
	 * @return the v_Ann_26_Reamrk
	 */
	public String getV_Ann_26_Reamrk() {
		return v_Ann_26_Reamrk;
	}
	/**
	 * @param v_Ann_26_Reamrk the v_Ann_26_Reamrk to set
	 */
	public void setV_Ann_26_Reamrk(String v_Ann_26_Reamrk) {
		this.v_Ann_26_Reamrk = v_Ann_26_Reamrk;
	}
	/**
	 * @return the v_Ann_27_Reamrk
	 */
	public String getV_Ann_27_Reamrk() {
		return v_Ann_27_Reamrk;
	}
	/**
	 * @param v_Ann_27_Reamrk the v_Ann_27_Reamrk to set
	 */
	public void setV_Ann_27_Reamrk(String v_Ann_27_Reamrk) {
		this.v_Ann_27_Reamrk = v_Ann_27_Reamrk;
	}
	/**
	 * @return the v_Ann_28_Reamrk
	 */
	public String getV_Ann_28_Reamrk() {
		return v_Ann_28_Reamrk;
	}
	/**
	 * @param v_Ann_28_Reamrk the v_Ann_28_Reamrk to set
	 */
	public void setV_Ann_28_Reamrk(String v_Ann_28_Reamrk) {
		this.v_Ann_28_Reamrk = v_Ann_28_Reamrk;
	}
	/**
	 * @return the v_Ann_29_Reamrk
	 */
	public String getV_Ann_29_Reamrk() {
		return v_Ann_29_Reamrk;
	}
	/**
	 * @param v_Ann_29_Reamrk the v_Ann_29_Reamrk to set
	 */
	public void setV_Ann_29_Reamrk(String v_Ann_29_Reamrk) {
		this.v_Ann_29_Reamrk = v_Ann_29_Reamrk;
	}
	/**
	 * @return the v_Ann_30_Reamrk
	 */
	public String getV_Ann_30_Reamrk() {
		return v_Ann_30_Reamrk;
	}
	/**
	 * @param v_Ann_30_Reamrk the v_Ann_30_Reamrk to set
	 */
	public void setV_Ann_30_Reamrk(String v_Ann_30_Reamrk) {
		this.v_Ann_30_Reamrk = v_Ann_30_Reamrk;
	}
	/**
	 * @return the v_Ann_31_Reamrk
	 */
	public String getV_Ann_31_Reamrk() {
		return v_Ann_31_Reamrk;
	}
	/**
	 * @param v_Ann_31_Reamrk the v_Ann_31_Reamrk to set
	 */
	public void setV_Ann_31_Reamrk(String v_Ann_31_Reamrk) {
		this.v_Ann_31_Reamrk = v_Ann_31_Reamrk;
	}
	/**
	 * @return the v_Ann_32_Reamrk
	 */
	public String getV_Ann_32_Reamrk() {
		return v_Ann_32_Reamrk;
	}
	/**
	 * @param v_Ann_32_Reamrk the v_Ann_32_Reamrk to set
	 */
	public void setV_Ann_32_Reamrk(String v_Ann_32_Reamrk) {
		this.v_Ann_32_Reamrk = v_Ann_32_Reamrk;
	}
	/**
	 * @return the v_Ann_33_Reamrk
	 */
	public String getV_Ann_33_Reamrk() {
		return v_Ann_33_Reamrk;
	}
	/**
	 * @param v_Ann_33_Reamrk the v_Ann_33_Reamrk to set
	 */
	public void setV_Ann_33_Reamrk(String v_Ann_33_Reamrk) {
		this.v_Ann_33_Reamrk = v_Ann_33_Reamrk;
	}
	
	
	
}
