package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
				System.setProperty("webdriver.chrome.driver",
				"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
				// To open the Chrome
				WebDriver driver = new ChromeDriver();
				// To open a link in Chrome.
				driver.get("http://leafground.com/pages/Button.html");
				//1. get the x,y position
				WebElement getpositionbutton = driver.findElement(By.id("position"));
				Point xypoint=getpositionbutton.getLocation();
				int xvalue=xypoint.getX();
				int yvalue=xypoint.getY();
				System.out.println("x valuie is: " + xvalue + " y value is: "+ yvalue);
				//2.find the color			
				WebElement colorbutton = driver.findElement(By.id("color"));
				String color = colorbutton.getCssValue("background-color");
				System.out.println("button color is: "+ color);
				//3.find the size.
				WebElement sizebutton = driver.findElement(By.id("size"));
				int hight = sizebutton.getSize().getHeight();
				int widht = sizebutton.getSize().getWidth();
				System.out.println("higgh  is: "+ hight + " width is: "+widht);
				//4. to go to home
				WebElement homebutton = driver.findElement(By.id("home"));
				homebutton.click();
				
				
				
				
				
				
	}

}
