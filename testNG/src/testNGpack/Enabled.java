package testNGpack;

import org.testng.annotations.Test;

public class Enabled {
	
	@Test(priority=2)
	public void car() {
		System.out.println("My car is: ");
	}
	@Test(priority=1)
	public void bike() {
		System.out.println("My bike is: ");
	}
	@Test(priority=0,enabled=false)
	public void truck() {
		System.out.println("My truck is: ");
	}
	@Test(priority=3)
	public void lorry() {
		System.out.println("My lorry is: ");
	}

}
