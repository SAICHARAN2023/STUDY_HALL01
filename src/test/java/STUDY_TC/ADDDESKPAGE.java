package STUDY_TC;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import STUDY_POR.ADDDESK_POR;
import STUDY_POR.STUDENTMANAGE_POR;
import STUDY_UTILITY.BASECLASS_TC;
import STUDY_UTILITY.DATA_PROVIDERS;

public class ADDDESKPAGE extends BASECLASS_TC {

	
	@Test(dataProvider = "DeskData")
	public void ADD_DESK(String deskno) {
		STUDENTMANAGE_POR sm=new STUDENTMANAGE_POR(driver);
		sm.Deskstudent();
		sm.AddDesk();
		
		 ADDDESK_POR  mad=new  ADDDESK_POR(driver);
		 String deskvalue=deskno;
		
		 mad.deskno(deskvalue);
		 mad.desklaptopcharger();
		 mad.desksubmit();
		 UWDU.HandleAlertboxOK(driver);	
}
	
	@DataProvider(name = "DeskData")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet3");
	}
}
