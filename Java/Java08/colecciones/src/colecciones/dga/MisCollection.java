package colecciones.dga;

import java.util.*;

public class MisCollection {

	public static void main(String[] args) {
		MisCollection c = new MisCollection();
		//c.listasCollections();
		//imprimir(c.setCollections());
		//wrapperClass();
		mapCollections();
	}
	
	private static void mapCollections() {
		Map miMap = new HashMap();
		
		miMap.put(" valor1", " Juan");
		miMap.put(" valor2", " Maria");
		miMap.put(" valor3", " Arturo");
		miMap.put(" valor4", " Karla");
		miMap.remove("valor 3");
		imprimir(miMap.keySet());
		imprimir(miMap.values());
		
		
	}
	
	Set setCollections () {
		Set miSet = new HashSet();
		miSet.add(" uno");
		miSet.add(" dos ");
		miSet.add(" tres");
		miSet.add(" cuatro");
		miSet.add(" cuatro");
		miSet.add(" cinco");
		//miSet.iterator();
		//miSet.clear();
		return miSet;
	}
	
	
	private List listasCollections() {
		List milista = new ArrayList ();
		System.out.println(milista + "Tamaño de la lista antes " + milista.size());
		System.out.println("Esta vasia " + milista.isEmpty());
		
		milista.add("1");
		milista.add(0,2);
		milista.add(3);
		milista.add(0, "pato");
		
		milista.set(0, milista);
		milista.remove(2);
		
		System.out.println(milista + "Tamaño de la lista despues " + milista.size());
		System.out.println("Esta vasia " + milista.isEmpty());
		boolean e = milista.contains("pato");
		System.out.println("=>" + e);
		return milista;

	}
	
	private static void imprimir(Collection collection) {
		
		for (Object elementos : collection) {
			System.out.println("Elementos" + elementos);
			
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
