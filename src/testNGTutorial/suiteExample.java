package testNGTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suiteExample {
	WebDriver driver;
	long endtime;
	long starttime;
	
	@BeforeSuite
	public void launchbrowser() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
	}
		
	@Test
	public void opengoogle() {
				
		driver.get("http://www.google.co.in");
				
	}
	@Test
	public void openBing() {
		
				driver.get("http://www.bing.com");
				
	}
	@Test
	public void openYahoo() {
		
				driver.get("http://www.yahoo.com");
				
	}
	
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime= endtime - starttime;
		System.out.println("totaltime: "+ totaltime);
	}

}
