package com.taller.primefaces.vista;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.taller.servicio.entidades.Usuario;
import com.taller.servicio.negocio.ServicioAutenticacion;

@ManagedBean (name = "beanLogin")
@SessionScoped
public class BeanLogin {

	private String usuario;
	private String clave;
	
	private Usuario usuarioBD;
	
	@EJB
	private ServicioAutenticacion servicio;
	
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
		
		usuarioBD = servicio.autenticar(usuario.toLowerCase(), clave);
		
		if (usuarioBD == null){
			gestionMensajes("Usuario/Clave incorrecto", FacesMessage.SEVERITY_ERROR);
			return "";
		}
		
		if (usuarioBD.getEstado().equals("I")) {
			gestionMensajes("Usuario inactivo", FacesMessage.SEVERITY_ERROR);
			return "";
		}
		
		return "principal.xhtml";
	}

	private void gestionMensajes(String mensajeTexto, Severity nivelSeveridad) {
		FacesMessage mensaje = new FacesMessage(nivelSeveridad, 
				mensajeTexto, null);
		FacesContext.getCurrentInstance().addMessage(null, mensaje);
	}
	
	public Usuario getUsuarioBD() {
		return usuarioBD;
	}
	
	public void setUsuarioBD(Usuario usuarioBD) {
		this.usuarioBD = usuarioBD;
	}
	
	
}
