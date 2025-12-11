package JavaAssignment8_10Dec;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiSelectDropDownTest {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demo.mobiscroll.com/select/multiple-select");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/label/span[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Books']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='Movies, Music & Games']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='Electronics & Computers']")).click();
		driver.quit();
	}
}
