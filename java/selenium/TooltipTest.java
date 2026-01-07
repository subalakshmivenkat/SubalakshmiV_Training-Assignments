package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TooltipTest {
  @Test
  public void tooltip() throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");

     
      WebElement hoverBtn = driver.findElement(By.id("mousehover"));

      String tooltipText = hoverBtn.getAttribute("title");

      System.out.println("Tooltip text is: " + tooltipText);
	  
  }
}
