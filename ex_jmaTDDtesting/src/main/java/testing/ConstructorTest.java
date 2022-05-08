package testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ConstructorTest {

	//
	public void testRoll(Integer expectedNumberOfFaces) {
		// given this object
		// Integer numberOfFaces = 2; // 2 die
		Integer expectedFaceValue = null; // unexpected

		// when this happens
		Die die = new Die(expectedFaceValue);
		Integer actualFaceValue = die.getCurrentFaceValue();
		Integer actualNumberOfFaces = die.getNumberOfFaces();

		// then
		Assert.assertEquals(expectedFaceValue, actualFaceValue);
		Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);

	}

	@Test
	public void test0() {
		testRoll(3);
	}

	@Test
	public void test1() {
		testRoll(4);
	}

//	@Test
//	public void test2() {
//		testRoll(6);
//	}
	
	@Test(expected = NullPointerException.class);
	public void test2() {
		testRoll(6);
	}
}
