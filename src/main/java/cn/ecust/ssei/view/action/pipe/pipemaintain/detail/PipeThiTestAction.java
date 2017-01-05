package cn.ecust.ssei.view.action.pipe.pipemaintain.detail;

import java.io.File;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeDetailBaseAction;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeDetailMaintain;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeThiTest;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class PipeThiTestAction  extends PipeDetailBaseAction<PipeThiTest> {

	/**
	 * 删除
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception{
		long id =preDelete();
		pipeThiTestService.delete(id);
		return "toPipeDetailMaintainList";
	}
	
	public String edit() throws Exception{
		pipeThiTestService.update(model);
		return "toPipeDetailMaintainList";
	}
	
	
	public String generateFile() throws Exception{
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		PipeThiTest pipeThiTest = pipeDetailMaintain.getPipeThiTest();
		pipeThiTestService.generateFile(pipeThiTest);	
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
		PipeThiTest pipeThiTest = pipeDetailMaintain.getPipeThiTest();
		String fileRootpath = MyFileUtils.getFilePath(pipeThiTest.getId(), "pipeThiTest", 3);
		String fileName = pipeThiTest.getId()+"_pipeThiTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}	
	
	
}
