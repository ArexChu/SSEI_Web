package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIReview;
import cn.ecust.ssei.service.pipe.pipeinstall.PIReviewService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PIReviewServiceImpl extends DaoSupportImpl<PIReview> implements PIReviewService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PIReview piReview) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piReview.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piReview.getId(), "piReview", Constant.PIPE_DOCUMENT_UPLOAD, "piReview.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piReview);
		HashMap<String, String> map1= BeanUtils.beanToMap(piReview.getPipeInstall());
		map.putAll(map1);
		String pi_Rev_value1=piReview.getPi_Rev_value1();
		genTempDate("temp1", pi_Rev_value1, map);
		String pi_Rev_value2=piReview.getPi_Rev_value2();
		genTempDate("temp2", pi_Rev_value2, map);
		
		String pi_Rev_value3=piReview.getPi_Rev_value3();
		genTempDate("temp3", pi_Rev_value3, map);
		
		String pi_Rev_value4=piReview.getPi_Rev_value4();
		genTempDate("temp4", pi_Rev_value4, map);
		
		String pi_Rev_value5=piReview.getPi_Rev_value5();
		genTempDate("temp5", pi_Rev_value5, map);
		
		String pi_Rev_value6=piReview.getPi_Rev_value6();
		genTempDate("temp6", pi_Rev_value6, map);
		
		String pi_Rev_value7=piReview.getPi_Rev_value7();
		genTempDate("temp7", pi_Rev_value7, map);
		
		String pi_Rev_value8=piReview.getPi_Rev_value8();
		genTempDate("temp8", pi_Rev_value8, map);
		
		String pi_Rev_value9=piReview.getPi_Rev_value9();
		genTempDate("temp9", pi_Rev_value9, map);
		
		String pi_Rev_value10=piReview.getPi_Rev_value10();
		genTempDate("temp10", pi_Rev_value10, map);
		
		String pi_Rev_value11=piReview.getPi_Rev_value11();
		genTempDate("temp11", pi_Rev_value11, map);
		
		String pi_Rev_value12=piReview.getPi_Rev_value12();
		genTempDate("temp12", pi_Rev_value12, map);
		
		String pi_Rev_value13=piReview.getPi_Rev_value13();
		genTempDate("temp13", pi_Rev_value13, map);
		
		String pi_Rev_value14=piReview.getPi_Rev_value14();
		genTempDate("temp14", pi_Rev_value14, map);
	
		String pi_Rev_value15=piReview.getPi_Rev_value15();
		genTempDate("temp15", pi_Rev_value15, map);
		
		String pi_Rev_value16=piReview.getPi_Rev_value16();
		genTempDate("temp16", pi_Rev_value16, map);
		
		String pi_Rev_value17=piReview.getPi_Rev_value17();
		genTempDate("temp17", pi_Rev_value17, map);
	
		String pi_Rev_value18=piReview.getPi_Rev_value18();
		genTempDate("temp18", pi_Rev_value18, map);
		
		String pi_Rev_value19=piReview.getPi_Rev_value19();
		genTempDate("temp19", pi_Rev_value19, map);
		
		String pi_Rev_value20=piReview.getPi_Rev_value20();
		genTempDate("temp20", pi_Rev_value20, map);
		
		helper.toWord(templetePath, filePath, map);
		
	}
	//1,认可,1,1
	
	private void genTempDate(String string, String name, HashMap<String, String> map) {
		if (name==null) {
			name=",,,,,,,,";
		}
		if(name.lastIndexOf(',')==name.length()-1){
			name=name+" ";
		}
		String[] temp = name.split(",");
		if (temp[1].equals("认可")) {
			map.put("#"+string+"_2#", "√");
			map.put("#"+string+"_3#", "");
			map.put("#"+string+"_4#", "");
		}else if (temp[1].equals("需重评")) {
			map.put("#"+string+"_2#", "");
			map.put("#"+string+"_3#", "√");
			map.put("#"+string+"_4#", "");
		}else if (temp[1].equals("需重拍")) {
			map.put("#"+string+"_2#", "");
			map.put("#"+string+"_3#", "");
			map.put("#"+string+"_4#", "√");
		} else {
			map.put("#"+string+"_2#", "");
			map.put("#"+string+"_3#", "");
			map.put("#"+string+"_4#", "");
		}	
		map.put("#"+string+"_1#", temp[0]);
		map.put("#"+string+"_5#", temp[2]);
		map.put("#"+string+"_6#", temp[3]);
	}

}
