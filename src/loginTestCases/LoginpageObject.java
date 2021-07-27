package loginTestCases;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;*/
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginpageObject {
	
	@FindBy(id = "txtUsername")
	static public WebElement username;
	@FindBy(id = "txtPassword")
	static public WebElement password;
	@FindBy(id = "btnLogin")
	static public WebElement submit;
	
	
	
	
	/*
	 * static public WebElement username(WebDriver driver) { return
	 * driver.findElement(By.id("txtUsername")); } static public WebElement
	 * password(WebDriver driver) { return driver.findElement(By.id("txtPassword"));
	 * } static public WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.id("btnLogin")); }
	 */
	
}
