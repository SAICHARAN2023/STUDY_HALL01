package STUDY_TC;

import org.testng.annotations.Test;

import STUDY_POR.ADDDESK_POR;

import STUDY_POR.STUDENTMANAGE_POR;

import STUDY_UTILITY.BASECLASS_TC;

public class EDITDESKPAGE extends BASECLASS_TC {

	
	@Test
	public void EDITDESK() {

		STUDENTMANAGE_POR sm=new STUDENTMANAGE_POR(driver);
		sm.Deskstudent();
		sm.manageDesk();
	
		
		 ADDDESK_POR  mad=new  ADDDESK_POR(driver);
		 mad.Editdesk();
		 mad.desklaptopcharger();
		 mad.deskUpdate();
		 UWDU.HandleAlertboxOK(driver);
}
}
