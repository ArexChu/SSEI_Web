package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIBasic;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piBasicAction")
@Scope("prototype")
public class PIBasciAction extends PipeInstallBaseAction<PIBasic>{

	public String delete() throws Exception{
		long id = preDelete();
		piBasicService.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piBasicService.update(model);
		return "toPipeInstallMenuList";
	}
	
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PIBasic piBasic = pipeInstall.getPiBasic();
		piBasicService.generateFile(piBasic);	
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PIBasic piBasic = pipeInstall.getPiBasic();
		String fileRootpath = MyFileUtils.getFilePath(piBasic.getId(), "piBasic", 3);
		String fileName = piBasic.getId()+"_piBasic.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
}
