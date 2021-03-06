package com.estrategit.curso.servicios;

import com.estrategit.curso.excepciones.CalculadoraException;

public class CalculadoraBasica {

	public static final String CODIGO_MULTIPLICACION = "003";
	public static final String CODIGO_SUMA = "002";

	public static Double suma (Double sumando1, Double sumando2) 
	throws CalculadoraException
	{
		
		if (sumando1 < 0) {
			CalculadoraException exception = 
					new CalculadoraException(CODIGO_SUMA, 
							"El sumando1 es negativo");
			throw exception;
		}
		
		if (sumando2 < 0)
			throw new CalculadoraException(CODIGO_SUMA, 
					             "El sumando2 es negativo");
			
		return 	sumando1 + sumando2;		
	}
	
	public static Double multiplicar (Double multiplicando,
			                          Double multiplicador) 
	throws CalculadoraException
	{
		
		if (multiplicando == null || multiplicador == null)
			throw new CalculadoraException(
					CODIGO_MULTIPLICACION, 
					"Uno de los factores es nulo");
		return multiplicando * multiplicador;
		
	}
	
	
}
