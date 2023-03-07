package com.generation.dga.mains;

import com.generation.dga.clases.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona = new Persona ();
		persona.setNombre("Melina");
		System.out.println("----" + persona.getNombre());
	}

}
