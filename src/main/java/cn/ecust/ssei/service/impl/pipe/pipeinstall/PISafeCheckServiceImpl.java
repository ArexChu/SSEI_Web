package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck;
import cn.ecust.ssei.service.pipe.pipeinstall.PISafeCheckService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PISafeCheckServiceImpl extends DaoSupportImpl<PISafeCheck> implements PISafeCheckService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PISafeCheck piSafeCheck) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piSafeCheck.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piSafeCheck.getId(), "piSafeCheck", Constant.PIPE_DOCUMENT_UPLOAD, "piSafeCheck.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piSafeCheck);
		HashMap<String, String> map1= BeanUtils.beanToMap(piSafeCheck.getPipeInstall());
		map.putAll(map1);
		String pi_Wel_Ma_1=piSafeCheck.getPi_Wel_Ma_1();
		genTempDate("temp1", pi_Wel_Ma_1,map);
	
		String pi_Wel_Ma_2=piSafeCheck.getPi_Wel_Ma_2();
		genTempDate("temp2", pi_Wel_Ma_2,map);
		
		String pi_Wel_Ma_3=piSafeCheck.getPi_Wel_Ma_3();
		genTempDate("temp3", pi_Wel_Ma_3,map);
		
		String pi_Wel_Ma_4=piSafeCheck.getPi_Wel_Ma_4();
		genTempDate("temp4", pi_Wel_Ma_4,map);
		
		String pi_Wel_Ma_5=piSafeCheck.getPi_Wel_Ma_5();
		genTempDate("temp5", pi_Wel_Ma_5,map);
		
		String pi_Wel_Ma_6=piSafeCheck.getPi_Wel_Ma_7();
		genTempDate("temp6", pi_Wel_Ma_6,map);
		
		String pi_Wel_Ma_7=piSafeCheck.getPi_Wel_Ma_7();
		genTempDate("temp7", pi_Wel_Ma_7,map);
		
		String pi_Wel_Ma_8=piSafeCheck.getPi_Wel_Ma_8();
		genTempDate("temp8", pi_Wel_Ma_8,map);
		
		String pi_Wel_Ma_9=piSafeCheck.getPi_Wel_Ma_9();
		genTempDate("temp9", pi_Wel_Ma_9,map);
						
		String pi_Wel_Ma_10=piSafeCheck.getPi_Wel_Ma_10();
		genTempDate("temp10", pi_Wel_Ma_10,map);
		
		String pi_Wel_Qua_1=piSafeCheck.getPi_Wel_Qua_1();
		genTempDate("temp11", pi_Wel_Qua_1,map);
		
		String pi_Wel_Qua_2=piSafeCheck.getPi_Wel_Qua_2();
		genTempDate("temp12", pi_Wel_Qua_2,map);
		
		String pi_Wel_Qua_3=piSafeCheck.getPi_Wel_Qua_3();
		genTempDate("temp13", pi_Wel_Qua_3,map);
		
		String pi_Wel_Qua_4=piSafeCheck.getPi_Wel_Qua_4();
		genTempDate("temp14", pi_Wel_Qua_4,map);
		
		String pi_Wel_Qua_5=piSafeCheck.getPi_Wel_Qua_5();
		genTempDate("temp15", pi_Wel_Qua_5,map);
		
		String pi_Wel_Qua_6=piSafeCheck.getPi_Wel_Qua_6();
		genTempDate("temp16", pi_Wel_Qua_6,map);
		
		String pi_Wel_Qua_7=piSafeCheck.getPi_Wel_Qua_7();
		genTempDate("temp17", pi_Wel_Qua_7,map);
		
		String pi_Wel_Qua_8=piSafeCheck.getPi_Wel_Qua_8();
		genTempDate("temp18", pi_Wel_Qua_8,map);
		helper.toWord(templetePath, filePath, map);
		
	}
	
	private void genTempDate(String string, String name, HashMap<String, String> map) {
		if (name==null) {
			name=",,,,,,,,";
		}
		if(name.lastIndexOf(',')==name.length()-1){
			name=name+" ";
		}
		String[] temp = name.split(",");
		for (int i = 1; i <= temp.length; i++) {
			if (temp[i-1].equals("undefined")) {
				temp[i-1]="";
			}
			map.put("#"+string+"_"+i+"#", temp[i-1]);
		}
		
	}
	
	
}
