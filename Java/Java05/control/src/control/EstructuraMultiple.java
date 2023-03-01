package control;

import java.util.Scanner;

public class EstructuraMultiple {
	Scanner dato = new Scanner(System.in);

	public void vocal() {
		System.out.println("Introduzca una letra: ");
		char letra = dato.next().charAt(0);

		switch (letra) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(" es vocal ");
			break;

		default:
			System.out.println(" el caracter no es vocal " + letra);
			break;
		}
	}

	public void notas() {
		System.out.println("Introduce tu calificacion: ");
		int nota = dato.nextInt();

		switch (nota) {
		case 10:
		case 9:
			System.out.println(" Exelente compa ");
			break;
		case 8:
		case 7:
			System.out.println(" Ahi la llevas ");
			break;
		case 6:
			System.out.println(" Deficiente compa ");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println(" Muy mal compita ");

			break;

		default:
			System.out.println(" No esta en el rango .-. ");
			break;
		}
	}

	/*
	 * ?: operador Elvis Variable = (PL) ? entrada verdad : entrada falso
	 */

	public void ternario() {
		System.out.println("Introduzca un valor numerico :");
		int entradaV = dato.nextInt();
		System.out.println("Introduzca un 2do valor numerico :");
		int entradaF = dato.nextInt();
		int menor = (entradaV <= entradaF) ? entradaV : entradaF;
		System.out.println("----->" + menor);
	}
}
