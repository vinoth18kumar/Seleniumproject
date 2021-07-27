package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.OpenChrome
		//2.google home page
	// choosing the driver and providing the location
	System.setProperty("webdriver.chrome.driver", "C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
	// To open the Chrome
	WebDriver driver = new ChromeDriver();
	// To open a link in Chrome.
	driver.get("http://www.google.co.in");
	/*to choose the Firfox
	webdriver.gecko.driver
	WebDriver driver = new FirefoxDriver();*/
	//1.enter a search term
	//2.click the wikipedia link
	driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);
		
	
	//driver.quit();
	}

}
