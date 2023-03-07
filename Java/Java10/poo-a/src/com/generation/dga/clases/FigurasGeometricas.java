package com.generation.dga.clases;

public class FigurasGeometricas {
	
	//tacos
	private String tipoDeTortilla;
	private String guisado;
	private int numeroDeTortillas;
	private String tamañoDeTortilla;
	private float precio;
	private int vender;
	
	//Figuras
	private double perimetro;
	private double area;
	
	public FigurasGeometricas() {
		
	}
public FigurasGeometricas(double perimetro, double area) {
		
		this.perimetro = perimetro;
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	//Tacos
	public FigurasGeometricas(String tipoDeTortilla, String guisado, int numeroDeTortillas, String tamañoDeTortilla,
			float precio) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numeroDeTortillas = numeroDeTortillas;
		this.tamañoDeTortilla = tamañoDeTortilla;
		this.precio = precio;
	}
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public String getGuisado() {
		return guisado;
	}
	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}
	public int getNumeroDeTortillas() {
		return numeroDeTortillas;
	}
	public void setNumeroDeTortillas(int numeroDeTortillas) {
		this.numeroDeTortillas = numeroDeTortillas;
	}
	public String getTamañoDeTortilla() {
		return tamañoDeTortilla;
	}
	public void setTamañoDeTortilla(String tamañoDeTortilla) {
		this.tamañoDeTortilla = tamañoDeTortilla;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getVender() {
		return vender;
	}
	public void setVender(float vender) {
		this.vender = (int) vender;
	}
	
	
}
