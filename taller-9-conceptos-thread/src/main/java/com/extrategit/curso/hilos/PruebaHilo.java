package com.extrategit.curso.hilos;

public class PruebaHilo {

	public static void main(String[] args) {
		
		Competidor comp1 = new Competidor("Byron");
		Competidor comp2 = new Competidor("Judith");
		Competidor comp3 = new Competidor("Sadith");
		Competidor comp4 = new Competidor("Micaela");
		
		comp1.setPriority(Thread.MAX_PRIORITY);
		comp1.start();
		comp2.start();
		comp3.start();
		comp4.start();

	}

}
