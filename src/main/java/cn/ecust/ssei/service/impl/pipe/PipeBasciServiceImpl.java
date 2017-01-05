package cn.ecust.ssei.service.impl.pipe;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.PageBean;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.PipeMaintain;
import cn.ecust.ssei.service.pipe.PipeBasciService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;


@Service
@Transactional
public class PipeBasciServiceImpl extends DaoSupportImpl<PipeBasic> implements PipeBasciService{

	@Override
	public PipeBasic getByPipeId(String id) {
		return (PipeBasic) getSession().createQuery("FROM PipeBasic p Where p.p_ID=?").setParameter(0, id).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PipeMaintain pipeMaintain) {
		PipeBasic pipeBasic = pipeMaintain.getPipeBasic();
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeBasic.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeMaintain.getPipeBasic().getId(), "pipeBasic", Constant.PIPE_DOCUMENT_UPLOAD, "pipeBasic.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeBasic);
		HashMap<String, String> map1= BeanUtils.beanToMap(pipeMaintain);
		map.putAll(map1);
		String m_Remark = pipeMaintain.getPipeDetailMaintain().getM_Remark();
		map.put("#m_Remark#", m_Remark);
		helper.toWord(templetePath, filePath, map);	
	}
	
	@Override
	public void save(PipeBasic entity) {
		super.save(entity);
		String sys_id = entity.getP_Sys();
		if (sys_id!=null && !sys_id.isEmpty() && entity.getP_checkType().equals("1")) {
			PipeBasic pipeBasic = getByPipeSysIdAndType(sys_id, "2");
			if (pipeBasic==null) {
				pipeBasic=new PipeBasic();
				pipeBasic.setP_Sys(sys_id);
				pipeBasic.setP_checkType("2");
				pipeBasic.setP_submited("2");
				pipeBasic.setCompany(entity.getCompany());
				pipeBasic.setP_De_Com(entity.getP_De_Com());
				pipeBasic.setP_Ins_Com(entity.getP_Ins_Com());
				super.save(pipeBasic);
			}
		}
	}
	
	
	@Override
	public void delete(Long id) {
		PipeBasic pipeBasic = getById(id);
		pipeBasic.setCompany(null);
		update(pipeBasic);
		super.delete(id);
	}

	@Override
	public PageBean getPageBean(int pageNum, int pageSize, Long companyId) {
		String sql = " FROM ssei_pipebasic WHERE (NOW()> DATE_SUB(STR_TO_DATE(nextDetailMaintainDate, '%Y-%c-%e'),INTERVAL 1 MONTH) OR NOW()> DATE_SUB(STR_TO_DATE(nextOnlineMaintainDate, '%Y-%c-%e'),INTERVAL 1 MONTH))";
		if (companyId!=null) {
			sql=sql+"AND companyId = "+companyId;
		}
		String finalSql = "SELECT *"+sql; 
		SQLQuery sqlqQuery =  getSession().createSQLQuery(finalSql);
		sqlqQuery.addEntity(PipeBasic.class);
		sqlqQuery.setFirstResult((pageNum - 1) * pageSize);
		sqlqQuery.setMaxResults(pageSize);
		@SuppressWarnings("unchecked")
		List<PipeBasic> list = sqlqQuery.list(); // 执行查询
		
		String countSql = "SELECT COUNT(*)"+sql; 
		sqlqQuery =  getSession().createSQLQuery(countSql);
		BigInteger tempCount = (BigInteger) sqlqQuery.uniqueResult(); // 执行查询
		Long count=tempCount.longValue();

		return new PageBean(pageNum, pageSize, count.intValue(), list);
	}

	@Override
	public PipeBasic getByPipeSysIdAndType(String p_Sys_ID, String type) {
		return (PipeBasic) getSession().createQuery("FROM PipeBasic p Where p.p_Sys=? And p.p_checkType=?").setParameter(0, p_Sys_ID).setParameter(1, type).uniqueResult();
	}


}
