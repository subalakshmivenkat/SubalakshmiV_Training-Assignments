package JavaAssignment9_11Dec;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClickOpenTabTest {
  @Test
  public void clicktabfunc() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.findElement(By.cssSelector(".btn-style.class1.class2")).click();
	  String tab1=driver.getWindowHandle();
	  Set<String> allTabs=driver.getWindowHandles();
	  for(String tab:allTabs) {
		  if(!tab.equals(tab1)) {
			  driver.switchTo().window(tab);
		  }
	  }
	  String text=driver.findElement(By.cssSelector(".section-title.mt-50")).getText();
	  if(text.contains("QAClick Academy")) {
		  System.out.println("The new tab successfully opened");
	  }else {
		  System.out.println("The tab does not open");
	  }
//	  driver.quit();
	  
  }
}
