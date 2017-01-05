package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck1;
import cn.ecust.ssei.service.pipe.pipeinstall.PISafeCheck1Service;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PISafeCheck1ServiceImpl extends DaoSupportImpl<PISafeCheck1> implements PISafeCheck1Service{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PISafeCheck1 piSafeCheck1) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piSafeCheck1.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piSafeCheck1.getId(), "piSafeCheck1", Constant.PIPE_DOCUMENT_UPLOAD, "piSafeCheck1.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piSafeCheck1);
		HashMap<String, String> map1= BeanUtils.beanToMap(piSafeCheck1.getPipeInstall());
		map.putAll(map1);
		String pi_Compen_1=piSafeCheck1.getPi_Compen_1();
		genTempDate("temp1", pi_Compen_1,map);
		String pi_Compen_2=piSafeCheck1.getPi_Compen_2();
		genTempDate("temp2", pi_Compen_2,map);
		String pi_Compen_3=piSafeCheck1.getPi_Compen_3();
		genTempDate("temp3", pi_Compen_3,map);
		String pi_Compen_4=piSafeCheck1.getPi_Compen_4();
		genTempDate("temp4", pi_Compen_4,map);
		String pi_Compen_5=piSafeCheck1.getPi_Compen_5();
		genTempDate("temp5", pi_Compen_5,map);
		String pi_Appurt_1=piSafeCheck1.getPi_Appurt_1();
		genTempDate("temp6", pi_Appurt_1,map);
		String pi_Appurt_2=piSafeCheck1.getPi_Appurt_2();
		genTempDate("temp7", pi_Appurt_2,map);
		String pi_Appurt_3=piSafeCheck1.getPi_Appurt_3();
		genTempDate("temp8", pi_Appurt_3,map);
		String pi_Appurt_4=piSafeCheck1.getPi_Appurt_4();
		genTempDate("temp9", pi_Appurt_4,map);
		String pi_Appurt_5=piSafeCheck1.getPi_Appurt_5();
		genTempDate("temp10", pi_Appurt_5,map);
		String pi_Cross_1=piSafeCheck1.getPi_Cross_1();
		genTempDate("temp11", pi_Cross_1,map);
		String pi_Cross_2=piSafeCheck1.getPi_Cross_2();
		genTempDate("temp12", pi_Cross_2,map);
		String pi_Cross_3=piSafeCheck1.getPi_Cross_3();
		genTempDate("temp13", pi_Cross_3,map);
		String pi_Cross_4=piSafeCheck1.getPi_Cross_4();
		genTempDate("temp14", pi_Cross_4,map);
		String pi_Cross_5=piSafeCheck1.getPi_Cross_5();
		genTempDate("temp15", pi_Cross_5,map);
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
