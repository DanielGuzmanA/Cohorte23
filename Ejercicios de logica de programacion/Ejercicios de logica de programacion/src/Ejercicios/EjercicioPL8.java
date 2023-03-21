package Ejercicios;

import java.util.Scanner;

public class EjercicioPL8 {

	public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] primos = new int[10];

        int numPrimos = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                primos[numPrimos] = numeros[i];
                numPrimos++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (!esPrimo(numeros[i])) {
                primos[numPrimos] = numeros[i];
                numPrimos++;
            }
        }

        System.out.println("\nArray original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " - " + numeros[i]);
        }

        System.out.println("\nArray con los números primos en las primeras posiciones:");
        for (int i = 0; i < primos.length; i++) {
            System.out.println(i + " - " + primos[i]);
        }
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
};
