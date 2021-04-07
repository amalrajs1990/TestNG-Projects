package testNGpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	String name= "CheckMyName";
	@Test
	public void checkEqual() {
		Assert.assertEquals(name, "CheckMyName");
}
}
