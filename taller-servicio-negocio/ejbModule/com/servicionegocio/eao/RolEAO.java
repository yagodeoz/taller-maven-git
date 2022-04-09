package com.servicionegocio.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.servicionegocio.entidades.Rol;

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
}
