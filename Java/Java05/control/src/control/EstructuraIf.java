package control;

import java.util.Scanner;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
    public void controlIf() {
        /*
        if (condition) {
            
        }
        */
        long nota = 4;
        if (nota > 5) {
            System.out.println("Nota aprobada " + nota);
        }
        System.out.println("continua el control de flujo...");
        

        /*
        if (condition) {
            
        } else {

        }*/
        
        if (nota >= 5) {
            System.out.println("Nota aprobada " + nota);
        } else {
            System.out.println("Nota no aprobada " + nota);
        }
            }
    
    public void divisible() {
    	System.out.println("Introduzca un numero :");
		int dato1 = entrada.nextInt();
		System.out.println("Introduzca un segundo numero");
		int dato2 = entrada.nextInt();
		if (dato1 % dato2 == 0) {
			System.out.println(dato1 + "es divisible entre " + dato2);
			
		}else {
			System.out.println(dato1 + " no es divisible entre " + dato2);
		}
	}
    
    public void compara () {
    	System.out.println("Introduzca un numero :");
		int dato4 = entrada.nextInt();
		System.out.println("Introduzca un segundo numero");
		int dato5 = entrada.nextInt();
		if (dato4 > dato5) {
			System.out.println(dato4 + " es mayor a "+ dato5);
		}else {
			System.out.println(dato4 + " es menor a "+ dato5);
		}
    }
    
   /*public void anidado () {
	  
	   if (condition) {
		
	} else if (condition) {
		
	}else {
		
	}
   }*/
    public void anidado() {
    	System.out.print("Introduzca un primer numero: ");
        int mayor1 = entrada.nextInt();
        if (mayor1 > 0) {
			System.out.println("numero positivo " + mayor1);
		}else if (mayor1 < 0) {
			System.out.println("numero negativo " + mayor1);
		}
        else {
			System.out.println("** numero igual a cero **");
		}
			
		}
	}
    