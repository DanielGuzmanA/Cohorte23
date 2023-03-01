package Ciclos.Control;

import java.util.Scanner;

import Ciclos.ForWhileDo.CicloDo;
import Ciclos.ForWhileDo.UsoFor;
import Ciclos.ForWhileDo.UsoWhile;

public class DoSwitch {
public void controlador() {
	Scanner s = new Scanner(System.in);
	Menus mp = new Menus();
	UsoWhile uw = new UsoWhile();
	UsoFor uf = new UsoFor();
	CicloDo cd = new CicloDo();
	int opcion = 0;
	
	do {
		mp.menuprincipal();
		System.out.print("Introduzca un op: ");
		opcion = s.nextInt();
		switch (opcion) {
		case 1:
			uw.ciclow ();
			break;
		case 2:
			uw.centinelaw ();
			break;
		case 3:
			uw.banderaW ();
			break;
		case 4:
			uf.cicloFor();
			break;
		case 5:
			uf.letrasfor ();
			break;
		case 6:
			cd.digitosDo ();
			break;
		
		default:
			break;
		}
		
	} while (opcion >0 && opcion <7);
	System.out.println("Terminamos");
}
}
