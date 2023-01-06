package STUDY_UTILITY;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import STUDY_POR.HOMELOGINPAGE_POR;



public class BASECLASS_TC {

	
	public static WebDriver driver;
    
	//public static DATA_PROVIDERS UDP=new DATA_PROVIDERS();

	//public static EXTENT_REPORTS UER=new EXTENT_REPORTS();
	public static WEBDRIVERUTILITY UWDU =new WEBDRIVERUTILITY();
	
	   
		public ResourceBundle rb;
		public Logger logger;
		
		String br;
		@BeforeClass
		public void setup() {
			logger=LogManager.getLogger(this.getClass());
			rb=ResourceBundle.getBundle("config");
			String br=rb.getString("browser");
			
			if(br.equals("chrome")) {
			driver=new ChromeDriver();
			}else if(br.equals("firefox")) {
				driver=new FirefoxDriver();
			}else if(br.equals("edge")){
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(rb.getString("BASEURL"));
			
		}
		
		@BeforeMethod
		public void login() {
			HOMELOGINPAGE_POR HP=new HOMELOGINPAGE_POR(driver);
			HP.menubutton();
			HP.adminbutton();
			HP.adminuname(rb.getString("A_USER"));
			HP.adminpwd(rb.getString("A_PASS"));
			HP.adminlogin();
		}
		
		@AfterMethod
		public void logout() {
			
			HOMELOGINPAGE_POR HP=new HOMELOGINPAGE_POR(driver);
				HP.adminlogoutimg();
				HP.adminlogout();
			}
		
		@AfterClass
		public void Teardown() {
			driver.close();
		}
	
		
}
