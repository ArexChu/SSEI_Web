package cn.ecust.ssei.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.service.SqlBackupService;

@Service
@Transactional
public class SqlBackupServiceImpl implements SqlBackupService {

	@Override
	public void backup(String path) throws Exception {
		Runtime cmd = Runtime.getRuntime();
		//System.out.println(path);
		try {
			Process p = cmd.exec(path);
			int tag = p.waitFor();
			if (tag==0) {
				//System.out.println("备份结束");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
