package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingTest {
  @Test
  public void AlertHandling() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.manage().window().maximize();
	  //simple alert for ok
	  driver.findElement(By.xpath("//ul/li[1]/button[1]")).click();
	  Thread.sleep(2000);
	  Alert alert=driver.switchTo().alert();
      //accept alert
	  alert.accept();
	  
	  
	  
  }
}
