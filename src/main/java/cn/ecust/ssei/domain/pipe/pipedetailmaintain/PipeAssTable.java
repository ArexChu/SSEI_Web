package cn.ecust.ssei.domain.pipe.pipedetailmaintain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_pipeAssTable")
public class PipeAssTable {
	
	private long id;//管道安全等级评估ID
	private PipeDetailMaintain pipeDetailMaintain;
	private String p_pos_Sum;//管道位置及结构
	private String p_pos_Gra;//
	private String p_Ma_Sum_1;//与设计不符
	private String p_Ma_Sum_2;//材质不明
	private String p_Ma_Sum_3;//材质劣化损伤
	private String p_Ma_Sum_4;//硬度异常
	private String p_Ma_Gra_1;//
	private String p_Ma_Gra_2;//
	private String p_Ma_Gra_3;//
	private String p_Ma_Gra_4;//
	private String p_Thi_Sum;//管子及管件全面减薄
	private String p_Thi_Gra;//
	private String p_Thi_Part_Sum;//管子局部减薄
	private String p_Thi_Part_Gra;//
	private String p_Wel_Sum_1;//裂纹
	private String p_Wel_Sum_2;//咬边
	private String p_Wel_Sum_3;//气孔
	private String p_Wel_Sum_4;//夹渣
	private String p_Wel_Sum_5;//未焊透
	private String p_Wel_Sum_6;//未熔合
	private String p_Wel_Sum_7;//错边
	private String p_Wel_Gra_1;//
	private String p_Wel_Gra_2;//
	private String p_Wel_Gra_3;//
	private String p_Wel_Gra_4;//
	private String p_Wel_Gra_5;//
	private String p_Wel_Gra_6;//
	private String p_Wel_Gra_7;//
	private String p_Component_Sum_1;//裂纹、皱褶、重皮
	private String p_Component_Sum_2;//碰伤
	private String p_Component_Sum_3;//变形
	private String p_Component_Sum_4;//损坏
	private String p_Component_Gra_1;//
	private String p_Component_Gra_2;//
	private String p_Component_Gra_3;//
	private String p_Component_Gra_4;//
	private String p_Hanger_Sum;//吊支架异常
	private String p_Hanger_Gra;//
	private String p_Other_Sum_1;//安全保护装置
	private String p_Other_Sum_2;//其它附属装置
	private String p_Other_Gra_1;//
	private String p_Other_Gra_2;//
	private String p_Pretest_Rep;//压力试验
	private String p_Pretest_Gra;//
	private String p_Leaktest_Rep;//泄漏试验
	private String p_Leaktest_Gra;//
	private String p_NDEtest_Rep;//无损检测
	private String p_NDEtest_Gra;//
	private String p_Mettest_Rep;//金相检测
	private String p_Mettest_Gra;//
	private String p_Ma_Ana_Rep;//材料成分分析
	private String p_Ma_Ana_Gra;//
	private String p_Hardtest_Rep;//硬度检测
	private String p_Hardtest_Gra;//
	private String p_Safe_Ass_Gra;//管道安全等级评定
	private String p_Ass_Remark;//备注
	
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
	@OneToOne(mappedBy="pipeAssTable")
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
	 * @return the p_pos_Sum
	 */
	public String getP_pos_Sum() {
		return p_pos_Sum;
	}
	/**
	 * @param p_pos_Sum the p_pos_Sum to set
	 */
	public void setP_pos_Sum(String p_pos_Sum) {
		this.p_pos_Sum = p_pos_Sum;
	}
	/**
	 * @return the p_pos_Gra
	 */
	public String getP_pos_Gra() {
		return p_pos_Gra;
	}
	/**
	 * @param p_pos_Gra the p_pos_Gra to set
	 */
	public void setP_pos_Gra(String p_pos_Gra) {
		this.p_pos_Gra = p_pos_Gra;
	}
	/**
	 * @return the p_Ma_Sum_1
	 */
	public String getP_Ma_Sum_1() {
		return p_Ma_Sum_1;
	}
	/**
	 * @param p_Ma_Sum_1 the p_Ma_Sum_1 to set
	 */
	public void setP_Ma_Sum_1(String p_Ma_Sum_1) {
		this.p_Ma_Sum_1 = p_Ma_Sum_1;
	}
	/**
	 * @return the p_Ma_Sum_2
	 */
	public String getP_Ma_Sum_2() {
		return p_Ma_Sum_2;
	}
	/**
	 * @param p_Ma_Sum_2 the p_Ma_Sum_2 to set
	 */
	public void setP_Ma_Sum_2(String p_Ma_Sum_2) {
		this.p_Ma_Sum_2 = p_Ma_Sum_2;
	}
	/**
	 * @return the p_Ma_Sum_3
	 */
	public String getP_Ma_Sum_3() {
		return p_Ma_Sum_3;
	}
	/**
	 * @param p_Ma_Sum_3 the p_Ma_Sum_3 to set
	 */
	public void setP_Ma_Sum_3(String p_Ma_Sum_3) {
		this.p_Ma_Sum_3 = p_Ma_Sum_3;
	}
	/**
	 * @return the p_Ma_Sum_4
	 */
	public String getP_Ma_Sum_4() {
		return p_Ma_Sum_4;
	}
	/**
	 * @param p_Ma_Sum_4 the p_Ma_Sum_4 to set
	 */
	public void setP_Ma_Sum_4(String p_Ma_Sum_4) {
		this.p_Ma_Sum_4 = p_Ma_Sum_4;
	}
	/**
	 * @return the p_Ma_Gra_1
	 */
	public String getP_Ma_Gra_1() {
		return p_Ma_Gra_1;
	}
	/**
	 * @param p_Ma_Gra_1 the p_Ma_Gra_1 to set
	 */
	public void setP_Ma_Gra_1(String p_Ma_Gra_1) {
		this.p_Ma_Gra_1 = p_Ma_Gra_1;
	}
	/**
	 * @return the p_Ma_Gra_2
	 */
	public String getP_Ma_Gra_2() {
		return p_Ma_Gra_2;
	}
	/**
	 * @param p_Ma_Gra_2 the p_Ma_Gra_2 to set
	 */
	public void setP_Ma_Gra_2(String p_Ma_Gra_2) {
		this.p_Ma_Gra_2 = p_Ma_Gra_2;
	}
	/**
	 * @return the p_Ma_Gra_3
	 */
	public String getP_Ma_Gra_3() {
		return p_Ma_Gra_3;
	}
	/**
	 * @param p_Ma_Gra_3 the p_Ma_Gra_3 to set
	 */
	public void setP_Ma_Gra_3(String p_Ma_Gra_3) {
		this.p_Ma_Gra_3 = p_Ma_Gra_3;
	}
	/**
	 * @return the p_Ma_Gra_4
	 */
	public String getP_Ma_Gra_4() {
		return p_Ma_Gra_4;
	}
	/**
	 * @param p_Ma_Gra_4 the p_Ma_Gra_4 to set
	 */
	public void setP_Ma_Gra_4(String p_Ma_Gra_4) {
		this.p_Ma_Gra_4 = p_Ma_Gra_4;
	}
	/**
	 * @return the p_Thi_Sum
	 */
	public String getP_Thi_Sum() {
		return p_Thi_Sum;
	}
	/**
	 * @param p_Thi_Sum the p_Thi_Sum to set
	 */
	public void setP_Thi_Sum(String p_Thi_Sum) {
		this.p_Thi_Sum = p_Thi_Sum;
	}
	/**
	 * @return the p_Thi_Gra
	 */
	public String getP_Thi_Gra() {
		return p_Thi_Gra;
	}
	/**
	 * @param p_Thi_Gra the p_Thi_Gra to set
	 */
	public void setP_Thi_Gra(String p_Thi_Gra) {
		this.p_Thi_Gra = p_Thi_Gra;
	}
	/**
	 * @return the p_Thi_Part_Sum
	 */
	public String getP_Thi_Part_Sum() {
		return p_Thi_Part_Sum;
	}
	/**
	 * @param p_Thi_Part_Sum the p_Thi_Part_Sum to set
	 */
	public void setP_Thi_Part_Sum(String p_Thi_Part_Sum) {
		this.p_Thi_Part_Sum = p_Thi_Part_Sum;
	}
	/**
	 * @return the p_Thi_Part_Gra
	 */
	public String getP_Thi_Part_Gra() {
		return p_Thi_Part_Gra;
	}
	/**
	 * @param p_Thi_Part_Gra the p_Thi_Part_Gra to set
	 */
	public void setP_Thi_Part_Gra(String p_Thi_Part_Gra) {
		this.p_Thi_Part_Gra = p_Thi_Part_Gra;
	}
	/**
	 * @return the p_Wel_Sum_1
	 */
	public String getP_Wel_Sum_1() {
		return p_Wel_Sum_1;
	}
	/**
	 * @param p_Wel_Sum_1 the p_Wel_Sum_1 to set
	 */
	public void setP_Wel_Sum_1(String p_Wel_Sum_1) {
		this.p_Wel_Sum_1 = p_Wel_Sum_1;
	}
	/**
	 * @return the p_Wel_Sum_2
	 */
	public String getP_Wel_Sum_2() {
		return p_Wel_Sum_2;
	}
	/**
	 * @param p_Wel_Sum_2 the p_Wel_Sum_2 to set
	 */
	public void setP_Wel_Sum_2(String p_Wel_Sum_2) {
		this.p_Wel_Sum_2 = p_Wel_Sum_2;
	}
	/**
	 * @return the p_Wel_Sum_3
	 */
	public String getP_Wel_Sum_3() {
		return p_Wel_Sum_3;
	}
	/**
	 * @param p_Wel_Sum_3 the p_Wel_Sum_3 to set
	 */
	public void setP_Wel_Sum_3(String p_Wel_Sum_3) {
		this.p_Wel_Sum_3 = p_Wel_Sum_3;
	}
	/**
	 * @return the p_Wel_Sum_4
	 */
	public String getP_Wel_Sum_4() {
		return p_Wel_Sum_4;
	}
	/**
	 * @param p_Wel_Sum_4 the p_Wel_Sum_4 to set
	 */
	public void setP_Wel_Sum_4(String p_Wel_Sum_4) {
		this.p_Wel_Sum_4 = p_Wel_Sum_4;
	}
	/**
	 * @return the p_Wel_Sum_5
	 */
	public String getP_Wel_Sum_5() {
		return p_Wel_Sum_5;
	}
	/**
	 * @param p_Wel_Sum_5 the p_Wel_Sum_5 to set
	 */
	public void setP_Wel_Sum_5(String p_Wel_Sum_5) {
		this.p_Wel_Sum_5 = p_Wel_Sum_5;
	}
	/**
	 * @return the p_Wel_Sum_6
	 */
	public String getP_Wel_Sum_6() {
		return p_Wel_Sum_6;
	}
	/**
	 * @param p_Wel_Sum_6 the p_Wel_Sum_6 to set
	 */
	public void setP_Wel_Sum_6(String p_Wel_Sum_6) {
		this.p_Wel_Sum_6 = p_Wel_Sum_6;
	}
	/**
	 * @return the p_Wel_Sum_7
	 */
	public String getP_Wel_Sum_7() {
		return p_Wel_Sum_7;
	}
	/**
	 * @param p_Wel_Sum_7 the p_Wel_Sum_7 to set
	 */
	public void setP_Wel_Sum_7(String p_Wel_Sum_7) {
		this.p_Wel_Sum_7 = p_Wel_Sum_7;
	}
	/**
	 * @return the p_Wel_Gra_1
	 */
	public String getP_Wel_Gra_1() {
		return p_Wel_Gra_1;
	}
	/**
	 * @param p_Wel_Gra_1 the p_Wel_Gra_1 to set
	 */
	public void setP_Wel_Gra_1(String p_Wel_Gra_1) {
		this.p_Wel_Gra_1 = p_Wel_Gra_1;
	}
	/**
	 * @return the p_Wel_Gra_2
	 */
	public String getP_Wel_Gra_2() {
		return p_Wel_Gra_2;
	}
	/**
	 * @param p_Wel_Gra_2 the p_Wel_Gra_2 to set
	 */
	public void setP_Wel_Gra_2(String p_Wel_Gra_2) {
		this.p_Wel_Gra_2 = p_Wel_Gra_2;
	}
	/**
	 * @return the p_Wel_Gra_3
	 */
	public String getP_Wel_Gra_3() {
		return p_Wel_Gra_3;
	}
	/**
	 * @param p_Wel_Gra_3 the p_Wel_Gra_3 to set
	 */
	public void setP_Wel_Gra_3(String p_Wel_Gra_3) {
		this.p_Wel_Gra_3 = p_Wel_Gra_3;
	}
	/**
	 * @return the p_Wel_Gra_4
	 */
	public String getP_Wel_Gra_4() {
		return p_Wel_Gra_4;
	}
	/**
	 * @param p_Wel_Gra_4 the p_Wel_Gra_4 to set
	 */
	public void setP_Wel_Gra_4(String p_Wel_Gra_4) {
		this.p_Wel_Gra_4 = p_Wel_Gra_4;
	}
	/**
	 * @return the p_Wel_Gra_5
	 */
	public String getP_Wel_Gra_5() {
		return p_Wel_Gra_5;
	}
	/**
	 * @param p_Wel_Gra_5 the p_Wel_Gra_5 to set
	 */
	public void setP_Wel_Gra_5(String p_Wel_Gra_5) {
		this.p_Wel_Gra_5 = p_Wel_Gra_5;
	}
	/**
	 * @return the p_Wel_Gra_6
	 */
	public String getP_Wel_Gra_6() {
		return p_Wel_Gra_6;
	}
	/**
	 * @param p_Wel_Gra_6 the p_Wel_Gra_6 to set
	 */
	public void setP_Wel_Gra_6(String p_Wel_Gra_6) {
		this.p_Wel_Gra_6 = p_Wel_Gra_6;
	}
	/**
	 * @return the p_Wel_Gra_7
	 */
	public String getP_Wel_Gra_7() {
		return p_Wel_Gra_7;
	}
	/**
	 * @param p_Wel_Gra_7 the p_Wel_Gra_7 to set
	 */
	public void setP_Wel_Gra_7(String p_Wel_Gra_7) {
		this.p_Wel_Gra_7 = p_Wel_Gra_7;
	}
	/**
	 * @return the p_Component_Sum_1
	 */
	public String getP_Component_Sum_1() {
		return p_Component_Sum_1;
	}
	/**
	 * @param p_Component_Sum_1 the p_Component_Sum_1 to set
	 */
	public void setP_Component_Sum_1(String p_Component_Sum_1) {
		this.p_Component_Sum_1 = p_Component_Sum_1;
	}
	/**
	 * @return the p_Component_Sum_2
	 */
	public String getP_Component_Sum_2() {
		return p_Component_Sum_2;
	}
	/**
	 * @param p_Component_Sum_2 the p_Component_Sum_2 to set
	 */
	public void setP_Component_Sum_2(String p_Component_Sum_2) {
		this.p_Component_Sum_2 = p_Component_Sum_2;
	}
	/**
	 * @return the p_Component_Sum_3
	 */
	public String getP_Component_Sum_3() {
		return p_Component_Sum_3;
	}
	/**
	 * @param p_Component_Sum_3 the p_Component_Sum_3 to set
	 */
	public void setP_Component_Sum_3(String p_Component_Sum_3) {
		this.p_Component_Sum_3 = p_Component_Sum_3;
	}
	/**
	 * @return the p_Component_Sum_4
	 */
	public String getP_Component_Sum_4() {
		return p_Component_Sum_4;
	}
	/**
	 * @param p_Component_Sum_4 the p_Component_Sum_4 to set
	 */
	public void setP_Component_Sum_4(String p_Component_Sum_4) {
		this.p_Component_Sum_4 = p_Component_Sum_4;
	}
	/**
	 * @return the p_Component_Gra_1
	 */
	public String getP_Component_Gra_1() {
		return p_Component_Gra_1;
	}
	/**
	 * @param p_Component_Gra_1 the p_Component_Gra_1 to set
	 */
	public void setP_Component_Gra_1(String p_Component_Gra_1) {
		this.p_Component_Gra_1 = p_Component_Gra_1;
	}
	/**
	 * @return the p_Component_Gra_2
	 */
	public String getP_Component_Gra_2() {
		return p_Component_Gra_2;
	}
	/**
	 * @param p_Component_Gra_2 the p_Component_Gra_2 to set
	 */
	public void setP_Component_Gra_2(String p_Component_Gra_2) {
		this.p_Component_Gra_2 = p_Component_Gra_2;
	}
	/**
	 * @return the p_Component_Gra_3
	 */
	public String getP_Component_Gra_3() {
		return p_Component_Gra_3;
	}
	/**
	 * @param p_Component_Gra_3 the p_Component_Gra_3 to set
	 */
	public void setP_Component_Gra_3(String p_Component_Gra_3) {
		this.p_Component_Gra_3 = p_Component_Gra_3;
	}
	/**
	 * @return the p_Component_Gra_4
	 */
	public String getP_Component_Gra_4() {
		return p_Component_Gra_4;
	}
	/**
	 * @param p_Component_Gra_4 the p_Component_Gra_4 to set
	 */
	public void setP_Component_Gra_4(String p_Component_Gra_4) {
		this.p_Component_Gra_4 = p_Component_Gra_4;
	}
	/**
	 * @return the p_Hanger_Sum
	 */
	public String getP_Hanger_Sum() {
		return p_Hanger_Sum;
	}
	/**
	 * @param p_Hanger_Sum the p_Hanger_Sum to set
	 */
	public void setP_Hanger_Sum(String p_Hanger_Sum) {
		this.p_Hanger_Sum = p_Hanger_Sum;
	}
	/**
	 * @return the p_Hanger_Gra
	 */
	public String getP_Hanger_Gra() {
		return p_Hanger_Gra;
	}
	/**
	 * @param p_Hanger_Gra the p_Hanger_Gra to set
	 */
	public void setP_Hanger_Gra(String p_Hanger_Gra) {
		this.p_Hanger_Gra = p_Hanger_Gra;
	}
	/**
	 * @return the p_Other_Sum_1
	 */
	public String getP_Other_Sum_1() {
		return p_Other_Sum_1;
	}
	/**
	 * @param p_Other_Sum_1 the p_Other_Sum_1 to set
	 */
	public void setP_Other_Sum_1(String p_Other_Sum_1) {
		this.p_Other_Sum_1 = p_Other_Sum_1;
	}
	/**
	 * @return the p_Other_Sum_2
	 */
	public String getP_Other_Sum_2() {
		return p_Other_Sum_2;
	}
	/**
	 * @param p_Other_Sum_2 the p_Other_Sum_2 to set
	 */
	public void setP_Other_Sum_2(String p_Other_Sum_2) {
		this.p_Other_Sum_2 = p_Other_Sum_2;
	}
	/**
	 * @return the p_Other_Gra_1
	 */
	public String getP_Other_Gra_1() {
		return p_Other_Gra_1;
	}
	/**
	 * @param p_Other_Gra_1 the p_Other_Gra_1 to set
	 */
	public void setP_Other_Gra_1(String p_Other_Gra_1) {
		this.p_Other_Gra_1 = p_Other_Gra_1;
	}
	/**
	 * @return the p_Other_Gra_2
	 */
	public String getP_Other_Gra_2() {
		return p_Other_Gra_2;
	}
	/**
	 * @param p_Other_Gra_2 the p_Other_Gra_2 to set
	 */
	public void setP_Other_Gra_2(String p_Other_Gra_2) {
		this.p_Other_Gra_2 = p_Other_Gra_2;
	}
	/**
	 * @return the p_Pretest_Rep
	 */
	public String getP_Pretest_Rep() {
		return p_Pretest_Rep;
	}
	/**
	 * @param p_Pretest_Rep the p_Pretest_Rep to set
	 */
	public void setP_Pretest_Rep(String p_Pretest_Rep) {
		this.p_Pretest_Rep = p_Pretest_Rep;
	}
	/**
	 * @return the p_Pretest_Gra
	 */
	public String getP_Pretest_Gra() {
		return p_Pretest_Gra;
	}
	/**
	 * @param p_Pretest_Gra the p_Pretest_Gra to set
	 */
	public void setP_Pretest_Gra(String p_Pretest_Gra) {
		this.p_Pretest_Gra = p_Pretest_Gra;
	}
	/**
	 * @return the p_Leaktest_Rep
	 */
	public String getP_Leaktest_Rep() {
		return p_Leaktest_Rep;
	}
	/**
	 * @param p_Leaktest_Rep the p_Leaktest_Rep to set
	 */
	public void setP_Leaktest_Rep(String p_Leaktest_Rep) {
		this.p_Leaktest_Rep = p_Leaktest_Rep;
	}
	/**
	 * @return the p_Leaktest_Gra
	 */
	public String getP_Leaktest_Gra() {
		return p_Leaktest_Gra;
	}
	/**
	 * @param p_Leaktest_Gra the p_Leaktest_Gra to set
	 */
	public void setP_Leaktest_Gra(String p_Leaktest_Gra) {
		this.p_Leaktest_Gra = p_Leaktest_Gra;
	}
	/**
	 * @return the p_NDEtest_Rep
	 */
	public String getP_NDEtest_Rep() {
		return p_NDEtest_Rep;
	}
	/**
	 * @param p_NDEtest_Rep the p_NDEtest_Rep to set
	 */
	public void setP_NDEtest_Rep(String p_NDEtest_Rep) {
		this.p_NDEtest_Rep = p_NDEtest_Rep;
	}
	/**
	 * @return the p_NDEtest_Gra
	 */
	public String getP_NDEtest_Gra() {
		return p_NDEtest_Gra;
	}
	/**
	 * @param p_NDEtest_Gra the p_NDEtest_Gra to set
	 */
	public void setP_NDEtest_Gra(String p_NDEtest_Gra) {
		this.p_NDEtest_Gra = p_NDEtest_Gra;
	}
	/**
	 * @return the p_Mettest_Rep
	 */
	public String getP_Mettest_Rep() {
		return p_Mettest_Rep;
	}
	/**
	 * @param p_Mettest_Rep the p_Mettest_Rep to set
	 */
	public void setP_Mettest_Rep(String p_Mettest_Rep) {
		this.p_Mettest_Rep = p_Mettest_Rep;
	}
	/**
	 * @return the p_Mettest_Gra
	 */
	public String getP_Mettest_Gra() {
		return p_Mettest_Gra;
	}
	/**
	 * @param p_Mettest_Gra the p_Mettest_Gra to set
	 */
	public void setP_Mettest_Gra(String p_Mettest_Gra) {
		this.p_Mettest_Gra = p_Mettest_Gra;
	}
	/**
	 * @return the p_Ma_Ana_Rep
	 */
	public String getP_Ma_Ana_Rep() {
		return p_Ma_Ana_Rep;
	}
	/**
	 * @param p_Ma_Ana_Rep the p_Ma_Ana_Rep to set
	 */
	public void setP_Ma_Ana_Rep(String p_Ma_Ana_Rep) {
		this.p_Ma_Ana_Rep = p_Ma_Ana_Rep;
	}
	/**
	 * @return the p_Ma_Ana_Gra
	 */
	public String getP_Ma_Ana_Gra() {
		return p_Ma_Ana_Gra;
	}
	/**
	 * @param p_Ma_Ana_Gra the p_Ma_Ana_Gra to set
	 */
	public void setP_Ma_Ana_Gra(String p_Ma_Ana_Gra) {
		this.p_Ma_Ana_Gra = p_Ma_Ana_Gra;
	}
	/**
	 * @return the p_Hardtest_Rep
	 */
	public String getP_Hardtest_Rep() {
		return p_Hardtest_Rep;
	}
	/**
	 * @param p_Hardtest_Rep the p_Hardtest_Rep to set
	 */
	public void setP_Hardtest_Rep(String p_Hardtest_Rep) {
		this.p_Hardtest_Rep = p_Hardtest_Rep;
	}
	/**
	 * @return the p_Hardtest_Gra
	 */
	public String getP_Hardtest_Gra() {
		return p_Hardtest_Gra;
	}
	/**
	 * @param p_Hardtest_Gra the p_Hardtest_Gra to set
	 */
	public void setP_Hardtest_Gra(String p_Hardtest_Gra) {
		this.p_Hardtest_Gra = p_Hardtest_Gra;
	}
	/**
	 * @return the p_Safe_Ass_Gra
	 */
	public String getP_Safe_Ass_Gra() {
		return p_Safe_Ass_Gra;
	}
	/**
	 * @param p_Safe_Ass_Gra the p_Safe_Ass_Gra to set
	 */
	public void setP_Safe_Ass_Gra(String p_Safe_Ass_Gra) {
		this.p_Safe_Ass_Gra = p_Safe_Ass_Gra;
	}
	/**
	 * @return the p_Ass_Remark
	 */
	public String getP_Ass_Remark() {
		return p_Ass_Remark;
	}
	/**
	 * @param p_Ass_Remark the p_Ass_Remark to set
	 */
	public void setP_Ass_Remark(String p_Ass_Remark) {
		this.p_Ass_Remark = p_Ass_Remark;
	}

	
	
}
