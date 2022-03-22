package com.estrategit.curso.concepto;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class EjemploConsolaJava {

	public static void main(String[] args) {
		
		try {
		PrintStream escritor = new PrintStream("D:/salidaConsola.txt"); 
		System.setOut(escritor);
		System.out.println("Hola mundo");
		System.out.println("Ejemplo");
		System.out.println("Esto es muy facil");
		}catch (FileNotFoundException e) {
		System.err.println("El archivo no existe");
		}
	}

}
