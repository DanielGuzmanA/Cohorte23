package com.generation.dga.clases;

public class AreaPerimetro {

	//Cuadrado
	
	public double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;
				
	}
	
	public double perimetroCuadrado(double lado) {
		double perimetro = lado * 4;
		return perimetro;

	}
	
	//Triangulo
	public double areaTriangulo(int base, int altura) {
		return(base * altura)/2;

	}
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
		return(ladoA+ladoB+ladoC);

	}
	
	//Circulo
	
	public double areaCirculo(double pi, double radio2) {
		return(pi*(radio2 * radio2));
	}
	
	public double perimetroCirculo(double pi, double diametro) {
		return(pi * diametro);
	
}
	
	//Tacos
	public String tipoDeTortilla(String tipoDeTortilla) {
		return(tipoDeTortilla);
	}
	public String guisado(String guisado) {
		return(guisado);
	}
	
	public int numeroDeTortillas(int numeroDeTortillas) {
		return(numeroDeTortillas);
	}
	
	public String tamañoDeTortilla(String tamañoDeTortilla) {
		return(tamañoDeTortilla);
	}
	
	public float precio(float precio) {
		return(precio);
	}
	
	public float vender(int numeroDeTortillas, float precio) {
		return(numeroDeTortillas * precio);
	}
}
