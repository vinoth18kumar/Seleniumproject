package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver", "C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		/* driver.findElement(By.partialLinkText("Go to Home Page")).click();
		linktext-> is used by giving the full text of a element
		partiallinktext-> is used by giving the partial text of a element */
	}

}
