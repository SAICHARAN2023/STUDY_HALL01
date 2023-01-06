package STUDY_TC;

import org.testng.annotations.Test;

import STUDY_POR.STUDENTMANAGE_POR;

import STUDY_UTILITY.BASECLASS_TC;

public class DELETESTUDENTPAGE extends BASECLASS_TC {

	
	@Test
	public void DELETESTUDENT() throws InterruptedException {
		 {
		STUDENTMANAGE_POR sm=new STUDENTMANAGE_POR(driver);
		sm.clickstudent();
		sm.managestudent();
		sm.deletestudent();
		UWDU.HandleAlertboxOK(driver);

		UWDU.HandleAlertboxOK(driver);
		}
}
}
