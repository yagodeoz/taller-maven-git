package com.curso.estrategit.conceptos;

import java.util.ArrayList;

public class ConceptosEstructurasDato {

	public static void main(String[] args) {
		 
		ArrayList<String> listaString = new ArrayList<String>();
		
		listaString.add("Bienvenidos");
		listaString.add("Curso");
		listaString.add("Java");
		
		
		listaString.forEach( 
				elemento -> 
		{ System.out.println(elemento);}
		
				);
		
		
		
		
	}
	
}
