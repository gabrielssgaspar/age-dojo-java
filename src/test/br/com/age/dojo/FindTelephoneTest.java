package br.com.age.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class FindTelephoneTest {
	
	private static FindTelephone findTelephone;

	@BeforeClass
	public static void beforeClass() {
		findTelephone = new FindTelephone();
	}

	@Test
	public void should_return_zero_when_zero_is_received() {
		assertEquals('0', findTelephone.digitOf('0'));
	}
	
	@Test
	public void should_return_one_when_one_is_received() {
		assertEquals('1', findTelephone.digitOf('1'));
	}
	
	@Test
	public void should_return_hyphen_when_hyphen_is_received() {
		assertEquals('-', findTelephone.digitOf('-'));
	}
	
	@Test
	public void should_return_space_when_space_is_received() {
		assertEquals(' ', findTelephone.digitOf(' '));
	}
	
	@Test
	public void should_return_the_corresponding_number_when_a_capital_letter_is_received() {
		assertEquals('2', findTelephone.digitOf('A'));
		assertEquals('2', findTelephone.digitOf('B'));
		assertEquals('2', findTelephone.digitOf('C'));
		assertEquals('3', findTelephone.digitOf('D'));
		assertEquals('3', findTelephone.digitOf('E'));
		assertEquals('3', findTelephone.digitOf('F'));
		assertEquals('4', findTelephone.digitOf('G'));
		assertEquals('4', findTelephone.digitOf('H'));
		assertEquals('4', findTelephone.digitOf('I'));
		assertEquals('5', findTelephone.digitOf('J'));
		assertEquals('5', findTelephone.digitOf('K'));
		assertEquals('5', findTelephone.digitOf('L'));
		assertEquals('6', findTelephone.digitOf('M'));
		assertEquals('6', findTelephone.digitOf('N'));
		assertEquals('6', findTelephone.digitOf('O'));
		assertEquals('7', findTelephone.digitOf('P'));
		assertEquals('7', findTelephone.digitOf('Q'));
		assertEquals('7', findTelephone.digitOf('R'));
		assertEquals('7', findTelephone.digitOf('S'));
		assertEquals('8', findTelephone.digitOf('T'));
		assertEquals('8', findTelephone.digitOf('U'));
		assertEquals('8', findTelephone.digitOf('V'));
		assertEquals('9', findTelephone.digitOf('W'));
		assertEquals('9', findTelephone.digitOf('X'));
		assertEquals('9', findTelephone.digitOf('Y'));
		assertEquals('9', findTelephone.digitOf('Z'));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_throws_exception_when_a_lower_case_letter_is_received() {
		findTelephone.digitOf('a');
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_throws_exception_when_a_number_between_two_and_nine_is_received() {
		findTelephone.digitOf('5');
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_throws_exception_when_a_special_character_is_received() {
		findTelephone.digitOf('[');
	}
	
}