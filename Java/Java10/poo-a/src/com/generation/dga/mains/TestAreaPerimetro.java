package com.generation.dga.mains;

import com.generation.dga.clases.AreaPerimetro;
import com.generation.dga.clases.FigurasGeometricas;

public class TestAreaPerimetro {
public static void main(String[] args) {
	AreaPerimetro ap = new AreaPerimetro();
	FigurasGeometricas fg = new FigurasGeometricas();
	
	
	fg.setArea(ap.areaCuadrado(5));
	System.out.println("Area del cuadrado "+ fg.getArea());
	
	fg.setPerimetro(ap.perimetroCuadrado(5));
	System.out.println("Perimetro del cuadrado " + fg.getPerimetro());
	
	fg.setArea(ap.areaTriangulo(4, 5));
	System.out.println("Area del triangulo " + fg.getArea());
	
	fg.setPerimetro(ap.perimetroTriangulo(3, 4, 5));
	System.out.println("Perimetro del triangulo " + fg.getPerimetro());
	
	fg.setArea(ap.areaCirculo(3.14, 5));
	System.out.println("Area del circulo " + fg.getArea());
	
	fg.setPerimetro(ap.perimetroCirculo(3.14, 2));
	System.out.println("Perimetro del circulo " + fg.getPerimetro());
	
	//Tacos
	fg.setTipoDeTortilla(ap.tipoDeTortilla("De maiz"));
	System.out.println("Tipo de la tortilla " + fg.getTipoDeTortilla());
	
	fg.setGuisado(ap.guisado("Al pastor"));
	System.out.println("guisado de " + fg.getGuisado());
	
	fg.setNumeroDeTortillas(ap.numeroDeTortillas(2));
	System.out.println("Numero de tortillas " + fg.getNumeroDeTortillas());
	
	fg.setTamañoDeTortilla(ap.tamañoDeTortilla("Grande"));
	System.out.println("Tamaño de la tortilla " + fg.getTamañoDeTortilla());
	
	fg.setPrecio(ap.precio(12));
	System.out.println("Precio del taco $" + fg.getPrecio());
	
	fg.setVender(ap.vender(6/2, 12));
	System.out.println("Monto ganado " + fg.getVender());
}
}
