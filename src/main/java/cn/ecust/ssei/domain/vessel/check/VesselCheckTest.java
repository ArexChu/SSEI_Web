package cn.ecust.ssei.domain.vessel.check;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselCheckTest")
public class VesselCheckTest {

	private long id;
	private VesselCheckMaintain vesselCheckMaintain;
	private String v_M_Entrust_Com;//委托单位
	private String v_M_Entrust_Com_Per;//委托单位联系人
	private String v_Che_1;//铭牌	
	private String v_Che_2;//堆焊层质量
	private String v_Che_3;//内表面质量
	private String v_Che_4;//支承的型式与布置
	private String v_Che_5;//外表面质量
	private String v_Che_6;//排放装置的设置
	private String v_Che_7;//焊缝余高
	private String v_Che_8;//基础开裂倾斜
	private String v_Che_9;//焊缝错边
	private String v_Che_10;//防腐质量
	private String v_Che_11;//焊缝咬边
	private String v_Che_12;//绝热质量
	private String v_Che_13;//焊缝棱角度
	private String v_Che_14;//衬里质量
	private String v_Che_15;//封头型式
	private String v_Che_16;//地脚螺栓
	private String v_Che_17;//封头与筒体的连接
	private String v_Che_18;//卧式容器的支座膨胀孔
	private String v_Che_19;//开孔位置及补强
	private String v_Che_20;//水平度或者铅垂度
	private String v_Che_21;//焊缝的布置及型式
	private String v_Che_22;//快开门安全联锁装置
	private String v_Che_23;//法兰、密封面及其紧固螺栓
	private String v_Che_24;//静电接地
	private String v_Che_1_Remark;//
	private String v_Che_2_Remark;//
	private String v_Che_3_Remark;//
	private String v_Che_4_Remark;//
	private String v_Che_5_Remark;//
	private String v_Che_6_Remark;//
	private String v_Che_7_Remark;//
	private String v_Che_8_Remark;//
	private String v_Che_9_Remark;//
	private String v_Che_10_Remark;//
	private String v_Che_11_Remark;//
	private String v_Che_12_Remark;//
	private String v_Che_13_Remark;//
	private String v_Che_14_Remark;//
	private String v_Che_15_Remark;//
	private String v_Che_16_Remark;//
	private String v_Che_17_Remark;//
	private String v_Che_18_Remark;//
	private String v_Che_19_Remark;//
	private String v_Che_20_Remark;//
	private String v_Che_21_Remark;//
	private String v_Che_22_Remark;//
	private String v_Che_23_Remark;//
	private String v_Che_24_Remark;//
	private String v_Che_Explan;
	private String v_Che_Result;
	private String v_Che_Date;
	private String v_Che_Che_Date;
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
	 * @return the vesselCheckMaintain
	 */
	@OneToOne(mappedBy="vesselCheckTest")
	public VesselCheckMaintain getVesselCheckMaintain() {
		return vesselCheckMaintain;
	}
	/**
	 * @param vesselCheckMaintain the vesselCheckMaintain to set
	 */
	public void setVesselCheckMaintain(VesselCheckMaintain vesselCheckMaintain) {
		this.vesselCheckMaintain = vesselCheckMaintain;
	}
	/**
	 * @return the v_M_Entrust_Com
	 */
	public String getV_M_Entrust_Com() {
		return v_M_Entrust_Com;
	}
	/**
	 * @param v_M_Entrust_Com the v_M_Entrust_Com to set
	 */
	public void setV_M_Entrust_Com(String v_M_Entrust_Com) {
		this.v_M_Entrust_Com = v_M_Entrust_Com;
	}
	/**
	 * @return the v_M_Entrust_Com_Per
	 */
	public String getV_M_Entrust_Com_Per() {
		return v_M_Entrust_Com_Per;
	}
	/**
	 * @param v_M_Entrust_Com_Per the v_M_Entrust_Com_Per to set
	 */
	public void setV_M_Entrust_Com_Per(String v_M_Entrust_Com_Per) {
		this.v_M_Entrust_Com_Per = v_M_Entrust_Com_Per;
	}
	/**
	 * @return the v_Che_1
	 */
	public String getV_Che_1() {
		return v_Che_1;
	}
	/**
	 * @param v_Che_1 the v_Che_1 to set
	 */
	public void setV_Che_1(String v_Che_1) {
		this.v_Che_1 = v_Che_1;
	}
	/**
	 * @return the v_Che_2
	 */
	public String getV_Che_2() {
		return v_Che_2;
	}
	/**
	 * @param v_Che_2 the v_Che_2 to set
	 */
	public void setV_Che_2(String v_Che_2) {
		this.v_Che_2 = v_Che_2;
	}
	/**
	 * @return the v_Che_3
	 */
	public String getV_Che_3() {
		return v_Che_3;
	}
	/**
	 * @param v_Che_3 the v_Che_3 to set
	 */
	public void setV_Che_3(String v_Che_3) {
		this.v_Che_3 = v_Che_3;
	}
	/**
	 * @return the v_Che_4
	 */
	public String getV_Che_4() {
		return v_Che_4;
	}
	/**
	 * @param v_Che_4 the v_Che_4 to set
	 */
	public void setV_Che_4(String v_Che_4) {
		this.v_Che_4 = v_Che_4;
	}
	/**
	 * @return the v_Che_5
	 */
	public String getV_Che_5() {
		return v_Che_5;
	}
	/**
	 * @param v_Che_5 the v_Che_5 to set
	 */
	public void setV_Che_5(String v_Che_5) {
		this.v_Che_5 = v_Che_5;
	}
	/**
	 * @return the v_Che_6
	 */
	public String getV_Che_6() {
		return v_Che_6;
	}
	/**
	 * @param v_Che_6 the v_Che_6 to set
	 */
	public void setV_Che_6(String v_Che_6) {
		this.v_Che_6 = v_Che_6;
	}
	/**
	 * @return the v_Che_7
	 */
	public String getV_Che_7() {
		return v_Che_7;
	}
	/**
	 * @param v_Che_7 the v_Che_7 to set
	 */
	public void setV_Che_7(String v_Che_7) {
		this.v_Che_7 = v_Che_7;
	}
	/**
	 * @return the v_Che_8
	 */
	public String getV_Che_8() {
		return v_Che_8;
	}
	/**
	 * @param v_Che_8 the v_Che_8 to set
	 */
	public void setV_Che_8(String v_Che_8) {
		this.v_Che_8 = v_Che_8;
	}
	/**
	 * @return the v_Che_9
	 */
	public String getV_Che_9() {
		return v_Che_9;
	}
	/**
	 * @param v_Che_9 the v_Che_9 to set
	 */
	public void setV_Che_9(String v_Che_9) {
		this.v_Che_9 = v_Che_9;
	}
	/**
	 * @return the v_Che_10
	 */
	public String getV_Che_10() {
		return v_Che_10;
	}
	/**
	 * @param v_Che_10 the v_Che_10 to set
	 */
	public void setV_Che_10(String v_Che_10) {
		this.v_Che_10 = v_Che_10;
	}
	/**
	 * @return the v_Che_11
	 */
	public String getV_Che_11() {
		return v_Che_11;
	}
	/**
	 * @param v_Che_11 the v_Che_11 to set
	 */
	public void setV_Che_11(String v_Che_11) {
		this.v_Che_11 = v_Che_11;
	}
	/**
	 * @return the v_Che_12
	 */
	public String getV_Che_12() {
		return v_Che_12;
	}
	/**
	 * @param v_Che_12 the v_Che_12 to set
	 */
	public void setV_Che_12(String v_Che_12) {
		this.v_Che_12 = v_Che_12;
	}
	/**
	 * @return the v_Che_13
	 */
	public String getV_Che_13() {
		return v_Che_13;
	}
	/**
	 * @param v_Che_13 the v_Che_13 to set
	 */
	public void setV_Che_13(String v_Che_13) {
		this.v_Che_13 = v_Che_13;
	}
	/**
	 * @return the v_Che_14
	 */
	public String getV_Che_14() {
		return v_Che_14;
	}
	/**
	 * @param v_Che_14 the v_Che_14 to set
	 */
	public void setV_Che_14(String v_Che_14) {
		this.v_Che_14 = v_Che_14;
	}
	/**
	 * @return the v_Che_15
	 */
	public String getV_Che_15() {
		return v_Che_15;
	}
	/**
	 * @param v_Che_15 the v_Che_15 to set
	 */
	public void setV_Che_15(String v_Che_15) {
		this.v_Che_15 = v_Che_15;
	}
	/**
	 * @return the v_Che_16
	 */
	public String getV_Che_16() {
		return v_Che_16;
	}
	/**
	 * @param v_Che_16 the v_Che_16 to set
	 */
	public void setV_Che_16(String v_Che_16) {
		this.v_Che_16 = v_Che_16;
	}
	/**
	 * @return the v_Che_17
	 */
	public String getV_Che_17() {
		return v_Che_17;
	}
	/**
	 * @param v_Che_17 the v_Che_17 to set
	 */
	public void setV_Che_17(String v_Che_17) {
		this.v_Che_17 = v_Che_17;
	}
	/**
	 * @return the v_Che_18
	 */
	public String getV_Che_18() {
		return v_Che_18;
	}
	/**
	 * @param v_Che_18 the v_Che_18 to set
	 */
	public void setV_Che_18(String v_Che_18) {
		this.v_Che_18 = v_Che_18;
	}
	/**
	 * @return the v_Che_19
	 */
	public String getV_Che_19() {
		return v_Che_19;
	}
	/**
	 * @param v_Che_19 the v_Che_19 to set
	 */
	public void setV_Che_19(String v_Che_19) {
		this.v_Che_19 = v_Che_19;
	}
	/**
	 * @return the v_Che_20
	 */
	public String getV_Che_20() {
		return v_Che_20;
	}
	/**
	 * @param v_Che_20 the v_Che_20 to set
	 */
	public void setV_Che_20(String v_Che_20) {
		this.v_Che_20 = v_Che_20;
	}
	/**
	 * @return the v_Che_21
	 */
	public String getV_Che_21() {
		return v_Che_21;
	}
	/**
	 * @param v_Che_21 the v_Che_21 to set
	 */
	public void setV_Che_21(String v_Che_21) {
		this.v_Che_21 = v_Che_21;
	}
	/**
	 * @return the v_Che_22
	 */
	public String getV_Che_22() {
		return v_Che_22;
	}
	/**
	 * @param v_Che_22 the v_Che_22 to set
	 */
	public void setV_Che_22(String v_Che_22) {
		this.v_Che_22 = v_Che_22;
	}
	/**
	 * @return the v_Che_23
	 */
	public String getV_Che_23() {
		return v_Che_23;
	}
	/**
	 * @param v_Che_23 the v_Che_23 to set
	 */
	public void setV_Che_23(String v_Che_23) {
		this.v_Che_23 = v_Che_23;
	}
	/**
	 * @return the v_Che_24
	 */
	public String getV_Che_24() {
		return v_Che_24;
	}
	/**
	 * @param v_Che_24 the v_Che_24 to set
	 */
	public void setV_Che_24(String v_Che_24) {
		this.v_Che_24 = v_Che_24;
	}
	/**
	 * @return the v_Che_1_Remark
	 */
	public String getV_Che_1_Remark() {
		return v_Che_1_Remark;
	}
	/**
	 * @param v_Che_1_Remark the v_Che_1_Remark to set
	 */
	public void setV_Che_1_Remark(String v_Che_1_Remark) {
		this.v_Che_1_Remark = v_Che_1_Remark;
	}
	/**
	 * @return the v_Che_2_Remark
	 */
	public String getV_Che_2_Remark() {
		return v_Che_2_Remark;
	}
	/**
	 * @param v_Che_2_Remark the v_Che_2_Remark to set
	 */
	public void setV_Che_2_Remark(String v_Che_2_Remark) {
		this.v_Che_2_Remark = v_Che_2_Remark;
	}
	/**
	 * @return the v_Che_3_Remark
	 */
	public String getV_Che_3_Remark() {
		return v_Che_3_Remark;
	}
	/**
	 * @param v_Che_3_Remark the v_Che_3_Remark to set
	 */
	public void setV_Che_3_Remark(String v_Che_3_Remark) {
		this.v_Che_3_Remark = v_Che_3_Remark;
	}
	/**
	 * @return the v_Che_4_Remark
	 */
	public String getV_Che_4_Remark() {
		return v_Che_4_Remark;
	}
	/**
	 * @param v_Che_4_Remark the v_Che_4_Remark to set
	 */
	public void setV_Che_4_Remark(String v_Che_4_Remark) {
		this.v_Che_4_Remark = v_Che_4_Remark;
	}
	/**
	 * @return the v_Che_5_Remark
	 */
	public String getV_Che_5_Remark() {
		return v_Che_5_Remark;
	}
	/**
	 * @param v_Che_5_Remark the v_Che_5_Remark to set
	 */
	public void setV_Che_5_Remark(String v_Che_5_Remark) {
		this.v_Che_5_Remark = v_Che_5_Remark;
	}
	/**
	 * @return the v_Che_6_Remark
	 */
	public String getV_Che_6_Remark() {
		return v_Che_6_Remark;
	}
	/**
	 * @param v_Che_6_Remark the v_Che_6_Remark to set
	 */
	public void setV_Che_6_Remark(String v_Che_6_Remark) {
		this.v_Che_6_Remark = v_Che_6_Remark;
	}
	/**
	 * @return the v_Che_7_Remark
	 */
	public String getV_Che_7_Remark() {
		return v_Che_7_Remark;
	}
	/**
	 * @param v_Che_7_Remark the v_Che_7_Remark to set
	 */
	public void setV_Che_7_Remark(String v_Che_7_Remark) {
		this.v_Che_7_Remark = v_Che_7_Remark;
	}
	/**
	 * @return the v_Che_8_Remark
	 */
	public String getV_Che_8_Remark() {
		return v_Che_8_Remark;
	}
	/**
	 * @param v_Che_8_Remark the v_Che_8_Remark to set
	 */
	public void setV_Che_8_Remark(String v_Che_8_Remark) {
		this.v_Che_8_Remark = v_Che_8_Remark;
	}
	/**
	 * @return the v_Che_9_Remark
	 */
	public String getV_Che_9_Remark() {
		return v_Che_9_Remark;
	}
	/**
	 * @param v_Che_9_Remark the v_Che_9_Remark to set
	 */
	public void setV_Che_9_Remark(String v_Che_9_Remark) {
		this.v_Che_9_Remark = v_Che_9_Remark;
	}
	/**
	 * @return the v_Che_10_Remark
	 */
	public String getV_Che_10_Remark() {
		return v_Che_10_Remark;
	}
	/**
	 * @param v_Che_10_Remark the v_Che_10_Remark to set
	 */
	public void setV_Che_10_Remark(String v_Che_10_Remark) {
		this.v_Che_10_Remark = v_Che_10_Remark;
	}
	/**
	 * @return the v_Che_11_Remark
	 */
	public String getV_Che_11_Remark() {
		return v_Che_11_Remark;
	}
	/**
	 * @param v_Che_11_Remark the v_Che_11_Remark to set
	 */
	public void setV_Che_11_Remark(String v_Che_11_Remark) {
		this.v_Che_11_Remark = v_Che_11_Remark;
	}
	/**
	 * @return the v_Che_12_Remark
	 */
	public String getV_Che_12_Remark() {
		return v_Che_12_Remark;
	}
	/**
	 * @param v_Che_12_Remark the v_Che_12_Remark to set
	 */
	public void setV_Che_12_Remark(String v_Che_12_Remark) {
		this.v_Che_12_Remark = v_Che_12_Remark;
	}
	/**
	 * @return the v_Che_13_Remark
	 */
	public String getV_Che_13_Remark() {
		return v_Che_13_Remark;
	}
	/**
	 * @param v_Che_13_Remark the v_Che_13_Remark to set
	 */
	public void setV_Che_13_Remark(String v_Che_13_Remark) {
		this.v_Che_13_Remark = v_Che_13_Remark;
	}
	/**
	 * @return the v_Che_14_Remark
	 */
	public String getV_Che_14_Remark() {
		return v_Che_14_Remark;
	}
	/**
	 * @param v_Che_14_Remark the v_Che_14_Remark to set
	 */
	public void setV_Che_14_Remark(String v_Che_14_Remark) {
		this.v_Che_14_Remark = v_Che_14_Remark;
	}
	/**
	 * @return the v_Che_15_Remark
	 */
	public String getV_Che_15_Remark() {
		return v_Che_15_Remark;
	}
	/**
	 * @param v_Che_15_Remark the v_Che_15_Remark to set
	 */
	public void setV_Che_15_Remark(String v_Che_15_Remark) {
		this.v_Che_15_Remark = v_Che_15_Remark;
	}
	/**
	 * @return the v_Che_16_Remark
	 */
	public String getV_Che_16_Remark() {
		return v_Che_16_Remark;
	}
	/**
	 * @param v_Che_16_Remark the v_Che_16_Remark to set
	 */
	public void setV_Che_16_Remark(String v_Che_16_Remark) {
		this.v_Che_16_Remark = v_Che_16_Remark;
	}
	/**
	 * @return the v_Che_17_Remark
	 */
	public String getV_Che_17_Remark() {
		return v_Che_17_Remark;
	}
	/**
	 * @param v_Che_17_Remark the v_Che_17_Remark to set
	 */
	public void setV_Che_17_Remark(String v_Che_17_Remark) {
		this.v_Che_17_Remark = v_Che_17_Remark;
	}
	/**
	 * @return the v_Che_18_Remark
	 */
	public String getV_Che_18_Remark() {
		return v_Che_18_Remark;
	}
	/**
	 * @param v_Che_18_Remark the v_Che_18_Remark to set
	 */
	public void setV_Che_18_Remark(String v_Che_18_Remark) {
		this.v_Che_18_Remark = v_Che_18_Remark;
	}
	/**
	 * @return the v_Che_19_Remark
	 */
	public String getV_Che_19_Remark() {
		return v_Che_19_Remark;
	}
	/**
	 * @param v_Che_19_Remark the v_Che_19_Remark to set
	 */
	public void setV_Che_19_Remark(String v_Che_19_Remark) {
		this.v_Che_19_Remark = v_Che_19_Remark;
	}
	/**
	 * @return the v_Che_20_Remark
	 */
	public String getV_Che_20_Remark() {
		return v_Che_20_Remark;
	}
	/**
	 * @param v_Che_20_Remark the v_Che_20_Remark to set
	 */
	public void setV_Che_20_Remark(String v_Che_20_Remark) {
		this.v_Che_20_Remark = v_Che_20_Remark;
	}
	/**
	 * @return the v_Che_21_Remark
	 */
	public String getV_Che_21_Remark() {
		return v_Che_21_Remark;
	}
	/**
	 * @param v_Che_21_Remark the v_Che_21_Remark to set
	 */
	public void setV_Che_21_Remark(String v_Che_21_Remark) {
		this.v_Che_21_Remark = v_Che_21_Remark;
	}
	/**
	 * @return the v_Che_22_Remark
	 */
	public String getV_Che_22_Remark() {
		return v_Che_22_Remark;
	}
	/**
	 * @param v_Che_22_Remark the v_Che_22_Remark to set
	 */
	public void setV_Che_22_Remark(String v_Che_22_Remark) {
		this.v_Che_22_Remark = v_Che_22_Remark;
	}
	/**
	 * @return the v_Che_23_Remark
	 */
	public String getV_Che_23_Remark() {
		return v_Che_23_Remark;
	}
	/**
	 * @param v_Che_23_Remark the v_Che_23_Remark to set
	 */
	public void setV_Che_23_Remark(String v_Che_23_Remark) {
		this.v_Che_23_Remark = v_Che_23_Remark;
	}
	/**
	 * @return the v_Che_24_Remark
	 */
	public String getV_Che_24_Remark() {
		return v_Che_24_Remark;
	}
	/**
	 * @param v_Che_24_Remark the v_Che_24_Remark to set
	 */
	public void setV_Che_24_Remark(String v_Che_24_Remark) {
		this.v_Che_24_Remark = v_Che_24_Remark;
	}
	/**
	 * @return the v_Che_Explan
	 */
	public String getV_Che_Explan() {
		return v_Che_Explan;
	}
	/**
	 * @param v_Che_Explan the v_Che_Explan to set
	 */
	public void setV_Che_Explan(String v_Che_Explan) {
		this.v_Che_Explan = v_Che_Explan;
	}
	/**
	 * @return the v_Che_Result
	 */
	public String getV_Che_Result() {
		return v_Che_Result;
	}
	/**
	 * @param v_Che_Result the v_Che_Result to set
	 */
	public void setV_Che_Result(String v_Che_Result) {
		this.v_Che_Result = v_Che_Result;
	}
	/**
	 * @return the v_Che_Date
	 */
	public String getV_Che_Date() {
		return v_Che_Date;
	}
	/**
	 * @param v_Che_Date the v_Che_Date to set
	 */
	public void setV_Che_Date(String v_Che_Date) {
		this.v_Che_Date = v_Che_Date;
	}
	/**
	 * @return the v_Che_Che_Date
	 */
	public String getV_Che_Che_Date() {
		return v_Che_Che_Date;
	}
	/**
	 * @param v_Che_Che_Date the v_Che_Che_Date to set
	 */
	public void setV_Che_Che_Date(String v_Che_Che_Date) {
		this.v_Che_Che_Date = v_Che_Che_Date;
	}
	
	
}
