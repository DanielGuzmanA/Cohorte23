package com.generetion.dga;

public class Suma implements OperacionesAritmeticas, Mensajes {

	private double a;
	private double b;
	
	
	
	public Suma() {
		super();
	}

	public Suma(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double sumar() {

		return this.a+this.b;
	}

	@Override
	public double restar() {

		return 0;
	}

	@Override
	public double multiplicar() {

		return 0;
	}

	@Override
	public double dividir() {

		return 0;
	}

	@Override
	public void mensaje() {
		
		
	}


		
	
	
	

}
