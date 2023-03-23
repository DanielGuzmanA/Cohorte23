package com.generetion.cohorte23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")

public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private String Nombre;
	private String Email;
	private long Id;
	private Integer Prioridad;

	public UsuarioModel(String nombre, String email, long id, Integer prioridad) {
		super();
		Nombre = nombre;
		Email = email;
		Id = id;
		Prioridad = prioridad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Integer getPrioridad() {
		return Prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		Prioridad = prioridad;
	}

}
