package co.edureka.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalculateEMI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		Actions actions = new Actions(driver);
		WebElement loanSliderCircle = driver.findElement(By.cssSelector("#loanamoutslider>span"));
		WebElement interestSliderCircle = driver.findElement(By.cssSelector("#loaninterestslider>span"));
		WebElement tenureSliderCircle = driver.findElement(By.cssSelector("#loantermslider>span"));
		
		actions.dragAndDropBy(loanSliderCircle, 72, 0).build().perform();

							
			
	}

}
