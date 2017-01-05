package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck2;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piSafeCheck2Action")
@Scope("prototype")
public class PISafeCheck2Action extends PipeInstallBaseAction<PISafeCheck2>{

	public String delete() throws Exception{
		long id = preDelete();
		piSafeCheck2Service.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piSafeCheck2Service.update(model);
		return "toPipeInstallMenuList";
	}
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PISafeCheck2 piSafeCheck2 = pipeInstall.getPiSafeCheck2();
		piSafeCheck2Service.generateFile(piSafeCheck2);
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PISafeCheck2 piSafeCheck2 = pipeInstall.getPiSafeCheck2();
		String fileRootpath = MyFileUtils.getFilePath(piSafeCheck2.getId(), "piSafeCheck2", 3);
		String fileName = piSafeCheck2.getId()+"_piSafeCheck2.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}

}
