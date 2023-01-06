package STUDY_TC;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import STUDY_POR.EDITSTUDENT_POR;
import STUDY_POR.STUDENTMANAGE_POR;
import STUDY_UTILITY.BASECLASS_TC;
import STUDY_UTILITY.DATA_PROVIDERS;

public class EDITSTUDENTPAGE extends BASECLASS_TC {

	
	@Test(dataProvider = "EDITData")
	public void EDIT_STUDENT(String name,String cno,String email,String qualify,String adrs) throws InterruptedException {
		
		STUDENTMANAGE_POR sm=new STUDENTMANAGE_POR(driver);
		sm.clickstudent();
		sm.managestudent();
		sm.Editstudent();
	
		EDITSTUDENT_POR asd=new EDITSTUDENT_POR(driver);
		asd.studentname(name);
		asd.studentcno(cno);
		asd.studentemail(email);
		asd.studentquality(qualify);
		asd.studentadrs(adrs);
		asd.studentupdate();
		UWDU.HandleAlertboxOK(driver);
	}
	
	
	@DataProvider(name = "EDITData")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet2");
	
}
	
}
