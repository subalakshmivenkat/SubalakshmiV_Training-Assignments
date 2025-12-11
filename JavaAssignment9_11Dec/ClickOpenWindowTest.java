package JavaAssignment9_11Dec;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClickOpenWindowTest {
  @Test
  public void clickfunc() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	  driver.findElement(By.id("openwindow")).click();
	  String wind1=driver.getWindowHandle();
	  Set<String> allWindows=driver.getWindowHandles();
	  for(String eachWindow:allWindows) {
		  if(!eachWindow.equals(wind1)) {
			  driver.switchTo().window(eachWindow);
		  }
	  }
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-lg-8.col-md-8")));
	  String text=driver.findElement(By.cssSelector(".col-lg-8.col-md-8")).getText();
	  if(text.contains("Access all our Courses")) {
		  System.out.println("The new window is opened successfully");
	  }else {
		  System.out.println("The window is not opened");
	  }
//	  driver.quit();
  }
}
