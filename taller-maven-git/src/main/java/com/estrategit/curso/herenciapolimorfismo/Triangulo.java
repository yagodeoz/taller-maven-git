package com.estrategit.curso.herenciapolimorfismo;

public class Triangulo extends Figura {

	protected Double base;
	protected Double altura;

	public Triangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
		nombre = "Triangulo";
	}

	public Double getArea() {
		return base * altura / 2;
	}

}
