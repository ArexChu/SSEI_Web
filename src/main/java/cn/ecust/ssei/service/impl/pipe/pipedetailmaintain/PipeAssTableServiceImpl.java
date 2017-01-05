package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeAssTable;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeAssTableService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class PipeAssTableServiceImpl extends DaoSupportImpl<PipeAssTable> implements PipeAssTableService{

	
	@SuppressWarnings("unchecked")
	public void generateFile(PipeAssTable pipeAssTable) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeAssTable.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeAssTable.getId(), "pipeAssTable", Constant.PIPE_DOCUMENT_UPLOAD, "pipeAssTable.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeAssTable);
		helper.toWord(templetePath, filePath, map);	
	}

}
