package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PILeftProblem;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piLeftProblemAction")
@Scope("prototype")
public class PILeftProblemAction extends PipeInstallBaseAction<PILeftProblem>{

	public String delete() throws Exception{
		long id = preDelete();
		piLeftProblemService.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piLeftProblemService.update(model);
		return "toPipeInstallMenuList";
	}
	
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PILeftProblem piLeftProblem = pipeInstall.getPiLeftProblem();
		piLeftProblemService.generateFile(piLeftProblem);
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PILeftProblem piLeftProblem = pipeInstall.getPiLeftProblem();
		String fileRootpath = MyFileUtils.getFilePath(piLeftProblem.getId(), "piLeftProblem", 3);
		String fileName = piLeftProblem.getId()+"_piLeftProblem.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
}
