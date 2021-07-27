package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver", "C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://leafground.com/pages/Edit.html");
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("vinoth.sri18@gmail.com");
		
		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbox.sendKeys("hello");
		
		WebElement getbox = driver.findElement(By.name("username"));
		String txt = getbox.getAttribute("value");
		System.out.println(txt);
		
		WebElement clearbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearbox.clear();
		
		WebElement disablebox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean result= disablebox.isEnabled();
		
		System.out.println(result);
		
		
	}

}
