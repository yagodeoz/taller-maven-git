package com.estrategit.curso.clausulafinal;

public class Cliente extends Persona{

	public Cliente(String cedula) {
		super(cedula);
	}
	
	public String obtenerCedulaCliente() {
		return "Cli :" + super.obtenerCedula();
	}
}
