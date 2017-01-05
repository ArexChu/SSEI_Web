package cn.ecust.ssei.view.action.pipe.pipemaintain.detail;

import java.io.File;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeDetailBaseAction;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeDetailMaintain;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeHardTest;
import cn.ecust.ssei.util.MyFileUtils;
@Controller
@Scope("prototype")
public class PipeHardTestAction  extends PipeDetailBaseAction<PipeHardTest>{

	/**
	 * 删除
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception{
		long id =preDelete();
		pipeHardTestService.delete(id);
		return "toPipeDetailMaintainList";
	}
	
	public String edit() throws Exception{
		pipeHardTestService.update(model);
		return "toPipeDetailMaintainList";
	}
	
	public String generateFile() throws Exception{
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		PipeHardTest getPipeHardTest = pipeDetailMaintain.getPipeHardTest();
		pipeHardTestService.generateFile(getPipeHardTest);	
		return "toPipeDetailMaintainDocumentList";
	}
	
	public String download()throws Exception {
		String path = makeSurePath();
		return super.out(path);
	}
	
	public String deleteFile() throws Exception{
		String path = makeSurePath();
		File file = new File(path);
		file.delete();
		return "toPipeDetailMaintainDocumentList";
	}
	
	private String makeSurePath() {
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		PipeHardTest pipeHardTest = pipeDetailMaintain.getPipeHardTest();
		String fileRootpath = MyFileUtils.getFilePath(pipeHardTest.getId(), "pipeHardTest", 3);
		String fileName = pipeHardTest.getId()+"_pipeHardTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	
	
	
}
