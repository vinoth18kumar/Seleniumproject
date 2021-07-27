package testNGTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Test
	@Parameters("fruit")
	public void favfruit(String name) {
		System.out.println("fav fruit: " + name );
		
	}

}
