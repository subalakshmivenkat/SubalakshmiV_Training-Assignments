package hcl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.advantageonlineshopping.com/#/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println(driver.findElement(By.id("speakerTxt")).getText());
  }
}
