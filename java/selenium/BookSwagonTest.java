package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class BookSwagonTest {
  @Test
  public void books() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.bookswagon.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.id("inputbar")).sendKeys("Selenium");
	  driver.findElement(By.id("btnTopSearch")).click();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.id("divSort")).click();
	  WebElement price=driver.findElement(By.id("ddlSort"));
	
	  
	  Actions actions=new Actions(driver);
	  actions.moveToElement(price).perform();
	  driver.findElement(By.xpath("//*[@id=\"ddlSort\"]/option[5]")).click();
	  Thread.sleep(3000);
	  WebElement book = driver.findElement(By.xpath("//*[@id=\"listSearchResult\"]/div[1]/div[3]/div[1]/a"));
	  book.click();
	  System.out.println(book.getText());
	  	
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
