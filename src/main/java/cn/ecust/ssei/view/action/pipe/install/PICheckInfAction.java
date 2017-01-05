package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PICheckInf;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piCheckInfAction")
@Scope("prototype")
public class PICheckInfAction extends PipeInstallBaseAction<PICheckInf>{

	public String delete() throws Exception{
		long id = preDelete();
		piCheckInfService.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piCheckInfService.update(model);
		return "toPipeInstallMenuList";
	}
	
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PICheckInf piCheckInf = pipeInstall.getPiCheckInf();
		piCheckInfService.generateFile(piCheckInf);
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PICheckInf piCheckInf = pipeInstall.getPiCheckInf();
		String fileRootpath = MyFileUtils.getFilePath(piCheckInf.getId(), "piCheckInf", 3);
		String fileName = piCheckInf.getId()+"_piCheckInf.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
}
