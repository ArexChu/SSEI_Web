package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIConclusion;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piConclusionAction")
@Scope("prototype")
public class PIConclusionAction extends PipeInstallBaseAction<PIConclusion>{


	public String delete() throws Exception{
		long id = preDelete();
		piConclusionService.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piConclusionService.update(model);
		return "toPipeInstallMenuList";
	}
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PIConclusion piConclusion = pipeInstall.getPiConclusion();
		piConclusionService.generateFile(piConclusion);	
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PIConclusion piConclusion = pipeInstall.getPiConclusion();
		String fileRootpath = MyFileUtils.getFilePath(piConclusion.getId(), "piConclusion", 3);
		String fileName = piConclusion.getId()+"_piConclusion.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}

}
