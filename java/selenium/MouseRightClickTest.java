package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseRightClickTest {
  @Test
  public void mouserightclick() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/accesskeys.html");
	  
	  WebElement rightclickmenu=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  Actions acts= new Actions(driver);
	  acts.moveToElement(rightclickmenu)
	  .contextClick()
	  .perform();
	  
	  Thread.sleep(3000);
	  //after right click selecting an option from it here its quit
	  driver.findElement(By.xpath("//span[text()='Quit']")).click();
	  
	  
  }
}
