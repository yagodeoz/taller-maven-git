package com.estrategit.curso.excepciones;

public class CalculadoraException 
extends Exception {

	public static final String ERROR_DESCONOCIDO = "Error desconocido";

	public static final String ERROR_GENERAL_DEL_SISTEMA = "Error general del sistema";

	public static final String CODIGO_DEFECTO = "000";

	private static final long serialVersionUID = 1L;
	
	private String codigoTecnico;
	private String mensaje;
	
	public CalculadoraException() {
		super (CODIGO_DEFECTO + " - " + ERROR_GENERAL_DEL_SISTEMA);
		codigoTecnico = CODIGO_DEFECTO;
		mensaje = ERROR_GENERAL_DEL_SISTEMA;
	}
	
	public CalculadoraException(String codigo) {
		super (codigo + " - " + ERROR_DESCONOCIDO);
		codigoTecnico = codigo;
		mensaje = ERROR_DESCONOCIDO;
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
