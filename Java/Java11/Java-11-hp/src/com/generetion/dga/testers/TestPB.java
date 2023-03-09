package com.generetion.dga.testers;

import com.generetion.dga.AlumnoB;
import com.generetion.dga.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		AlumnoB a = new AlumnoB(123,8.5,"Daniel", 20);
		PersonaP b = new PersonaP("Alonso", 24);
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		System.out.println(b.toString());
		a.mostrarDatos();
		a.mostrarDatos("Guzman");
	}
}
