package testers;

import oop.Fecha;

public class TestFecha {
	public static void main(String[] args) {
		Fecha f = new Fecha(6,3,22);
		f.setDia(15);
		f.setMes(3);
		f.setYear(22);
		System.out.println(f.diaMesYear());
		System.out.println(f.toString());
	}
}