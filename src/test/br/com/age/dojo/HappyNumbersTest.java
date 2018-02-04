package br.com.age.dojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void should_verify_if_a_number_is_a_happy_number_or_not() {
		assertFalse(happyNumbers.verify(0));
		assertTrue(happyNumbers.verify(1));
		assertFalse(happyNumbers.verify(2));
		assertFalse(happyNumbers.verify(3));
		assertFalse(happyNumbers.verify(4));
		assertFalse(happyNumbers.verify(5));
		assertFalse(happyNumbers.verify(6));
		assertTrue(happyNumbers.verify(7));
		assertFalse(happyNumbers.verify(8));
		assertFalse(happyNumbers.verify(9));
		assertTrue(happyNumbers.verify(10));
		assertFalse(happyNumbers.verify(11));
		assertFalse(happyNumbers.verify(12));
		assertTrue(happyNumbers.verify(13));
		assertFalse(happyNumbers.verify(14));
		assertFalse(happyNumbers.verify(15));
		assertFalse(happyNumbers.verify(16));
		assertFalse(happyNumbers.verify(17));
		assertFalse(happyNumbers.verify(18));
		assertTrue(happyNumbers.verify(19));
		assertFalse(happyNumbers.verify(20));
	}
	
}