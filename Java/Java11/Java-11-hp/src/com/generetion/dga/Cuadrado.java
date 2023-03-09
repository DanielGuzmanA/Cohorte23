package com.generetion.dga;

public class Cuadrado extends FigurasGeometricas{
	private double lado;

	public Cuadrado(double lado) {
		super("Cuadrado");
		this.lado = lado;
	} 

	@Override
	public double areas() {
		
		return lado * 4;

	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
