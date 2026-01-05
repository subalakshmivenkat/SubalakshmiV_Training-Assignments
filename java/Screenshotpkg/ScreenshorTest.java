package Screenshotpkg;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenshorTest {
  @Test
  public void f() {
	  Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);
		
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs",prefs);
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	
		
		//to enter user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//we are using the below two lines to replace the above line
		//WebElement usrName= driver.findElement(By.id("user-name"));
		//usrName.sendKeys("");

		//to enter password
		driver.findElement(By.name("password")).sendKeys("secrets_sauce");
		
		//to perform login
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.name("password")).sendKeys("secret_sauce1");
		//to click login button
		driver.findElement(By.id("login-button")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
			String actResult = driver.findElement(By.className("title")).getText();
			
			Assert.assertEquals(actResult,"Products1");
		}
		catch(TimeoutException te)
		{
			System.out.println("Taking Screenshot for login failure");
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd_HHmmss");
			String timeStamp=sdf.format(date);
			
			TakesScreenshot scrshot=(TakesScreenshot)driver;
			File srcFile=scrshot.getScreenshotAs(OutputType.FILE);
			File desFile=new File("screenshots/"+timeStamp+"LoginFailure.png");
			try
			{
				FileUtils.copyFile(srcFile,	desFile);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		//to get text
		
		
		
  }
}
