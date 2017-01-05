package cn.ecust.ssei.service.impl.vessel;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.PageBean;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselConclusionTest;
import cn.ecust.ssei.service.vessel.VesselBasicService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class VesselBasicServiceImpl extends DaoSupportImpl<VesselBasic> implements VesselBasicService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselMaintain vesselMaintain) {
		VesselBasic  vesselBasic= vesselMaintain.getVesselBasic();
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselBasic.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselBasic.getId(), "vesselBasic", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselBasic.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselBasic);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselMaintain);
		
		
		map.put("#v_De_Com#", vesselBasic.getV_De_Com().getName());
		map.put("#v_Man_Com#", vesselBasic.getV_Man_Com().getName());
		map.put("#v_Install_Com#", vesselBasic.getV_Install_Com().getName());
		
		
		String v_C_Volume = vesselBasic.getV_C_Volume();
		v_C_Volume = genCheckBoxString("容积m3,换热面积m2", v_C_Volume);
		map.put("#v_C_Volume#", v_C_Volume);
		
		String v_De_Pre_C_Shell = vesselBasic.getV_De_Pre_C_Shell();
		v_De_Pre_C_Shell = genCheckBoxString("壳体,壳程", v_De_Pre_C_Shell);
		map.put("#v_De_Pre_C_Shell#", v_De_Pre_C_Shell);
		
		String v_De_Pre_C_Jacket = vesselBasic.getV_De_Pre_C_Jacket();
		v_De_Pre_C_Jacket = genCheckBoxString("夹套,管程", v_De_Pre_C_Jacket);
		map.put("#v_De_Pre_C_Jacket#", v_De_Pre_C_Jacket);
		
		String v_Wo_Pre_C_Shell = vesselBasic.getV_Wo_Pre_C_Shell();
		v_Wo_Pre_C_Shell = genCheckBoxString("壳体,壳程", v_Wo_Pre_C_Shell);
		map.put("#v_Wo_Pre_C_Shell#", v_Wo_Pre_C_Shell);
		
		String v_Wo_Pre_C_Jacket = vesselBasic.getV_Wo_Pre_C_Jacket();
		v_Wo_Pre_C_Jacket = genCheckBoxString("夹套,管程", v_Wo_Pre_C_Jacket);
		map.put("#v_Wo_Pre_C_Jacket#", v_Wo_Pre_C_Jacket);
		
		String v_De_Tem_C_Shell = vesselBasic.getV_De_Tem_C_Shell();
		v_De_Tem_C_Shell = genCheckBoxString("壳体,壳程", v_De_Tem_C_Shell);
		map.put("#v_De_Tem_C_Shell#", v_De_Tem_C_Shell);
		
		String v_De_Tem_C_Jacket = vesselBasic.getV_De_Tem_C_Jacket();
		v_De_Tem_C_Jacket = genCheckBoxString("夹套,管程", v_De_Tem_C_Jacket);
		map.put("#v_De_Tem_C_Jacket#", v_De_Tem_C_Jacket);
						
		String v_Wo_Tem_C_Shell = vesselBasic.getV_Wo_Tem_C_Shell();
		v_Wo_Tem_C_Shell = genCheckBoxString("壳体,壳程", v_Wo_Tem_C_Shell);
		map.put("#v_Wo_Tem_C_Shell#", v_Wo_Tem_C_Shell);
		
		String v_Wo_Tem_C_Jacket = vesselBasic.getV_Wo_Tem_C_Jacket();
		v_Wo_Tem_C_Jacket = genCheckBoxString("夹套,管程", v_Wo_Tem_C_Jacket);
		map.put("#v_Wo_Tem_C_Jacket#", v_Wo_Tem_C_Jacket);
		
		String v_Med_C_Shell = vesselBasic.getV_Med_C_Shell();
		v_Med_C_Shell = genCheckBoxString("壳体,壳程", v_Med_C_Shell);
		map.put("#v_Med_C_Shell#", v_Med_C_Shell);
		
		String v_Med_C_Jacket = vesselBasic.getV_Med_C_Jacket();
		v_Med_C_Jacket = genCheckBoxString("夹套,管程", v_Med_C_Jacket);
		map.put("#v_Med_C_Jacket#", v_Med_C_Jacket);
		
		String v_Ma_C_Jacket = vesselBasic.getV_Ma_C_Jacket();
		v_Ma_C_Jacket = genCheckBoxString("夹套,换热管", v_Ma_C_Jacket);
		map.put("#v_Ma_C_Jacket#", v_Ma_C_Jacket);
		
		String v_Thi_C_Jacket = vesselBasic.getV_Thi_C_Jacket();
		v_Thi_C_Jacket = genCheckBoxString("夹套,换热管", v_Thi_C_Jacket);
		map.put("#v_Thi_C_Jacket#", v_Thi_C_Jacket);
		
		VesselConclusionTest vesselConclusionTest = vesselMaintain.getVesselPeriodicalMaintain().getVesselConclusionTest();
		HashMap<String, String> map2= BeanUtils.beanToMap(vesselConclusionTest);
		
		map.putAll(map1);
		map.putAll(map2);
		helper.toWord(templetePath, filePath, map);
		
	}

	@Override
	public PageBean getPageBeanInExpire(int pageNum, int pageSize,
			Long companyId) {
		String sql = " FROM ssei_vesselbasic WHERE (NOW()> DATE_SUB(STR_TO_DATE(v_M_Next_Date, '%Y-%c-%e'),INTERVAL 1 MONTH) OR NOW()> DATE_SUB(STR_TO_DATE(v_M_Next_Ann_Date, '%Y-%c-%e'),INTERVAL 1 MONTH))";
		if (companyId!=null) {
			sql=sql+"AND useCompanyId = "+companyId;
		}
		String finalSql = "SELECT *"+sql; 
		SQLQuery sqlqQuery =  getSession().createSQLQuery(finalSql);
		sqlqQuery.addEntity(VesselBasic.class);
		sqlqQuery.setFirstResult((pageNum - 1) * pageSize);
		sqlqQuery.setMaxResults(pageSize);
		@SuppressWarnings("unchecked")
		List<VesselBasic> list = sqlqQuery.list(); // 执行查询
		
		String countSql = "SELECT COUNT(*)"+sql; 
		sqlqQuery =  getSession().createSQLQuery(countSql);
		BigInteger tempCount = (BigInteger) sqlqQuery.uniqueResult(); // 执行查询
		Long count=tempCount.longValue();

		return new PageBean(pageNum, pageSize, count.intValue(), list);
	}

	@Override
	public VesselBasic getByVesselId(String id) {
		return (VesselBasic) getSession().createQuery("FROM VesselBasic v Where v.v_Product_ID=?").setParameter(0, id).uniqueResult();
	}

	@Override
	public VesselBasic getByProductId(String vessel_Product_ID) {
		// TODO Auto-generated method stub
		return (VesselBasic) getSession().createQuery(//
				"FROM VesselBasic v WHERE v.v_Product_ID=?")//
				.setParameter(0, vessel_Product_ID)//
				.uniqueResult();
	}
	

	
}
