package cn.ecust.ssei.service.impl.pipe.pipeonlinemaintain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineMaintain;
import cn.ecust.ssei.service.pipe.pipeonlinemaintain.PipeOnlineMaintainService;

@Service
@Transactional
public class PipeOnlineMaintainServiceImpl extends DaoSupportImpl<PipeOnlineMaintain> implements PipeOnlineMaintainService{


}
