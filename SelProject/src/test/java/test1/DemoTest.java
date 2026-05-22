package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
  @Test
  public void launchBrowser() throws InterruptedException {
	  
	  System.out.println("launching a chrome browser");
		
		// Test 1 --- Launch chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		// website launch 
		
		driver.get("https://www.amazon.in/");
		
		// to maximize window size
		
		driver.manage().window().maximize();
		
		// get the title of webpage
		String title = driver.getTitle();
		
		System.out.println("Title of the page  is ------> " + title);
		
		System.out.println("Launched");
		
		// wait for 5 second then close browser 
		Thread.sleep(5000);
		
		
		
		// to close browser
		driver.close();
  }
}
