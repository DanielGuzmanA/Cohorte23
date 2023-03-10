package hilos.dga.pruebas;

import hilos.dga.formathread.Hilo1;

public class TestThread {

	public static void main(String[] args) {
		
		Thread h = new Hilo1("Daniel");
		h.start();
		Thread hO = new Hilo1("Guzman");
		hO.start();
		Thread h1 = new Hilo1("Alonso");
		h1.start();

		System.out.println(h.getState());

	}
}
