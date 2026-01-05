package NikePckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NikeScrollDown {
  @Test
  public void testscrolldown() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.nike.com/");
	  
	  Actions act=new Actions(driver);
	  act.moveToElement().perform();
	  
	  
	  
	  
  }
}
