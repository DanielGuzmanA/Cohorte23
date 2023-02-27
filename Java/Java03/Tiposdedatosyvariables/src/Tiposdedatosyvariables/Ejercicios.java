package Tiposdedatosyvariables;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 1
		int var1 = 1;
		int var2 = 2;
		int var3 = 3;

		int resultado1 = var1*var2;
		int resultado2 = var3%var2;

		System.out.println("Resultado de multiplicacion: " + var1 + " " + var2 + "-" + resultado1);
		System.out.println("Resultado de modulo: " + var3 + " " + var2 + "-" + resultado2);

		//Ejercicio 2
		boolean varTrue = true;
		boolean varFalse = false;

		if(varTrue == true) {
			System.out.println("Es verdad");
		}
		else {
			System.out.println("Es mentira");
		}

		boolean trueOrFalse = varTrue == varFalse;
			System.out.println(trueOrFalse);


		//Ejercicio 3
		double varDouble1 = 3.1416;
		double varDouble2 = 9.81;
		boolean esMenor = varDouble1 < varDouble2;
		boolean esMayor = varDouble1 > varDouble2;

		System.out.println(esMenor);
		System.out.println(esMayor);
		
		
		//Ejercicio 4 
		// 1 farenheit = 255.928 kelvin
        
        int centigradoss = 2;
        double conversion = centigradoss*255.928;
        
        System.out.println("1 farenheit a kelvin es " + conversion);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
		
        //Ejercicio 5
        
        
        
	}

}



