package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

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
import org.testng.annotations.AfterClass;

public class TakeScreenshotTest {
  @Test
  public void loginclass() {
  
  
	  Map<String,Object> prefs=new HashMap<>();
		prefs.put("credentials_enable_service",false);
		prefs.put("profile.password_manager_leak_detection", false);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); //to enter username
		
      //WebElement usrName=driver.findElement(By.id("user-name"));
      //usrName.sendKeys("user-name");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauc");//to enter password
		
		driver.findElement(By.id("login-button")).click();	//to perform login	
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
			String actResult=driver.findElement(By.className("title")).getText();//to get text
			Assert.assertEquals(actResult,"Products1");
		}
		catch(TimeoutException te)
		{
			System.out.println("Taking screenshot for login failure");
			TakesScreenshot scrshot=(TakesScreenshot)driver;
			
			File srcFile=scrshot.getScreenshotAs(OutputType.FILE);
			File desFile=new File("screenshots/LoginFailure.png");
			try
			{
				FileUtils.copyFile(srcFile, desFile);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		
  }
  

  @AfterClass
  public void afterClass() {
  }

}
