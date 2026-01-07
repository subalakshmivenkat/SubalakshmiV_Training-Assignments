package testng1;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Testlogdemo {
	static Logger logger=Logger.getLogger(Testlogdemo.class);
  @Test
  public static void captureLogs() {
	  int empNo=100321;
	  logger.debug("The value of empno:"+empNo);
	  logger.info("Menu is clicked");
	  logger.warn("First field name is showing warning");
	  logger.error("Login failure for valid credentials");
	  logger.fatal("Internal server error, website is not displayed");
	  
  }
}
