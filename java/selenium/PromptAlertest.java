package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptAlertest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.manage().window().maximize();
	  //prompt alert 
	  driver.findElement(By.xpath("//ul/li[3]/button")).click();
	  Thread.sleep(2000);
	  Alert alert=driver.switchTo().alert();
	  Thread.sleep(2000);
	  alert.sendKeys("Selenium Test");
	  alert.accept();
	 
	  
  }
}
