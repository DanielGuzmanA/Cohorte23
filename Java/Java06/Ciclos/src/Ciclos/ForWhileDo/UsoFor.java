package Ciclos.ForWhileDo;

public class UsoFor {

	public void cicloFor () {
		System.out.println("Uso de ciclo for");
		for (int i = 0; i <= 10; i++) {
			System.out.println("El iterador: "+ i);
		}

	}
	
	public void letrasfor() {
		System.out.println("For con letras");
		for (int i = 'A'; i <= 'Z'; i++) {
			//System.out.println("Soy => "+ i+ ", ");
			char letra = (char) i;
			System.out.println();
			System.out.print("Soy => " + letra + ", ");
		}
	}

}
