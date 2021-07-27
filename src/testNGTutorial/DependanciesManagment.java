package testNGTutorial;

import org.testng.annotations.Test;

public class DependanciesManagment {
	//Problem1: You have to Admit a student To engineering
	//problem2: You have to Admit a student to higher secondary
	@Test
	public void highschool() {
		System.out.println("10th");
	}
	@Test(dependsOnMethods = "highschool")
	public void highsecondary() {
		System.out.println("12th");
	}
	@Test(dependsOnMethods = "highsecondary")
	public void engineering() {
		System.out.println("degree");
	}

}
