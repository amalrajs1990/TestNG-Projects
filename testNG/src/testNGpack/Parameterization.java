package testNGpack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
	@Parameters("Name")
	public void printTheValue(String receiveHere) {
	System.out.println("Parameter example is awesome:" +receiveHere);
	}

}
