package com.taller.servicio.negocio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.taller.servicio.eao.RolEAO;
import com.taller.servicio.entidades.Rol;

@Stateless
public class ServicioRol {

	@EJB
	private RolEAO rolEao;
	
	public void crearRol (String nombreRol, String estado) {
		Rol rol = new Rol();
		rol.setEstado(estado);
		rol.setRol(nombreRol);
		rolEao.insert(rol);
	}
	
	public List<Rol> obtenerRoles(){
		return rolEao.obtenerRole();
	}
	
}
