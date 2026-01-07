package selenium;

import org.testng.annotations.Test;

import utils.ExcelReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataProviderFlipkartTest {
	WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void f(String bookName,String sortBy,String nthBook) {
		  WebDriver driver=new ChromeDriver();
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.flipkart.com/");
		  
		  WebElement search=wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		  search.sendKeys(Keys.CONTROL+"a");
		  search.sendKeys(Keys.DELETE);
		  search.sendKeys("Laptop");
		  search.sendKeys(Keys.ENTER);
	  
		  String parentWindow=driver.getWindowHandle();
		  System.out.println("Unique String of Parent Window: "+parentWindow);
		  

		  driver.findElement(By.xpath("(//div[@class='RG5Slk'])[2]")).click();
		  
		  Set<String> allWindows=driver.getWindowHandles();
		  for(String eachWindow:allWindows) {
			  if(!eachWindow.equals(parentWindow)) {
				  driver.switchTo().window(eachWindow);
			  }
		  }
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("HlFe1v")));
		  String text=driver.findElement(By.className("HlFe1v")).getText();
		  System.out.println("Text: "+text);
		  driver.quit();
	  }
	  
	  @DataProvider
	  public Object[][] dp() {
	    Object[][] data = ExcelReader.readData();
	    return data;
	    };
	  }