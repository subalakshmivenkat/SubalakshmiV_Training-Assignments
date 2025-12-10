package pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBoxDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
        radioButton.click();

        WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
        WebElement checkBox3 = driver.findElement(By.id("checkBoxOption3"));

        checkBox1.click();
        checkBox3.click();
    }
}
