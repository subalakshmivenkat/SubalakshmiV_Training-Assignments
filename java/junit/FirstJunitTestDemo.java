package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;

class FirstJunitTestDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void logintest() {
		System.out.println("login");
		Assertions.assertEquals("Selenium","Selenium");
	}
	@Test
	void searchtest() {
		System.out.println("search");
		Assertions.assertTrue(true);
	}
	@Test
	void searchestest() {
		System.out.println("searches");
		Assertions.assertFalse(false);
	}
	

}
