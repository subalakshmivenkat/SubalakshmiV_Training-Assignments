package hcl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitTest {
  @Test
  public void f() {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.get("https://www.easemytrip.com/flights.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.id("FromSector_show")).click();
	  driver.findElement(By.id("a_FromSector_show")).sendKeys("beng");
	  
	  //explicit wait of element
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spnBengaluru")));
	  driver.findElement(By.id("spnBengaluru")).click();
  }
}
