package cn.ecust.ssei.domain.vo;


public class PipeBasicVo {
	private String company;//公司，外键
	private String p_ID;//管道的编号
	private String p_Name;//管道名称
	private String p_Equ_Name;//装置名称
	private String p_Sys;//管道系统
	private String p_Gra;//管道级别
	private String p_Len;//管道长度
	private String p_De_Com;//设计单位
	private String p_De_Date;//设计日期
	private String p_De_Norm;//设计规范
	private String p_Ins_Com;//安装单位
	private String p_Ins_Norm;//安装与验收规范
	private String p_Start_Pos;//起始位置
	private String p_End_Pos;//终止位置
	private String p_Che_Bef_Date;//验收日期
	private String p_Use_Date;//投用日期
	private String p_Act_Use_Date;//实际使用时间
	private String p_Lay;//敷设方式
	private String p_De_Pre;//设计压力
	private String p_Wo_Pre;//工作压力
	private String p_De_Tem;//设计温度 
	private String p_Wo_Tem;//工作温度
	private String p_Ma_Gra;//管子材料牌号
	private String p_Wo_Med;//工作介质
	private String p_Out_Rad;//管道规格外径
	private String p_Thi;//管道规格壁厚
	private String p_Ins_Ma;//绝热层材料
	private String p_Ins_Thi;//绝热层厚度
	private String p_Pro_Mar;//腐蚀裕量
	private String p_Pro_Ma;//	防腐层材料
	private String p_submited;//1:没有提交 2：提交     设计单位提交后无法修改，无法查看
	private String p_checkType;//1：管道为单位。2：管道系统为单位
	private String nextDetailMaintainDate;//下次全面检验时间
	private String nextOnlineMaintainDate;//下次在线检验时间
	

