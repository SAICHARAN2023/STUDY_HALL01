package STUDY_UTILITY;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class WEBDRIVERUTILITY {
	
	
	public WebDriver driver;

	
	public String takeScreenShot(WebDriver driver, String screenShotName) throws IOException
	{
	
		 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String path = ".\\ScreenShots\\"+screenShotName+".png";
		File dst = new File(path);
		FileUtils.copyFile(src, dst);

		return dst.getAbsolutePath(); // used for reporting in listeners
	}
	
	

	
	 
	public void Windowmax() {
		driver.manage().window().maximize();
	}

	public void mouseHoverOn(WebDriver driver, WebElement element){
		Actions act=new Actions(driver);
		act.moveToElement(element).click().perform();
	}
	
	//handle 3 wait cammends
/*public void PageloadwaitTimeouts(WebDriver driver) {
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	public void ImplicitwaitTimeouts(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void ExplicitwaitTimeouts(WebDriver driver,WebElement element) {
		WebDriverWait WDWait=new WebDriverWait(driver,10);
		WDWait.until(ExpectedConditions.elementToBeClickable(element));
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
*/
	//handle dropdown in 3 ways
	
	public void Handledropdownby(WebElement element,int Index) {
		
		//By using select keyword
		Select dropdown =new Select(element);
		dropdown.selectByIndex(Index);
	}
	
public void Handledropdownby(WebElement element,String Text) {
		
		//By using select keyword
		Select dropdown =new Select(element);
		dropdown.selectByVisibleText(Text);
	}

public void Handledropdownby(String Text,WebElement element) {
	
	//By using select keyword
	Select dropdown =new Select(element);
	dropdown.selectByValue(Text);
}


//handle frames in 3 ways

public void HandlingFramesByid(WebDriver driver,String Textorid) {
	driver.switchTo().frame(Textorid);
	
}

public void HandlingFramesByelement(WebElement element,WebDriver driver) {
	driver.switchTo().frame(element);
	
}

public void HandleDefaultWindow(WebDriver driver)
{
	driver.switchTo().defaultContent();
}


public void HandletoParentFrame(WebDriver driver)
{
	driver.switchTo().parentFrame();
}


//handle alert  box

public void HandleAlertboxOK(WebDriver driver) {
	Alert alt=driver.switchTo().alert();
	alt.accept();
}

public void HandleAlertboxdismiss(WebDriver driver) {
	Alert alt=driver.switchTo().alert();
	alt.dismiss();
}

public String HandleAlertboxText(WebDriver driver) {
	String altText=driver.switchTo().alert().getText();
	return altText;
	
}

//handle rightclick
public static Actions act;
public void HandleRightclickelement(WebDriver driver,WebElement Element) {
	act.contextClick(Element).build().perform();
	
}

//handle rightclick
public void HandleRightclick(WebDriver driver) {
	act.contextClick().build().perform();
	
}

//handle doubleclick
public void HandleDoubleclick(WebDriver driver) {
	act.doubleClick().build().perform();
	
}

//handle dropdown
public void HandledraganddropClick(WebElement source,WebElement target) {
	act.dragAndDrop(source, target);
}


//handle keypress enter
public void HandlepressEnter() throws AWTException
{
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}


//handle windows
public String HandleSwitchToWindow(WebDriver driver) {
	String window1= driver.getWindowHandle();
	return window1;
}


/*
 * handle windows
 */
public void switchToWindow(WebDriver driver, String partialWinTitle)
{
	//Step 1: get all the window ids
	Set<String> windowIds = driver.getWindowHandles();
	
	//Step 2: iterate thru all the window ids
	Iterator<String> it = windowIds.iterator();
	
	//Step 3: navigate to each window and check the title
	while(it.hasNext())
	{
		//capture the individual window id
		String winId = it.next();
		String currentTtile = driver.switchTo().window(winId).getTitle();
		//compare the current window title with partial window title
		if(currentTtile.contains(partialWinTitle))
		{
			break;
		}
	}
}

/*
 * handle scrollaction
 */
public void HandlescrollAction(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	js.executeScript("window.scrollBy(0,500)", "");
}

/*
 * handle scrollaction
 */

public void HandlescrollAction(WebDriver driver, WebElement element)
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].scrollIntoView();", element);
	int y = element.getLocation().getY();
	js.executeScript("window.scrollBy(0,"+y+")", element);
}


/*
 * handle screenshots
 */








/*
 * handle random values alpha numaric,number
 */

public String HandlerandomAlphanumeric() {
	String emailid1=RandomStringUtils.randomAlphanumeric(8);
	return (emailid1);
}

public String HandleRandomAlphabets2() {
	String emailid1=RandomStringUtils.randomAlphabetic(9);
	return (emailid1);
}

public String HandleRandomNumaric1value() {
	String phnumber1=RandomStringUtils.randomNumeric(8);
	return (phnumber1);
}


public int HandleRandomNumber() 
{
	Random r = new Random();
	int ran = r.nextInt(1000);
	return ran;
}



public String Dateformat() {
	Date date=new Date();
	String dateformat=date.toString();
	return dateformat;
}

public String SimpleSystemDateformat() {
	Date date=new Date();
	String[] dateformat=date.toString().split(" ");
	String Date=dateformat[2];
	String month=dateformat[1];
	String year=dateformat[5];
	String Time=dateformat[3].replace(":", "-");
	String SysDateFormat=Date+" "+month+" "+year+" "+Time;
	return SysDateFormat;
	
} 
	
	
	
	public int getRandomNumber() 
	{
		Random r = new Random();
		int ran = r.nextInt(1000);
		return ran;
	}
	
	/**
	 * This method will generate the system date and it will return the value
	 * @return
	 */
	public String getSystemDate()
	{
		Date date = new Date();
		String d = date.toString();
		return d;
	}
	
	/**
	 * This method will generate the current and time in specific format
	 * @return
	 */
	public String getSystemDateInFormat()
	{
		Date d = new Date();
		String[] dArr = d.toString().split(" ");
		String date = dArr[2];
		String month = dArr[1];
		String year = dArr[5];
		String time = dArr[3].replace(":", "-");
		String currentDateAndTime = date+" "+month+" "+year+" "+time;
		return currentDateAndTime;
	}


}
