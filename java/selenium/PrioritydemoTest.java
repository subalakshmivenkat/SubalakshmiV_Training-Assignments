package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PrioritydemoTest {
  @Test(priority=1)
  public void atest() {
	  System.out.println("a");
	  Assert.assertEquals("java", "selenium");
  }
  @Test(priority=3)
  public void btest()
  {
	  System.out.println("b");
	  Assert.assertTrue(true);
	  
	  
  }
  @Test(priority=3)
  public void ctest()
  {
	  System.out.println("c");
	  Assert.assertFalse(true);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

}
