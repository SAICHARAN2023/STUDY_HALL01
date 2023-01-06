package STUDY_TC;


import org.testng.annotations.Test;

import STUDY_POR.ASSIGNTASK_POR;
import STUDY_POR.STUDENTMANAGE_POR;

import STUDY_UTILITY.BASECLASS_TC;

public class UNASSIGNTASKPAGE   extends BASECLASS_TC {

	@Test
	public void UNASSIGNTASK() throws InterruptedException {
		STUDENTMANAGE_POR sm=new STUDENTMANAGE_POR(driver);
		sm.AssignedStudent();
		sm.AssignedunassignStudent();
		
		ASSIGNTASK_POR atd=new ASSIGNTASK_POR(driver);
		atd.AssignTask();
	   
		int index=1;
		String remark="OK";
		atd.DeskTask(index);
		
		
		atd.remarkTask(remark);
		
		atd.submitTask();
		UWDU.HandleAlertboxOK(driver);
	}
}
