package cn.ecust.ssei.domain.vessel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssei_vesselMonthlyInspection")
public class VesselMonthlyInspection {
	
	private long id;
	private String v_Date;
	private String v_Problem;
	private String v_Persion;	private VesselBasic vesselBasic; 
	private String v_Result_1;
	private String v_Result_Remark_1;
	private String v_Result_2;
	private String v_Result_Remark_2;
	private String v_Result_3;
	private String v_Result_Remark_3;
	private String v_Result_4;
	private String v_Result_Remark_4;
	private String v_Result_5;
	private String v_Result_Remark_5;
	private String v_Result_6;
	private String v_Result_Remark_6;
	private String v_Result_7;
	private String v_Result_Remark_7;
	private String v_Result_8;
	private String v_Result_Remark_8;
	private String v_Result_9;
	private String v_Result_Remark_9;
	private String v_Result_10;
	private String v_Result_Remark_10;
	private String v_Result_11;
	private String v_Result_Remark_11;
	private String v_Result_12;
	private String v_Result_Remark_12;
	private String v_Result_13;
	private String v_Result_Remark_13;
	private String v_Result_14;
	private String v_Result_Remark_14;
	private String v_Result_15;
	private String v_Result_Remark_15;
	private String v_Result_16;
	private String v_Result_Remark_16;
	private String v_Result_17;
	private String v_Result_Remark_17;
	private String v_Result_18;
	private String v_Result_Remark_18;
	private String v_Result_19;
	private String v_Result_Remark_19;
	private String v_Result_20;
	private String v_Result_Remark_20;
	private String v_Result_21;
	private String v_Result_Remark_21;
	private String v_Result_22;
	private String v_Result_Remark_22;
	private String v_Result_23;
	private String v_Result_Remark_23;
	private String v_Result_24;
	private String v_Result_Remark_24;
	private String v_Result_25;
	private String v_Result_Remark_25;
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
	 * @return the vesselBasic
	 */
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="vesselId")
	public VesselBasic getVesselBasic() {
		return vesselBasic;
	}
	/**
	 * @param vesselBasic the vesselBasic to set
	 */
	public void setVesselBasic(VesselBasic vesselBasic) {
		this.vesselBasic = vesselBasic;
	}
	
	/**
	 * @return the v_Date
	 */
	public String getV_Date() {
		return v_Date;
	}
	/**
	 * @param v_Date the v_Date to set
	 */
	public void setV_Date(String v_Date) {
		this.v_Date = v_Date;
	}
	
	
	/**
	 * @return the v_Persion
	 */
	public String getV_Persion() {
		return v_Persion;
	}
	/**
	 * @param v_Persion the v_Persion to set
	 */
	public void setV_Persion(String v_Persion) {
		this.v_Persion = v_Persion;
	}
	/**
	 * @return the v_Problem
	 */
	public String getV_Problem() {
		return v_Problem;
	}
	/**
	 * @param v_Problem the v_Problem to set
	 */
	public void setV_Problem(String v_Problem) {
		this.v_Problem = v_Problem;
	}
	/**
	 * @return the v_Result_1
	 */
	public String getV_Result_1() {
		return v_Result_1;
	}
	/**
	 * @param v_Result_1 the v_Result_1 to set
	 */
	public void setV_Result_1(String v_Result_1) {
		this.v_Result_1 = v_Result_1;
	}
	/**
	 * @return the v_Result_Remark_1
	 */
	public String getV_Result_Remark_1() {
		return v_Result_Remark_1;
	}
	/**
	 * @param v_Result_Remark_1 the v_Result_Remark_1 to set
	 */
	public void setV_Result_Remark_1(String v_Result_Remark_1) {
		this.v_Result_Remark_1 = v_Result_Remark_1;
	}
	/**
	 * @return the v_Result_2
	 */
	public String getV_Result_2() {
		return v_Result_2;
	}
	/**
	 * @param v_Result_2 the v_Result_2 to set
	 */
	public void setV_Result_2(String v_Result_2) {
		this.v_Result_2 = v_Result_2;
	}
	/**
	 * @return the v_Result_Remark_2
	 */
	public String getV_Result_Remark_2() {
		return v_Result_Remark_2;
	}
	/**
	 * @param v_Result_Remark_2 the v_Result_Remark_2 to set
	 */
	public void setV_Result_Remark_2(String v_Result_Remark_2) {
		this.v_Result_Remark_2 = v_Result_Remark_2;
	}
	/**
	 * @return the v_Result_3
	 */
	public String getV_Result_3() {
		return v_Result_3;
	}
	/**
	 * @param v_Result_3 the v_Result_3 to set
	 */
	public void setV_Result_3(String v_Result_3) {
		this.v_Result_3 = v_Result_3;
	}
	/**
	 * @return the v_Result_Remark_3
	 */
	public String getV_Result_Remark_3() {
		return v_Result_Remark_3;
	}
	/**
	 * @param v_Result_Remark_3 the v_Result_Remark_3 to set
	 */
	public void setV_Result_Remark_3(String v_Result_Remark_3) {
		this.v_Result_Remark_3 = v_Result_Remark_3;
	}
	/**
	 * @return the v_Result_4
	 */
	public String getV_Result_4() {
		return v_Result_4;
	}
	/**
	 * @param v_Result_4 the v_Result_4 to set
	 */
	public void setV_Result_4(String v_Result_4) {
		this.v_Result_4 = v_Result_4;
	}
	/**
	 * @return the v_Result_Remark_4
	 */
	public String getV_Result_Remark_4() {
		return v_Result_Remark_4;
	}
	/**
	 * @param v_Result_Remark_4 the v_Result_Remark_4 to set
	 */
	public void setV_Result_Remark_4(String v_Result_Remark_4) {
		this.v_Result_Remark_4 = v_Result_Remark_4;
	}
	/**
	 * @return the v_Result_5
	 */
	public String getV_Result_5() {
		return v_Result_5;
	}
	/**
	 * @param v_Result_5 the v_Result_5 to set
	 */
	public void setV_Result_5(String v_Result_5) {
		this.v_Result_5 = v_Result_5;
	}
	/**
	 * @return the v_Result_Remark_5
	 */
	public String getV_Result_Remark_5() {
		return v_Result_Remark_5;
	}
	/**
	 * @param v_Result_Remark_5 the v_Result_Remark_5 to set
	 */
	public void setV_Result_Remark_5(String v_Result_Remark_5) {
		this.v_Result_Remark_5 = v_Result_Remark_5;
	}
	/**
	 * @return the v_Result_6
	 */
	public String getV_Result_6() {
		return v_Result_6;
	}
	/**
	 * @param v_Result_6 the v_Result_6 to set
	 */
	public void setV_Result_6(String v_Result_6) {
		this.v_Result_6 = v_Result_6;
	}
	/**
	 * @return the v_Result_Remark_6
	 */
	public String getV_Result_Remark_6() {
		return v_Result_Remark_6;
	}
	/**
	 * @param v_Result_Remark_6 the v_Result_Remark_6 to set
	 */
	public void setV_Result_Remark_6(String v_Result_Remark_6) {
		this.v_Result_Remark_6 = v_Result_Remark_6;
	}
	/**
	 * @return the v_Result_7
	 */
	public String getV_Result_7() {
		return v_Result_7;
	}
	/**
	 * @param v_Result_7 the v_Result_7 to set
	 */
	public void setV_Result_7(String v_Result_7) {
		this.v_Result_7 = v_Result_7;
	}
	/**
	 * @return the v_Result_Remark_7
	 */
	public String getV_Result_Remark_7() {
		return v_Result_Remark_7;
	}
	/**
	 * @param v_Result_Remark_7 the v_Result_Remark_7 to set
	 */
	public void setV_Result_Remark_7(String v_Result_Remark_7) {
		this.v_Result_Remark_7 = v_Result_Remark_7;
	}
	/**
	 * @return the v_Result_8
	 */
	public String getV_Result_8() {
		return v_Result_8;
	}
	/**
	 * @param v_Result_8 the v_Result_8 to set
	 */
	public void setV_Result_8(String v_Result_8) {
		this.v_Result_8 = v_Result_8;
	}
	/**
	 * @return the v_Result_Remark_8
	 */
	public String getV_Result_Remark_8() {
		return v_Result_Remark_8;
	}
	/**
	 * @param v_Result_Remark_8 the v_Result_Remark_8 to set
	 */
	public void setV_Result_Remark_8(String v_Result_Remark_8) {
		this.v_Result_Remark_8 = v_Result_Remark_8;
	}
	/**
	 * @return the v_Result_9
	 */
	public String getV_Result_9() {
		return v_Result_9;
	}
	/**
	 * @param v_Result_9 the v_Result_9 to set
	 */
	public void setV_Result_9(String v_Result_9) {
		this.v_Result_9 = v_Result_9;
	}
	/**
	 * @return the v_Result_Remark_9
	 */
	public String getV_Result_Remark_9() {
		return v_Result_Remark_9;
	}
	/**
	 * @param v_Result_Remark_9 the v_Result_Remark_9 to set
	 */
	public void setV_Result_Remark_9(String v_Result_Remark_9) {
		this.v_Result_Remark_9 = v_Result_Remark_9;
	}
	/**
	 * @return the v_Result_10
	 */
	public String getV_Result_10() {
		return v_Result_10;
	}
	/**
	 * @param v_Result_10 the v_Result_10 to set
	 */
	public void setV_Result_10(String v_Result_10) {
		this.v_Result_10 = v_Result_10;
	}
	/**
	 * @return the v_Result_Remark_10
	 */
	public String getV_Result_Remark_10() {
		return v_Result_Remark_10;
	}
	/**
	 * @param v_Result_Remark_10 the v_Result_Remark_10 to set
	 */
	public void setV_Result_Remark_10(String v_Result_Remark_10) {
		this.v_Result_Remark_10 = v_Result_Remark_10;
	}
	/**
	 * @return the v_Result_11
	 */
	public String getV_Result_11() {
		return v_Result_11;
	}
	/**
	 * @param v_Result_11 the v_Result_11 to set
	 */
	public void setV_Result_11(String v_Result_11) {
		this.v_Result_11 = v_Result_11;
	}
	/**
	 * @return the v_Result_Remark_11
	 */
	public String getV_Result_Remark_11() {
		return v_Result_Remark_11;
	}
	/**
	 * @param v_Result_Remark_11 the v_Result_Remark_11 to set
	 */
	public void setV_Result_Remark_11(String v_Result_Remark_11) {
		this.v_Result_Remark_11 = v_Result_Remark_11;
	}
	/**
	 * @return the v_Result_12
	 */
	public String getV_Result_12() {
		return v_Result_12;
	}
	/**
	 * @param v_Result_12 the v_Result_12 to set
	 */
	public void setV_Result_12(String v_Result_12) {
		this.v_Result_12 = v_Result_12;
	}
	/**
	 * @return the v_Result_Remark_12
	 */
	public String getV_Result_Remark_12() {
		return v_Result_Remark_12;
	}
	/**
	 * @param v_Result_Remark_12 the v_Result_Remark_12 to set
	 */
	public void setV_Result_Remark_12(String v_Result_Remark_12) {
		this.v_Result_Remark_12 = v_Result_Remark_12;
	}
	/**
	 * @return the v_Result_13
	 */
	public String getV_Result_13() {
		return v_Result_13;
	}
	/**
	 * @param v_Result_13 the v_Result_13 to set
	 */
	public void setV_Result_13(String v_Result_13) {
		this.v_Result_13 = v_Result_13;
	}
	/**
	 * @return the v_Result_Remark_13
	 */
	public String getV_Result_Remark_13() {
		return v_Result_Remark_13;
	}
	/**
	 * @param v_Result_Remark_13 the v_Result_Remark_13 to set
	 */
	public void setV_Result_Remark_13(String v_Result_Remark_13) {
		this.v_Result_Remark_13 = v_Result_Remark_13;
	}
	/**
	 * @return the v_Result_14
	 */
	public String getV_Result_14() {
		return v_Result_14;
	}
	/**
	 * @param v_Result_14 the v_Result_14 to set
	 */
	public void setV_Result_14(String v_Result_14) {
		this.v_Result_14 = v_Result_14;
	}
	/**
	 * @return the v_Result_Remark_14
	 */
	public String getV_Result_Remark_14() {
		return v_Result_Remark_14;
	}
	/**
	 * @param v_Result_Remark_14 the v_Result_Remark_14 to set
	 */
	public void setV_Result_Remark_14(String v_Result_Remark_14) {
		this.v_Result_Remark_14 = v_Result_Remark_14;
	}
	/**
	 * @return the v_Result_15
	 */
	public String getV_Result_15() {
		return v_Result_15;
	}
	/**
	 * @param v_Result_15 the v_Result_15 to set
	 */
	public void setV_Result_15(String v_Result_15) {
		this.v_Result_15 = v_Result_15;
	}
	/**
	 * @return the v_Result_Remark_15
	 */
	public String getV_Result_Remark_15() {
		return v_Result_Remark_15;
	}
	/**
	 * @param v_Result_Remark_15 the v_Result_Remark_15 to set
	 */
	public void setV_Result_Remark_15(String v_Result_Remark_15) {
		this.v_Result_Remark_15 = v_Result_Remark_15;
	}
	/**
	 * @return the v_Result_16
	 */
	public String getV_Result_16() {
		return v_Result_16;
	}
	/**
	 * @param v_Result_16 the v_Result_16 to set
	 */
	public void setV_Result_16(String v_Result_16) {
		this.v_Result_16 = v_Result_16;
	}
	/**
	 * @return the v_Result_Remark_16
	 */
	public String getV_Result_Remark_16() {
		return v_Result_Remark_16;
	}
	/**
	 * @param v_Result_Remark_16 the v_Result_Remark_16 to set
	 */
	public void setV_Result_Remark_16(String v_Result_Remark_16) {
		this.v_Result_Remark_16 = v_Result_Remark_16;
	}
	/**
	 * @return the v_Result_17
	 */
	public String getV_Result_17() {
		return v_Result_17;
	}
	/**
	 * @param v_Result_17 the v_Result_17 to set
	 */
	public void setV_Result_17(String v_Result_17) {
		this.v_Result_17 = v_Result_17;
	}
	/**
	 * @return the v_Result_Remark_17
	 */
	public String getV_Result_Remark_17() {
		return v_Result_Remark_17;
	}
	/**
	 * @param v_Result_Remark_17 the v_Result_Remark_17 to set
	 */
	public void setV_Result_Remark_17(String v_Result_Remark_17) {
		this.v_Result_Remark_17 = v_Result_Remark_17;
	}
	/**
	 * @return the v_Result_18
	 */
	public String getV_Result_18() {
		return v_Result_18;
	}
	/**
	 * @param v_Result_18 the v_Result_18 to set
	 */
	public void setV_Result_18(String v_Result_18) {
		this.v_Result_18 = v_Result_18;
	}
	/**
	 * @return the v_Result_Remark_18
	 */
	public String getV_Result_Remark_18() {
		return v_Result_Remark_18;
	}
	/**
	 * @param v_Result_Remark_18 the v_Result_Remark_18 to set
	 */
	public void setV_Result_Remark_18(String v_Result_Remark_18) {
		this.v_Result_Remark_18 = v_Result_Remark_18;
	}
	/**
	 * @return the v_Result_19
	 */
	public String getV_Result_19() {
		return v_Result_19;
	}
	/**
	 * @param v_Result_19 the v_Result_19 to set
	 */
	public void setV_Result_19(String v_Result_19) {
		this.v_Result_19 = v_Result_19;
	}
	/**
	 * @return the v_Result_Remark_19
	 */
	public String getV_Result_Remark_19() {
		return v_Result_Remark_19;
	}
	/**
	 * @param v_Result_Remark_19 the v_Result_Remark_19 to set
	 */
	public void setV_Result_Remark_19(String v_Result_Remark_19) {
		this.v_Result_Remark_19 = v_Result_Remark_19;
	}
	/**
	 * @return the v_Result_20
	 */
	public String getV_Result_20() {
		return v_Result_20;
	}
	/**
	 * @param v_Result_20 the v_Result_20 to set
	 */
	public void setV_Result_20(String v_Result_20) {
		this.v_Result_20 = v_Result_20;
	}
	/**
	 * @return the v_Result_Remark_20
	 */
	public String getV_Result_Remark_20() {
		return v_Result_Remark_20;
	}
	/**
	 * @param v_Result_Remark_20 the v_Result_Remark_20 to set
	 */
	public void setV_Result_Remark_20(String v_Result_Remark_20) {
		this.v_Result_Remark_20 = v_Result_Remark_20;
	}
	/**
	 * @return the v_Result_21
	 */
	public String getV_Result_21() {
		return v_Result_21;
	}
	/**
	 * @param v_Result_21 the v_Result_21 to set
	 */
	public void setV_Result_21(String v_Result_21) {
		this.v_Result_21 = v_Result_21;
	}
	/**
	 * @return the v_Result_Remark_21
	 */
	public String getV_Result_Remark_21() {
		return v_Result_Remark_21;
	}
	/**
	 * @param v_Result_Remark_21 the v_Result_Remark_21 to set
	 */
	public void setV_Result_Remark_21(String v_Result_Remark_21) {
		this.v_Result_Remark_21 = v_Result_Remark_21;
	}
	/**
	 * @return the v_Result_22
	 */
	public String getV_Result_22() {
		return v_Result_22;
	}
	/**
	 * @param v_Result_22 the v_Result_22 to set
	 */
	public void setV_Result_22(String v_Result_22) {
		this.v_Result_22 = v_Result_22;
	}
	/**
	 * @return the v_Result_Remark_22
	 */
	public String getV_Result_Remark_22() {
		return v_Result_Remark_22;
	}
	/**
	 * @param v_Result_Remark_22 the v_Result_Remark_22 to set
	 */
	public void setV_Result_Remark_22(String v_Result_Remark_22) {
		this.v_Result_Remark_22 = v_Result_Remark_22;
	}
	/**
	 * @return the v_Result_23
	 */
	public String getV_Result_23() {
		return v_Result_23;
	}
	/**
	 * @param v_Result_23 the v_Result_23 to set
	 */
	public void setV_Result_23(String v_Result_23) {
		this.v_Result_23 = v_Result_23;
	}
	/**
	 * @return the v_Result_Remark_23
	 */
	public String getV_Result_Remark_23() {
		return v_Result_Remark_23;
	}
	/**
	 * @param v_Result_Remark_23 the v_Result_Remark_23 to set
	 */
	public void setV_Result_Remark_23(String v_Result_Remark_23) {
		this.v_Result_Remark_23 = v_Result_Remark_23;
	}
	/**
	 * @return the v_Result_24
	 */
	public String getV_Result_24() {
		return v_Result_24;
	}
	/**
	 * @param v_Result_24 the v_Result_24 to set
	 */
	public void setV_Result_24(String v_Result_24) {
		this.v_Result_24 = v_Result_24;
	}
	/**
	 * @return the v_Result_Remark_24
	 */
	public String getV_Result_Remark_24() {
		return v_Result_Remark_24;
	}
	/**
	 * @param v_Result_Remark_24 the v_Result_Remark_24 to set
	 */
	public void setV_Result_Remark_24(String v_Result_Remark_24) {
		this.v_Result_Remark_24 = v_Result_Remark_24;
	}
	/**
	 * @return the v_Result_25
	 */
	public String getV_Result_25() {
		return v_Result_25;
	}
	/**
	 * @param v_Result_25 the v_Result_25 to set
	 */
	public void setV_Result_25(String v_Result_25) {
		this.v_Result_25 = v_Result_25;
	}
	/**
	 * @return the v_Result_Remark_25
	 */
	public String getV_Result_Remark_25() {
		return v_Result_Remark_25;
	}
	/**
	 * @param v_Result_Remark_25 the v_Result_Remark_25 to set
	 */
	public void setV_Result_Remark_25(String v_Result_Remark_25) {
		this.v_Result_Remark_25 = v_Result_Remark_25;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VesselMonthlyInspection [id=" + id + ", vesselBasic="
				+ vesselBasic + ", v_Result_1=" + v_Result_1
				+ ", v_Result_Remark_1=" + v_Result_Remark_1 + ", v_Result_2="
				+ v_Result_2 + ", v_Result_Remark_2=" + v_Result_Remark_2
				+ ", v_Result_3=" + v_Result_3 + ", v_Result_Remark_3="
				+ v_Result_Remark_3 + ", v_Result_4=" + v_Result_4
				+ ", v_Result_Remark_4=" + v_Result_Remark_4 + ", v_Result_5="
				+ v_Result_5 + ", v_Result_Remark_5=" + v_Result_Remark_5
				+ ", v_Result_6=" + v_Result_6 + ", v_Result_Remark_6="
				+ v_Result_Remark_6 + ", v_Result_7=" + v_Result_7
				+ ", v_Result_Remark_7=" + v_Result_Remark_7 + ", v_Result_8="
				+ v_Result_8 + ", v_Result_Remark_8=" + v_Result_Remark_8
				+ ", v_Result_9=" + v_Result_9 + ", v_Result_Remark_9="
				+ v_Result_Remark_9 + ", v_Result_10=" + v_Result_10
				+ ", v_Result_Remark_10=" + v_Result_Remark_10
				+ ", v_Result_11=" + v_Result_11 + ", v_Result_Remark_11="
				+ v_Result_Remark_11 + ", v_Result_12=" + v_Result_12
				+ ", v_Result_Remark_12=" + v_Result_Remark_12
				+ ", v_Result_13=" + v_Result_13 + ", v_Result_Remark_13="
				+ v_Result_Remark_13 + ", v_Result_14=" + v_Result_14
				+ ", v_Result_Remark_14=" + v_Result_Remark_14
				+ ", v_Result_15=" + v_Result_15 + ", v_Result_Remark_15="
				+ v_Result_Remark_15 + ", v_Result_16=" + v_Result_16
				+ ", v_Result_Remark_16=" + v_Result_Remark_16
				+ ", v_Result_17=" + v_Result_17 + ", v_Result_Remark_17="
				+ v_Result_Remark_17 + ", v_Result_18=" + v_Result_18
				+ ", v_Result_Remark_18=" + v_Result_Remark_18
				+ ", v_Result_19=" + v_Result_19 + ", v_Result_Remark_19="
				+ v_Result_Remark_19 + ", v_Result_20=" + v_Result_20
				+ ", v_Result_Remark_20=" + v_Result_Remark_20
				+ ", v_Result_21=" + v_Result_21 + ", v_Result_Remark_21="
				+ v_Result_Remark_21 + ", v_Result_22=" + v_Result_22
				+ ", v_Result_Remark_22=" + v_Result_Remark_22
				+ ", v_Result_23=" + v_Result_23 + ", v_Result_Remark_23="
				+ v_Result_Remark_23 + ", v_Result_24=" + v_Result_24
				+ ", v_Result_Remark_24=" + v_Result_Remark_24
				+ ", v_Result_25=" + v_Result_25 + ", v_Result_Remark_25="
				+ v_Result_Remark_25 + "]";
	}
	
	
	
}
