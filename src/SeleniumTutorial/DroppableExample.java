package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DroppableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To = driver.findElement(By.id("droppable"));
	
		Actions action = new Actions(driver);
		
		action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		// simplest way
		action.dragAndDrop(From, To).build().perform();
		
	}	

}
