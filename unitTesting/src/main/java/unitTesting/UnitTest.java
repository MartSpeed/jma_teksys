package unitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTest {
//@BeforeAll
	@BeforeAll
	public static void setUpBefore() throws Exception {
		System.out.println("Before Class");
	}

//@AfterAll
//@BeforeEach
	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("after first setup, before methods");
	}
//@AfterEach

// the test method
	@Test
	public void testFindMax() {
		assertEquals(4, TestingSomthing.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, TestingSomthing.findMax(new int[] { -12, -3, -4, -2 }));
	}
	
	@Test
	public void reverseWordTest() {
		System.out.println("Test case for reverse word");
		assertEquals("noipmahc", TestingSomthing.reverseString("champion"));
	}
	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("after test");
	}
	@AfterAll
	public static void classTearDown() throws Exception{
		System.out.println("After the class");
	}
}
