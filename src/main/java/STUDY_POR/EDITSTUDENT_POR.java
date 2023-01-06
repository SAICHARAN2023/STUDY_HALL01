package STUDY_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import STUDY_UTILITY.BASECLASS;

public class EDITSTUDENT_POR extends BASECLASS{

	public EDITSTUDENT_POR(WebDriver driver) {
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
	
	
	@FindBy(name="update")
	WebElement userupdateinfo;
	
	//action
	
	public void studentname(String sname) {
		usernameinfo.clear();
		usernameinfo.sendKeys(sname);
	}
	
	public void studentcno(String cname) {
		usercontactinfo.clear();
		usercontactinfo.sendKeys(cname);
	}
	
	public void studentemail(String ename) {
		useremailinfo.clear();
		useremailinfo.sendKeys(ename);
	}
	
	public void studentquality(String qname) {
		userqualifyinfo.clear();
		userqualifyinfo.sendKeys(qname);
	}
	
	public void studentadrs(String aname) {
		useraddressinfo.clear();
		useraddressinfo.sendKeys(aname);
	}
	
	public void studentupdate() {
		userupdateinfo.click();
	}

}
