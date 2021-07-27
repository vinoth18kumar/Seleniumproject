package loginTestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class login {

	/*
	 * String [] [] data={ {"Admin", "admin123"}, {"Admin1", "admin1223"},
	 * {"Admin1", "admin123"}, {"Admin", "admin1223"} };
	 */
	
	// Declaring commonly in class instead of particular method.
	String[][] data = null;
	WebDriver driver;

	// adding DataProvider annotation for a method and this method returning test data.
	@DataProvider(name = "logindata")
	public String[][] logindataprovider() throws BiffException, IOException {

		// calling the method which return excel values and assigning to variable "data"
		data = exceltestdata();
		return data;

	}

	// Method to returns the data from excel using  JXL library
	public String[][] exceltestdata() throws BiffException, IOException {
		
		// giving location of the excel file.
		FileInputStream inputfile = new FileInputStream(
				"C:\\Users\\vinot\\eclipse-workspace\\Selenium Project\\src\\Testdata.xls");

		// use workbook from Jxl then create a object and assign the input file.
		Workbook wbook = Workbook.getWorkbook(inputfile);

		// selecting the sheet based on the index value.
		Sheet sheet = wbook.getSheet(0);

		// To get the row count and column count
		int row = sheet.getRows();
		int col = sheet.getColumns();

		// Creating two dimension array and assigning the size
		String[][] testdata = new String[row - 1][col];

		/*
		 * To get the cell contents and assigning to two dimension array. 
		 * important: To know the excel cell structure and array structure please refer to Testdata.xls
		 * -> sheet2
		 */ 
		
		// iterating to get the cell contents and assigning to the two dimension array.
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				testdata[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testdata;
	}

	@BeforeTest
	public void driver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}


	@AfterTest public void exit() { driver.close(); }

	// Calling the methods which is with the DataProvider annotation using its name 
	@Test(dataProvider = "logindata")
	public void loginwithcorrectcredential(String uname, String pword) {

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validatecredentials");

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword);

		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
	
	}
}
