package cn.ecust.ssei.service.impl.pipe;

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

import org.springframework.stereotype.Service;

import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.service.CompanyService;
import cn.ecust.ssei.service.pipe.PipeBasciService;
import cn.ecust.ssei.service.pipe.PipeBasicExcelService;
import cn.ecust.ssei.util.ExcelUtils;

@Service
public class PipeBasciExcelServiceImpl implements PipeBasicExcelService {
	
	@Resource
	private CompanyService companyService;
	@Resource
	private PipeBasciService pipeBasciService;
	
	@Override
	public void createExcel(OutputStream os, List<PipeBasic> list) throws WriteException,IOException {
		  //创建工作薄
        WritableWorkbook workbook = Workbook.createWorkbook(os);
        //创建新的一页
        WritableSheet sheet = workbook.createSheet("First Sheet",0);
        //创建要显示的内容,创建一个单元格，第一个参数为列坐标，第二个参数为行坐标，第三个参数为内容
        Label label;
        String[] cStrings ={"序号","管道名称","管段编号","系统编号","注册代码","公称直径","公称厚度","起点位置",
        "止点位置","管道长度(m)","装置名称","设计压力","最高工作压力","工作压力","设计温度","最高工作温度",
        "工作温度","工作介质","安全状况等级","管子材料牌号","管道级别","工艺图号","管道标识","对接焊口数量",
        "角接焊口数量","总焊口数量","三通数量","弯头数量","变径管数量","绝热层材料","绝热层厚度","防腐层材料",
        "腐蚀裕量","轴侧图数","设计单位","安装单位","安装年月","投用年月","备注","敷设方式",
        "设计规范","安装与验收规范","管道规格","下次全面检验日期","使用证号","使用单位"}; 
        for (int i = 0; i < cStrings.length; i++) {
        	label=new Label(i,0,cStrings[i]);
        	sheet.addCell(label);
		}
        PipeBasic pipeBasic;
        for (int j = 0; j < list.size(); j++) {
			pipeBasic = list.get(j);
			label=new Label(0,j+1,j+1+"");
			sheet.addCell(label);
			label=new Label(1,j+1,pipeBasic.getP_Name());
			sheet.addCell(label);
			label=new Label(2,j+1,pipeBasic.getP_ID());
			sheet.addCell(label);
			label=new Label(3,j+1,pipeBasic.getP_Sys());
			sheet.addCell(label);
			label=new Label(4,j+1,pipeBasic.getP_Reg_Code());
			sheet.addCell(label);
			label=new Label(5,j+1,pipeBasic.getP_Out_Rad());
			sheet.addCell(label);
			label=new Label(6,j+1,pipeBasic.getP_Thi());
			sheet.addCell(label);
			label=new Label(7,j+1,pipeBasic.getP_Start_Pos());
			sheet.addCell(label);	
			label=new Label(8,j+1,pipeBasic.getP_End_Pos());
			sheet.addCell(label);	
			label=new Label(9,j+1,pipeBasic.getP_Len());
			sheet.addCell(label);	
			label=new Label(10,j+1,pipeBasic.getP_Equ_Name());
			sheet.addCell(label);	
			label=new Label(11,j+1,pipeBasic.getP_De_Pre());
			sheet.addCell(label);	
			label=new Label(12,j+1,pipeBasic.getP_Max_Pre());
			sheet.addCell(label);
			label=new Label(13,j+1,pipeBasic.getP_Wo_Pre());
			sheet.addCell(label);	
			label=new Label(14,j+1,pipeBasic.getP_De_Tem());
			sheet.addCell(label);	
			label=new Label(15,j+1,pipeBasic.getP_Max_Tem());
			sheet.addCell(label);	
			label=new Label(16,j+1,pipeBasic.getP_Wo_Tem());
			sheet.addCell(label);	
			label=new Label(17,j+1,pipeBasic.getP_Wo_Med());
			sheet.addCell(label);	
			label=new Label(18,j+1,pipeBasic.getP_Sec_Rank());
			sheet.addCell(label);	
			label=new Label(19,j+1,pipeBasic.getP_Ma_Gra());
			sheet.addCell(label);	
			label=new Label(20,j+1,pipeBasic.getP_Gra());
			sheet.addCell(label);
			label=new Label(21,j+1,pipeBasic.getP_Pro_Num());
			sheet.addCell(label);	
			label=new Label(22,j+1,pipeBasic.getP_Sign());
			sheet.addCell(label);	
			label=new Label(23,j+1,pipeBasic.getP_Butt_Joint());
			sheet.addCell(label);	
			label=new Label(24,j+1,pipeBasic.getP_Corner_Joint());
			sheet.addCell(label);	
			label=new Label(25,j+1,pipeBasic.getP_Total_Joint());
			sheet.addCell(label);	
			label=new Label(26,j+1,pipeBasic.getP_T_Cock());
			sheet.addCell(label);	
			label=new Label(27,j+1,pipeBasic.getP_Elbow());
			sheet.addCell(label);	
			label=new Label(28,j+1,pipeBasic.getP_Reducer());
			sheet.addCell(label);	
			label=new Label(29,j+1,pipeBasic.getP_Ins_Ma());
			sheet.addCell(label);	
			label=new Label(30,j+1,pipeBasic.getP_Ins_Thi());
			sheet.addCell(label);
			label=new Label(31,j+1,pipeBasic.getP_Pro_Ma());
			sheet.addCell(label);
			label=new Label(32,j+1,pipeBasic.getP_Pro_Mar());
			sheet.addCell(label);
			label=new Label(33,j+1,pipeBasic.getP_Axial_View());
			sheet.addCell(label);
			label=new Label(34,j+1,pipeBasic.getP_De_Com());
			sheet.addCell(label);
			label=new Label(35,j+1,pipeBasic.getP_Ins_Com());
			sheet.addCell(label);
			label=new Label(36,j+1,pipeBasic.getP_Install_Date());
			sheet.addCell(label);
			label=new Label(37,j+1,pipeBasic.getP_Use_Date());
			sheet.addCell(label);
			label=new Label(38,j+1,pipeBasic.getP_Comment());
			sheet.addCell(label);
			label=new Label(39,j+1,pipeBasic.getP_Lay());
			sheet.addCell(label);
			label=new Label(40,j+1,pipeBasic.getP_De_Norm());
			sheet.addCell(label);
			label=new Label(41,j+1,pipeBasic.getP_Ins_Norm());
			sheet.addCell(label);
			label=new Label(42,j+1,pipeBasic.getP_Out_Rad()+"*"+pipeBasic.getP_Thi());
			sheet.addCell(label);
			label=new Label(43,j+1,pipeBasic.getNextDetailMaintainDate());
			sheet.addCell(label);
			label=new Label(44,j+1,pipeBasic.getP_Cer_Num());
			sheet.addCell(label);
			if(pipeBasic.getCompany()!=null){
				label=new Label(45,j+1,pipeBasic.getCompany().getName());
				sheet.addCell(label);
			}			
		} 
        //把创建的内容写入到输出流中，并关闭输出流
        workbook.write();
        workbook.close();
        os.close();
		
	}

