package cn.ecust.ssei.service.impl.vessel;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.springframework.stereotype.Service;

import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.service.CompanyService;
import cn.ecust.ssei.service.vessel.VesselBasicExcelService;
import cn.ecust.ssei.service.vessel.VesselBasicService;
import cn.ecust.ssei.util.ExcelUtils;

@Service
public class VesselBasciExcelServiceImpl implements VesselBasicExcelService {
	
	@Resource
	private CompanyService companyService;
	@Resource
	private VesselBasicService vesselBasicService;
	
	@Override
	public void createExcel(OutputStream os, List<VesselBasic> list) throws WriteException,IOException {
		  //创建工作薄
        WritableWorkbook workbook = Workbook.createWorkbook(os);
        //创建新的一页
        WritableSheet sheet = workbook.createSheet("First Sheet",0);
        //创建要显示的内容,创建一个单元格，第一个参数为列坐标，第二个参数为行坐标，第三个参数为内容
        Label label;
        String[] cStrings ={"使用单位（全称）","使用单位地址","单位组织机构代码","邮政编码","安全管理人员",
        		"联系电话","制造单位（全称）","制造单位许可证号","设计单位（全称）","设计单位许可证号",
        		"容器名称","出厂编号（产品编号）","设备代码","设备品种","主体结构形式",
        		"产品标准","容器图号","设计日期","制造日期","封头形式",
        		"设计使用年限","支座形式","容器内径","容器高/长","容积",
        		"换热面积","最大允许充装量","设计压力（壳体）","设计压力（壳程）","设计压力（夹套）",
        		"设计压力（管程）","设计温度（壳体）","设计温度（壳程）","设计温度（夹套）","设计温度（管程）",
        		"工作压力（壳体）","工作压力（壳程）","工作压力（夹套）","工作压力（管程）","工作温度（壳体）",
        		"工作温度（壳程）","工作温度（夹套）","工作温度（管程）","介质（壳体）","介质（壳程）",
        		"介质（夹套）","介质（管程）","腐蚀裕度（封头）","腐蚀裕度（筒体）","材质（封头）",
        		"材质（筒体）","材质（夹套）","材质（换热管）","材质（衬里）","厚度（封头）",
        		"厚度（筒体）","厚度（夹套）","厚度（换热管）","厚度（衬里）","安装告知书回执号",
        		"安装单位许可证号","安装单位（全称）","安装单位联系人","安装完成日期","安装形式",
        		"保温绝热方式","投用日期","单位内编号","注册登记机构","使用证号",
        		"设备使用地点"  }; 
        
        label=new Label(0,0,"压力容器信息采集表");
        sheet.addCell(label);
        sheet.mergeCells(0, 0, 70, 0);
        
        label=new Label(0,1,"使用单位信息");
        sheet.addCell(label);
        sheet.mergeCells(0, 1, 5, 1);
        
        label=new Label(6,1,"制造单位信息");
        sheet.addCell(label);
        sheet.mergeCells(6, 1, 7, 1);
        
        label=new Label(8,1,"设计单位信息");
        sheet.addCell(label);
        sheet.mergeCells(8, 1, 9, 1);
        
        label=new Label(10,1,"设备基本信息");
        sheet.addCell(label);
        sheet.mergeCells(10, 1, 58, 1);
        
        label=new Label(59,1,"安装阶段信息");
        sheet.addCell(label);
        sheet.mergeCells(59, 1, 66, 1);
        
        label=new Label(67,1,"使用信息");
        sheet.addCell(label);
        sheet.mergeCells(67, 1, 70, 1);
        
        label=new Label(27,2,"设计压力");
        sheet.addCell(label);
        sheet.mergeCells(27, 2, 30, 2);
        
        label=new Label(31,2,"设计温度");
        sheet.addCell(label);
        sheet.mergeCells(31, 2, 34, 2);
        
        label=new Label(35,2,"工作压力");
        sheet.addCell(label);
        sheet.mergeCells(35, 2, 38, 2);
        
        label=new Label(39,2,"工作温度");
        sheet.addCell(label);
        sheet.mergeCells(39, 2, 42, 2);
        
        label=new Label(43,2,"介质");
        sheet.addCell(label);
        sheet.mergeCells(43, 2, 46, 2);
        
        label=new Label(47,2,"腐蚀裕度");
        sheet.addCell(label);
        sheet.mergeCells(47, 2, 48, 2);
        
        label=new Label(49,2,"材质");
        sheet.addCell(label);
        sheet.mergeCells(49, 2, 53, 2);
        
        label=new Label(54,2,"厚度");
        sheet.addCell(label);
        sheet.mergeCells(54, 2, 58, 2);
        
        for (int i = 0; i < cStrings.length; i++) {
        	label=new Label(i,3,cStrings[i]);
        	sheet.addCell(label);
		}		
        VesselBasic vesselBasic;
        for (int j = 4; j < list.size()+4; j++) {
        	vesselBasic = list.get(j-4);
        	int i=0;
        	label=new Label(i++,j+1,vesselBasic.getV_Use_Com().getName());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Use_Com().getAddress());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Use_Com().getCode());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Use_Com().getPoscode());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Use_Com().getContacts());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Use_Com().getContactsPhone());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Man_Com().getName());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_M_Man_Permission_ID());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_De_Com().getName());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_M_De_ID());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Name());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Product_ID());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Equ_ID());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Type());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Mainbody_Str());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Product_Cri());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Pic_ID());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_De_Date());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Man_Date());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Head());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_De_Life());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Seat_Type());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Inside_Dia());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Len());
			sheet.addCell(label);
			
			i = handleMulChoice(sheet, vesselBasic,"换热面积m2",vesselBasic.getV_C_Volume(),vesselBasic.getV_Volume(), j, i);
			
			label=new Label(i++,j+1,vesselBasic.getV_Max_Volume());
			sheet.addCell(label);
			
			i = handleMulChoice(sheet, vesselBasic,"壳体",vesselBasic.getV_De_Pre_C_Shell(),vesselBasic.getV_De_Pre_Shell(), j, i);
			
			i = handleMulChoice(sheet, vesselBasic,"夹套",vesselBasic.getV_De_Pre_C_Jacket(),vesselBasic.getV_De_Pre_Jacket(), j, i);
			
			i = handleMulChoice(sheet, vesselBasic,"壳体",vesselBasic.getV_De_Tem_C_Shell(),vesselBasic.getV_De_Tem_Shell(), j, i);
			
			i = handleMulChoice(sheet, vesselBasic,"夹套",vesselBasic.getV_De_Tem_C_Jacket(),vesselBasic.getV_De_Tem_Jacket(), j, i);
			
			i = handleMulChoice(sheet, vesselBasic,"壳体",vesselBasic.getV_Wo_Pre_C_Shell(),vesselBasic.getV_Wo_Pre_Shell(), j, i);
			
			i = handleMulChoice(sheet, vesselBasic,"夹套",vesselBasic.getV_Wo_Pre_C_Jacket(),vesselBasic.getV_Wo_Pre_Jacket(), j, i);
			
			i = handleMulChoice(sheet, vesselBasic,"壳体",vesselBasic.getV_Wo_Tem_C_Shell(),vesselBasic.getV_Wo_Tem_Shell(), j, i);
			
			i = handleMulChoice(sheet, vesselBasic,"夹套",vesselBasic.getV_Wo_Tem_C_Jacket(),vesselBasic.getV_Wo_Tem_Jacket(), j, i);
			
			i = handleMulChoice(sheet, vesselBasic,"壳体",vesselBasic.getV_Med_C_Shell(),vesselBasic.getV_Med_Shell(), j, i);
			
			i = handleMulChoice(sheet, vesselBasic,"夹套",vesselBasic.getV_Med_C_Jacket(),vesselBasic.getV_Med_Jacket(), j, i);
			
			label=new Label(i++,j+1,vesselBasic.getV_Cor_Barrel_Body());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Cor_Seal_Head());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Ma_Seal_Head());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Ma_Barrel_Body());
			sheet.addCell(label);
			
			i = handleMulChoice(sheet, vesselBasic,"夹套",vesselBasic.getV_Ma_C_Jacket(),vesselBasic.getV_Ma_Jacket(), j, i);
			
			
			label=new Label(i++,j+1,vesselBasic.getV_Ma_Liner());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Thi_Seal_Head());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Thi_Barrel_Body());
			sheet.addCell(label);
			
			i = handleMulChoice(sheet, vesselBasic,"夹套",vesselBasic.getV_Thi_C_Jacket(),vesselBasic.getV_Thi_Jacket(), j, i);
			
			
			label=new Label(i++,j+1,vesselBasic.getV_Thi_Liner());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_M_Ins_ID());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_M_Ins_Permission_ID());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_De_Com().getName());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_De_Com().getContactsPhone());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_M_Ins_End_Date());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_M_Ins_Type());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Pro_Ins_Type());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Start_Date());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Inuse_Com_ID());
			sheet.addCell(label);
			
			label=new Label(i++,j+1,vesselBasic.getV_Reg_Com());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Use_ID());
			sheet.addCell(label);
			label=new Label(i++,j+1,vesselBasic.getV_Use_Addr());
			sheet.addCell(label);		
		}
           
        //把创建的内容写入到输出流中，并关闭输出流
        workbook.write();
        workbook.close();
        os.close();
		
	}

	private int handleMulChoice(WritableSheet sheet, VesselBasic vesselBasic,String des,String choice,String value,
			int j, int i) throws WriteException, RowsExceededException {
		Label label;
		if (choice!=null&&!choice.isEmpty()&&equals(des)) {
			label=new Label(i++,j+1,value);
			sheet.addCell(label);
		}else {
			label=new Label(i++,j+1,value);
			sheet.addCell(label);
			i++;
		}
		return i;
	}

	@Override
	public void readExcel(File document) throws BiffException, IOException  {
		Workbook wb = Workbook.getWorkbook(document);//从文件流中取得Excel工作区对象
		Sheet sheet = wb.getSheet(0);//从工作区中取得页，取得这个对象的时候既可以用名称来获得，也可以用序号。
		for(int i=4; i < sheet.getRows()-1; i++){
			
			String v_Product_ID =sheet.getCell(11,i+1).getContents().trim();//获得容器编号
				VesselBasic vesselBasic=vesselBasicService.getByVesselId(v_Product_ID);
	          	if (vesselBasic==null) {
	          		vesselBasic=new VesselBasic();	
				}
	          	vesselBasic.setV_Product_ID(v_Product_ID);
	          	
          	/**
          	 * 处理使用公司
          	 */
          	String companyName =sheet.getCell(0,i+1).getContents().trim();//获得使用公司名称
          	String useComAddress = sheet.getCell(1,i+1).getContents().trim();//获得使用公司地址
          	String useComCode = sheet.getCell(2,i+1).getContents().trim();//获得使用公司组织机构代码
          	String useComPoscode = sheet.getCell(3,i+1).getContents().trim();//获得使用公司邮编
          	String useComContacts = sheet.getCell(4,i+1).getContents().trim();//获得使用公司联系人
          	String useComContactsPhone = sheet.getCell(5,i+1).getContents().trim();//获得使用公司邮编
          	Company useCompany;
          	if (!companyName.isEmpty()) {
          		useCompany = companyService.findByCompanyName(companyName);
              	if (useCompany==null) {
              		useCompany = new Company();
    			}
              	useCompany.setName(companyName);
              	useCompany.setType(1);
              	if (!useComAddress.isEmpty()) {
              		useCompany.setAddress(useComAddress);
				}
              	if (!useComCode.isEmpty()) {
              		useCompany.setCode(useComCode);
				}
              	if (!useComPoscode.isEmpty()) {
              		useCompany.setPoscode(useComPoscode);
				}
              	if (!useComContacts.isEmpty()) {
              	 	useCompany.setContacts(useComContacts);
				}
              	if (!useComContactsPhone.isEmpty()) {
              		useCompany.setContactsPhone(useComContactsPhone);
				}
              	if (useCompany.getId()==0) {
              		companyService.save(useCompany);
				}else {
					companyService.update(useCompany);
				}
              	vesselBasic.setV_Use_Com(useCompany);
			}
          	
        	/**
          	 * 处理制造单位
          	 */
          	String manCompanyName =sheet.getCell(6,i+1).getContents().trim();//获得制造单位名称
          	if (!manCompanyName.isEmpty()) {
          		Company company = companyService.findByCompanyName(manCompanyName);
              	if (company==null) {																																																			
              		company = new Company();
              		company.setName(manCompanyName);
              		company.setType(2);
              		companyService.save(company);
    				}
              	vesselBasic.setV_Man_Com(company);
			}
          	
          	vesselBasic.setV_M_Man_Permission_ID(sheet.getCell(7,i+1).getContents().trim());
          	
        	/**
          	 * 处理设计公司
          	 */
          	String desCompanyName =sheet.getCell(8,i+1).getContents().trim();//获得设计公司名称
          	if (!desCompanyName.isEmpty()) {
          		Company company = companyService.findByCompanyName(desCompanyName);
              	if (company==null) {
              		company = new Company();
              		company.setName(desCompanyName);
              		company.setType(2);
              		companyService.save(company);
    				}
              	vesselBasic.setV_De_Com(company);
			}
          	
          	vesselBasic.setV_M_De_ID(sheet.getCell(9,i+1).getContents().trim());
          	
          	vesselBasic.setV_Name(sheet.getCell(10,i+1).getContents().trim());
          	vesselBasic.setV_Equ_ID(sheet.getCell(12,i+1).getContents().trim());
        	vesselBasic.setV_Type(sheet.getCell(13,i+1).getContents().trim());
        	vesselBasic.setV_Mainbody_Str(sheet.getCell(14,i+1).getContents().trim());
        	vesselBasic.setV_Product_Cri(sheet.getCell(15,i+1).getContents().trim());
        	vesselBasic.setV_Pic_ID(sheet.getCell(16,i+1).getContents().trim());
        	vesselBasic.setV_De_Date(ExcelUtils.getTheFormatDate(sheet.getCell(17,i+1)));//设计日期
        	vesselBasic.setV_Man_Date(ExcelUtils.getTheFormatDate(sheet.getCell(18,i+1)));//制造日期
        	vesselBasic.setV_Head(sheet.getCell(19,i+1).getContents().trim());
        	vesselBasic.setV_De_Life(sheet.getCell(20,i+1).getContents().trim());
        	vesselBasic.setV_Seat_Type(sheet.getCell(21,i+1).getContents().trim());
        	vesselBasic.setV_Inside_Dia(sheet.getCell(22,i+1).getContents().trim());
        	vesselBasic.setV_Len(sheet.getCell(23,i+1).getContents().trim());
        	String v_Volume = sheet.getCell(24,i+1).getContents().trim();
        	String v_Volume_switch = sheet.getCell(25,i+1).getContents().trim();
        	if (!v_Volume.isEmpty()) {
        		vesselBasic.setV_C_Volume("换热面积m2");
        		vesselBasic.setV_Volume(v_Volume);
			}else {
				if(!v_Volume_switch.isEmpty()){
					vesselBasic.setV_C_Volume("容积m3");
					vesselBasic.setV_Volume(v_Volume_switch);
				}
			}
        	vesselBasic.setV_Max_Volume(sheet.getCell(26,i+1).getContents().trim());
        	String v_De_Pre_Shell = sheet.getCell(27,i+1).getContents().trim();
        	String v_De_Pre_Shell_switch = sheet.getCell(28,i+1).getContents().trim();
        	if (!v_De_Pre_Shell.isEmpty()) {
        		vesselBasic.setV_De_Pre_C_Shell("壳体");
        		vesselBasic.setV_De_Pre_Shell(v_De_Pre_Shell);
			}else {
				if (!v_De_Pre_Shell_switch.isEmpty()) {
					vesselBasic.setV_De_Pre_C_Shell("壳程");
					vesselBasic.setV_De_Pre_Shell(v_De_Pre_Shell_switch);
				}
			}
        	String v_De_Pre_Jacket = sheet.getCell(29,i+1).getContents().trim();
        	String v_De_Pre_Jacket_switch = sheet.getCell(30,i+1).getContents().trim();
        	if (!v_De_Pre_Jacket.isEmpty()) {
        		vesselBasic.setV_De_Pre_C_Jacket("夹套");
        		vesselBasic.setV_De_Pre_Jacket(v_De_Pre_Jacket);
			}else {
				if (!v_De_Pre_Jacket_switch.isEmpty()) {
					vesselBasic.setV_De_Pre_C_Jacket("管程");
					vesselBasic.setV_De_Pre_Jacket(v_De_Pre_Jacket_switch);
				}
			}
        	
     	
        	String v_De_Tem_Shell = sheet.getCell(31,i+1).getContents().trim();
        	String v_De_Tem_Shell_switch = sheet.getCell(32,i+1).getContents().trim();
        	if (!v_De_Tem_Shell.isEmpty()) {
        		vesselBasic.setV_De_Tem_C_Shell("壳体");
        		vesselBasic.setV_De_Tem_Shell(v_De_Tem_Shell);
			}else {
				if (!v_De_Tem_Shell_switch.isEmpty()) {
					vesselBasic.setV_De_Tem_C_Shell("壳程");
					vesselBasic.setV_De_Tem_Shell(v_De_Tem_Shell_switch);
				}
			}
        	String v_De_Tem_Jacket = sheet.getCell(33,i+1).getContents().trim();
        	String v_De_Tem_Jacket_switch = sheet.getCell(34,i+1).getContents().trim();
        	if (!v_De_Tem_Jacket.isEmpty()) {
        		vesselBasic.setV_De_Tem_C_Jacket("夹套");
        		vesselBasic.setV_De_Tem_Jacket(v_De_Tem_Jacket);
			}else {
				if (!v_De_Tem_Jacket_switch.isEmpty()) {
					vesselBasic.setV_De_Tem_C_Jacket("管程");
					vesselBasic.setV_De_Tem_Jacket(v_De_Tem_Jacket_switch);
				}
			}
        	
        	
        	String v_Wo_Pre_Shell = sheet.getCell(35,i+1).getContents().trim();
        	String v_Wo_Pre_Shell_switch = sheet.getCell(36,i+1).getContents().trim();
        	if (!v_Wo_Pre_Shell.isEmpty()) {
        		vesselBasic.setV_Wo_Pre_C_Shell("壳体");
        		vesselBasic.setV_Wo_Pre_Shell(v_Wo_Pre_Shell);
			}else {
				if (!v_Wo_Pre_Shell_switch.isEmpty()) {
					vesselBasic.setV_Wo_Pre_C_Shell("壳程");
					vesselBasic.setV_Wo_Pre_Shell(v_Wo_Pre_Shell_switch);
				}
			}
        	String v_Wo_Pre_Jacket = sheet.getCell(37,i+1).getContents().trim();
        	String v_Wo_Pre_Jacket_switch = sheet.getCell(38,i+1).getContents().trim();
        	if (!v_Wo_Pre_Jacket.isEmpty()) {
        		vesselBasic.setV_Wo_Pre_C_Jacket("夹套");
        		vesselBasic.setV_Wo_Pre_Jacket(v_Wo_Pre_Jacket);
			}else {
				if (!v_Wo_Pre_Jacket_switch.isEmpty()) {
					vesselBasic.setV_Wo_Pre_C_Jacket("管程");
					vesselBasic.setV_Wo_Pre_Jacket(v_Wo_Pre_Jacket_switch);
				}
			}
        	
        	String v_Wo_Tem_Shell = sheet.getCell(39,i+1).getContents().trim();
        	String v_Wo_Tem_Shell_switch = sheet.getCell(40,i+1).getContents().trim();
        	if (!v_Wo_Tem_Shell.isEmpty()) {
        		vesselBasic.setV_Wo_Tem_C_Shell("壳体");
        		vesselBasic.setV_Wo_Tem_Shell(v_Wo_Tem_Shell);
			}else {
				if (!v_Wo_Tem_Shell_switch.isEmpty()) {
					vesselBasic.setV_Wo_Tem_C_Shell("壳程");
					vesselBasic.setV_Wo_Tem_Shell(v_Wo_Tem_Shell_switch);
				}
			}
        	String v_Wo_Tem_Jacket = sheet.getCell(41,i+1).getContents().trim();
        	String v_Wo_Tem_Jacket_switch = sheet.getCell(42,i+1).getContents().trim();
        	if (!v_Wo_Tem_Jacket.isEmpty()) {
        		vesselBasic.setV_Wo_Tem_C_Jacket("夹套");
        		vesselBasic.setV_Wo_Tem_Jacket(v_Wo_Tem_Jacket);
			}else {
				if (!v_Wo_Tem_Jacket_switch.isEmpty()) {
					vesselBasic.setV_Wo_Tem_C_Jacket("管程");
					vesselBasic.setV_Wo_Tem_Jacket(v_Wo_Tem_Jacket_switch);
				}
			}
        	
        	String v_Med_Shell = sheet.getCell(43,i+1).getContents().trim();
        	String v_Med_Shell_switch = sheet.getCell(44,i+1).getContents().trim();
        	if (!v_Med_Shell.isEmpty()) {
        		vesselBasic.setV_Med_C_Shell("壳体");
        		vesselBasic.setV_Med_Shell(v_Med_Shell);
			}else {
				if (!v_Med_Shell_switch.isEmpty()) {
					vesselBasic.setV_Med_C_Shell("壳程");
					vesselBasic.setV_Med_Shell(v_Med_Shell_switch);
				}
			}
        	String v_Med_Jacket = sheet.getCell(45,i+1).getContents().trim();
        	String v_Med_Jacket_switch = sheet.getCell(46,i+1).getContents().trim();
        	if (!v_Med_Jacket.isEmpty()) {
        		vesselBasic.setV_Med_C_Jacket("夹套");
        		vesselBasic.setV_Med_Jacket(v_Med_Jacket);
			}else {
				if (!v_Med_Jacket_switch.isEmpty()) {
					vesselBasic.setV_Med_C_Jacket("管程");
					vesselBasic.setV_Med_Jacket(sheet.getCell(46,i+1).getContents().trim());
				}
			}
        	
        	vesselBasic.setV_Cor_Seal_Head(sheet.getCell(47,i+1).getContents().trim());
        	vesselBasic.setV_Cor_Barrel_Body(sheet.getCell(48,i+1).getContents().trim());	
        	
        	vesselBasic.setV_Ma_Seal_Head(sheet.getCell(49,i+1).getContents().trim());
        	vesselBasic.setV_Ma_Barrel_Body(sheet.getCell(50,i+1).getContents().trim());
        	String v_Ma_Jacket = sheet.getCell(51,i+1).getContents().trim();
        	String v_Ma_Jacket_switch = sheet.getCell(52,i+1).getContents().trim();
        	if (!v_Ma_Jacket.isEmpty()) {
        		vesselBasic.setV_Ma_C_Jacket("夹套");
        		vesselBasic.setV_Ma_Jacket(v_Ma_Jacket);
			}else {
				if (!v_Ma_Jacket_switch.isEmpty()) {
					vesselBasic.setV_Ma_C_Jacket("换热管");
					vesselBasic.setV_Ma_Jacket(v_Ma_Jacket_switch);
				}
			}

        	vesselBasic.setV_Ma_Liner(sheet.getCell(53,i+1).getContents().trim());
        	vesselBasic.setV_Thi_Seal_Head(sheet.getCell(54,i+1).getContents().trim());
        	vesselBasic.setV_Thi_Barrel_Body(sheet.getCell(55,i+1).getContents().trim());
//          
        	String v_Thi_Jacket = sheet.getCell(56,i+1).getContents().trim();
        	String v_Thi_Jacket_switch = sheet.getCell(57,i+1).getContents().trim();
        	if (!v_Thi_Jacket.isEmpty()) {
        		vesselBasic.setV_Thi_C_Jacket("夹套");
        		vesselBasic.setV_Thi_Jacket(v_Thi_Jacket);
			}else {
				if (!v_Thi_Jacket_switch.isEmpty()) {
					vesselBasic.setV_Thi_C_Jacket("换热管");
					vesselBasic.setV_Thi_Jacket(v_Thi_Jacket_switch);
				}
			}
        	vesselBasic.setV_Thi_Liner(sheet.getCell(58,i+1).getContents().trim());
        	vesselBasic.setV_M_Ins_ID(sheet.getCell(59,i+1).getContents().trim());
        	vesselBasic.setV_M_Ins_Permission_ID(sheet.getCell(60,i+1).getContents().trim());
        	
        	/**
          	 * 处理安装单位
          	 */
          	String insCompanyName =sheet.getCell(61,i+1).getContents().trim();//获得制造单位名称
          	if (!insCompanyName.isEmpty()) {
          		Company company = companyService.findByCompanyName(insCompanyName);
              	if (company==null) {																																																			
              		company = new Company();
              		company.setName(insCompanyName);
              		company.setType(2);
    			}
              	company.setContactsPhone(sheet.getCell(62,i+1).getContents().trim());
          		if (company.getId()==0) {
          			companyService.save(company);
				}else {
					companyService.update(company);
				}
          		
              	vesselBasic.setV_Install_Com(company);
			}
        	
        	
        	vesselBasic.setV_M_Ins_End_Date(ExcelUtils.getTheFormatDate(sheet.getCell(63,i+1)));
        	vesselBasic.setV_Install_Type(sheet.getCell(64,i+1).getContents().trim());
        	vesselBasic.setV_Pro_Ins_Type(sheet.getCell(65,i+1).getContents().trim());
        	vesselBasic.setV_Start_Date(ExcelUtils.getTheFormatDate(sheet.getCell(66,i+1)));
        	vesselBasic.setV_Inuse_Com_ID(sheet.getCell(67,i+1).getContents().trim());
        	vesselBasic.setV_Reg_Com(sheet.getCell(68,i+1).getContents().trim());
        	vesselBasic.setV_Use_ID(sheet.getCell(69,i+1).getContents().trim());
        	vesselBasic.setV_Use_Addr(sheet.getCell(70,i+1).getContents().trim());
          if (vesselBasic.getId()==0) {
          		vesselBasicService.save(vesselBasic);
			}else {
				vesselBasicService.update(vesselBasic);
			}
          	
  	
      }
		
	}

}
