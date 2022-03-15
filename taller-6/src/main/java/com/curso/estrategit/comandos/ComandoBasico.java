package com.curso.estrategit.comandos;

import com.curso.estrategit.interfaces.IComando;

public abstract class ComandoBasico implements IComando{

	protected String resultado;

	public String getResultado() {
		return resultado;
	}
	
}
