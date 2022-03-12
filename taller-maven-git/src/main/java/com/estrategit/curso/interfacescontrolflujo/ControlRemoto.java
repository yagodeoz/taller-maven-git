package com.estrategit.curso.interfacescontrolflujo;

public class ControlRemoto implements InterfaceEjecutable {

	public String ejecutar(String comando) {
		return "Ejecución de comando " + comando + ", exitoso";
	}

}
