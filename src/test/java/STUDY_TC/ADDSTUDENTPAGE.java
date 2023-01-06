package STUDY_TC;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import STUDY_POR.ADDSTUDENT_POR;
import STUDY_POR.STUDENTMANAGE_POR;
import STUDY_UTILITY.BASECLASS_TC;
import STUDY_UTILITY.DATA_PROVIDERS;

public class ADDSTUDENTPAGE extends BASECLASS_TC {

	@Test(dataProvider = "LoginData")
	public void ADD_STUDENTS(String name,String cno,String email,String qualify,String adrs) throws InterruptedException {
		
		STUDENTMANAGE_POR sm=new STUDENTMANAGE_POR(driver);
		sm.clickstudent();
		logger.info("click on student");
		sm.addstudent();
		logger.info("click on add student");
		ADDSTUDENT_POR asd=new ADDSTUDENT_POR(driver);
		asd.studentname(name);
		logger.info("click on add student name");
		asd.studentcno(cno);
		asd.studentemail(email);
		asd.studentquality(qualify);
		asd.studentadrs(adrs);
		asd.studentadd();
		Thread.sleep(1000);
		UWDU.HandleAlertboxOK(driver);
	}
	
	@DataProvider(name = "LoginData")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet1");
	
}
}
