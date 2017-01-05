package cn.ecust.ssei.service.impl.user;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.user.Certificates;
import cn.ecust.ssei.service.user.CertificatesService;

@Service
@Transactional   
public class CertificatesServiceImpl extends DaoSupportImpl<Certificates> implements CertificatesService {

	@SuppressWarnings("unchecked")
	@Override
	public List<Certificates> findOutDateCertificates() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, +1);//得到后一个月
		Date date = calendar.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		String dateString = simpleDateFormat.format(date);
		return  getSession().createQuery(//
				"FROM Certificates c WHERE c.emailStat=? AND c.failureData<? GROUP BY c.user.id")//
				.setParameter(0,false)//
				.setParameter(1,dateString)//
				.list();
	}

	@Override
	public void updateEmailState(Certificates certificates) {
		certificates.setEmailStat(true);
		update(certificates);
	}

}
