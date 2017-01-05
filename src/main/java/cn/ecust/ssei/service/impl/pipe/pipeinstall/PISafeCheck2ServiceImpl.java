package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck2;
import cn.ecust.ssei.service.pipe.pipeinstall.PISafeCheck2Service;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PISafeCheck2ServiceImpl extends DaoSupportImpl<PISafeCheck2> implements PISafeCheck2Service {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PISafeCheck2 piSafeCheck2) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piSafeCheck2.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piSafeCheck2.getId(), "piSafeCheck2", Constant.PIPE_DOCUMENT_UPLOAD, "piSafeCheck2.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piSafeCheck2);
		HashMap<String, String> map1= BeanUtils.beanToMap(piSafeCheck2.getPipeInstall());
		map.putAll(map1);
		String pi_InsPro_1=piSafeCheck2.getPi_InsPro_1();
		genTempDate("temp1", pi_InsPro_1,map);
	
		String pi_InsPro_2=piSafeCheck2.getPi_InsPro_2();
		genTempDate("temp2", pi_InsPro_2,map);
		
		String pi_InsPro_3=piSafeCheck2.getPi_InsPro_3();
		genTempDate("temp3", pi_InsPro_3,map);
		
		String pi_InsPro_4=piSafeCheck2.getPi_InsPro_4();
		genTempDate("temp4", pi_InsPro_4,map);
		
		String pi_InsPro_5=piSafeCheck2.getPi_InsPro_5();
		genTempDate("temp5", pi_InsPro_5,map);
		
		String pi_InsPro_6=piSafeCheck2.getPi_InsPro_7();
		genTempDate("temp6", pi_InsPro_6,map);
		
		String pi_InsPro_7=piSafeCheck2.getPi_InsPro_7();
		genTempDate("temp7", pi_InsPro_7,map);
		
		String pi_InsPro_8=piSafeCheck2.getPi_InsPro_8();
		genTempDate("temp8", pi_InsPro_8,map);
		
		String pi_InsPro_9=piSafeCheck2.getPi_InsPro_9();
		genTempDate("temp9", pi_InsPro_9,map);
						
		String pi_InsPro_10=piSafeCheck2.getPi_InsPro_10();
		genTempDate("temp10", pi_InsPro_10,map);
		
		String pi_Dry_1=piSafeCheck2.getPi_Dry_1();
		genTempDate("temp11", pi_Dry_1,map);
	
		String pi_Dry_2=piSafeCheck2.getPi_Dry_2();
		genTempDate("temp12", pi_Dry_2,map);
		
		String pi_Dry_3=piSafeCheck2.getPi_Dry_3();
		genTempDate("temp13", pi_Dry_3,map);
		
		String pi_Dry_4=piSafeCheck2.getPi_Dry_4();
		genTempDate("temp14", pi_Dry_4,map);
		
		String pi_Dry_5=piSafeCheck2.getPi_Dry_5();
		genTempDate("temp15", pi_Dry_5,map);
		
		String pi_Dry_6=piSafeCheck2.getPi_Dry_7();
		genTempDate("temp16", pi_Dry_6,map);
		
		String pi_Dry_7=piSafeCheck2.getPi_Dry_7();
		genTempDate("temp17", pi_Dry_7,map);
		
		String pi_Dry_8=piSafeCheck2.getPi_Dry_8();
		genTempDate("temp18", pi_Dry_8,map);
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
