package br.com.age.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;


public class AuthorsNamesTest {
	
	private static AuthorsNames authorsNames;

	@BeforeClass
	public static void beforeClass() {
		authorsNames = new AuthorsNames();
	}
	
	@Test
	public void should_return_surname_only() {
		assertEquals("GUIMARAES", authorsNames.surname("Guimaraes"));
		assertEquals("FILHO", authorsNames.surname("João Filho"));
		assertEquals("SANTOS NETO", authorsNames.surname("João dos Santos Neto"));
		assertEquals("GASPAR", authorsNames.surname("Gabriel dos Santos Silva Gaspar"));
	}

}