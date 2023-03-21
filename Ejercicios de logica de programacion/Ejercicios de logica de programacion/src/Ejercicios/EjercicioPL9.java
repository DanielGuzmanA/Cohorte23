package Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioPL9 {

	public static void main(String[] args) {
 
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("computadora", "computer");
        diccionario.put("libro", "book");
        diccionario.put("juego", "game");
        diccionario.put("arbol", "tree");
        diccionario.put("ciudad", "city");
        diccionario.put("mañana", "morning");
        diccionario.put("noche", "night");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("banana", "banana");
        diccionario.put("zapato", "shoe");
        diccionario.put("flor", "flower");
        diccionario.put("nube", "cloud");
        diccionario.put("mar", "sea");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra en español:");
        String palabra = scanner.nextLine().toLowerCase();

        scanner.close();

        if (diccionario.containsKey(palabra)) {
            String traduccion = diccionario.get(palabra);
            System.out.printf("La traducción de \"%s\" es \"%s\".%n", palabra, traduccion);
        } else {
            System.out.printf("La palabra \"%s\" no se encuentra en el diccionario.%n", palabra);
        }
    }

};
