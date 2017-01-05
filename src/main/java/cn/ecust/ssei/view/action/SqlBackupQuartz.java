package cn.ecust.ssei.view.action;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Properties;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.ecust.ssei.service.SqlBackupService;
import cn.ecust.ssei.util.MyFileUtils;

@Component
public class SqlBackupQuartz {
	private String baseString;
	private String dataName;
	private String user;
	private String pwd;
	
	@Autowired
	private SqlBackupService sqlBackupService;
	
	SqlBackupQuartz(){
		baseString=MyFileUtils.getSqlPath();
		Properties prop = new Properties();
		try {
			prop.load(this.getClass().getClassLoader().getResourceAsStream("jdbc.properties"));
		} catch (IOException e1) {
			throw new RuntimeException();
		}
		dataName=prop.getProperty("name");
		user=prop.getProperty("user");
		pwd=prop.getProperty("password");
	}

	/**
	 * 自动备份数据库
	 * @throws UserException 
	 */
	@Scheduled(cron = "0 0 0 * * 6")//周六的凌晨
	public void autoBackupSql() throws Exception {
		String fileName = DateFormat.getDateInstance(DateFormat.DEFAULT)
				.format(new Date());
		String path = baseString+fileName+".dump";
		StringBuffer sb = new StringBuffer();
		 sb.append("mysqldump ");
		 sb.append("--opt ");
	     sb.append("--user=");
	     sb.append(user);
	     sb.append(" ");
	     sb.append("--password=");
	     sb.append(pwd);
	     sb.append(" ");
	     sb.append("--lock-all-tables=true ");
	     sb.append("--result-file=");
	         sb.append(path);
		         sb.append(" ");
	         sb.append("--default-character-set=utf8 ");
		        sb.append(dataName);
		
		sqlBackupService.backup(sb.toString());
		
	}

	 
}
