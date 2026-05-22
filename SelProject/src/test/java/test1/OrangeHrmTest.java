package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmTest {
  @Test
  public void OpenOrangeHrm() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.manage().window().maximize();

	  Thread.sleep(5000);
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  
	  driver.findElement(By.className("oxd-button")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.close();
  }
}
