package selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitsTest {
  @Test
  public void PerformImplicitWait() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	
	  driver.get("https://www.easemytrip.com/flights.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.id("FromSector_show")).click();
	  driver.findElement(By.id("a_FromSector_show")).sendKeys("beng");
	  driver.findElement(By.id("spn2")).click();

	  
	 

  }
}

