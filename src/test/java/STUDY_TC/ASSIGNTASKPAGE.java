package STUDY_TC;

import org.testng.annotations.Test;

import STUDY_POR.ASSIGNTASK_POR;
import STUDY_POR.STUDENTMANAGE_POR;

import STUDY_UTILITY.BASECLASS_TC;

public class ASSIGNTASKPAGE extends BASECLASS_TC {

	@Test
	public void ASSIGNTASK() throws InterruptedException {
		STUDENTMANAGE_POR sm=new STUDENTMANAGE_POR(driver);
		sm.AssignedStudent();
		sm.AssignedunassignStudent();
		
		ASSIGNTASK_POR atd=new ASSIGNTASK_POR(driver);
		atd.AssignTask();
	   
		int index=1;
		String remark="OK";
		atd.DeskTask(index);
		
		Thread.sleep(1000);
		atd.remarkTask(remark);
		Thread.sleep(1000);
		atd.submitTask();
		UWDU.HandleAlertboxOK(driver);
}
}
