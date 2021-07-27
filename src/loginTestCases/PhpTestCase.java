package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class PhpTestCase {
	@Test
	public void testcase() {
		System.setProperty("webdriver.chrome.driver", "C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//https://phptravels.net/login
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validatecredentials");
		
		PageFactory.initElements(driver, LoginpageObject.class);
		
		LoginpageObject.username.sendKeys("Admin");
		LoginpageObject.password.sendKeys("admin123");
		LoginpageObject.submit.click();
		
		/*
		 * LoginpageObject.username(driver).sendKeys("Admin");
		 * LoginpageObject.password(driver).sendKeys("admin123");
		 * LoginpageObject.submit(driver).click();
		 */
		
		
	}
	

}
