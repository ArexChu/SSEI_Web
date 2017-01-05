package cn.ecust.ssei.service.user;

import java.util.List;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.user.Certificates;

public interface CertificatesService extends DaoSupport<Certificates>{

	List<Certificates> findOutDateCertificates();

	void updateEmailState(Certificates certificates);

}
