package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Vinoth\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.get("http://leafground.com/pages/Calendar.html");
		
		WebElement textbox= driver.findElement(By.id("datepicker"));
		// To select the data using send.
		//textbox.sendKeys("06/10/2020"+Keys.ENTER);
		textbox.click();
		//*[@id="ui-datepicker-div"]/div/a[2]
		//a[@title='Next']  customised xpath.
		WebElement nextbutton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		//*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[4]/a
		//a[contains(text(),'10')] customised xpath.
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		date.click();
		
	}

}
