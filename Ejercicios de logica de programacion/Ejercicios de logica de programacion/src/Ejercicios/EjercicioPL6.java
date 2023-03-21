package Ejercicios;

import java.util.Scanner;

public class EjercicioPL6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String input = sc.nextLine();

        sc.close();

        String reversed = reverseString(input);

        System.out.println("Texto al revés: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
};
