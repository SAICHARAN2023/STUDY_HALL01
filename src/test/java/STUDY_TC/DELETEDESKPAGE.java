package STUDY_TC;

import org.testng.annotations.Test;

import STUDY_POR.STUDENTMANAGE_POR;

import STUDY_UTILITY.BASECLASS_TC;

public class DELETEDESKPAGE extends BASECLASS_TC {

	
	@Test
	public void DELETEDESK() {
		STUDENTMANAGE_POR sm=new STUDENTMANAGE_POR(driver);
		sm.Deskstudent();
		sm.manageDesk();
		sm.deletestudent();
		UWDU.HandleAlertboxOK(driver);
		UWDU.HandleAlertboxOK(driver);

}
}
