package br.com.age.dojo;

import static org.junit.Assert.assertEquals;

import java.util.Map;

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
		atm.withdrawn(5);
	}

	@Test
	public void should_withdraw_as_few_bills_as_possible() {
		
		Map<Bill, Integer> withdrawn;
		
		withdrawn = atm.withdrawn(100);
		assertEquals("Number of different bills", 1, withdrawn.size());
		assertEquals("Total of bills", 1, withdrawn.values().stream().mapToInt(Integer::intValue).sum());
		assertEquals("Hundred bills", 1, withdrawn.get(Bill.HUNDRED).intValue());
		
		withdrawn = atm.withdrawn(80);
		assertEquals("Number of different bills", 3, withdrawn.size());
		assertEquals("Total of bills", 3, withdrawn.values().stream().mapToInt(Integer::intValue).sum());
		assertEquals("Fifty bills", 1, withdrawn.get(Bill.FIFTY).intValue());
		assertEquals("Twenty bills", 1, withdrawn.get(Bill.TWENTY).intValue());
		assertEquals("Ten bills", 1, withdrawn.get(Bill.TEN).intValue());
		
		withdrawn = atm.withdrawn(30);
		assertEquals("Number of different bills", 2, withdrawn.size());
		assertEquals("Total of bills", 2, withdrawn.values().stream().mapToInt(Integer::intValue).sum());
		assertEquals("Twenty bills", 1, withdrawn.get(Bill.TWENTY).intValue());
		assertEquals("Ten bills", 1, withdrawn.get(Bill.TEN).intValue());
		
		withdrawn = atm.withdrawn(1050);
		assertEquals("Number of different bills", 2, withdrawn.size());
		assertEquals("Total of bills", 11, withdrawn.values().stream().mapToInt(Integer::intValue).sum());
		assertEquals("Hundred bills", 10, withdrawn.get(Bill.HUNDRED).intValue());
		assertEquals("Fifty bills", 1, withdrawn.get(Bill.FIFTY).intValue());
	}
	
}