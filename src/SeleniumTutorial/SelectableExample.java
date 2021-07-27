package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable= driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size = selectable.size();
		System.out.println(size);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();
		
		/*action.clickAndHold(selectable.get(0));
		action.clickAndHold(selectable.get(1));
		action.clickAndHold(selectable.get(2));
		action.build().perform();*/
		
	}

}
