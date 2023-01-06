package STUDY_UTILITY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BASECLASS {

	
	public static  WebDriver sdriver;
	public  WebDriver driver;
	public BASECLASS(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
