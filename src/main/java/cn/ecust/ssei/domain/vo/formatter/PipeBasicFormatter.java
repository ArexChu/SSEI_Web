package cn.ecust.ssei.domain.vo.formatter;

import org.springframework.beans.BeanUtils;

import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.vo.PipeBasicVo;

public class PipeBasicFormatter {
	
	public static PipeBasicVo formatterToVo(PipeBasic pipeBasic){
		 PipeBasicVo pipeBasicVo = new PipeBasicVo();
		 BeanUtils.copyProperties(pipeBasic, pipeBasicVo);
		 if (pipeBasic.getCompany()!=null) {
			 pipeBasicVo.setCompany(pipeBasic.getCompany().getName());
		}
		
		 return pipeBasicVo;
	}

	public static PipeBasic formatter(PipeBasicVo pipeBasicVo) {
		PipeBasic pipeBasic = new PipeBasic();
		 BeanUtils.copyProperties(pipeBasicVo, pipeBasic);
		 //暂时未处理公司外键
		 return pipeBasic;
	}

}
