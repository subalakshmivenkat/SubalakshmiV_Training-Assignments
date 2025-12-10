package pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();

        driver.navigate().back();

        driver.findElement(By.partialLinkText("InterviewQues")).click();
    }
}
