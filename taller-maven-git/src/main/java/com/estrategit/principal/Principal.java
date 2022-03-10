package com.estrategit.principal;

import com.estrategit.curso.Persona;
import com.estrategit.curso.Socio;

public class Principal {

	public static void main(String[] args) {
		Persona persona = new Persona("Byron", "000000001");
		Persona otraPersona = persona;

		System.out.println(persona.convertirCadena());

		persona.setNombrePersona("Santiago");

		System.out.println(otraPersona.convertirCadena());

		Persona personaNueva = new Persona("Judith", "00002222");

		System.out.println("Numero de personas: " + Persona.getContadorPersona());
		
		System.out.println(Persona.concatenarNombres(persona.getNombrePersona(), 
				personaNueva.getNombrePersona()));
		
		System.out.println(personaNueva);
		
		Socio socio = new Socio("Micaela", "000006");
		
		System.out.println(socio.getNombrePersona());
	}

}
