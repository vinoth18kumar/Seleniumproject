package loginTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingPOI {

	/*
	 * need POI jar file's to run this without error. 
	 * HSSF class is for xls 2003
	 * XSSF class is for xlsx 2007 and above
	 */

	// creating arraylist variable.
	static List<String> user= new ArrayList<String>();
	static List<String> pass= new ArrayList<String>();

	//looping to run the test case for all the data
	public void executetest() {
		for (int i = 0; i < user.size(); i++) {
			//calling the method by passing two parameters.
			launch(user.get(i), pass.get(i));
		}
	}

	// To access the url with different set of username and password.
	public void launch(String uname, String pword) {

		System.setProperty("webdriver.chrome.driver", "C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validatecredentials");

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword);

		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		driver.quit();	
	}

	// To get the data from excel.
	public void getexceldata() throws IOException {

		// giving location of the excel file.
		FileInputStream input= new FileInputStream("C:\\Users\\vinot\\eclipse-workspace\\Selenium Project\\src\\TD.xlsx");

		// select workbook from org.apache.poi.ss.usermodel.Workbook; then create a object and assign the input file.
		Workbook wbook = new XSSFWorkbook(input);

		// select the sheet from org.apache.poi.ss.usermodel.Sheet; and Selecting the sheet with index position.
		Sheet sheet= wbook.getSheetAt(0);

		// use iterator from java.util.Iterator; and row from org.apache.poi.ss.usermodel.Row; if we iterate sheet will get return rows.
		// iterate the sheet to get the row.
		Iterator<Row> rowiterator=sheet.iterator();
		int i=2;
		while (rowiterator.hasNext()) {
			Row row=rowiterator.next();

			//iterate the row to get the cell
			Iterator<Cell> celliterator=row.iterator();

			while (celliterator.hasNext()) {

				/* 
				 * Assigning i=2 for 1st iteration so even number it is
				 * considered as user and odd number it is consider as password.
				 */

				// To check "i" is even
				if (i%2==0) {
					// getting the cell value and converting to string.
					user.add(celliterator.next().getStringCellValue());	
				}
				else
				{
					//getting the cell value and converting to string.
					pass.add(celliterator.next().getStringCellValue());
				}
				i++;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDrivenUsingPOI data1= new DataDrivenUsingPOI();
		data1.getexceldata();
		data1.executetest();


	}

}
