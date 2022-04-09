package com.servicionegocio.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BSE_ROL")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idRol;
	private String rol;
	private String estado;
	
	@Id
	@SequenceGenerator(name = "seqRol", sequenceName = "BSE_SEQ_ROl")
	@GeneratedValue(generator = "seqRol", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	public Long getIdRol() {
		return idRol;
	}
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	@Column(name = "ROL")
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
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
