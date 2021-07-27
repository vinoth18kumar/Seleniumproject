package SeleniumTutorial;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class TakesScreenshotExample {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
		"C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		File desitnationfile= new File("C:\\Users\\vinot\\eclipse-workspace\\Selenium Project\\src\\screenshot.png");
		FileHandler.copy(sourcefile, desitnationfile);
		
		Robot rob = new Robot();
		Dimension sccreensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRect= new Rectangle(sccreensize);
		BufferedImage source=rob.createScreenCapture(screenRect);
		File destination= new File("C:\\Users\\vinot\\eclipse-workspace\\Selenium Project\\src\\robotimage.png");
		ImageIO.write(source, "png", destination);
		
		
				
	}

}
