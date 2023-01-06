package STUDY_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import STUDY_UTILITY.BASECLASS;

public class ADDDESK_POR extends BASECLASS {

	public ADDDESK_POR(WebDriver driver) {
		super(driver);
	
	}
	

	@FindBy(xpath="(//a[text()='Edit '])[1]")
	WebElement EditDeskinfo;
	
	@FindBy(name="desknumber")
	WebElement desknumberinfo;
	
	@FindBy(name="laptopchargersocket")
	WebElement laptopchargersocketinfo;
	
	@FindBy(name="submit")
	WebElement usersubmitinfo;
	
	@FindBy(name="update")
	WebElement Deskupdateinfo;
	
	


	public void Editdesk() {
		EditDeskinfo.click();
}
		
	
	public void deskno(String no) {
		desknumberinfo.sendKeys(no);
}
	
	public void desklaptopcharger() {
		laptopchargersocketinfo.click();
}
	
	public void desksubmit() {
		usersubmitinfo.click();
}
	
	public void deskUpdate() {
		Deskupdateinfo.click();
}

}
