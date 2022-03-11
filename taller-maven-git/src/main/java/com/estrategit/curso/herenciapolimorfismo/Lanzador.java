package com.estrategit.curso.herenciapolimorfismo;

public class Lanzador {

	public static void main(String[] args) {

		Rectangulo rectangulo = new Rectangulo(20.5, 10.5);
		Circulo circulo = new Circulo(10.5);
		CalculadoraFigura.calcularAreaFigura(rectangulo);
		CalculadoraFigura.calcularAreaFigura(circulo);
	}

}
