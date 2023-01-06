package STUDY_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import STUDY_UTILITY.BASECLASS;

public class ASSIGNTASK_POR extends BASECLASS {

	
	public ASSIGNTASK_POR(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="(//*[.='Assign Desk'])[1]")
	WebElement AssignTaskinfo;
	
	@FindBy(xpath="(//*[.='Unassign Desk'])[1]")
	WebElement unAssignTaskinfo;
	
	@FindBy(name="deskno")
	WebElement userdesknoinfo;
	
	@FindBy(name="remark")
	WebElement useremarkinfo;
	
	@FindBy(name="submit")
	WebElement usersaveinfo;
	
	public void AssignTask() {
		AssignTaskinfo.click();
	}
	
	public void unAssignTask() {
		unAssignTaskinfo.click();
	}
	
	public void DeskTask(int index) {
  Select sc=new Select(userdesknoinfo);
		 sc.selectByIndex(index);
		
	}
	
	public void remarkTask(String remark) {
		useremarkinfo.sendKeys(remark);
	}
	
	public void submitTask() {
		usersaveinfo.click();
	}
	
}
