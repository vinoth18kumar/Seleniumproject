package testNGTutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierachyExample {
	// 
  @Test
  public void test2() {
	  System.out.println("i am test2");
	  }	
  @Test
  public void test() {
	  System.out.println("i am test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am afterSuite");
  }

}
