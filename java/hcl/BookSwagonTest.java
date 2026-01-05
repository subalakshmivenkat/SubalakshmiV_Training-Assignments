package hcl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BookSwagonTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.bookswagon.com/");
	  driver.findElement(By.id("inputbar")).sendKeys("selenium");
	  driver.findElement(By.id("btnTopSearch")).click();
	  String Result=driver.findElement(By.className("preferences-show")).getText();
	  System.out.println(Result);
	  driver.findElement(By.id("ddlSort")).click();
	  driver.findElement(By.xpath("//*[@id=\"ddlSort\"]/option[6]")).click();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Chemical Thermodynamics of Selenium"))); 
	  driver.findElement(By.linkText("Chemical Thermodynamics of Selenium")).click();
	  String text=driver.findElement(By.id("ctl00_phBody_ProductDetail_lblTitle")).getText();
	  System.out.println(text);
	  
	  
	  
	  
  }
}