	@Override
	public void readExcel(File document) throws BiffException, IOException  {
		Workbook wb = Workbook.getWorkbook(document);//从文件流中取得Excel工作区对象
		Sheet sheet = wb.getSheet(0);//从工作区中取得页，取得这个对象的时候既可以用名称来获得，也可以用序号。
		for(int i=0; i < sheet.getRows()-1; i++){
			String p_ID =sheet.getCell(2,i+1).getContents().trim();//获得管道编号
			if(!p_ID.isEmpty()){
				PipeBasic pipeBasic=pipeBasciService.getByPipeId(p_ID);
	          	if (pipeBasic==null) {
	          		pipeBasic=new PipeBasic();	
				}
	          	pipeBasic.setP_ID(p_ID);
	          	
          	/**
          	 * 处理使用公司
          	 */
          	String companyName =sheet.getCell(sheet.getColumns()-1,i+1).getContents().trim();//获得使用公司名称
          	if (!companyName.isEmpty()) {
          		Company company = companyService.findByCompanyName(companyName);
              	if (company==null) {
              		company = new Company();
              		company.setName(companyName);
              		company.setType(1);
    				}
              	pipeBasic.setCompany(company);
			}

        	/**
          	 * 处理设计公司
          	 */
          	String desCompanyName =sheet.getCell(34,i+1).getContents().trim();//获得设计公司名称
          	if (!desCompanyName.isEmpty()) {
          		Company company = companyService.findByCompanyName(desCompanyName);
              	if (company==null) {
              		company = new Company();
              		company.setName(desCompanyName);
              		company.setType(2);
              		companyService.save(company);
    				}
              	pipeBasic.setP_De_Com(desCompanyName);
			}
          	
          	/**
          	 * 处理安装公司
          	 */
          	String insCompanyName =sheet.getCell(35,i+1).getContents().trim();//获得设计公司名称
          	if (!insCompanyName.isEmpty()) {
          		Company company = companyService.findByCompanyName(insCompanyName);
              	if (company==null) {
              		company = new Company();
              		company.setName(insCompanyName);
              		company.setType(2);
              		companyService.save(company);
    				}
              	pipeBasic.setP_Ins_Com(insCompanyName);
			}
          	
          	pipeBasic.setP_checkType("1");//管道为单位
          	pipeBasic.setP_submited("2");//已提交
          	
          	
          	
          	pipeBasic.setP_Name(sheet.getCell(1,i+1).getContents().trim());
          	pipeBasic.setP_Sys(sheet.getCell(3,i+1).getContents().trim());
          	pipeBasic.setP_Reg_Code(sheet.getCell(4,i+1).getContents().trim());
          	pipeBasic.setP_Out_Rad(sheet.getCell(5,i+1).getContents().trim());
          	pipeBasic.setP_Thi(sheet.getCell(6,i+1).getContents().trim());
          	pipeBasic.setP_Start_Pos(sheet.getCell(7,i+1).getContents().trim());
          	pipeBasic.setP_End_Pos(sheet.getCell(8,i+1).getContents().trim());
          	pipeBasic.setP_Len(sheet.getCell(9,i+1).getContents().trim());
          	pipeBasic.setP_Equ_Name(sheet.getCell(10,i+1).getContents().trim());
          	pipeBasic.setP_De_Pre(sheet.getCell(11,i+1).getContents().trim());
          	pipeBasic.setP_Max_Pre(sheet.getCell(12,i+1).getContents().trim());
          	pipeBasic.setP_Wo_Pre(sheet.getCell(13,i+1).getContents().trim());
          	pipeBasic.setP_De_Tem(sheet.getCell(14,i+1).getContents().trim());
          	pipeBasic.setP_Max_Tem(sheet.getCell(15,i+1).getContents().trim());
          	pipeBasic.setP_Wo_Tem(sheet.getCell(16,i+1).getContents().trim());
          	pipeBasic.setP_Wo_Med(sheet.getCell(17,i+1).getContents().trim());
          	pipeBasic.setP_Sec_Rank(sheet.getCell(18,i+1).getContents().trim());
          	pipeBasic.setP_Ma_Gra(sheet.getCell(19,i+1).getContents().trim());
          	pipeBasic.setP_Gra(sheet.getCell(20,i+1).getContents().trim());
          	pipeBasic.setP_Pro_Num(sheet.getCell(21,i+1).getContents().trim());
          	pipeBasic.setP_Sign(sheet.getCell(22,i+1).getContents().trim());
          	pipeBasic.setP_Butt_Joint(sheet.getCell(23,i+1).getContents().trim());
          	pipeBasic.setP_Corner_Joint(sheet.getCell(24,i+1).getContents().trim());
          	pipeBasic.setP_Total_Joint(sheet.getCell(25,i+1).getContents().trim());
          	pipeBasic.setP_T_Cock(sheet.getCell(26,i+1).getContents().trim());
          	pipeBasic.setP_Elbow(sheet.getCell(27,i+1).getContents().trim());
          	pipeBasic.setP_Reducer(sheet.getCell(28,i+1).getContents().trim());
          	pipeBasic.setP_Ins_Ma(sheet.getCell(29,i+1).getContents().trim());
          	pipeBasic.setP_Ins_Thi(sheet.getCell(30,i+1).getContents().trim());
          	pipeBasic.setP_Pro_Ma(sheet.getCell(31,i+1).getContents().trim());
          	pipeBasic.setP_Pro_Mar(sheet.getCell(32,i+1).getContents().trim());
          	pipeBasic.setP_Axial_View(sheet.getCell(33,i+1).getContents().trim());
          	pipeBasic.setP_Install_Date(ExcelUtils.getTheFormatDate(sheet.getCell(36,i+1)));
          	pipeBasic.setP_Use_Date(ExcelUtils.getTheFormatDate(sheet.getCell(36,i+1)));
          	pipeBasic.setP_Comment(sheet.getCell(38,i+1).getContents().trim());
          	pipeBasic.setP_Lay(sheet.getCell(39,i+1).getContents().trim());
          	pipeBasic.setP_De_Norm(sheet.getCell(40,i+1).getContents().trim());
          	pipeBasic.setP_Ins_Norm(sheet.getCell(41,i+1).getContents().trim());
          	//第40项的使用规格和前面的外经合壁厚重复
          	pipeBasic.setNextDetailMaintainDate(ExcelUtils.getTheFormatDate(sheet.getCell(36,i+1)));
          	pipeBasic.setP_Cer_Num(sheet.getCell(44,i+1).getContents().trim());
         	
          	if (pipeBasic.getId()==0) {
          		pipeBasciService.save(pipeBasic);
			}else {
				pipeBasciService.update(pipeBasic);
			}
          	
  	
      }
		}
	}


}
