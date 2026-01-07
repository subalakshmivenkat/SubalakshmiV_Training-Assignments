package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropTest {
  @Test
  public void draganddrop() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/droppable/");
	  Thread.sleep(3000);
	  
	  driver.switchTo().frame(0);
	 
	  WebElement drag=driver.findElement(By.id("draggable"));
	  
	 
	  WebElement drop=driver.findElement(By.id("droppable"));
	  Actions acts=new Actions(driver);
	  acts.dragAndDrop(drag, drop).build().perform();
	  Thread.sleep(5000);
	  
	  
	  
  }
}
