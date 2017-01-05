package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeMicroTest;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeMicroTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class PipeMicroTestServiceImpl extends DaoSupportImpl<PipeMicroTest> implements PipeMicroTestService  {

	@Override
	public void generateFile(PipeMicroTest pipeMicroTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeMicroTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeMicroTest.getId(), "pipeMicroTest", Constant.PIPE_DOCUMENT_UPLOAD, "pipeMicroTest.doc");
		
		
		JacobHelper helper = new JacobHelper();
		@SuppressWarnings("unchecked")
		HashMap<String, String> map= BeanUtils.beanToMap(pipeMicroTest);
		
		String p_Pos = pipeMicroTest.getP_Pos();
		p_Pos = genCheckBoxString("正常,碰撞,摩擦", p_Pos);
		map.put("#p_Pos#", p_Pos);
		
		String p_Str = pipeMicroTest.getP_Str();
		p_Str = genCheckBoxString("正常,翘曲,下沉,异常变形", p_Str);
		map.put("#p_Str#", p_Str);
		
		String p_Ins = pipeMicroTest.getP_Ins();
		p_Ins = genCheckBoxString("完好,破损,脱落,跑冷,无绝热层", p_Ins);
		map.put("#p_Ins#", p_Ins);
		
		String p_Pro = pipeMicroTest.getP_Pro();
		p_Pro = genCheckBoxString("完好,破损,脱落,无防腐层", p_Pro);
		map.put("#p_Pro#", p_Pro);
		
		String p_Hanger = pipeMicroTest.getP_Hanger();
		p_Hanger = genCheckBoxString("完好,间距不合理,脱落,变形,腐蚀,与管道接触处积水,恒力弹簧支吊架转体位移指示越限,变力弹簧支吊架偏斜,变力弹簧支吊架失载,刚性支吊架状态异常,吊杆损坏,吊杆异常,吊杆连接配件损坏,吊杆连接配件异常,转导向支架卡涩,承载结构变形,承载机构上主要受力焊接接头存在裂纹,支承辅助钢结构变形,支承辅助钢结构上主要受力焊接接头存在裂纹", p_Hanger);
		map.put("#p_Hanger#", p_Hanger);
		
		String p_Damper = pipeMicroTest.getP_Damper();
		p_Damper = genCheckBoxString("完好,位移异常,液压阻尼器液位正常,无", p_Damper);
		map.put("#p_Damper#", p_Damper);
		
		String p_Absorber = pipeMicroTest.getP_Absorber();
		p_Absorber = genCheckBoxString("完好,位移异常,无", p_Absorber);
		map.put("#p_Absorber#", p_Absorber);
		
		String p_Compen = pipeMicroTest.getP_Compen();
		p_Compen = genCheckBoxString("完好,损坏,未采用补偿器,不需要补偿器", p_Compen);
		map.put("#p_Compen#", p_Compen);
		
		String p_Valve = pipeMicroTest.getP_Valve();
		p_Valve = genCheckBoxString("完好,腐蚀,裂缝,缩孔,连接螺栓松动,操作不灵活,无", p_Valve);
		map.put("#p_Valve#", p_Valve);
		
		String p_Fla = pipeMicroTest.getP_Fla();
		p_Fla = genCheckBoxString("完好,偏口,紧固件不齐全,紧固件不符合要求,紧固件松动,紧固件腐蚀,无", p_Fla);
		map.put("#p_Fla#", p_Fla);
		
		String p_Exp = pipeMicroTest.getP_Exp();
		p_Exp = genCheckBoxString("完好,波纹管膨胀节划痕,波纹管膨胀节凹痕,波纹管膨胀节腐蚀,波纹管膨胀节开裂,波纹管膨胀节间距异常,波纹管膨胀节失稳,铰链型膨胀节铰链变形,铰链型膨胀节铰链脱落,铰链型膨胀节销轴变形,铰链型膨胀节销轴脱落,拉杆式膨胀节拉杆异常,拉杆式膨胀节螺栓异常,拉杆式膨胀节连接支座异常", p_Exp);
		map.put("#p_Exp#", p_Exp);
		
		String p_Cat_Pro = pipeMicroTest.getP_Cat_Pro();
		p_Cat_Pro = genCheckBoxString("完好,异常,损坏,无", p_Cat_Pro);
		map.put("#p_Cat_Pro#", p_Cat_Pro);
		
		
		String p_Creep = pipeMicroTest.getP_Creep();
		p_Creep = genCheckBoxString("完好,损坏,无", p_Creep);
		map.put("#p_Creep#", p_Creep);
		
		
		String p_Fla_Res = pipeMicroTest.getP_Fla_Res();
		p_Fla_Res = genCheckBoxString("合格,大于0.03Ω,无此项", p_Fla_Res);
		map.put("#p_Fla_Res#", p_Fla_Res);
		
		String p_Gro_Res = pipeMicroTest.getP_Gro_Res();
		p_Gro_Res = genCheckBoxString("合格,大于100Ω,无此项", p_Gro_Res);
		map.put("#p_Gro_Res#", p_Gro_Res);

		String p_Ide = pipeMicroTest.getP_Ide();
		p_Ide = genCheckBoxString("合格,标识错误,标识不清,无标识", p_Ide);
		map.put("#p_Ide#", p_Ide);
				
		String p_Component = pipeMicroTest.getP_Component();
		p_Component = genCheckBoxString("完好,裂缝,皱褶,重皮,碰伤,变形,腐蚀", p_Component);
		map.put("#p_Component#", p_Component);
					
		String p_Wel = pipeMicroTest.getP_Wel();
		p_Wel = genCheckBoxString("完好,裂纹,错边,咬边", p_Wel);
		map.put("#p_Wel#", p_Wel);
		
		String m_Start_Date = pipeMicroTest.getPipeDetailMaintain().getPipeMaintain().getM_Start_Date();
		String m_End_Date =pipeMicroTest.getPipeDetailMaintain().getPipeMaintain().getM_End_Date();
		map.put("#m_Start_Date#", m_Start_Date);
		map.put("#m_End_Date#", m_End_Date);
		helper.toWord(templetePath, filePath, map);	
		
	}
	
	

}
