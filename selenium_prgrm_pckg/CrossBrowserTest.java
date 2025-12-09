package selenium_prgrm_pckg;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Browser Name(Chrome/Firefox/Edge): ");
		String name = sc.next();
		WebDriver driver = null;
		if (name.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (name.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (name.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser name.Please enter the correct ones");
		}

		driver.manage().window().maximize();
		driver.get("https://github.com");

	}

}
