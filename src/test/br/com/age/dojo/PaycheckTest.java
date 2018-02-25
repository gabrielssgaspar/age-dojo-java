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
		assertEquals(0.0, paycheck.thousandsValueOf("cinquenta reais"), 0.0001);
	}
	
	@Test
	public void should_return_the_hundreds_value() {
		assertEquals(523.0, paycheck.hundredsValueOf("dois mil quinhentos e vinte e tres reais e dezoito centavos"), 0.0001);
		assertEquals(523.0, paycheck.hundredsValueOf("quinhentos e vinte e tres reais e dezoito centavos"), 0.0001);
		assertEquals(520.0, paycheck.hundredsValueOf("quinhentos e vinte reais e dezoito centavos"), 0.0001);
		assertEquals(503.0, paycheck.hundredsValueOf("quinhentos e tres reais e dezoito centavos"), 0.0001);
		assertEquals(23.0, paycheck.hundredsValueOf("vinte e tres reais e dezoito centavos"), 0.0001);
		assertEquals(3.0, paycheck.hundredsValueOf("tres reais e dezoito centavos"), 0.0001);
		assertEquals(1.0, paycheck.hundredsValueOf("um real e dezoito centavos"), 0.0001);
		assertEquals(0.0, paycheck.hundredsValueOf("dezoito centavos"), 0.0001);
	}
	
	@Test
	public void should_return_the_cent_value() {
		assertEquals(0.18, paycheck.centsValueOf("dois mil quinhentos e vinte e tres reais e dezoito centavos"), 0.0001);
		assertEquals(0.75, paycheck.centsValueOf("quinhentos e vinte e tres reais e setenta e cinco centavos"), 0.0001);
		assertEquals(0.0, paycheck.centsValueOf("um mil reais"), 0.0001);
	}
	
}