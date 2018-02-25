package br.com.age.dojo;

import java.util.HashMap;
import java.util.Map;

/*
 * LENDO UM CHEQUE
 * 
 * http://dojopuzzles.com/problemas/exibe/lendo-um-cheque/
 * 
 * Dado um cheque com o seu valor por extenso, desenvolva um programa que retorne o seu valor numérico.
 * 
 * Por exemplo se informarmos "dois mil quinhentos e vinte e três reais e dezoito centavos",
 * o seu programa deve retornar "2523,18"
 * 
 */
public class Paycheck {

	private static final Map<String,Double> VALUES;
	
	static {
		VALUES = new HashMap<String,Double>();
		VALUES.put("", 0.0);
		VALUES.put("um", 1.0);
		VALUES.put("dois", 2.0);
		VALUES.put("tres", 3.0);
		VALUES.put("quatro", 4.0);
		VALUES.put("cinco", 5.0);
		VALUES.put("seis", 6.0);
		VALUES.put("sete", 7.0);
		VALUES.put("oito", 8.0);
		VALUES.put("nove", 9.0);
		VALUES.put("dez", 10.0);
		VALUES.put("onze", 11.0);
		VALUES.put("doze", 12.0);
		VALUES.put("treze", 13.0);
		VALUES.put("quatorze", 14.0);
		VALUES.put("quinze", 15.0);
		VALUES.put("dezesseis", 16.0);
		VALUES.put("dezessete", 17.0);
		VALUES.put("dezoito", 18.0);
		VALUES.put("dezenove", 19.0);
		VALUES.put("vinte", 20.0);
		VALUES.put("trinta", 30.0);
		VALUES.put("quarenta", 40.0);
		VALUES.put("cinquenta", 50.0);
		VALUES.put("sessenta", 60.0);
		VALUES.put("setenta", 70.0);
		VALUES.put("oitenta", 80.0);
		VALUES.put("noventa", 90.0);
		VALUES.put("cem", 100.0);
		VALUES.put("cento", 100.0);
		VALUES.put("duzentos", 200.0);
		VALUES.put("trezentos", 300.0);
		VALUES.put("quatrocentos", 400.0);
		VALUES.put("quinhentos", 500.0);
		VALUES.put("seiscentos", 600.0);
		VALUES.put("setecentos", 700.0);
		VALUES.put("oitocentos", 800.0);
		VALUES.put("novecentos", 900.0);
	}
	
	private double calculate(String textValue) {
		
		double value = 0;
		
		for (String text : textValue.split(" e ")) {
			value += VALUES.get(text.trim());
		}
		
		return value;
	}
	
	public double thousandsValueOf(String valueInFull) {
		
		if ( !valueInFull.contains("mil") ) {
			return 0.0;
		}
		
		return calculate(valueInFull.split("mil")[0]) * 1000.0;
	}

}