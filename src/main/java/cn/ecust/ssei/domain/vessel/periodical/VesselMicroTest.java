package cn.ecust.ssei.domain.vessel.periodical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselMicroTest")
public class VesselMicroTest {

	private long id;
	private VesselPeriodicalMaintain vesselPeriodicalMaintain;
	private String v_Str_1;//封头型式
	private String v_Str_2;//封头与筒体的连接
	private String v_Str_3;//开孔位置及补强
	private String v_Str_4;//纵/（环）焊缝的布置及型式
	private String v_Str_5;//支承或者支座的型式与布置
	private String v_Str_6;//排放（疏水、排污）装置的设置
	private String v_Str_1_Remark;
	private String v_Str_2_Remark;
	private String v_Str_3_Remark;
	private String v_Str_4_Remark;
	private String v_Str_5_Remark;
	private String v_Str_6_Remark;
	private String v_Geo_1;//筒体同一断面上最大内径与最小内径之差
	private String v_Geo_2;//纵/（环）焊缝最大对口错边量
	private String v_Geo_3;//纵/（环）焊缝最大棱角度
	private String v_Geo_4;//纵/（环）焊缝最大咬边
	private String v_Geo_5;//纵/（环）焊缝最大余高
	private String v_Geo_1_Remark;//
	private String v_Geo_2_Remark;//
	private String v_Geo_3_Remark;//
	private String v_Geo_4_Remark;//
	private String v_Geo_5_Remark;//
	private String v_Appe_1;//铭牌和标志
	private String v_Appe_2;//内外表面的腐蚀
	private String v_Appe_3;//裂纹、泄漏、鼓包、变形、机械接触损伤、过热
	private String v_Appe_4;//工卡具焊迹、电弧灼伤
	private String v_Appe_5;//法兰、密封面及其紧固螺栓
	private String v_Appe_6;//支承、支座或者基础的下沉、倾斜、开裂
	private String v_Appe_7;//地脚螺栓
	private String v_Appe_8;//直立容器和球形容器支柱的铅垂度
	private String v_Appe_9;//多支座卧式容器的支座膨胀孔
	private String v_Appe_10;//排放（疏水、排污）装置和泄漏信号指示孔的堵塞、腐蚀、沉积物
	private String v_Appe_1_Remark;//
	private String v_Appe_2_Remark;//
	private String v_Appe_3_Remark;//
	private String v_Appe_4_Remark;//
	private String v_Appe_5_Remark;//
	private String v_Appe_6_Remark;//
	private String v_Appe_7_Remark;//
	private String v_Appe_8_Remark;//
	private String v_Appe_9_Remark;//
	private String v_Appe_10_Remark;//
	private String v_Ins_1;//隔热脱落、潮湿及层下腐蚀、裂纹
	private String v_Ins_2;//衬里层的破损、腐蚀、裂纹、脱落及检查孔介质流出情况
	private String v_Ins_3;//堆焊层的龟裂、剥离和脱落
	private String v_Ins_1_Remark;//
	private String v_Ins_2_Remark;//
	private String v_Ins_3_Remark;//
	private String v_Mac_Other_1;//夹层真空度
	private String v_Mac_Other_2;//日蒸发率
	private String v_Mac_Other_1_Remark;//
	private String v_Mac_Other_2_Remark;//
	private String v_Mac_Result;//结果
	private String v_Mac_Test_Date;//检验
	private String v_Mac_Proo_Date;//校对
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
	@OneToOne(mappedBy="vesselMicroTest")
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
	 * @return the v_Str_1
	 */
	public String getV_Str_1() {
		return v_Str_1;
	}
	/**
	 * @param v_Str_1 the v_Str_1 to set
	 */
	public void setV_Str_1(String v_Str_1) {
		this.v_Str_1 = v_Str_1;
	}
	/**
	 * @return the v_Str_2
	 */
	public String getV_Str_2() {
		return v_Str_2;
	}
	/**
	 * @param v_Str_2 the v_Str_2 to set
	 */
	public void setV_Str_2(String v_Str_2) {
		this.v_Str_2 = v_Str_2;
	}
	/**
	 * @return the v_Str_3
	 */
	public String getV_Str_3() {
		return v_Str_3;
	}
	/**
	 * @param v_Str_3 the v_Str_3 to set
	 */
	public void setV_Str_3(String v_Str_3) {
		this.v_Str_3 = v_Str_3;
	}
	/**
	 * @return the v_Str_4
	 */
	public String getV_Str_4() {
		return v_Str_4;
	}
	/**
	 * @param v_Str_4 the v_Str_4 to set
	 */
	public void setV_Str_4(String v_Str_4) {
		this.v_Str_4 = v_Str_4;
	}
	/**
	 * @return the v_Str_5
	 */
	public String getV_Str_5() {
		return v_Str_5;
	}
	/**
	 * @param v_Str_5 the v_Str_5 to set
	 */
	public void setV_Str_5(String v_Str_5) {
		this.v_Str_5 = v_Str_5;
	}
	/**
	 * @return the v_Str_6
	 */
	public String getV_Str_6() {
		return v_Str_6;
	}
	/**
	 * @param v_Str_6 the v_Str_6 to set
	 */
	public void setV_Str_6(String v_Str_6) {
		this.v_Str_6 = v_Str_6;
	}
	/**
	 * @return the v_Str_1_Remark
	 */
	public String getV_Str_1_Remark() {
		return v_Str_1_Remark;
	}
	/**
	 * @param v_Str_1_Remark the v_Str_1_Remark to set
	 */
	public void setV_Str_1_Remark(String v_Str_1_Remark) {
		this.v_Str_1_Remark = v_Str_1_Remark;
	}
	/**
	 * @return the v_Str_2_Remark
	 */
	public String getV_Str_2_Remark() {
		return v_Str_2_Remark;
	}
	/**
	 * @param v_Str_2_Remark the v_Str_2_Remark to set
	 */
	public void setV_Str_2_Remark(String v_Str_2_Remark) {
		this.v_Str_2_Remark = v_Str_2_Remark;
	}
	/**
	 * @return the v_Str_3_Remark
	 */
	public String getV_Str_3_Remark() {
		return v_Str_3_Remark;
	}
	/**
	 * @param v_Str_3_Remark the v_Str_3_Remark to set
	 */
	public void setV_Str_3_Remark(String v_Str_3_Remark) {
		this.v_Str_3_Remark = v_Str_3_Remark;
	}
	/**
	 * @return the v_Str_4_Remark
	 */
	public String getV_Str_4_Remark() {
		return v_Str_4_Remark;
	}
	/**
	 * @param v_Str_4_Remark the v_Str_4_Remark to set
	 */
	public void setV_Str_4_Remark(String v_Str_4_Remark) {
		this.v_Str_4_Remark = v_Str_4_Remark;
	}
	/**
	 * @return the v_Str_5_Remark
	 */
	public String getV_Str_5_Remark() {
		return v_Str_5_Remark;
	}
	/**
	 * @param v_Str_5_Remark the v_Str_5_Remark to set
	 */
	public void setV_Str_5_Remark(String v_Str_5_Remark) {
		this.v_Str_5_Remark = v_Str_5_Remark;
	}
	/**
	 * @return the v_Str_6_Remark
	 */
	public String getV_Str_6_Remark() {
		return v_Str_6_Remark;
	}
	/**
	 * @param v_Str_6_Remark the v_Str_6_Remark to set
	 */
	public void setV_Str_6_Remark(String v_Str_6_Remark) {
		this.v_Str_6_Remark = v_Str_6_Remark;
	}
	/**
	 * @return the v_Geo_1
	 */
	public String getV_Geo_1() {
		return v_Geo_1;
	}
	/**
	 * @param v_Geo_1 the v_Geo_1 to set
	 */
	public void setV_Geo_1(String v_Geo_1) {
		this.v_Geo_1 = v_Geo_1;
	}
	/**
	 * @return the v_Geo_2
	 */
	public String getV_Geo_2() {
		return v_Geo_2;
	}
	/**
	 * @param v_Geo_2 the v_Geo_2 to set
	 */
	public void setV_Geo_2(String v_Geo_2) {
		this.v_Geo_2 = v_Geo_2;
	}
	/**
	 * @return the v_Geo_3
	 */
	public String getV_Geo_3() {
		return v_Geo_3;
	}
	/**
	 * @param v_Geo_3 the v_Geo_3 to set
	 */
	public void setV_Geo_3(String v_Geo_3) {
		this.v_Geo_3 = v_Geo_3;
	}
	/**
	 * @return the v_Geo_4
	 */
	public String getV_Geo_4() {
		return v_Geo_4;
	}
	/**
	 * @param v_Geo_4 the v_Geo_4 to set
	 */
	public void setV_Geo_4(String v_Geo_4) {
		this.v_Geo_4 = v_Geo_4;
	}
	/**
	 * @return the v_Geo_5
	 */
	public String getV_Geo_5() {
		return v_Geo_5;
	}
	/**
	 * @param v_Geo_5 the v_Geo_5 to set
	 */
	public void setV_Geo_5(String v_Geo_5) {
		this.v_Geo_5 = v_Geo_5;
	}
	/**
	 * @return the v_Geo_1_Remark
	 */
	public String getV_Geo_1_Remark() {
		return v_Geo_1_Remark;
	}
	/**
	 * @param v_Geo_1_Remark the v_Geo_1_Remark to set
	 */
	public void setV_Geo_1_Remark(String v_Geo_1_Remark) {
		this.v_Geo_1_Remark = v_Geo_1_Remark;
	}
	/**
	 * @return the v_Geo_2_Remark
	 */
	public String getV_Geo_2_Remark() {
		return v_Geo_2_Remark;
	}
	/**
	 * @param v_Geo_2_Remark the v_Geo_2_Remark to set
	 */
	public void setV_Geo_2_Remark(String v_Geo_2_Remark) {
		this.v_Geo_2_Remark = v_Geo_2_Remark;
	}
	/**
	 * @return the v_Geo_3_Remark
	 */
	public String getV_Geo_3_Remark() {
		return v_Geo_3_Remark;
	}
	/**
	 * @param v_Geo_3_Remark the v_Geo_3_Remark to set
	 */
	public void setV_Geo_3_Remark(String v_Geo_3_Remark) {
		this.v_Geo_3_Remark = v_Geo_3_Remark;
	}
	/**
	 * @return the v_Geo_4_Remark
	 */
	public String getV_Geo_4_Remark() {
		return v_Geo_4_Remark;
	}
	/**
	 * @param v_Geo_4_Remark the v_Geo_4_Remark to set
	 */
	public void setV_Geo_4_Remark(String v_Geo_4_Remark) {
		this.v_Geo_4_Remark = v_Geo_4_Remark;
	}
	/**
	 * @return the v_Geo_5_Remark
	 */
	public String getV_Geo_5_Remark() {
		return v_Geo_5_Remark;
	}
	/**
	 * @param v_Geo_5_Remark the v_Geo_5_Remark to set
	 */
	public void setV_Geo_5_Remark(String v_Geo_5_Remark) {
		this.v_Geo_5_Remark = v_Geo_5_Remark;
	}
	/**
	 * @return the v_Appe_1
	 */
	public String getV_Appe_1() {
		return v_Appe_1;
	}
	/**
	 * @param v_Appe_1 the v_Appe_1 to set
	 */
	public void setV_Appe_1(String v_Appe_1) {
		this.v_Appe_1 = v_Appe_1;
	}
	/**
	 * @return the v_Appe_2
	 */
	public String getV_Appe_2() {
		return v_Appe_2;
	}
	/**
	 * @param v_Appe_2 the v_Appe_2 to set
	 */
	public void setV_Appe_2(String v_Appe_2) {
		this.v_Appe_2 = v_Appe_2;
	}
	/**
	 * @return the v_Appe_3
	 */
	public String getV_Appe_3() {
		return v_Appe_3;
	}
	/**
	 * @param v_Appe_3 the v_Appe_3 to set
	 */
	public void setV_Appe_3(String v_Appe_3) {
		this.v_Appe_3 = v_Appe_3;
	}
	/**
	 * @return the v_Appe_4
	 */
	public String getV_Appe_4() {
		return v_Appe_4;
	}
	/**
	 * @param v_Appe_4 the v_Appe_4 to set
	 */
	public void setV_Appe_4(String v_Appe_4) {
		this.v_Appe_4 = v_Appe_4;
	}
	/**
	 * @return the v_Appe_5
	 */
	public String getV_Appe_5() {
		return v_Appe_5;
	}
	/**
	 * @param v_Appe_5 the v_Appe_5 to set
	 */
	public void setV_Appe_5(String v_Appe_5) {
		this.v_Appe_5 = v_Appe_5;
	}
	/**
	 * @return the v_Appe_6
	 */
	public String getV_Appe_6() {
		return v_Appe_6;
	}
	/**
	 * @param v_Appe_6 the v_Appe_6 to set
	 */
	public void setV_Appe_6(String v_Appe_6) {
		this.v_Appe_6 = v_Appe_6;
	}
	/**
	 * @return the v_Appe_7
	 */
	public String getV_Appe_7() {
		return v_Appe_7;
	}
	/**
	 * @param v_Appe_7 the v_Appe_7 to set
	 */
	public void setV_Appe_7(String v_Appe_7) {
		this.v_Appe_7 = v_Appe_7;
	}
	/**
	 * @return the v_Appe_8
	 */
	public String getV_Appe_8() {
		return v_Appe_8;
	}
	/**
	 * @param v_Appe_8 the v_Appe_8 to set
	 */
	public void setV_Appe_8(String v_Appe_8) {
		this.v_Appe_8 = v_Appe_8;
	}
	/**
	 * @return the v_Appe_9
	 */
	public String getV_Appe_9() {
		return v_Appe_9;
	}
	/**
	 * @param v_Appe_9 the v_Appe_9 to set
	 */
	public void setV_Appe_9(String v_Appe_9) {
		this.v_Appe_9 = v_Appe_9;
	}
	/**
	 * @return the v_Appe_10
	 */
	public String getV_Appe_10() {
		return v_Appe_10;
	}
	/**
	 * @param v_Appe_10 the v_Appe_10 to set
	 */
	public void setV_Appe_10(String v_Appe_10) {
		this.v_Appe_10 = v_Appe_10;
	}
	/**
	 * @return the v_Appe_1_Remark
	 */
	public String getV_Appe_1_Remark() {
		return v_Appe_1_Remark;
	}
	/**
	 * @param v_Appe_1_Remark the v_Appe_1_Remark to set
	 */
	public void setV_Appe_1_Remark(String v_Appe_1_Remark) {
		this.v_Appe_1_Remark = v_Appe_1_Remark;
	}
	/**
	 * @return the v_Appe_2_Remark
	 */
	public String getV_Appe_2_Remark() {
		return v_Appe_2_Remark;
	}
	/**
	 * @param v_Appe_2_Remark the v_Appe_2_Remark to set
	 */
	public void setV_Appe_2_Remark(String v_Appe_2_Remark) {
		this.v_Appe_2_Remark = v_Appe_2_Remark;
	}
	/**
	 * @return the v_Appe_3_Remark
	 */
	public String getV_Appe_3_Remark() {
		return v_Appe_3_Remark;
	}
	/**
	 * @param v_Appe_3_Remark the v_Appe_3_Remark to set
	 */
	public void setV_Appe_3_Remark(String v_Appe_3_Remark) {
		this.v_Appe_3_Remark = v_Appe_3_Remark;
	}
	/**
	 * @return the v_Appe_4_Remark
	 */
	public String getV_Appe_4_Remark() {
		return v_Appe_4_Remark;
	}
	/**
	 * @param v_Appe_4_Remark the v_Appe_4_Remark to set
	 */
	public void setV_Appe_4_Remark(String v_Appe_4_Remark) {
		this.v_Appe_4_Remark = v_Appe_4_Remark;
	}
	/**
	 * @return the v_Appe_5_Remark
	 */
	public String getV_Appe_5_Remark() {
		return v_Appe_5_Remark;
	}
	/**
	 * @param v_Appe_5_Remark the v_Appe_5_Remark to set
	 */
	public void setV_Appe_5_Remark(String v_Appe_5_Remark) {
		this.v_Appe_5_Remark = v_Appe_5_Remark;
	}
	/**
	 * @return the v_Appe_6_Remark
	 */
	public String getV_Appe_6_Remark() {
		return v_Appe_6_Remark;
	}
	/**
	 * @param v_Appe_6_Remark the v_Appe_6_Remark to set
	 */
	public void setV_Appe_6_Remark(String v_Appe_6_Remark) {
		this.v_Appe_6_Remark = v_Appe_6_Remark;
	}
	/**
	 * @return the v_Appe_7_Remark
	 */
	public String getV_Appe_7_Remark() {
		return v_Appe_7_Remark;
	}
	/**
	 * @param v_Appe_7_Remark the v_Appe_7_Remark to set
	 */
	public void setV_Appe_7_Remark(String v_Appe_7_Remark) {
		this.v_Appe_7_Remark = v_Appe_7_Remark;
	}
	/**
	 * @return the v_Appe_8_Remark
	 */
	public String getV_Appe_8_Remark() {
		return v_Appe_8_Remark;
	}
	/**
	 * @param v_Appe_8_Remark the v_Appe_8_Remark to set
	 */
	public void setV_Appe_8_Remark(String v_Appe_8_Remark) {
		this.v_Appe_8_Remark = v_Appe_8_Remark;
	}
	/**
	 * @return the v_Appe_9_Remark
	 */
	public String getV_Appe_9_Remark() {
		return v_Appe_9_Remark;
	}
	/**
	 * @param v_Appe_9_Remark the v_Appe_9_Remark to set
	 */
	public void setV_Appe_9_Remark(String v_Appe_9_Remark) {
		this.v_Appe_9_Remark = v_Appe_9_Remark;
	}
	/**
	 * @return the v_Appe_10_Remark
	 */
	public String getV_Appe_10_Remark() {
		return v_Appe_10_Remark;
	}
	/**
	 * @param v_Appe_10_Remark the v_Appe_10_Remark to set
	 */
	public void setV_Appe_10_Remark(String v_Appe_10_Remark) {
		this.v_Appe_10_Remark = v_Appe_10_Remark;
	}
	/**
	 * @return the v_Ins_1
	 */
	public String getV_Ins_1() {
		return v_Ins_1;
	}
	/**
	 * @param v_Ins_1 the v_Ins_1 to set
	 */
	public void setV_Ins_1(String v_Ins_1) {
		this.v_Ins_1 = v_Ins_1;
	}
	/**
	 * @return the v_Ins_2
	 */
	public String getV_Ins_2() {
		return v_Ins_2;
	}
	/**
	 * @param v_Ins_2 the v_Ins_2 to set
	 */
	public void setV_Ins_2(String v_Ins_2) {
		this.v_Ins_2 = v_Ins_2;
	}
	/**
	 * @return the v_Ins_3
	 */
	public String getV_Ins_3() {
		return v_Ins_3;
	}
	/**
	 * @param v_Ins_3 the v_Ins_3 to set
	 */
	public void setV_Ins_3(String v_Ins_3) {
		this.v_Ins_3 = v_Ins_3;
	}
	/**
	 * @return the v_Ins_1_Remark
	 */
	public String getV_Ins_1_Remark() {
		return v_Ins_1_Remark;
	}
	/**
	 * @param v_Ins_1_Remark the v_Ins_1_Remark to set
	 */
	public void setV_Ins_1_Remark(String v_Ins_1_Remark) {
		this.v_Ins_1_Remark = v_Ins_1_Remark;
	}
	/**
	 * @return the v_Ins_2_Remark
	 */
	public String getV_Ins_2_Remark() {
		return v_Ins_2_Remark;
	}
	/**
	 * @param v_Ins_2_Remark the v_Ins_2_Remark to set
	 */
	public void setV_Ins_2_Remark(String v_Ins_2_Remark) {
		this.v_Ins_2_Remark = v_Ins_2_Remark;
	}
	/**
	 * @return the v_Ins_3_Remark
	 */
	public String getV_Ins_3_Remark() {
		return v_Ins_3_Remark;
	}
	/**
	 * @param v_Ins_3_Remark the v_Ins_3_Remark to set
	 */
	public void setV_Ins_3_Remark(String v_Ins_3_Remark) {
		this.v_Ins_3_Remark = v_Ins_3_Remark;
	}
	/**
	 * @return the v_Mac_Other_1
	 */
	public String getV_Mac_Other_1() {
		return v_Mac_Other_1;
	}
	/**
	 * @param v_Mac_Other_1 the v_Mac_Other_1 to set
	 */
	public void setV_Mac_Other_1(String v_Mac_Other_1) {
		this.v_Mac_Other_1 = v_Mac_Other_1;
	}
	/**
	 * @return the v_Mac_Other_2
	 */
	public String getV_Mac_Other_2() {
		return v_Mac_Other_2;
	}
	/**
	 * @param v_Mac_Other_2 the v_Mac_Other_2 to set
	 */
	public void setV_Mac_Other_2(String v_Mac_Other_2) {
		this.v_Mac_Other_2 = v_Mac_Other_2;
	}
	/**
	 * @return the v_Mac_Other_1_Remark
	 */
	public String getV_Mac_Other_1_Remark() {
		return v_Mac_Other_1_Remark;
	}
	/**
	 * @param v_Mac_Other_1_Remark the v_Mac_Other_1_Remark to set
	 */
	public void setV_Mac_Other_1_Remark(String v_Mac_Other_1_Remark) {
		this.v_Mac_Other_1_Remark = v_Mac_Other_1_Remark;
	}
	/**
	 * @return the v_Mac_Other_2_Remark
	 */
	public String getV_Mac_Other_2_Remark() {
		return v_Mac_Other_2_Remark;
	}
	/**
	 * @param v_Mac_Other_2_Remark the v_Mac_Other_2_Remark to set
	 */
	public void setV_Mac_Other_2_Remark(String v_Mac_Other_2_Remark) {
		this.v_Mac_Other_2_Remark = v_Mac_Other_2_Remark;
	}
	/**
	 * @return the v_Mac_Result
	 */
	public String getV_Mac_Result() {
		return v_Mac_Result;
	}
	/**
	 * @param v_Mac_Result the v_Mac_Result to set
	 */
	public void setV_Mac_Result(String v_Mac_Result) {
		this.v_Mac_Result = v_Mac_Result;
	}
	/**
	 * @return the v_Mac_Test_Date
	 */
	public String getV_Mac_Test_Date() {
		return v_Mac_Test_Date;
	}
	/**
	 * @param v_Mac_Test_Date the v_Mac_Test_Date to set
	 */
	public void setV_Mac_Test_Date(String v_Mac_Test_Date) {
		this.v_Mac_Test_Date = v_Mac_Test_Date;
	}
	/**
	 * @return the v_Mac_Proo_Date
	 */
	public String getV_Mac_Proo_Date() {
		return v_Mac_Proo_Date;
	}
	/**
	 * @param v_Mac_Proo_Date the v_Mac_Proo_Date to set
	 */
	public void setV_Mac_Proo_Date(String v_Mac_Proo_Date) {
		this.v_Mac_Proo_Date = v_Mac_Proo_Date;
	}
	

}
