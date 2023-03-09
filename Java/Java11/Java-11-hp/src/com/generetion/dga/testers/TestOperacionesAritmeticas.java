package com.generetion.dga.testers;

import com.generetion.dga.Mensajes;
import com.generetion.dga.OperacionesAritmeticas;
import com.generetion.dga.Suma;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		Suma s = new Suma(5,2);
		OperacionesAritmeticas ss = new Suma (10,3);
		Mensajes sss = new Suma();
		
		System.out.println("Suma " + s.sumar());
		System.out.println("Operaciones Aritmeticas " + ss.sumar());
		s.mensaje();
		sss.mensaje();
	}
	
}
