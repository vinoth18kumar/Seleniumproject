package SeleniumTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// choosing the driver and providing the location
		System.setProperty("webdriver.chrome.driver",
				"C:\\Vinoth\\Software\\chromedriver_win32\\chromedriver.exe");
		// To open the Chrome
		WebDriver driver = new ChromeDriver();
		// To open a link in Chrome.
		driver.navigate().to("http://www.leafground.com/pages/table.html");

		// to get all the <th> tag or columns from the page and its column size.
		List<WebElement> listofheader= driver.findElements(By.tagName("th"));
		int colsize= listofheader.size();
		System.out.println("no of columns: "+ colsize);

		// To get all the <tr> tag or rows from the page and its row size.
		List<WebElement> listofrow=driver.findElements(By.tagName("tr"));
		int rowsize=listofrow.size();
		System.out.println("no of rows: "+rowsize);

		//To get the value from the <td> cell which is next to another <td> cell based on its value.
		WebElement getpercent=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String text= getpercent.getText();
		System.out.println("percentage is: "+text);

		// To get all the progress data of the table. i.e: the column td[2]
		List<WebElement> progresslist= driver.findElements(By.xpath("//td[2]"));

		//creating integer Array list variable
		List<Integer> numlist= new ArrayList<Integer>();

		//looping each progress list web element and getting the value
		for (WebElement webElement : progresslist) {
			String value=webElement.getText().replace("%", "");

			// converting the string to integer and adding to the array list.
			numlist.add(Integer.parseInt(value));
		}
		// To print all the value of array list.
		System.out.println(numlist);

		// To compare and get the minimum value of the given collection
		Integer smallnum=Collections.min(numlist);
		System.out.println(smallnum);

		// converting integer to string
		String str=Integer.toString(smallnum)+"%";

		/* 	X-path:
		 * //td[normalize-space()='30%']//following::td[1].
		 *  normalize-space() -> it is used to remove the prefix and suffix space for 30%. 
		 *  "\"" -> it is the escaping character used before and after assigning the string to string.
		 */


		String finalxpath="//td[normalize-space()=" + "\""+ str + "\"" + "]//following::td[1]";
		System.out.println(finalxpath);

		WebElement check= driver.findElement(By.xpath(finalxpath));
		check.click();
		/*
		 * Thread.sleep(6000); 
		 * Actions act= new Actions(driver);
		 * act.moveToElement(driver.findElement(By.xpath(finalxpath))).click().build().
		 * perform();
		 */

	}

}
