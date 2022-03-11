package com.estrategit.curso.herenciapolimorfismo;

public class Circulo extends Figura {

	public static Double PI;

	private Double radio;

	static {
		PI = 3.1416;
	}

	public Circulo(Double radio) {
		this.radio = radio;
		nombre = "Circulo";
	}

	public Double getArea() {
		return PI * radio * radio;
	}

}
