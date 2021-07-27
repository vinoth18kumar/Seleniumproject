package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement selectcheckbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		selectcheckbox.click();
		
		WebElement Confirmcheckbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean result =Confirmcheckbox.isSelected();
		System.out.println(result);
		
		WebElement deselectbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		boolean result1= deselectbox.isSelected();
		if (result1) {
			deselectbox.click();
		}
		
		WebElement selectbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if(selectbox.isSelected()) {
			selectbox.click();
		}
			
		
	}

}
