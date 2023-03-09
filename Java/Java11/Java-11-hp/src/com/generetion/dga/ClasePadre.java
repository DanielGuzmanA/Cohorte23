package com.generetion.dga;

import java.util.Scanner;

public class ClasePadre {
	
	private boolean activainactiva;
	private float saldo;
	private int numeroconsignaciones =0;
	private int numeroretiros = 0;
	private float tasaanual;
	private float comisionmensualextractos;
	
	public ClasePadre(float saldo, int numeroconsignaciones, int numeroretiros, float tasaanual,
			float comisionmensualextractos) {
		super();
		
		
		this.saldo = saldo;
		this.numeroconsignaciones = numeroconsignaciones;
		this.numeroretiros = numeroretiros;
		this.tasaanual = tasaanual;
		this.comisionmensualextractos = comisionmensualextractos;
	}
	
	public ClasePadre(boolean activainactiva) {
		super();
		this.activainactiva = activainactiva;
	}

	public void consignar() {
		
		if (saldo >= 10000) {
		Scanner datoScanner = new Scanner (System.in);
		System.out.println("El saldo es: ");
		saldo += datoScanner.nextFloat();
		
		this.numeroconsignaciones +=1;
			
		}
		
	}
	
	public void retirar() {
		
		if (saldo >= 10000) {
			
		Scanner datoScanner = new Scanner (System.in);
		System.out.println("El saldo es: ");
		saldo -= datoScanner.nextFloat();
		}
	}
	
	
	public void extractomensual() {
		
	}
	
	public void calcularinteres() {
		
	}
	
	private void imprimir() {

	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroconsignaciones() {
		return numeroconsignaciones;
	}

	public void setNumeroconsignaciones(int numeroconsignaciones) {
		this.numeroconsignaciones = numeroconsignaciones;
	}

	public int getNumeroretiros() {
		return numeroretiros;
	}

	public void setNumeroretiros(int numeroretiros) {
		this.numeroretiros = numeroretiros;
	}

	public float getTasaanual() {
		return tasaanual;
	}

	public void setTasaanual(float tasaanual) {
		this.tasaanual = tasaanual;
	}

	public float getComisionmensualextractos() {
		return comisionmensualextractos;
	}

	public void setComisionmensualextractos(float comisionmensualextractos) {
		this.comisionmensualextractos = comisionmensualextractos;
	}
	
	
	
	
}
