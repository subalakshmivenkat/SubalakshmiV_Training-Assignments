package JUnitPckg;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) 
class FirstJUnitTest {
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
		
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Beforeeach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Aftereach");
	}

	@Test @Order(2)
	void test() {
		System.out.println("Login Test");
		Assertions.assertEquals("Selenium","Sele");
		//fail("Not yet implemented");
	}
	@Test  @Order(1)
	void searchTest() {
		System.out.println("Search Test");
		Assertions.assertTrue(true);
		
		
		
	}

}
