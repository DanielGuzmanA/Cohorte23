package com.generetion.dga.testers;

import com.generetion.dga.*;


public class TestFigurasGeometricas {
	
public static void main(String[] args) {
	
	FigurasGeometricas rectangulo = new Rectangulo(10,2);
	FigurasGeometricas circulo = new Circulo(2);
	FigurasGeometricas triangulo = new Triangulo(10,2);
	FigurasGeometricas cuadrado = new Cuadrado(4);
	System.out.println(rectangulo.areas());
	System.out.println(circulo.areas());
	System.out.println(triangulo.areas());
	System.out.println(cuadrado.areas());
	System.out.println(rectangulo.toString());
	System.out.println(circulo.toString());
	
	rectangulo.pedirDatos();
	System.out.println(rectangulo.toString());
	System.out.println(rectangulo.areas());
	
}
}
