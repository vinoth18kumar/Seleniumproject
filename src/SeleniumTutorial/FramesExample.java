package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://www.leafground.com/pages/frame.html");
		// To move the control to the 1st frame.
		driver.switchTo().frame(0);
		
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		// To move the control to the main page.
		driver.switchTo().defaultContent();
		// To move the control to the 2nd frame
		driver.switchTo().frame(1);
		// To move the control to the nested frame of 2nd frame.
		driver.switchTo().frame("frame2");
		
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
		
		driver.switchTo().defaultContent();
		// To get the no of frames in the page.
		int noofframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println(noofframes);
		
			
	}

}
