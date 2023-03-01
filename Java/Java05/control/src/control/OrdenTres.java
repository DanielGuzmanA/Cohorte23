package control;

import java.util.Scanner;

public class OrdenTres {
	Scanner valor = new Scanner(System.in);

	public void valores() {

		System.out.println("Dame tres numeros");
		int v1 = valor.nextInt();
		int v2 = valor.nextInt();
		int v3 = valor.nextInt();
		String ordenString = "";
		if (v1 > v2 && v1 > v3) {
			if (v2 > v3) {
				ordenString = "" + v1 + v2 + v3;
			}
			if (v3 > v2) {
				ordenString = "" + v1 + v3 + v2;
			}
		}
		if (v2 > v3 && v2 > v1) {
			if (v1 > v3) {
				ordenString = "" + v2 + v1 + v3;
			}
			if (v3 > v1) {
				ordenString = "" + v2 + v3 + v1;
			}
		}
		if (v3 > v1 && v3 > v2) {
			if (v2 > v1) {
				ordenString = "" + v3 + v2 + v1;
			}
			if (v1 > v2) {
				ordenString = "" + v3 + v1 + v2;
			}
		}
		System.out.println(ordenString);
	}
}
