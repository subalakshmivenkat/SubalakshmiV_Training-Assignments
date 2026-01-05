package hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleFrameTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://docs.oracle.com/javase/7/docs/api/");
	  System.out.println("Total no of frames:"+driver.findElements(By.tagName("frame")).size());
	  System.out.println("current frames:"+driver.findElement(By.tagName("frame")).getDomAttribute("src"));
	  driver.switchTo().frame("classFrame");
	  System.out.print(driver.findElement(By.cssSelector("div>h1")).getText());
	  
  }
}
