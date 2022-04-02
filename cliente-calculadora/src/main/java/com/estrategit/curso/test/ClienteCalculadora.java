package com.estrategit.curso.test;

import com.estrategit.curso.bo.Calculadora;
import com.estrategit.curso.bo.CalculadoraService;

public class ClienteCalculadora {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new CalculadoraService()
				                 .getCalculadoraPort();
		
		Double resultado = 
				calculadora.sumar(new Double(50), new Double(60));
		
		System.out.println("Resultado suma " + resultado);
		
		
		
	}

}
