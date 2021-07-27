package testNGTutorial;

import org.testng.annotations.Test;

public class GroupingExample {
	//Scenario: A big basket is having a different kind of mobiles.
	// let us say there are apple phones, samsung, realmi.
	
	@Test(groups = {"samsung"})
	public void samsung1() {
	System.out.println("samsung1");	
	}
	@Test(groups = {"samsung"})
	public void samsung2() {
		System.out.println("samsung2");	
	}
	@Test(groups = {"apple"})
	public void apple1() {
		System.out.println("apple1");	
	}
	@Test(groups = {"apple"})
	public void apple2() {
		System.out.println("apple2");	
	}
	@Test(groups = {"realme"})
	public void realmi1() {
		System.out.println("realmi1");	
	}
	@Test(groups = {"realme"})
	public void realmi2() {
		System.out.println("realmi2");	
	}

}
