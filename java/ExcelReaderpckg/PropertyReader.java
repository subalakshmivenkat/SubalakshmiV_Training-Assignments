package ExcelReaderpckg;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PropertyReader {
	WebDriver driver;
  @Test
  public void testproperty() {
	  Properties prop=PropertyReader.readProperty();
	  String browserName=prop.getProperty("Browser");
	  
	  if(browserName.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }
	  else if(browserName.equalsIgnoreCase("firefox"))
	  {
		  driver =new FirefoxDriver();
	  }
	  else if(browserName.equalsIgnoreCase("edge"))
	  {
		  driver =new EdgeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get(prop.getProperty("URL"));
  }
}
