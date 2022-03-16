package com.curso.estrategit.conceptos;

import java.util.ArrayList;
import java.util.Iterator;


public class ConceptosEstructurasDato {

	public static void main(String[] args) {
		 
		ArrayList<String> listaString = new ArrayList<String>();
		
		listaString.add("Bienvenidos");
		listaString.add("Curso");
		listaString.add("Java");
		
		
		for ( String elemento1 :  listaString) {
			System.out.println(elemento1);
		}
		
		String elemento1 = "";
		
		listaString.forEach( 
				elemento -> 
				{   String segmento = elemento.substring(2);
					System.out.println(segmento);
				}
				);
		
		Iterator<String> recorre = listaString.iterator();
		while (recorre.hasNext()) {
			System.out.println(recorre.next());
		}
		
		
		
		
	}
	
}
