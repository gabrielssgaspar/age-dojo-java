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
	
	@Test
	public void should_return_forename_only() {
		assertEquals("", authorsNames.forename("Guimaraes"));
		assertEquals("João", authorsNames.forename("João Filho"));
		assertEquals("João dos", authorsNames.forename("João dos Santos Neto"));
		assertEquals("Gabriel dos Santos Silva", authorsNames.forename("Gabriel dos Santos Silva Gaspar"));
	}
	
	@Test
	public void should_return_complete_authoring_name() {
		assertEquals("GUIMARAES", authorsNames.authoringName("Guimaraes"));
		assertEquals("FILHO, João", authorsNames.authoringName("João Filho"));
		assertEquals("SANTOS NETO, João dos", authorsNames.authoringName("João dos Santos Neto"));
		assertEquals("GASPAR, Gabriel dos Santos Silva", authorsNames.authoringName("Gabriel dos Santos Silva Gaspar"));
	}

}