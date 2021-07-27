package SeleniumTutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://leafground.com/pages/Alert.html");
		WebElement normalalert = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		normalalert.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		WebElement confrimbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confrimbox.click();
		//Thread.sleep(3000);
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		WebElement promptbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		//Thread.sleep(3000);
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("hello Vinoth");
		//Thread.sleep(3000);
		promptalert.accept();
		
		
	}

}
