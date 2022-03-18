package com.estrategit.curso.servicios;

import com.estrategit.curso.excepciones.CalculadoraException;

public class CalculadoraBasica {

	public static Double suma (Double sumando1, Double sumando2) 
	throws CalculadoraException
	{
		
		if (sumando1 == null) {
			CalculadoraException exception = 
					new CalculadoraException("002", 
							"El sumando1 es nulo");
			throw exception;
		}
		
		if (sumando2 == null)
			throw new CalculadoraException("002", 
					             "El sumando2 es nulo");
			
		return 	sumando1 + sumando2;		
	}
	
	public static Double multiplicar (Double multiplicando,
			                          Double multiplicador) 
	throws CalculadoraException
	{
		
		if (multiplicando == null || multiplicador == null)
			throw new CalculadoraException(
					"003", 
					"Uno de los factores es nulo");
		return multiplicando * multiplicador;
		
	}
	
	
}
