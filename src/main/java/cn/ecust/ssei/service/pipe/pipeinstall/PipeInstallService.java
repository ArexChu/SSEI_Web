package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;

public interface PipeInstallService extends DaoSupport<PipeInstall> {
	void generateFile(PipeInstall pipeInstall);

	PipeInstall findByPIId(String pi_id);
	
	@Override
	public void update(PipeInstall entity);
}
