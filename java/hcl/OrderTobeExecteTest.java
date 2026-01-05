package hcl;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class OrderTobeExecteTest {
  @Test
  public void S() {
	  System.out.println("Test 1");
  }
  @Test
  public void Ad() {
	  System.out.println("Test 2");
  }
  @Test
  public void Test3() {
	  System.out.println("Test 3");
  }
  @Test
  public void Test4() {
	  System.out.println("Test 4");
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
	  
  }

}
