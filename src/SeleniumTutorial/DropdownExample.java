package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(dropdown1);
		select.selectByIndex(4);
		//Thread.sleep(3000); to see the execution
		select.selectByValue("2");
		//Thread.sleep(3000);to see the execution
		select.selectByVisibleText("Selenium");
		
		//To get the no of elemetns in dropdown.
		List<WebElement> listofoption = select.getOptions();
		int size = listofoption.size();
		System.out.println("no of elements: "+size);
		
		// To select the option by text
		dropdown1.sendKeys("UFT/QTP");
		
		WebElement multibox= driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		// To select multiple option in dropdown box
		Select multiselectbox = new Select(multibox);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(3);	
				
	}

}
