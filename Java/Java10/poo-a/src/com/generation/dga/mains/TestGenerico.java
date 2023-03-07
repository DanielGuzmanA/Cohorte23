package com.generation.dga.mains;

import com.generation.dga.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		
		ClaseGenerica <Integer> int0obj = new ClaseGenerica <Integer>(55);
		ClaseGenerica <String> caracteresobj = new ClaseGenerica <String>("Prueba");
		
		int0obj.claseTipo();
		caracteresobj.claseTipo();
		
		
	}
}
