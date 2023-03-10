package hilos.dga.formathread;

public class Hilo1 extends Thread {

	public Hilo1(String name) {
		super(name);

	}

	@Override
	public void run() {
		System.out.println("Se inicia el Thread o Hilo " + this.getName());

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		System.out.println("Se elimina el Hilo o Thread " + this.getName());
	}

}
