package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piSafeCheckAction")
@Scope("prototype")
public class PISafeCheckAction extends PipeInstallBaseAction<PISafeCheck>{

	public String delete() throws Exception{
		long id = preDelete();
		piSafeCheckService.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piSafeCheckService.update(model);
		return "toPipeInstallMenuList";
	}
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PISafeCheck piSafeCheck = pipeInstall.getPiSafeCheck();
		piSafeCheckService.generateFile(piSafeCheck);
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PISafeCheck piSafeCheck = pipeInstall.getPiSafeCheck();
		String fileRootpath = MyFileUtils.getFilePath(piSafeCheck.getId(), "piSafeCheck", 3);
		String fileName = piSafeCheck.getId()+"_piSafeCheck.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}

}
