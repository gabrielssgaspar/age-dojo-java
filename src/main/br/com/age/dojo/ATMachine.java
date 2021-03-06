package br.com.age.dojo;

import java.util.HashMap;
import java.util.Map;

/*
 * CAIXA ELETRÔNICO
 * 
 * http://dojopuzzles.com/problemas/exibe/caixa-eletronico/
 * 
 * Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa eletrônico.
 * 
 * Os requisitos básicos são os seguintes:
 * - Entregar o menor número de notas;
 * - É possível sacar o valor solicitado com as notas disponíveis;
 * - Saldo do cliente infinito;
 * - Quantidade de notas infinito (pode-se colocar um valor finito de cédulas para aumentar a dificuldade do problema);
 * - Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00
 * 
 * Exemplos:
 * - Valor do Saque: R$ 30,00 -> Resultado Esperado: Entregar 1 nota de R$20,00 e 1 nota de R$ 10,00.
 * - Valor do Saque: R$ 80,00 -> Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.
 */
public class ATMachine {

	public Map<Bill, Integer> withdrawn(int amount) {
		
		if ( amount == 0 ) {
			throw new IllegalArgumentException("Zero is a invalid amount to withdraw!");
		}

		Map<Bill, Integer> withdrawn = new HashMap<Bill, Integer>();
		for ( Bill bill : Bill.values() ) {
			
			if ( amount < bill.value() ) {
				continue;
			}
			
			withdrawn.put(bill, amount / bill.value());
			amount = amount % bill.value();
		}
		
		if ( amount == 0 ) {
			return withdrawn;
		}
		
		throw new IllegalArgumentException("Have no available bill for the amount!");
	}

}

enum Bill {
	
	HUNDRED	(100),
	FIFTY	(50),
	TWENTY	(20),
	TEN		(10);
	
	private int value;

	private Bill(int value) { this.value = value; }

	public int value() { return value; }
	
}