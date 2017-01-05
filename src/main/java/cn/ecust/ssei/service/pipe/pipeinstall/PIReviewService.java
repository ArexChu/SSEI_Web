package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIReview;

public interface PIReviewService extends DaoSupport<PIReview> {
	void generateFile(PIReview piReview);
}
