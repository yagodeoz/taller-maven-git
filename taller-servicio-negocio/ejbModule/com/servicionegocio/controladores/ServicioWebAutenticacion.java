package com.servicionegocio.controladores;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.servicionegocio.entidades.Usuario;
import com.servicionegocio.servicios.ServicioAutenticacion;

@Stateless
@WebService
public class ServicioWebAutenticacion {

	@EJB
	private ServicioAutenticacion autenticador;
	
	public String autenticar (String usuario, String clave) {
		
		Usuario usuarioBD = autenticador.autenticar(usuario, clave);
		if (usuarioBD == null)
			return "El usuario no existe";
		if (usuarioBD.getEstado().equals("I"))
			return "El usuario está inactivo";
		
		return "El usuario está autenticado";
	}
	
}
