package com.taller.servicio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BSE_USUARIO_ROl")
public class UsuarioRol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idUsuarioRol;
	private Usuario usuario;
	private Rol rol;
	private String estado;
	
	@Id
	@SequenceGenerator(name = "seqUsuarioRol", sequenceName = "BSE_USUARIO_ROL")
	@GeneratedValue(generator = "seqUsuarioRol", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	public Long getIdUsuarioRol() {
		return idUsuarioRol;
	}
	public void setIdUsuarioRol(Long idUsuarioRol) {
		this.idUsuarioRol = idUsuarioRol;
	}
	
	@ManyToOne
	@JoinColumn(name = "FK_ID_USUARIO")
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@ManyToOne
	@JoinColumn(name = "FK_ID_ROl")
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	@Column(name = "ESTADO")
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
