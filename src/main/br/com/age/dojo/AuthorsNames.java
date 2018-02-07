package br.com.age.dojo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * NOMES DE AUTORES DE OBRAS BIBLIOGRÁFICAS
 * 
 * http://dojopuzzles.com/problemas/exibe/nomes-de-autores-de-obras-bibliograficas/
 * 
 * Quando se lista o nome de autores de livros, artigos e outras publicações é comum que se apresente
 * o nome do autor ou dos autores da seguinte forma: sobrenome do autor em letras maiúsculas,
 * seguido de uma vírgula e da primeira parte do nome apenas com as iniciais maiúsculas.
 * 
 * Por exemplo:
 * - SILVA, Joao
 * - COELHO, Paulo
 * - ARAUJO, Celso de
 * - GUIMARAES
 * - SILVA NETO, Joao
 * - NETO, Joao
 * 
 * Seu desafio é fazer um programa que leia um número inteiro correspondendo ao número de nomes que
 * será fornecido e, a seguir, leia estes nomes (que podem estar em qualquer tipo de letra) e
 * imprima a versão formatada no estilo exemplificado acima.
 * 
 * As seguintes regras devem ser seguidas nesta formatação:
 * 
 * - o sobrenome será igual a última parte do nome e deve ser apresentado em letras maiúsculas;
 * 
 * - se houver apenas uma parte no nome, ela deve ser apresentada em letras maiúsculas (sem vírgula);
 * 
 * - se a última parte do nome for igual a "FILHO", "FILHA", "NETO", "NETA", "SOBRINHO", "SOBRINHA"
 *   ou "JUNIOR" e houver duas ou mais partes antes, a penúltima parte fará parte do sobrenome;
 *   
 * - as partes do nome que não fazem parte do sobrenome devem ser impressas com a inicial maiúscula
 *   e com as demais letras minúsculas;
 *   
 * - "da", "de", "do", "das", "dos" não fazem parte do sobrenome e não iniciam por letra maiúscula.
 */
public class AuthorsNames {

	private static final List<String> SPECIAL_SURNAMES = Arrays.asList(
		"FILHO", "FILHA", "NETO", "NETA", "SOBRINHO", "SOBRINHA", "JUNIOR"
	);

	public String surname(String name) {
		
		LinkedList<String> words = new LinkedList<String>(Arrays.asList(name.split(" ")));
		
		String surname = "", lastWord;
		
		do {
			
			lastWord = words.removeLast().toUpperCase();
			surname = lastWord + " " + surname;
			
		} while ( SPECIAL_SURNAMES.contains(lastWord) && words.size() > 1 );
		
		return surname.trim();
	}

	public String forename(String name) {
		
		if ( !name.contains(" ") ) {
			return "";
		}

		String forename = removeLastWord(name);
		
		if ( surname(name).contains(" ") ) {
			forename = removeLastWord(forename);
		}
		
		return forename;
		
	}

	private String removeLastWord(String name) {
		return name.substring(0, name.lastIndexOf(" "));
	}

}