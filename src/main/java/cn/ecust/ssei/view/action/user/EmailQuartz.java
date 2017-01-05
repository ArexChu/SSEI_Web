package cn.ecust.ssei.view.action.user;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.ecust.ssei.domain.user.Certificates;
import cn.ecust.ssei.domain.user.User;
import cn.ecust.ssei.service.user.CertificatesService;

@Component
public class EmailQuartz {
	
	private String host;//服务器主机名
	private String pass ;//登录密码
	private String from ;
	private String subject;
	//private String contents;
	private Properties properties;
	Session session;
	Transport ts;
	
	EmailQuartz(){
		/*
		 * 把配置文件内容加载到prop中
		 */
		Properties prop = new Properties();
		try {
			prop.load(this.getClass().getClassLoader().getResourceAsStream("email_template.properties"));
		} catch (IOException e1) {
			throw new RuntimeException();
		}
		/*
		 * 登录邮件服务器，得到session
		 */
		 host = prop.getProperty("host");//服务器主机名
		 pass = prop.getProperty("password");//登录密码
		 from = prop.getProperty("from");
		 subject = prop.getProperty("subject");
		 //contents = prop.getProperty("content");
		 properties=new Properties();
		properties.put("mail.host",host );//服务器主机名
		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.auth", false);
		session=Session.getInstance(properties);
		//开启session的调试模式，可以查看当前邮件发送状态
		session.setDebug(true);
		//2.通过session获取Transport对象（发送邮件的核心API）
		try {
			ts=session.getTransport();
			ts.connect(from, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Autowired
	private CertificatesService certificatesService;
	
	/**
	 * 自动发送邮件
	 * @throws UserException 
	 */
	@Scheduled(cron = "0 0 1 * * ?")
	public void autoSendEmai() throws Exception {

		Message mm=new MimeMessage(session);
		mm.setFrom(new InternetAddress(from));
		List<Certificates> list = certificatesService.findOutDateCertificates();
		for (Certificates certificates : list) {
			User user = certificates.getUser();
			String des = user.getE_Mail();
			//String content = MessageFormat.format(contents, user.getName(), certificates.getFailureData()).replace("-", "/");
			mm.setRecipient(Message.RecipientType.TO, new InternetAddress(des));
			mm.setSubject(subject);
			mm.setContent("您好,您的特种设备检查证书即将过期,请及时处理      ","text/html;charset=GBK");
			//5.发送电子邮件
			ts.sendMessage(mm, mm.getAllRecipients());
		}
		for (Certificates certificates : list) {
			certificatesService.updateEmailState(certificates);
		}
	}

	 
}
