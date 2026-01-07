package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ExeOrderTest {
  @Test
  public void test1() {
	  System.out.println("test1");
  }
  @Test
  public void test2()
  {
	  System.out.println("test2");
	  
  }
  @Test
  public void test3()
  {
	  System.out.println("test3");
	  
  }
  @Test
  public void test4()
  {
	  System.out.println("test4");
	  
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
