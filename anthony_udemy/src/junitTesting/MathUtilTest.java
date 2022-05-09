package junitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest {

	@Test
	public void MathUtil() {
		MathUtil mathUtil = new MathUtil(); // create new instance
		int expected = 1; // must match the actual for correct test results
		int actual = mathUtil.add(1,1); // testing the actual vs expected
		// assertEquals is a method that takes in 2 args(expected, actual)
		assertEquals(expected, actual);
	}
}