	private String p_Reg_Code; //注册代码
	private String p_Max_Pre; //最高工作压力
	private String p_Max_Tem; //最高工作温度
	private String p_Sec_Rank; //安全状况等级
	private String p_Pro_Num; //工艺图号
	private String p_Sign; //管道标识
	private String p_Butt_Joint; //对接焊口数量
	private String p_Corner_Joint;  //角接焊口数量
	private String p_Total_Joint; //总焊口数量
	private String p_T_Cock; //三通数量
	private String p_Elbow; //弯头数量
	private String p_Reducer; //变径管数量
	private String p_Axial_View; //轴侧图数
	private String p_Install_Date; //安装年月
	private String p_Comment; //备注
	private String p_Speci; //管道规格
	private String p_Cer_Num; //使用证号

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the p_ID
	 */
	public String getP_ID() {
		return p_ID;
	}
	/**
	 * @param p_ID the p_ID to set
	 */
	public void setP_ID(String p_ID) {
		this.p_ID = p_ID;
	}
	/**
	 * @return the p_Name
	 */
	public String getP_Name() {
		return p_Name;
	}
	/**
	 * @param p_Name the p_Name to set
	 */
	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}
	/**
	 * @return the p_Equ_Name
	 */
	public String getP_Equ_Name() {
		return p_Equ_Name;
	}
	/**
	 * @param p_Equ_Name the p_Equ_Name to set
	 */
	public void setP_Equ_Name(String p_Equ_Name) {
		this.p_Equ_Name = p_Equ_Name;
	}
	/**
	 * @return the p_Sys
	 */
	public String getP_Sys() {
		return p_Sys;
	}
	/**
	 * @param p_Sys the p_Sys to set
	 */
	public void setP_Sys(String p_Sys) {
		this.p_Sys = p_Sys;
	}
	/**
	 * @return the p_Gra
	 */
	public String getP_Gra() {
		return p_Gra;
	}
	/**
	 * @param p_Gra the p_Gra to set
	 */
	public void setP_Gra(String p_Gra) {
		this.p_Gra = p_Gra;
	}
	/**
	 * @return the p_Len
	 */
	public String getP_Len() {
		return p_Len;
	}
	/**
	 * @param p_Len the p_Len to set
	 */
	public void setP_Len(String p_Len) {
		this.p_Len = p_Len;
	}
	/**
	 * @return the p_De_Com
	 */
	public String getP_De_Com() {
		return p_De_Com;
	}
	/**
	 * @param p_De_Com the p_De_Com to set
	 */
	public void setP_De_Com(String p_De_Com) {
		this.p_De_Com = p_De_Com;
	}
	/**
	 * @return the p_De_Date
	 */
	public String getP_De_Date() {
		return p_De_Date;
	}
	/**
	 * @param p_De_Date the p_De_Date to set
	 */
	public void setP_De_Date(String p_De_Date) {
		this.p_De_Date = p_De_Date;
	}
	/**
	 * @return the p_De_Norm
	 */
	public String getP_De_Norm() {
		return p_De_Norm;
	}
	/**
	 * @param p_De_Norm the p_De_Norm to set
	 */
	public void setP_De_Norm(String p_De_Norm) {
		this.p_De_Norm = p_De_Norm;
	}
	/**
	 * @return the p_Ins_Com
	 */
	public String getP_Ins_Com() {
		return p_Ins_Com;
	}
	/**
	 * @param p_Ins_Com the p_Ins_Com to set
	 */
	public void setP_Ins_Com(String p_Ins_Com) {
		this.p_Ins_Com = p_Ins_Com;
	}
	/**
	 * @return the p_Ins_Norm
	 */
	public String getP_Ins_Norm() {
		return p_Ins_Norm;
	}
	/**
	 * @param p_Ins_Norm the p_Ins_Norm to set
	 */
	public void setP_Ins_Norm(String p_Ins_Norm) {
		this.p_Ins_Norm = p_Ins_Norm;
	}
	/**
	 * @return the p_Start_Pos
	 */
	public String getP_Start_Pos() {
		return p_Start_Pos;
	}
	/**
	 * @param p_Start_Pos the p_Start_Pos to set
	 */
	public void setP_Start_Pos(String p_Start_Pos) {
		this.p_Start_Pos = p_Start_Pos;
	}
	/**
	 * @return the p_End_Pos
	 */
	public String getP_End_Pos() {
		return p_End_Pos;
	}
	/**
	 * @param p_End_Pos the p_End_Pos to set
	 */
	public void setP_End_Pos(String p_End_Pos) {
		this.p_End_Pos = p_End_Pos;
	}
	/**
	 * @return the p_Che_Bef_Date
	 */
	public String getP_Che_Bef_Date() {
		return p_Che_Bef_Date;
	}
	/**
	 * @param p_Che_Bef_Date the p_Che_Bef_Date to set
	 */
	public void setP_Che_Bef_Date(String p_Che_Bef_Date) {
		this.p_Che_Bef_Date = p_Che_Bef_Date;
	}
	/**
	 * @return the p_Use_Date
	 */
	public String getP_Use_Date() {
		return p_Use_Date;
	}
	/**
	 * @param p_Use_Date the p_Use_Date to set
	 */
	public void setP_Use_Date(String p_Use_Date) {
		this.p_Use_Date = p_Use_Date;
	}
	/**
	 * @return the p_Act_Use_Date
	 */
	public String getP_Act_Use_Date() {
		return p_Act_Use_Date;
	}
	/**
	 * @param p_Act_Use_Date the p_Act_Use_Date to set
	 */
	public void setP_Act_Use_Date(String p_Act_Use_Date) {
		this.p_Act_Use_Date = p_Act_Use_Date;
	}
	/**
	 * @return the p_Lay
	 */
	public String getP_Lay() {
		return p_Lay;
	}
	/**
	 * @param p_Lay the p_Lay to set
	 */
	public void setP_Lay(String p_Lay) {
		this.p_Lay = p_Lay;
	}
	/**
	 * @return the p_De_Pre
	 */
	public String getP_De_Pre() {
		return p_De_Pre;
	}
	/**
	 * @param p_De_Pre the p_De_Pre to set
	 */
	public void setP_De_Pre(String p_De_Pre) {
		this.p_De_Pre = p_De_Pre;
	}
	/**
	 * @return the p_Wo_Pre
	 */
	public String getP_Wo_Pre() {
		return p_Wo_Pre;
	}
	/**
	 * @param p_Wo_Pre the p_Wo_Pre to set
	 */
	public void setP_Wo_Pre(String p_Wo_Pre) {
		this.p_Wo_Pre = p_Wo_Pre;
	}
	/**
	 * @return the p_De_Tem
	 */
	public String getP_De_Tem() {
		return p_De_Tem;
	}
	/**
	 * @param p_De_Tem the p_De_Tem to set
	 */
	public void setP_De_Tem(String p_De_Tem) {
		this.p_De_Tem = p_De_Tem;
	}
	/**
	 * @return the p_Wo_Tem
	 */
	public String getP_Wo_Tem() {
		return p_Wo_Tem;
	}
	/**
	 * @param p_Wo_Tem the p_Wo_Tem to set
	 */
	public void setP_Wo_Tem(String p_Wo_Tem) {
		this.p_Wo_Tem = p_Wo_Tem;
	}
	/**
	 * @return the p_Ma_Gra
	 */
	public String getP_Ma_Gra() {
		return p_Ma_Gra;
	}
	/**
	 * @param p_Ma_Gra the p_Ma_Gra to set
	 */
	public void setP_Ma_Gra(String p_Ma_Gra) {
		this.p_Ma_Gra = p_Ma_Gra;
	}
	/**
	 * @return the p_Wo_Med
	 */
	public String getP_Wo_Med() {
		return p_Wo_Med;
	}
	/**
	 * @param p_Wo_Med the p_Wo_Med to set
	 */
	public void setP_Wo_Med(String p_Wo_Med) {
		this.p_Wo_Med = p_Wo_Med;
	}
	/**
	 * @return the p_Out_Rad
	 */
	public String getP_Out_Rad() {
		return p_Out_Rad;
	}
	/**
	 * @param p_Out_Rad the p_Out_Rad to set
	 */
	public void setP_Out_Rad(String p_Out_Rad) {
		this.p_Out_Rad = p_Out_Rad;
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
	 * @return the p_Ins_Ma
	 */
	public String getP_Ins_Ma() {
		return p_Ins_Ma;
	}
	/**
	 * @param p_Ins_Ma the p_Ins_Ma to set
	 */
	public void setP_Ins_Ma(String p_Ins_Ma) {
		this.p_Ins_Ma = p_Ins_Ma;
	}
	/**
	 * @return the p_Ins_Thi
	 */
	public String getP_Ins_Thi() {
		return p_Ins_Thi;
	}
	/**
	 * @param p_Ins_Thi the p_Ins_Thi to set
	 */
	public void setP_Ins_Thi(String p_Ins_Thi) {
		this.p_Ins_Thi = p_Ins_Thi;
	}
	/**
	 * @return the p_Pro_Mar
	 */
	public String getP_Pro_Mar() {
		return p_Pro_Mar;
	}
	/**
	 * @param p_Pro_Mar the p_Pro_Mar to set
	 */
	public void setP_Pro_Mar(String p_Pro_Mar) {
		this.p_Pro_Mar = p_Pro_Mar;
	}
	/**
	 * @return the p_Pro_Ma
	 */
	public String getP_Pro_Ma() {
		return p_Pro_Ma;
	}
	/**
	 * @param p_Pro_Ma the p_Pro_Ma to set
	 */
	public void setP_Pro_Ma(String p_Pro_Ma) {
		this.p_Pro_Ma = p_Pro_Ma;
	}
	/**
	 * @return the p_submited
	 */
	public String getP_submited() {
		return p_submited;
	}
	/**
	 * @param p_submited the p_submited to set
	 */
	public void setP_submited(String p_submited) {
		this.p_submited = p_submited;
	}
	/**
	 * @return the p_checkType
	 */
	public String getP_checkType() {
		return p_checkType;
	}
	/**
	 * @param p_checkType the p_checkType to set
	 */
	public void setP_checkType(String p_checkType) {
		this.p_checkType = p_checkType;
	}
	/**
	 * @return the nextDetailMaintainDate
	 */
	public String getNextDetailMaintainDate() {
		return nextDetailMaintainDate;
	}
	/**
	 * @param nextDetailMaintainDate the nextDetailMaintainDate to set
	 */
	public void setNextDetailMaintainDate(String nextDetailMaintainDate) {
		this.nextDetailMaintainDate = nextDetailMaintainDate;
	}
	/**
	 * @return the nextOnlineMaintainDate
	 */
	public String getNextOnlineMaintainDate() {
		return nextOnlineMaintainDate;
	}
	/**
	 * @param nextOnlineMaintainDate the nextOnlineMaintainDate to set
	 */
	public void setNextOnlineMaintainDate(String nextOnlineMaintainDate) {
		this.nextOnlineMaintainDate = nextOnlineMaintainDate;
	}
	/**
	 * @return the p_Reg_Code
	 */
	public String getP_Reg_Code() {
		return p_Reg_Code;
	}
	/**
	 * @param p_Reg_Code the p_Reg_Code to set
	 */
	public void setP_Reg_Code(String p_Reg_Code) {
		this.p_Reg_Code = p_Reg_Code;
	}
	/**
	 * @return the p_Max_Pre
	 */
	public String getP_Max_Pre() {
		return p_Max_Pre;
	}
	/**
	 * @param p_Max_Pre the p_Max_Pre to set
	 */
	public void setP_Max_Pre(String p_Max_Pre) {
		this.p_Max_Pre = p_Max_Pre;
	}
	/**
	 * @return the p_Max_Tem
	 */
	public String getP_Max_Tem() {
		return p_Max_Tem;
	}
	/**
	 * @param p_Max_Tem the p_Max_Tem to set
	 */
	public void setP_Max_Tem(String p_Max_Tem) {
		this.p_Max_Tem = p_Max_Tem;
	}
	/**
	 * @return the p_Sec_Rank
	 */
	public String getP_Sec_Rank() {
		return p_Sec_Rank;
	}
	/**
	 * @param p_Sec_Rank the p_Sec_Rank to set
	 */
	public void setP_Sec_Rank(String p_Sec_Rank) {
		this.p_Sec_Rank = p_Sec_Rank;
	}
	/**
	 * @return the p_Pro_Num
	 */
	public String getP_Pro_Num() {
		return p_Pro_Num;
	}
	/**
	 * @param p_Pro_Num the p_Pro_Num to set
	 */
	public void setP_Pro_Num(String p_Pro_Num) {
		this.p_Pro_Num = p_Pro_Num;
	}
	/**
	 * @return the p_Sign
	 */
	public String getP_Sign() {
		return p_Sign;
	}
	/**
	 * @param p_Sign the p_Sign to set
	 */
	public void setP_Sign(String p_Sign) {
		this.p_Sign = p_Sign;
	}
	/**
	 * @return the p_Butt_Joint
	 */
	public String getP_Butt_Joint() {
		return p_Butt_Joint;
	}
	/**
	 * @param p_Butt_Joint the p_Butt_Joint to set
	 */
	public void setP_Butt_Joint(String p_Butt_Joint) {
		this.p_Butt_Joint = p_Butt_Joint;
	}
	/**
	 * @return the p_Corner_Joint
	 */
	public String getP_Corner_Joint() {
		return p_Corner_Joint;
	}
	/**
	 * @param p_Corner_Joint the p_Corner_Joint to set
	 */
	public void setP_Corner_Joint(String p_Corner_Joint) {
		this.p_Corner_Joint = p_Corner_Joint;
	}
	/**
	 * @return the p_Total_Joint
	 */
	public String getP_Total_Joint() {
		return p_Total_Joint;
	}
	/**
	 * @param p_Total_Joint the p_Total_Joint to set
	 */
	public void setP_Total_Joint(String p_Total_Joint) {
		this.p_Total_Joint = p_Total_Joint;
	}
	/**
	 * @return the p_T_Cock
	 */
	public String getP_T_Cock() {
		return p_T_Cock;
	}
	/**
	 * @param p_T_Cock the p_T_Cock to set
	 */
	public void setP_T_Cock(String p_T_Cock) {
		this.p_T_Cock = p_T_Cock;
	}
	/**
	 * @return the p_Elbow
	 */
	public String getP_Elbow() {
		return p_Elbow;
	}
	/**
	 * @param p_Elbow the p_Elbow to set
	 */
	public void setP_Elbow(String p_Elbow) {
		this.p_Elbow = p_Elbow;
	}
	/**
	 * @return the p_Reducer
	 */
	public String getP_Reducer() {
		return p_Reducer;
	}
	/**
	 * @param p_Reducer the p_Reducer to set
	 */
	public void setP_Reducer(String p_Reducer) {
		this.p_Reducer = p_Reducer;
	}
	/**
	 * @return the p_Axial_View
	 */
	public String getP_Axial_View() {
		return p_Axial_View;
	}
	/**
	 * @param p_Axial_View the p_Axial_View to set
	 */
	public void setP_Axial_View(String p_Axial_View) {
		this.p_Axial_View = p_Axial_View;
	}
	/**
	 * @return the p_Install_Date
	 */
	public String getP_Install_Date() {
		return p_Install_Date;
	}
	/**
	 * @param p_Install_Date the p_Install_Date to set
	 */
	public void setP_Install_Date(String p_Install_Date) {
		this.p_Install_Date = p_Install_Date;
	}
	/**
	 * @return the p_Comment
	 */
	public String getP_Comment() {
		return p_Comment;
	}
	/**
	 * @param p_Comment the p_Comment to set
	 */
	public void setP_Comment(String p_Comment) {
		this.p_Comment = p_Comment;
	}
	/**
	 * @return the p_Speci
	 */
	public String getP_Speci() {
		return p_Speci;
	}
	/**
	 * @param p_Speci the p_Speci to set
	 */
	public void setP_Speci(String p_Speci) {
		this.p_Speci = p_Speci;
	}
	/**
	 * @return the p_Cer_Num
	 */
	public String getP_Cer_Num() {
		return p_Cer_Num;
	}
	/**
	 * @param p_Cer_Num the p_Cer_Num to set
	 */
	public void setP_Cer_Num(String p_Cer_Num) {
		this.p_Cer_Num = p_Cer_Num;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PipeBasicVo [company=" + company + ", p_ID=" + p_ID
				+ ", p_Name=" + p_Name + ", p_Equ_Name=" + p_Equ_Name
				+ ", p_Sys=" + p_Sys + ", p_Gra=" + p_Gra + ", p_Len=" + p_Len
				+ ", p_De_Com=" + p_De_Com + ", p_De_Date=" + p_De_Date
				+ ", p_De_Norm=" + p_De_Norm + ", p_Ins_Com=" + p_Ins_Com
				+ ", p_Ins_Norm=" + p_Ins_Norm + ", p_Start_Pos=" + p_Start_Pos
				+ ", p_End_Pos=" + p_End_Pos + ", p_Che_Bef_Date="
				+ p_Che_Bef_Date + ", p_Use_Date=" + p_Use_Date
				+ ", p_Act_Use_Date=" + p_Act_Use_Date + ", p_Lay=" + p_Lay
				+ ", p_De_Pre=" + p_De_Pre + ", p_Wo_Pre=" + p_Wo_Pre
				+ ", p_De_Tem=" + p_De_Tem + ", p_Wo_Tem=" + p_Wo_Tem
				+ ", p_Ma_Gra=" + p_Ma_Gra + ", p_Wo_Med=" + p_Wo_Med
				+ ", p_Out_Rad=" + p_Out_Rad + ", p_Thi=" + p_Thi
				+ ", p_Ins_Ma=" + p_Ins_Ma + ", p_Ins_Thi=" + p_Ins_Thi
				+ ", p_Pro_Mar=" + p_Pro_Mar + ", p_Pro_Ma=" + p_Pro_Ma
				+ ", p_submited=" + p_submited + ", p_checkType=" + p_checkType
				+ ", nextDetailMaintainDate=" + nextDetailMaintainDate
				+ ", nextOnlineMaintainDate=" + nextOnlineMaintainDate
				+ ", p_Reg_Code=" + p_Reg_Code + ", p_Max_Pre=" + p_Max_Pre
				+ ", p_Max_Tem=" + p_Max_Tem + ", p_Sec_Rank=" + p_Sec_Rank
				+ ", p_Pro_Num=" + p_Pro_Num + ", p_Sign=" + p_Sign
				+ ", p_Butt_Joint=" + p_Butt_Joint + ", p_Corner_Joint="
				+ p_Corner_Joint + ", p_Total_Joint=" + p_Total_Joint
				+ ", p_T_Cock=" + p_T_Cock + ", p_Elbow=" + p_Elbow
				+ ", p_Reducer=" + p_Reducer + ", p_Axial_View=" + p_Axial_View
				+ ", p_Install_Date=" + p_Install_Date + ", p_Comment="
				+ p_Comment + ", p_Speci=" + p_Speci + ", p_Cer_Num="
				+ p_Cer_Num + ", getCompany()=" + getCompany() + ", getP_ID()="
				+ getP_ID() + ", getP_Name()=" + getP_Name()
				+ ", getP_Equ_Name()=" + getP_Equ_Name() + ", getP_Sys()="
				+ getP_Sys() + ", getP_Gra()=" + getP_Gra() + ", getP_Len()="
				+ getP_Len() + ", getP_De_Com()=" + getP_De_Com()
				+ ", getP_De_Date()=" + getP_De_Date() + ", getP_De_Norm()="
				+ getP_De_Norm() + ", getP_Ins_Com()=" + getP_Ins_Com()
				+ ", getP_Ins_Norm()=" + getP_Ins_Norm()
				+ ", getP_Start_Pos()=" + getP_Start_Pos()
				+ ", getP_End_Pos()=" + getP_End_Pos()
				+ ", getP_Che_Bef_Date()=" + getP_Che_Bef_Date()
				+ ", getP_Use_Date()=" + getP_Use_Date()
				+ ", getP_Act_Use_Date()=" + getP_Act_Use_Date()
				+ ", getP_Lay()=" + getP_Lay() + ", getP_De_Pre()="
				+ getP_De_Pre() + ", getP_Wo_Pre()=" + getP_Wo_Pre()
				+ ", getP_De_Tem()=" + getP_De_Tem() + ", getP_Wo_Tem()="
				+ getP_Wo_Tem() + ", getP_Ma_Gra()=" + getP_Ma_Gra()
				+ ", getP_Wo_Med()=" + getP_Wo_Med() + ", getP_Out_Rad()="
				+ getP_Out_Rad() + ", getP_Thi()=" + getP_Thi()
				+ ", getP_Ins_Ma()=" + getP_Ins_Ma() + ", getP_Ins_Thi()="
				+ getP_Ins_Thi() + ", getP_Pro_Mar()=" + getP_Pro_Mar()
				+ ", getP_Pro_Ma()=" + getP_Pro_Ma() + ", getP_submited()="
				+ getP_submited() + ", getP_checkType()=" + getP_checkType()
				+ ", getNextDetailMaintainDate()="
				+ getNextDetailMaintainDate()
				+ ", getNextOnlineMaintainDate()="
				+ getNextOnlineMaintainDate() + ", getP_Reg_Code()="
				+ getP_Reg_Code() + ", getP_Max_Pre()=" + getP_Max_Pre()
				+ ", getP_Max_Tem()=" + getP_Max_Tem() + ", getP_Sec_Rank()="
				+ getP_Sec_Rank() + ", getP_Pro_Num()=" + getP_Pro_Num()
				+ ", getP_Sign()=" + getP_Sign() + ", getP_Butt_Joint()="
				+ getP_Butt_Joint() + ", getP_Corner_Joint()="
				+ getP_Corner_Joint() + ", getP_Total_Joint()="
				+ getP_Total_Joint() + ", getP_T_Cock()=" + getP_T_Cock()
				+ ", getP_Elbow()=" + getP_Elbow() + ", getP_Reducer()="
				+ getP_Reducer() + ", getP_Axial_View()=" + getP_Axial_View()
				+ ", getP_Install_Date()=" + getP_Install_Date()
				+ ", getP_Comment()=" + getP_Comment() + ", getP_Speci()="
				+ getP_Speci() + ", getP_Cer_Num()=" + getP_Cer_Num()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

		
}
