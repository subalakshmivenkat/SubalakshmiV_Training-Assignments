package hcl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TooltipDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for element to be present in DOM (NOT visibility)
        WebElement searchBox = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//input[@type='text' and contains(@aria-label,'Search')]")
                )
        );

        // Get tooltip
        String tooltipText = searchBox.getAttribute("title");

        System.out.println("Tooltip text is: " + tooltipText);

        driver.quit();
    }
}
