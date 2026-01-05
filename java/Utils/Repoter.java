package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Repoter {
	public static void generateReport(WebDriver driver,ExtentTest exTest,Status status,String stepMessage)
	{
		if(status.equals(Status.PASS))
		{
			System.out.println("The step: "+stepMessage+" is passed");
			exTest.log(status,stepMessage);
		}
		else if(status.equals(Status.FAIL))
		{
			System.out.println("The steps:"+stepMessage+"is failed");
			String screenShotName=getScreenshot(driver,"Login_Failure");
			exTest.log(status,stepMessage,MediaEntityBuilder.createScreenCaptureFromPath(screenShotName).build());
			
		}
	}
public static String getScreenshot(WebDriver driver, String errorMsg) {
		
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss").format(new Date());
		String currDir=System.getProperty("user.dir");
		TakesScreenshot scrShot = (TakesScreenshot)driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String screenShotName =currDir+ "screenshots/" + timeStamp + "_" + errorMsg + ".png";
		
		File desFile = new File(screenShotName);
		try {
			FileUtils.copyFile(srcFile, desFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return screenShotName;
	}
	

}
