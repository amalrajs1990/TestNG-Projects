package testNGpack;

import org.testng.annotations.Test;

public class Grouping {
	
    @Test(groups= {"AppleFruit"})
	public void apple() {
		System.out.println("I am apple");
	}
    @Test(groups= {"MangoFruit"})
	public void mango() {
		System.out.println("I am mango");
	}
    @Test(groups= {"OrangeFruit"})
	public void orange() {
		System.out.println("I am orange");
	}
    @Test(groups= {"GrapeFruit"})
	public void grapes() {
		System.out.println("I am grape");
	}
}
