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
@Table(name = "BSE_USUARIO")
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idUsuario;
	private String usuario;
	private String nombres;
	private String estado;
	private String clave;
	
	@Id
	@SequenceGenerator(name = "seqUsuario", sequenceName = "BSE_SECUENCIA_USUARIO")
	@GeneratedValue(generator = "seqUsuario", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	@Column(name = "USUARIO")
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	@Column(name = "NOMBRES")
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	@Column(name = "ESTADO")
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Column(name = "CLAVE")
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
