package cn.ecust.ssei.domain.vo.formatter;

import java.util.ArrayList;
import java.util.List;

import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.vo.CompanyVo;

public class CompanyFormatter {
	
	public static CompanyVo formatterToVo(Company company){
		CompanyVo companyVo = new CompanyVo();
		companyVo.setId(company.getId());
		companyVo.setName(company.getName());
		 return companyVo;
	}
	
	public static List<CompanyVo> formatterToVoList(List<Company> companys){
		List<CompanyVo> companyVos = new ArrayList<CompanyVo>();
		for (Company company : companys) {
			companyVos.add(formatterToVo(company));
		}
		return companyVos;
	}
	
}
