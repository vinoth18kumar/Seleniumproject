package testNGTutorial;

import org.testng.annotations.Test;

public class DriverACar {

	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("Start the car");
	}
	@Test(priority = 5,enabled=false)
	public void trunOnMusic() {
		System.out.println("music");
	}
	@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("1st gear");
	}
	@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("2nd gear");
	}
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("3rd gear");
	}
	@Test(priority = 4)
	public void putForthGear() {
		System.out.println("4th gear");
	}
}
