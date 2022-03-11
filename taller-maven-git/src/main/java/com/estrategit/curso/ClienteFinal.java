package com.estrategit.curso;

public class ClienteFinal extends Cliente {

	public ClienteFinal(String nombre, String cedula) {
		super(nombre, cedula);
		consumo = 0;
		super.cedula = "";
	}

}
