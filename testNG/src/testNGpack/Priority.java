package testNGpack;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=1)
	public void firstPriority() {
		System.out.println("Hai i am the first: ");
	}
	@Test(priority=3)
	public void secondPriority() {
		System.out.println("Hai i am the second: ");
	}
	@Test(priority=0)
	public void thirdPriority() {
		System.out.println("Hai i am the third: ");
	}
	@Test(priority=2)
	public void fourthPriority() {
		System.out.println("Hai i am the fourth: ");
	}

}
