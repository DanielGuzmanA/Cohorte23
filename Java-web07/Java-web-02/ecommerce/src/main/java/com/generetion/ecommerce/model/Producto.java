package com.generetion.ecommerce.model;

public class Producto {

	//Atributos
	private Long id;
	private String nombre;
	private String descripccion;
	private String URL_Imagen;
	private double precio;

	
	//Constructor vacio para el Jackson (serealizar y desearilizar  un objeto Java a Json)
	public Producto() {
		
	}

	//Constructor con todos los campos
	public Producto(Long id, String nombre, String descripccion, String uRL_Imagen, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripccion = descripccion;
		this.URL_Imagen = URL_Imagen;
		this.precio = precio;
	}
	
	//Getters y Setters
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
	
	//toString
	@Override
	public String toString() {
		return null;
	}
	
	
	
}
