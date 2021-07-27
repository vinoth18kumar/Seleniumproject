package UsingPropertiesOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingPropertiesfileOperation {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		FileInputStream stream= new FileInputStream("Config.Properties");
		Properties properties= new Properties();
		properties.load(stream);
		String bro=properties.getProperty("Browser");
		String driloc=properties.getProperty("Driverlocation");
		
		if(bro.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", driloc);
			driver = new ChromeDriver();
			driver.get("https://www.gmail.com/");
			} else if(bro.equalsIgnoreCase("firfox"))
			{
			System.setProperty("webdriver.gecko.driver", driloc);
			driver = new FirefoxDriver();
			driver.get("https://www.gmail.com/");
			}

	}
}