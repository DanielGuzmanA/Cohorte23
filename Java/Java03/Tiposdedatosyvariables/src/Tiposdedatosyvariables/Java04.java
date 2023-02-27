package Tiposdedatosyvariables;

public class Java04 {
	
	int edad = 18;
	boolean tieneLicencia = true;
		
	if (edad >= 18 && tieneLicencia) {
	    System.out.println("Puede conducir un coche");
	} 
	else {
	    System.out.println("No puede conducir un coche");  
	}
	
	String nombre = "Juan";
	String apellido = "Pérez";
	if (nombre.equals("Juan") || apellido.equals("Pérez")) {
	    System.out.println("El usuario es Juan Pérez");
	} else {
	    System.out.println("El usuario no es Juan Pérez");
	}
	
	boolean esVerdadero = true;
	if (!esVerdadero) {
	    System.out.println("La condición es falsa");
	} else {
	    System.out.println("La condición es verdadera");
	}
	


/*    Verificar si un número es par y positivo:
int num = 6;*/

int num = 6;
if (num % 2 == 0 && num > 0) {
System.out.println("si es par y es positivo");
}else {
System.out.println("no se cumple la condicion");
}




/*Verificar si un número está dentro de un rango específico
int num = 10;*/

int num2 = 10;
if (num2 >= 10 && num2 < 20) {
System.out.println("esta dentro del rango");
}
else {
System.out.println("no esta dentro del rango");
}


/*
Verificar si una cadena es igual a otra o no
String cadena1 = "Hola";
String cadena2 = "hola";
*/
String cadena1 = "Hola";
String cadena2 = "hola";

if (cadena1 == cadena2) {
System.out.println("son iguales");
}
else {
System.out.println("no son iguales");
}
}
}













