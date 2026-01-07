package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Xpath_Flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/"); 
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		

		String typedText = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/span[2]/span/span[1]")).getText();
		System.out.println(typedText);

	}

}