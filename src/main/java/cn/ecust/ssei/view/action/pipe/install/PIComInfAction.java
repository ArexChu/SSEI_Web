package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIComInf;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piComInfAction")
@Scope("prototype")
public class PIComInfAction extends PipeInstallBaseAction<PIComInf>{

	public String delete() throws Exception{
		long id = preDelete();
		piComInfService.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piComInfService.update(model);
		return "toPipeInstallMenuList";
	}
	
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PIComInf piComInf = pipeInstall.getPiComInf();
		piComInfService.generateFile(piComInf);
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PIComInf piComInf = pipeInstall.getPiComInf();
		String fileRootpath = MyFileUtils.getFilePath(piComInf.getId(), "piComInf", 3);
		String fileName = piComInf.getId()+"_piComInf.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
}
