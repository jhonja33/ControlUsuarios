package com.jjbg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Usuario;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "id_Rol")
	private int id_Rol;

	@Column(name = "activo")
	private String activo;

	public Usuario() {

	}

	public Usuario(int id_Usuario, String nombre, int id_Rol, String activo) {
		super();
		this.id_Usuario = id_Usuario;
		this.nombre = nombre;
		this.id_Rol = id_Rol;
		this.activo = activo;
	}

	public int getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_Rol() {
		return id_Rol;
	}

	public void setId_Rol(int id_Rol) {
		this.id_Rol = id_Rol;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

}
