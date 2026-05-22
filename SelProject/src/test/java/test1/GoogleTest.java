package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
  @Test
  public void OpenGoogle() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
	  String title = driver.getTitle();
	  
	  System.out.println("Title of the Page ------->"+ title);
	  
	  Thread.sleep(5000);
	  
	  driver.close();
  }
}
