package hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test
  public void f() {
	  

	  	    WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "bookData")
	public void books(String searchText, int sortIndex) throws InterruptedException {

		driver.get("https://www.bookswagon.com/");
		Thread.sleep(3000);

		driver.findElement(By.id("inputbar")).clear();
		driver.findElement(By.id("inputbar")).sendKeys(searchText);
		driver.findElement(By.id("btnTopSearch")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("divSort")).click();
		WebElement price = driver.findElement(By.id("ddlSort"));

		Actions actions = new Actions(driver);
		actions.moveToElement(price).perform();

		driver.findElement(By.xpath("//*[@id='ddlSort']/option[" + sortIndex + "]")).click();

		Thread.sleep(3000);

		WebElement book = driver.findElement(By.xpath("//*[@id='listSearchResult']/div[1]/div[3]/div[1]/a"));
		System.out.println(book.getText());

		book.click();
		Thread.sleep(3000);
	}

	@DataProvider(name = "bookData")
	public Object[][] getData() {
		return new Object[][] { { "Selenium", 5 }, { "Java", 4 } };
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}}
}
