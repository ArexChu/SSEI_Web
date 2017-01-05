package cn.ecust.ssei.domain.vo;


public class VesselBasicVo {

	private String v_Reg_Com;//注册登记机构
	private String v_Equ_ID;//设备代码
	private String v_Use_ID;//使用证号
	private String v_Product_ID;//产品编号
	private String v_Inuse_Com_ID;//单位内编号
	private String v_Name;//容器名称
	private String v_Use_Addr;//设备使用地点
	private String v_Type;//设备品种
	private String v_Mainbody_Str;//主体结构形式
	
	private String v_Use_Com;//使用单位
	private String v_De_Com;//设计单位
	private String v_Man_Com;//制造单位
	private String v_Install_Com;//安装单位
	
	private String v_M_Ins_ID;//安装告知书号
	private String v_M_Ins_Type;//安装形式
	private String v_M_Ins_Permission_ID;//安装单位许可号
	private String v_M_Ins_End_Date;//安装完成日期
	private String v_M_De_ID;//设计单位许可号
	private String v_M_Man_Permission_ID;//制造单位许可号
	private String v_De_Date;//设计日期
	private String v_Product_Cri;//产品标准
	private String v_Pic_ID;//容器图号
	private String v_Man_Date;//制造日期
	private String v_Start_Date;//投入使用日期
	private String v_De_Life;//设计使用年限
	private String v_Seat_Type;//支座型式
	private String v_Install_Type;//安装型式
	private String v_Pro_Ins_Type;//保温绝热方式
	private String v_Inside_Dia;//容器内径
	private String v_Len;//容器高/长
	private String v_C_Volume;//选择容积m3/换热面积
	private String v_Volume;//容积m3/换热面积
	private String v_Max_Volume;//最大允许充装量
	private String v_Head;//封头
	private String v_De_Pre_C_Shell;//设计压力选择壳体或是壳程
	private String v_De_Pre_Shell;//壳体或是壳程的数值
	private String v_De_Pre_C_Jacket;//设计压力选择夹套或是管程
	private String v_De_Pre_Jacket;//夹套或是管程的数值
	private String v_Wo_Pre_C_Shell;//工作压力选择壳体或是壳程
	private String v_Wo_Pre_Shell;//壳体或是壳程的数值
	private String v_Wo_Pre_C_Jacket;//工作压力选择夹套或是管程
	private String v_Wo_Pre_Jacket;//夹套或是管程的数值
	private String v_De_Tem_C_Shell;//设计温度选择壳体或是壳程
	private String v_De_Tem_Shell;//壳体或是壳程的数值
	private String v_De_Tem_C_Jacket;//设计温度选择夹套或是管程
	private String v_De_Tem_Jacket;//夹套或是管程的数值
	private String v_Wo_Tem_C_Shell;//工作温度选择壳体或是壳程
	private String v_Wo_Tem_Shell;//壳体或是壳程的数值
	private String v_Wo_Tem_C_Jacket;//工作温度选择夹套或是管程
	private String v_Wo_Tem_Jacket;//夹套或是管程的数值
	private String v_Cor_Barrel_Body;// 桶体腐蚀裕度
	private String v_Cor_Seal_Head;//封头腐蚀裕度
	private String v_Med_C_Shell;//介质选择壳体或是壳程
	private String v_Med_Shell;//壳体或是壳程的数值
	private String v_Med_C_Jacket;//介质选择夹套或是管程
	private String v_Med_Jacket;//夹套或是管程的数值
	private String v_Ma_Barrel_Body;//材质 筒体
	private String v_Ma_Seal_Head;//材质 封头
	private String v_Ma_C_Jacket;//材质 夹套或换热管的选择
	private String v_Ma_Jacket;//材质 夹套 夹套或换热管的数值
	private String v_Ma_Liner;//材质 衬里
	private String v_Thi_Barrel_Body;//厚度 筒体
	private String v_Thi_Seal_Head;//厚度 封头
	private String v_Thi_C_Jacket;//厚度 夹套或换热管的选择
	private String v_Thi_Jacket;//厚度 夹套 夹套或换热管的数值
	private String v_Thi_Liner;//厚度 衬里

	/**
	 * 下次检验的日期（两个）
	 */
	private String v_M_Next_Date;
	private String v_M_Next_Ann_Date;

