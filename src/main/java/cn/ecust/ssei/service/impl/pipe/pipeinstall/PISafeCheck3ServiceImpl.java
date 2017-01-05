package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck3;
import cn.ecust.ssei.service.pipe.pipeinstall.PISafeCheck3Service;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PISafeCheck3ServiceImpl extends DaoSupportImpl<PISafeCheck3> implements PISafeCheck3Service{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PISafeCheck3 piSafeCheck3) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piSafeCheck3.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piSafeCheck3.getId(), "piSafeCheck3", Constant.PIPE_DOCUMENT_UPLOAD, "piSafeCheck3.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piSafeCheck3);
		HashMap<String, String> map1= BeanUtils.beanToMap(piSafeCheck3.getPipeInstall());
		map.putAll(map1);
		String pi_Leak_1=piSafeCheck3.getPi_Leak_1();
		genTempDate("temp1", pi_Leak_1,map);
	
		String pi_Leak_2=piSafeCheck3.getPi_Leak_2();
		genTempDate("temp2", pi_Leak_2,map);
		
		String pi_Leak_3=piSafeCheck3.getPi_Leak_3();
		genTempDate("temp3", pi_Leak_3,map);
		
		String pi_Leak_4=piSafeCheck3.getPi_Leak_4();
		genTempDate("temp4", pi_Leak_4,map);
		
		String pi_Leak_5=piSafeCheck3.getPi_Leak_5();
		genTempDate("temp5", pi_Leak_5,map);
		
		String pi_Leak_6=piSafeCheck3.getPi_Leak_7();
		genTempDate("temp6", pi_Leak_6,map);
		
		String pi_Leak_7=piSafeCheck3.getPi_Leak_7();
		genTempDate("temp7", pi_Leak_7,map);
		
		String pi_Leak_8=piSafeCheck3.getPi_Leak_8();
		genTempDate("temp8", pi_Leak_8,map);
		

		
		String pi_SafeEqu_1=piSafeCheck3.getPi_SafeEqu_1();
		genTempDate("temp11", pi_SafeEqu_1,map);
	
		String pi_SafeEqu_2=piSafeCheck3.getPi_SafeEqu_2();
		genTempDate("temp12", pi_SafeEqu_2,map);
		
		String pi_SafeEqu_3=piSafeCheck3.getPi_SafeEqu_3();
		genTempDate("temp13", pi_SafeEqu_3,map);
		
		String pi_SafeEqu_4=piSafeCheck3.getPi_SafeEqu_4();
		genTempDate("temp14", pi_SafeEqu_4,map);
		
		String pi_SafeEqu_5=piSafeCheck3.getPi_SafeEqu_5();
		genTempDate("temp15", pi_SafeEqu_5,map);
		
		String pi_SafeEqu_6=piSafeCheck3.getPi_SafeEqu_7();
		genTempDate("temp16", pi_SafeEqu_6,map);
		
		String pi_SafeEqu_7=piSafeCheck3.getPi_SafeEqu_7();
		genTempDate("temp17", pi_SafeEqu_7,map);
		
		String pi_SafeEqu_8=piSafeCheck3.getPi_SafeEqu_8();
		genTempDate("temp18", pi_SafeEqu_8,map);
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
