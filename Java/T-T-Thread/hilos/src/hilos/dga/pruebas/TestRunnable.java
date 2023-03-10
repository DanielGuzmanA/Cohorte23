package hilos.dga.pruebas;

import hilos.dga.formarunnable.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		Hilo2 ht= new Hilo2("Pedro");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Canicula")).start();
		new Thread(new Hilo2("Mariano")).start();

	}

}
