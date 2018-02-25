package br.com.age.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class PaycheckTest {

	private static Paycheck paycheck;

	@BeforeClass
	public static void beforeClass() {
		paycheck = new Paycheck();
	}
	
	@Test
	public void should_return_the_thousands_value() {
		assertEquals(2000.0, paycheck.thousandsValueOf("dois mil quinhentos e vinte e tres reais e dezoito centavos"), 0.0001);
		assertEquals(54000.0, paycheck.thousandsValueOf("cinquenta e quatro mil reais"), 0.0001);
		assertEquals(160000.0, paycheck.thousandsValueOf("cento e sessenta mil reais"), 0.0001);
		assertEquals(999000.0, paycheck.thousandsValueOf("novecentos e noventa e nove mil reais"), 0.0001);
		assertEquals(1000.0, paycheck.thousandsValueOf("um mil reais"), 0.0001);
	}
	
}