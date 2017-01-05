package cn.ecust.ssei.view.action.pipe.pipemaintain.detail;

import java.io.File;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeDetailBaseAction;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeDetailMaintain;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipePreTest;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class PipePreTestAction  extends PipeDetailBaseAction<PipePreTest> {
	/**
	 * 删除
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception{
		long id =preDelete();
		pipePreTestService.delete(id);
		return "toPipeDetailMaintainList";
	}
	
	public String edit() throws Exception{
		pipePreTestService.update(model);
		return "toPipeDetailMaintainList";
	}
	
	public String generateFile() throws Exception{
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		PipePreTest pipePreTest = pipeDetailMaintain.getPipePreTest();
		pipePreTestService.generateFile(pipePreTest);	
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
		PipePreTest pipePreTest = pipeDetailMaintain.getPipePreTest();
		String fileRootpath = MyFileUtils.getFilePath(pipePreTest.getId(), "pipePreTest", 3);
		String fileName = pipePreTest.getId()+"_pipePreTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}	
	
	
}
