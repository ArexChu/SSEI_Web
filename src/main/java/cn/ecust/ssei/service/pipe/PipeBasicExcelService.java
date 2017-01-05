package cn.ecust.ssei.service.pipe;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import cn.ecust.ssei.domain.pipe.PipeBasic;

public interface PipeBasicExcelService {
	
	public void createExcel(OutputStream os, List<PipeBasic> list) throws WriteException,IOException;
	
	public void readExcel(File document) throws BiffException, IOException ;

}
