package com.curso.estrategit.conceptos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
		
		HashMap<String, Integer> edadPersona = 
				              new HashMap<String, Integer>();
		
		edadPersona.put("ByronSegovia", new Integer(39));
		edadPersona.put("JudithSegovia", new Integer(14));
		edadPersona.put("SadithSegovia", new Integer(5));
		edadPersona.put("MicaelaSegovia", new Integer(2));
		
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
		
		for ( Map.Entry<String, Integer> reg :
			edadPersona.entrySet()
			) 
		{
			System.out.println("La persona: " 
	                   + reg.getKey() 
	                   + ", tiene: " 
	                   + reg.getValue()
	                   + " años"); 
		}
		
		
		
	}
	
}
