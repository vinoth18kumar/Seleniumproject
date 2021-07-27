package testNGTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;

public class ExtentreportsExample {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
		
	@BeforeSuite
	public void launch() {
		//reports = new ExtentReports();
		//test = reports.createTest("first test");
		ExtentEmailReporter emailreport = new ExtentEmailReporter("report.html");
		
		extent = new ExtentReports();

		extent.attachReporter(emailreport);
		test = extent.createTest("first test");
		driver= new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void action() {
		
		driver.findElement(By.name("q")).sendKeys("chennai"+Keys.ENTER);
		test.pass("pass");
	}
	
	@AfterSuite
	public void end() {
		driver.quit();
		extent.flush();
	}

}
