package cn.ecust.ssei.service.impl.pipe;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.PipeMonthlyInspection;
import cn.ecust.ssei.service.pipe.PipeMonthlyInspectionService;

@Service
@Transactional
public class PipeMonthlyInspectionServiceImpl extends DaoSupportImpl<PipeMonthlyInspection> implements PipeMonthlyInspectionService {


}
