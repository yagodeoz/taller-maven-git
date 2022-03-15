package com.curso.estrategit.dispositivos;

import com.curso.estrategit.comandos.Apagar;
import com.curso.estrategit.comandos.Encender;

public class DispositivoElectronico {

	protected String nombre;
	protected String marca;
	protected String modelo;

	protected Encender encender;
	protected Apagar apagar;

	public DispositivoElectronico(String nombre,
								  String marca,
								  String modelo) {
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		encender = new Encender();
		apagar = new Apagar();
	}
	
	public String getMarcaModelo() {
		return nombre + " " + marca + " " + modelo;
	}
	
}
