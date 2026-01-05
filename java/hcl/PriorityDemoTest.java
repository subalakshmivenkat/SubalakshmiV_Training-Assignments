package hcl;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PriorityDemoTest {
  private static final String priority = null;

  @Test(priority=3)
  public void aTest() {
	  System.out.println("a");
  }
  @Test(priority=2)
  public void bTest() {
	  System.out.println("b");
  }
  @Test(priority=2)
  public void cTest() {
	  System.out.println("c");
  }
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
