package oop;

public class Persona {
	private String nombre = "Juan";
	private int edad;
	private double altura;
	private double peso;
	private String sodiacal;
	/*
	public Persona(int edad,String sodiacal) {
		super();
		this.edad = edad;
		this.sodiacal = sodiacal;
	}
	*/
	public Persona(String nombre, int edad, double altura,
			double peso, String sodiacal) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.altura = altura;
			this.peso = peso;
			this.sodiacal = sodiacal;
	}
	
	public String datosPersona() {
		return this.nombre+""+this.edad+""+this.altura+""+this.sodiacal;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getSodiacal() {
		return sodiacal;
	}
	public void setSodiacal(String sodiacal) {
		this.sodiacal = sodiacal;
	}
	
	
}
