package com.taller.servicio.eao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.taller.servicio.entidades.Rol;

@Stateless
@LocalBean
public class RolEAO {

	@PersistenceContext(unitName = "taller-servicio-negocio")
	private EntityManager admEntidad;
	
	public void insert(Rol rol) {
		admEntidad.persist(rol);
	}
	
	public Rol update (Rol rol) {
		return admEntidad.merge(rol);
	}
	
	public Rol bucarPorId (Long idRol) {
		return admEntidad.find(Rol.class, idRol);
	}
	
	public List<Rol> obtenerRole (){
		return 
		admEntidad.createNativeQuery
		(
		"select * from BSE_ROL", Rol.class
		).getResultList();
	}
	
}