	/**
	 * @return the v_Reg_Com
	 */
	public String getV_Reg_Com() {
		return v_Reg_Com;
	}
	/**
	 * @param v_Reg_Com the v_Reg_Com to set
	 */
	public void setV_Reg_Com(String v_Reg_Com) {
		this.v_Reg_Com = v_Reg_Com;
	}
	/**
	 * @return the v_Equ_ID
	 */
	public String getV_Equ_ID() {
		return v_Equ_ID;
	}
	/**
	 * @param v_Equ_ID the v_Equ_ID to set
	 */
	public void setV_Equ_ID(String v_Equ_ID) {
		this.v_Equ_ID = v_Equ_ID;
	}
	/**
	 * @return the v_Use_ID
	 */
	public String getV_Use_ID() {
		return v_Use_ID;
	}
	/**
	 * @param v_Use_ID the v_Use_ID to set
	 */
	public void setV_Use_ID(String v_Use_ID) {
		this.v_Use_ID = v_Use_ID;
	}
	/**
	 * @return the v_Product_ID
	 */
	public String getV_Product_ID() {
		return v_Product_ID;
	}
	/**
	 * @param v_Product_ID the v_Product_ID to set
	 */
	public void setV_Product_ID(String v_Product_ID) {
		this.v_Product_ID = v_Product_ID;
	}
	/**
	 * @return the v_Inuse_Com_ID
	 */
	public String getV_Inuse_Com_ID() {
		return v_Inuse_Com_ID;
	}
	/**
	 * @param v_Inuse_Com_ID the v_Inuse_Com_ID to set
	 */
	public void setV_Inuse_Com_ID(String v_Inuse_Com_ID) {
		this.v_Inuse_Com_ID = v_Inuse_Com_ID;
	}
	/**
	 * @return the v_Name
	 */
	public String getV_Name() {
		return v_Name;
	}
	/**
	 * @param v_Name the v_Name to set
	 */
	public void setV_Name(String v_Name) {
		this.v_Name = v_Name;
	}
	/**
	 * @return the v_Use_Addr
	 */
	public String getV_Use_Addr() {
		return v_Use_Addr;
	}
	/**
	 * @param v_Use_Addr the v_Use_Addr to set
	 */
	public void setV_Use_Addr(String v_Use_Addr) {
		this.v_Use_Addr = v_Use_Addr;
	}
	/**
	 * @return the v_Type
	 */
	public String getV_Type() {
		return v_Type;
	}
	/**
	 * @param v_Type the v_Type to set
	 */
	public void setV_Type(String v_Type) {
		this.v_Type = v_Type;
	}
	/**
	 * @return the v_Mainbody_Str
	 */
	public String getV_Mainbody_Str() {
		return v_Mainbody_Str;
	}
	/**
	 * @param v_Mainbody_Str the v_Mainbody_Str to set
	 */
	public void setV_Mainbody_Str(String v_Mainbody_Str) {
		this.v_Mainbody_Str = v_Mainbody_Str;
	}
	/**
	 * @return the v_Use_Com
	 */
	public String getV_Use_Com() {
		return v_Use_Com;
	}
	/**
	 * @param v_Use_Com the v_Use_Com to set
	 */
	public void setV_Use_Com(String v_Use_Com) {
		this.v_Use_Com = v_Use_Com;
	}
	/**
	 * @return the v_De_Com
	 */
	public String getV_De_Com() {
		return v_De_Com;
	}
	/**
	 * @param v_De_Com the v_De_Com to set
	 */
	public void setV_De_Com(String v_De_Com) {
		this.v_De_Com = v_De_Com;
	}
	/**
	 * @return the v_Man_Com
	 */
	public String getV_Man_Com() {
		return v_Man_Com;
	}
	/**
	 * @param v_Man_Com the v_Man_Com to set
	 */
	public void setV_Man_Com(String v_Man_Com) {
		this.v_Man_Com = v_Man_Com;
	}
	/**
	 * @return the v_Install_Com
	 */
	public String getV_Install_Com() {
		return v_Install_Com;
	}
	/**
	 * @param v_Install_Com the v_Install_Com to set
	 */
	public void setV_Install_Com(String v_Install_Com) {
		this.v_Install_Com = v_Install_Com;
	}
	/**
	 * @return the v_M_Ins_ID
	 */
	public String getV_M_Ins_ID() {
		return v_M_Ins_ID;
	}
	/**
	 * @param v_M_Ins_ID the v_M_Ins_ID to set
	 */
	public void setV_M_Ins_ID(String v_M_Ins_ID) {
		this.v_M_Ins_ID = v_M_Ins_ID;
	}
	/**
	 * @return the v_M_Ins_Type
	 */
	public String getV_M_Ins_Type() {
		return v_M_Ins_Type;
	}
	/**
	 * @param v_M_Ins_Type the v_M_Ins_Type to set
	 */
	public void setV_M_Ins_Type(String v_M_Ins_Type) {
		this.v_M_Ins_Type = v_M_Ins_Type;
	}
	/**
	 * @return the v_M_Ins_Permission_ID
	 */
	public String getV_M_Ins_Permission_ID() {
		return v_M_Ins_Permission_ID;
	}
	/**
	 * @param v_M_Ins_Permission_ID the v_M_Ins_Permission_ID to set
	 */
	public void setV_M_Ins_Permission_ID(String v_M_Ins_Permission_ID) {
		this.v_M_Ins_Permission_ID = v_M_Ins_Permission_ID;
	}
	/**
	 * @return the v_M_Ins_End_Date
	 */
	public String getV_M_Ins_End_Date() {
		return v_M_Ins_End_Date;
	}
	/**
	 * @param v_M_Ins_End_Date the v_M_Ins_End_Date to set
	 */
	public void setV_M_Ins_End_Date(String v_M_Ins_End_Date) {
		this.v_M_Ins_End_Date = v_M_Ins_End_Date;
	}
	/**
	 * @return the v_M_De_ID
	 */
	public String getV_M_De_ID() {
		return v_M_De_ID;
	}
	/**
	 * @param v_M_De_ID the v_M_De_ID to set
	 */
	public void setV_M_De_ID(String v_M_De_ID) {
		this.v_M_De_ID = v_M_De_ID;
	}
	/**
	 * @return the v_M_Man_Permission_ID
	 */
	public String getV_M_Man_Permission_ID() {
		return v_M_Man_Permission_ID;
	}
	/**
	 * @param v_M_Man_Permission_ID the v_M_Man_Permission_ID to set
	 */
	public void setV_M_Man_Permission_ID(String v_M_Man_Permission_ID) {
		this.v_M_Man_Permission_ID = v_M_Man_Permission_ID;
	}
	/**
	 * @return the v_De_Date
	 */
	public String getV_De_Date() {
		return v_De_Date;
	}
	/**
	 * @param v_De_Date the v_De_Date to set
	 */
	public void setV_De_Date(String v_De_Date) {
		this.v_De_Date = v_De_Date;
	}
	/**
	 * @return the v_Product_Cri
	 */
	public String getV_Product_Cri() {
		return v_Product_Cri;
	}
	/**
	 * @param v_Product_Cri the v_Product_Cri to set
	 */
	public void setV_Product_Cri(String v_Product_Cri) {
		this.v_Product_Cri = v_Product_Cri;
	}
	/**
	 * @return the v_Pic_ID
	 */
	public String getV_Pic_ID() {
		return v_Pic_ID;
	}
	/**
	 * @param v_Pic_ID the v_Pic_ID to set
	 */
	public void setV_Pic_ID(String v_Pic_ID) {
		this.v_Pic_ID = v_Pic_ID;
	}
	/**
	 * @return the v_Man_Date
	 */
	public String getV_Man_Date() {
		return v_Man_Date;
	}
	/**
	 * @param v_Man_Date the v_Man_Date to set
	 */
	public void setV_Man_Date(String v_Man_Date) {
		this.v_Man_Date = v_Man_Date;
	}
	/**
	 * @return the v_Start_Date
	 */
	public String getV_Start_Date() {
		return v_Start_Date;
	}
	/**
	 * @param v_Start_Date the v_Start_Date to set
	 */
	public void setV_Start_Date(String v_Start_Date) {
		this.v_Start_Date = v_Start_Date;
	}
	/**
	 * @return the v_De_Life
	 */
	public String getV_De_Life() {
		return v_De_Life;
	}
	/**
	 * @param v_De_Life the v_De_Life to set
	 */
	public void setV_De_Life(String v_De_Life) {
		this.v_De_Life = v_De_Life;
	}
	/**
	 * @return the v_Seat_Type
	 */
	public String getV_Seat_Type() {
		return v_Seat_Type;
	}
	/**
	 * @param v_Seat_Type the v_Seat_Type to set
	 */
	public void setV_Seat_Type(String v_Seat_Type) {
		this.v_Seat_Type = v_Seat_Type;
	}
	/**
	 * @return the v_Install_Type
	 */
	public String getV_Install_Type() {
		return v_Install_Type;
	}
	/**
	 * @param v_Install_Type the v_Install_Type to set
	 */
	public void setV_Install_Type(String v_Install_Type) {
		this.v_Install_Type = v_Install_Type;
	}
	/**
	 * @return the v_Pro_Ins_Type
	 */
	public String getV_Pro_Ins_Type() {
		return v_Pro_Ins_Type;
	}
	/**
	 * @param v_Pro_Ins_Type the v_Pro_Ins_Type to set
	 */
	public void setV_Pro_Ins_Type(String v_Pro_Ins_Type) {
		this.v_Pro_Ins_Type = v_Pro_Ins_Type;
	}
	/**
	 * @return the v_Inside_Dia
	 */
	public String getV_Inside_Dia() {
		return v_Inside_Dia;
	}
	/**
	 * @param v_Inside_Dia the v_Inside_Dia to set
	 */
	public void setV_Inside_Dia(String v_Inside_Dia) {
		this.v_Inside_Dia = v_Inside_Dia;
	}
	/**
	 * @return the v_Len
	 */
	public String getV_Len() {
		return v_Len;
	}
	/**
	 * @param v_Len the v_Len to set
	 */
	public void setV_Len(String v_Len) {
		this.v_Len = v_Len;
	}
	/**
	 * @return the v_C_Volume
	 */
	public String getV_C_Volume() {
		return v_C_Volume;
	}
	/**
	 * @param v_C_Volume the v_C_Volume to set
	 */
	public void setV_C_Volume(String v_C_Volume) {
		this.v_C_Volume = v_C_Volume;
	}
	/**
	 * @return the v_Volume
	 */
	public String getV_Volume() {
		return v_Volume;
	}
	/**
	 * @param v_Volume the v_Volume to set
	 */
	public void setV_Volume(String v_Volume) {
		this.v_Volume = v_Volume;
	}
	/**
	 * @return the v_Max_Volume
	 */
	public String getV_Max_Volume() {
		return v_Max_Volume;
	}
	/**
	 * @param v_Max_Volume the v_Max_Volume to set
	 */
	public void setV_Max_Volume(String v_Max_Volume) {
		this.v_Max_Volume = v_Max_Volume;
	}
	/**
	 * @return the v_Head
	 */
	public String getV_Head() {
		return v_Head;
	}
	/**
	 * @param v_Head the v_Head to set
	 */
	public void setV_Head(String v_Head) {
		this.v_Head = v_Head;
	}
	/**
	 * @return the v_De_Pre_C_Shell
	 */
	public String getV_De_Pre_C_Shell() {
		return v_De_Pre_C_Shell;
	}
	/**
	 * @param v_De_Pre_C_Shell the v_De_Pre_C_Shell to set
	 */
	public void setV_De_Pre_C_Shell(String v_De_Pre_C_Shell) {
		this.v_De_Pre_C_Shell = v_De_Pre_C_Shell;
	}
	/**
	 * @return the v_De_Pre_Shell
	 */
	public String getV_De_Pre_Shell() {
		return v_De_Pre_Shell;
	}
	/**
	 * @param v_De_Pre_Shell the v_De_Pre_Shell to set
	 */
	public void setV_De_Pre_Shell(String v_De_Pre_Shell) {
		this.v_De_Pre_Shell = v_De_Pre_Shell;
	}
	/**
	 * @return the v_De_Pre_C_Jacket
	 */
	public String getV_De_Pre_C_Jacket() {
		return v_De_Pre_C_Jacket;
	}
	/**
	 * @param v_De_Pre_C_Jacket the v_De_Pre_C_Jacket to set
	 */
	public void setV_De_Pre_C_Jacket(String v_De_Pre_C_Jacket) {
		this.v_De_Pre_C_Jacket = v_De_Pre_C_Jacket;
	}
	/**
	 * @return the v_De_Pre_Jacket
	 */
	public String getV_De_Pre_Jacket() {
		return v_De_Pre_Jacket;
	}
	/**
	 * @param v_De_Pre_Jacket the v_De_Pre_Jacket to set
	 */
	public void setV_De_Pre_Jacket(String v_De_Pre_Jacket) {
		this.v_De_Pre_Jacket = v_De_Pre_Jacket;
	}
	/**
	 * @return the v_Wo_Pre_C_Shell
	 */
	public String getV_Wo_Pre_C_Shell() {
		return v_Wo_Pre_C_Shell;
	}
	/**
	 * @param v_Wo_Pre_C_Shell the v_Wo_Pre_C_Shell to set
	 */
	public void setV_Wo_Pre_C_Shell(String v_Wo_Pre_C_Shell) {
		this.v_Wo_Pre_C_Shell = v_Wo_Pre_C_Shell;
	}
	/**
	 * @return the v_Wo_Pre_Shell
	 */
	public String getV_Wo_Pre_Shell() {
		return v_Wo_Pre_Shell;
	}
	/**
	 * @param v_Wo_Pre_Shell the v_Wo_Pre_Shell to set
	 */
	public void setV_Wo_Pre_Shell(String v_Wo_Pre_Shell) {
		this.v_Wo_Pre_Shell = v_Wo_Pre_Shell;
	}
	/**
	 * @return the v_Wo_Pre_C_Jacket
	 */
	public String getV_Wo_Pre_C_Jacket() {
		return v_Wo_Pre_C_Jacket;
	}
	/**
	 * @param v_Wo_Pre_C_Jacket the v_Wo_Pre_C_Jacket to set
	 */
	public void setV_Wo_Pre_C_Jacket(String v_Wo_Pre_C_Jacket) {
		this.v_Wo_Pre_C_Jacket = v_Wo_Pre_C_Jacket;
	}
	/**
	 * @return the v_Wo_Pre_Jacket
	 */
	public String getV_Wo_Pre_Jacket() {
		return v_Wo_Pre_Jacket;
	}
	/**
	 * @param v_Wo_Pre_Jacket the v_Wo_Pre_Jacket to set
	 */
	public void setV_Wo_Pre_Jacket(String v_Wo_Pre_Jacket) {
		this.v_Wo_Pre_Jacket = v_Wo_Pre_Jacket;
	}
	/**
	 * @return the v_De_Tem_C_Shell
	 */
	public String getV_De_Tem_C_Shell() {
		return v_De_Tem_C_Shell;
	}
	/**
	 * @param v_De_Tem_C_Shell the v_De_Tem_C_Shell to set
	 */
	public void setV_De_Tem_C_Shell(String v_De_Tem_C_Shell) {
		this.v_De_Tem_C_Shell = v_De_Tem_C_Shell;
	}
	/**
	 * @return the v_De_Tem_Shell
	 */
	public String getV_De_Tem_Shell() {
		return v_De_Tem_Shell;
	}
	/**
	 * @param v_De_Tem_Shell the v_De_Tem_Shell to set
	 */
	public void setV_De_Tem_Shell(String v_De_Tem_Shell) {
		this.v_De_Tem_Shell = v_De_Tem_Shell;
	}
	/**
	 * @return the v_De_Tem_C_Jacket
	 */
	public String getV_De_Tem_C_Jacket() {
		return v_De_Tem_C_Jacket;
	}
	/**
	 * @param v_De_Tem_C_Jacket the v_De_Tem_C_Jacket to set
	 */
	public void setV_De_Tem_C_Jacket(String v_De_Tem_C_Jacket) {
		this.v_De_Tem_C_Jacket = v_De_Tem_C_Jacket;
	}
	/**
	 * @return the v_De_Tem_Jacket
	 */
	public String getV_De_Tem_Jacket() {
		return v_De_Tem_Jacket;
	}
	/**
	 * @param v_De_Tem_Jacket the v_De_Tem_Jacket to set
	 */
	public void setV_De_Tem_Jacket(String v_De_Tem_Jacket) {
		this.v_De_Tem_Jacket = v_De_Tem_Jacket;
	}
	/**
	 * @return the v_Wo_Tem_C_Shell
	 */
	public String getV_Wo_Tem_C_Shell() {
		return v_Wo_Tem_C_Shell;
	}
	/**
	 * @param v_Wo_Tem_C_Shell the v_Wo_Tem_C_Shell to set
	 */
	public void setV_Wo_Tem_C_Shell(String v_Wo_Tem_C_Shell) {
		this.v_Wo_Tem_C_Shell = v_Wo_Tem_C_Shell;
	}
	/**
	 * @return the v_Wo_Tem_Shell
	 */
	public String getV_Wo_Tem_Shell() {
		return v_Wo_Tem_Shell;
	}
	/**
	 * @param v_Wo_Tem_Shell the v_Wo_Tem_Shell to set
	 */
	public void setV_Wo_Tem_Shell(String v_Wo_Tem_Shell) {
		this.v_Wo_Tem_Shell = v_Wo_Tem_Shell;
	}
	/**
	 * @return the v_Wo_Tem_C_Jacket
	 */
	public String getV_Wo_Tem_C_Jacket() {
		return v_Wo_Tem_C_Jacket;
	}
	/**
	 * @param v_Wo_Tem_C_Jacket the v_Wo_Tem_C_Jacket to set
	 */
	public void setV_Wo_Tem_C_Jacket(String v_Wo_Tem_C_Jacket) {
		this.v_Wo_Tem_C_Jacket = v_Wo_Tem_C_Jacket;
	}
	/**
	 * @return the v_Wo_Tem_Jacket
	 */
	public String getV_Wo_Tem_Jacket() {
		return v_Wo_Tem_Jacket;
	}
	/**
	 * @param v_Wo_Tem_Jacket the v_Wo_Tem_Jacket to set
	 */
	public void setV_Wo_Tem_Jacket(String v_Wo_Tem_Jacket) {
		this.v_Wo_Tem_Jacket = v_Wo_Tem_Jacket;
	}
	/**
	 * @return the v_Cor_Barrel_Body
	 */
	public String getV_Cor_Barrel_Body() {
		return v_Cor_Barrel_Body;
	}
	/**
	 * @param v_Cor_Barrel_Body the v_Cor_Barrel_Body to set
	 */
	public void setV_Cor_Barrel_Body(String v_Cor_Barrel_Body) {
		this.v_Cor_Barrel_Body = v_Cor_Barrel_Body;
	}
	/**
	 * @return the v_Cor_Seal_Head
	 */
	public String getV_Cor_Seal_Head() {
		return v_Cor_Seal_Head;
	}
	/**
	 * @param v_Cor_Seal_Head the v_Cor_Seal_Head to set
	 */
	public void setV_Cor_Seal_Head(String v_Cor_Seal_Head) {
		this.v_Cor_Seal_Head = v_Cor_Seal_Head;
	}
	/**
	 * @return the v_Med_C_Shell
	 */
	public String getV_Med_C_Shell() {
		return v_Med_C_Shell;
	}
	/**
	 * @param v_Med_C_Shell the v_Med_C_Shell to set
	 */
	public void setV_Med_C_Shell(String v_Med_C_Shell) {
		this.v_Med_C_Shell = v_Med_C_Shell;
	}
	/**
	 * @return the v_Med_Shell
	 */
	public String getV_Med_Shell() {
		return v_Med_Shell;
	}
	/**
	 * @param v_Med_Shell the v_Med_Shell to set
	 */
	public void setV_Med_Shell(String v_Med_Shell) {
		this.v_Med_Shell = v_Med_Shell;
	}
	/**
	 * @return the v_Med_C_Jacket
	 */
	public String getV_Med_C_Jacket() {
		return v_Med_C_Jacket;
	}
	/**
	 * @param v_Med_C_Jacket the v_Med_C_Jacket to set
	 */
	public void setV_Med_C_Jacket(String v_Med_C_Jacket) {
		this.v_Med_C_Jacket = v_Med_C_Jacket;
	}
	/**
	 * @return the v_Med_Jacket
	 */
	public String getV_Med_Jacket() {
		return v_Med_Jacket;
	}
	/**
	 * @param v_Med_Jacket the v_Med_Jacket to set
	 */
	public void setV_Med_Jacket(String v_Med_Jacket) {
		this.v_Med_Jacket = v_Med_Jacket;
	}
	/**
	 * @return the v_Ma_Barrel_Body
	 */
	public String getV_Ma_Barrel_Body() {
		return v_Ma_Barrel_Body;
	}
	/**
	 * @param v_Ma_Barrel_Body the v_Ma_Barrel_Body to set
	 */
	public void setV_Ma_Barrel_Body(String v_Ma_Barrel_Body) {
		this.v_Ma_Barrel_Body = v_Ma_Barrel_Body;
	}
	/**
	 * @return the v_Ma_Seal_Head
	 */
	public String getV_Ma_Seal_Head() {
		return v_Ma_Seal_Head;
	}
	/**
	 * @param v_Ma_Seal_Head the v_Ma_Seal_Head to set
	 */
	public void setV_Ma_Seal_Head(String v_Ma_Seal_Head) {
		this.v_Ma_Seal_Head = v_Ma_Seal_Head;
	}
	/**
	 * @return the v_Ma_C_Jacket
	 */
	public String getV_Ma_C_Jacket() {
		return v_Ma_C_Jacket;
	}
	/**
	 * @param v_Ma_C_Jacket the v_Ma_C_Jacket to set
	 */
	public void setV_Ma_C_Jacket(String v_Ma_C_Jacket) {
		this.v_Ma_C_Jacket = v_Ma_C_Jacket;
	}
	/**
	 * @return the v_Ma_Jacket
	 */
	public String getV_Ma_Jacket() {
		return v_Ma_Jacket;
	}
	/**
	 * @param v_Ma_Jacket the v_Ma_Jacket to set
	 */
	public void setV_Ma_Jacket(String v_Ma_Jacket) {
		this.v_Ma_Jacket = v_Ma_Jacket;
	}
	/**
	 * @return the v_Ma_Liner
	 */
	public String getV_Ma_Liner() {
		return v_Ma_Liner;
	}
	/**
	 * @param v_Ma_Liner the v_Ma_Liner to set
	 */
	public void setV_Ma_Liner(String v_Ma_Liner) {
		this.v_Ma_Liner = v_Ma_Liner;
	}
	/**
	 * @return the v_Thi_Barrel_Body
	 */
	public String getV_Thi_Barrel_Body() {
		return v_Thi_Barrel_Body;
	}
	/**
	 * @param v_Thi_Barrel_Body the v_Thi_Barrel_Body to set
	 */
	public void setV_Thi_Barrel_Body(String v_Thi_Barrel_Body) {
		this.v_Thi_Barrel_Body = v_Thi_Barrel_Body;
	}
	/**
	 * @return the v_Thi_Seal_Head
	 */
	public String getV_Thi_Seal_Head() {
		return v_Thi_Seal_Head;
	}
	/**
	 * @param v_Thi_Seal_Head the v_Thi_Seal_Head to set
	 */
	public void setV_Thi_Seal_Head(String v_Thi_Seal_Head) {
		this.v_Thi_Seal_Head = v_Thi_Seal_Head;
	}
	/**
	 * @return the v_Thi_C_Jacket
	 */
	public String getV_Thi_C_Jacket() {
		return v_Thi_C_Jacket;
	}
	/**
	 * @param v_Thi_C_Jacket the v_Thi_C_Jacket to set
	 */
	public void setV_Thi_C_Jacket(String v_Thi_C_Jacket) {
		this.v_Thi_C_Jacket = v_Thi_C_Jacket;
	}
	/**
	 * @return the v_Thi_Jacket
	 */
	public String getV_Thi_Jacket() {
		return v_Thi_Jacket;
	}
	/**
	 * @param v_Thi_Jacket the v_Thi_Jacket to set
	 */
	public void setV_Thi_Jacket(String v_Thi_Jacket) {
		this.v_Thi_Jacket = v_Thi_Jacket;
	}
	/**
	 * @return the v_Thi_Liner
	 */
	public String getV_Thi_Liner() {
		return v_Thi_Liner;
	}
	/**
	 * @param v_Thi_Liner the v_Thi_Liner to set
	 */
	public void setV_Thi_Liner(String v_Thi_Liner) {
		this.v_Thi_Liner = v_Thi_Liner;
	}
	/**
	 * @return the v_M_Next_Date
	 */
	public String getV_M_Next_Date() {
		return v_M_Next_Date;
	}
	/**
	 * @param v_M_Next_Date the v_M_Next_Date to set
	 */
	public void setV_M_Next_Date(String v_M_Next_Date) {
		this.v_M_Next_Date = v_M_Next_Date;
	}
	/**
	 * @return the v_M_Next_Ann_Date
	 */
	public String getV_M_Next_Ann_Date() {
		return v_M_Next_Ann_Date;
	}
	/**
	 * @param v_M_Next_Ann_Date the v_M_Next_Ann_Date to set
	 */
	public void setV_M_Next_Ann_Date(String v_M_Next_Ann_Date) {
		this.v_M_Next_Ann_Date = v_M_Next_Ann_Date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VesselBasicVo [v_Reg_Com=" + v_Reg_Com + ", v_Equ_ID="
				+ v_Equ_ID + ", v_Use_ID=" + v_Use_ID + ", v_Product_ID="
				+ v_Product_ID + ", v_Inuse_Com_ID=" + v_Inuse_Com_ID
				+ ", v_Name=" + v_Name + ", v_Use_Addr=" + v_Use_Addr
				+ ", v_Type=" + v_Type + ", v_Mainbody_Str=" + v_Mainbody_Str
				+ ", v_Use_Com=" + v_Use_Com + ", v_De_Com=" + v_De_Com
				+ ", v_Man_Com=" + v_Man_Com + ", v_Install_Com="
				+ v_Install_Com + ", v_M_Ins_ID=" + v_M_Ins_ID
				+ ", v_M_Ins_Type=" + v_M_Ins_Type + ", v_M_Ins_Permission_ID="
				+ v_M_Ins_Permission_ID + ", v_M_Ins_End_Date="
				+ v_M_Ins_End_Date + ", v_M_De_ID=" + v_M_De_ID
				+ ", v_M_Man_Permission_ID=" + v_M_Man_Permission_ID
				+ ", v_De_Date=" + v_De_Date + ", v_Product_Cri="
				+ v_Product_Cri + ", v_Pic_ID=" + v_Pic_ID + ", v_Man_Date="
				+ v_Man_Date + ", v_Start_Date=" + v_Start_Date
				+ ", v_De_Life=" + v_De_Life + ", v_Seat_Type=" + v_Seat_Type
				+ ", v_Install_Type=" + v_Install_Type + ", v_Pro_Ins_Type="
				+ v_Pro_Ins_Type + ", v_Inside_Dia=" + v_Inside_Dia
				+ ", v_Len=" + v_Len + ", v_C_Volume=" + v_C_Volume
				+ ", v_Volume=" + v_Volume + ", v_Max_Volume=" + v_Max_Volume
				+ ", v_Head=" + v_Head + ", v_De_Pre_C_Shell="
				+ v_De_Pre_C_Shell + ", v_De_Pre_Shell=" + v_De_Pre_Shell
				+ ", v_De_Pre_C_Jacket=" + v_De_Pre_C_Jacket
				+ ", v_De_Pre_Jacket=" + v_De_Pre_Jacket
				+ ", v_Wo_Pre_C_Shell=" + v_Wo_Pre_C_Shell
				+ ", v_Wo_Pre_Shell=" + v_Wo_Pre_Shell + ", v_Wo_Pre_C_Jacket="
				+ v_Wo_Pre_C_Jacket + ", v_Wo_Pre_Jacket=" + v_Wo_Pre_Jacket
				+ ", v_De_Tem_C_Shell=" + v_De_Tem_C_Shell
				+ ", v_De_Tem_Shell=" + v_De_Tem_Shell + ", v_De_Tem_C_Jacket="
				+ v_De_Tem_C_Jacket + ", v_De_Tem_Jacket=" + v_De_Tem_Jacket
				+ ", v_Wo_Tem_C_Shell=" + v_Wo_Tem_C_Shell
				+ ", v_Wo_Tem_Shell=" + v_Wo_Tem_Shell + ", v_Wo_Tem_C_Jacket="
				+ v_Wo_Tem_C_Jacket + ", v_Wo_Tem_Jacket=" + v_Wo_Tem_Jacket
				+ ", v_Cor_Barrel_Body=" + v_Cor_Barrel_Body
				+ ", v_Cor_Seal_Head=" + v_Cor_Seal_Head + ", v_Med_C_Shell="
				+ v_Med_C_Shell + ", v_Med_Shell=" + v_Med_Shell
				+ ", v_Med_C_Jacket=" + v_Med_C_Jacket + ", v_Med_Jacket="
				+ v_Med_Jacket + ", v_Ma_Barrel_Body=" + v_Ma_Barrel_Body
				+ ", v_Ma_Seal_Head=" + v_Ma_Seal_Head + ", v_Ma_C_Jacket="
				+ v_Ma_C_Jacket + ", v_Ma_Jacket=" + v_Ma_Jacket
				+ ", v_Ma_Liner=" + v_Ma_Liner + ", v_Thi_Barrel_Body="
				+ v_Thi_Barrel_Body + ", v_Thi_Seal_Head=" + v_Thi_Seal_Head
				+ ", v_Thi_C_Jacket=" + v_Thi_C_Jacket + ", v_Thi_Jacket="
				+ v_Thi_Jacket + ", v_Thi_Liner=" + v_Thi_Liner
				+ ", v_M_Next_Date=" + v_M_Next_Date + ", v_M_Next_Ann_Date="
				+ v_M_Next_Ann_Date + "]";
	}
	

}
