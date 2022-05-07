package com.taller.servicio.negocio;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.taller.servicio.eao.UsuarioEAO;
import com.taller.servicio.entidades.Usuario;

@Stateless
public class ServicioAutenticacion {

	@EJB
	private UsuarioEAO usuarioEAO;

	public Usuario autenticar(String usuario, String clave) {
		return usuarioEAO.buscarUsuarioClave(usuario, clave);
	}

}
