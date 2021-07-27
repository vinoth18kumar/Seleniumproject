package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement unchecked= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		boolean status1= unchecked.isSelected();
				
		WebElement checked= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		checked.isSelected();
		boolean status2= checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
				
	}

}
