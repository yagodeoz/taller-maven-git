package com.servicionegocio.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.servicionegocio.entidades.UsuarioRol;

@Stateless
@LocalBean
public class UsuarioRolEAO {

	
	@PersistenceContext(unitName = "taller-servicio-negocio")
	private EntityManager admEntidad;
	
	public void insert (UsuarioRol usuarioRol) {
		admEntidad.persist(usuarioRol);
	}
	
	public UsuarioRol update(UsuarioRol usuarioRol) {
		return admEntidad.merge(usuarioRol);
	}
	
	public UsuarioRol buscarPorId (Long idUsuarioRol) {
		return admEntidad.find(UsuarioRol.class, idUsuarioRol);
	}
}
