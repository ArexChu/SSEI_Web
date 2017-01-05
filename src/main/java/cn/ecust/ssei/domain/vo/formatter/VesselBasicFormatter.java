package cn.ecust.ssei.domain.vo.formatter;

import org.springframework.beans.BeanUtils;

import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vo.VesselBasicVo;

public class VesselBasicFormatter {
	
	public static VesselBasicVo formatterToVo(VesselBasic vesselBasic){
		 VesselBasicVo vesselBasicVo = new VesselBasicVo();
		 BeanUtils.copyProperties(vesselBasic, vesselBasicVo);
		 if (vesselBasic.getV_Use_Com()!=null) {
			 vesselBasicVo.setV_Use_Com(vesselBasic.getV_Use_Com().getName());
		}
		 if (vesselBasic.getV_De_Com()!=null) {
			 vesselBasicVo.setV_De_Com(vesselBasic.getV_De_Com().getName());
		}
		 if (vesselBasic.getV_Man_Com()!=null) {
			 vesselBasicVo.setV_Man_Com(vesselBasic.getV_Man_Com().getName());
		}
		 if (vesselBasic.getV_Install_Com()!=null) {
			 vesselBasicVo.setV_Install_Com(vesselBasic.getV_Install_Com().getName());
		}
		 return vesselBasicVo;
	}
	
	public static VesselBasic formatter(VesselBasicVo vesselBasicVo){
		VesselBasic vesselBasic = new VesselBasic();
		 BeanUtils.copyProperties(vesselBasicVo, vesselBasic);
		 //公司这几个外键暂时不处理
		 return vesselBasic;
	}

}
