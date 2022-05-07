package com.taller.primefaces.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.taller.servicio.entidades.Rol;
import com.taller.servicio.negocio.ServicioRol;

@ManagedBean(name = "beanRol")
@SessionScoped
public class BeanRol {

	
	private String nombreRol;
	private String estado;
	private List<Rol> listaRol;
	
	@EJB
	private ServicioRol servicio;
	
	@PostConstruct
	public void inicializar() {
		listaRol = servicio.obtenerRoles();
	}
	
	public String registrarRol () {
		servicio.crearRol(nombreRol, estado);
		listaRol = servicio.obtenerRoles();
		
		FacesMessage mensaje = new FacesMessage( FacesMessage.SEVERITY_INFO, 
				"Transacción Exitosa", null);
		FacesContext.getCurrentInstance().addMessage(null, mensaje);
		return "";
	}
	
	public String getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public List<Rol> getListaRol() {
		return listaRol;
	}
	public void setListaRol(List<Rol> listaRol) {
		this.listaRol = listaRol;
	}
	
	
	
	
}
