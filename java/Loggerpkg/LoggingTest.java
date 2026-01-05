package Loggerpkg;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoggingTest {
	static Logger logger = Logger.getLogger(LoggingTest.class);

	@Test
	public void captureLogs() {
		int empNo = 100321;
		logger.debug("The value of empno: "+empNo);
		logger.info("Menu is clicked");
		logger.warn("First name field is showing");
		logger.error("Login failure for valid credentials");
		logger.fatal("Internal server error,website is not displayed");

	}
}
