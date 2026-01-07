package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowsHandlingTest {
  @Test
  public void WindowHandlingDemo() {
	  WebDriver driver=new ChromeDriver();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.flipkart.com/");
	  
	  WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
       //	  search.sendKeys(Keys.CONTROL+"a");
	  
	  search.sendKeys("Laptop");
	  search.sendKeys(Keys.ENTER);
	  String parentWindow=driver.getWindowHandle();
	  System.out.println("Unique String of Parent Window:"+ parentWindow);
	  //opens the all the opened unique strings
	  Set<String>allWindows=driver.getWindowHandles();  
	  for(String eachWindow:allWindows)
	  {
		  if(!eachWindow.equals(parentWindow))
		  {
			  driver.switchTo().window(eachWindow);
		  }	  	  
	  driver.findElement(By.xpath("(//div[@class='RG5Slk'])[2]")).click();
	  String product=driver.findElement(By.xpath("(//div[@class='RG5Slk'])[2]")).getText();
	  System.out.println(product);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  
  }
	  
  
	  
	  
	  
  }
}
