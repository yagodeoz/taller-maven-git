package com.estrategit.curso;

import com.estrategit.curso.excepciones.CalculadoraException;
import com.estrategit.curso.servicios.CalculadoraBasica;

public class PruebaCalculadora {
	
	public static void main(String[] args) {
		try {
		Double parametro1 = Double.parseDouble(args[0]);
		
		Double parametro2 = Double.parseDouble(args[1]);
			
		Double resultadoSuma = CalculadoraBasica.suma(
				               parametro1, 
				               parametro2);
		
		Double resultadoMultiplicacion=
				            CalculadoraBasica.multiplicar(
				            		parametro1, 
						            parametro2);
		System.out.println("La suma es: " + resultadoSuma + 
				           ", la multiplicaci�n es: " + resultadoMultiplicacion);
		} catch (CalculadoraException error) {
			
			switch (error.getCodigoTecnico()) {
			case CalculadoraBasica.CODIGO_SUMA : System.err.println(
					"Error al realizar la suma: " + 
					 error.getMensaje());				
				break;
			case CalculadoraBasica.CODIGO_MULTIPLICACION: System.err.println(
					"Error al realizar la multiplicacion: " + 
					 error.getMensaje());				
				break;	
			default:
				break;
			}
			
		}catch (NumberFormatException e) {
			System.err.println("Error en la transformaci�n de par�metros");
		}
		
	}

}
