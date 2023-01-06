package STUDY_POR;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import STUDY_UTILITY.BASECLASS;




public class STUDENTMANAGE_POR extends BASECLASS {

	
	//declaration
	
	public STUDENTMANAGE_POR(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//span[text()=' Students  ']")
	WebElement clickonstudents;
	
	@FindBy(xpath="//a[text()=' Assigned / Unassigned Desk  ']")
	WebElement clickonAssignedTask;
	
	@FindBy(xpath="//span[text()=' Desks  ']")
	WebElement clickonDesks;
	
	
	@FindBy(xpath="(//a[text()='Assign/UnAssign Desk'])[1]")
	WebElement clickonAssignedunassignedTask2;
	

	@FindBy(xpath="(//a[text()='Add '])[2]")
	WebElement Addstudents;
	
	@FindBy(xpath="(//a[text()='Manage '])[2]")
	WebElement ManageStudents;
	
	@FindBy(xpath="(//a[text()='Add '])[1]")
	WebElement AddDesk;
	
	@FindBy(xpath="(//a[text()='Manage '])[1]")
	WebElement ManageDesk;
	
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	WebElement Editstudent;
	
	@FindBy(xpath="(//a[text()='Delete'])[1]")
	WebElement Deletestudent;
	
	@FindBy(xpath="(//a[text()='View Details'])[1]")
	WebElement Viewstudent;
	
	
	
	
	
	
	
	
	
	
	public void clickstudent() {
		clickonstudents.click();
	}
	
public void addstudent() {
	Addstudents.click();	
	}

public void Deskstudent() {
	clickonDesks.click();	
	}

public void manageDesk() {
	ManageDesk.click();
}

public void AddDesk() {
	
	AddDesk.click();
}


public void managestudent() {
	 ManageStudents.click();
}

public void Editstudent() {
	
	 Editstudent.click();
}

public void deletestudent() {
	Deletestudent.click();
}


public void ViewStudent() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", Viewstudent);
	//Viewstudent.click();
}

public void AssignedStudent() {
	clickonAssignedTask.click();
}

public void AssignedunassignStudent() {
	clickonAssignedunassignedTask2.click();
}


}
