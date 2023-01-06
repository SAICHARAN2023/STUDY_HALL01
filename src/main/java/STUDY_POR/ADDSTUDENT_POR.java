package STUDY_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import STUDY_UTILITY.BASECLASS;

public class ADDSTUDENT_POR extends BASECLASS {

	public ADDSTUDENT_POR(WebDriver driver) {
		super(driver);
	}

	
	
	@FindBy(name="studentname")
	WebElement usernameinfo;
	
	@FindBy(name="studentcontactno")
	WebElement usercontactinfo;
	
	@FindBy(name="studentemail")
	WebElement useremailinfo;
	
	@FindBy(name="qualification")
	WebElement userqualifyinfo;
	
	@FindBy(name="address")
	WebElement useraddressinfo;
	
	
	@FindBy(name="submit")
	WebElement useraddinfo;
	
	//action
	
	public void studentname(String sname) {
		usernameinfo.sendKeys(sname);
	}
	
	public void studentcno(String cname) {
		usercontactinfo.sendKeys(cname);
	}
	
	public void studentemail(String ename) {
		useremailinfo.sendKeys(ename);
	}
	
	public void studentquality(String qname) {
		userqualifyinfo.sendKeys(qname);
	}
	
	public void studentadrs(String aname) {
		useraddressinfo.sendKeys(aname);
	}
	
	public void studentadd() {
		useraddinfo.click();
	}
}
