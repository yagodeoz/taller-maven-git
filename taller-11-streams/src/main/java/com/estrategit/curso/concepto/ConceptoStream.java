package com.estrategit.curso.concepto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConceptoStream {

	public static void main(String[] args) throws IOException {
		BufferedReader lector = null;
		try {
		FileReader referenciaArchivo =
				 new FileReader("D:/recursoTaller/facturas.txt");
		lector = new 
				BufferedReader( referenciaArchivo  );
		
		String lineaArchivo = lector.readLine();
		
		while (lineaArchivo != null) {
			System.out.println(lineaArchivo);
			lineaArchivo = lector.readLine();
		}
		} catch (FileNotFoundException errorArchivo) {
			System.err.println("El archivo no existe");
		}catch (IOException errorLectura) {
			System.err.println("Error al leer el archivo");
		}finally {
			if(lector!=null)
				lector.close();
		}
		

	}

}
