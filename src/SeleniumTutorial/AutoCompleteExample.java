package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
				System.setProperty("webdriver.chrome.driver",
				"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
				// To open the Chrome
				WebDriver driver = new ChromeDriver();
				// To open a link in Chrome.
				driver.get("http://www.leafground.com/pages/autoComplete.html");
				
				WebElement autocomplete = driver.findElement(By.id("tags"));
				autocomplete.sendKeys("s");
				Thread.sleep(5000);
				List<WebElement> ullist = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
				int size= ullist.size();
				System.out.println(size);
				
			    for (WebElement webElement : ullist) {
				if(webElement.getText().equals("Web Services"))
				{
					webElement.click();
					break;
					
				}
								
			}
							
	}

}
