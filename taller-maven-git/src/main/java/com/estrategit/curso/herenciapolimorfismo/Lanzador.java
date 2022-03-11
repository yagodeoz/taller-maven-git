package com.estrategit.curso.herenciapolimorfismo;

public class Lanzador {

	public static void main(String[] args) {
		
		Rectangulo rectangulo = new Rectangulo(20.5, 10.5);
		Circulo circulo = new Circulo(10.5);
		Cuadrado cuadrado = new Cuadrado(5.5);
		Triangulo triangulo = new Triangulo(2.5, 4.5);
		CalculadoraFigura.calcularAreaFigura(rectangulo);
		CalculadoraFigura.calcularAreaFigura(circulo);
		CalculadoraFigura.calcularAreaFigura(cuadrado);
		CalculadoraFigura.calcularAreaFigura(triangulo);
		CalculadoraFigura.calcularAreaFigura(circulo);
	}

}
