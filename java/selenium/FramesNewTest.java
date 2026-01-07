package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesNewTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://docs.oracle.com/javase/7/docs/api/");
	  driver.manage().window().maximize();
	  
	  System.out.println("Total number of frames: "+driver.findElements(By.tagName("frame")).size());
	  System.out.println("Current Frame: "+driver.findElement(By.tagName("frame")).getDomAttribute("src"));
	  
	  driver.switchTo().frame("classFrame");
	  
	  System.out.println(driver.findElement(By.cssSelector("div>h1")).getText());
	  
	  
	  
	  
	  
	  
	  
			  
  }
}
