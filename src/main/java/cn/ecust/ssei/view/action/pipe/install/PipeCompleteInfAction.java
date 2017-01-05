package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeCompleteInf;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="pipeCompleteInfAction")
@Scope("prototype")
public class PipeCompleteInfAction extends PipeInstallBaseAction<PipeCompleteInf>{

	public String delete() throws Exception{
		long id = preDelete();
		pipeCompleteInfService.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		pipeCompleteInfService.update(model);
		return "toPipeInstallMenuList";
	}
	
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PipeCompleteInf pipeCompleteInf = pipeInstall.getPipeCompleteInf();
		pipeCompleteInfService.generateFile(pipeCompleteInf);
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PipeCompleteInf pipeCompleteInf = pipeInstall.getPipeCompleteInf();
		String fileRootpath = MyFileUtils.getFilePath(pipeCompleteInf.getId(), "pipeCompleteInf", 3);
		String fileName = pipeCompleteInf.getId()+"_pipeCompleteInf.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}

}
