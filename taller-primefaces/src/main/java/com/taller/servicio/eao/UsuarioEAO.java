package com.taller.servicio.eao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.taller.servicio.entidades.Usuario;

@Stateless
@LocalBean
public class UsuarioEAO {

	@PersistenceContext(unitName = "taller-servicio-negocio")
	private EntityManager admEntidad;

	public void insert(Usuario usuario) {

		admEntidad.persist(usuario);
	}

	public Usuario update(Usuario usuario) {
		return admEntidad.merge(usuario);
	}

	public Usuario buscarPorId(Long idUsuario) {
		return admEntidad.find(Usuario.class, idUsuario);
	}
	
	public Usuario buscarUsuarioClave (String usuario, String clave) {
		Query query = admEntidad.createNativeQuery(
				"SELECT * FROM BSE_USUARIO where USUARIO = ? and CLAVE = ?", 
				Usuario.class);
		query.setParameter(1, usuario);
		query.setParameter(2, clave);
		List<Usuario> resultado = query.getResultList();
		
		return resultado.isEmpty()?null:resultado.get(0);
	}

}
