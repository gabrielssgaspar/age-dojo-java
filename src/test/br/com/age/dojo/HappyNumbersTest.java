package br.com.age.dojo;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

public class HappyNumbersTest {

	private static HappyNumbers happyNumbers;

	@BeforeClass
	public static void beforeClass() {
		happyNumbers = new HappyNumbers();
	}

	@Test
	public void should_return_next_number_from_the_sum_of_each_digit_squared() {
		fail();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_throws_exception_when_zero_is_received() {
		fail();
	}
	
	@Test
	public void should_verify_a_happy_number() {
		fail();
	}
	
}