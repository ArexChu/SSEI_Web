package cn.ecust.ssei.view.action.pipe.install;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeInstallBaseAction;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIReview;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.MyFileUtils;

@Controller(value="piReviewAction")
@Scope("prototype")
public class PIReviewAction extends PipeInstallBaseAction<PIReview>{

	public String delete() throws Exception{
		long id = preDelete();
		piReviewService.delete(id);
		return "toPipeInstallMenuList";
	}
	
	public String edit() throws Exception{
		piReviewService.update(model);
		return "toPipeInstallMenuList";
	}
	public String generateFile() throws Exception{
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PIReview piReview = pipeInstall.getPiReview();
		piReviewService.generateFile(piReview);
		return "toPipeInstallDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		PipeInstall pipeInstall = pipeInstallService.getById(installId);
		PIReview piReview = pipeInstall.getPiReview();
		String fileRootpath = MyFileUtils.getFilePath(piReview.getId(), "piReview", 3);
		String fileName = piReview.getId()+"_piReview.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}

}
