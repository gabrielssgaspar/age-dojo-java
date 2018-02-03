package br.com.age.dojo;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

public class ATMachineTest {
	
	private static ATMachine atm;

	@BeforeClass
	public static void beforeClass() {
		atm = new ATMachine();
	}

	@Test(expected=IllegalArgumentException.class)
	public void should_not_withdraw_if_amount_is_zero() {
		atm.withdrawn(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_not_withdraw_if_an_unavailable_bill_is_required() {
		fail();
	}

	@Test
	public void should_withdraw_as_few_bills_as_possible() {
		fail();
	}
	
}