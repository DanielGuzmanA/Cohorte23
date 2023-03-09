package com.generation.dga.ManejoExcepciones;

public class Division {
	private int numerador; 
	private int denominador;

	public Division(int numerador, int denominador)throws OpExceptions {
		
		if(denominador == 0) {
			throw new OpExceptions("el denominador es un 0");
		}
		
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizarD() {
		
		System.out.println("El resultado de la division es: "+(this.numerador/this.denominador));
		

	}

}
