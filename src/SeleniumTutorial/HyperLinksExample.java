package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homepg = driver.findElement(By.linkText("Go to Home Page"));
		homepg.click();
		driver.navigate().back();
		
		WebElement wheretogo= driver.findElement(By.partialLinkText("Find where am supposed"));
		String link=wheretogo.getAttribute("href");
		System.out.println("this link is going to: "+link);
		
		WebElement verify= driver.findElement(By.linkText("Verify am I broken?"));
		verify.click();
		
		String title=driver.getTitle();
		
		if (title.contains("404")) {
			System.out.println("link is broken");
		}
		
		driver.navigate().back();

		WebElement homepg1 = driver.findElement(By.linkText("Go to Home Page"));
		homepg1.click();
		
		driver.navigate().back();
		
		List<WebElement> listoflink=driver.findElements(By.tagName("a"));
		int size=listoflink.size();
		System.out.println("no of links: "+size);
		
	}

}
