package com.estrategit.curso.concepto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraArchivo {

	public static void main(String[] args) throws IOException{
		
		BufferedWriter escritor = null;
		try {
		FileWriter referenciaArchivo = 
				new FileWriter("D:/resultadoTaller11.txt", true);
		escritor = 
				new BufferedWriter(referenciaArchivo);
		escritor.write("\n");
		escritor.write("Ejemplo para realizar un append");
		}catch (IOException e) {
			System.err.println("Error al consumir el archivo");
		}finally {
			if (escritor != null)
				escritor.close();
		}
	}

}
