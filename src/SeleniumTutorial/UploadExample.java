package SeleniumTutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://www.leafground.com/pages/upload.html");
		//WebElement upload= driver.findElement(By.name("filename"));
		//upload.click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.name("filename"))).click().build().perform();
		String loc= "C:\\Users\\vinot\\Downloads\\testleaf.xlsx";
		
		StringSelection selection = new StringSelection(loc);
				
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
