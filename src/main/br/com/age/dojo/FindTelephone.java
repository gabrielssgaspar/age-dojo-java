package br.com.age.dojo;

import java.util.Arrays;
import java.util.List;

/*
 * ENCONTRE O TELEFONE
 * 
 * http://dojopuzzles.com/problemas/exibe/encontre-o-telefone/
 * 
 * Em alguns lugares é comum lembrar um número do telefone associando seus dígitos a letras. Dessa maneira, a expressão 
 * MY LOVE significa 69 5683. Claro que existem alguns problemas, uma vez que alguns números de telefone não formam
 * uma palavra ou uma frase e os dígitos 1 e 0 não estão associados a nenhuma letra.
 * 
 * Sua tarefa é ler uma expressão e encontrar o número de telefone correspondente baseado na tabela abaixo.
 * Uma expressão é composta por letras maiúsculas (A-Z), hifens (-) e os números 1 e 0.
 * 
 * Letras 	->  Número 
 * ABC 		->  2 
 * DEF 		->  3 
 * GHI 		->  4 
 * JKL 		->  5 
 * MNO 		->  6 
 * PQRS 	->  7 
 * TUV 		->  8 
 * WXYZ 	->  9 
 * 
 * Entrada: a entrada consiste de um conjunto de expressões. Cada expressão está sozinha em uma linha e
 * possui C caracteres, onde 1 ≤ C ≤ 30. A entrada é terminada por fim de arquivo (EOF).
 * 
 * Saída: para cada expressão você deve imprimir o número de telefone correspondente.
 * 
 * Exemplo de entrada:
 * 1-HOME-SWEET-HOME 
 * MY-MISERABLE-JOB
 * 
 * Saída correspondente:
 * 1-4663-79338-4663 
 * 69-647372253-562
 * 
 * Curiosidades:
 * A frase "The quick brown fox jumps over the lazy dog" é um pangrama (frase com sentido em
 * que são usadas todas as letras do alfabeto de determinada língua) da língua inglesa.
 * 
 */

public class FindTelephone {

	private static final String CHARACTER_EXCEPTIONS = "10- ";
	
	private static final List<String> CHARACTER_GROUPS = Arrays.asList(
		"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"
	);
	
	public static void main(String[] args) {
		FindTelephone findTelephone = new FindTelephone();
		System.out.println(findTelephone.from("1-HOME-SWEET-HOME"));
		System.out.println(findTelephone.from("MY-MISERABLE-JOB"));
	}
	
	private String from(String entry) {
		StringBuilder out = new StringBuilder();

		for (char c : entry.toCharArray()) {
			out.append(digitOf(c));
		}
		
		return out.toString();
	}

	public char digitOf(char c) {
		
		String character = String.valueOf(c);
		
		if ( CHARACTER_EXCEPTIONS.contains(character) ) {
			return c;
		}
		
		int number = 2;
		for (String group : CHARACTER_GROUPS) {
			if ( group.contains(character) ) return Character.forDigit(number, 10);
			number++;
		}
		
		throw new IllegalArgumentException(c + " is not a valid character!");
	}
	
}