package br.com.age.dojo;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

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
		assertEquals(49, happyNumbers.nextOf(7));
		assertEquals(97, happyNumbers.nextOf(49));
		assertEquals(130, happyNumbers.nextOf(97));
		assertEquals(10, happyNumbers.nextOf(130));
		assertEquals(1, happyNumbers.nextOf(10));
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