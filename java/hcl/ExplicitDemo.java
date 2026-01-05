package hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ExplicitDemo {
  @Test
  public void f() throws InterruptedException{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/r.php?entry_point=login");
	  Select s1=new Select(driver.findElement(By.id("month")));
	  s1.selectByIndex(3);
	  Thread.sleep(2000);
	  s1.selectByValue("7");
	  Thread.sleep(2000);
	  s1.selectByVisibleText("Oct");
	  
	  
	  
  }
}
