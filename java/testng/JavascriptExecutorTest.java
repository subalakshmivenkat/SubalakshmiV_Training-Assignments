package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorTest {
  @Test
  public void jsexecutor() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.nike.com/in/w/mens-shoes-nik1zy7ok");
	  driver.manage().window().maximize();
	  //Thread.sleep(3000);
	  //driver.findElement(By.className("menu-hover-trigger-link")).click();
	  //Thread.sleep(3000);
	  //driver.findElement(By.className("JSftBPEZ")).click();
	  
	  WebElement product24=driver.findElement(By.xpath("//div[@data-product-position='24']"));
	  
	  JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("arguments[0].scrollIntoView()",product24);
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@data-product-position='26']")).click();
  }
}
