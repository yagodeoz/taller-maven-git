package com.curso.estrategit.conceptos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;


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
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("Cadena1");
		vector.add( 0, "Cadena2");
		vector.add( 0, "Cadena8");
		
		for (String elem : vector) {
			System.out.println(elem);
		}
		
		HashMap<String, Long> edadPersona = 
				              new HashMap<String, Long>();
		
		edadPersona.put("ByronSegovia", new Long(39));
		edadPersona.put("JudithSegovia", new Long(14));
		edadPersona.put("SadithSegovia", new Long(5));
		edadPersona.put("MicaelaSegovia", new Long(2));
		
		Iterator<String> recorreClaves = 
				edadPersona.keySet().iterator();
		
		while (recorreClaves.hasNext()) {
			String clavePrimaria = recorreClaves.next();
			System.out.println("La persona: " 
			                   + clavePrimaria 
			                   + ", tiene: " 
			                   + edadPersona.get(clavePrimaria)
			                   + " años"); 
		}
		
		
		
	}
	
}
