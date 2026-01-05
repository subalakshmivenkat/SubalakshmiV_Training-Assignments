package hcl;

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

public class flipkartTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.flipkart.com/");
	  WebElement searchBox=wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
	  searchBox.sendKeys(Keys.CONTROL+"a");
	  searchBox.sendKeys(Keys.DELETE);
	  searchBox.sendKeys("laptop");
	  searchBox.sendKeys(Keys.ENTER);
	  
	  String parentWindow=driver.getWindowHandle();
	  System.out.println("Unique string od parent Window: "+parentWindow);
	  driver.findElement(By.xpath("(//div[@class='RG5Slk']) [2]")).click();
	  Set<String>allWindows=driver.getWindowHandles();
	  for(String eachWindow :allWindows)
	  {
		  if(!eachWindow.equals(parentWindow))
		  {
			 driver.switchTo() .window(eachWindow);
		  }
	  }
	  String offerText=driver.findElement(By.className("HlFe1v")).getText();
	  System.out.println(offerText);
	  
	  
	  
  }
}
