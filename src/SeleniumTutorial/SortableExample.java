package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://leafground.com/pages/sortable.html");
		//*[@id="sortable"/li]
		List<WebElement> ullist= driver.findElements(By.xpath("*[@id=\'sortable\'/li]"));
		WebElement fromelement = ullist.get(6);
		WebElement tolement = ullist.get(0);
		
		Actions action= new Actions(driver);
		action.clickAndHold(fromelement);
		action.moveToElement(tolement);
		action.release(tolement);
		action.build().perform();
	}

}
