package com.servicionegocio.servicios;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.servicionegocio.eao.UsuarioEAO;
import com.servicionegocio.entidades.Usuario;

@Stateless
public class ServicioAutenticacion {

	@EJB
	private UsuarioEAO usuarioEAO;

	public Usuario autenticar(String usuario, String clave) {
		return usuarioEAO.buscarUsuarioClave(usuario, clave);
	}

}
