package com.estrategit.curso.excepciones;

public class CalculadoraException 
extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String codigoTecnico;
	private String mensaje;
	
	public CalculadoraException() {
		super ("000" + " - " + "Error general del sistema");
		codigoTecnico = "000";
		mensaje = "Error general del sistema";
	}
	
	public CalculadoraException(String codigo) {
		super (codigo + " - " + "Error desconocido");
		codigoTecnico = codigo;
		mensaje = "Error desconocido";
	}
	
	public CalculadoraException(String codigo, String mensaje) {
		super (codigo + " - " + mensaje);
		codigoTecnico = codigo;
		this.mensaje = mensaje;
	}

	public String getCodigoTecnico() {
		return codigoTecnico;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	
	
	
	
	

}
