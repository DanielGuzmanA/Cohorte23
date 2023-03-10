package hilos.dga.formarunnable;

public class Hilo2 implements Runnable {
	private String nombre;

	public Hilo2(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void run() {
		System.out.println("Inicio de Thread " + this.getNombre());

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + nombre);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}
