package com.estrategit.curso.concepto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploPrintWriter {

	public static void main(String[] args) {
		try {
		FileWriter referenciaArchivo =
				new FileWriter("d:/ejemploPrintWriter.txt");
		
		PrintWriter escritor = new PrintWriter(referenciaArchivo);
		escritor.println("Hola mundo");
		escritor.printf("Mi celular es %s y me costó $ %d ", 
				"Xiaomi", 
				150);
		escritor.close();
		}catch (IOException e) {
			System.err.println("Error al escribir en el archivo");
		}
	}
	
}
