package hcl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DragDropTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/droppable/");
	  WebElement frame=driver.findElement(By.className("demo-frame"));
	  driver.switchTo().frame(frame);
	  
	  WebElement Drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	  WebElement Drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	  
	  Actions act=new Actions(driver);
	  act.dragAndDrop(Drag, Drop).perform();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='draggable']"))); 
	  
	  
	  
	  
  }
}
