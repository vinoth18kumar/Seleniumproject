package SeleniumTutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://www.leafground.com/pages/Window.html");
		// to get the address of default/active window
		String oldwindow = driver.getWindowHandle();
				
		WebElement parentwindow = driver.findElement(By.id("home"));
		parentwindow.click();
		
		// to get all the pup up/new windows of the driver
		Set<String> handles= driver.getWindowHandles();
		
		// to move the  control to the  new/popup winodow
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
			}
		WebElement childwindow = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		childwindow.click();
		
		driver.close();
		driver.switchTo().window(oldwindow);
		
		WebElement openmultiplewindows=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		openmultiplewindows.click();
		
		int size=driver.getWindowHandles().size();
		System.out.println("no of windows: "+ size);
		
		WebElement closewindow = driver.findElement(By.id("color"));
		closewindow.click();
		Set<String> windows=driver.getWindowHandles();
		
		for (String allwindows : windows) {
			if (!allwindows.equals(oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
		}
		
		
		
	}

}
