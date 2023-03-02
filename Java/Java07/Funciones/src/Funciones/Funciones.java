package Funciones;

public class Funciones { //Clase llamada funciones

	//Las funciones se puden declarar en cualquier lugar de la clase
    public static int sumar (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
        
    }
    
    //Funcion para imprimir asteriscos
    public static void imprimirasteriscos() {
    	System.out.println("*************");
    }
    
    //Funcion que combina distintos tipos de valores
    public static float sumaDecimal (float valor1, int valor2) {
    	float resultadoDecimal = (int) (valor1 + valor2);
    	return resultadoDecimal;
    }
    
    //Funcion que usa strings como argumentos
    public static String awitadelimon (String ingediente1, String ingrediente2, String ingrediente3) {
    	String recetacompletada = ingediente1 + ingrediente2 + ingrediente3;
    	return recetacompletada;
    }
    
    
	
    //Este metodo tiene como funcion ejecutar cosas
	public static void main(String[] args) {
		//Aqui invocamos a la funcion

		//Las invocaciones de la funcion se hacen generalmente dentro del metodo principal o main
		System.out.println("Elresultado de la suma es;"+ sumar(5,8));
		imprimirasteriscos();
		
		System.out.println("El resultado de mi suma decimal es: " + sumaDecimal(5.5f,7));
		
		System.out.println("Estos son los pasos para preparar awita de limon; " + awitadelimon ("agua ", "limon ", "azucar "));
		
		//Funciones de la biblioteca de matematicas (Math)
		
		double valorEjemplo = 7.65497834d;
		System.out.println("La raiz cuadrada de mi valor es: " + Math.sqrt(valorEjemplo));
		
		System.out.println("El seno de mi valor es: " + Math.sin(valorEjemplo));
		
		System.out.println("La potencia de mi valor es: " + Math.pow(valorEjemplo, 2));
	}

}

/*
Funciones
- No retornan valores: No devuelven nada, no se especifica nada y no usamos la palabra return
- Si retornan valores: se especifica el tipo de dato, el tipo de valor que regresa y se usa return para esto


- Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     }
     
     Cosas que debemos tomar en cuenta al momento de crear nuestras funciones:
    - Deben de llevar un nombre unico
    - Opcionalmente podran recibir argumentos y devolver el resultado
    - Se debe especificar el tipo de dato que vamos a pasar como argumnto, y el resultado final de nuestra funcion
    - Cuidar el orden en como estamos agregando nuestros parametros o argumentos.
    
    //Funciones de la biblioteca de matematicas
     
*/