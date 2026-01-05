package hcl;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class IgnoreTest {
  @Test
  public void FlipkartLogin() {
	  System.out.println("Login");
	  Assert.assertEquals("Login", "L");
  }
  @Test(enabled=false)
  public void FlipkartSearch() {
	  System.out.println("Search");
  }
  @Test(dependsOnMethods= {"FlipkartLogin"})
  public void FlipkartV() {
	  System.out.println("Exit");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("a");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("b");
	  
  }

}
