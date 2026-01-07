package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class IgnoreTest {
  @Test
  public void flipkartLogin() {
	  System.out.println("Login");
  }
  @Test(enabled=false)
  public void flipkartSearch() {
	  System.out.println("Search");
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
