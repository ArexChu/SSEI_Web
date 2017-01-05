package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck1;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piSafeCheck1Action")
@Scope("prototype")
public class PISafeCheck1Action extends PipeInstallBaseAction<PISafeCheck1>{

	public String delete() throws Exception{
		long id = preDelete();
		piSafeCheck1Service.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piSafeCheck1Service.update(model);
		return "toPipeInstallMenuList";
	}
	
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PISafeCheck1 piSafeCheck1 = pipeInstall.getPiSafeCheck1();
		piSafeCheck1Service.generateFile(piSafeCheck1);
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PISafeCheck1 piSafeCheck1 = pipeInstall.getPiSafeCheck1();
		String fileRootpath = MyFileUtils.getFilePath(piSafeCheck1.getId(), "piSafeCheck1", 3);
		String fileName = piSafeCheck1.getId()+"_piSafeCheck1.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
}
