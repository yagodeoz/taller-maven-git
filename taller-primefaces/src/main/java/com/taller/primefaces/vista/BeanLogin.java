package com.taller.primefaces.vista;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "beanLogin")
@SessionScoped
public class BeanLogin {

	private String usuario;
	private String clave;
	
	public BeanLogin () {
		usuario = "";
		clave = "";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String login () {
		return "principal.xhtml";
	}
	
	
}
