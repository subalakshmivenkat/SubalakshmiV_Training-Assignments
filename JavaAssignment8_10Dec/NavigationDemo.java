package pg;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationDemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Navigate to website1
		driver.navigate().to("https://www.google.com");
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println("Navigated to Google");

		// Navigate to website2
		driver.navigate().to("https://www.bing.com");
		wait.until(ExpectedConditions.titleContains("Bing"));
		System.out.println("Navigated to Bing");

		// Navigate back to website1
		driver.navigate().back();
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println("Navigated back to Google");

		// Navigate forward to website2
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleContains("Bing"));
		System.out.println("Navigated forward to Bing");

		// Navigate again to website1
		driver.navigate().to("https://www.google.com");
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println("Navigated again to Google");

		// Refresh the current website
		driver.navigate().refresh();
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println("Refreshed Google");

		// Close the browser
		driver.quit();
		System.out.println("Browser closed");
	}
}
