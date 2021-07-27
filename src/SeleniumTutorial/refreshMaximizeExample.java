package SeleniumTutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class refreshMaximizeExample {
	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
	
	//Chromeoptions class to maximize the Chrome
	
	ChromeOptions chromeoption = new ChromeOptions();
	chromeoption.addArguments("--start-maximized");
	
	WebDriver driver = new ChromeDriver(chromeoption);
	
	driver.get("http://www.google.co.in");
	driver.findElement(By.name("q")).sendKeys("Agni");
	
	//To maximize 
	//driver.manage().window().maximize();
	
	
	//refresh command
	//driver.navigate().refresh();
	
	//driver.getcurrenturl method to refresh
	driver.get(driver.getCurrentUrl());

	//JavascripExecutor
	JavascriptExecutor executor= (JavascriptExecutor) driver;
	executor.executeScript("location.reload()");
	
	//robot class 
	  Robot rob= new Robot(); rob.keyPress(KeyEvent.VK_F5);
	  rob.keyRelease(KeyEvent.VK_F5);
	 
	  //Dimension class to maximize
		/*
		 * Dimension dimension= new Dimension(1000, 500);
		 * driver.manage().window().setSize(dimension);
		 */
	  
	
	}


}
