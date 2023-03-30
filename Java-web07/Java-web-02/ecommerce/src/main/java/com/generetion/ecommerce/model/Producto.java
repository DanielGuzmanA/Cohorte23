package com.generetion.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Indico que mi clase producto se convierte en una entidad JPA (persistencia de datos)

@Table(name = "Producto") //Especificar de la forma correcta el nombre de la tabla

public class Producto {

	@Id//el campo id es la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el campo id sera generado automaticamente por la DB
    @Column(name="id", unique = true, nullable = false) //especifica el nombre de la columna en la DB
	
	// Atributos
	private Long id;
	private String nombre;
	private String descripccion;
	private String URL_Imagen;
	private double precio;

	// Constructor vacio para el Jackson (serealizar y desearilizar un objeto Java a Json)
	public Producto() {

	}

	// Constructor con todos los campos
	public Producto(Long id, String nombre, String descripccion, String uRL_Imagen, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripccion = descripccion;
		this.URL_Imagen = URL_Imagen;
		this.precio = precio;
	}

	// Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripccion() {
		return descripccion;
	}

	public void setDescripccion(String descripccion) {
		this.descripccion = descripccion;
	}

	public String getURL_Imagen() {
		return URL_Imagen;
	}

	public void setURL_Imagen(String uRL_Imagen) {
		URL_Imagen = uRL_Imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// toString
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripccion=" + descripccion + ",URL_Imagen"
				+ URL_Imagen + ", precio=" + precio + "j";
	}

}
