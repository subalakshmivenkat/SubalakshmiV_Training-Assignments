package selenium_prgrm_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_Demo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("mobilephone"); // using css selector id

		driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute")).click();// using css selector class
	}

}
