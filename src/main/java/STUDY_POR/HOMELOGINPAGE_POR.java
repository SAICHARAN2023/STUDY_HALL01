package STUDY_POR;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import STUDY_UTILITY.BASECLASS;

public class HOMELOGINPAGE_POR extends BASECLASS{

	public HOMELOGINPAGE_POR(WebDriver driver) {
		super(driver);
	}
	
	//declaration
	
	
	@FindBy(xpath="//button[@id='sidebarToggle']")
	WebElement MenuButton;
	
	@FindBy(xpath="//a[text()='Admin']")
	WebElement Adminsidebar;
	
	

	@FindBy(name="username")
	WebElement adminusername;
	
	@FindBy(name="password")
	WebElement adminPassword;
	
	
	@FindBy(name="login")
	WebElement adminlogin;
	
	
	@FindBy(xpath="/html/body/header/div[1]/div/div[2]/ul/li[2]/a/img")
	WebElement adminlogoutimg;
	
	
	@FindBy(xpath="//*[@id=\"topnav\"]/div[1]/div/div[2]/ul/li[2]/div/a[3]")
	WebElement adminlogout;
	
	
	
	
	

	
	//actionclass
	
	public void menubutton() {
		 MenuButton.click();
	}
	
public void adminbutton() {
	Adminsidebar.click();
	}


public void adminuname(String aname) {
	 adminusername.sendKeys(aname);
}

public void adminpwd(String apwd) {
	adminPassword.sendKeys(apwd);
}

public void adminlogin() {
	adminlogin.click();
}

public void adminlogoutimg() {
	//adminlogoutimg.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", adminlogoutimg);
}

public void adminlogout() {
	adminlogout.click();
}

}


