package cn.ecust.ssei.service.vessel;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.PageBean;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;

public interface VesselBasicService extends DaoSupport<VesselBasic> {
	void generateFile(VesselMaintain vesselMaintain);
	/**
	 * 根据条件检索过期的容器
	 * @param pageNum
	 * @param pageSize
	 * @param queryHelper
	 * @return
	 */
	PageBean getPageBeanInExpire(int pageNum, int pageSize,Long Id);
	
	public VesselBasic getByVesselId(String id);
	
	
	VesselBasic getByProductId(String vessv_Product_ID);
	
	
}
