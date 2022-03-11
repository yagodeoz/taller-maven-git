package com.estrategit.curso;

public class Socio extends Persona{

	private String codigoSocio;
	
	/*public Socio(String nombre, String cedula, String codigoSocio) {
		super(nombre, cedula);
		this.codigoSocio = codigoSocio;
	}*/

	public Socio(String nombre, String cedula) {
		super(nombre, cedula);
		codigoSocio = "";
	}
	
	public Socio (String nombre, String cedula, String codigoSocio) {
		super(nombre, cedula);
		this.codigoSocio = codigoSocio;
	}
	
}
