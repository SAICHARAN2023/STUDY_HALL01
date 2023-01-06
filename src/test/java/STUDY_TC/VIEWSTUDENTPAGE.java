package STUDY_TC;

import org.testng.annotations.Test;

import STUDY_POR.STUDENTMANAGE_POR;

import STUDY_UTILITY.BASECLASS_TC;

public class VIEWSTUDENTPAGE  extends BASECLASS_TC {

	
	@Test
	public void VIEW_STUDENT() throws InterruptedException {
		STUDENTMANAGE_POR sm=new STUDENTMANAGE_POR(driver);
		
		sm.clickstudent();
		Thread.sleep(2000);
		sm.managestudent();
		Thread.sleep(2000);
		sm.ViewStudent();

}
}
