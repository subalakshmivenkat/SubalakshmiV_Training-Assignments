package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandlingassTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  
	  String parentWindow=driver.getWindowHandle();
	  //open window
	  driver.findElement(By.id("openwindow")).click();
	  //open tab
	  driver.findElement(By.id("opentab")).click();
	  
	  //geting all the windows
	  Set<String>allWindows=driver.getWindowHandles();
	  for(String eachWindow:allWindows)
	  {
		  if(!eachWindow.equals(parentWindow))
		  {
			  driver.switchTo().window(eachWindow);
		  }
	  }
	  
	  
	  
	  }
}
