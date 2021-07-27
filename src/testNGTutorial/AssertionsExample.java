package testNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	String name="vinoth";
	boolean value=false;
	boolean value1=true;
	@Test
	public void comparename() {
		 
		Assert.assertEquals(name, "vinoth");
		Assert.assertNotEquals(name, "kumar");
		Assert.assertTrue(value1, "this should be true");
		Assert.assertFalse(value, "this should be false");
			
	}

}
