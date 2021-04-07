package testNGpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	@Test
	public void openGoogle() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elco\\Downloads\\chromedriver_win32\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
		
	}
	@Test
    public void openBing() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elco\\Downloads\\chromedriver_win32\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bing.com/");
		
	}
	@Test
    public void openYahoo() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elco\\Downloads\\chromedriver_win32\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.yahoo.com/");
	
}


}
