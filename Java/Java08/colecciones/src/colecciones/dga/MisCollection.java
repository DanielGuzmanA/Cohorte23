package colecciones.dga;

import java.util.*;

public class MisCollection {

	public static void main(String[] args) {
		
		wrapperClass();
	}
	
	
	private void listasCollections() {
		List milista = new ArrayList ();
		milista.add(1);
		milista.add(2);
		milista.add(3);

	}
	
	private void imprimir(Collection collection) {
		
		for (Object elementos : collection) {
			System.out.println();
			
		}
		
	}
	
	static void wrapperClass() {
		//Tipos de datos primitivos byte, short, Long, float, int, double
		
		byte numeroB = -128;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor max " + Byte.MAX_VALUE);
		System.out.println("Valor min " + Byte.MIN_VALUE);
		System.out.println("=> " + numeroB);
		
		int numeroI = -2147483648;
		System.out.println("Tamaño de un entero bytes: " + Integer.BYTES);
		System.out.println("Tamaño de un entero " + Integer.SIZE);
		System.out.println("Valor max " + Integer.MAX_VALUE);
		System.out.println("Valor min " + Integer.MIN_VALUE);
		System.out.println("=> " + numeroI);

		
		short numeroA = -128;
		System.out.println("Tamaño de un byte " + Short.SIZE);
		System.out.println("Valor max " + Short.MAX_VALUE);
		System.out.println("Valor min " + Short.MIN_VALUE);
		System.out.println("=> " + numeroA);
		
		long numeroC = -128;
		System.out.println("Tamaño de un byte " + Long.SIZE);
		System.out.println("Valor max " + Long.MAX_VALUE);
		System.out.println("Valor min " + Long.MIN_VALUE);
		System.out.println("=> " + numeroC);
		
		float numeroF = -128;
		System.out.println("Tamaño de un byte " + Float.SIZE);
		System.out.println("Valor max " + Float.MAX_VALUE);
		System.out.println("Valor min " + Float.MIN_VALUE);
		System.out.println("=> " + numeroF);
		
		double numeroH = -128;
		System.out.println("Tamaño de un byte " + Double.SIZE);
		System.out.println("Valor max " + Double.MAX_VALUE);
		System.out.println("Valor min " + Double.MIN_VALUE);
		System.out.println("=> " + numeroH);
	}
	
	

}
