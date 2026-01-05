package hcl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  WebElement rightClickMenu=driver.findElement(By.xpath("//span[text()='right click me']"));
	  Actions acts=new Actions(driver);
	  acts.moveToElement(rightClickMenu).contextClick().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='Edit']")).click();
	  //Thread.sleep(3000);
	  Alert alert =driver.switchTo().alert();
	  Thread.sleep(3000);
	  alert.accept();
  }
}
