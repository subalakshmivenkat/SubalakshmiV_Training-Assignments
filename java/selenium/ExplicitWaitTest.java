package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitTest {
  @Test
  public void PerformExplicitWait() 
  {
	  
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	
	  driver.get("https://www.easemytrip.com/flights.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	  driver.findElement(By.id("FromSector_show")).click();
	  driver.findElement(By.id("a_FromSector_show")).sendKeys("beng");
	  //explicit wait
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spn2")));
	  driver.findElement(By.id("spn2")).click();
	  
	  
	  
	  
  }
}
