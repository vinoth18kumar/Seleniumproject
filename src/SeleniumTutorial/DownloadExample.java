package SeleniumTutorial;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement download= driver.findElement(By.linkText("Download Excel"));
		download.click();
		
		//C:\Users\vinot\Downloads
		
		File filelocation = new File("C:\\Users\\vinot\\Downloads");
		File[] files=filelocation.listFiles();
		
		for (File file : files) {
			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println("filedownloaded");
				
			}
			
		}
		
	}

}
