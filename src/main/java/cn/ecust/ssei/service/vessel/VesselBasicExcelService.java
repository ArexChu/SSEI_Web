package cn.ecust.ssei.service.vessel;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import cn.ecust.ssei.domain.vessel.VesselBasic;

public interface VesselBasicExcelService {
	
	public void createExcel(OutputStream os, List<VesselBasic> list) throws WriteException,IOException;
	
	public void readExcel(File document) throws BiffException, IOException ;

}
