package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeDetailMaintain;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeDetailMaintainService;

@Service
@Transactional
public class PipeDetailMaintainServiceImpl extends DaoSupportImpl<PipeDetailMaintain> implements PipeDetailMaintainService{

}
