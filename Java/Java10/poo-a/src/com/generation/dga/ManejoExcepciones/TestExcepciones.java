package com.generation.dga.ManejoExcepciones;

public class TestExcepciones {

	public static void main(String[] args) {
		
try {
		Division d = new Division(4,2);
	}catch (OpExceptions e) {
	e.printStackTrace();	
	}
	}
}