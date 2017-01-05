package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck3;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piSafeCheck3Action")
@Scope("prototype")
public class PISafeCheck3Action extends PipeInstallBaseAction<PISafeCheck3>{

	public String delete() throws Exception{
		long id = preDelete();
		piSafeCheck3Service.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piSafeCheck3Service.update(model);
		return "toPipeInstallMenuList";
	}
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PISafeCheck3 piSafeCheck3 = pipeInstall.getPiSafeCheck3();
		piSafeCheck3Service.generateFile(piSafeCheck3);
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PISafeCheck3 piSafeCheck3 = pipeInstall.getPiSafeCheck3();
		String fileRootpath = MyFileUtils.getFilePath(piSafeCheck3.getId(), "piSafeCheck3", 3);
		String fileName = piSafeCheck3.getId()+"_piSafeCheck3.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	
}
